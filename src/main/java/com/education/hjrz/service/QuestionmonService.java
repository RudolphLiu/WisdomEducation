package com.education.hjrz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.education.hjrz.dao.QuestionmonMapper;import com.education.hjrz.entity.Questionmon;
import com.education.hjrz.entity.QuestionmonWithBLOBs;

@Service
public class QuestionmonService {
		
	@Autowired
	private QuestionmonMapper questionmonMapper;
	
	public List<QuestionmonWithBLOBs> findQuestionmonWithBLOBs(QuestionmonWithBLOBs record)
	{
		List<QuestionmonWithBLOBs> questionmonWithBLOBs = questionmonMapper.SelectquestionmonWithBLOBs(record);
		return questionmonWithBLOBs;
	}
}
