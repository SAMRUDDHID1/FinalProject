package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWithoutPOM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Launch chrome broswer
		WebDriver driver = new ChromeDriver();
		
		//open url
		driver.get("https://www.saucedemo.com/");
		
		//find and enter user name
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		//find and enter password
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
				
		//find and click on login button
		driver.findElement(By.id("login-button")).click();
		
	}

}
