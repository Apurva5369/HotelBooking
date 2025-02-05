package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookedIternary extends BasePage 
{
	 public BookedIternary(WebDriver driver)
	    {
	    	super(driver);
	    }
	 
	 @FindBy(xpath="//a[normalize-space()='Booked Itinerary']")
	 WebElement bookedItinerary;
	 
	 @FindBy(xpath="//table//table//table//td//input[@class='select_text']")
	 WebElement entryid;
	 
	 @FindBy(xpath="(//td[@align='right'])[3]//tr[2]/td[3]")
	 WebElement cancelentry;
	 
	 @FindBy(xpath="//input[@id='order_id_text']")
	 WebElement searchbox;
	 
	 @FindBy(xpath="//input[@id='search_hotel_id']")
	 WebElement go;
	 
	 @FindBy(xpath="//input[@name='ids[]']")
	 WebElement checkbox;
	 
	 @FindBy(xpath="//table//tbody//tr[2]//input[@type='button']")
	 WebElement cancel;
	 
	 public void bookItr()
	 {
		 bookedItinerary.click();
	 }
	 
	 public void entryId() throws InterruptedException
	 {
		String id=entryid.getAttribute("value");
		System.out.println("value is"+id);
		Thread.sleep(3000);
		searchbox.sendKeys(id);
		Thread.sleep(3000);
		go.click();
	 }
	 public void table()
	 {
		/* int size=driver.findElements(By.xpath("(//td[@align='right'])[3]//tr")).size();
		 System.out.println("size is:-"+size);*/	 
		 cancelentry.click();
		 driver.switchTo().alert().accept();
	 }
	
	 public void checkboxclick()
	 {
		 checkbox.click();
	 }
	
	 public void cancelbooking()
	 {
		 cancel.click();
	 }
	 
}
