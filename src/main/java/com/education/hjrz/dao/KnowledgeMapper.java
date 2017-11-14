package com.education.hjrz.dao;

import java.util.List;

import com.education.hjrz.entity.Knowledge;

public interface KnowledgeMapper {
    int insert(Knowledge record);

    int insertSelective(Knowledge record);
    
    List<Knowledge> selectKnowledge(Knowledge knowledge);
    
}