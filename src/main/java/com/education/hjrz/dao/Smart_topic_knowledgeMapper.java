package com.education.hjrz.dao;

import com.education.hjrz.entity.Smart_topic_knowledge;

public interface Smart_topic_knowledgeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Smart_topic_knowledge record);

    int insertSelective(Smart_topic_knowledge record);

    Smart_topic_knowledge selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Smart_topic_knowledge record);

    int updateByPrimaryKey(Smart_topic_knowledge record);
}