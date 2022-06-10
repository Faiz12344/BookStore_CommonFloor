package SignUp;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpStepDef {
	WebDriver driver = null;
	@Before public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\FAIZANAS\\Desktop\\CommonFloor\\countryside\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
		
	@Given("User launches")
	public void user_launches() throws InterruptedException {
		  driver.get("https://www.commonfloor.com/");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  driver.findElement(By.xpath("//ul[@class='cityselectlist clearfix']//li[@role='option'][contains(text(),'Bangalore')]")).click();
		  Thread.sleep(2000);
		  
	}

	@When("User clicks Sign up as Individual")
	public void user_clicks_sign_up_as_individual() throws InterruptedException {
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//*[@class='usricon']"))).perform();
		//Thread.sleep(2000);
		driver.findElement(By.xpath(("//a[contains(text(),'Sign up as individual')]"))).click();
		
	}

	@And("User entering the  data valid")
	public void user_entering_the_data_valid(DataTable sign) {
		List<List<String>> data = sign.cells();
		driver.findElement(By.xpath("//input[@id='login-name-id']")).sendKeys(data.get(0).get(0));
		driver.findElement(By.xpath("//input[@id='login-email-id']")).sendKeys(data.get(0).get(1));
		driver.findElement(By.xpath("//input[@id='login-mobile-id']")).sendKeys(data.get(0).get(2));
		driver.findElement(By.xpath("//input[@id='login-password-id']")).sendKeys(data.get(0).get(4));
		driver.findElement(By.xpath("//input[@id='signup-city']")).sendKeys(data.get(0).get(3));
		driver.findElement(By.xpath("//label[contains(text(),'Owner')]")).click();
	}

	@When("User clicks SignUp")
	public void user_clicks_sign_up() {
		driver.findElement(By.xpath("//input[@id='signupbutton']")).click();
	}

	@Then("User account should be created successfully")
	public void user_account_should_be_created_successfully() throws InterruptedException {
//		WebElement error = driver.findElement(By.id("error-msg-login"));
//		Thread.sleep(2000);
//		if(error.isDisplayed()==true) 
//		{   
//		    Assert.assertEquals("This mobile is already registered with us.",error.getText());
//			System.out.println("This error is displayed "+error.getText());
//		}
//		Thread.sleep(2000);
//	   driver.close();
		String expectedMessage = "User registration successful. Verify mobile to login.";
		String actualMessage = driver.findElement(By.xpath("//div[@id='success-msg-login']")).getText();


		if (actualMessage.contains(expectedMessage)) {
			System.out.println("if part");

			System.out.println("create account functionality successfully done");
		} else {
			System.out.println("else part");
			System.out.println("create account functionality successfully NOT done");
		
		}

		Assert.assertEquals(expectedMessage,actualMessage);
		Assert.assertEquals("",expectedMessage,actualMessage);
		Thread.sleep(2000);
		   driver.close();
	}
}


