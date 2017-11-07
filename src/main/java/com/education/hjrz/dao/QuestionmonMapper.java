package com.education.hjrz.dao;

import com.education.hjrz.entity.QuestionmonWithBLOBs;

public interface QuestionmonMapper {
    int insert(QuestionmonWithBLOBs record);

    int insertSelective(QuestionmonWithBLOBs record);
}