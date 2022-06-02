package com.jdbc.utility;

public class TestDemo {

	public static void main(String[] args) {
		
	String	saveDB_USERValue =PropertyReader.getConectionInfo("DB_USER");
	String	saveDB_PASSValue =PropertyReader.getConectionInfo("DB_PASS");
	String	saveDB_URLValue =PropertyReader.getConectionInfo("DB_URL");
	String	saveDB_DatabaseDRiverValue =PropertyReader.getConectionInfo("Database_Driver");
	
	
	System.out.println(saveDB_USERValue);
	
	System.out.println(saveDB_PASSValue);
	System.out.println(saveDB_URLValue);
	
	System.out.println(saveDB_DatabaseDRiverValue );
	
	}

}
