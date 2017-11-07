package com.education.hjrz.dao;

import com.education.hjrz.entity.Course;

public interface CourseMapper {
    int insert(Course record);

    int insertSelective(Course record);
}