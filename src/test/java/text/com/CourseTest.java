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
import com.education.hjrz.entity.Course;
import com.education.hjrz.entity.Smart_course;
import com.education.hjrz.entity.Smart_knowledge_info;
import com.education.hjrz.service.CourseService;
import com.education.hjrz.service.Smart_courseService;
import com.education.hjrz.service.Smart_knowledge_infoService;

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
public class CourseTest {
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
      private Smart_courseService smart_courseService;
      
      @Autowired
      private Smart_knowledge_infoService smart_knowledge_infoService;
      
      //设置ID索引
      public static Map<Integer,Integer> maps_id = new HashMap<Integer,Integer>();
      
      @Test
      public void test() {
    	try {
    		DynamicDataSourceHolder.setDataSource("dataSource2");
    		/**
    		 *  形参：查询条件，若为null则查询全部
    		 */
    		List<Course> courses = courseService.findCourse(null);
    		DynamicDataSourceHolder.setDataSource("dataSource2");
    		for(Course se:courses)
    		{
    			//第三方学科表————>第三方
    			Integer ThirdCourseId = se.getId().intValue();
    			Smart_course exp_course_info = new Smart_course();
    			exp_course_info.setCourseName(se.getCourseName());
    			exp_course_info.setCourseID(se.getId().toString());
    			exp_course_info.setIsDelete(false);
    			smart_courseService.addsmart_course(exp_course_info);
    			Integer finllyId = exp_course_info.getId();
    			maps_id.put(finllyId,ThirdCourseId);
    		}
		} catch (Exception e){
			System.out.println("fail");
		}
      }
}