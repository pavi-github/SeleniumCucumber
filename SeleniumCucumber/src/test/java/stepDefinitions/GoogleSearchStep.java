package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchStep {

	WebDriver driver = null;

	@Given("brower is open")
	public void brower_is_open() {
		String projectpath = System.getProperty("user.dir");
		System.out.println("The current path:" + projectpath);
		System.setProperty("webdriver.chrome.driver", projectpath + "/src/test/resources/Drivers/chromedriver.exe");

		// System.setProperty("webdriver.chrome.driver",
		// "C:/Users/Sai/eclipse-workspace/SeleniumCucumber/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}

	@Given("user is on google search")
	public void user_is_on_google_search() {
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();

		driver.switchTo().frame(0);
		WebElement agreebutt = driver.findElement(By.xpath("//*[@id=\"introAgreeButton\"]/span/span"));
		agreebutt.click();
		driver.switchTo().defaultContent();

	}

	@When("user enters text in search box")
	public void user_enters_text_in_search_box() {		
		WebElement testbox = driver.findElement(By.name("q"));
		testbox.sendKeys("Step by Step Automation");
	}

	@When("hits enter")
	public void hits_enter() {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigate to search results")
	public void user_is_navigate_to_search_results() {
		if (driver.getPageSource().contains("Online Courses")) {
			System.out.println("The navigated page contains Online Courses");
		} else {
			System.out.println("The navigated page doesnt contains Online Courses");
		}
driver.close();
driver.quit();
	}

}
