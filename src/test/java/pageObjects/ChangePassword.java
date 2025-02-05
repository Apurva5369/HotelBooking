package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChangePassword extends BasePage 
{
	 public ChangePassword(WebDriver driver)
	    {
	    	super(driver);
	    }
	 
	 @FindBy(xpath="//a[normalize-space()='Change Password']")
	 WebElement changepass;	
	 
	 @FindBy(xpath="//input[@id='current_pass']")
	 WebElement currentpass;	
	 
	 @FindBy(xpath="//input[@id='new_password']")
	 WebElement newpass;	
	 
	 @FindBy(xpath="//input[@id='re_password']")
	 WebElement repass;
	 
	 @FindBy(xpath="//table//strong//span[@class='reg_error']")
	 WebElement successmsg;
	 
	 @FindBy(xpath="//input[@id='Submit']")
	 WebElement submit;
	
	 
	 public void changepass()
	 {
		 changepass.click();
	 }
	 
	 public void currentpass()
	 {
		 currentpass.sendKeys("Apurva@5");
	 }
	 
	 public void newpass()
	 {
		 newpass.sendKeys("Apurva@5");
	 }
	 
	 public void repass()
	 {
		 repass.sendKeys("Apurva@5");
	 }
	 
	 public void submit()
	 {
		submit.click();
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
