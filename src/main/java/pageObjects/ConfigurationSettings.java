package pageObjects;

import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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

public class ConfigurationSettings extends base {

	

	private By settings = By.xpath("//button[text()='SETTINGS']"); 
	private By configuSettings= By.xpath("//a[text()='Configuration Settings']");

	private By logInSettings= By.xpath("//*[contains(text(),'Log-In Settings')]");
	private By NotificationSettings= By.xpath("//p[text()='Notification Settings']");
	private By TimeFrameSettings= By.xpath("//p[text()='Timeframe- Settings']");
	private By cancelButton= By.xpath("//button[text()='CANCEL']");
	private By saveButton= By.xpath("//button[text()='SAVE']");

	private By maximunNumberFailedLogInAttemptsText= By.xpath("(//*[contains(text(),'Maximum number of failed log-in attempts')])[1]");
	private By maximunNumberFailedLogInAttemptsPlus= By.xpath("//*[@data-testid='login-settings.failedLogin_count_tempLock.AttributeValue_plus']");
	private By maximunNumberFailedLogInAttemptsMinus= By.xpath("//*[@data-testid='login-settings.failedLogin_count_tempLock.AttributeValue_minus']");
	private By maximunNumberFailedLogInAttemptsValue= By.xpath("//input[@id='login-settings.failedLogin_count_tempLock.AttributeValue']");

	private By minutesAUserIsTemporarilyLockedOutText= By.xpath("//span[contains(text(),'Minutes a user is temporarily locked out for after maximum failed log-in attempts')]");
	private By minutesAUserIsTemporarilyLockedOutPlus= By.xpath("//*[@data-testid='login-settings.temp_lock_time.AttributeValue_plus']");
	private By minutesAUserIsTemporarilyLockedOutMinus= By.xpath("//*[@data-testid='login-settings.temp_lock_time.AttributeValue_minus']");
	private By minutesAUserIsTemporarilyLockedOutValue= By.xpath("//input[@id='login-settings.temp_lock_time.AttributeValue']");

	private By permenentLockOutText= By.xpath("//span[contains(text(),'Maximum number of failed log-in attempts - Permanent Lock Out')]");
	private By permenentLockOutPlus= By.xpath("//*[@data-testid='login-settings.failedLogin_count_permLock.AttributeValue_plus']");
	private By permenentLockOutMinus= By.xpath("//*[@data-testid='login-settings.failedLogin_count_permLock.AttributeValue_minus']");
	private By permenentLockOutValue= By.xpath("//input[@id='login-settings.failedLogin_count_permLock.AttributeValue']");
	
	private By enableRememberMeOption= By.xpath("//span[contains(text(),'Enable \"Remember Me\"')]");
	
	private By numberOfDaysPassphraseRememberText= By.xpath("//span[contains(text(),'Number of days passphrase is “remembered” for')]");
	private By numberOfDaysPassphraseRememberPlus= By.xpath("//*[@data-testid='login-settings.remember_userId_days.AttributeValue_plus']");
	private By numberOfDaysPassphraseRememberMinus= By.xpath("//*[@data-testid='login-settings.remember_userId_days.AttributeValue_minus']");
	private By numberOfDaysPassphraseRememberValue= By.xpath("//input[@id='login-settings.remember_userId_days.AttributeValue']");
	
	private By numberOfDaysPassphraseExpireText= By.xpath("//span[contains(text(),'Number of days after which passphrase expires and must be reset')]");
	private By numberOfDaysPassphraseExpirePlus= By.xpath("//*[@data-testid='login-settings.passphrase_exp_days.AttributeValue_plus']");
	private By numberOfDaysPassphraseExpireMinus= By.xpath("//*[@data-testid='login-settings.passphrase_exp_days.AttributeValue_minus']");
	private By numberOfDaysPassphraseExpireValue= By.xpath("//input[@id='login-settings.passphrase_exp_days.AttributeValue']");
	
	private By numberOfDaysPassphraseExpirationText= By.xpath("//span[contains(text(),'Number of days before passphrase expiration to prompt a reset')]");
	private By numberOfDaysPassphraseExpirationPlus= By.xpath("//*[@data-testid='login-settings.passphrase_reset.AttributeValue_plus']");
	private By numberOfDaysPassphraseExpirationMinus= By.xpath("//*[@data-testid='login-settings.passphrase_reset.AttributeValue_minus']");
	private By numberOfDaysPassphraseExpirationValue= By.xpath("//input[@id='login-settings.passphrase_reset.AttributeValue']");
	
	private By minutesOfUserInactivityText= By.xpath("//span[contains(text(),'Minutes of user inactivity before session time-out')]");
	private By minutesOfUserInactivityPlus= By.xpath("//*[@data-testid='login-settings.session_timeout_time.AttributeValue_plus']");
	private By minutesOfUserInactivityMinus= By.xpath("//*[@data-testid='login-settings.session_timeout_time.AttributeValue_minus']");
	private By minutesOfUserInactivityValue= By.xpath("//input[@id='login-settings.session_timeout_time.AttributeValue']");
	
	private By jurisdictionUserToReceiveAutomatedEmailText= By.xpath("//span[contains(text(),'Jurisdiction user to receive automated emails')]");
	private By jurisdictionUserToReceiveAutomatedEmailField= By.xpath("//input[@id='notification-settings.ju_email.AttributeValue']");
	private By emailToReceiveContactUsInquiriesText= By.xpath("//span[contains(text(),'Email to receive “Contact Us” inquiries')]");
	private By emailToReceiveContactUsInquiriesField= By.xpath("//input[@id='notification-settings.contact_us_email.AttributeValue']");
	
	private By submitPhysicalDocumentsText= By.xpath("//span[contains(text(),'Number of days for applicant to submit physical documents after completion of User Registration')]");
	private By submitPhysicalDocumentsPlus= By.xpath("//*[@data-testid='timeframe-settings.timeline_pending_application.AttributeValue_plus']");
	private By submitPhysicalDocumentsMinus= By.xpath("//*[@data-testid='timeframe-settings.timeline_pending_application.AttributeValue_minus']");
	private By submitPhysicalDocumentsValue= By.xpath("//input[@id='timeframe-settings.timeline_pending_application.AttributeValue']");
	
	private By applicantToSubmitRevisionsText= By.xpath("//span[contains(text(),'Number of days for applicant to submit revisions when requested by the jurisdiction')]");
	private By applicantToSubmitRevisionsPlus= By.xpath("//*[@data-testid='timeframe-settings.revision_request_days.AttributeValue_plus']");
	private By applicantToSubmitRevisionsMinus= By.xpath("//*[@data-testid='timeframe-settings.revision_request_days.AttributeValue_minus']");
	private By applicantToSubmitRevisionsValue= By.xpath("//input[@id='timeframe-settings.revision_request_days.AttributeValue']");
	
	private By incompleteUserRegistrationText= By.xpath("//span[contains(text(),'Number of days before incomplete User Registrations are deleted')]");
	private By incompleteUserRegistrationPlus= By.xpath("//*[@data-testid='timeframe-settings.incomplete_user_reg.AttributeValue_plus']");
	private By incompleteUserRegistrationMinus= By.xpath("//*[@data-testid='timeframe-settings.incomplete_user_reg.AttributeValue_minus']");
	private By incompleteUserRegistrationValue= By.xpath("//input[@id='timeframe-settings.incomplete_user_reg.AttributeValue']");
	private By userid = By.xpath("//input[@name='email']");
	private By passphraseOnLoginPage = By.xpath("//input[@name='password']");
	private By loginbutton = By.xpath("//button[text()='Log In']");
	
	public ConfigurationSettings() {
		PageFactory.initElements(driver, this);
		
	}
	
	public void numberOfDaysPassphraseRememberedFunctionalityWithInalidData() throws InterruptedException {
		driver.findElement(logInSettings).click();
		String enableRememberMeText=driver.findElement(enableRememberMeOption).getText();
		System.out.println("JSA should able to view:"+enableRememberMeText);
		ObjectRepo.test.log(Status.PASS, "JSA should able to view:"+enableRememberMeText);
		driver.findElement(enableRememberMeOption).click();
		//Thread.sleep(2000);
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//li[@class='MuiListItem-root MuiListItem-gutters MuiListItem-padding css-zs9zxr'])[4]")));
		WebElement element=driver.findElement(By.xpath("(//li[@class='MuiListItem-root MuiListItem-gutters MuiListItem-padding css-zs9zxr'])[4]"));
		if(element.isEnabled()) {
			System.out.println("Number of days passphrase is “remembered” for should be enabled");
			ObjectRepo.test.log(Status.PASS, "Number of days passphrase is “remembered” for should be enabled");
		}
		else{
			System.out.println("Number of days passphrase is “remembered” for should not be enabled");
			ObjectRepo.test.log(Status.PASS, "Number of days passphrase is “remembered” for should not be enabled");
		}
		driver.findElement(enableRememberMeOption).click();
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//li[@class='MuiListItem-root MuiListItem-gutters MuiListItem-padding css-zs9zxr'])[4]")));
		Actions action=new Actions(driver);
		action.moveToElement(element).build().perform();
		if(element.isEnabled()) {
			System.out.println("Number of days passphrase is “remembered” for should be enabled");
			ObjectRepo.test.log(Status.PASS, "Number of days passphrase is “remembered” for should be enabled");
		}
		else{
			System.out.println("Number of days passphrase is “remembered” for should not be enabled");
			ObjectRepo.test.log(Status.PASS, "Number of days passphrase is “remembered” for should not be enabled");
		}
		WebDriverWait wait=new WebDriverWait(driver,20);
		System.out.println("");
		wait.until(ExpectedConditions.visibilityOfElementLocated(numberOfDaysPassphraseRememberText));
		String numberOfDaysPassphraserememberText=driver.findElement(numberOfDaysPassphraseRememberText).getText();
		System.out.println("JSA should able to view:"+numberOfDaysPassphraserememberText);
		ObjectRepo.test.log(Status.PASS, "JSA should able to view:"+numberOfDaysPassphraserememberText);
		for(int i=1;i<=2;i++) {
			driver.findElement(numberOfDaysPassphraseRememberValue).sendKeys(Keys.BACK_SPACE);
		}
		driver.findElement(numberOfDaysPassphraseRememberValue).sendKeys("0");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='MuiBox-root css-rr1cml']")));
		String errorMessage=driver.findElement(By.xpath("//div[@class='MuiBox-root css-rr1cml']")).getText();
		System.out.println("Error message is:"+errorMessage);
		Assert.assertEquals("Invalid Number of days passphrase is “remembered” for", errorMessage);
		ObjectRepo.test.log(Status.PASS, "Error message is:"+errorMessage);
		
	}
	
	public void numberOfDaysPassphraseRememberedFunctionalityWithValidData() throws InterruptedException {
		new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(logInSettings));
		driver.findElement(logInSettings).click();
		String enableRememberMeText=driver.findElement(enableRememberMeOption).getText();
		System.out.println("JSA should able to view:"+enableRememberMeText);
		ObjectRepo.test.log(Status.PASS, "JSA should able to view:"+enableRememberMeText);
		driver.findElement(enableRememberMeOption).click();
		//Thread.sleep(2000);
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//li[@class='MuiListItem-root MuiListItem-gutters MuiListItem-padding css-zs9zxr'])[4]")));
		WebElement element=driver.findElement(By.xpath("(//li[@class='MuiListItem-root MuiListItem-gutters MuiListItem-padding css-zs9zxr'])[4]"));
		if(element.isEnabled()) {
			System.out.println("Number of days passphrase is “remembered” for should be enabled");
			ObjectRepo.test.log(Status.PASS, "Number of days passphrase is “remembered” for should be enabled");
		}
		else{
			System.out.println("Number of days passphrase is “remembered” for should not be enabled");
			ObjectRepo.test.log(Status.PASS, "Number of days passphrase is “remembered” for should not be enabled");
		}
		//Thread.sleep(4000);
		driver.findElement(enableRememberMeOption).click();
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//li[@class='MuiListItem-root MuiListItem-gutters MuiListItem-padding css-zs9zxr'])[4]")));
		Actions action=new Actions(driver);
		action.moveToElement(element).build().perform();
		if(element.isEnabled()) {
			System.out.println("Number of days passphrase is “remembered” for should be enabled");
			ObjectRepo.test.log(Status.PASS, "Number of days passphrase is “remembered” for should be enabled");
		}
		else{
			System.out.println("Number of days passphrase is “remembered” for should not be enabled");
			ObjectRepo.test.log(Status.PASS, "Number of days passphrase is “remembered” for should not be enabled");
		}
		WebDriverWait wait=new WebDriverWait(driver,20);
		System.out.println("");
		wait.until(ExpectedConditions.visibilityOfElementLocated(numberOfDaysPassphraseRememberText));
		String numberOfDaysPassphraserememberText=driver.findElement(numberOfDaysPassphraseRememberText).getText();
		System.out.println("JSA should able to view:"+numberOfDaysPassphraserememberText);
		ObjectRepo.test.log(Status.PASS, "JSA should able to view:"+numberOfDaysPassphraserememberText);
		wait.until(ExpectedConditions.visibilityOfElementLocated(numberOfDaysPassphraseRememberValue));
		String byDefaultValue4=driver.findElement(numberOfDaysPassphraseRememberValue).getAttribute("value");
		System.out.println("JSA should able to view by default value of number of days passphrase remember:"+byDefaultValue4);
		ObjectRepo.test.log(Status.PASS, "JSA should able to view by default value of number of days passphrase remember:"+byDefaultValue4);
		driver.findElement(numberOfDaysPassphraseRememberPlus).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(numberOfDaysPassphraseRememberValue));
		String valueAfterClickOnPlus4=driver.findElement(numberOfDaysPassphraseRememberValue).getAttribute("value");
		System.out.println("JSA should able to view after click on plus sign of number of days passphrase remember:"+ valueAfterClickOnPlus4);
		ObjectRepo.test.log(Status.PASS, "JSA should able to view after click on plus sign of number of days passphrase remember:"+ valueAfterClickOnPlus4);
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(numberOfDaysPassphraseRememberMinus));
		driver.findElement(numberOfDaysPassphraseRememberMinus).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(numberOfDaysPassphraseRememberValue));
		String valueAfterClickOnMinus4=driver.findElement(numberOfDaysPassphraseRememberValue).getAttribute("value");
		System.out.println("JSA should able to view after click on minus sign of number of days passphrase remember:"+ valueAfterClickOnMinus4);
		ObjectRepo.test.log(Status.PASS, "JSA should able to view after click on minus sign of number of days passphrase remember:"+ valueAfterClickOnMinus4);
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(saveButton));
		WebElement button=driver.findElement(saveButton);
		action.moveToElement(button).build().perform();
		action.click(button).build().perform();
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']")));
		String successMessage=driver.findElement(By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']")).getText();
		System.out.println("Success message after save configuration settings:"+successMessage);
		ObjectRepo.test.log(Status.PASS, "Success message after save configuration settings:"+successMessage);
	}
	
	public void configureSessionTimeOutInMinute() {
		new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(logInSettings));
		driver.findElement(logInSettings).click();
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(minutesOfUserInactivityText));
		String minutesOfuserInactivityText=driver.findElement(minutesOfUserInactivityText).getText();
		System.out.println("JSA should able to view:"+minutesOfuserInactivityText);
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(minutesOfUserInactivityValue));
		String byDefaultValue7=driver.findElement(minutesOfUserInactivityValue).getAttribute("value");
		System.out.println("JSA should able to view by default value of Minutes of user inactivity before session time-out:"+byDefaultValue7);
		driver.findElement(minutesOfUserInactivityPlus).click();
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(minutesOfUserInactivityValue));
		String valueAfterClickOnPlus7=driver.findElement(minutesOfUserInactivityValue).getAttribute("value");
		System.out.println("JSA should able to view after click on plus sign of Minutes of user inactivity before session time-out:"+ valueAfterClickOnPlus7);
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(minutesOfUserInactivityMinus));
		driver.findElement(minutesOfUserInactivityMinus).click();
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(minutesOfUserInactivityValue));
		String valueAfterClickOnMinus7=driver.findElement(minutesOfUserInactivityValue).getAttribute("value");
		System.out.println("JSA should able to view after click on minus sign of Minutes of user inactivity before session time-out:"+ valueAfterClickOnMinus7);
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(saveButton));
		WebElement button=driver.findElement(saveButton);
		Actions action=new Actions(driver);
		action.moveToElement(button).build().perform();
		action.click(button).build().perform();
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']")));
		String successMessage=driver.findElement(By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']")).getText();
		System.out.println("Success message after save configuration settings:"+successMessage);
	}
	
	public void jsaViewNotificationSettins() {
		new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(NotificationSettings));
		driver.findElement(NotificationSettings).click();
		new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(jurisdictionUserToReceiveAutomatedEmailText));
		String jurisdictionUserReceivedAutomatedEmailsText=driver.findElement(jurisdictionUserToReceiveAutomatedEmailText).getText();
		System.out.println("JSA should able to view:"+jurisdictionUserReceivedAutomatedEmailsText);
		Assert.assertEquals("Jurisdiction user to receive automated emails", jurisdictionUserReceivedAutomatedEmailsText);
		ObjectRepo.test.log(Status.PASS, "JSA should able to view:"+jurisdictionUserReceivedAutomatedEmailsText);
		String emailToReceiveContactUSInquiriesText=driver.findElement(emailToReceiveContactUsInquiriesText).getText();
		System.out.println("JSA should able to view:"+emailToReceiveContactUSInquiriesText);
		Assert.assertEquals("Email to receive “Contact Us” inquiries", emailToReceiveContactUSInquiriesText);
		ObjectRepo.test.log(Status.PASS, "JSA should able to view:"+emailToReceiveContactUSInquiriesText);
	}
	
	public void contactUsNotification() {
		new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(NotificationSettings));
		driver.findElement(NotificationSettings).click();
		String emailToReceiveContactUSInquiriesText=driver.findElement(emailToReceiveContactUsInquiriesText).getText();
		System.out.println("JSA should able to view:"+emailToReceiveContactUSInquiriesText);
		String byDefaultDataInEmailToReceiveContactUsInquiriesField=driver.findElement(emailToReceiveContactUsInquiriesField).getAttribute("value");
		System.out.println("JSA should able to view by default data in Email to receive contact us Inquiries Field:"+byDefaultDataInEmailToReceiveContactUsInquiriesField);
		for (int i = 1; i <= 25; i++) {
			driver.findElement(emailToReceiveContactUsInquiriesField).sendKeys(Keys.BACK_SPACE);
		}
		driver.findElement(emailToReceiveContactUsInquiriesField).sendKeys("abcdefg@yopmail.com");
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(emailToReceiveContactUsInquiriesField));	
		String EmailToReceiveContactUsInquiries=driver.findElement(emailToReceiveContactUsInquiriesField).getAttribute("value");
		System.out.println("JSA should able to view after changes in Email to receive contact us Inquiries Field:"+EmailToReceiveContactUsInquiries);
//		driver.findElement(saveButton);
//		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']")));
//		String successMessage=driver.findElement(By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']")).getText();
//		System.out.println("Success message after save configuration settings:"+successMessage);
	}
	
	public void loginAsJSAUserOfQuebecJurisdiction() {
		driver.getTitle();
		System.out.println("Current Page Title is :"+ driver.getTitle());
		List<WebElement> links = driver.findElements(By.tagName("a"));
		links.size();
		for(int i =0;i<=links.size()-1;i++ ) {
		links.get(i).getText();
		System.out.println(links.get(i).getText());
		}
		new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated
				(userid));
		driver.findElement(userid).sendKeys(prop.getProperty("LoginAsJSAUserQuebecUserID"));
		new WebDriverWait(driver,40).until(ExpectedConditions.elementToBeClickable(passphraseOnLoginPage));
		driver.findElement(passphraseOnLoginPage).sendKeys(prop.getProperty("LoginAsJSAUserQuebecPassphrase"));
		WebElement element = driver.findElement(loginbutton);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);	
	}
	
	public void enableRememberMeFromConfigurationSettings() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(logInSettings));
		driver.findElement(logInSettings).click();
		Thread.sleep(2000);
		String enableRememberMeText=driver.findElement(enableRememberMeOption).getText();
		System.out.println("JSA should able to view:"+enableRememberMeText);
		driver.findElement(enableRememberMeOption).click();
	}
	

	public void changesInLogInsettingsSection() throws InterruptedException {
		System.out.println("");
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(logInSettings));
		driver.findElement(logInSettings).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(maximunNumberFailedLogInAttemptsText));
		String maximumNumberFailedLogInAttemptsText=driver.findElement(maximunNumberFailedLogInAttemptsText).getText();
		System.out.println("JSA should able to view:"+maximumNumberFailedLogInAttemptsText);
		wait.until(ExpectedConditions.visibilityOfElementLocated(maximunNumberFailedLogInAttemptsValue));
		String byDefaultValue1=driver.findElement(maximunNumberFailedLogInAttemptsValue).getAttribute("value");
		System.out.println("JSA should able to view by default value of maximum number failed log in attempts:"+byDefaultValue1);
		driver.findElement(maximunNumberFailedLogInAttemptsPlus).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(maximunNumberFailedLogInAttemptsValue));
		String valueAfterClickOnPlus1=driver.findElement(maximunNumberFailedLogInAttemptsValue).getAttribute("value");
		System.out.println("JSA should able to view after click on plus sign of maximum number failed log in attempts:"+ valueAfterClickOnPlus1);
		Thread.sleep(1000);
		driver.findElement(maximunNumberFailedLogInAttemptsMinus).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(maximunNumberFailedLogInAttemptsValue));
		String valueAfterClickOnMinus1=driver.findElement(maximunNumberFailedLogInAttemptsValue).getAttribute("value");
		System.out.println("JSA should able to view after click on minus sign of maximum number failed log in attempts:"+ valueAfterClickOnMinus1);

		wait.until(ExpectedConditions.visibilityOfElementLocated(minutesAUserIsTemporarilyLockedOutText));
		String minutesAUserIstemporarilyLockedOutText=driver.findElement(minutesAUserIsTemporarilyLockedOutText).getText();
		System.out.println("JSA should able to view:"+minutesAUserIstemporarilyLockedOutText);
		wait.until(ExpectedConditions.visibilityOfElementLocated(minutesAUserIsTemporarilyLockedOutValue));
		String byDefaultValue2=driver.findElement(minutesAUserIsTemporarilyLockedOutValue).getAttribute("value");
		System.out.println("JSA should able to view by default value of Minutes a user is temporarily locked out:"+byDefaultValue2);
		driver.findElement(minutesAUserIsTemporarilyLockedOutPlus).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(minutesAUserIsTemporarilyLockedOutValue));
		String valueAfterClickOnPlus2=driver.findElement(minutesAUserIsTemporarilyLockedOutValue).getAttribute("value");
		System.out.println("JSA should able to view after click on plus sign of Minutes a user is temporarily locked out:"+ valueAfterClickOnPlus2);
		Thread.sleep(1000);
		driver.findElement(minutesAUserIsTemporarilyLockedOutMinus).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(minutesAUserIsTemporarilyLockedOutValue));
		String valueAfterClickOnMinus2=driver.findElement(minutesAUserIsTemporarilyLockedOutValue).getAttribute("value");
		System.out.println("JSA should able to view after click on minus sign of Minutes a user is temporarily locked out:"+ valueAfterClickOnMinus2);
		
		System.out.println("");
		wait.until(ExpectedConditions.visibilityOfElementLocated(permenentLockOutText));
		String permenetLockoutText=driver.findElement(permenentLockOutText).getText();
		System.out.println("JSA should able to view:"+permenetLockoutText);
		wait.until(ExpectedConditions.visibilityOfElementLocated(permenentLockOutValue));
		String byDefaultValue3=driver.findElement(permenentLockOutValue).getAttribute("value");
		System.out.println("JSA should able to view by default value of permanet lock out:"+byDefaultValue3);
		driver.findElement(permenentLockOutPlus).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(permenentLockOutValue));
		String valueAfterClickOnPlus3=driver.findElement(permenentLockOutValue).getAttribute("value");
		System.out.println("JSA should able to view after click on plus sign of permanet lock out:"+ valueAfterClickOnPlus3);
		Thread.sleep(1000);
		driver.findElement(permenentLockOutMinus).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(permenentLockOutValue));
		String valueAfterClickOnMinus3=driver.findElement(permenentLockOutValue).getAttribute("value");
		System.out.println("JSA should able to view after click on minus sign of permanet lock out:"+ valueAfterClickOnMinus3);
		
		System.out.println("");
		String enableRememberMeText=driver.findElement(enableRememberMeOption).getText();
		System.out.println("JSA should able to view:"+enableRememberMeText);
		driver.findElement(enableRememberMeOption).click();
		Thread.sleep(2000);
		WebElement element=driver.findElement(By.xpath("(//li[@class='MuiListItem-root MuiListItem-gutters MuiListItem-padding css-zs9zxr'])[4]"));
		if(element.isEnabled()) {
			System.out.println("Number of days passphrase is “remembered” for should be enabled");
		}
		else{
			System.out.println("Number of days passphrase is “remembered” for should not be enabled");
		}
		Thread.sleep(4000);
		driver.findElement(enableRememberMeOption).click();
		Thread.sleep(2000);
		Actions action=new Actions(driver);
		action.moveToElement(element).build().perform();
		if(element.isEnabled()) {
			System.out.println("Number of days passphrase is “remembered” for should be enabled");
		}
		else{
			System.out.println("Number of days passphrase is “remembered” for should not be enabled");
		}
		
		System.out.println("");
		wait.until(ExpectedConditions.visibilityOfElementLocated(numberOfDaysPassphraseRememberText));
		String numberOfDaysPassphraserememberText=driver.findElement(numberOfDaysPassphraseRememberText).getText();
		System.out.println("JSA should able to view:"+numberOfDaysPassphraserememberText);
		wait.until(ExpectedConditions.visibilityOfElementLocated(numberOfDaysPassphraseRememberValue));
		String byDefaultValue4=driver.findElement(numberOfDaysPassphraseRememberValue).getAttribute("value");
		System.out.println("JSA should able to view by default value of number of days passphrase remember:"+byDefaultValue4);
		driver.findElement(numberOfDaysPassphraseRememberPlus).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(numberOfDaysPassphraseRememberValue));
		String valueAfterClickOnPlus4=driver.findElement(numberOfDaysPassphraseRememberValue).getAttribute("value");
		System.out.println("JSA should able to view after click on plus sign of number of days passphrase remember:"+ valueAfterClickOnPlus4);
		Thread.sleep(1000);
		driver.findElement(numberOfDaysPassphraseRememberMinus).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(numberOfDaysPassphraseRememberValue));
		String valueAfterClickOnMinus4=driver.findElement(numberOfDaysPassphraseRememberValue).getAttribute("value");
		System.out.println("JSA should able to view after click on minus sign of number of days passphrase remember:"+ valueAfterClickOnMinus4);
		
		System.out.println("");
		wait.until(ExpectedConditions.visibilityOfElementLocated(numberOfDaysPassphraseExpireText));
		String numberOfDaysPassphraseexpireText=driver.findElement(numberOfDaysPassphraseExpireText).getText();
		System.out.println("JSA should able to view:"+numberOfDaysPassphraseexpireText);
		wait.until(ExpectedConditions.visibilityOfElementLocated(numberOfDaysPassphraseExpireValue));
		String byDefaultValue5=driver.findElement(numberOfDaysPassphraseExpireValue).getAttribute("value");
		System.out.println("JSA should able to view by default value of number of days passphrase Expired:"+byDefaultValue5);
		driver.findElement(numberOfDaysPassphraseExpirePlus).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(numberOfDaysPassphraseExpireValue));
		String valueAfterClickOnPlus5=driver.findElement(numberOfDaysPassphraseExpireValue).getAttribute("value");
		System.out.println("JSA should able to view after click on plus sign of number of days passphrase Expired:"+ valueAfterClickOnPlus5);
		Thread.sleep(1000);
		driver.findElement(numberOfDaysPassphraseExpireMinus).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(numberOfDaysPassphraseExpireValue));
		String valueAfterClickOnMinus5=driver.findElement(numberOfDaysPassphraseExpireValue).getAttribute("value");
		System.out.println("JSA should able to view after click on minus sign of number of days passphrase Expired:"+ valueAfterClickOnMinus5);
		
		System.out.println("");
		wait.until(ExpectedConditions.visibilityOfElementLocated(numberOfDaysPassphraseExpirationText));
		String numberOfDaysPassphraseexpirationText=driver.findElement(numberOfDaysPassphraseExpirationText).getText();
		System.out.println("JSA should able to view:"+numberOfDaysPassphraseexpirationText);
		wait.until(ExpectedConditions.visibilityOfElementLocated(numberOfDaysPassphraseExpirationValue));
		String byDefaultValue6=driver.findElement(numberOfDaysPassphraseExpirationValue).getAttribute("value");
		System.out.println("JSA should able to view by default value of Number of days before passphrase expiration to prompt a reset:"+byDefaultValue6);
		driver.findElement(numberOfDaysPassphraseExpirationPlus).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(numberOfDaysPassphraseExpirationValue));
		String valueAfterClickOnPlus6=driver.findElement(numberOfDaysPassphraseExpirationValue).getAttribute("value");
		System.out.println("JSA should able to view after click on plus sign of Number of days before passphrase expiration to prompt a reset:"+ valueAfterClickOnPlus6);
		Thread.sleep(1000);
		driver.findElement(numberOfDaysPassphraseExpirationMinus).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(numberOfDaysPassphraseExpirationValue));
		String valueAfterClickOnMinus6=driver.findElement(numberOfDaysPassphraseExpirationValue).getAttribute("value");
		System.out.println("JSA should able to view after click on minus sign of Number of days before passphrase expiration to prompt a reset:"+ valueAfterClickOnMinus6);
		
		System.out.println("");
		wait.until(ExpectedConditions.visibilityOfElementLocated(minutesOfUserInactivityText));
		String minutesOfuserInactivityText=driver.findElement(minutesOfUserInactivityText).getText();
		System.out.println("JSA should able to view:"+minutesOfuserInactivityText);
		wait.until(ExpectedConditions.visibilityOfElementLocated(minutesOfUserInactivityValue));
		String byDefaultValue7=driver.findElement(minutesOfUserInactivityValue).getAttribute("value");
		System.out.println("JSA should able to view by default value of Minutes of user inactivity before session time-out:"+byDefaultValue7);
		driver.findElement(minutesOfUserInactivityPlus).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(minutesOfUserInactivityValue));
		String valueAfterClickOnPlus7=driver.findElement(minutesOfUserInactivityValue).getAttribute("value");
		System.out.println("JSA should able to view after click on plus sign of Minutes of user inactivity before session time-out:"+ valueAfterClickOnPlus7);
		Thread.sleep(1000);
		driver.findElement(minutesOfUserInactivityMinus).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(minutesOfUserInactivityValue));
		String valueAfterClickOnMinus7=driver.findElement(minutesOfUserInactivityValue).getAttribute("value");
		System.out.println("JSA should able to view after click on minus sign of Minutes of user inactivity before session time-out:"+ valueAfterClickOnMinus7);
		
		System.out.println("");
		driver.findElement(NotificationSettings).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(jurisdictionUserToReceiveAutomatedEmailText));
		String jurisdictionUserReceivedAutomatedEmailsText=driver.findElement(jurisdictionUserToReceiveAutomatedEmailText).getText();
		System.out.println("JSA should able to view:"+jurisdictionUserReceivedAutomatedEmailsText);
		String byDefaultDataInJurisdictionUserReceivedAutomatedEmailsField=driver.findElement(jurisdictionUserToReceiveAutomatedEmailField).getAttribute("value");
		System.out.println("JSA should able to view by default data in Jurisdiction user receive automated emails field:"+byDefaultDataInJurisdictionUserReceivedAutomatedEmailsField);
		for (int i = 1; i <= 22; i++) {
			driver.findElement(jurisdictionUserToReceiveAutomatedEmailField).sendKeys(Keys.BACK_SPACE);
		}
		driver.findElement(jurisdictionUserToReceiveAutomatedEmailField).sendKeys("abcd@yopmail.com");
		Thread.sleep(2000);
		String afterChangesDataInJurisdictionUserReceivedAutomatedEmailsField=driver.findElement(jurisdictionUserToReceiveAutomatedEmailField).getAttribute("value");
		System.out.println("JSA should able to view after changes in Jurisdiction user receive automated emails field:"+afterChangesDataInJurisdictionUserReceivedAutomatedEmailsField);
		
		String emailToReceiveContactUSInquiriesText=driver.findElement(emailToReceiveContactUsInquiriesText).getText();
		System.out.println("JSA should able to view:"+emailToReceiveContactUSInquiriesText);
		String byDefaultDataInEmailToReceiveContactUsInquiriesField=driver.findElement(emailToReceiveContactUsInquiriesField).getAttribute("value");
		System.out.println("JSA should able to view by default data in Email to receive contact us Inquiries Field:"+byDefaultDataInEmailToReceiveContactUsInquiriesField);
		for (int i = 1; i <= 25; i++) {
			driver.findElement(emailToReceiveContactUsInquiriesField).sendKeys(Keys.BACK_SPACE);
		}
		driver.findElement(emailToReceiveContactUsInquiriesField).sendKeys("abcdefg@yopmail.com");
		Thread.sleep(2000);
		String EmailToReceiveContactUsInquiries=driver.findElement(emailToReceiveContactUsInquiriesField).getAttribute("value");
		System.out.println("JSA should able to view after changes in Email to receive contact us Inquiries Field:"+EmailToReceiveContactUsInquiries);
		
		System.out.println("");
		driver.findElement(TimeFrameSettings).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(submitPhysicalDocumentsText));
		String submitPhysicaldocumentsText=driver.findElement(submitPhysicalDocumentsText).getText();
		System.out.println("JSA should able to view:"+submitPhysicaldocumentsText);
		wait.until(ExpectedConditions.visibilityOfElementLocated(submitPhysicalDocumentsValue));
		String byDefaultValue8=driver.findElement(submitPhysicalDocumentsValue).getAttribute("value");
		System.out.println("JSA should able to view by default value of Number of days for applicant to submit physical documents after completion of User Registration:"+byDefaultValue8);
		driver.findElement(submitPhysicalDocumentsPlus).click();
		driver.findElement(submitPhysicalDocumentsPlus).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(submitPhysicalDocumentsValue));
		String valueAfterClickOnPlus8=driver.findElement(submitPhysicalDocumentsValue).getAttribute("value");
		System.out.println("JSA should able to view after click on plus sign of Number of days for applicant to submit physical documents after completion of User Registration:"+ valueAfterClickOnPlus8);
		Thread.sleep(1000);
		driver.findElement(submitPhysicalDocumentsMinus).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(submitPhysicalDocumentsValue));
		String valueAfterClickOnMinus8=driver.findElement(submitPhysicalDocumentsValue).getAttribute("value");
		System.out.println("JSA should able to view after click on minus sign of Number of days for applicant to submit physical documents after completion of User Registration:"+ valueAfterClickOnMinus8);
		
		System.out.println("");
		wait.until(ExpectedConditions.visibilityOfElementLocated(applicantToSubmitRevisionsText));
		String applicantToSubmitREvisionsText=driver.findElement(applicantToSubmitRevisionsText).getText();
		System.out.println("JSA should able to view:"+applicantToSubmitREvisionsText);
		wait.until(ExpectedConditions.visibilityOfElementLocated(applicantToSubmitRevisionsValue));
		String byDefaultValue9=driver.findElement(applicantToSubmitRevisionsValue).getAttribute("value");
		System.out.println("JSA should able to view by default value of Number of days for applicant to submit revisions when requested by the jurisdiction:"+byDefaultValue9);
		driver.findElement(applicantToSubmitRevisionsPlus).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(applicantToSubmitRevisionsValue));
		String valueAfterClickOnPlus9=driver.findElement(applicantToSubmitRevisionsValue).getAttribute("value");
		System.out.println("JSA should able to view after click on plus sign of Number of days for applicant to submit revisions when requested by the jurisdictiont:"+ valueAfterClickOnPlus9);
		Thread.sleep(1000);
		driver.findElement(applicantToSubmitRevisionsMinus).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(applicantToSubmitRevisionsValue));
		String valueAfterClickOnMinus9=driver.findElement(applicantToSubmitRevisionsValue).getAttribute("value");
		System.out.println("JSA should able to view after click on minus sign of Number of days for applicant to submit revisions when requested by the jurisdiction:"+ valueAfterClickOnMinus9);
		
		System.out.println("");
		wait.until(ExpectedConditions.visibilityOfElementLocated(incompleteUserRegistrationText));
		String incompleteUSerRegistrationText=driver.findElement(incompleteUserRegistrationText).getText();
		System.out.println("JSA should able to view:"+incompleteUSerRegistrationText);
		wait.until(ExpectedConditions.visibilityOfElementLocated(incompleteUserRegistrationValue));
		String byDefaultValue10=driver.findElement(incompleteUserRegistrationValue).getAttribute("value");
		System.out.println("JSA should able to view by default value of Number of days before incomplete User Registrations are deleted:"+byDefaultValue10);
		driver.findElement(incompleteUserRegistrationPlus).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(incompleteUserRegistrationValue));
		String valueAfterClickOnPlus10=driver.findElement(incompleteUserRegistrationValue).getAttribute("value");
		System.out.println("JSA should able to view after click on plus sign of Number of days before incomplete User Registrations are deleted:"+ valueAfterClickOnPlus10);
		Thread.sleep(1000);
		driver.findElement(incompleteUserRegistrationMinus).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(incompleteUserRegistrationValue));
		String valueAfterClickOnMinus10=driver.findElement(incompleteUserRegistrationValue).getAttribute("value");
		System.out.println("JSA should able to view after click on minus sign of Number of days before incomplete User Registrations are deleted:"+ valueAfterClickOnMinus10);
		Thread.sleep(2000);
		driver.findElement(saveButton).click();
		Thread.sleep(2000);
		String successMessage=driver.findElement(By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']")).getText();
		System.out.println("Success message after save configuration settings:"+successMessage);
	}

	
	public void uiTestForConfigurationSettingsPage() {
		System.out.println("Following  Elements should be Avaliable on Configuration Settings Page");
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Configuration Settings']")));
		String loginSettingsText=driver.findElement(logInSettings).getText();
		System.out.println(loginSettingsText);
		Assert.assertEquals(loginSettingsText, "Log-In Settings");
		String notificationSettingsText=driver.findElement(NotificationSettings).getText();
		System.out.println(notificationSettingsText);
		Assert.assertEquals(notificationSettingsText, "Notification Settings");
		String timeFrameSettings=driver.findElement(TimeFrameSettings).getText();
		System.out.println(timeFrameSettings);
		Assert.assertEquals(timeFrameSettings, "Timeframe- Settings");
		String cancelButtonOnConfSett=driver.findElement(cancelButton).getText();
		System.out.println(cancelButtonOnConfSett);
		Assert.assertEquals(cancelButtonOnConfSett, "CANCEL");
		String saveButtonOnConfSett=driver.findElement(saveButton).getText();
		System.out.println(saveButtonOnConfSett);
		Assert.assertEquals(saveButtonOnConfSett, "SAVE");
		ObjectRepo.test.log(Status.PASS, "Following  Elements should be Avaliable on Configuration Settings Page" );
		ObjectRepo.test.log(Status.PASS, loginSettingsText+","+notificationSettingsText+","+timeFrameSettings+","+cancelButtonOnConfSett
				+","+saveButtonOnConfSett);
	}

	public void configurationSettings() {
		WebElement element = driver.findElement(settings);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		System.out.println("Step : Click On Settings dropdown menu ");
		ObjectRepo.test.log(Status.PASS, "Step : Click On Settings dropdown menu " );
		driver.findElement(configuSettings).click();
		System.out.println("Step : Select Configuration Settings ");
		ObjectRepo.test.log(Status.PASS, "Step : Click On Configuration Settings " );
	}
}
