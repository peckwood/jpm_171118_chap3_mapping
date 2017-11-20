package com.mybatis3.o3.mappers;

import java.util.List;

import com.mybatis3.o3.domain.Tutor;

public interface TutorMapper {
	List<Tutor> selectAllTutors();
}
