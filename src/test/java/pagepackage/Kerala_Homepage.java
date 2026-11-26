package pagepackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Kerala_Homepage {
	
	WebDriver driver ;
	Select obj;

	@FindBy(xpath = "/html/body/div[3]/div/div/div[1]/div/ul/li[3]/a")WebElement addproperty;
	@FindBy(xpath = "//*[@id=\"proptype\"]")WebElement property_for;
	@FindBy(xpath = "//*[@id=\"listtype\"]")WebElement listing_plan;
	@FindBy(xpath = "//*[@id=\"proplabel\"]")WebElement propert_lable;
	@FindBy(xpath = "//*[@id=\"propcategory\"]")WebElement category;
	@FindBy(xpath = "//*[@id=\"propcost\"]")WebElement expected_Price;
	@FindBy(xpath = "//*[@id=\"propbeds\"]")WebElement no_of_beds;
	@FindBy(xpath = "//*[@id=\"propbaths\"]")WebElement no_of_baths;
	@FindBy(xpath = "//*[@id=\"district\"]")WebElement district;
	@FindBy(xpath = "//*[@id=\"proplocation\"]")WebElement location;
	@FindBy(xpath = "//*[@id=\"propaddress\"]")WebElement address;
	@FindBy(xpath = "//*[@id=\"introlabel\"]")WebElement title;
	@FindBy(xpath = "//*[@id=\"frm_property\"]/div[9]/div/div/iframe")WebElement frame_tag;
	@FindBy(xpath = "/html/body")WebElement summary_box;
	//@FindBy(xpath = "//*[@id=\"userfile\"]")WebElement property_photo;
	//@FindBy(xpath = "//*[@id=\"sub_frmproperty\"]")WebElement submit_button;
	
	
	public Kerala_Homepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void add_property_mthd()
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div/div/div[1]/div/ul/li[3]/a")));
		addproperty.click();
		
		obj= new Select(property_for);  // creating object for select class
		obj.selectByValue("sale");
		
		obj= new Select(listing_plan);
		obj.selectByValue("regular");
		
		propert_lable.sendKeys("Property");
		
		obj= new Select(category);
		obj.selectByValue("7");
		
		expected_Price.sendKeys("500000");
		
		no_of_beds.sendKeys("5");
		
		no_of_baths.sendKeys("4");
		
		
		obj= new Select(district);
		obj.selectByValue("8");
		
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.elementToBeClickable(location));
		
	    obj= new Select(location);
		obj.selectByValue("389");
		
		address.sendKeys("Ernakulam");
		
		title.sendKeys("Summary Title");
		
		driver.switchTo().frame(frame_tag);
		
		summary_box.click();
		summary_box.sendKeys("abcdef");
		
		driver.switchTo().defaultContent();
		
	}

}
