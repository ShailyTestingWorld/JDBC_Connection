package com.jdbc.utility;

import java.io.FileInputStream;
import java.util.Properties;

// class 
// static block
// try catch
public class PropertyReader {
	private static Properties conetionProperties=new Properties();
	static {
		
		try {
			FileInputStream conDetail=new FileInputStream(System.getProperty("user.dir")+"//src//test//java//com//jdbc//properties//jdbcconection.properties");
			      conetionProperties.load(conDetail);
			
		}
		catch(Exception e) {
			
		}
		
	}
	
	public static String getConectionInfo(String key) {
		  return conetionProperties.getProperty(key);	 
	 }
		 

}
