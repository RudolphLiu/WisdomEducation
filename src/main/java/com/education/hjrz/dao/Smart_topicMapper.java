package com.education.hjrz.dao;

import com.education.hjrz.entity.Smart_topic;
import com.education.hjrz.entity.Smart_topicWithBLOBs;

public interface Smart_topicMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Smart_topicWithBLOBs record);

    int insertSelective(Smart_topicWithBLOBs record);

    Smart_topicWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Smart_topicWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(Smart_topicWithBLOBs record);

    int updateByPrimaryKey(Smart_topic record);
}