package com.mybatis3.o4.mappers;

import java.util.List;

import com.mybatis3.o3.domain.Student;

public interface StudentMapper {
	List<Student> findAllStudents();
}
