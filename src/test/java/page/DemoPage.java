package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//POM class
//Declaration, Initialization , Utilization

public class DemoPage {
	@FindBy(id="email")
	private WebElement unTB;
	
	public DemoPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	
	}
	public void setUsername(String un)
	{
		unTB.sendKeys(un);
	}
	
	
	
	

}
