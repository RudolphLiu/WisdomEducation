package com.education.hjrz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.education.hjrz.dao.Smart_courseMapper;
import com.education.hjrz.entity.Smart_course;

@Service
public class Smart_courseService {
	
	@Autowired
	private Smart_courseMapper smart_courseMapper;

	/**
	 * @author RodulphLiu
	 * @description add
	 * @date 2017年11月10日
	 * @version 1.0
	 */
	public void addsmart_course(Smart_course smart_course)throws Exception
	{
		smart_courseMapper.insert(smart_course);
	}
	
	/**
	 * @author RodulphLiu
	 * @description findSmart_course
	 * @date 2017年11月13日
	 * @version 1.0
	 */
	public List<Smart_course> findSmart_course(Smart_course smart_course)throws Exception
	{
		List<Smart_course> smart_courses =  smart_courseMapper.selectSmart_course(smart_course);
		return smart_courses;
	}
	
	/**
	 * @author RodulphLiu
	 * @description findidByCourseID
	 * @date 2017年11月13日
	 * @version 1.0
	 */
	public int findidByCourseID(Integer CourseID)throws Exception
	{
		Smart_course smCourse = smart_courseMapper.selectByCourseId(CourseID);
		Integer id = smCourse.getId();
		return id;
	}
}
