package utility;

import java.io.InputStream;
import java.util.Properties;

public class ConnectionManager{
		public static Properties loadPropertiesFile() throws Exception 
		   {
			Properties prop = new Properties();
			InputStream in = ConnectionManager.class.getClassLoader().getResourceAsStream("jdbc.properties");
			prop.load(in);in.close();
			return prop; 
		   } 
	}

