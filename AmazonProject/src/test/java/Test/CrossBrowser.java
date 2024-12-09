package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser 
{
	WebDriver driver;
@BeforeMethod
@Parameters("browser")
public void openBrowser(String browser)
{
	switch(browser.toLowerCase())
	{
	case "chrome":
	driver=new ChromeDriver();
	break;
	case "edge":
		driver=new EdgeDriver();
		break;
	case "firefox":
		driver=new FirefoxDriver();
		break;
		default: driver=null;
		break;
	}
	 driver=new ChromeDriver();
}
@Test
public void VerifyTitle()
{
	driver.get("https://www.google.co.in/");
	String exTitle="Google";
	String acTitle=driver.getTitle();
	Assert.assertEquals(acTitle,exTitle);
}
@AfterMethod
public void close()
{
	driver.close();
}

}
