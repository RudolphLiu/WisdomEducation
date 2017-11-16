package com.education.hjrz.dao;

import java.util.List;

import com.education.hjrz.entity.QuestionmonWithBLOBs;

public interface QuestionmonMapper {
    int insert(QuestionmonWithBLOBs record);

    int insertSelective(QuestionmonWithBLOBs record);
    
    List<QuestionmonWithBLOBs> SelectquestionmonWithBLOBs(QuestionmonWithBLOBs record);
}