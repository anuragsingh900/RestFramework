package Automation.Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentDay17 
{
	ChromeDriver driver;
	@Before
	public void BrowserLaunch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anurag.v.singh\\Desktop\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Assert.assertTrue("page title does not match",driver.getTitle().equals("Facebook – log in or sign up"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	
	public void CreateAnAccountFacebook() throws InterruptedException 
	{
	
		WebElement CreateNewAccount=driver.findElementByLinkText("Create New Account");
		CreateNewAccount.click();
		Thread.sleep(5000);
		WebElement Firstname=driver.findElementByName("firstname");
		Firstname.isDisplayed();
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(Firstname));
		String sq=Firstname.getText();
		Firstname.sendKeys("Anurag");
		String z=Firstname.getAttribute("value");
		if(z.contains("Anurag"))
		{
			System.out.println("Pass");
		}
		System.out.println(sq);
		WebElement Surname=driver.findElementByName("lastname");
		Surname.isEnabled();
		Surname.sendKeys("Singh");
		WebElement Mobile=driver.findElementByName("reg_email__");
		Mobile.sendKeys("989622");
		WebElement Password=driver.findElementById("password_step_input");
		Password.sendKeys("Password123");
		WebElement GenderFemale=driver.findElementByCssSelector("input[value='1']");
		GenderFemale.click();
		GenderFemale.isSelected();
		String a= GenderFemale.getCssValue("font-colour");
		System.out.println(a);
		WebElement GenderMale=driver.findElementByCssSelector("input[value='2']");
		GenderMale.click();
		WebElement Day=driver.findElementByCssSelector("select#day");
		List Day1 =driver.findElementsByCssSelector("select#day");
		int listsize=Day1.size();
		for (int i=0;i<listsize;i++)
		{
			System.out.println(driver.findElementByName("birthday_day").getText());
		}
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
