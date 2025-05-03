package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadpropertyFile {

	public static void main(String[] args) throws IOException {
		FileReader fr= new FileReader("C:\\Users\\Vyswa\\OneDrive\\Desktop\\Softwere\\WorkSpace-2\\TestAutomationFramework\\src\\test\\resources\\configfiles\\config.properties");
		
		Properties p = new Properties();
		
		p.load(fr);
		
		System.out.println(p.getProperty("browser"));
		System.out.println(p.getProperty("testURL"));
	}

}
