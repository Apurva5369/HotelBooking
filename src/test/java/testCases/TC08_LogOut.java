package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LogOut;
import pageObjects.Login;

public class TC08_LogOut extends BaseClass
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
    	Thread.sleep(2000);
        }
    	
    	@Test
    	public void log1() throws InterruptedException
        {
    	LogOut lo=new LogOut(driver);
    	lo.logout();
    	boolean a=lo.msg();
    	Assert.assertTrue(a);
        }
    }
