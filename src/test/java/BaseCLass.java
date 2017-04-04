import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class BaseCLass {
	WebDriver driver;
	@BeforeTest
	public void Try2()
	{
		System.setProperty("webdriver.chrome.driver","C://chromedriver_win32(1)//chromedriver.exe");
		 driver = new ChromeDriver();
	}
	@DataProvider(name ="TestData")
	public Object[][] getData()
	{
		Object [][] data = new Object[3][2];
		data[0][0] = "abishek.kachroo@gmail.com";
		data[0][1] = "Abishek@123";
		
		data[1][0]= "silicus.qa123@gmail.com";
		data[1][1] = "Silicus@123";
		
//		data[2][0]= "user2";
	//	data[2][1] = "password2";
		
		
		return data;
	}
	@Test(dataProvider ="TestData")
	public void login(String username , String Password){
		driver.get("https://accounts.google.com/ServiceLogin?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1#identifier");
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("next")).click();
		driver.findElement(By.id("Passwd")).sendKeys(Password);
		driver.findElement(By.id("signIn")).click();
		
	}
}
