package pagefactorylogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	@FindBy(xpath = "//ul[@class='cityselectlist clearfix']//li[@role='option'][contains(text(),'Bangalore')]")
	private WebElement loca;
	@FindBy(xpath = "//header/div[1]/div[1]/div[3]/div[1]/div[2]/a[1]/*[1]")
	private WebElement mos;
	@FindBy(partialLinkText  = "Log in to your account")
	private WebElement log;
	@FindBy(id = "login-email-id")
	private WebElement email;
	@FindBy(id = "login-password-id")
	private WebElement pass;
	@FindBy(xpath = "//body/div[@id='NewLoginModal']/div[1]/div[1]/div[2]/div[3]/form[1]/input[1]")
	private WebElement logbutt;
	@FindBy(xpath = "//span[.='Please enter login id']")
	private WebElement errr;

	public loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
	public WebElement loca() {

		return loca;

	}
	public WebElement mos() {

		return mos;

	}
	public WebElement log() {

		return log;

	}
	public WebElement email() {

		return email;

	}
	public WebElement pass() {

		return pass;

	}
	public WebElement logbutt() {

		return logbutt;

	}
	public WebElement error() {

		return errr;

	}

}

