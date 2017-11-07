package com.education.hjrz.dao;

import com.education.hjrz.entity.Smart_course;

public interface Smart_courseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Smart_course record);

    int insertSelective(Smart_course record);

    Smart_course selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Smart_course record);

    int updateByPrimaryKey(Smart_course record);
}