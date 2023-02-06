package utilities;

import java.io.FileInputStream;
import java.util.Properties;

import utilities.constants;

public class configReader {
	
	private static Properties config_file;

	static {
		try {

			String filepath = constants.FILE_PATH;
			FileInputStream input = new FileInputStream(filepath);
			config_file = new Properties();
			config_file.load(input);
			input.close();
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static String getProperties(String key) {
		return config_file.getProperty(key);
	}


}
