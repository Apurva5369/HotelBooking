package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.BookedIternary;
import pageObjects.Login;

public class TC06_BookedIternary extends BaseClass
{

	@Test
    public void iternary() throws InterruptedException
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
    	
    	BookedIternary bi=new BookedIternary(driver);
    	bi.bookItr();
    	bi.entryId();
    	Thread.sleep(2000);
    	bi.table();
    	Thread.sleep(2000);
    	bi.checkboxclick();
    	Thread.sleep(3000);
}

	
}