package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginObjects {
	protected WebDriver driver;
	
	private By txt_username_login=By.id("name");
	private By txt_password_login=By.id("password");
	private By but_login_Login = By.id("login");
	private By but_logout_login = By.id("logout");

	public LoginObjects(WebDriver driver){
		
		this.driver = driver;
		if(driver.getTitle().equals("TestProject Demo"))
		{
			System.out.println("The current URL is:" +driver.getCurrentUrl());
		}
			
	}
	
	
	public void enterusername(String username) {
		driver.findElement(txt_username_login).sendKeys(username);
		
	}
	public void enterpassword(String password) {
		driver.findElement(txt_password_login).sendKeys(password);
		
	}
	
	public void clickloginbutton() {
		driver.findElement(but_login_Login).click();
		
	}
	public void clicklogoutbutton() {
		driver.findElement(but_logout_login).click();
		
	}
	
}

