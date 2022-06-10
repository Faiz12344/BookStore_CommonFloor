package LoginSuccess;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSuccessStepDef {
//	/	WebDriver driver;
	WebDriver driver = null;
	@Before public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\FAIZANAS\\Desktop\\CommonFloor\\countryside\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		}
	
	@Given("Selecting city")
	public void selecting_city() throws InterruptedException {
		 driver.get("https://www.commonfloor.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.findElement(By.xpath("//ul[@class='cityselectlist clearfix']//li[@role='option'][contains(text(),'Bangalore')]")).click();
		  Thread.sleep(2000);
	}

	@Given("clicking on the Login to your account")
	public void clicking_on_the_login_to_your_account() {
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//*[@class='usricon']"))).perform();
		//*[@id="login-details"]/ul/li[1]/a
		 driver.findElement(By.xpath("//*[@id=\"login-details\"]/ul/li[1]/a")).click();
	}
	@When("user enters the vaild emailId and password")
	public void user_enters_the_vaild_email_id_and_password() throws InterruptedException {
		driver.findElement(By.id("login-email-id")).sendKeys("9347745883");
		driver.findElement(By.id("login-password-id")).sendKeys("Shahena@211");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/input")).click();
	}

	@Then("user should be login successfully")
	public void user_should_be_login_successfully() {
	    
	}
}


