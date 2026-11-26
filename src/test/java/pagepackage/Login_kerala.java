package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Login_kerala {
	
WebDriver driver;
	
	
	@FindBy(xpath="//*[@id=\"frm_login\"]/div[1]/label")WebElement username;
	@FindBy(xpath="//*[@id=\"upass\"]")WebElement password;
	@FindBy(xpath="//*[@id=\"sub_logbtn\"]")WebElement loginbtn;
	
	public Login_kerala (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public String titlemthd()
	{
		String title=driver.getTitle();
		return title;
	}
	
	public void loginmthd()
	{
		username.sendKeys("aswa@gmail.com");
		password.sendKeys("aswa123");
		loginbtn.click();
		
	
	}
	
}


