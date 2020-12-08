package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {
	WebDriver driver;
	//Constructor of the LoginPage class
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//Declaring the WebElements using @FindBy
	@FindBy(xpath="//*[@id='headerComp']/div/div[2]/div[2]/div[2]")
	WebElement loginSignupButton;
	
	@FindBy(xpath="/html/body/ngb-modal-window/div/div/app-login-modal/div/div[1]/div/div[2]/div")
	WebElement loginViaPassword;
	
	@FindBy(xpath="/html/body/ngb-modal-window/div/div/app-login-modal/div/div[2]/form/div/div[1]/input")
	WebElement mobileNo;
	
	@FindBy(xpath="//*[@id='password']")
	WebElement password;
	
	@FindBy(xpath="/html/body/ngb-modal-window/div/div/app-login-modal/div/div[2]/form/div/div[4]/div[3]/button")
	WebElement loginButton;
	
	@FindBy(xpath="/html/body/ngb-modal-window/div/div/app-login-modal/div/div[2]/form/div/div[2]/label")
	WebElement invalidUserPassMessage;
	
	@FindBy(xpath="//*[@id='headerComp']/div/div[2]/div[2]/div[3]")
	WebElement myAccount;
	//Clicking on LoginSignUp Button
	public void clickLoginSignup()
	{
		loginSignupButton.click();
	}
	//Clicking on LoginViaPassword Button
	public void clickLoginViaPassword()
	{
		loginViaPassword.click();
	}
	//Entering the Mobile Number
	public void enterMobileNo(String mbno)
	{
		mobileNo.sendKeys(mbno);
	}
	//Entering the Password
	public void enterPassword(String pass)
	{
		password.sendKeys(pass);
	}
	//Click on LoginButton
	public void clickLoginButton()
	{
		loginButton.click();
	}
	//Check whether the entered username or password is valid or not
	public void checkInvalidUserPassMessage()
	{
		Assert.assertEquals("Invalid username or password", invalidUserPassMessage.getText());
	}
	//Check Login
	public void checkLogin()
	{
		Assert.assertEquals("My Account", myAccount.getText());
	}
}






