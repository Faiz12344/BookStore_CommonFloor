package countryside;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdeflogin {
	WebDriver driver = null;
	@Before public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\FAIZANAS\\Desktop\\CommonFloor\\countryside\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		}
	@Given("user should navigated to countries page")
	public void user_should_navigated_to_countries_page() throws InterruptedException { 
		  driver.get("https://www.commonfloor.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.findElement(By.xpath("//ul[@class='cityselectlist clearfix']//li[@role='option'][contains(text(),'Bangalore')]")).click();
		  Thread.sleep(2000);
	}

	@And("user clicks on the Login to your account")
	public void user_clicks_on_the_login_to_your_account() {
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//*[@class='usricon']"))).perform();
		//*[@id="login-details"]/ul/li[1]/a
		 driver.findElement(By.xpath("//*[@id=\"login-details\"]/ul/li[1]/a")).click();
	}

	/*@When("user enters the emailId and password")
	public void user_enters_the_email_id_and_password() throws InterruptedException {
		driver.findElement(By.id("login-email-id")).sendKeys("hgertiurwaeh");
		driver.findElement(By.id("login-password-id")).sendKeys("dzh");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/input")).click();
	}*/

	//span[.='Please enter login id']
	@When("user enters the invaild emailId and password")
	public void user_enters_the_invaild_email_id_and_password() throws InterruptedException {
		driver.findElement(By.id("login-email-id")).sendKeys("hgertiurwaeh");
		driver.findElement(By.id("login-password-id")).sendKeys("dzhyuiktdui");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/input")).click();
	}

	@Then("error should be displayed")
	public void error_should_be_displayed() throws InterruptedException {
		WebElement error = driver.findElement(By.xpath("//span[.='Please enter login id']"));
		
		Thread.sleep(2000);
		if(error.isDisplayed()==true) 
		{   
		    Assert.assertEquals("Please enter login id",error.getText());
			System.out.println("This error is displayed "+error.getText());
		}
		Thread.sleep(2000);
		
	driver.close();

}}
