package com.education.hjrz.dao;

import com.education.hjrz.entity.Smart_knowledge_info;

public interface Smart_knowledge_infoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Smart_knowledge_info record);

    int insertSelective(Smart_knowledge_info record);

    Smart_knowledge_info selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Smart_knowledge_info record);

    int updateByPrimaryKey(Smart_knowledge_info record);
}