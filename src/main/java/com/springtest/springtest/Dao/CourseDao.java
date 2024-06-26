package com.springtest.springtest.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springtest.springtest.entity.Course;

public interface CourseDao extends JpaRepository<Course,Long> {

	
	
}


