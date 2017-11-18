package com.mybatis3.o1.mappers;

import java.util.List;

import com.mybatis3.o1.domain.Student;

public interface StudentMapper {
	List<Student> findAllStudents();
}
