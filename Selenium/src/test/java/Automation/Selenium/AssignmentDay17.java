package Automation.Selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentDay17 
{
	ChromeDriver driver;
	@Before
	public void BrowserLaunch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anurag.v.singh\\Desktop\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void CreateAnAccountFacebook() throws InterruptedException 
	{
	
		WebElement CreateNewAccount=driver.findElementByLinkText("Create New Account");
		CreateNewAccount.click();
		Thread.sleep(5000);
		WebElement Firstname=driver.findElementByName("firstname");
		Firstname.sendKeys("Anurag");
		WebElement Surname=driver.findElementByName("lastname");
		Surname.sendKeys("Singh");
		WebElement Mobile=driver.findElementByName("reg_email__");
		Mobile.sendKeys("989622");
		WebElement Password=driver.findElementById("password_step_input");
		Password.sendKeys("Password123");
		WebElement GenderFemale=driver.findElementByCssSelector("input[value='1']");
		GenderFemale.click();
		WebElement GenderMale=driver.findElementByCssSelector("input[value='2']");
		GenderMale.click();
		WebElement Day=driver.findElementByCssSelector("select#day");
		Select s=new Select(Day);
		s.selectByVisibleText("12");
		WebElement Month=driver.findElementByName("birthday_month");
		Select s1=new Select(Month);
		s1.selectByIndex(3);
		WebElement Year=driver.findElementByCssSelector("select[title='Year']");
		Select s2=new Select(Year);
		s2.selectByValue("2000");
		WebElement SignUp=driver.findElementByName("websubmit");
		SignUp.click();
	}
	
	@After
	public void BrowserClose()
	{
		driver.close();
	}
	
}
