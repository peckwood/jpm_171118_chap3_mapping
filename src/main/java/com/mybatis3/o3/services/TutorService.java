package com.mybatis3.o3.services;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mybatis3.o3.util.MyBatisSqlSessionFactory;
import com.mybatis3.o3.domain.Tutor;
import com.mybatis3.o3.mappers.TutorMapper;


public class TutorService {
	private Logger logger = LoggerFactory.getLogger(getClass());

	public List<Tutor> findAllTutors() {
		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		try {
			TutorMapper tutorMapper = sqlSession.getMapper(TutorMapper.class);
			return tutorMapper.selectAllTutors();
		} finally {
			sqlSession.close();
		}
	}
}
