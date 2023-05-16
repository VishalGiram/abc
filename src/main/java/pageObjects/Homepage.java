package pageObjects;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

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
import resources.TestDataByRegEx;
import resources.base;

public class Homepage extends base {

	
	private By selectjurisdiction = By.xpath("//div[text()='Select Jurisdiction']"); // change
	private By selectQubec = By.xpath("//*[text()='Quebec']");
	private By selectCalifornia = By.xpath("//*[text()='California']");
	private By selectNovaScotia = By.xpath("//*[text()='Nova Scotia']");
	private By selectWashington = By.xpath("//*[text()='Washington']");
	private By selectlanguage = By.xpath("//div[text()='Select Language']");
	private By selectEnglish = By.xpath("//*[text()='English']");
	private By selectFrench = By.xpath("//*[text()='French']");
	private By contbutton = By.xpath("//button[text()='CONTINUE']"); // change
	private By userid = By.xpath("//input[@name='email']");
	private By answer = By.xpath("//input[@id='Answer']");
	private By useridWithLabel = By.xpath("//label[text()='User ID']");
	private By passphrase = By.xpath("//input[@name='password']");
	private By passphraseWithlabel = By.xpath("//label[text()='Passphrase']");
	private By rememberMeCheckbox = By.xpath("//span[text()='Remember me']");
	private By loginbutton = By.xpath("//button[text()='Log In']");
	private By answerField = By.xpath("//input[@id='Answer']");
	private By continueButtonForLogin = By.xpath("//button[text()='CONTINUE']");
	private By welButton = By.xpath("//button[contains(text(),'Welcome,')]");
	private By userProfileOption = By.xpath("//a[contains(text(),'User Profile')]");
	private By lastLoginText = By.xpath("//p[@class='text']");
	private By securityQuestion1ForLogin = By.xpath("//*[@class='MuiTypography-root MuiTypography-h6 css-1etlmxt']");
	private By logoutbutton = By.xpath("//a[contains(text(),'Logout')]"); // change
	private By forgotUserIdLink = By.xpath("//a[text()='Forgot User ID?']"); // change
	private By emailAddress = By.xpath("//input[@id='emailId']");
	private By emailAddressWithLabel = By.xpath("//h6[text()='Please enter a valid email address:']");
	private By forgotUserContbutton = By.xpath("//button[text()='CONTINUE']"); // change
	private By forgotPassphraseLink = By.xpath("//a[text()='Forgot Passphrase?']"); // change
	private By userIDWithLabel = By.xpath("//h6[text()='Please enter your User ID:']");
	private By userAddress = By.xpath("//*[@name='emailId']");
	private By forgotPassphraseContbutton = By.xpath("//button[text()='CONTINUE']"); // change
	private By sucMessageForUseID = By
			.xpath("//p[text()='Email with User ID information is sent to your registered email address.']");
	private By errorMessageForUserID = By.xpath("//span[text()='Enter valid Email Address']");
	private By sucMessageForPass = By.xpath(
			"//p[text()='Email with instruction to reset passphrase will be sent to registered email address.']");
	private By loginErrorMessField = By.xpath("//p[text()='Enter valid User ID']");
	private By loginErrorMess = By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']");
	private By announBar = By.xpath("//div[text()='ANNOUNCEMENTS']");
	private By jurisSelDropdown = By.xpath("//div[text()='Jurisdiction']");
	private By LangSelDropdown = By.xpath("//div[text()='Language']");
	private By home = By.xpath("//a[text()='HOME']");
	private By userRegistration = By.xpath("//button[text()='USER REGISTRATION']");
	private By fAQAndResorces = By.xpath("//button[text()='FAQs & RESOURCES']");
	private By noticeSection = By.xpath("//h4[@class='MuiTypography-root MuiTypography-h4 MuiTypography-gutterBottom css-1hwdpu2']");
	private By aboutWCI = By.xpath("//p[text()='About WCI, Inc.']");
	private By copyright = By.xpath("//p[text()='Copyright © 2019']");
	private By termsAndCondi = By.xpath("//p[text()='WCI, Inc. Terms of Use']");
	private By contactUs = By.xpath("//*[text()='Contact Us']");
	private By loginModule = By.xpath("//h4[text()='Log In']");
	private By welcomeText = By.xpath("//h3[text()='Welcome!']");
	private By disclaimer = By.xpath("//span[text()='Disclaimer']");
	private By wciIncRegistryPlatformText = By.xpath("//h2[text()='WCI, Inc. Registry Platform']");
	private By continuebtn = By.xpath("//button[text()='CONTINUE']");
	private By passphrase1 = By.xpath("//*[@type='password']");
	private By contactUsLink = By.xpath("//*[text()='Contact Us']");
	private By jurisDropdown = By.xpath("//div[@id='jurisdiction']");
	private By selectJurisdiction = By.xpath("//li[text()='Select Jurisdiction']");
	private By selectCalifor = By.xpath("//li[text()='California']");
	private By name = By.xpath("//input[@id='name']");
	private By phone = By.xpath("//input[@id='phone']");
	private By emailAddressCont = By.xpath("//input[@id='email_address']");
	private By message = By.xpath("//body[@id='tinymce']");
	private By sendButtonContactUsPage = By.xpath("//button[text()='Send']");
	private By iframe = By.xpath("//*[@id=\"email_message_ifr\"]");
	private By contactUsText = By.xpath("//h1[text()='Contact Us']");
	private By jurisdictionLabelContactUsPage = By.xpath("//label[text()='Jurisdiction']");
	private By nameLabelContactUsPage = By.xpath("//label[text()='Name']");
	private By mobilePhoneLabelContactUsPage = By.xpath("//label[text()='Mobile Phone']");
	private By emailLabelContactUsPage = By.xpath("//label[text()='Email']");
	private By messageLabelContactUsPage = By.xpath("//label[text()='Message']");
	private By discardButtonContactUsPage = By.xpath("//button[text()='Discard']");
	private By errorMessageForJurisdictionOnContactUs = By.xpath("//p[text()='Jurisdiction  is required']");
	private By errorMessageForNameOnContactUs = By.xpath("//*[@id='name-helper-text']");
	private By errorMessageForMobilePhoneOnContactUs = By.xpath("//p[@id='phone-helper-text']");
	private By errorMessageForEmailOnContactUs = By.xpath("//p[@id='email_address-helper-text']");
	private By errorMessageForMessageOnContactUs = By.xpath("//span[text()='Message  is required']");
	private By sendButtonOnContactUsPage = By.xpath("//button[@data-testid='contact_us_save']");
	private By lastloginDate = By.xpath("//span[@style='font-size: 12px; font-weight: 500;']");
	private By postLoginStatusPending = By.xpath("//div[@class='MuiBox-root css-knkskr']");
	private By wCIIncTermsOfUseLinkInFotter = By.xpath("//p[text()='WCI, Inc. Terms of Use']");
	private By userReferenceCode = By.xpath("(//p[text()='User Reference Code:'])[1]");
	private By Exportbtn = By.xpath("(//button[@aria-label='Export'])[1]");
	private By csvfileexcel = By.xpath("//*[text()='Download as CSV']");
	private By fileexcel = By.xpath("//*[text()='Download as Excel']");
	private By securityque1 = By.xpath("//h6[text()='In which city or town was your first job?']");
	private By anssecurityque1 = By.xpath("//input[@id='Answer']");
	private By anssecurityque2 = By.xpath("//input[@id='answer2']");
	private By anssecurityque3 = By.xpath("//input[@id='answer3']");
	
	private By homeTextOnMenuBar = By.xpath("//a[contains(text(),'HOME')]");
	private By settingsTextOnMenuBar = By.xpath("//button[contains(text(),'SETTINGS')]");
	private By searchTextOnMenuBar = By.xpath("//button[contains(text(),'SEARCH')]");
	private By searchUseresSection = By.xpath("//button[contains(text(),'Search Users')]");
	private By columnsInGrid = By.xpath("(//button[contains(text(),'Columns')])[1]");
	private By filtersInGrid = By.xpath("(//button[contains(text(),'Filters')])[1]");
	private By exportInGrid = By.xpath("(//button[contains(text(),'Export')])[1]");
	private By userMangementSection = By.xpath("//*[contains(text(),'USER MANAGEMENT')]");
	private By searchAlluserSubSection = By.xpath("//*[contains(text(),'Search All Users')]");
	private By pendingRequestGrid = By.xpath("//*[contains(text(),'Pending Requests')]");
	
	private By cancelUserRegistrationOption = By.xpath("//span[contains(text(),'Cancel User Registration')]");
	private By yesIwantToCancelApplicationPopupButton = By.xpath("//button[contains(text(),'Yes, I want to cancel the application')]");

	public Homepage() {
		PageFactory.initElements(driver, this);
		
	}
	
	public void uiTestForJUHomePage() {
		System.out.println("Below elements display on JU user Home page:");
		ObjectRepo.test.log(Status.PASS, "Below elements display on JU user Home page:");
		String home = driver.findElement(homeTextOnMenuBar).getText();
		System.out.println(home);
		Assert.assertEquals("HOME", home);
		ObjectRepo.test.log(Status.PASS, home);
		String settings = driver.findElement(settingsTextOnMenuBar).getText();
		System.out.println(settings);
		Assert.assertEquals("SETTINGS", settings);
		ObjectRepo.test.log(Status.PASS, settings);
		String search = driver.findElement(searchTextOnMenuBar).getText();
		System.out.println(search);
		Assert.assertEquals("SEARCH", search);
		ObjectRepo.test.log(Status.PASS, search);
		String searchUser = driver.findElement(searchUseresSection).getText();
		System.out.println(searchUser);
		Assert.assertEquals("Search Users", searchUser);
		ObjectRepo.test.log(Status.PASS, searchUser);
		String columns = driver.findElement(columnsInGrid).getText();
		System.out.println(columns);
		Assert.assertEquals("Columns", columns);
		ObjectRepo.test.log(Status.PASS, columns);
		String filters = driver.findElement(filtersInGrid).getText();
		System.out.println(filters);
		//Assert.assertEquals("Filters", filters);
		ObjectRepo.test.log(Status.PASS, filters);
		String export = driver.findElement(exportInGrid).getText();
		System.out.println(export);
		Assert.assertEquals("Export", export);
		ObjectRepo.test.log(Status.PASS, export);
		String userManagement = driver.findElement(userMangementSection).getText();
		System.out.println(userManagement);
		Assert.assertEquals("USER MANAGEMENT", userManagement);
		ObjectRepo.test.log(Status.PASS, userManagement);
		String searchAllUser = driver.findElement(searchAlluserSubSection).getText();
		System.out.println(searchAllUser);
		Assert.assertEquals("Search All Users", searchAllUser);
		ObjectRepo.test.log(Status.PASS, searchAllUser);
		String pendingRequest = driver.findElement(pendingRequestGrid).getText();
		System.out.println(pendingRequest);
		Assert.assertEquals("Pending Requests", pendingRequest);
		ObjectRepo.test.log(Status.PASS, pendingRequest);
	}

	public void userProfile() throws InterruptedException { 
		Thread.sleep(2000);
		WebElement element = driver.findElement(welButton);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		System.out.println("step : Click on welcome menu");
		ObjectRepo.test.log(Status.PASS, "step : Click on welcome menu");
		WebElement element2 = driver.findElement(userProfileOption);
		js2.executeScript("arguments[0].click()", element2);
		//driver.findElement(userProfileOption).click();
		System.out.println("step : Click on user profile option");
		ObjectRepo.test.log(Status.PASS, "step : Click on user profile option");
		driver.findElement(cancelUserRegistrationOption).click();
		System.out.println("step : Click on user registration otion");
		ObjectRepo.test.log(Status.PASS, "step : Click on user registration otion");
		driver.findElement(yesIwantToCancelApplicationPopupButton).click();
		System.out.println("User cancel user registration successfully");
		ObjectRepo.test.log(Status.PASS, "User cancel user registration successfully");
		
	}
	public void accessibilityWCIIncTermsOfUseLinkBeforeLogin() throws InterruptedException {
		String wCIIncRegistryTextInHomePage = driver.findElement(wciIncRegistryPlatformText).getText();
		System.out.println(wCIIncRegistryTextInHomePage);
		System.out.println("step : Observe the WCI Inc Terms of use link in footer ");
		ObjectRepo.test.log(Status.PASS, "step : Observe the WCI Inc Terms of use link in footer");
		// new WebDriverWait(driver,
		// 60).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='2.
		// Submit Required Documents']")));
		String wCIIncTermsOfUseLink = driver.findElement(wCIIncTermsOfUseLinkInFotter).getText();
		System.out.println(wCIIncTermsOfUseLink);
		ObjectRepo.test.log(Status.PASS, wCIIncTermsOfUseLink);
		System.out.println("step : Click on WCI Inc Terms of use link in footer ");
		ObjectRepo.test.log(Status.PASS, "step : Click on WCI Inc Terms of use link in footer ");
		WebElement element = driver.findElement(wCIIncTermsOfUseLinkInFotter);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		Thread.sleep(5000);
		// driver.findElement(wCIIncTermsOfUseLinkInFotter).click();
		System.out.println("User should be able to access PDF  file for  Wci Inc terms of use");
		ObjectRepo.test.log(Status.PASS, "User should be able to access PDF  file for  Wci Inc terms of use");
	}

	public void accessibilityWCIIncTermsOfUseLinkAfterLogin() throws InterruptedException {
		String postLoginStatus = driver.findElement(postLoginStatusPending).getText();
		System.out.println(postLoginStatus);
		System.out.println("step : Observe the WCI Inc Terms of use link in footer ");
		ObjectRepo.test.log(Status.PASS, "step : Observe the WCI Inc Terms of use link in footer ");
		// new WebDriverWait(driver,
		// 60).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='2.
		// Submit Required Documents']")));
		String wCIIncTermsOfUseLink = driver.findElement(wCIIncTermsOfUseLinkInFotter).getText();
		System.out.println(wCIIncTermsOfUseLink);
		ObjectRepo.test.log(Status.PASS, wCIIncTermsOfUseLink);
		System.out.println("step : Click on WCI Inc Terms of use link in footer ");
		ObjectRepo.test.log(Status.PASS, "step : Click on WCI Inc Terms of use link in footer ");
		WebElement element = driver.findElement(wCIIncTermsOfUseLinkInFotter);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		Thread.sleep(5000);
		// driver.findElement(wCIIncTermsOfUseLinkInFotter).click();
		System.out.println("User should be able to access PDF  file for  Wci Inc terms of use");
		ObjectRepo.test.log(Status.PASS, "User should be able to access PDF  file for  Wci Inc terms of use");
	}

	public void applicationStatusPostLogin() {
		System.out.println("Home page should be opened");
		ObjectRepo.test.log(Status.PASS, "Home page should be opened");
		System.out.println("Step: Observe the registration application status");
		ObjectRepo.test.log(Status.PASS, "Step: Observe the registration application status");
		String postLoginStatus = driver.findElement(postLoginStatusPending).getText();
		System.out.println("The user registration status after login is :" + postLoginStatus);
		//Assert.assertEquals(postLoginStatus, "REGISTRATION APPLICATION STATUS: PENDING");
		ObjectRepo.test.log(Status.PASS, "The user registration status after login is :" + postLoginStatus);
		System.out.println("Step: Observe the user reference code");
		ObjectRepo.test.log(Status.PASS, "Step: Observe the user reference code");
		String userReferenceCodeForPendingUserStatus = driver.findElement(userReferenceCode).getText();
		System.out.println(userReferenceCodeForPendingUserStatus);
		//Assert.assertEquals(userReferenceCodeForPendingUserStatus, "User Reference Code:21c4805a-fe5");
		ObjectRepo.test.log(Status.PASS, "The user reference code is :" + userReferenceCodeForPendingUserStatus);
	}

	public void verifyLastLoginAndNewSuccessfulLogin() throws InterruptedException {
		driver.findElement(welButton).click();
		String lastLoginTextFirstTime = driver.findElement(lastLoginText).getText();
		System.out.println(lastLoginTextFirstTime);
		new WebDriverWait(driver, 60).until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//span[@style='font-size: 12px; font-weight: 500;']")));
		String lastLoginDateAndTime = driver.findElement(lastloginDate).getText();
		System.out.println(lastLoginDateAndTime);
		driver.findElement(logoutbutton).click();
		Thread.sleep(10000);
		driver.findElement(userid).sendKeys(prop.getProperty("LoginAsPendingUserID"));
		driver.findElement(passphrase).sendKeys(prop.getProperty("LoginAsPendingUserPassword"));
		driver.findElement(loginbutton).click();
		driver.findElement(welButton).click();
		String lastLoginTextAfterLogin = driver.findElement(lastLoginText).getText();
		System.out.println(lastLoginTextAfterLogin);
		new WebDriverWait(driver, 60).until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//span[@style='font-size: 12px; font-weight: 500;']")));
		String lastLoginDateAndTimeAfterNewLogin = driver.findElement(lastloginDate).getText();
		System.out.println(lastLoginDateAndTimeAfterNewLogin);
	}

	public void displayLastLoginDateAndTimeAfterLogin() throws InterruptedException {
		driver.findElement(welButton).click();
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(lastLoginText));
		boolean element= driver.findElement(lastLoginText).isDisplayed();
		Assert.assertTrue(element);
		String lastLoginTextAfterLogin = driver.findElement(lastLoginText).getText();
		System.out.println(lastLoginTextAfterLogin);
		new WebDriverWait(driver, 60).until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//span[@style='font-size: 12px; font-weight: 500;']")));
		boolean element1= driver.findElement(lastloginDate).isDisplayed();
		Assert.assertTrue(element1);
		//Thread.sleep(2000);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		WebElement element2 = driver.findElement(logoutbutton);
		js2.executeScript("arguments[0].click()", element2);
	}
	
	

//	public void contactUsForNotLoggedInUserWithEmptyData() {
//		// new WebDriverWait(driver,
//		// 60).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='WCI,
//		// Inc. Registry Platform']")));
//		// driver.findElement(contactUsLink).click();
//		WebElement element = driver.findElement(contactUsLink);
//		JavascriptExecutor js2 = (JavascriptExecutor) driver;
//		js2.executeScript("arguments[0].click()", element);
//		System.out.println("step : Click on Contact Us link  ");
//		ObjectRepo.test.log(Status.PASS, "step : Click on Contact Us Link");
//		WebElement element4=driver.findElement(jurisDropdown);
//		driver.findElement(jurisDropdown).click();
//	    Actions action=new Actions(driver);
//	    action.moveToElement(element4).build().perform();
//	    action.click(element4).build().perform();
//		//driver.findElement(selectJurisdiction).click();
//		//driver.findElement(selectJurisdiction).click();
//		driver.findElement(name).click();
//		driver.findElement(name).sendKeys("");
//		driver.findElement(phone).click();
//		driver.findElement(phone).sendKeys("");
//		driver.findElement(emailAddressCont).click();
//		driver.findElement(emailAddressCont).sendKeys("");
//		driver.switchTo().frame(driver.findElement(iframe));
//		WebElement element1 = driver.findElement(message);
//		js2.executeScript("arguments[0].click()", element1);
//		// driver.findElement(message).click();
//		driver.findElement(message).sendKeys("");
//		driver.switchTo().parentFrame();
//		// driver.findElement(messageLabelContactUsPage).click();
//		WebElement element3 = driver.findElement(messageLabelContactUsPage);
//		js2.executeScript("arguments[0].click()", element3);
//		String errorMessageForJurisDrop = driver.findElement(errorMessageForJurisdictionOnContactUs).getText();
//		System.out.println("Error message for Jurisdiction Dropdown :" + errorMessageForJurisDrop);
//		String errorMessageForMobile = driver.findElement(errorMessageForMobilePhoneOnContactUs).getText();
//		System.out.println("Error message for Mobile Phone field :" + errorMessageForMobile);
//		String errorMessageForEmail = driver.findElement(errorMessageForEmailOnContactUs).getText();
//		System.out.println("Error message for Email field :" + errorMessageForEmail);
//		String errorMessageForMessage = driver.findElement(errorMessageForMessageOnContactUs).getText();
//		System.out.println("Error message for Message field :" + errorMessageForMessage);
//		// driver.close();
//		// driver.navigate().to("https://qa.wci-registry.org/");
//	}

	public void uiTestForContactUsOnHomePage() {
		new WebDriverWait(driver, 60).until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='WCI, Inc. Registry Platform']")));
		WebElement element = driver.findElement(contactUsLink);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		// driver.findElement(contactUsLink).click(); 
		System.out.println("step : Click on Contact Us link  ");
		ObjectRepo.test.log(Status.PASS, "step : Click on Contact Us Link");
		System.out.println("Step : View the Contact Us page.");
		ObjectRepo.test.log(Status.PASS, "Step : View the Contact Us page.");
		System.out.println("Following elements should be available on Contact Us Page :");
		String contactUsTextOnContactPage = driver.findElement(contactUsText).getText();
		System.out.println(contactUsTextOnContactPage);
		Assert.assertEquals(contactUsTextOnContactPage, "Contact Us");
		String jurisdictionDropdownOnContactPage = driver.findElement(jurisdictionLabelContactUsPage).getText();
		System.out.println(jurisdictionDropdownOnContactPage);
		Assert.assertEquals(jurisdictionDropdownOnContactPage, "Jurisdiction*");
		String nameFieldOnContactPage = driver.findElement(nameLabelContactUsPage).getText();
		System.out.println(nameFieldOnContactPage);
		Assert.assertEquals(nameFieldOnContactPage, "Name*");
		String mobilePhoneFieldOnContactPage = driver.findElement(mobilePhoneLabelContactUsPage).getText();
		System.out.println(mobilePhoneFieldOnContactPage);
		Assert.assertEquals(mobilePhoneFieldOnContactPage, "Mobile Phone*");
		String messageFieldOnContactPage = driver.findElement(messageLabelContactUsPage).getText();
		System.out.println(messageFieldOnContactPage);
		Assert.assertEquals(messageFieldOnContactPage, "Message*");
		String sendButtonOnContactPage = driver.findElement(sendButtonContactUsPage).getText();
		System.out.println(sendButtonOnContactPage);
		Assert.assertEquals(sendButtonOnContactPage, "SEND");
		String discardButtonOnContactPage = driver.findElement(discardButtonContactUsPage).getText();
		System.out.println(discardButtonOnContactPage);
		Assert.assertEquals(discardButtonOnContactPage, "DISCARD");
		ObjectRepo.test.log(Status.PASS, "Following elements should be available on Contact Us Page : ");
		ObjectRepo.test.log(Status.PASS,
				contactUsTextOnContactPage + "," + jurisdictionDropdownOnContactPage + "," + nameFieldOnContactPage
						+ "," + mobilePhoneFieldOnContactPage + "," + messageFieldOnContactPage + ","
						+ sendButtonOnContactPage + "," + discardButtonOnContactPage);
	}

	public void uiTestForLoginModuleOnHomePage() {
		System.out.println("Step 1: Hit the URL ' https://qa.wci-registry.org/ '");
		ObjectRepo.test.log(Status.PASS, "Step 1: Hit the URL ' https://qa.wci-registry.org/ ' ");
		System.out.println("Step 2: Select Jurisdiction and Select Language and Click on Continue button");
		ObjectRepo.test.log(Status.PASS,
				"Step 2: Select Jurisdiction and Select Language and Click on Continue button");
		System.out.println("Step 3: View the Login Section on  Home  page.");
		ObjectRepo.test.log(Status.PASS, "Step 3: View the Login Section on  Home  page.");
		System.out.println("Following elements should be available on login module :");
		String userIDField = driver.findElement(useridWithLabel).getText();
		System.out.println(userIDField);
		Assert.assertEquals(userIDField, "User ID");
		String passphraseField = driver.findElement(passphraseWithlabel).getText();
		System.out.println(passphraseField);
		Assert.assertEquals(passphraseField, "Passphrase");
		String rememberMe = driver.findElement(rememberMeCheckbox).getText();
		System.out.println(rememberMe);
		Assert.assertEquals(rememberMe, "Remember me");
		String loginButton = driver.findElement(loginbutton).getText();
		System.out.println(loginButton);
		Assert.assertEquals(loginButton, "LOG IN");
		String forgotUserIDLink = driver.findElement(forgotUserIdLink).getText();
		System.out.println(forgotUserIDLink);
		Assert.assertEquals(forgotUserIDLink, "Forgot User ID?");
		String forgotPassphraselink = driver.findElement(forgotPassphraseLink).getText();
		System.out.println(forgotPassphraselink);
		Assert.assertEquals(forgotPassphraselink, "Forgot Passphrase?");
		ObjectRepo.test.log(Status.PASS, "Following elements should be available on login module : ");
		ObjectRepo.test.log(Status.PASS, userIDField + "," + passphraseField + "," + rememberMe + "," + loginButton
				+ "," + forgotUserIDLink + "," + forgotPassphraselink);
	}

	public void uiTestForLandingPageUnknownUser() {
		System.out.println("Step 1: Hit the URL ' https://qa.wci-registry.org/ '");
		ObjectRepo.test.log(Status.PASS, "Step 1: Hit the URL ' https://qa.wci-registry.org/ ' ");
		System.out.println("Step 2: Observe the Select Jurisdiction popup");
		ObjectRepo.test.log(Status.PASS, "Step 2: Observe the Select Jurisdiction popup ");
		System.out.println("Following elements should be available on Select Jurisdiction popup: ");
		String selJurisdiction = driver.findElement(selectjurisdiction).getText();
		System.out.println(selJurisdiction);
		Assert.assertEquals(selJurisdiction, "Select Jurisdiction");
		String selLanguage = driver.findElement(selectlanguage).getText();
		System.out.println(selLanguage);
		Assert.assertEquals(selLanguage, "Select Language");
		String contButton = driver.findElement(contbutton).getText();
		System.out.println(contButton);
		Assert.assertEquals(contButton, "CONTINUE");
		ObjectRepo.test.log(Status.PASS, "Following elements should be available on Select Jurisdiction popup: ");
		ObjectRepo.test.log(Status.PASS, selJurisdiction + "," + selLanguage + "," + contButton);

	}

	public void uiTestForLandingPageKnownUser() {
		System.out.println("Step 1: Hit the URL ' https://qa.wci-registry.org/ '");
		ObjectRepo.test.log(Status.PASS, "Step 1: Hit the URL ' https://qa.wci-registry.org/ ' ");
		System.out.println("Step 2: Select Jurisdiction and Select Language and Click on Continue button");
		ObjectRepo.test.log(Status.PASS,
				"Step 2: Select Jurisdiction and Select Language and Click on Continue button");
		System.out.println("Step 3: Observe the landing page for known user.");
		ObjectRepo.test.log(Status.PASS, "Step 3: Observe the landing page for known user.");
		System.out.println("Following elements should be available on landing page for known user :");
		String announceBar = driver.findElement(announBar).getText();
		System.out.println(announceBar);
		Assert.assertEquals(announceBar, "ANNOUNCEMENTS");
		String juriSelDrop = driver.findElement(jurisSelDropdown).getText();
		System.out.println(juriSelDrop);
		String LangSelDrop = driver.findElement(LangSelDropdown).getText();
		System.out.println(LangSelDrop);
		String homeMenu = driver.findElement(home).getText();
		System.out.println(homeMenu);
		Assert.assertEquals(homeMenu, "HOME");
		String userRegis = driver.findElement(userRegistration).getText();
		System.out.println(userRegis);
		Assert.assertEquals(userRegis, "USER REGISTRATION");
		String fAQandRes = driver.findElement(fAQAndResorces).getText();
		System.out.println(fAQandRes);
		Assert.assertEquals(fAQandRes, "FAQs & RESOURCES");
		String noticeSec = driver.findElement(noticeSection).getText();
		System.out.println(noticeSec);
		Assert.assertEquals(noticeSec, "NOTICES");
		String aboutWcilink = driver.findElement(aboutWCI).getText();
		System.out.println(aboutWcilink);
		Assert.assertEquals(aboutWcilink, "About WCI, Inc.");
		String copyrightLink = driver.findElement(copyright).getText();
		System.out.println(copyrightLink);
		Assert.assertEquals(copyrightLink, "Copyright © 2019");
		String termsAndCondiLink = driver.findElement(termsAndCondi).getText();
		System.out.println(termsAndCondiLink);
		Assert.assertEquals(termsAndCondiLink, "WCI, Inc. Terms of Use");
		String contactUsLink = driver.findElement(contactUs).getText();
		System.out.println(contactUsLink);
		Assert.assertEquals(contactUsLink, "Contact Us");
		String loginModu = driver.findElement(loginModule).getText();
		System.out.println(loginModu);
		Assert.assertEquals(loginModu, "Log In");
		String welcome = driver.findElement(welcomeText).getText();
		System.out.println(welcome);
		Assert.assertEquals(welcome, "Welcome!");
		String disclai = driver.findElement(disclaimer).getText();
		System.out.println(disclai);
		Assert.assertEquals(disclai, "Disclaimer:");
		String wciIncRegPlat = driver.findElement(wciIncRegistryPlatformText).getText();
		System.out.println(wciIncRegPlat);
		Assert.assertEquals(wciIncRegPlat, "WCI, Inc. Registry Platform");
		ObjectRepo.test.log(Status.PASS, "Following elements should be available on landing page for known user : ");
		ObjectRepo.test.log(Status.PASS,
				announceBar + "," + juriSelDrop + "," + LangSelDrop + "," + homeMenu + "," + userRegis + "," + fAQandRes
						+ "," + noticeSec + "," + aboutWcilink + "," + copyrightLink + "," + termsAndCondiLink + ","
						+ contactUsLink + "," + loginModu + "," + welcome + disclai + "," + wciIncRegPlat);

	}

	public void selectJurisdictionForQubec() {
		driver.findElement(selectjurisdiction).click();
		driver.findElement(selectQubec).click();
		System.out.println("Step : Select Quebec Jurisdiction");
		driver.findElement(contbutton).click();
		System.out.println("Step : Click On continue button");

	}

	public void selectjurisdictionForCalifornia() {
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.findElement(selectjurisdiction).click();
		driver.findElement(selectCalifornia).click();
//		driver.findElement(selectlanguage).click();
//		driver.findElement(selectEnglish).click();
		driver.findElement(contbutton).click();
	}
	
	public void homePageDisplayedInSelectedjurisdictionAndLanguage() throws InterruptedException {
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.findElement(selectjurisdiction).click();
		driver.findElement(selectCalifornia).click();
		String SelectedJurisdictionOnLandingPageForUnknownUser=driver.findElement(By.xpath("(//div[@aria-haspopup='listbox'])[1]")).getText();
		System.out.println("Selected Jurisdiction is:"+SelectedJurisdictionOnLandingPageForUnknownUser);
		ObjectRepo.test.log(Status.PASS, "Selected Jurisdiction is:"+SelectedJurisdictionOnLandingPageForUnknownUser);
		Thread.sleep(2000);
		String byDefaultlanguageOnLandingPageForUnknownUser=driver.findElement(By.xpath("(//div[@aria-haspopup='listbox'])[2]")).getText();
		System.out.println("By default language is:"+byDefaultlanguageOnLandingPageForUnknownUser);
		ObjectRepo.test.log(Status.PASS, "By default language is:"+byDefaultlanguageOnLandingPageForUnknownUser);
		driver.findElement(contbutton).click();
		Thread.sleep(2000);
	    String SelectedJurisdictionOnHomePage=driver.findElement(By.xpath("(//div[@id='simple-select'])[1]")).getText();
		System.out.println("Selected Jurisdiction on home page is:"+SelectedJurisdictionOnHomePage);
		ObjectRepo.test.log(Status.PASS, "Selected Jurisdiction on home page is:"+SelectedJurisdictionOnHomePage);
		String SelectedLanguageOnHomePage=driver.findElement(By.xpath("(//div[@id='simple-select'])[2]")).getText();
		System.out.println("Selected language on home page is:"+SelectedLanguageOnHomePage);
		ObjectRepo.test.log(Status.PASS, "Selected language on home page is:"+SelectedLanguageOnHomePage);
		Assert.assertEquals(SelectedJurisdictionOnLandingPageForUnknownUser, SelectedJurisdictionOnHomePage);
		Assert.assertEquals(byDefaultlanguageOnLandingPageForUnknownUser, SelectedLanguageOnHomePage);
	}

	public void selectjurisdictionForNovaScotia() {
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.findElement(selectjurisdiction).click();
		driver.findElement(selectNovaScotia).click();
		// driver.findElement(selectlanguage).click();
		// driver.findElement(selectEnglish).click();
		driver.findElement(contbutton).click();
	}

	public void selectjurisdictionForWashington() {
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.findElement(selectjurisdiction).click();
		WebElement element = driver.findElement(selectWashington);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		// driver.findElement(selectlanguage).click();
		// driver.findElement(selectEnglish).click();
		driver.findElement(contbutton).click();
	}

	public void loginAsUser() {
//		driver.findElement(userid).sendKeys(prop.getProperty("LoginAsPendingUserID"));
		driver.findElement(userid).sendKeys(TestDataByRegEx.Username(10));
		System.out.println("step : Enter Valid User Id  ");
		ObjectRepo.test.log(Status.PASS, "step1 : Enter valid User Id ");
		driver.findElement(passphrase).sendKeys(prop.getProperty("LoginAsPendingUserPassword"));
		System.out.println("step : Enter Valid passphrase  ");
		ObjectRepo.test.log(Status.PASS, "step1 : Enter valid passphrase ");
		WebElement element = driver.findElement(loginbutton);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		System.out.println("step : Click on login button  ");
		ObjectRepo.test.log(Status.PASS, "step1 : Click on login button ");
		driver.findElement(answerField).sendKeys(prop.getProperty("SecurityAnswer1"));
		driver.findElement(continueButtonForLogin).click();
		new WebDriverWait(driver, 60).until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='2. Submit Required Documents']")));
	}

	public void loginAsUser1() throws InterruptedException {
		driver.findElement(userid).sendKeys(prop.getProperty("LoginAsJurisdictionUserUsername"));
		System.out.println("step : Enter Valid User Id  ");
		driver.findElement(passphrase1).sendKeys(prop.getProperty("LoginAsJurisdictionUserPassword"));
		System.out.println("step : Enter Valid passphrase  ");
		WebElement element = driver.findElement(loginbutton);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		
		driver.findElement(By.xpath("(//*[@type='checkbox'])[3]")).click();
		System.out.println("step : Click on login button  ");
		handleSecurityQue();
		WebElement element1 = driver.findElement(continuebtn);
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("arguments[0].click()", element1);
		Thread.sleep(8000);
		WebDriverWait wait = new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.elementToBeClickable(Exportbtn));
		driver.findElement(Exportbtn).click();
		wait.until(ExpectedConditions.elementToBeClickable(csvfileexcel));
		driver.findElement(csvfileexcel).click();
		wait.until(ExpectedConditions.elementToBeClickable(Exportbtn));
		driver.findElement(Exportbtn).click();
		wait.until(ExpectedConditions.elementToBeClickable(fileexcel));
		driver.findElement(fileexcel).click();
	}

	public void handleSecurityQue() throws InterruptedException {
		String str = driver.findElement(securityque1).getText().trim();
		System.out.println(str);
		if (str.contains("job?")) {
			driver.findElement(anssecurityque1).sendKeys("Answer_1");
		} else if (str.contains("teacher?")) {
			driver.findElement(anssecurityque2).sendKeys("Answer_2");
		} else if (str.contains("card?")) {
			driver.findElement(anssecurityque3).sendKeys("Answer_3");
		} else {
			System.out.println("None of the above security question");
		}
	}

	public void loginAsApprovedUser() throws InterruptedException {
	    Thread.sleep(2000);
		driver.findElement(userid).sendKeys(prop.getProperty("LoginAsApprovedUserIDCalifornia"));
		System.out.println("step : Enter Valid User Id  ");
		ObjectRepo.test.log(Status.PASS, "step1 : Enter valid User Id ");
		driver.findElement(passphrase).sendKeys(prop.getProperty("LoginAsApprovedUserPasswordCalifornia"));
		System.out.println("step : Enter Valid passphrase  ");
		ObjectRepo.test.log(Status.PASS, "step1 : Enter valid passphrase ");
		WebElement element = driver.findElement(loginbutton);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		
		
		System.out.println("step : Click on login button  ");
		ObjectRepo.test.log(Status.PASS, "step1 : Click on login button ");
//		driver.findElement(answerField).sendKeys(prop.getProperty("SecurityAnswer1"));
//		driver.findElement(continueButtonForLogin).click();
	}

	public void loginAsJurisdictionUser() throws InterruptedException {
		Thread.sleep(2000);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.findElement(userid).sendKeys(prop.getProperty("LoginAsJurisdictionUserUsername"));
		driver.findElement(passphrase).sendKeys(prop.getProperty("LoginAsJurisdictionUserPassword"));
		WebElement element = driver.findElement(loginbutton);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
//		driver.findElement(answerField).sendKeys(prop.getProperty("SecurityAnswer1"));
//		driver.findElement(continueButtonForLogin).click();
//		new WebDriverWait(driver, 60)
//				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Search Users']")));
		// driver.findElement(loginbutton).click();
	}

	public void loginAsWCIIncAdminUser() throws InterruptedException {
		Thread.sleep(4000);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.findElement(userid).sendKeys(prop.getProperty("LoginAsWCIIncAdminUsername"));
		System.out.println("step : Enter Valid User Id  ");
		ObjectRepo.test.log(Status.PASS, "step1 : Enter valid User Id ");
		driver.findElement(passphrase).sendKeys(prop.getProperty("LoginAsWCIIncAdminPassword"));
		System.out.println("step : Enter Valid passphrase  ");
		ObjectRepo.test.log(Status.PASS, "step1 : Enter valid passphrase ");
		// driver.findElement(loginbutton).click();
		WebElement element = driver.findElement(loginbutton);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		System.out.println("step : Click on login button  ");
		ObjectRepo.test.log(Status.PASS, "step1 : Click on login button ");
//		driver.findElement(answerField).sendKeys(prop.getProperty("SecurityAnswer1"));
//		driver.findElement(continueButtonForLogin).click();
//		new WebDriverWait(driver, 60)
//				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Welcome!']")));
	}

	public void unsuccessfulLoginErrorField() {
		driver.findElement(userid).sendKeys(prop.getProperty("InvalidUserID1"));
		System.out.println("step1 : Enter Invalid User Id  ");
		ObjectRepo.test.log(Status.PASS, "step1 : Enter Invalid User Id ");
		driver.findElement(passphrase).sendKeys(prop.getProperty("InvalidPass"));
		System.out.println("step2 : Enter Invalid passphrase ");
		ObjectRepo.test.log(Status.PASS, "step2 : Enter Invalid passphrase ");
		driver.findElement(loginbutton).click();
		System.out.println("step3 : Click on login button ");
		ObjectRepo.test.log(Status.PASS, "step3 : Click on login button ");
		String message = driver.findElement(loginErrorMessField).getText();
		System.out.println("Error message :" + message);
		Assert.assertEquals(message, "Enter valid User ID");
		ObjectRepo.test.log(Status.PASS, message);
	}

	public void unsuccessfulLoginError() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(userid).sendKeys(prop.getProperty("InvalidUserID2"));
		System.out.println("step : Enter Invalid User Id  ");
		ObjectRepo.test.log(Status.PASS, "step1 : Enter Invalid User Id ");
		driver.findElement(passphrase).sendKeys(prop.getProperty("InvalidPass"));
		System.out.println("step : Enter Invalid passphrase ");
		ObjectRepo.test.log(Status.PASS, "step2 : Enter Invalid passphrase ");
		// driver.findElement(loginbutton).click();
		WebElement element = driver.findElement(loginbutton);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		System.out.println("step : Click on login button ");
		ObjectRepo.test.log(Status.PASS, "step : Click on login button ");
		Thread.sleep(2000);
		String message1 = driver.findElement(loginErrorMess).getText();
		System.out.println("Error message :" + message1);
		Assert.assertEquals(message1, "User ID or passphrase entered is invalid");
		ObjectRepo.test.log(Status.PASS, "Error message :" + message1);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@data-testid='CloseIcon']")).click();
	}

	public void logout() throws InterruptedException {
		//Thread.sleep(3000);
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Welcome,']")));
		WebElement element = driver.findElement(welButton);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		// driver.findElement(welButton).click();
		WebElement element1 = driver.findElement(logoutbutton);
		js2.executeScript("arguments[0].click()", element1);
		// driver.findElement(logoutbutton).click();
	}

	public void forgotIdValidData() {
		driver.findElement(forgotUserIdLink).click();
		System.out.println("step : Click on forgot UserId Link  ");
		ObjectRepo.test.log(Status.PASS, "step : Click on forgot UserId Link");
		System.out.println("step : Observe Forgot user Id pop-up  ");
		ObjectRepo.test.log(Status.PASS, "step : Observe Forgot user Id pop-up");
		System.out.println("Following elements should be available on Forgot User Id Pop-up : ");
		String emailAddressFieldOnPopup = driver.findElement(emailAddressWithLabel).getText();
		System.out.println(emailAddressFieldOnPopup);
		Assert.assertEquals(emailAddressFieldOnPopup, "Please enter a valid email address:");

//		String continueButtonOnPopup=driver.findElement(forgotUserContbutton).getText();
//		System.out.println(continueButtonOnPopup);
//		Assert.assertEquals(continueButtonOnPopup, "CONTINUE");
//		ObjectRepo.test.log(Status.PASS, "Following elements should be available on Forgot User Id Pop-up : " );
//		ObjectRepo.test.log(Status.PASS,  emailAddressFieldOnPopup+","+continueButtonOnPopup );

		driver.findElement(emailAddress).sendKeys(prop.getProperty("email"));
		System.out.println("step : Entered Valid EmailID");
		ObjectRepo.test.log(Status.PASS, "step : Entered Valid EmailID");
		driver.findElement(forgotUserContbutton).click();
		System.out.println("step : Click on continue button");
		ObjectRepo.test.log(Status.PASS, "step : Click on continue button");
		String message1 = driver.findElement(sucMessageForUseID).getText();
		System.out.println("success message :" + message1);
		Assert.assertEquals(message1, "Email with User ID information is sent to your registered email address.");
		ObjectRepo.test.log(Status.PASS, message1);

	}

	public void forgotIdInvalidData() {
		driver.findElement(forgotUserIdLink).click();
		System.out.println("step : Click on forgot UserId Link  ");
		ObjectRepo.test.log(Status.PASS, "step : Click on forgot UserId Link");
		driver.findElement(emailAddress).sendKeys(prop.getProperty("InvalidEmail"));
		System.out.println("step : Entered Invalid EmailID");
		ObjectRepo.test.log(Status.PASS, "step : Entered Invalid EmailID");
		String message1 = driver.findElement(errorMessageForUserID).getText();
		System.out.println("Error message :" + message1);
		Assert.assertEquals(message1, "Enter valid Email Address");
		ObjectRepo.test.log(Status.PASS, message1);

	}

	public void forgotIdEmptyData() {
		driver.findElement(forgotUserIdLink).click();
		System.out.println("step1 : Click on forgot UserId Link  ");
		ObjectRepo.test.log(Status.PASS, "step1 : Click on forgot UserId Link");
		driver.findElement(emailAddress).sendKeys("");
		System.out.println("step2 : Keep emaid address field empty");
		ObjectRepo.test.log(Status.PASS, "step2 : Keep email address field empty");
	}
	
	public void contactUsForNotLoggedInUserWithEmptyData() {
		WebElement element = driver.findElement(contactUsLink);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		System.out.println("step : Click on Contact Us link  ");
		ObjectRepo.test.log(Status.PASS, "step : Click on Contact Us Link");
		WebElement element4=driver.findElement(jurisDropdown);
		driver.findElement(jurisDropdown).click();
	    Actions action=new Actions(driver);
	    action.moveToElement(element4).build().perform();
	    action.click(element4).build().perform();
		driver.findElement(name).click();
		driver.findElement(name).sendKeys("");
		driver.findElement(phone).click();
		driver.findElement(phone).sendKeys("");
		driver.findElement(emailAddressCont).click();
		driver.findElement(emailAddressCont).sendKeys("");
		driver.switchTo().frame(driver.findElement(iframe));
		WebElement element1 = driver.findElement(message);
		js2.executeScript("arguments[0].click()", element1);
		driver.findElement(message).sendKeys("");
		driver.switchTo().parentFrame();
		driver.findElement(emailAddressCont).click();
		WebElement element3 = driver.findElement(messageLabelContactUsPage);
		js2.executeScript("arguments[0].click()", element3);
		String errorMessageForJurisDrop = driver.findElement(errorMessageForJurisdictionOnContactUs).getText();
		System.out.println("Error message for Jurisdiction Dropdown :" + errorMessageForJurisDrop);
		Assert.assertEquals(errorMessageForJurisDrop, "Jurisdiction is required");
		ObjectRepo.test.log(Status.PASS, "Error message for Jurisdiction Dropdown :" + errorMessageForJurisDrop);
		String errorMessageForName = driver.findElement(errorMessageForNameOnContactUs).getText();
		System.out.println("Error message for Name Field :" + errorMessageForName);
		Assert.assertEquals(errorMessageForName, "Name is required");
		ObjectRepo.test.log(Status.PASS, "Error message for Name Field :" + errorMessageForName);
		String errorMessageForMobile = driver.findElement(errorMessageForMobilePhoneOnContactUs).getText();
		System.out.println("Error message for Mobile Phone field :" + errorMessageForMobile);
		Assert.assertEquals(errorMessageForMobile, "Mobile Phone is required");
		ObjectRepo.test.log(Status.PASS, "Error message for Mobile Phone field :" + errorMessageForMobile);
		String errorMessageForEmail = driver.findElement(errorMessageForEmailOnContactUs).getText();
		System.out.println("Error message for Email field :" + errorMessageForEmail);
		Assert.assertEquals(errorMessageForEmail, "Email is required");
		ObjectRepo.test.log(Status.PASS, "Error message for Email field :" + errorMessageForEmail);
		String errorMessageForMessage = driver.findElement(errorMessageForMessageOnContactUs).getText();
		System.out.println("Error message for Message field :" + errorMessageForMessage);
		Assert.assertEquals(errorMessageForMessage, "Message is required");
		ObjectRepo.test.log(Status.PASS, "Error message for Message field :" + errorMessageForMessage);
		if(driver.findElement(sendButtonOnContactUsPage).isEnabled()) {
			System.err.println("Save Button is in enable state");
		}
		else {
			System.err.println("Save Button is in disable state");
		}
	}

public void checkMandetoryFieldsOnContactUsPage() throws InterruptedException {
		WebElement element = driver.findElement(contactUsLink);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		System.out.println("Below Are the mandetory fields for contact us page:");
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@for='customize-select'])[1]")));
		String jurisdictionDropdown = driver.findElement(By.xpath("(//*[@for='customize-select'])[1]")).getText();
		System.out.println("Mandetory Field is :" + jurisdictionDropdown);
		Assert.assertEquals(jurisdictionDropdown, "Jurisdiction*");
		ObjectRepo.test.log(Status.PASS, "Mandatory field is :" + jurisdictionDropdown);
		String nameField = driver.findElement(By.xpath("(//label[@for='customize-textfield'])[1]")).getText();
		System.out.println("Mandetory Field is :" + nameField);
		Assert.assertEquals(nameField, "Name*");
		ObjectRepo.test.log(Status.PASS, "Mandatory field is :" + nameField);
		String mobilePhoneField = driver.findElement(By.xpath("(//label[@for='customize-textfield'])[2]")).getText();
		System.out.println("Mandetory Field is :" + mobilePhoneField);
		Assert.assertEquals(mobilePhoneField, "Mobile Phone*");
		ObjectRepo.test.log(Status.PASS, "Mandatory field is :" + mobilePhoneField);
		String emailField = driver.findElement(By.xpath("(//label[@for='customize-textfield'])[3]")).getText();
		System.out.println("Mandetory Field is :" + emailField);
		Assert.assertEquals(emailField, "Email*");
		ObjectRepo.test.log(Status.PASS, "Mandatory field is :" + emailField);
		String messageField = driver.findElement(By.xpath("(//label[@for='customize-textfield'])[4]")).getText();
		System.out.println("Mandetory Field is :" + messageField);
		Assert.assertEquals(messageField, "Message*");
		ObjectRepo.test.log(Status.PASS, "Mandatory field is :" + messageField);
		
	}

public void contactUsPageForPublicUserWithInValidData() throws InterruptedException {
		WebElement element = driver.findElement(contactUsLink);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		System.out.println("step : Click on Contact Us link  ");
		ObjectRepo.test.log(Status.PASS, "step : Click on Contact Us Link");
		WebElement element4=driver.findElement(jurisDropdown);
	    Actions action=new Actions(driver);
	    action.moveToElement(element4).build().perform();
	    action.click(element4).build().perform();
	    driver.findElement(By.xpath("//li[@data-value='ORG#00101']")).click();
		driver.findElement(name).sendKeys(" Joh!!@##@!ne123");
		driver.findElement(phone).sendKeys("$#%$#$#%#$#%$##%$#$#");
		driver.findElement(emailAddressCont).sendKeys("#@%^%#$@#$@#.com");
		driver.switchTo().frame(driver.findElement(iframe));
		WebElement element1 = driver.findElement(message);
		js2.executeScript("arguments[0].click()", element1);
		driver.findElement(message).sendKeys("^&%^%&^%^&%%%^");
		driver.switchTo().parentFrame();
		driver.findElement(name).click();
		String errorMessageForName = driver.findElement(By.xpath("//*[@id='name-helper-text']")).getText();
		System.out.println("Error message for Name Field :" + errorMessageForName);
		Assert.assertEquals(errorMessageForName, "Invalid Name");
		ObjectRepo.test.log(Status.PASS, "Error message for Name Field :" + errorMessageForName);
		String errorMessageForMobile = driver.findElement(By.xpath("//*[@id='phone-helper-text']")).getText();
		System.out.println("Error message for Mobile Phone field :" + errorMessageForMobile);
		Assert.assertEquals(errorMessageForMobile, "Invalid Mobile Phone");
		ObjectRepo.test.log(Status.PASS, "Error message for Mobile Phone field :" + errorMessageForMobile);
		String errorMessageForEmail = driver.findElement(By.xpath("//*[@id='email_address-helper-text']")).getText();
		System.out.println("Error message for Email field :" + errorMessageForEmail);
		Assert.assertEquals(errorMessageForEmail, "Invalid Email");
		ObjectRepo.test.log(Status.PASS, "Error message for Email field :" + errorMessageForEmail);
		String errorMessageForMessage = driver.findElement(By.xpath("//*[text()='Invalid Message']")).getText();
		System.out.println("Error message for Message field :" + errorMessageForMessage);
		Assert.assertEquals(errorMessageForMessage, "Invalid Message");
		ObjectRepo.test.log(Status.PASS, "Error message for Message field :" + errorMessageForMessage);
		if(driver.findElement(sendButtonOnContactUsPage).isEnabled()) {
			System.err.println("Save Button is in enable state");
		}
		else {
			System.err.println("Save Button is in disable state");
		}
	}

public void loginWithValidUserIDAndInvalidPassphrase() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(userid).sendKeys("pravinjogi");
		System.out.println("step : Enter valid User Id  ");
		ObjectRepo.test.log(Status.PASS, "step1 : Enter Invalid User Id ");
		driver.findElement(passphrase).sendKeys(prop.getProperty("InvalidPass"));
		System.out.println("step : Enter Invalid passphrase ");
		ObjectRepo.test.log(Status.PASS, "step2 : Enter Invalid passphrase ");
		WebElement element = driver.findElement(loginbutton);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		System.out.println("step : Click on login button ");
		ObjectRepo.test.log(Status.PASS, "step : Click on login button ");
		Thread.sleep(2000);
		String message1 = driver.findElement(loginErrorMess).getText();
		System.out.println("Error message :" + message1);
		Assert.assertEquals(message1, "User ID or passphrase entered is invalid.");
		ObjectRepo.test.log(Status.PASS, "Error message :" + message1);
	}

public void incorrectAnswerToSecurityQuestion() throws InterruptedException {
		//Thread.sleep(2000);
		String firstQueAsk=driver.findElement(securityQuestion1ForLogin).getText();
		System.out.println("First Question is :" + firstQueAsk);
		String str=driver.findElement(securityQuestion1ForLogin).getText().trim();
		if(str.contains("first job?")) {
			driver.findElement(answerField).sendKeys("sdasdds");
		}
		else if(str.contains("maiden name?")){
			driver.findElement(answerField).sendKeys("asdsadas");
		}
		else if(str.contains("first car?")){
			driver.findElement(answerField).sendKeys("sdsadas");
		}
		else {
			System.out.println("Nothing");
		}
		//Thread.sleep(5000);
		driver.findElement(continueButtonForLogin).click();
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']")));
		String errorMessage = driver.findElement(By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']")).getText();
		System.out.println("Error message :" + errorMessage);
		Assert.assertEquals(errorMessage, "Invalid Answer");
		ObjectRepo.test.log(Status.PASS, "Error message :" + errorMessage);
		driver.findElement(By.xpath("//*[@data-testid='CloseIcon']")).click();
		String secondQueAsk=driver.findElement(securityQuestion1ForLogin).getText();
		System.out.println("second Question is :" + secondQueAsk);
	}

	public void forgotPassphraseValidData() {
		driver.findElement(forgotPassphraseLink).click();
		System.out.println("step : Click on forget passphrase link  ");
		ObjectRepo.test.log(Status.PASS, "step : Click on forgot passphrase Link");
		System.out.println("step : Observe Forgot passphrase pop-up  ");
		ObjectRepo.test.log(Status.PASS, "step : Observe Forgot passphrase pop-up");
		System.out.println("Following elements should be available on Forgot passphrase Pop-up : ");
		String emailAddressFieldOnFORPassPopup = driver.findElement(userIDWithLabel).getText();
		System.out.println(emailAddressFieldOnFORPassPopup);
		// Assert.assertEquals(emailAddressFieldOnPopup, "Please enter a valid email
		// address:");
//		String continueButtonOnFORPassPopup=driver.findElement(forgotPassphraseContbutton).getText();
//		System.out.println(continueButtonOnFORPassPopup);
//		//Assert.assertEquals(continueButtonOnFORPassPopup, "CONTINUE");
//		ObjectRepo.test.log(Status.PASS, "Following elements should be available on Forgot passphrase Pop-up : " );
//		ObjectRepo.test.log(Status.PASS,  emailAddressFieldOnFORPassPopup+","+continueButtonOnFORPassPopup );
		driver.findElement(userAddress).sendKeys("ankitP");
		System.out.println("step : Entered Valid UserID");
		ObjectRepo.test.log(Status.PASS, "step : Entered Valid UserID");
		driver.findElement(forgotPassphraseContbutton).click();
		System.out.println("step : Click on continue button");
		ObjectRepo.test.log(Status.PASS, "step : Click on continue button");
		String message2 = driver.findElement(sucMessageForPass).getText();
		System.out.println("success message :" + message2);
		Assert.assertEquals(message2,
				"Email with instruction to reset passphrase will be sent to registered email address.");
		ObjectRepo.test.log(Status.PASS, message2);

	}

	public void forgotPassphraseInvalidData() {
		driver.findElement(forgotPassphraseLink).click();
		System.out.println("step : Click on forget passphrase link  ");
		ObjectRepo.test.log(Status.PASS, "step : Click on forgot passohrase Link");
		driver.findElement(userAddress).sendKeys(prop.getProperty("InvalidUserID1"));
		System.out.println("step : Entered Invalid UserID");
		ObjectRepo.test.log(Status.PASS, "step : Entered Invalid UserID");
		driver.findElement(forgotPassphraseContbutton).click();
		System.out.println("step : Click on continue button");
		ObjectRepo.test.log(Status.PASS, "step : Click on continue button");
		String message2 = driver.findElement(sucMessageForPass).getText();
		System.out.println("success message :" + message2);
		Assert.assertEquals(message2,
				"Email with instruction to reset passphrase will be sent to registered email address.");
		ObjectRepo.test.log(Status.PASS, message2);

	}

	public void forgotPassphraseEmptyData() {
		driver.findElement(forgotPassphraseLink).click();
		System.out.println("step1 : Click on forget passphrase link  ");
		ObjectRepo.test.log(Status.PASS, "step1 : Click on forgot passohrase Link");
		driver.findElement(userAddress).sendKeys("");
		System.out.println("step2 : Keep User Id field empty ");
		ObjectRepo.test.log(Status.PASS, "step2 : Keep User Id field empty");

	}

	public void contactUsForNotLoggedInUser() {
		// new WebDriverWait(driver,
		// 60).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='WCI,
		// Inc. Registry Platform']")));
		WebElement element = driver.findElement(contactUsLink);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		// driver.findElement(contactUsLink).click();
		System.out.println("step : Click on Contact Us link  ");
		ObjectRepo.test.log(Status.PASS, "step : Click on Contact Us Link");
		driver.findElement(jurisDropdown).click();
		System.out.println("step : Click on Jurisdiction Dropdown ");
		ObjectRepo.test.log(Status.PASS, "step : Click on Jurisdiction Dropdown ");
		driver.findElement(selectCalifor).click();
		System.out.println("step : Select California from dropdown list ");
		ObjectRepo.test.log(Status.PASS, "step : Select California from dropdown list ");
		driver.findElement(name).sendKeys(prop.getProperty("FirstName"));
		System.out.println("step : Enter full name in name field ");
		ObjectRepo.test.log(Status.PASS, "step : Enter full name in name field  ");
		driver.findElement(phone).sendKeys(prop.getProperty("TelephoneNo"));
		System.out.println("step : Enter phone with country code ");
		ObjectRepo.test.log(Status.PASS, "step : Enter phone with country code  ");
		driver.findElement(emailAddressCont).sendKeys(prop.getProperty("email"));
		System.out.println("step : Enter email address in email field ");
		ObjectRepo.test.log(Status.PASS, "step : Enter email address in email field ");
		driver.switchTo().frame(driver.findElement(iframe));
		driver.findElement(message).sendKeys(prop.getProperty("Message"));
		System.out.println("step : Enter message in message field ");
		ObjectRepo.test.log(Status.PASS, "step : Enter message in message field ");
		driver.switchTo().parentFrame();
		// driver.findElement(saveButton).click();
		WebElement element1 = driver.findElement(sendButtonContactUsPage);
		js2.executeScript("arguments[0].click()", element1);
		System.out.println("step : Click on send button ");
		ObjectRepo.test.log(Status.PASS, "step : Click on send button ");
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']")));
		String successMessage=driver.findElement(By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']")).getText();
		System.out.println("Success Message for Contact us is:"+successMessage);
		Assert.assertEquals(successMessage, "Your request have been processed.");
	}

	public void contactUsAfterLogin() {
		new WebDriverWait(driver, 60).until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='2. Submit Required Documents']")));
		driver.findElement(contactUsLink).click();
		driver.findElement(jurisDropdown).click();
		driver.findElement(selectCalifor).click();
		// driver.findElement(name).sendKeys(prop.getProperty("FirstName"));
		driver.findElement(phone).sendKeys(prop.getProperty("TelephoneNo"));
		driver.switchTo().frame(driver.findElement(iframe));
		driver.findElement(message).sendKeys(prop.getProperty("Message"));
		driver.switchTo().parentFrame();
		driver.findElement(sendButtonContactUsPage).click();
	}

}
