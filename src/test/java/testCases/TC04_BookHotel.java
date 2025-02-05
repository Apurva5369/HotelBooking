package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.BookHotel;
import pageObjects.Login;
import pageObjects.SearchHotel;

public class TC04_BookHotel extends BaseClass
{

	@Test
    public void book() throws InterruptedException
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
    	
    	SearchHotel search=new SearchHotel(driver);
    	search.selectlocation(randomcardtype());
    	Thread.sleep(1000);
    	search.selecthotel(randomcardtype());
    	Thread.sleep(1000);
    	search.numbofroom(randomcardtype());
    	Thread.sleep(1000);
    	search.typeofroom(randomcardtype());
    	Thread.sleep(1000);
    	search.checkdate();
    	Thread.sleep(1000);
    	search.checkout();
    	Thread.sleep(1000);
    	search.adultperroom();
    	Thread.sleep(1000);
    	search.childperroom();
    	Thread.sleep(1000);
    	search.submit();
    	Thread.sleep(1000);
    	search.switching();
    	Thread.sleep(1000);
    	search.radiobut();
    	Thread.sleep(1000);
    	search.continue1();
    	Thread.sleep(1000);
    	search.switching();
    	Thread.sleep(1000);
    	
    	BookHotel bk=new BookHotel(driver);
    	bk.firstname(randomString());
    	Thread.sleep(1000);
    	bk.lastname(randomString());
    	Thread.sleep(1000);
    	bk.address(randomString()+" "+randomString()+" "+randomString()+" ");
    	Thread.sleep(1000);
    	bk.ccnum(randomnum()+randomnum());
    	Thread.sleep(1000);
    	bk.typeofcard(randomcardtype());
    	Thread.sleep(1000);
    	bk.expmonth(random());
    	bk.expyear(random());
    	Thread.sleep(1000);
    	bk.cvv(randomcvv());
    	Thread.sleep(2000);
    	bk.book();
    	Thread.sleep(2000);
    	boolean conf=bk.logo1();
    	Assert.assertTrue(conf);
    }
}
