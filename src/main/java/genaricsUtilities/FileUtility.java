package genaricsUtilities;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * 
 * @return
 */
public class FileUtility {


	public String getProperKeyValue(String key) throws Throwable{

		FileInputStream fits=new FileInputStream("./src/test/resources/Vtigerresources.properties");
		Properties prop=new Properties();
		prop.load(fits);
		String Value=prop.getProperty(key);
		return Value;
	}
}