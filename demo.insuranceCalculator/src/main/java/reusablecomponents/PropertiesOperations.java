package reusablecomponents;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import io.netty.util.internal.StringUtil;

public class PropertiesOperations
{
	static Properties prop= new  Properties();
	public static String getPropertyValueByKey(String key) throws Exception 
	{
		String propFilePath=System.getProperty("user.dir")+"/src/test/resources/config.properties";
	    FileInputStream src= new FileInputStream(propFilePath);
	    prop.load(src);
	    
	    String value=prop.getProperty(key);
	    if(StringUtil.isNullOrEmpty(value))
	    {
	    	throw new Exception("No value is specified for"+key+" in properties file");
	    }
	    return value;
		
	}

	
}
