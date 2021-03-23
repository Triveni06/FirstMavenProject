package com;
import java.util.concurrent.TimeUnit;



//verbose means kind of output we are getting in the console and its can be given
//from 1 to 10 when increases the number it gives more information about test execution 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FBTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void initialization()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	@Test
	public void FBTitleTest()
	{
		String title=driver.findElement(By.xpath("//button[@name='login']")).getText();
	System.out.println(title);
	Assert.assertEquals(title, "Log In");
	}
	

}
