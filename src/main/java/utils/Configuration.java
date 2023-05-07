package utils;

import java.io.InputStream;
import java.util.Properties;

public class Configuration {

	Properties properties;

	public Configuration() {
		loadProperties();
	}

	private void loadProperties() {
		try {
			properties = new Properties();
			InputStream iStream = getClass().getClassLoader().getResourceAsStream("configuration.properties");
			properties.load(iStream);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	public String readProp(String key) {
		return properties.getProperty(key);
	}

	public int readPropNum(String key) {
		return Integer.parseInt(readProp(key.trim()));
	}
}
