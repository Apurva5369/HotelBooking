package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registration extends BasePage
{
    public Registration(WebDriver driver)
    {
    	super(driver);
    }


@FindBy(xpath="//a[normalize-space()='New User Register Here']")
WebElement clickforregis;

@FindBy(xpath="//input[@id='username']")
WebElement username;

@FindBy(xpath="//input[@id='password']")
WebElement password;

@FindBy(xpath="//input[@id='re_password']")
WebElement repassword;

@FindBy(xpath="//input[@id='full_name']")
WebElement fullname;

@FindBy(xpath="//input[@id='email_add']")
WebElement email;

@FindBy(xpath="//img[@id='captcha']")
WebElement captcha;

@FindBy(xpath="//input[@id='captcha-form']")
WebElement captchatext;

@FindBy(xpath="//input[@id='tnc_box']")
WebElement clickcheck;

@FindBy(xpath="//input[@id='Submit']")
WebElement submit;

public void clickforregi()
{
	clickforregis.click();
}

public void adduser(String username1)
{
	username.sendKeys(username1);
}

public void addpassword(String password1)
{
	password.sendKeys(password1);
}

public void addrepassword(String password1)
{
	repassword.sendKeys(password1);
}

public void addfullname(String fullname1)
{
	fullname.sendKeys(fullname1);
}

public void addemail(String email1)
{
	email.sendKeys(email1);
}


public String getcaptcha()
{
    String captcha1=captcha.getText();
    return captcha1;
}


public void clickcheckbox()
{
    clickcheck.click();
}


public void submit()
{
    submit.click();
}



}