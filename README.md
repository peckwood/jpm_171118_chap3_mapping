Notable files:

- The @Test class are usually in `/src/main/java/com/mybatis3/o?/services/StudentServiceTest.java`
- mapper file: `/src/main/java/com/mybatis3/o2/mappers/StudentMapper.xml`

### o1: One-to-one mapping using nested ResultMap

### o2: One-to-one mapping using nested Select

2 queries will execute against the same student, one for student's infomation, another looks up the associated address in the addresses table

```xml
<association property="address" column="addr_id" select="selectAddressByStudentId"></association>
```

```xml
<select id="selectAddressByStudentId" parameterType="int" resultMap="addressResultMap">
		select * from addresses where addr_id = #{id}
</select>
```

### o3: One-to-many mapping using nested ResultMap

this is also an example of `columnPrefix`

### o4: One-to-many mapping with nested select 



A nested select approach may result in N+1 select problems. First, the
main query will be executed (1), and for every row returned by the frst
query, another select query will be executed (N queries for N rows). For
large datasets, this could result in poor performance. 



> book: Java Persistence with Mybatis 3
>
> my github project: jpm_171118_chap3_mapping