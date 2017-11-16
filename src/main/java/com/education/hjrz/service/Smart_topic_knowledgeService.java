package com.education.hjrz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.education.hjrz.dao.Smart_topic_knowledgeMapper;
import com.education.hjrz.entity.Smart_topic_knowledge;

@Service
public class Smart_topic_knowledgeService {

	@Autowired
    private Smart_topic_knowledgeMapper smart_topic_knowledgeMapper;
	
	
	public void addSmart_topic_knowledge(Smart_topic_knowledge record)throws Exception
	{
		smart_topic_knowledgeMapper.insertSelective(record);
	}
}
