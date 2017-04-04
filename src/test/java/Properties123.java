import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;
import java.io.FileInputStream;

public class Properties123 {
	WebDriver driver;
	Properties pro;
	public Properties123(){
		
		String chromepath;
		try {
			java.io.File src = new java.io.File("./Configuration/Config.property");
			//File("./Product.property");
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
			chromepath = pro.getProperty("Username");
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		//System.out.println(chromepath);
				//ClickElement.clickbyid(driver, "persistent");
		
		}
			public String getchromepath(){
				return pro.getProperty("Chromedriverpath");
			}
			public String getUrl(){
				return pro.getProperty("Url");
			}
			public String getUserName(){
				return pro.getProperty("Username");
			}
			public String getMobileNo(){
				return pro.getProperty("Mobileno");
			}
			Properties123 abc;
			@Test
			public void createobj(){
				abc = new Properties123();
				System.out.println(abc.getMobileNo());
			}
			
			
			
			String strxyz;
			
			public String getUserNameLamps1(){
				strxyz= pro.getProperty("UserNameLamps");
				return strxyz;
			}
			public String getPasswordLamps1(){
				strxyz = pro.getProperty("PasswordLamps");
				return strxyz;
			}
			
			
}
