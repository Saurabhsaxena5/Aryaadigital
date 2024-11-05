package Selinium;

import java.awt.Desktop.Action;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class Testcase {
	@Test
	public void login() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://aaryaadigital.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	
		
		WebElement clickonlogin = driver.findElement(By.xpath("//a[@class=\"logButton\"]"));
		clickonlogin.click();
		
		WebElement enterphoneNumber = driver.findElement(By.xpath("//input[@id=\"mobile\"]"));
		enterphoneNumber.sendKeys("8920689888");
		WebElement clickOTP = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		clickOTP.click();
	    WebElement Otp = driver.findElement(By.xpath("//input[@name=\"otp\"]"));
		Otp.sendKeys("1234");
		
		WebElement submit = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		submit.click();	
		Thread.sleep(2000);
	
		WebElement clickonsearch = driver.findElement(By.xpath("//div[@class=\"search-button\"]"));
		clickonsearch.click();
		
		WebElement Enter = driver.findElement(By.xpath("//div[@class=\"search-container\"]//input[@class=\"search-input visible\"]"));
		Enter.sendKeys("Meri jaan Tiranga");
		Enter.sendKeys(Keys.ENTER);
		
		Actions action=new Actions(driver);
		
		WebElement hover = driver.findElement(By.xpath("//div[@class=\"card movie-card\"]"));
		
		action.moveToElement(hover).perform();
		driver.findElement(By.xpath("//div[@class=\"card movie-card\"]")).click();
		
		
		
		
		
	
		
	}
	
	@Test
	
	public void Loginonoccasor() throws InterruptedException
	{
WebDriver driver=new ChromeDriver();
		
		driver.get("https://phplaravel-1208172-4416911.cloudwaysapps.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement clickonlogin = driver.findElement(By.xpath("//a[text()=\"Login/Sign Up\"]"));
		clickonlogin.click();
		
		WebElement enteremail = driver.findElement(By.xpath("//input[@type=\"email\"]"));
		enteremail.sendKeys("saxenasaurabh596@gmail.com");
		
		WebElement enterpassword = driver.findElement(By.xpath("//input[@type=\"password\"]"));
		enterpassword.sendKeys("Saurabh@123");
		
		
	}
	@Test
	public void searchonanyitem() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://phplaravel-1208172-4416911.cloudwaysapps.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement enterinput = driver.findElement(By.xpath("//input[@type=\"search\"]"));
		enterinput.sendKeys("wwfcs");
		WebElement clcikonsearchbutton = driver.findElement(By.xpath("//button[@class=\"sub-btn\"]"));
		clcikonsearchbutton.click();
	}
	
	@Test
	public void scrolltheHomepage() throws InterruptedException
	{
	WebDriver driver=new ChromeDriver();
		
		driver.get("https://phplaravel-1208172-4416911.cloudwaysapps.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,2000)");
	}
	
		public void checkcityItisclickableorNot() throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://phplaravel-1208172-4416911.cloudwaysapps.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,2000)");
			
			driver.findElement(By.xpath(null))
			
		}
		
	}
	
		
	


