import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class LoginLampsPlus {
	WebDriver driver;
	Base_Class obj34;
	Properties123 abc123;
	@Test
	public void getDiver(){
		obj34 = new Base_Class();
		abc123 = new Properties123();
		driver = obj34.SettingDriver();
		driver.get("http://www.lampsplus.com/");
		driver.close();
	}
	@Test
	public void run44(){
		driver = obj34.SettingDriver();
		driver.get("http://www.lampsplus.com/");
		Base_Class.getSignINLamps2(driver).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.switchTo().frame("signInToolTip");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		Base_Class.EnterUserName(driver).sendKeys(abc123.getUserNameLamps1());
		Base_Class.EneterPassword(driver).sendKeys(abc123.getPasswordLamps1());
		Base_Class.Submit(driver).click();
		
		driver.switchTo().defaultContent();
	}
	
	
	

}




/**WindowHandle**/
/**
 *String parentwindow = driver.getWindowHandle();
System.out.println(parentwindow);
Base_Class.getSignINLamps2(driver).click();
//String popupwindow = driver.getWindowHandle();
//System.out.println(popupwindow);
Set<String> windows = driver.getWindowHandles();
System.out.println(windows.size());
String CurrentWindowId;
Iterator iterator = windows.iterator();
while(iterator.hasNext())
{
	CurrentWindowId= iterator.next().toString();
	if(!CurrentWindowId.equals(parentwindow))
	{
		driver.switchTo().window(CurrentWindowId);
		
	}

}
 */