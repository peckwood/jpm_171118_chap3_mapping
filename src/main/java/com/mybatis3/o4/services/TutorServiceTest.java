package com.mybatis3.o4.services;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.mybatis3.o4.domain.Tutor;

public class TutorServiceTest {
	private static TutorService tutorService;
	
	@BeforeClass
	public static void setup(){
		tutorService = new TutorService();
	}
	
	@AfterClass
	public static void teardown(){
		tutorService = null;
	}

	@Test
	public void testFindAllTutors(){
		List<Tutor> tutors = tutorService.findAllTutors();
		Assert.assertNotNull(tutors);
		for(Tutor tutor:tutors){
			System.out.println(tutor);
		}
	}
}
