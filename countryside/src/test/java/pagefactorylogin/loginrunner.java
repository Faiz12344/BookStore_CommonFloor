package pagefactorylogin;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class loginrunner {
	WebDriver driver = null;
@Test
public void  login() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.commonfloor.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	loginpage l = new loginpage(driver);
	 
	l.loca().click();
	 Thread.sleep(2000);
	Actions a = new Actions(driver);
	a.moveToElement(l.mos()).perform();
	l.log().click();
	l.email().sendKeys("sgtsytuytru");
	 
	l.pass().sendKeys("ieyiuery");
	l.logbutt().click();
	
	WebElement error = l.error();
	Thread.sleep(2000);
	if(error.isDisplayed()==true) 
	{   
	    Assert.assertEquals("Please enter login id",error.getText());
		System.out.println("This error is displayed "+error.getText());
	}
	Thread.sleep(2000);
	
driver.close();
	
}
}
