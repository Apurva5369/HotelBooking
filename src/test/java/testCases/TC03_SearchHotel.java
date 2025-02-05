package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Login;
import pageObjects.SearchHotel;

public class TC03_SearchHotel extends BaseClass
{
	
	@Test
    public void search() throws InterruptedException
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
    	Thread.sleep(2000);
    	search.switching();
    	Thread.sleep(1000);
    	
    	boolean pagechange=search.selecthotel1();
    	Assert.assertTrue(pagechange);
    	
    	
    	boolean field1=search.select2();
    	Assert.assertTrue(field1);
    	
    	boolean field2=search.hotelname2();
    	Assert.assertTrue(field2);
    	
    	boolean field3=search.location2();
    	Assert.assertTrue(field3);
    	
    	boolean field4=search.room2();
    	Assert.assertTrue(field4);
    	
    	boolean field5=search.arrivaldate2();
    	Assert.assertTrue(field5);
    	
    	boolean field6=search.depdate2();
    	Assert.assertTrue(field6);
    	
    	boolean field7=search.days2();
    	Assert.assertTrue(field7);
    	
    	boolean field8=search.roomtype2();
    	Assert.assertTrue(field8);
    	

    	boolean field9=search.price2();
    	Assert.assertTrue(field9);
    	
    	boolean field10=search.totalprice2();
    	Assert.assertTrue(field10);
    	
    	search.radiobut();
    	Thread.sleep(2000);
    	search.continue1();
    	Thread.sleep(2000);
    	search.switching();
    	Thread.sleep(2000);
    	
}
}