package JaiBalaji;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionBalaji {
	
	WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@Given("userIsOnLoginpage")
	public void userisonloginpage() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");

		String a = driver.getCurrentUrl();
		System.out.println(a);
	  
	}

	@When("userEnterValidUsernameandValidPassword")
	public void userentervalidusernameandvalidpassword() {
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	
		driver.findElement(By.id("btnLogin")).click();
	  
	}

	@When("UserNavigateToInstagram")
	public void usernavigatetoinstagram() {
		driver.navigate().to("https://www.instagram.com/");
		String b = driver.getTitle();
        System.out.println(b);
	   
	}

	@Then("UserEntervalidUserNameAndPassword")
	public void userentervalidusernameandpassword() {
		driver.findElement(By.name("username")).sendKeys("Digvijay");
		 WebElement wb= driver.findElement(By.name("password"));
		 wb.sendKeys("patil");
		 String s= wb.getAttribute("value");
		 System.out.println(s);
	    
		
	

	    
	}

}
