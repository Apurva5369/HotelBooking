package pageObjects;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SearchHotel extends BasePage 
{
	 public SearchHotel(WebDriver driver)
	    {
	    	super(driver);
	    }
	 
	 @FindBy(xpath="//select[@id='location']")
	 WebElement location;	 
	 
	 @FindBy(xpath="//select[@id='hotels']")
	 WebElement hotelname;
	 
	 @FindBy(xpath="//select[@id='room_type']")
	 WebElement roomtype;
	 
	 @FindBy(xpath="//select[@id='room_nos']")
	 WebElement numbofroom;
	 
	 @FindBy(xpath="//input[@id='datepick_in']")
	 WebElement checkindate;
	 
	@FindBy(xpath="//input[@id='datepick_out']")
	 WebElement checkoutdate;
	
	 @FindBy(xpath="//select[@id='adult_room']")
	 WebElement adultinroom;
	
	 @FindBy(xpath="//input[@id='continue']")
	 WebElement cont;
	 
	 @FindBy(xpath="//select[@id='child_room']")
	 WebElement childinroom;
	 
	 @FindBy(xpath="//input[@id='Submit']")
	 WebElement submit1;
	
	 @FindBy(xpath="//input[@id='radiobutton_0']")
	 WebElement radiobut;
	 
	 @FindBy(xpath="//td[@class='login_title']")
	 WebElement selecthoteltitle;
	 
	///////////////////////////////////////////////
	 @FindBy(xpath="//strong[normalize-space()='Select']")
	 WebElement select2;
	 @FindBy(xpath="//strong[normalize-space()='Hotel Name']")
	 WebElement hotelname2;
	 @FindBy(xpath="//strong[normalize-space()='Location']")
	 WebElement location2;
	 @FindBy(xpath="//strong[normalize-space()='Rooms']")
	 WebElement room2;
	 @FindBy(xpath="//strong[normalize-space()='Arrival Date']")
	 WebElement arrivaldate2;
	 @FindBy(xpath="//strong[normalize-space()='Departure Date']")
	 WebElement depdate2;
	 @FindBy(xpath="//strong[normalize-space()='No. of Days']")
	 WebElement days2;
	 @FindBy(xpath="//strong[normalize-space()='Rooms Type']")
	 WebElement roomtype2;
	 @FindBy(xpath="//strong[normalize-space()='Price per Night']")
	 WebElement price2;
	 @FindBy(xpath="//strong[normalize-space()='Total Price (excl. GST)']")
	 WebElement totalprice2;
	

	 public void selectlocation(int location1)
	 {
		 Select dropdown=new Select(location);
		 dropdown.selectByIndex(location1);
	 }
	 
	 public void selecthotel(int hotel)
	 {
		 Select dropdown1=new Select(hotelname);
		 dropdown1.selectByIndex(hotel);
	 }
	 
	 public void typeofroom(int type)
	 {
		 Select dropdown2=new Select(roomtype);
		 dropdown2.selectByIndex(type);
	 }
	 
	 public void numbofroom(int type1)
	 {
		 Select dropdown2=new Select(numbofroom);
		 dropdown2.selectByIndex(type1);
	 }
	 
	 public void checkdate() throws InterruptedException
	 {
		 checkindate.clear();
		 Thread.sleep(1000);
		 checkindate.sendKeys("09/03/2025");
	 }
	 
	 public void checkout() throws InterruptedException
	 {
		 checkoutdate.clear();
		 Thread.sleep(1000);
		 checkoutdate.sendKeys("15/03/2025");
	 }
	 
	 public void adultperroom()
	 {
		 Select dropdown2=new Select(adultinroom);
		 dropdown2.selectByIndex(3);
	 }

	 public void childperroom()
	 {
		 Select dropdown2=new Select(childinroom);
		 dropdown2.selectByVisibleText("1 - One");
	 }
	 
	 public void submit()
	 {
		 submit1.click();
	 }
	 
	 public void continue1()
	 {
		// Actions act=new Actions(driver);
		// act.moveToElement(cont).click().perform();
		cont.click();
	 }
	 
	 public void radiobut()
	 {
		// Actions act=new Actions(driver);
		// act.moveToElement(cont).click().perform();
		radiobut.click();
	 }
	 
	 public boolean selecthotel1()
	 { 
		 try
		 {
		 return(selecthoteltitle.isDisplayed());
		 }
		 catch(Exception e)
		 {
			return false;			 
       	 }  
	 }
	 public void switching()
		{
			String parent=driver.getWindowHandle();
	        Set<String> a=driver.getWindowHandles();
	        for(String b:a)
	           {
		        if(!b.equals(parent))
		        driver.switchTo().window(b); 
	           }
		       String titlechild=driver.getTitle();
		       System.out.println(titlechild);
		}
	 
	 public boolean select2()
	 { 
		 try
		 {
		 return(select2.isDisplayed());
		 }
		 catch(Exception e)
		 {
			return false;			 
       	 }  
	 }
	 
	 public boolean hotelname2()
	 { 
		 try
		 {
		 return(hotelname2.isDisplayed());
		 }
		 catch(Exception e)
		 {
			return false;			 
       	 }  
	 }

	 public boolean location2()
	 { 
		 try
		 {
		 return(location2.isDisplayed());
		 }
		 catch(Exception e)
		 {
			return false;			 
       	 }  
	 }
	 
	 public boolean room2()
	 { 
		 try
		 {
		 return(room2.isDisplayed());
		 }
		 catch(Exception e)
		 {
			return false;			 
       	 }  
	 }
	 
	 public boolean arrivaldate2()
	 { 
		 try
		 {
		 return(arrivaldate2.isDisplayed());
		 }
		 catch(Exception e)
		 {
			return false;			 
       	 }  
	 }
	 
	 
	 public boolean depdate2()
	 { 
		 try
		 {
		 return(depdate2.isDisplayed());
		 }
		 catch(Exception e)
		 {
			return false;			 
       	 }  
	 }
	 
	 public boolean days2()
	 { 
		 try
		 {
		 return(days2.isDisplayed());
		 }
		 catch(Exception e)
		 {
			return false;			 
       	 }  
	 }
	 
	 
	 public boolean roomtype2()
	 { 
		 try
		 {
		 return(roomtype2.isDisplayed());
		 }
		 catch(Exception e)
		 {
			return false;			 
       	 }  
	 }
	 
	 public boolean price2()
	 { 
		 try
		 {
		 return(price2.isDisplayed());
		 }
		 catch(Exception e)
		 {
			return false;			 
       	 }  
	 }
	 
	 
	 public boolean totalprice2()
	 { 
		 try
		 {
		 return(totalprice2.isDisplayed());
		 }
		 catch(Exception e)
		 {
			return false;			 
       	 }  
	 }
}
