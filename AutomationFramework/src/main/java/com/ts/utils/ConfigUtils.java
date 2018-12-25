package com.ts.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigUtils {
	
public Properties getDrivers(String name) throws FileNotFoundException {
	File fio= new File(Constants.drive+name);
	Properties prop= new Properties();
	try {
		prop.load(new FileInputStream(fio));
	} catch (IOException e) {
		e.printStackTrace();
	}
	System.out.println(prop);
	return prop;
	
}
}

