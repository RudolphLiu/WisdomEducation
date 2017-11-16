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
      
      public Map<String,Integer> maps_id1 = new HashMap<String,Integer>();
	  
	  
	  public Map<String,Integer> maps_id2 = new HashMap<String,Integer>();
      
	  public void exeee1()
	  {
		  maps_id1.put("12123",11121212);
	  }
	  
	  public void exefaef2()
	  {
		  maps_id2.put("1152",1213123);
	  }
	  
	  public void dasda()
	  {
		  Integer oldid1 = 12123;
		  Integer oldid2 = 1152;
		  Integer newid = maps_id1.get(oldid1.toString());
		  Integer newid2 = maps_id2.get(oldid2.toString());
		  System.out.println(newid +"\\\\" +newid2);
	  }
	  
      @Test
      public void test() {
    	  exeee1();
		  exefaef2();
		  dasda(); 
      }
}
