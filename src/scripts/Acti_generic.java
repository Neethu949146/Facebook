package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import generic.Auto_const;
import generic.Generic_Screenshot;
import generic.Property123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Acti_generic implements Auto_const
{
	public WebDriver driver;
	@BeforeMethod
	public void opn() throws FileNotFoundException, IOException
	{
		System.setProperty(Gecko_Key,Gecko_value );
		driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		Property123 p=new Property123();
		long i = p.get123();
		driver.manage().timeouts().implicitlyWait(i, TimeUnit.SECONDS);
		
	}
	@AfterMethod
	public void close(ITestResult res) throws IOException
	{
		int i = res.getStatus();
		if(i==2)
		{
			Generic_Screenshot.getphoto(driver);
		}
		driver.quit();
	}

}
