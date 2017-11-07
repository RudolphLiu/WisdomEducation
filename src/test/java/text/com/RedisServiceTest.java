package text.com;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

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
public class RedisServiceTest {
      @BeforeClass
      public static void setUpBeforeClass() throws Exception {}
    
      @AfterClass
      public static void tearDownAfterClass() throws Exception {}
    
      @Before
      public void setUp() throws Exception {}
    
      @After
      public void tearDown() throws Exception {}
      
      @Test
      public void test() {
    	try {
    		
		} catch (Exception e) {
			System.out.println("fail");
		}
      }
}
