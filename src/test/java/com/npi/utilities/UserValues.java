package com.npi.utilities;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.npi.framework.Selenium;
import com.npi.framework.ValueNotFound;

public class UserValues {
	
	static Properties properties;

	static Logger log = Logger.getLogger(Selenium.class);

	static {

		properties = new Properties();

		InputStream is = UserValues.class.getClassLoader().getResourceAsStream(
				"userValues.properties");
		if (is == null) {
			log.error("Sorry, unable to find file, please check path of file");
		}

		try {
			properties.load(is);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String getValue(String key) throws ValueNotFound {

		String value = properties.getProperty(key);

		if (value != null) {
			log.info("Retrieved '" + key + "' Value:" + value);
			return value;
		} else {
			log.error("No value found for Key:'" + key
					+ "', Throwing ValueNotFound Exception.");
			throw new ValueNotFound(key);

		}

	}
}
