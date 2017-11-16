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

import com.education.hjrz.converter.KnowledgePknowConverter;
import com.education.hjrz.core.DynamicDataSourceHolder;
import com.education.hjrz.entity.Course;
import com.education.hjrz.entity.Knowledge;
import com.education.hjrz.entity.QuestionmonWithBLOBs;
import com.education.hjrz.entity.Smart_knowledge_info;
import com.education.hjrz.entity.Smart_topicWithBLOBs;
import com.education.hjrz.entity.Smart_topic_knowledge;
import com.education.hjrz.service.CourseService;
import com.education.hjrz.service.KnowledgeService;
import com.education.hjrz.service.QuestionmonService;
import com.education.hjrz.service.Smart_courseService;
import com.education.hjrz.service.Smart_knowledge_infoService;
import com.education.hjrz.service.Smart_topicService;
import com.education.hjrz.service.Smart_topic_knowledgeService;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations="classpath:spring/spring-*.xml")
public class KnowledgeTest {
      @BeforeClass
      public static void setUpBeforeClass() throws Exception {}
    
      @AfterClass
      public static void tearDownAfterClass() throws Exception {}
    
      @Before
      public void setUp() throws Exception {}
    
      @After
      public void tearDown() throws Exception {}
      
      @Autowired
      private CourseService courseService;
      
      @Autowired
      private Smart_knowledge_infoService smart_knowledge_infoService;
      
      @Autowired
      private KnowledgeService knowledgeService;
      
      @Autowired
      private Smart_courseService smart_courseService;
      
      @Autowired
      private QuestionmonService questionmonService;
      
      @Autowired
      private Smart_topicService smart_topicService;
      
      @Autowired
      private Smart_topic_knowledgeService smart_topic_knowledgeService;
      
      public Map<String,Integer> maps_questionId = new HashMap<String,Integer>();
      
      public Map<String,Integer> maps_id = new HashMap<String,Integer>();
      
      
      public void ExportRootNode(String datasource)
      {
	    	 /** 
	  		 *  (1)表中初始有一条id为1的记录，作为所有知识点的根节点
	  		 *	(2)如果不存在根节点，就插入一个根节点
	  		 *	《RootNode》--->>>knowledge(table)
	  		 **/
	  		DynamicDataSourceHolder.setDataSource(datasource);
	  		Smart_knowledge_info smart_knowledge_info = new Smart_knowledge_info(1,"RootNode",null,-1,null,null,false);
	  		if(smart_knowledge_infoService.selectRootNodeAlive()){
	  			smart_knowledge_infoService.addsmart_knowledge_info(smart_knowledge_info);
	  			System.out.println("已插入根节点");
	  		}
      }
      
      public void ExportCourseToKnowledge(String datasource)
      {
    	  /**
    	   *  (1)第三方课程点转移至智慧教育知识点
    	   *  《Course》--->>>smartKnowledge()  
    	   **/
    	  DynamicDataSourceHolder.setDataSource(datasource);
    	  List<Course> courses = courseService.findCourse(null);
    	  for(Course se:courses)
  		  {
  			Integer OldCoursesID = se.getId().intValue();
  			Smart_knowledge_info exp_knowledge_info = new Smart_knowledge_info(0,se.getCourseName(),1,1,0,1,false);
  			smart_knowledge_infoService.savesmart_knowledge_info(exp_knowledge_info);
  			Integer NewCourseID = exp_knowledge_info.getId();
  			//old CourseID find new CourseID
  			maps_id.put(OldCoursesID.toString(),NewCourseID);
  		  }
      }
      
      public void ExportKnowledgesToknowledge(String datasource) throws Exception
      {
    	  /**
    	   * 
    	   *  《Knowledge》--->>>smartKnowledge()
    	   */
    	  DynamicDataSourceHolder.setDataSource(datasource);
    	  List<Knowledge> knowledges = knowledgeService.findKnowledge(null);
  		for(Knowledge kl:knowledges)
  		{
  			/**
  			 * 第三方知识点->smart知识点表
  			 * KnowType 学科为1，普通知识点为2
  			 * TopicNum 各个知识点的题目总数
  			 * Level 级别：从1递增
  			 * 若第三方数据库中parentId为NULL，则需根据courseId来生PKnow
  			 */
  			if(kl.getParentId()==null || kl.getParentId()==0)
  			{
  				int parentId = smart_courseService.findidByCourseID(kl.getCourseId().intValue());
  				kl.setParentId((long) parentId);
  			}
  			Integer OldID = kl.getId().intValue();
  			Smart_knowledge_info exp_knowledge_info2 = new Smart_knowledge_info();
  				exp_knowledge_info2.setId(0);
  				exp_knowledge_info2.setName(kl.getKnowledgeName());
  				exp_knowledge_info2.setPKnow(kl.getParentId().intValue());
  				exp_knowledge_info2.setKnowType(2);
  				exp_knowledge_info2.setLevel(kl.getLevel()+1);
  				exp_knowledge_info2.setTopicNum(0);
  				exp_knowledge_info2.setIsDelete(false);
  		    smart_knowledge_infoService.addsmart_knowledge_info(exp_knowledge_info2);
  		    Integer NewID = exp_knowledge_info2.getId();
  		    //通过旧ID查找新ID
  		    maps_id.put(OldID.toString(),NewID);
  		    KnowledgePknowConverter converter =  new KnowledgePknowConverter();
  		    converter.setNewpKnow(maps_id.get(kl.getParentId().toString()));
  		    converter.setOldpKnow(kl.getParentId().intValue());
  		    if(converter.getNewpKnow()== null || converter.getNewpKnow() == 0){
  		    	converter.setNewpKnow(converter.getOldpKnow());
  		    }
  		    smart_knowledge_infoService.updatePKnowByMapsId(converter);
  			}
      }
      
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
    		  Integer newKnowledge_id = maps_id.get(qs.getThirdKnowledgeId().toString());
    		  Integer newTopicID_id = maps_questionId.get(qs.getQuestionId().toString());
    		  Smart_topic_knowledge smart_topic_knowledge = new Smart_topic_knowledge();
    		  smart_topic_knowledge.setKnowledge_id(newKnowledge_id);
    		  smart_topic_knowledge.setTopicID_id(newTopicID_id);
    		  smart_topic_knowledge.setIsDelete(false);
    		  smart_topic_knowledgeService.addSmart_topic_knowledge(smart_topic_knowledge);
    	  }
      }
      
      @Test
      public void test() {
    	try {
    		ExportRootNode("dataSource2");
    		ExportCourseToKnowledge("dataSource2");
    		ExportKnowledgesToknowledge("dataSource2");
    		ExportQuestionmon("dataSource2");
    		ExportQuestionandToKnowledge("dataSource2");
		} catch (Exception e){
			System.out.println("fail");
		}
      }
}