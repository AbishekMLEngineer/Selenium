import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class BootStrap extends Base_Class {
	//WebDriver driver;
	public BootStrap(){
		super(driver);
	}
	@Test
	public void start(){
	driver.get("http://www.lampsplus.com/");
	
	List<WebElement> dd_menu = driver.findElements(By.id("aChandeliers"));
	int dd = dd_menu.size();
	System.out.println("No. of links "+dd);
	if(dd>0){
		for(WebElement ele : dd_menu){
			System.out.println(ele.getText());
		}
	}
	
}
}
