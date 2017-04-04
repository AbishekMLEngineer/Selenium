import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class UseElementsInBaseClass {
	BrowserFactory  obj34;
	WebDriver driver;
	public UseElementsInBaseClass(){
		
	}
	@Test(priority=1)
	public void trial(){
		obj34 = new BrowserFactory();
		//System.out.println(obj34.VerifyPageTitle("Chrome"));
		System.out.println();
		driver = obj34.VerifyPageTitle("Chrome");
	}
	@Test(priority=2)
	public void trial2(){
		driver.get("https://www.flipkart.com/");
	}

}
