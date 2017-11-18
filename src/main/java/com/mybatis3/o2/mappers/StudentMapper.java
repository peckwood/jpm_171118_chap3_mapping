package com.mybatis3.o2.mappers;

import java.util.List;

import com.mybatis3.o2.domain.Student;


public interface StudentMapper {
	List<Student> findAllStudents();
}
