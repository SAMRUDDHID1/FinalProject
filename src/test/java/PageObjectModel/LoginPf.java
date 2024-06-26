package PageObjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// with Page factory
public class LoginPf {
	WebDriver driver;
	//constructor 
	LoginPf(WebDriver d)
	{
		driver = d;
		//this method will create web elements
		PageFactory.initElements(driver, this);
	}
    //identify web elements
	@FindBy(id="user-name")        // find user name
	WebElement username;
	
	@FindBy(id="password")        // find password
	WebElement password;
	
	@FindBy(id="login-button")        // find login button 
	WebElement loginBtn;
	
	public void enterUsername(String uname)
	{
		username.sendKeys(uname);
	}
	public void enterPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void clickOnLoginBtn( )
	{
		loginBtn.click();
	}
}
