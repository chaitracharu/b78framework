package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class EnterTimeTrack {
	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	
	public EnterTimeTrack(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public boolean verifyHomePageIsDisplayed(WebDriverWait wait)
	{
		try
		{
			wait.until(ExpectedConditions.visibilityOf(logoutLink));
			Reporter.log("Home Page is diplayed",true);
			return true;
		}
		catch(Exception e)
		{
			Reporter.log("Home Page is NOT-diplayed",true);
			return false;
		}
	}
	

}
