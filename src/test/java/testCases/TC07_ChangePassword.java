package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ChangePassword;
import pageObjects.Login;

public class TC07_ChangePassword extends BaseClass
{
	
	@Test
    public void changepass() throws InterruptedException
    {
		Login lg=new Login(driver);
    	lg.user();
    	Thread.sleep(1000);
    	lg.password();
    	Thread.sleep(1000);
    	lg.submit();
    	Thread.sleep(1000);
    	
    	
    	ChangePassword cp=new ChangePassword(driver);
    	cp.changepass();
    	Thread.sleep(1000);
    	cp.currentpass();
    	Thread.sleep(1000);
    	cp.newpass();
    	Thread.sleep(1000);
    	cp.repass();
    	Thread.sleep(1000);
    	cp.submit();
    	Thread.sleep(1000);
    	boolean a=cp.msg();
    	Assert.assertTrue(a);
}
}