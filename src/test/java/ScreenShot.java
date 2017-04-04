import libraries.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class ScreenShot  {
	
	WebDriver driver;
	public void letsTry()
	{
		System.setProperty("webdriver.chrome.driver","C://chromedriver_win32(1)//chromedriver.exe");
		 driver = new ChromeDriver();

	driver.get("https://www.udemy.com/selenium-training/");
	Utilities.CaptureScreenShot(driver, "Talwar");
	}

}
