package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import org.apache.http.entity.mime.content.InputStreamBody;

public class ConfigPropertiesFile {
	static Properties prop1 =new Properties();
	static String projectpath = System.getProperty("user.dir");	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getProperties();
		setProperties();
	}
	public static void getProperties() {

		try {

			/**
			 * To get the path of the file directly use the below code
			 * */

			InputStream input =new FileInputStream(projectpath + "/src/test/java/config/config.properties");
			//InputStream input =new FileInputStream("/home/sarada/eclipse-workspace/Seleniumjavaframework/src/test/java/config/config.properties");

			prop1.load(input);
			String browser1 = prop1.getProperty("browser");
			System.out.println(browser1);

		}catch(Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			System.out.println(exp.getStackTrace());
		}

	}
	public static void setProperties() {
		try {
			OutputStream output = new FileOutputStream(projectpath + "/src/test/java/config/config.properties/");
			prop1.setProperty("browser", "firefox");
			prop1.store(output, "value stored");
			
		}catch(Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			System.out.println(exp.getStackTrace());
		}


	}

}