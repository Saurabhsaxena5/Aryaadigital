package Selinium;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AaryaDigital {
	WebDriver driver;
	
	@Test
	public void login() throws InterruptedException {
		Webdriver driver=new ChromeDriver();
		
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
		}
	

		   @Test
			public void profile() throws InterruptedException {
			 
		    WebElement clickonprofile = driver.findElement(By.xpath(""));
		    
		    clickonprofile.click();
		    }
		   
		   
		   @Test
		   public void url() throws InterruptedException {
				 
			   @Nullable
			String url1 = driver.getCurrentUrl();
			   Thread.sleep(2000);
			   System.out.println("The url of the page source is:"+url1);
			   }
		   
		  
		   @Test
		   public void subscription() throws InterruptedException
		   {
			   WebElement clickonsubscription = driver.findElement(By.xpath("//img[@class=\"subscription-logo\"]"));
			   Thread.sleep(2000);
				clickonsubscription.click();
				if(clickonsubscription.isDisplayed()) {
					System.out.println("yes");
				}
				else
				{
					System.out.println("No");
				}
				
				
		   }
		   
		   @Test
		   public void searchvideo() throws InterruptedException {
		   WebElement clickonsearch = driver.findElement(By.xpath("//div[@class=\"search-button\"]"));
			clickonsearch.click();
			
			Thread.sleep(2000);
			
			WebElement Enter = driver.findElement(By.xpath("//div[@class=\"search-container\"]//input[@class=\"search-input visible\"]"));
			Enter.sendKeys("Meri jaan Tiranga");
			Thread.sleep(2000);
			Enter.sendKeys(Keys.ENTER);
		   }
		   
		   
		   
		  
}



