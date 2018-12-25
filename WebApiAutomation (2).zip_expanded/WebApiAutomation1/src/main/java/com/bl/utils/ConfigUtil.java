package com.bl.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class ConfigUtil {
	
	public static Properties loadproperties(String fileName){
		Properties prop= new Properties();
		
		try {
			prop.load(new FileInputStream(Constants.path+fileName));//Config.properties
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			
		e.printStackTrace();
		}
		
		return prop;
	}
	
	}