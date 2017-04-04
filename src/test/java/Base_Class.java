import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Base_Class extends ScreenShot {
	static WebDriver driver;
	String str;
	@FindBy(xpath ="//*[@class='_2k0gmP'][@data-reactid='32')")
	WebElement username1;	
	
	@FindBy(xpath ="//a[contains(@href,'https://www.lampsplus.com/secure/account/sign-in.aspx?ReturnUrl=%2f')]")
	
	private static WebElement element;
	public static WebElement getSignINLamps2(WebDriver driver){
		element = driver.findElement(By.xpath("//a[contains(@href,'https://www.lampsplus.com/secure/account/sign-in.aspx?ReturnUrl=%2f')]"));
		return element;
	}
	public static WebElement EnterUserName(WebDriver driver){
		element = driver.findElement(By.xpath("//input[@type ='text'][@name ='txtEmailorRewards']"));
		return element;
	}
	public static WebElement EneterPassword(WebDriver driver){
		element = driver.findElement(By.xpath("//input[@type ='password'][@name ='txtPassword']"));
		return element;
	}
	public static WebElement Submit(WebDriver driver){
		element = driver.findElement(By.xpath("//input[@type ='submit'][@id ='txtSignIn']"));
		return element;
	}
	
	
	
	//WebElement ele1 =
	By SignIn= By.xpath(".//*[@class='_2k0gmP'][@data-reactid='32']");
	By username = By.xpath("//input[@class='_2zrpKA']");
	By Continue = By.xpath("//button[@class ='_2AkmmA _1LctnI _7UHT_c']");
	Base_Class obj;
	
	public Base_Class(){
		
	}

	public Base_Class(WebDriver driver2) {
		this.driver =driver2;
	}

	@BeforeTest
	public  WebDriver  SettingDriver()
	{
		System.setProperty("webdriver.chrome.driver","C://chromedriver_win32(1)//chromedriver.exe");
		 driver = new ChromeDriver();
		 return driver;
	}

	@Test
	public void login(){
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		driver.get("https://www.flipkart.com/");
		driver.findElement(SignIn).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(username));
		driver.findElement(username).sendKeys("");
		wait.until(ExpectedConditions.visibilityOfElementLocated(Continue));
		driver.findElement(Continue).click();
		obj = new Base_Class(driver);
		//obj.CaptureScreenShot(driver);
	}
	

}

















/**
public void Drop_down()
{
driver.get("https://www.facebook.com/");
WebElement drp_down =  driver.findElement(By.id("day"));	
Select day_dd = new Select(drp_down);
List<WebElement> day_list = day_dd.getOptions();

int total_day_count = day_list.size();
System.out.println("Elemens are as follows ");
for(WebElement elem :day_list){
 str = elem.getText();
 System.out.println(str);
 //System.out.println("Elemens are as follows "+result);
}
}
*/
