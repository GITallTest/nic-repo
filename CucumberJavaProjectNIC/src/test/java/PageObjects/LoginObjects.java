package PageObjects;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Extra.POI;
import junit.framework.Assert;

public class LoginObjects {

	By btn_login = By.xpath("//*[@id=\"navbarDropdown\"][contains(text(),'LOGIN')]");

	By btn_stateLogin = By.xpath("//*[@id=\"navbarSupportedContent\"]/form/ul/li/div/div/div/fieldset/div/div[1]/div[1]/a/div");

	By txt_username = By.xpath("//*[@id='userId']");

	By txt_password = By.xpath("//*[@id='password']");

	By txt_captcha = By.id("captcha");

	By btn_submit = By.xpath("//input[@type='submit']");



	WebDriver driver;

	public LoginObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	POI excelpoi = new POI(driver);

	public void clickOnLogin() throws InterruptedException {
		Actions login = new Actions(driver);
		login.moveToElement(driver.findElement(btn_login)).build().perform();
		//		driver.findElement(btn_login).click();
		Thread.sleep(1500);
		System.out.println("clicked on login button to get state loginj button");
	}


	public void clickOnStateLogin() throws InterruptedException {
		WebElement stateLogin =  driver.findElement(btn_login);
		Actions stateBtn =  new Actions(driver);
		stateBtn.moveToElement(stateLogin).build().perform();
		Thread.sleep(1500);
		driver.findElement(btn_stateLogin).click();
		Thread.sleep(1500);
		System.out.println("state button is clicked to redirect on login screen");
	}

	public void enterUsername() {
		driver.findElement(txt_username).clear();
		driver.findElement(txt_username).sendKeys("Maina");
		System.out.println("username is entered");
	}

	public void enterPassword() {
		driver.findElement(txt_password).sendKeys("karan");
		System.out.println("password is entered");
	}
 
	public void enterCred() throws InterruptedException {
		POI excelpoi = new POI(driver);
		driver.findElement(txt_username).clear();
		driver.findElement(txt_username).sendKeys("Mohan");
		Thread.sleep(1000);
		driver.findElement(txt_password).clear();
		driver.findElement(txt_password).sendKeys("Mahra");
		Thread.sleep(1000);
	}

	public void enterCaptcha() {
		System.out.println("captcha is entered");
	}

	public void clickOnSubmit() throws InterruptedException {
		driver.findElement(btn_submit).click();
		Thread.sleep(1500);
		System.out.println("clicked on submit button");
	}
}
