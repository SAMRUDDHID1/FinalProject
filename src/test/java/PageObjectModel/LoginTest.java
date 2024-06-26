package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		
		//Launch chrome broswer
		WebDriver driver = new ChromeDriver();
		
		// create object of login page
		LoginPage LoginPg = new LoginPage(driver);
		
		
		//open url
		driver.get("https://www.saucedemo.com/");
		
		LoginPg.enterUsername("standard_user");
		LoginPg.enterPassword("secret_sauce");
		
		LoginPg.clickOnLoginBtn();
		
		
	}

}
