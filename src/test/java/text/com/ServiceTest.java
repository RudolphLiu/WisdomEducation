package text.com;

import java.util.List;

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
import com.education.hjrz.service.CourseService;

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
public class ServiceTest {
      @BeforeClass
      public static void setUpBeforeClass() throws Exception {}
    
      @AfterClass
      public static void tearDownAfterClass() throws Exception {}
    
      @Before
      public void setUp() throws Exception {}
    
      @After
      public void tearDown() throws Exception {}
      
      @Autowired
      private CourseService CourseService;
      
      @Test
      public void test() {
    	try {
    		DynamicDataSourceHolder.setDataSource("dataSource2");
    		Course course = null;
    		List<Course> courses = CourseService.findCourse(course);
    		for(Course co:courses)
    		{
    			System.out.println(co.getId()+"|"+co.getStudyType()+"|"+co.getCourseName()+"|");
    		}
		} catch (Exception e) {
			System.out.println("fail");
		}
      }
}
