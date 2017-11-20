package com.mybatis3.o4.mappers;

import java.util.List;

import com.mybatis3.o4.domain.Tutor;

public interface TutorMapper {
	List<Tutor> selectAllTutors();
}
