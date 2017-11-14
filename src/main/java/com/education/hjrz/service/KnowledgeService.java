package com.education.hjrz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.education.hjrz.dao.KnowledgeMapper;
import com.education.hjrz.entity.Knowledge;

@Service
public class KnowledgeService {
	
		@Autowired
		private KnowledgeMapper knowledgeMapper;
		
		/**
		 * @author RodulphLiu
		 * @description findKnowledge
		 * @date 2017年11月7日
		 * @version 1.0
		 */
		public List<Knowledge> findKnowledge(Knowledge knowledge)
		{
			return knowledgeMapper.selectKnowledge(knowledge);
		}
}
