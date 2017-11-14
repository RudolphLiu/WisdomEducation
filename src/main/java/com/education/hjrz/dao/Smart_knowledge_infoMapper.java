package com.education.hjrz.dao;

import java.util.List;

import com.education.hjrz.converter.KnowledgePknowConverter;
import com.education.hjrz.entity.Smart_knowledge_info;

public interface Smart_knowledge_infoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Smart_knowledge_info record);

    int insertSelective(Smart_knowledge_info record);

    Smart_knowledge_info selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Smart_knowledge_info record);

    int updateByPrimaryKey(Smart_knowledge_info record);
    
    List<Smart_knowledge_info> selectSmart_knowledge_infos(Smart_knowledge_info smart_knowledge_info);
    
    int updatePKnowByMapsId(KnowledgePknowConverter knowledgePknowConverter);
    
    //查找是否存在根节点
    Smart_knowledge_info selectRootNodeAlive();
}