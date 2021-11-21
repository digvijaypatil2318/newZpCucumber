package JaiSuryaDev;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	WebDriver driver;
	

	
	@When("EnterValid\"username\"and\"password\"")
	public void entervalid_username_and_password() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.instagram.com/accounts/login/");
		String a = driver.getCurrentUrl();
		System.out.println(a);
		driver.findElement(By.name("username")).sendKeys("username");
		driver.findElement(By.name("password")).sendKeys("password");
	   
	}

	@Then("userIsOnHomePage")
	public void userisonhomepage() {
		
		driver.close();
		
		
	}

}
