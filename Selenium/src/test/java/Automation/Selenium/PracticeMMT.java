package Automation.Selenium;



import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.openqa.selenium.JavascriptExecutor;

public class PracticeMMT 
{
	
	public static void main (String[] args) throws InterruptedException, IOException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\anurag.v.singh\\Desktop\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	DesiredCapabilities capabilities=DesiredCapabilities.chrome();
	capabilities.setCapability(FirefoxDriver.PROFILE, true);
	capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,false);
	driver.get("https://www.makemytrip.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	Actions act1=new Actions(driver);
	WebElement a= driver.findElementByXPath("//*[contains(text(),'Armed Forces ')]");
	act1.moveToElement(a).perform();
	act1.contextClick().perform();
	Thread.sleep(3000);
	TakesScreenshot scrShot= ((TakesScreenshot)driver);
	File scrFile=scrShot.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
	File DestFile=new File("C:\\Users\\anurag.v.singh\\Documents\\ISTQB\\Image1.png");
	FileUtils.copyFile(scrFile, DestFile);
	
	//driver.close();
JavascriptExecutor js=(JavascriptExecutor) driver;
String URL=js.executeScript("return document.URL;").toString();
System.out.println(URL);
String Title=js.executeScript("return document.title;").toString();
System.out.println(Title);
js.executeScript("window.scrollBy(0,200)");
js.executeScript("window.location='http://demo.guru99.com/'");
js.executeScript("alert('Welcome');");
Thread.sleep(3000);
driver.navigate().back();
driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);

	
	}
}