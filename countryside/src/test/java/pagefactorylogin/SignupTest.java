package pagefactorylogin;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignupTest {
	WebDriver driver;

	@BeforeTest
	public void openbrowser() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();		
	}

	@Test
	public void SignupTest() throws InterruptedException {
		driver.get("https://www.commonfloor.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		signuppage s = new signuppage(driver);
		s.mystate().click();
		Thread.sleep(3000);
		Actions a = new Actions(driver);
		a.moveToElement(s.howermousce()).perform();
		s.signup().click();
		s.login().sendKeys("jfsf");
		s.email().sendKeys("Shaahi4mail@gmail.com");
		s.mobile().sendKeys(" 9347745883 ");
		s.password().sendKeys("86879879");
		s.entercity().sendKeys("86879879");
		s.owner().click();
		s.buttonsignup().click();
		WebElement error = s.errormessage();
		if(error.isDisplayed()==true) 
		{   
			Assert.assertEquals("Please enter a valid phone number",error.getText());
			System.out.println("This error is displayed "+error.getText());
		}
	}
}
