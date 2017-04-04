package ReUse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(ReUse.TestNgListener.class)

public class Navigateto {
	WebDriver driver;
	@Test
	public void SetUpBrowser(){
		System.setProperty("webdriver.chrome.driver","C://chromedriver_win32(1)//chromedriver.exe");
		 driver = new ChromeDriver();
		 System.out.println("Driver's Instance Sucessfully Created "+driver.getCurrentUrl());
		 
	}
	@Test
	public void TitleMatch(){
		System.out.println("Dummy Test");
		//Assert.assertTrue(false);
	}

}
