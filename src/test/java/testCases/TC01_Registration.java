package testCases;

import org.testng.annotations.Test;

import pageObjects.Registration;

public class TC01_Registration extends BaseClass
{
	
	@Test
    public void register() throws InterruptedException
    {
    	Registration rg=new Registration(driver);
    	rg.clickforregi();
    	Thread.sleep(2000);
    	rg.adduser(randomString());
    	Thread.sleep(1000);
    	rg.addpassword(randomString());
    	Thread.sleep(1000);
    	rg.addrepassword(randomString());
    	Thread.sleep(1000);
    	rg.addfullname(randomString());
    	Thread.sleep(1000);
    	rg.addemail(randomString()+"@gmail.com");
    	Thread.sleep(1000);
    	String cap=rg.getcaptcha();
    	System.out.println("" +cap);
    	Thread.sleep(2000);
    	rg.clickcheckbox();
    	Thread.sleep(6000);
    	rg.submit();
    	Thread.sleep(2000);
    }
    
    
}
