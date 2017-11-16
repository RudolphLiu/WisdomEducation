package text.com;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.education.hjrz.core.DynamicDataSourceHolder;
import com.education.hjrz.entity.QuestionmonWithBLOBs;
import com.education.hjrz.entity.Smart_topicWithBLOBs;
import com.education.hjrz.entity.Smart_topic_knowledge;
import com.education.hjrz.service.QuestionmonService;
import com.education.hjrz.service.Smart_topicService;
import com.education.hjrz.service.Smart_topic_knowledgeService;

/**
 * @ClassName RedisServiceTest
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author RudolphLiu
 * @Date 2017年7月4日 下午5:08:49
 * @version 1.0.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations="classpath:spring/spring-*.xml")
public class QuestionmonTest {
      @BeforeClass
      public static void setUpBeforeClass() throws Exception {}
    
      @AfterClass
      public static void tearDownAfterClass() throws Exception {}
    
      @Before
      public void setUp() throws Exception {}
    
      @After
      public void tearDown() throws Exception {}
      
      @Autowired
      private QuestionmonService questionmonService;
      
      @Autowired
      private Smart_topicService smart_topicService;
      
      @Autowired
      private Smart_topic_knowledgeService smart_topic_knowledgeService;
      
      public static Map<String,Integer> maps_questionId = new HashMap<String,Integer>();
      
      public void ExportQuestionmon(String dataSource) throws Exception
      {
    	  DynamicDataSourceHolder.setDataSource(dataSource);
    	  List<QuestionmonWithBLOBs> questionList = questionmonService.findQuestionmonWithBLOBs(null);
    	  //开始写入
    	  DynamicDataSourceHolder.setDataSource("dataSource2");
    	  for(QuestionmonWithBLOBs qs:questionList)
	  		{
    		  Integer oldQuestionID = qs.getQuestionId().intValue();
    		  Smart_topicWithBLOBs smart_topicWithBLOBs = new Smart_topicWithBLOBs();
    		  smart_topicWithBLOBs.setType(false);
    		  smart_topicWithBLOBs.setContent(qs.getBodyHtml());
    		  smart_topicWithBLOBs.setInputDate(qs.getInputDate());
    		  String repacestr = qs.getOptionHtmlList().replaceAll("\\$\\$\\$\\$\\$","##");
    		  smart_topicWithBLOBs.setOptions(repacestr);
    		  smart_topicWithBLOBs.setReference(qs.getAnswer());
    		  smart_topicWithBLOBs.setDifficulty(qs.getDifficulty());
    		  smart_topicWithBLOBs.setWrongTimes(0);
    		  smart_topicWithBLOBs.setTotalTimes(0);
    		  smart_topicWithBLOBs.setErrorRate(0.0);
    		  smart_topicWithBLOBs.setAnylysis(qs.getAnylysisHtml());
    		  smart_topicWithBLOBs.setCommentCount(qs.getCommentCount());
    		  smart_topicWithBLOBs.setCommentValue(qs.getCommentValue());
    		  smart_topicWithBLOBs.setSumCommentValue(qs.getSumCommentValue());
    		  smart_topicWithBLOBs.setShareCount(qs.getShareCount());
    		  smart_topicWithBLOBs.setQuestionFrom(qs.getQuestionFrom());
    		  smart_topicWithBLOBs.setUploadFlag(qs.getUploadFlag());
    		  smart_topicWithBLOBs.setUploadId(qs.getUploadId().intValue());
    		  smart_topicWithBLOBs.setUploadCode(qs.getUploadCode());
    		  smart_topicWithBLOBs.setUploadDate(qs.getUploadDate());
    		  smart_topicWithBLOBs.setIsDelete(false);
    		  smart_topicService.addsmart_topic(smart_topicWithBLOBs);
    		  Integer newQuestionID = smart_topicWithBLOBs.getId();
    		  maps_questionId.put(oldQuestionID.toString(),newQuestionID);
	  		}
      }
      
      public void ExportQuestionandToKnowledge(String dataSource)throws Exception
      {
    	  DynamicDataSourceHolder.setDataSource(dataSource);
    	  List<QuestionmonWithBLOBs> questionList = questionmonService.findQuestionmonWithBLOBs(null);
    	  for(QuestionmonWithBLOBs qs:questionList)
    	  {
    		  Smart_topic_knowledge smart_topic_knowledge = new Smart_topic_knowledge();
    		  smart_topic_knowledge.setKnowledge_id(qs.getThirdKnowledgeId().intValue());
    		  smart_topic_knowledge.setTopicID_id(qs.getQuestionId().intValue());
    		  smart_topic_knowledge.setIsDelete(false);
    		  smart_topic_knowledgeService.addSmart_topic_knowledge(smart_topic_knowledge);
    	  }
      }
      
      @Test
      public void test() {
    	try {
    		ExportQuestionandToKnowledge("dataSource2");
    	} catch (Exception e) {
			System.out.println("This time is Fail");
		}
      }
}
