package mavenpractice1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mavenclass {
	
	WebDriver driver;
	
	@BeforeTest
	public void mavenclasss()
{
	WebDriverManager.chromedriver().setup();
	driver =new  ChromeDriver();
	driver.get("https://demoqa.com/text-box");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	@Test
	public void attestmet() 
	{
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("avinsh");
		//driver.switchTo().alert().accept();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		driver.findElement(By.xpath("//*[@id='submit']")).click();
		
	}
	
	
    @AfterTest
    public void aftermethod()
    {
	
     }
    
}
