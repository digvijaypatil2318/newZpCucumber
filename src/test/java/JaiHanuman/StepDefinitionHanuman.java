package JaiHanuman;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class StepDefinitionHanuman {
	
	WebDriver driver;
	
	
	@Given("userIsOnLoginPage")
	public void userisonloginpage() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	   
	}

	@When("userEnterValidUserName")
	public void userentervalidusername() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
	  
	}

	@When("UserEnterValidPassword")
	public void userentervalidpassword() {
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	   
	}

	@When("UserClickOnLoginButton")
	public void userclickonloginbutton() {
		driver.findElement(By.id("btnLogin")).click();
	   
	}

	@SuppressWarnings("deprecation")
	@Then("UserIsOnHomePage")
	public void userisonhomepage() {
		//String Expt="OrangeHRM";
		String Actual=driver.getTitle();
		//Assert.assertEquals(Expt,Actual);
		if(Actual.contains("OrangeHRM"))
		{
			System.out.println("Test case pass");
		}
		else
		{
			System.out.println("Test case fail");
		}
	   
	}

}
