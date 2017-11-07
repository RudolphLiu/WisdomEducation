package com.education.hjrz.dao;

import com.education.hjrz.entity.Knowledge;

public interface KnowledgeMapper {
    int insert(Knowledge record);

    int insertSelective(Knowledge record);
}