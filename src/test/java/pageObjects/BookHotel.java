package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class BookHotel  extends BasePage 
{
	 public BookHotel(WebDriver driver)
	    {
	    	super(driver);
	    }
	 
	 @FindBy(xpath="//input[@id='first_name']")
	 WebElement firstname;	 
	 
	 @FindBy(xpath="//input[@id='last_name']")
	 WebElement lastname;
	 
	 @FindBy(xpath="//textarea[@id='address']")
	 WebElement address;
	 
	 @FindBy(xpath="//select[@id='room_nos']")
	 WebElement numbofroom;
	 
	 @FindBy(xpath="//input[@id='cc_num']")
	 WebElement ccnum;
	 
	 @FindBy(xpath="//select[@id='cc_type']")
	 WebElement cardtype;
	 
	 @FindBy(xpath="//select[@id='cc_exp_month']")
	 WebElement expmonth;
	 
	 @FindBy(xpath="//select[@id='cc_exp_year']")
	 WebElement expyear;
	
	 @FindBy(xpath="//input[@id='cc_cvv']")
	 WebElement cvv;
	
	 @FindBy(xpath="//input[@id='book_now']")
	 WebElement book;
	 
	 @FindBy(xpath="//td[@class='login_title']")
	 WebElement bookingconf;
	
	 
	 public void firstname(String fname)
	 {
		 firstname.sendKeys(fname);
	 }
	 
	 public void lastname(String lname)
	 {
		 lastname.sendKeys(lname);
	 }
	 
	 public void address(String addr)
	 {
		 address.sendKeys(addr);
	 }
	 
	 public void noofroom(String addr)
	 {
		 numbofroom.sendKeys(addr);
	 }
	 
	 public void ccnum(String cnum)
	 {
		 ccnum.sendKeys(cnum);
	 }
	
	 public void typeofcard(int b)
	 {
		 Select dropdown2=new Select(cardtype);
		 dropdown2.selectByIndex(b);
	 }
	 
	 public void expmonth(int a)
	 {
		 Select dropdown2=new Select(expmonth);
		 dropdown2.selectByIndex(a);
	 }
	 
	 public void expyear(int a)
	 {
		 Select dropdown2=new Select(expyear);
		 dropdown2.selectByIndex(a);
	 }
	 
	 public void cvv(String cnum)
	 {
		 cvv.sendKeys(cnum);
	 }
	 
	 public void book()
	 {
		 book.click();
	 }
	 
	 
	 
	 public void datepicker()
	 {
		 String month="May";
			String year="2026";
			String date="22";
			
			driver.findElement(By.xpath("//input[@id='datepicker']")).click();
			
			while(true)
			{
				String currentmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
				
				String currentyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
				if(currentmonth.equals(month) && currentyear.equals(year))
				{
					break;
				}
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}		
			
				//select dates
				
				List<WebElement> allelement =driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
				
				for(WebElement e:allelement)
				{
					if(e.getText().equals(date))
					{
						e.click();
						break;
					}
				}
	 }
	 public boolean logo1()
	 { 
		 try
		 {
		 return(bookingconf.isDisplayed());
		 }
		 catch(Exception e)
		 {
			return false;			 
       	 }  
	 }
	 
}
