package com.springtest.springtest.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springtest.springtest.Dao.CourseDao;
import com.springtest.springtest.entity.Course;

@Service
public class CourseServiceimpl  implements CourseService{
  @Autowired
	private CourseDao courseDao;
	//List<Course>list;

	
	
	public CourseServiceimpl() {
	//list=new ArrayList<>();
	//list.add(new Course(1,"Java Core Course" ,"this course contains basics of java"));
	//list.add(new Course(2,"Spring boot course","creating rest api using spring boot"));
	
	}
	
	
	@Override
	public List<Course> getCourses() {
		
	
		
	 return courseDao.findAll();
 }


	@Override
	public Course getCourse(long courseId) {
		
	//	Course c=null;
		//for(Course course:list)
	//	{
		//	if(course.getId()==courseId)
	//		{
		////	c=course;
			//	break;
	//		}
	//	}
		return courseDao.getOne(courseId);
	}


	@Override
	public Course addCourse(Course course) {
	//	list.add(course);
	courseDao.save(course);
	return course;
	}

	@Override
	public Course updateCourse(Course course) {
		
//	 list.forEach(e ->{
	//		if(e.getId() == course.getId()) {
//			e.setTitle(course.getTitle());
		//		e.setDescription(course.getDescription());
	//		
		//	}
	//	});
		
	courseDao.save(course);
		return course;
		
	}
	
	@Override
	public void deleteCourse(long parseLong) {
	//	list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		Course entity =courseDao.getOne(parseLong);
 courseDao.delete(entity);
	}
}
 
