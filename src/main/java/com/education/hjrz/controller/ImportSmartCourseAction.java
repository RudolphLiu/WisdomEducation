package com.education.hjrz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.education.hjrz.service.CourseService;
import com.education.hjrz.service.Smart_courseService;

@Controller
public class ImportSmartCourseAction {
	
		@Autowired
		private CourseService courseService;
	
		@Autowired
		private Smart_courseService smart_courseService;
		
		
}
