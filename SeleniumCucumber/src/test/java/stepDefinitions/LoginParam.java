package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginParam {
	
/*	WebDriver driver = null;
	
	@Given("browser is open")
	public void browser_is_open() {
		String projectpath = System.getProperty("user.dir");
		System.out.println("The current path:" + projectpath);
		System.setProperty("webdriver.chrome.driver", projectpath + "/src/test/resources/Drivers/chromedriver.exe");

		driver = new ChromeDriver();
	  
	}

	@Given("user is on login page")
	public void user_is_on_login_page() {
		  driver.navigate().to("https://example.testproject.io/web/");
		  driver.manage().window().maximize();
		  	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) {
	   WebElement fullname = driver.findElement(By.id("name"));
	   fullname.sendKeys(username);
	   WebElement pass = driver.findElement(By.id("password"));
	   pass.sendKeys(password);
	   
	}

	@When("user clicks on login")
	public void user_clicks_on_login() {
		WebElement loginbutton = driver.findElement(By.id("login"));
		loginbutton.click();
		
	}

	@Then("user navigated to the home page")
	public void user_navigated_to_the_home_page() {
		WebElement logoutbutton = driver.findElement(By.id("logout"));
		logoutbutton.click();
		driver.close();
		driver.quit();
		
	}
*/
}

