package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {
	
	WebDriver driver;
	@Given("^Open chrome and start application$")
	public void Open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"D:\\chromedriver.exe");
		driver=new ChromeDriver();
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.facebook.com/");
	}

	@When("^enter the valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
	public void enter_the_vaalid_username_and_valid_password(String uname, String pass) throws Throwable{
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("pass")).sendKeys(pass);
	}

	@Then("^user should able to login successfully$")
	public void user_should_able_to_login_successfully() throws Throwable{
		driver.findElement(By.id("loginbutton")).click();
	  
	}

}
