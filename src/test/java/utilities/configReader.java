package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configReader {
		
	private static Properties prop;
	private static String proppath= "src/test/resources/config/config.properties";
	
	public static void configload()throws Throwable {
	
	try {
		FileInputStream ip= new FileInputStream(proppath);
		prop=new Properties();
		try {
			prop.load(ip);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		throw new RuntimeException("config.properties not found at " + proppath);
	}
	
	}
	
	public static String getBrowserType() {
		String browser = prop.getProperty("browser");
		if (browser != null)
			return browser;
		else
			throw new RuntimeException("browser not specified in the config.properties file.");
	}
	
	public static String getApplicationUrl() {
		String url = prop.getProperty("url");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the config.properties file.");
	}
	
	public static String getHomePage() {
		String homepage = prop.getProperty("homepage");
		if (homepage != null)
			return homepage;
		else
			throw new RuntimeException("url not specified in the config.properties file.");
				
	}
	
	public static String getregisterUrl() {
		String register=prop.getProperty("registerurl");
		if(register!=null)
			return register;
		else
			throw new RuntimeException("url not specified in the config.properties file.");
	}
	
	public static String getloginUrl() {
		String login=prop.getProperty("loginpage");
		if(login!=null)
			return login;
		else
			throw new RuntimeException("url not specified in the config.properties file.");
	}
	
	public static String getexcelfilepath() {
		String excelfilelpath = prop.getProperty("excelfilepath");
		if (excelfilelpath != null)
			return excelfilelpath;
		else
			throw new RuntimeException("Excel file path not specified in the Configuration.properties file.");
	}

	public static String geturl(String pagename) {
		String url = prop.getProperty(pagename);
		if (url != null)
			return url;
		else
			throw new RuntimeException(pagename + " url not specified in the Configuration.properties file.");
	}
	
	public static String tryEditorURL() {
		String tryeditorurl = prop.getProperty("tryeditorurl");
		if (tryeditorurl != null)
			return tryeditorurl;
		else
			throw new RuntimeException("tryeditorurl not specified in the Configuration.properties file.");
	}
	
//	// LinkedList config reader
//	
//	public static String getLinkListUrl() {
//		String linklist=prop.getProperty("LinkedListpage");
//		if(linklist!=null)
//			return linklist;
//		else
//			throw new RuntimeException("url not specified in the config.properties file.");
//	}
//	
//	//Graph Module Configuration reader
//	
//	public static String getGraphUrl() {
//		String graphurl = prop.getProperty("graphurl");
//		if (graphurl != null)
//			return graphurl;
//		else
//			throw new RuntimeException("graph url is not specified in the config.properties file.");
//	}

}
