package pageObjects;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.Status;

import resources.ObjectRepo;
import resources.base;

public class POMpublicHomePage extends base {
	
	public static String userId;
	
	private By checkBoxRememberMe = By.xpath("//input[@type='checkbox' and @name='remember']");
	private By textuserid = By.xpath("//input[@name='email']");
	private By passphrase = By.xpath("//input[@name='password']");
	private By loginbutton = By.xpath("//button[text()='Log In']");
	
	private By answerField = By.xpath("//input[@id='Answer']");
	private By continueButtonForLogin = By.xpath("//button[text()='CONTINUE']");
	private By userid = By.xpath("//input[@name='email']");
	private By passphraseOnLoginPage = By.xpath("//input[@name='password']");
	private By createUserId = By.xpath("//input[@name='createUserID']");
	private By passphraseOnCreateLoginPage = By.xpath("//input[@name='passphrase']");
	private By confirmPassphrase = By.xpath("//input[@id='confirmPassphrase']");
	private By secQuestion1 = By.xpath("//div[@id='mui-component-select-securityQuestion1']");
	private By selSecQue1 = By.xpath("(//li[@role='option'])[2]");
	private By answer1 = By.xpath("//input[@name='answer1']");
	private By secQuestion2 = By.xpath("//div[@id='mui-component-select-securityQuestion2']");
	private By selSecQue2 = By.xpath("(//li[@role='option'])[2]");
	private By answer2 = By.xpath("//input[@name='answer2']");
	private By secQuestion3 = By.xpath("//div[text()='Select Security Question 3']");
	private By selSecQue3 = By.xpath("(//li[@role='option'])[2]");
	private By answer3 = By.xpath("//input[@name='answer3']");
	private By termsOfUseCheckBox = By.xpath("//span[text()='I accept the WCI, Inc.']");
	private By creUserProfRegBut = By.xpath("//button[text()='REGISTER']");
	private By creUserProfCancelButton = By.xpath("//button[text()='CANCEL']");
	private By crossButtonOnSuccessMessAfterregistration = By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-5zd7v5']");
	private By finishButton = By.xpath("//button[text()='FINISH']");
	private By securityQuestion1ForLogin = By.xpath("//*[@class='MuiTypography-root MuiTypography-h6 css-1etlmxt']");
	
	public POMpublicHomePage() {
		PageFactory.initElements(driver, this);
		
	}
	
	public static String generateUserIdString() {
		int length = 4;
		boolean useLetters = false;
		boolean useNumbers = true;
		String generatedString = RandomStringUtils.random(length, useNumbers, useLetters);

		String randomString = ("test" + generatedString);
		return randomString;
	}
	
	public void validateCheckBox() throws InterruptedException {
		Thread.sleep(2000);
		Boolean abc = driver.findElement(checkBoxRememberMe).isEnabled();
		Assert.assertTrue(abc);
		System.out.println("Checkbox appeared on login screen ");
		ObjectRepo.test.log(Status.PASS, "Checkbox appeared on login screen");
		driver.findElement(checkBoxRememberMe).click();
		ObjectRepo.test.log(Status.PASS, "Checkbox enabled");
	}
	
	public void loginUserWithoutSelectingRememberMeCheckbox() throws InterruptedException {
		driver.findElement(textuserid).sendKeys("pendinguser2");
		driver.findElement(passphrase).sendKeys("Pendinguser@123");
		Thread.sleep(4000);
//		new WebDriverWait(driver,40).until(ExpectedConditions.elementToBeClickable(checkBoxRememberMe));
//		driver.findElement(checkBoxRememberMe).click();
		WebElement element=driver.findElement(loginbutton);
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		js2.executeScript("arguments[0].click()", element);
		Thread.sleep(5000);
		driver.findElement(answerField).sendKeys(prop.getProperty("SecurityAnswer1"));
		driver.findElement(continueButtonForLogin).click();
		String welcomeMsg = driver.findElement(By.xpath("//*[text()='Welcome!']")).getText();
		Assert.assertEquals(welcomeMsg , "Welcome!");
	}
	
	public void loginUserWithApplicationStatusPending () throws InterruptedException {
		driver.findElement(textuserid).sendKeys("pendinguser2");
		driver.findElement(passphrase).sendKeys("Pendinguser@123");
		Thread.sleep(4000);
//		new WebDriverWait(driver,40).until(ExpectedConditions.elementToBeClickable(checkBoxRememberMe));
//		driver.findElement(checkBoxRememberMe).click();
		WebElement element=driver.findElement(loginbutton);
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		js2.executeScript("arguments[0].click()", element);
		driver.findElement(answerField).sendKeys(prop.getProperty("SecurityAnswer1"));
		driver.findElement(continueButtonForLogin).click();
		String welcomeMsg = driver.findElement(By.xpath("//*[text()='Welcome!']")).getText();
		Assert.assertEquals(welcomeMsg , "Welcome!");
	}
	
	public void loginUserWith_status_is_pending_and_revision_is_requested() throws InterruptedException {
		driver.findElement(textuserid).sendKeys("revisionuser");
		driver.findElement(passphrase).sendKeys("Revisionuser@123");
		Thread.sleep(4000);
//		new WebDriverWait(driver,40).until(ExpectedConditions.elementToBeClickable(checkBoxRememberMe));
//		driver.findElement(checkBoxRememberMe).click();
		WebElement element=driver.findElement(loginbutton);
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		js2.executeScript("arguments[0].click()", element);
		driver.findElement(answerField).sendKeys(prop.getProperty("SecurityAnswer1"));
		driver.findElement(continueButtonForLogin).click();
		String welcomeMsg = driver.findElement(By.xpath("//*[text()='Welcome!']")).getText();
		Assert.assertEquals(welcomeMsg , "Welcome!");
	}

	public void loginUserWith_status_is_approved_and_revision_is_requested() throws InterruptedException {
		driver.findElement(textuserid).sendKeys("approveuser");
		driver.findElement(passphrase).sendKeys("Approveuser@123");
		Thread.sleep(4000);
//		new WebDriverWait(driver,40).until(ExpectedConditions.elementToBeClickable(checkBoxRememberMe));
//		driver.findElement(checkBoxRememberMe).click();
		WebElement element=driver.findElement(loginbutton);
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		js2.executeScript("arguments[0].click()", element);
		driver.findElement(answerField).sendKeys(prop.getProperty("SecurityAnswer1"));
		driver.findElement(continueButtonForLogin).click();
		String welcomeMsg = driver.findElement(By.xpath("//*[text()='Welcome!']")).getText();
		Assert.assertEquals(welcomeMsg , "Welcome!");
	}
	
	public void jurisdictionUserLogin() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(textuserid).sendKeys(prop.getProperty("LoginAsJSAUserCaliforniaUserID"));
		driver.findElement(passphrase).sendKeys(prop.getProperty("LoginAsJSAUserCaliforniaPassphrase"));
//		Thread.sleep(4000);
		new WebDriverWait(driver,40).until(ExpectedConditions.elementToBeClickable(loginbutton));
//		driver.findElement(checkBoxRememberMe).click();
		WebElement element=driver.findElement(loginbutton);
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		js2.executeScript("arguments[0].click()", element);
//		driver.findElement(answerField).sendKeys(prop.getProperty("SecurityAnswer1"));
//		driver.findElement(continueButtonForLogin).click();
//		String welcomeMsg = driver.findElement(By.xpath("//*[text()='Welcome!']")).getText();
//		Assert.assertEquals(welcomeMsg , "Welcome!");
	}
	
	
	public void handlesecurityQuestion() throws InterruptedException {
		Thread.sleep(4000);
		String str=driver.findElement(securityQuestion1ForLogin).getText().trim();
		if(str.contains("first job?")) {
			driver.findElement(answerField).sendKeys("Answer_1");
		}
		else if(str.contains("maiden name?")){
			driver.findElement(answerField).sendKeys("Answer_2");
		}
		else if(str.contains("first car?")){
			driver.findElement(answerField).sendKeys("Answer_3");
		}
		else {
			System.out.println("Nothing");
		}
		Thread.sleep(5000);
		driver.findElement(continueButtonForLogin).click();
		System.out.println("Registrar User should logged in successfully.");
	}
	
	public void createUserLogin() throws InterruptedException {
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.findElement(createUserId).sendKeys(generateUserIdString());
		driver.findElement(passphraseOnCreateLoginPage).sendKeys("Pass@12345");
		driver.findElement(confirmPassphrase).sendKeys("Pass@12345");
		driver.findElement(secQuestion1).click();
		driver.findElement(selSecQue1).click();
		driver.findElement(answer1).sendKeys("Answer1");
		driver.findElement(secQuestion2).click();
		driver.findElement(selSecQue2).click();
		driver.findElement(answer2).sendKeys("Answer2");
		
		Thread.sleep(2000);
		WebElement element1  = driver.findElement(secQuestion3);
		Actions action = new Actions(driver);
		action.click(element1).build().perform();
		
		driver.findElement(selSecQue3).click();
		driver.findElement(answer3).sendKeys("Answer3");
		WebElement element = driver.findElement(termsOfUseCheckBox);
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("arguments[0].click()", element);
		WebElement element2 = driver.findElement(creUserProfRegBut);
		js3.executeScript("arguments[0].click()", element2);
		Thread.sleep(5000);
		WebElement element3 = driver.findElement(crossButtonOnSuccessMessAfterregistration);
		element3.click();
//		js3.executeScript("arguments[0].click()", element2);
		WebElement finishButton1=driver.findElement(finishButton);
		if(finishButton1.isEnabled()) {
			System.out.println("The finish button should be enabled.");
		}
		else {
			System.out.println("The finish button should be disabled.");
		}
		finishButton1.click();
	}

}
