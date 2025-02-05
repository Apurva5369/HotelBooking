package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends BasePage 
{
	 public Login(WebDriver driver)
	    {
	    	super(driver);
	    }
	 
	 @FindBy(xpath="//input[@id='username']")
	 WebElement username;	 
	 
	 @FindBy(xpath="//input[@id='password']")
	 WebElement password;
	
	 @FindBy(xpath="//input[@id='login']")
	 WebElement submit;
	 
	 @FindBy(xpath="//img[@alt='Adactin Group']")
	 WebElement logo;
	
	 
	 public void user()
	 {
		 username.sendKeys("AgastyaGadakh");
	 }
	
	 public void password()
	 {
		 password.sendKeys("Apurva@5");
	 }
	 
	 public void submit()
	 {
		 submit.click();
	 }
	 
	 public boolean logo1()
	 { 
		 try
		 {
		 return(logo.isDisplayed());
		 }
		 catch(Exception e)
		 {
			return false;			 
       	 }  
	 }
}
