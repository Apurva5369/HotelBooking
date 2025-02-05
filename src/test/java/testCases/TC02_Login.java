package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Login;
import pageObjects.Registration;

public class TC02_Login extends BaseClass 
{

	@Test
    public void log() throws InterruptedException
    {
    	Login lg=new Login(driver);
    	lg.user();
    	Thread.sleep(1000);
    	lg.password();
    	Thread.sleep(1000);
    	lg.submit();
    	Thread.sleep(1000);
    	boolean targetpage=lg.logo1();
    	Assert.assertTrue(targetpage);
}
}