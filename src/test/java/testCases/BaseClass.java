package testCases;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseClass 
{
	public WebDriver driver;
@BeforeClass
	public void setup() throws InterruptedException
	{
		
		
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}

@AfterClass
    public void tearDown()
    {
	driver.quit();
	}


public String randomString()
{
	String ranstring1 =RandomStringUtils.randomAlphabetic(8);
	return ranstring1;
}


public String randomnum()
{
	String ranstring2 =RandomStringUtils.randomNumeric(8);
	return ranstring2;
}

public String randomcvv()
{
	String ranstring2 =RandomStringUtils.randomNumeric(3);
	return ranstring2;
}

public int random()
{
	Random rand=new Random();
	int ranint=rand.nextInt(7);
	return ranint+1;
}
public int randomcardtype()
{
	Random rand=new Random();
	int ranint=rand.nextInt(3);
	return ranint+1;
}
public String captureScreen(String tname) throws IOException
	{
		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		
		String targetFilePath=System.getProperty("user.dir")+"\\screenshots\\" + tname + "_"+ timeStamp + ".png";
		File targetFile=new File(targetFilePath);
		
		sourceFile.renameTo(targetFile);
		
		return targetFilePath;
		
	}
}

