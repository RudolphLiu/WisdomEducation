package com.education.hjrz.controller;

import java.util.HashMap;
import java.util.Map;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

public class ImportMain {
	
	  public static Map<String,Integer> maps_id1 = new HashMap<String,Integer>();
	  
	  
	  public static Map<String,Integer> maps_id2 = new HashMap<String,Integer>();
	  
	  public static void exeee1()
	  {
		  maps_id1.put("12123",11121212);
	  }
	  
	  public static void exefaef2()
	  {
		  maps_id2.put("1152",1213123);
	  }
	  
	  public static void dasda()
	  {
		  Integer oldid1 = 12123;
		  Integer oldid2 = 1152;
		  Integer newid = maps_id1.get(oldid1.toString());
		  Integer newid2 = maps_id2.get(oldid2.toString());
		  System.out.println(newid +"\\\\" +newid2);
	  }
	  
	  public static void main(String[] args) {
		  
		  exeee1();
		  exefaef2();
		  dasda(); 
	}
}
