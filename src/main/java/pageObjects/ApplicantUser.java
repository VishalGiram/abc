package pageObjects;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;

import resources.ObjectRepo;
import resources.base;

public class ApplicantUser extends base {
	
	
	
	private By welcomeMenu = By.xpath("//button[text()='Welcome,']");
	private By userProfile = By.xpath("//a[text()='User Profile']");
	private By userProfileText = By.xpath("//h1[text()='User Profile']");
	private By changePassphrase = By.xpath("//a[text()='Change Passphrase']");
	private By userDetails = By.xpath("//span[text()='View User Details']");
	
	public ApplicantUser() {
		PageFactory.initElements(driver, this);
		
	}
	
	public void userDetailsPageOfApplicantUser() {
		//new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='User Profile']")));
		//driver.findElement(userDetails).click();
		WebElement element=driver.findElement(userDetails);
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		js2.executeScript("arguments[0].click()", element);
		System.out.println("step : Click on view user details option from user management section");
		ObjectRepo.test.log(Status.PASS, "step : Click on view user details option from user management section");
	}
	
	public void resetPassphraseAndSecurityQuestionOFApplicantUser() {
		driver.findElement(welcomeMenu).click();
		System.out.println("step : Click on welcome menu ");
		ObjectRepo.test.log(Status.PASS, "step : Click on welcome menu " );
		driver.findElement(changePassphrase).click();
		System.out.println("step : Click on Change Passphrase option from menu list ");
		ObjectRepo.test.log(Status.PASS, "step : Click on Change Passphrase option from menu list " );
	}
	
	public void userProfileOFApplicantUser() {
		driver.findElement(welcomeMenu).click();
		System.out.println("step : Click on welcome menu ");
		ObjectRepo.test.log(Status.PASS, "step : Click on welcome menu " );
		driver.findElement(userProfile).click();
		System.out.println("step : Click on user profile option from menu list ");
		ObjectRepo.test.log(Status.PASS, "step : Click on user profile option from menu list " );
	}

}
