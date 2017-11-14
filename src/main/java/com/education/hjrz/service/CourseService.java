package com.education.hjrz.service;

import com.education.hjrz.dao.CourseMapper;
import com.education.hjrz.entity.Course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseMapper courseMapper;
	
	/**
	 * @author RodulphLiu
	 * @description findCourse查询所有科目
	 * @date 2017年11月7日
	 * @version 1.0
	 */
	public List<Course> findCourse(Course course)
	{
		return courseMapper.selectCourses(course);
	}
}
