package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestPf {

	public static void main(String[] args) {

		//Launch chrome broswer
				WebDriver driver = new ChromeDriver();
				
				// create object of login page
				LoginPf LoginPg = new LoginPf(driver);
				
				
				//open url
				driver.get("https://www.saucedemo.com/");
				
				LoginPg.enterUsername("standard_user");
				LoginPg.enterPassword("secret_sauce");
				
				LoginPg.clickOnLoginBtn();
	}

}
