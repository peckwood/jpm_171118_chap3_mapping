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



