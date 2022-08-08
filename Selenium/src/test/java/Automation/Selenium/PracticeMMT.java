package Automation.Selenium;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

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
	}
}