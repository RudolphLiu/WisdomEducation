package com.education.hjrz.dao;

import java.util.List;

import com.education.hjrz.entity.Course;

public interface CourseMapper {
    int insert(Course record);

    int insertSelective(Course record);
    
    List<Course> selectCourses(Course course);
}