package basepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import pagepackage.Kerala_Homepage;
import pagepackage.Login_kerala;

public class Base_class {
	
	public static WebDriver driver;
	public Login_kerala LoginKeralaobj;
	public Kerala_Homepage homeobj;
	

	@BeforeTest
	public void setup()
	{
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--incognito");
	driver =new ChromeDriver();
	driver.get("https://keralaproperty.in/member/login/");
	driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void objectmthd()
	{
		LoginKeralaobj=new Login_kerala(driver);
		homeobj = new Kerala_Homepage(driver);
	}


}


