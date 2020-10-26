package chap15.textbook.s150403;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Map;
import java.util.Properties;

public class PropertiesExample {
	public static void main(String[] args) throws Exception{
		Properties properties =  new Properties();
		String path = PropertiesExample.class.getResource("database.properties").getPath();
		path = URLDecoder.decode(path, "utf-8");
		// 파일을 읽어서 map에 설정 파일(.properties)의 정보를 저장
		properties.load(new FileReader(path));
		
		System.out.println(properties.size());
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		System.out.println(driver);
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
	}

}
