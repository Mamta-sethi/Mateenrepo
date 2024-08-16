package com.vtiger.genericUtility;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileUtility {
	public String readDatafrompf(String key) throws Throwable {
		FileInputStream fis=new FileInputStream(Iconstantpaths.PropertyFileUtility);
		Properties p=new Properties();
		p.load(fis);
		return p.getProperty(key);
	}
}
  