package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogOut extends BasePage 
{
	 public LogOut(WebDriver driver)
	    {
	    	super(driver);
	    }
	 
	 @FindBy(xpath="//a[normalize-space()='Logout']")
	 WebElement logout;
	 
	 @FindBy(xpath="//td[@class='reg_success']")
	 WebElement successmsg;
	 
	 public void logout()
	 {
	 logout.click();
	 }
	 public boolean msg()
	 { 
		 try
		 {
		 return(successmsg.isDisplayed());
		 }
		 catch(Exception e)
		 {
			return false;			 
       	 }  
	 }
	 

}