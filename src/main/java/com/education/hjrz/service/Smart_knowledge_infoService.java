package com.education.hjrz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.education.hjrz.converter.KnowledgePknowConverter;
import com.education.hjrz.dao.Smart_knowledge_infoMapper;
import com.education.hjrz.entity.Smart_knowledge_info;

@Service
public class Smart_knowledge_infoService {
		
		@Autowired
		private Smart_knowledge_infoMapper smart_knowledge_infoMapper;
		
		/**
		 * @author RodulphLiu
		 * @description 查询所有smart知识点内容
		 * @date 2017年11月7日
		 * @version 1.0
		 */
		public List<Smart_knowledge_info> findSmart_knowledge_info(Smart_knowledge_info smart_knowledge_info)
		{
			return smart_knowledge_infoMapper.selectSmart_knowledge_infos(smart_knowledge_info);
		}
		
		/**
		 * @author RodulphLiu
		 * @description addsmart_knowledge_info
		 * @date 2017年11月7日
		 * @version 1.0
		 */
		public void addsmart_knowledge_info(Smart_knowledge_info smart_knowledge_info){
			 smart_knowledge_infoMapper.insert(smart_knowledge_info);
		}
		
		public void savesmart_knowledge_info(Smart_knowledge_info smart_knowledge_info)
		{
			smart_knowledge_infoMapper.insertSelective(smart_knowledge_info);
		}
		
		/**
		 * @author RodulphLiu
		 * @description selectRootNodeAlive查找根节点是否存在
		 * @date 2017年11月8日
		 * @version 1.0
		 */
		public boolean selectRootNodeAlive()
		{
			boolean flag = true;
			Smart_knowledge_info smInfo = smart_knowledge_infoMapper.selectRootNodeAlive();
			if(smInfo != null && smInfo.getKnowType() == -1)
			{
				flag = false;
			}
			return flag;
		}
		
		/**
		 * @author RodulphLiu
		 * @description updatePKnowByMapsId
		 * @date 2017年11月13日
		 * @version 1.0
		 */
		public void updatePKnowByMapsId(KnowledgePknowConverter knowledgePknowConverter)
		{
			smart_knowledge_infoMapper.updatePKnowByMapsId(knowledgePknowConverter);
		}
}
