package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookingConfirmation  extends BasePage 
{
	 public BookingConfirmation(WebDriver driver)
	    {
	    	super(driver);
	    }
	 
	 @FindBy(id="hotel_name")
	 WebElement hotelname;	
	 
	 @FindBy(id="location")
	 WebElement location;	
	 
	 @FindBy(id="room_type")
	 WebElement room_type;	
	 
	 @FindBy(id="arrival_date")
	 WebElement arrival_date;	
	 
	 @FindBy(id="departure_text")
	 WebElement departure_text;	
	 
	 @FindBy(id="total_rooms")
	 WebElement total_rooms;	
	 
	 @FindBy(id="adults_room")
	 WebElement adults_room;	
	 
	 @FindBy(id="price_night")
	 WebElement price_night;	
	 
	 @FindBy(id="total_price")
	 WebElement total_price;	
	 
	 @FindBy(id="gst")
	 WebElement gst;	
	 
	 @FindBy(id="final_price")
	 WebElement final_price;	
	 
	 @FindBy(id="first_name")
	 WebElement first_name;	
	 
	 
	 @FindBy(id="last_name")
	 WebElement last_name;	
	 
	 @FindBy(id="address")
	 WebElement address;	
	 
	 @FindBy(id="order_no")
	 WebElement order_no;
	 
	 public boolean fields()
	 { 
		 try
		 {
		 return(order_no.isDisplayed()&&address.isDisplayed()&&last_name.isDisplayed());
		 }
		 catch(Exception e)
		 {
			return false;			 
       	 }  
	 }
	 
	 public boolean fields1()
	 { 
		 try
		 {
		 return(first_name.isDisplayed()&&final_price.isDisplayed()&&gst.isDisplayed());
		 }
		 catch(Exception e)
		 {
			return false;			 
       	 }  
	 }
	 
	 public boolean fields2()
	 { 
		 try
		 {
		 return(total_price.isDisplayed()&&price_night.isDisplayed()&&adults_room.isDisplayed());
		 }
		 catch(Exception e)
		 {
			return false;			 
       	 }  
	 }
	 
	 public boolean fields3()
	 { 
		 try
		 {
		 return(total_rooms.isDisplayed()&&departure_text.isDisplayed()&&arrival_date.isDisplayed());
		 }
		 catch(Exception e)
		 {
			return false;			 
       	 }  
	 }
	 
	/* public boolean fields4()
	 { 
		 try
		 {
		 return(hotelname.isDisplayed()&&location.isDisplayed()&&room_type.isDisplayed());
		 }
		 catch(Exception e)
		 {
			return false;			 
       	 }  
	 }*/
}
