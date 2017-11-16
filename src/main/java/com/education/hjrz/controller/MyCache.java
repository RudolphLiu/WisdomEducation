package com.education.hjrz.controller;

import java.util.HashMap;
import java.util.Map;

public class MyCache {
	private static final String MYFIRST_KEY = "myFirstKey";
	private static final String MY_SECOND_KEY = "mySecondKey";
	private static final String MY_THIRD_KEY = "myThirdKey";

	private static MyCache myCache=null;
	private static Map<String, String> pathMap = new HashMap<String, String>(){


	/**
	* 给Map初始化、赋值
	*/
	private static final long serialVersionUID = 8215851505074905693L;
	{
	put(MYFIRST_KEY,"");
	put(MY_SECOND_KEY,"");
	put(MY_THIRD_KEY,"");
	} 
	};

	/**
	* 
	* @return 返回该Map
	*/
	public static MyCache getMyCache(){
	if(myCache==null){
	myCache=new MyCache();
	}
	return myCache;
	}
	/**
	* 
	* @param myFirstValue 向缓存中存入第一个值
	*/
	public void setMyFirstVaule(String myFirstValue){
	pathMap.put(MYFIRST_KEY, myFirstValue);
	}
	
	public void setMyFirstVaule(String key,String value){
		pathMap.put(key, value);
		}
	/**
	* 
	* @return 根据键返回缓存的值
	*/
	public String getMyFirstValue(){
	return pathMap.get(MYFIRST_KEY);
	}
	
	public String getMyFirstValue(String key){
		return pathMap.get(key);
		}

	public void setMySecondVaule(String mySecondValue){
	pathMap.put(MY_SECOND_KEY, mySecondValue);
	}

	public String getMySecondVaule(){
	return pathMap.get(MY_SECOND_KEY);
	}

	public void setMyThirdValue(String myThirdValue){
	pathMap.put(MY_THIRD_KEY, myThirdValue);
	}

	public String getMyThirdValue(){
	return pathMap.get(MY_THIRD_KEY);
	}
}
