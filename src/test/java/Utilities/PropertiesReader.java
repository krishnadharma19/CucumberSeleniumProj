package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesReader {

    private static final String CONFIGFILEPATH = "./config.properties";

    public static String getValue(String key) throws Exception {

        File file = new File(CONFIGFILEPATH);
        FileInputStream fileInputStream = new FileInputStream(file);
        Properties properties = new Properties();
        properties.load(fileInputStream);
        return properties.getProperty(key);
    }

    public Long getTimeout() throws Exception {
        String timeout = PropertiesReader.getValue("timeout");
        return Long.parseLong(timeout);
    }
    
    public static void storeValToConfigProps(String key, String value) {
		try {
			FileInputStream in = new FileInputStream(CONFIGFILEPATH);
			Properties props = new Properties();
			props.load(in);
			in.close();
			FileOutputStream out = new FileOutputStream(CONFIGFILEPATH);
			props.setProperty(key, value);
			props.store(out, null);
			out.close();
		} catch (Exception e) {
			System.out.println("Exception details here: " + e.getMessage());
		}
	}
}