package StepDefinations;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.LoginObjects;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps {


	WebDriver driver;
	
	LoginObjects login = new LoginObjects(driver);
	LoginObjects login1 = new LoginObjects(driver);
	
		
		@Given("user is on home page")
		public void user_is_on_home_page() throws InterruptedException {
		   System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
		   driver=new ChromeDriver();  
		   driver.manage().window().maximize();
		   driver.manage().deleteAllCookies();
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   driver.get("https://udiseplus.gov.in/");
		   driver.navigate().to("https://udiseplus.gov.in/");
		   Thread.sleep(2000);
		   System.out.println("browser is launched and user is onn home page");
		   
		}
	
		@And("user login screen")
		public void user_login_screen() throws InterruptedException {
		LoginObjects login = new LoginObjects(driver);
		  login.clickOnLogin();
		  login.clickOnStateLogin();
		  Thread.sleep(1000);		
		}
	
		@When("user enters username and password")
		public void user_enters_username_and_password() throws InterruptedException {
			LoginObjects login = new LoginObjects(driver);
			login.enterCred();
			login.enterCaptcha();
			login.clickOnSubmit();
			Thread.sleep(1000);
			System.out.println("User is on dashboard");
		   
		}
	
		@Then("user is redirecting on dashboard")
		public void user_is_redirecting_on_dashboard() {
		    System.out.println("after login, elemnet is visible");
		}
	

}
