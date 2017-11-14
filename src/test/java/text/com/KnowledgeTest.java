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
import com.education.hjrz.entity.Smart_knowledge_info;
import com.education.hjrz.service.CourseService;
import com.education.hjrz.service.KnowledgeService;
import com.education.hjrz.service.Smart_courseService;
import com.education.hjrz.service.Smart_knowledge_infoService;

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
      
      //设置ID索引
      public static Map<String,Integer> maps_id = new HashMap<String,Integer>();
      
      
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
      
      @Test
      public void test() {
    	try {
    		ExportRootNode("dataSource2");
    		/*ExportCourseToKnowledge("dataSource2");*/
    		ExportKnowledgesToknowledge("dataSource2");
		} catch (Exception e){
			System.out.println("fail");
		}
      }
}