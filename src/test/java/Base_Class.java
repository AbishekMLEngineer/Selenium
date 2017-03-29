import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Base_Class {
	WebDriver driver;
	String str;
	By SignIn= By.xpath(".//*[@class='_2k0gmP'][@data-reactid='32']");
	By username = By.xpath("//input[@class='_2zrpKA']");
	By Continue = By.xpath("//button[@class ='_2AkmmA _1LctnI _7UHT_c']");
	
	@BeforeTest
	public void Try2()
	{
		System.setProperty("webdriver.chrome.driver","C://chromedriver_win32(1)//chromedriver.exe");
		 driver = new ChromeDriver();
	}
	@Test
	public void login(){
		WebDriverWait wait = new WebDriverWait(driver, 30);
		driver.get("https://www.flipkart.com/");
		driver.findElement(SignIn).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(username));
		driver.findElement(username).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(Continue));
		driver.findElement(Continue).click();
		
		
		
		
		
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
