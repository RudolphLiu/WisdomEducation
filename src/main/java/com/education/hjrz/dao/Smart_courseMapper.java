package com.education.hjrz.dao;

import java.util.List;

import com.education.hjrz.entity.Smart_course;

public interface Smart_courseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Smart_course record);

    int insertSelective(Smart_course record);

    Smart_course selectByPrimaryKey(Integer id);

    Smart_course selectByCourseId(Integer CourseID);
    
    int updateByPrimaryKeySelective(Smart_course record);

    int updateByPrimaryKey(Smart_course record);
    
    List<Smart_course> selectSmart_course(Smart_course record);
}