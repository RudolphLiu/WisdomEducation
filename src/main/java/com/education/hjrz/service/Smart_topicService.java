package com.education.hjrz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.education.hjrz.dao.Smart_topicMapper;
import com.education.hjrz.entity.Smart_topic;
import com.education.hjrz.entity.Smart_topicWithBLOBs;

@Service
public class Smart_topicService {

	@Autowired
	private Smart_topicMapper smart_topicMapper;
	
	/**
	 * @author RodulphLiu
	 * @description addsmart_topitc 添加试题
	 * @date 2017年11月16日
	 * @version 1.0
	 */
	public void addsmart_topic(Smart_topicWithBLOBs smart_topicWithBLOBs)throws Exception
	{
		smart_topicMapper.insert(smart_topicWithBLOBs);
	}
}
