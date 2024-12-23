package GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility 
{
	/**
	 * This method will return value from value from the property file
	 * This method takes key as an argument
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String getDataFromProperty(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/commondata.properties");
		Properties prop=new Properties();
		prop.load(fis);
		return prop.getProperty(key);
	}

}
