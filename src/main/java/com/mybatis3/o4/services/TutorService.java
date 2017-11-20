package com.mybatis3.o4.services;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mybatis3.o4.domain.Tutor;
import com.mybatis3.o4.mappers.TutorMapper;
import com.mybatis3.o4.util.MyBatisSqlSessionFactory;



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
