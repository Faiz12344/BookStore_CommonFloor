package pagefactorylogin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class signuppage {
	@FindBy(xpath = "//ul[@class='cityselectlist clearfix']//li[@role='option'][contains(text(),'Bangalore')]")
	private WebElement state;
	@FindBy(xpath = "//*[@class='usricon']")
	private WebElement mouscehower;
	@FindBy(xpath = "//a[contains(text(),'Sign up as individual')]")
	private WebElement signupclick;
	@FindBy(xpath = "//input[@id='login-name-id']")
	private WebElement loginname;
	@FindBy(xpath = "//input[@id='login-email-id']")
	private WebElement loginemail;
	@FindBy(xpath = "//input[@id='login-mobile-id']")
	private WebElement loginmobile;
	@FindBy(xpath = "//input[@id='login-password-id']")
	private WebElement loginpassword;
	@FindBy(xpath = "//input[@id='signup-city']")
	private WebElement city;
	@FindBy(xpath = "//label[contains(text(),'Owner')]")
	private WebElement radioowner;
	@FindBy(xpath = "//input[@id='signupbutton']")
	private WebElement signup;
	@FindBy(xpath = "//*[@id=\"loginForm\"]/div[3]/span")
	private WebElement errormsg;
	
	public signuppage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	public WebElement mystate() {
		return state;
	}
	
	public WebElement howermousce() {
		return mouscehower;
	}
	
	public WebElement signup() {
		return  signupclick;
	}
	
	public WebElement login() {
		return loginname;
	}
	
	public WebElement email() {
		return loginemail;
	}
	
	public WebElement mobile() {
		return loginmobile;
	}
	
	public WebElement password() {
		return loginpassword;
	}
	
	public WebElement entercity() {
		return city;
	}
	
	public WebElement owner() {
		return radioowner;
	}
	
	public WebElement buttonsignup() {
		return signup;
	}
	
	public WebElement errormessage() {
		return errormsg;
	}
}
