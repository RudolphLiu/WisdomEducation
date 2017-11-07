package com.education.hjrz.dao;

import com.education.hjrz.entity.Questiontype;

public interface QuestiontypeMapper {
    int insert(Questiontype record);

    int insertSelective(Questiontype record);
}