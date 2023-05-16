package pageObjects;

import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
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

public class MyPOMClass extends base {

	
	public static String struserId;

	private By selectJurisdictionContButton = By.xpath("//button[text()='CONTINUE']");
	private By selectJurisdictionCancelButton = By.xpath("//button[text()='CANCEL']");
	private By forgotPassphraseLink = By.xpath("//a[text()='Forgot Passphrase?']"); // change
	private By emailAddress = By.xpath("//input[@id='emailId']");

	private By userIDWithLabel = By.xpath("//h6[text()='Please enter your User ID:']");
	private By successMessageForPassphrase = By
			.xpath("//p[text()='Email with instruction to reset passphrase will be sent to registered email address']");
	private By errorMessageForUserIDpassphrase = By.xpath("//span[text()='Enter valid User ID']");
	private By CONTINUEBtn = By.xpath("//button[text()='CONTINUE']");
	private By forgotUserContbutton = By.xpath("//button[text()='CONTINUE']"); // change

	private By btnSetting = By.xpath("//button[text()='SETTINGS']");
	private By btnCMS = By.xpath("//*[contains(text(),'Content Management System')]");
	private By btnHeader = By.xpath("//*[text()='Header']");
	private By textBox = By.xpath("(//*[@id='tinymce' and @data-id='ANNOUNCEMENTS'])");
	private By btnPreview = By.xpath("(//*[@data-testid='cont_btn_PreviewHeader'])[1]");
	private By HeaderTitle = By.xpath("//div[@class='MuiTypography-root MuiTypography-subtitle2 css-hxcfyb']");
	private By userid = By.xpath("//input[@name='email']");
	private By passphrase = By.xpath("//input[@name='password']");
	private By passphrase2 = By.xpath("//input[@name='passphrase']");
	private By loginbutton = By.xpath("//button[text()='Log In']");
	private By answerField = By.xpath("//input[@id='Answer']");
	private By continueButtonForLogin = By.xpath("//button[text()='CONTINUE']");
	private By createUserId = By.xpath("//input[@name='createUserID']");
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
	private By finishButton = By.xpath("//button[text()='FINISH']");
	private By userId = By.xpath("//p[text()='User Id:']");
	private By referenceCode = By.xpath("//p[text()='User Reference Code:']");
	private By form1 = By.xpath("//a[text()='Form 1']");
	private By form2 = By.xpath("//a[text()='Form 2']");
	private By form3 = By.xpath("//a[text()='Form 3']");
	private By supportLink = By.xpath("//a[text()='JURISDICTION SUPPORT']");
	private By submitDocPageTitle = By.xpath("//h1[text()='2. Submit Required Documents']");
	public static String userId1, userId2, userId3;
	private By errorMessage1 = By.xpath("//*[@id='answer1-helper-text']");
	private By errorMessage2 = By.xpath("//*[@id='answer2-helper-text']");
	private By refCode = By.xpath("(//*[@class='MuiBox-root css-mj6avj'])[2]");
	public static String referencecode;
	private By reference_Code = By.xpath("//*[@class='MuiBox-root css-mj6avj']");
	private By crossButtonAfterRegistration = By.xpath("//*[@data-testid='CloseIcon']");
	private By finishButton1 = By.xpath("//button[@id='priv_btn_Continue']");
	private By userid1 = By.xpath("//input[@name='email']");
	private By passphrase1 = By.xpath("//input[@name='password']");
	private By welcomeMenu = By.xpath("//button[@type='button']");
	private By userProfile = By.xpath("//*[@href='/user-profile']");
	private By changejurisdiction = By.xpath("//*[@href='/change-jurisdiction']");
	private By selectJurisdiction = By.xpath("//*[@id='mui-component-select-jurisdiction']");
	private By selectQubec = By.xpath("//*[text()='Quebec']");
	private By continueButtonforSelectJuri = By.xpath("//*[@data-testid='priv_btn_continue']");
	private By termsCheckbox = By.xpath("(//*[@class='PrivateSwitchBase-input css-1m9pwf3'])[2]");
	private By continueUserdetails = By.xpath("//button[@data-testid='Continue' and @type='submit']");
	private By submitButton = By.xpath("//*[@data-testid='priv_btn_Search']");
	private By contactUs = By.xpath("//*[text()='Contact Us']");
	private By successMsg = By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']");
	private By closeIcon = By.xpath("(//*[@data-testid='CloseIcon'])[2]");
	private By homeMenu = By.xpath("//*[text()='HOME']");
	private By pageheader = By.xpath("//*[@class='MuiTypography-root MuiTypography-h2 css-3qrxin']");
	private By homeReferencecode = By.xpath("//*[@class='MuiBox-root css-mj6avj']");
	private By firstName = By.xpath("(//a[@class='link-cell'])[1]");
	private By approvedUser = By.xpath("//*[@class='MuiBox-root css-1u7j72r']");
	private By refCodeColumn = By.xpath("(//*[@data-field='ReferenceCode'])[2]");
	private By requestStatus = By.xpath("(//*[@data-field='requestStatus'])[2]");
	private By closeButoonAfterApprovedCoj = By.xpath("(//*[@data-testid='CloseIcon'])[3]");
	private By approveCOJSuccessMsg = By.xpath("//*[text()='Your change of jurisdiction request has been approved.']");
	private By reasonForDenial = By.xpath("//*[@id='mui-component-select-ReasonForDenial']");
	private By denialReason = By
			.xpath("(//*[@class='MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-1cdtra8'])[1]");
	private By denialCOJMsg = By.xpath("//*[text()='Your change of jurisdiction request has been denied.']");
	private By commentErrorMsg = By.xpath("//*[@id='Comments-helper-text']");
	private By changePassphrase = By.xpath("//*[@href='/reset-password']");
	private By securityQues1field = By.xpath("//*[@aria-labelledby='Question1']");
	private By secQues1 = By.xpath("//*[@data-value='What was the last name of your third-grade teacher?']");
	private By ans1 = By.xpath("//*[@id='Answer1']");
	private By securityQues2field = By.xpath("//*[@aria-labelledby='Question2']");
	private By secQues2 = By.xpath("//*[@data-value='In which city did you meet your spouse?']");
	private By ans2 = By.xpath("//*[@id='Answer2']");
	private By securityQues3field = By.xpath("//*[@aria-labelledby='Question3']");
	private By secQues3 = By.xpath("//*[@data-value='Which school did you attend for sixth grade?']");
	private By ans3 = By.xpath("//*[@id='Answer3']");
	private By requestRevision = By.xpath("//*[@name='RequestRevision']");

	// Swati
	private By UpdateTermConditions = By.xpath("//h2[text()='Updated Terms and Conditions']");
	private By UpdateTermConditionsContinewButton = By.xpath("//*[@data-testid='priv_btn_ContinueBtn']");
	private By TermCheckbox = By.xpath("//span[text()='I accept the Jurisdiction']");
	private By IAccepttheJu = By.xpath("//button[text()='Continue']");
	private By login = By.xpath("//button[text()='Log in']");

	private By CloseButtonOnTerms = By.xpath(
			"//button[@type='button' and contains(@class,'MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium')]");
	private By password = By.xpath("//input[@name='password']");

	private By SelectRole = By.xpath("//*[@id='mui-component-select-Roles']");
	private By SelectRegistrarRole = By.xpath(
			"//*[text()='Registrar' and contains(@class,\"MuiTypography-root MuiTypography-body1 MuiListItemText-primary\")]");
	private By SelectAdministartorRole = By.xpath(
			"//*[text()='Administrator' and contains(@class,\"MuiTypography-root MuiTypography-body1 MuiListItemText-primary\")]");
	private By SelectAlternateAccountRepresentativeRole = By.xpath(
			"//*[text()='Alternate Account Representative' and contains(@class,'MuiTypography-root MuiTypography-body1 MuiListItemText-primary')]");

	private By SelectIndividualRole = By.xpath(
			"//*[text()='Individual Users' and contains(@class,'MuiTypography-root MuiTypography-body1 MuiListItemText-primar')]");
	private By SubmitButton = By.xpath("//*[@type='submit']");
	private By RoleChangeSuccessMsg = By.xpath("//*[text()='User role has been changed.']");

	// private By UserProfile = By.xpath("//a[text()='User Profile']");
	private By ChangeJU = By.xpath("//span[text()='Change Jurisdiction']");
	private By CrossJU = By.xpath("//span[text()='Cross Jurisdiction']");
	private By SelectJU = By.xpath("//div[@id='mui-component-select-jurisdiction']");
	private By countinue = By.xpath("//button[text()='CONTINUE']");
	private By continueButtonforTemporary = By.xpath("(//button[text()='CONTINUE'])[2]");

	private By Search2 = By.xpath("(//*[@type='search'])[2]");
	private By Search1 = By.xpath("(//*[@type='search'])[1]");
	private By UserProfilePage = By.xpath("//h1[text()='User Profile']");
	private By PendingSearchedUser = By.xpath("(//*[@class='link-cell'])[6]");
	private By RegisteredSearchedUser = By.xpath("(//a[@class='link-cell'])[1]");
	private By UserDetalisheader = By.xpath("//h1[text()='User Details']");

	private By Deny = By.xpath("//input[@name='Deny']");
	private By Approved = By.xpath("//input[@name='Approved']");
	private By RevisionRequest = By.xpath("//input[@name='RequestRevision']");
	private By SelectRoleType = By.xpath("//div[@id='mui-component-select-RoleType']");

	private By SelectReasonDenial = By.xpath("//*[text()='Select Reason for Denial']");
	private By welButton = By.xpath("//button[text()='Welcome,']");
//		private By userid = By.xpath("//input[@name='email']");
	private By SearchUsers = By.xpath("//button[text()='Search Users']");
	private By Denybutton = By.xpath(
			"//*[text()='Deny' and contains(@class,\"MuiTypography-root MuiTypography-body1 MuiFormControlLabel-label\")]");
	private By ReasonForDenial = By.xpath("//div[@id='mui-component-select-ReasonForDenial']");
	private By DenialReason3 = By.xpath(
			"//*[text()='Denial Reason 3' and contains(@class,\"MuiTypography-root MuiTypography-body1 MuiListItemText-primary\")]");
	private By commentfield = By.xpath(
			"//textarea[contains(@class,'MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputMultiline') and @name='Comments']");

	private By Menu = By
			.xpath("//*[name()=\"svg\" and contains(@class,\"MuiSvgIcon-root MuiSvgIcon-fontSizeMedium dot-icon\")]");
	private By DeactiveUserlogin = By.xpath("//p[text()='DEACTIVATE USER LOG-IN']");
	private By DeactiveWithoutProfileAccess = By.xpath("(//*[text()='Deactivate without profile access'])[1]");
	private By DeactiveprofileReasons = By.xpath("//input[@id='deactiveProfileReason']");
	private By ActiveProfileAccess = By.xpath("(//*[text()='ACTIVATE USER LOG-IN'])[1]");

	// Swati
	private By WelcomeButton = By.xpath("//button[text()='Welcome,']");
	private By UserProfile = By.xpath("//a[text()='User Profile']");
	private By ChangePassAndSecurity = By.xpath("//span[text()='Change Passphrase and Security Questions']");
	private By ResetPage = By.xpath("//h1[text()='Reset Passphrase and Security Questions']");

	private By LanguageMenu = By.xpath(
			"//*[name()='div' and contains(@class,'MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input')]");
	private By selectFrench = By.xpath("//*[text()='French']");
	private By selectArebic = By.xpath("//*[text()='Arebic']");
	private By selectjurisdiction = By.xpath("//div[text()='Select Jurisdiction']"); // change
	private By selectCalifornia = By.xpath("//*[text()='California']");

	private By selectEnglish = By.xpath("//*[text()='English']");
	private By contbutton = By.xpath("//button[text()='CONTINUE']");

	private By search = By.xpath(
			"(//input[contains(@class,\"MuiInputBase-input MuiInput-input MuiInputBase-inputTypeSearch MuiInputBase-inputAdornedStart MuiInputBase-inputAdornedEnd\")])[1]");
	private By approveUserTextOnHomePage = By.xpath("//div[text()='[APPROVED USER - LOGGED-IN HOME PAGE]']");
	private By UserDetails = By.xpath("//h1[text()='User Details']");
	private By SearchedName = By.xpath("//a[@href='/jurisdiction-user-actions']");
	// private By Menu = By.xpath("//*[name()=\"svg\" and
	// contains(@class,\"MuiSvgIcon-root MuiSvgIcon-fontSizeMedium dot-icon\")]");
	private By InactiveUserProfileAccessOnly = By.xpath("//p[text()='INACTIVATE USER - PROFILE ACCESS ONLY']");
	private By InactiveUserReasons = By.xpath("//input[@id='inctiveReasons']");
	private By continueButton = By.xpath("//button[text()='CONTINUE']");
	private By SuccessMsg = By
			.xpath("//p[text()='Account status is changed to Profile Access Only. The user can login to the system.']");

	private By PendingRequest = By.xpath("//*[text()='Pending Requests']");
	private By search1 = By.xpath(
			"(//input[contains(@class,\"MuiInputBase-input MuiInput-input MuiInputBase-inputTypeSearch MuiInputBase-inputAdornedStart MuiInputBase-inputAdornedEnd\")])[2]");
	private By SearchedName1 = By.xpath(
			"//p[text()='Pending Requests']/parent::div/parent::div/following-sibling::div//*[a[contains(@href,'/jurisdiction-user-actions')]]/a");
	private By Approve = By.xpath("//input[(@type='radio')and (@name='Approved')]");
	private By Savebutton = By.xpath("//button[text()='save']");

	private By ConatctUsMenu = By.xpath("//*[text()='Contact Us']");
	private By LoginButton = By.xpath("//button[@data-testid='login_btn']");
	private By UserIdErrorMessage = By.xpath("//*[text()='User ID  is required']");
	private By PassphraseErrorMessage = By.xpath("//*[text()='Passphrase  is required']");

	private By SearchField = By.xpath("(//input[@type='search'])[1]");
	private By actionButton = By.xpath("(//*[@data-testid='MoreHorizIcon'])[1]");
	private By resetSecurityAndPasspharse = By.xpath("//*[text()='RESET SECURITY QUESTIONS AND PASSPHRASE']");

	private By selectJurisdiction_Header = By.xpath("//*[@id='modal-modal-title']");
	private By pageHeader = By.xpath("//*[text()='WCI, Inc. Registry Platform']");
	private By LanguageArrow = By.xpath("(//*[@role='button'])[2]");
	private By spanishLanguage = By.xpath("//*[@data-value='French']");

	private By frenchPageHeader = By.xpath("//*[text()='WCI, Inc. Registry Platform-F']");

	public MyPOMClass() {
		PageFactory.initElements(driver, this);
		
	}

	public void ui_Verification_of_Submit_Requirement_Documents_page() {
		System.out.println("Step :Observe the UI of Submit Required Documents Page");
		String userid = driver.findElement(userId).getText();
		Assert.assertEquals(userid, "User Id:");
		String referenceCode1 = driver.findElement(referenceCode).getText();
		Assert.assertEquals(referenceCode1, "User Reference Code:");
		String form1Link = driver.findElement(form1).getText();
		Assert.assertEquals(form1Link, "Form 1");
		String form2Link = driver.findElement(form2).getText();
		Assert.assertEquals(form2Link, "Form 2");
		String form3Link = driver.findElement(form3).getText();
		Assert.assertEquals(form3Link, "Form 3");
		String supportlink = driver.findElement(supportLink).getText();
		Assert.assertEquals(supportlink, "JURISDICTION SUPPORT");
		String finishbutton = driver.findElement(finishButton).getText();
		Assert.assertEquals(finishbutton, "FINISH");
		ObjectRepo.test.log(Status.PASS, "UI verification of Submit Required Documents Page");
	}

	public void securityQuestionsAnswers_ValidData() {

		String PageTitle = driver.findElement(submitDocPageTitle).getText();
		Assert.assertEquals(PageTitle, "2. Submit Required Documents");
		ObjectRepo.test.log(Status.PASS, "Validation of security questions and answers with valid data");
	}

	public static String generateUserIdString() {
		int length = 4;
		boolean useLetters = false;
		boolean useNumbers = true;
		String generatedString = RandomStringUtils.random(length, useNumbers, useLetters);

		String randomString = ("test" + generatedString);
		return randomString;
	}

	public void securityQuestionsAnswers_InvalidData() throws InterruptedException {
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		userId1 = generateUserIdString();
		System.out.println("Uesrid :" + userId);
		driver.findElement(createUserId).sendKeys(userId1);
		driver.findElement(passphrase2).sendKeys("Pass@12345");
		driver.findElement(confirmPassphrase).sendKeys("Pass@12345");
		System.out.println("Step :Enter invalid data in security answer fields");
		WebElement Element = driver.findElement(secQuestion1);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Thread.sleep(4000);
		driver.findElement(secQuestion1).click();
		driver.findElement(selSecQue1).click();
		driver.findElement(answer1).sendKeys("An");
		driver.findElement(secQuestion2).click();
		driver.findElement(selSecQue2).click();
		driver.findElement(answer2).sendKeys("An");

		WebElement elementp = driver.findElement(secQuestion2);
		WebElement element = driver.findElement(secQuestion3);
		Actions action = new Actions(driver);
		action.moveToElement(elementp).build().perform();
		Thread.sleep(2000);
		action.moveToElement(element).perform();
		Thread.sleep(2000);
		action.click(element).build().perform();

		driver.findElement(selSecQue3).click();
		driver.findElement(answer3).sendKeys("An");

		String errormessage = driver.findElement(errorMessage1).getText();
		Assert.assertEquals(errormessage, "Answer 1 requires minimum 4 characters");
		ObjectRepo.test.log(Status.PASS, "Validation of security questions and answers with invalid data");
	}

	public void securityQuestionsAnswers_EmptyData() throws InterruptedException {
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		userId1 = generateUserIdString();
		System.out.println("Uesrid :" + userId);
		driver.findElement(createUserId).sendKeys(userId1);
		driver.findElement(passphrase2).sendKeys("Pass@12345");
		driver.findElement(confirmPassphrase).sendKeys("Pass@12345");
		System.out.println("Step :Keep all answer fields empty");
		WebElement Element = driver.findElement(secQuestion1);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Thread.sleep(4000);
		driver.findElement(secQuestion1).click();
		driver.findElement(selSecQue1).click();
		driver.findElement(answer1).click();
		;
		driver.findElement(secQuestion2).click();
		driver.findElement(selSecQue2).click();
		driver.findElement(answer2).click();

		WebElement elementp = driver.findElement(secQuestion2);
		WebElement element = driver.findElement(secQuestion3);
		Actions action = new Actions(driver);
		action.moveToElement(elementp).build().perform();
		Thread.sleep(2000);
		action.moveToElement(element).perform();
		Thread.sleep(2000);
		action.click(element).build().perform();

		driver.findElement(selSecQue3).click();
		driver.findElement(answer3).click();
		String errormessage = driver.findElement(errorMessage1).getText();
		Assert.assertEquals(errormessage, "Answer 1 is required");

		ObjectRepo.test.log(Status.PASS, "Validation of security questions and answers with empty data");
	}

	public void duplicateSecurityQuestions() throws InterruptedException {
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		userId1 = generateUserIdString();
		System.out.println("Uesrid :" + userId);
		driver.findElement(createUserId).sendKeys(userId1);
		driver.findElement(passphrase2).sendKeys("Pass@12345");
		driver.findElement(confirmPassphrase).sendKeys("Pass@12345");

		System.out.println("Step :Try to Select Duplicate Security questions");
		WebElement Element = driver.findElement(secQuestion1);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Thread.sleep(4000);
		driver.findElement(secQuestion1).click();
		driver.findElement(selSecQue1).click();

		String Element1 = driver.findElement(secQuestion1).getText();
		System.out.println(Element1);
		driver.findElement(answer1).sendKeys("Answer_1");
		driver.findElement(secQuestion2).click();

		WebElement ul = driver.findElement(By.xpath("//ul[@role='listbox']"));// xpath of ul
		Thread.sleep(3000);

		List<WebElement> allOptions = ul.findElements(By.tagName("li"));

		for (WebElement selectLi : allOptions) {
			if (selectLi.getText().equals(Element1)) {
				selectLi.click();
			}
		}
		ObjectRepo.test.log(Status.PASS, "Verify security questions field by selecting dupliate questions.");
	}

	public void duplicateSecurityAnswers() throws InterruptedException {
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		userId2 = generateUserIdString();
		System.out.println("Uesrid :" + userId);
		driver.findElement(createUserId).sendKeys(userId2);
		driver.findElement(passphrase2).sendKeys("Pass@12345");
		driver.findElement(confirmPassphrase).sendKeys("Pass@12345");

		System.out.println("Step :Try to Select Duplicate Answer");
		WebElement Element = driver.findElement(secQuestion1);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Thread.sleep(4000);
		driver.findElement(secQuestion1).click();
		driver.findElement(selSecQue1).click();
		driver.findElement(answer1).sendKeys("Answer_1");
		driver.findElement(secQuestion2).click();
		driver.findElement(selSecQue2).click();
		driver.findElement(answer2).sendKeys("Answer_1");

		WebElement elementp = driver.findElement(secQuestion2);
		WebElement element = driver.findElement(secQuestion3);
		Actions action = new Actions(driver);
		action.moveToElement(elementp).build().perform();
		Thread.sleep(2000);
		action.moveToElement(element).perform();
		Thread.sleep(2000);
		action.click(element).build().perform();

		driver.findElement(selSecQue3).click();
		driver.findElement(answer3).sendKeys("Answer_1");

		String errormessage = driver.findElement(errorMessage2).getText();
		Assert.assertEquals(errormessage, "Answer 2 must be unique");

		ObjectRepo.test.log(Status.PASS, "Verify answer field by selecting dupliate answer");

	}

	public void createLogin_referenceCode() throws InterruptedException {
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		userId3 = generateUserIdString();
		System.out.println("Uesrid :" + userId3);
		driver.findElement(createUserId).sendKeys(userId3);
		driver.findElement(passphrase2).sendKeys("Pass@12345");
		driver.findElement(confirmPassphrase).sendKeys("Pass@12345");

		WebElement Element = driver.findElement(secQuestion1);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Thread.sleep(4000);
		driver.findElement(secQuestion1).click();
		driver.findElement(selSecQue1).click();
		driver.findElement(answer1).sendKeys("Answer_1");
		driver.findElement(secQuestion2).click();
		driver.findElement(selSecQue2).click();
		driver.findElement(answer2).sendKeys("Answer_2");

//		Thread.sleep(2000);
//		WebElement element1  = driver.findElement(secQuestion3);
//		Actions action = new Actions(driver);
//		action.click(element1).build().perform();

		WebElement elementp = driver.findElement(secQuestion2);
		WebElement element = driver.findElement(secQuestion3);
		Actions action = new Actions(driver);
		action.moveToElement(elementp).build().perform();
		Thread.sleep(2000);
		action.moveToElement(element).perform();
		Thread.sleep(2000);
		action.click(element).build().perform();

		driver.findElement(selSecQue3).click();
		driver.findElement(answer3).sendKeys("Answer_3");
		WebElement element1 = driver.findElement(termsOfUseCheckBox);
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("arguments[0].click()", element1);

		WebElement element2 = driver.findElement(creUserProfRegBut);
		js3.executeScript("arguments[0].click()", element2);
		driver.findElement(crossButtonAfterRegistration).click();

		referencecode = driver.findElement(refCode).getText();
		System.out.println(referencecode);

		WebElement element3 = driver.findElement(finishButton1);
		js3.executeScript("arguments[0].click()", element3);

		Thread.sleep(6000);
		System.out.println("New User Created Successfully.");
		ObjectRepo.test.log(Status.PASS, "New User Created Successfully.");

	}

	public void logincreatedUser() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(userid1).sendKeys(userId3);
		System.out.println("step : Enter Valid User Id  ");
		ObjectRepo.test.log(Status.PASS, "step1 : Enter valid User Id ");
		Thread.sleep(3000);
		driver.findElement(passphrase1).sendKeys("Pass@12345");
		System.out.println("step : Enter Valid passphrase  ");
		ObjectRepo.test.log(Status.PASS, "step1 : Enter valid passphrase ");
		Thread.sleep(3000);
		WebElement element = driver.findElement(loginbutton);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		System.out.println("step : Click on login button  ");
		ObjectRepo.test.log(Status.PASS, "step1 : Click on login button ");
		Thread.sleep(3000);
//		driver.findElement(answerField).sendKeys(prop.getProperty("SecurityAnswer1"));
//		driver.findElement(continueButtonForLogin).click();
//		Thread.sleep(6000);
//		driver.navigate().refresh();
//		new WebDriverWait(driver, 60).until(
//				ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='2. Submit Required Documents']")));
	}

	public void UserReferenceCodeForChangeOfJurisdiction_ApplicantUser() throws InterruptedException {
		String element = driver.findElement(reference_Code).getText();
		Assert.assertEquals(element, referencecode);
		System.out.println("step : Click on Welcome button and click on User profile menu ");
		driver.findElement(welcomeMenu).click();
		driver.findElement(userProfile).click();
		ObjectRepo.test.log(Status.PASS, "step : Click on Welcome button and click on User profile menu  ");
		WebElement element4 = driver.findElement(changejurisdiction);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element4);
		System.out.println("step : Select another jurisdiction and click on Continue button");
		Thread.sleep(4000);
		driver.findElement(selectJurisdiction).click();
		driver.findElement(selectQubec).click();
		Thread.sleep(4000);
		driver.findElement(continueButtonforSelectJuri).click();
//		String pageheader = driver.findElement(pageHeader).getText();
//		Assert.assertEquals(pageheader, "Change Jurisdiction Request");
//		ObjectRepo.test.log(Status.PASS, "step : Select another jurisdiction and click on Continue button");

		WebElement element5 = driver.findElement(termsCheckbox);
		js2.executeScript("arguments[0].click()", element5);

		WebElement element1 = driver.findElement(contactUs);
		js2.executeScript("arguments[0].scrollIntoView();", element1);

		Thread.sleep(10000);
		driver.findElement(continueUserdetails).click();
		// wait.until(ExpectedConditions.visibilityOfElementLocated(submitButton));
		Thread.sleep(5000);
		driver.findElement(submitButton).click();
		String successmessage = driver.findElement(successMsg).getText();
		//Assert.assertEquals(successmessage, "Your User Registration has been transferred to the selected Jurisdiction successfully.");
		driver.findElement(closeIcon).click();
		ObjectRepo.test.log(Status.PASS, "step : Change Jurisdiction request made successfully");
		System.out.println("step : Click on Home menu");
		driver.findElement(homeMenu).click();
		Thread.sleep(3000);
//		String header = driver.findElement(pageHeader).getText();
//		Assert.assertEquals(header, "Welcome!");
		//String homeReferenceCode = driver.findElement(homeReferencecode).getText();
		//Assert.assertEquals(homeReferenceCode, referencecode);
	}

	public void assignRoleToCreatedUser() throws Exception {
		
		driver.findElement(By.xpath("(//*[@type='search'])[1]")).click();
		driver.findElement(By.xpath("(//*[@type='search'])[1]")).sendKeys(userId3);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@role='tab']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(firstName));
		driver.findElement(By.xpath("(//a[@class='link-cell'])[1]")).click();

		JavascriptExecutor j = (JavascriptExecutor) driver;
//		WebElement element1 = driver.findElement(By.xpath("//input[@name='Approved']"));

//		Actions actions = new Actions(driver);
//		actions.moveToElement(element1).click().perform();

//        j.executeScript("arguments[0].scrollIntoView();", element1);
//		Thread.sleep(5000);
//		try {
//			driver.findElement(By.xpath("//*[@name='Approved']")).click();
//		} catch (Exception e) {
//			Thread.sleep(5000);
//			driver.findElement(By.xpath("//*[@value='Approve']")).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2200)");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='Approved']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='mui-component-select-RoleType']")).click();
		Thread.sleep(1000);
		WebElement element1=driver.findElement(By.xpath("//span[text()='Individual Users']"));
		Thread.sleep(1000);
		Actions action=new Actions(driver);
		action.moveToElement(element1).build().perform();
		Thread.sleep(4000);
		action.doubleClick(element1).build().perform();
		//Thread.sleep(1000);
		//action.click(element1).build().perform();
		//driver.findElement(By.xpath("//*[contains(text()='Individual Users')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='mui-component-select-Roles']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()='Primary Account Representative']")).click();
		
		WebElement element2 = driver.findElement(By.xpath("//div[@id='mui-component-select-RoleType']"));
		//Actions action = new Actions(driver);
		action.moveToElement(element2).build().perform();
		Thread.sleep(4000);
		
		js.executeScript("window.scrollBy(0,2650)");
		WebElement abc = driver.findElement(By.xpath("//*[@type='submit']"));
		js.executeScript("arguments[0].click();", abc);
		Thread.sleep(6000);
		
		
//		Thread.sleep(1000);
//		j.executeScript("window.scrollBy(0,1800)");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@name='Approved']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@id='mui-component-select-RoleType']")).click();
//		Thread.sleep(6000);
//		driver.findElement(By.xpath("(//*[contains(text(),'Individual Users')])[1]")).click();
//		
//		
//		
//		driver.findElement(By.xpath("//*[@id='mui-component-select-Roles']")).click();
//		Thread.sleep(6000);
//		driver.findElement(By.xpath("//*[text()='Primary Account Representative']")).click();
//
//		Thread.sleep(2000);
//		WebElement element2 = driver.findElement(By.xpath("//div[@id='mui-component-select-RoleType']"));
//		Actions action = new Actions(driver);
//		action.moveToElement(element2).build().perform();
//		Thread.sleep(4000);
//		WebElement abc = driver.findElement(By.xpath("//*[@type='submit']"));
//		j.executeScript("arguments[0].click();", abc);
//		Thread.sleep(6000);

		String successmsg = driver.findElement(By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']")).getText();
		//Assert.assertEquals("User request has been approved.", successmsg);
		System.out.println("User request has been approved.");
		ObjectRepo.test.log(Status.PASS, "User request has been approved.");
		driver.findElement(By.xpath("(//*[@data-testid='CloseIcon'])[4]")).click();

	}

	public void loginApprovedUser() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(userid1).sendKeys(userId3);
		System.out.println("step : Enter Valid User Id  ");
		ObjectRepo.test.log(Status.PASS, "step1 : Enter valid User Id ");
		Thread.sleep(3000);
		driver.findElement(passphrase1).sendKeys("Pass@12345");
		System.out.println("step : Enter Valid passphrase  ");
		ObjectRepo.test.log(Status.PASS, "step1 : Enter valid passphrase ");
		Thread.sleep(3000);
		WebElement element = driver.findElement(loginbutton);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		System.out.println("step : Click on login button  ");
		ObjectRepo.test.log(Status.PASS, "step1 : Click on login button ");
		Thread.sleep(3000);
//		driver.findElement(answerField).sendKeys(prop.getProperty("SecurityAnswer1"));
//		driver.findElement(continueButtonForLogin).click();
		//Thread.sleep(6000);
		//driver.navigate().refresh();
//		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(approvedUser));

		//String approvedUserCode = driver.findElement(approvedUser).getText();
		//Assert.assertEquals(approvedUserCode, "[APPROVED USER - LOGGED-IN HOME PAGE]");

	}

	public void chnageJurisdictionCAtoQC() {
		//Thread.sleep(5000);
		System.out.println("step : Click on Welcome button and click on User profile menu ");
		driver.findElement(welcomeMenu).click();
		driver.findElement(userProfile).click();
		//Thread.sleep(2000);
		ObjectRepo.test.log(Status.PASS, "step : Click on Welcome button and click on User profile menu  ");
		WebElement element4 = driver.findElement(changejurisdiction);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element4);
		System.out.println("step : Select another jurisdiction and click on Continue button");
		//Thread.sleep(4000);
		new WebDriverWait(driver,40).until(ExpectedConditions.elementToBeClickable(selectJurisdiction));
		driver.findElement(selectJurisdiction).click();
		WebElement element6=driver.findElement(selectQubec);
		js2.executeScript("arguments[0].click()", element6);
		//Thread.sleep(4000);
		driver.findElement(continueButtonforSelectJuri).click();
		WebElement element5 = driver.findElement(termsCheckbox);
		js2.executeScript("arguments[0].click()", element5);
		WebElement element1 = driver.findElement(contactUs);
		js2.executeScript("arguments[0].scrollIntoView();", element1);
		//Thread.sleep(10000);
		driver.findElement(continueUserdetails).click();
		new WebDriverWait(driver,40).until(ExpectedConditions.visibilityOfElementLocated(submitButton));
		//Thread.sleep(5000);
		driver.findElement(submitButton).click();
		String successmessage = driver.findElement(successMsg).getText();
		// Assert.assertEquals(successmessage,
		// "Your User Registration has been transferred to the selected Jurisdiction
		// successfully.");
		driver.findElement(closeIcon).click();
		ObjectRepo.test.log(Status.PASS, "step : Change Jurisdiction request made successfully");
//		System.out.println("step : Click on Home menu");
//		driver.findElement(homeMenu).click();
//		Thread.sleep(3000);
//		String header=driver.findElement(pageHeader).getText();
//		Assert.assertEquals(header, "Welcome!");
//		String homeReferenceCode=driver.findElement(homeReferencecode).getText();
//		Assert.assertEquals(homeReferenceCode,referencecode);	
	}

	public void UserReferenceCodeForChangeOfJurisdiction_ApprovedUser2() throws InterruptedException {
		driver.findElement(By.xpath("(//*[@type='search'])[1]")).click();
		driver.findElement(By.xpath("(//*[@type='search'])[1]")).sendKeys(userId3);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@role='tab']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(refCodeColumn));

		Thread.sleep(12000);
		List<WebElement> elements = driver.findElements(By.xpath("//*"));
		int totalNoOfElements = elements.size();
		System.out.println("totalNoOfElements : " + totalNoOfElements);
		String elementText = "";
		for (int i = 0; i <= totalNoOfElements - 1; i++) {
			elementText = elements.get(i).getText();
//			System.out.println(elementText);
		}
		if (elementText.contains(referencecode)) {
			System.out.println("referencecode validated successfully");
		} else {
			System.out.println("referencecode not found");
		}
	}

	public void statusAfterUserRequestsChnageJurisdiction() throws Throwable {
		Thread.sleep(3000);
		String pendingCoj = driver.findElement(requestStatus).getText();
		Assert.assertEquals(pendingCoj, "Pending COJ");
	}

	public void approved_COJ() throws InterruptedException {

		System.out.println(" Step : Approved the change jurisdiction Request");
		driver.findElement(By.xpath("(//*[@type='search'])[1]")).click();
		driver.findElement(By.xpath("(//*[@type='search'])[1]")).sendKeys(userId3);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@role='tab']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(firstName));
		driver.findElement(By.xpath("(//a[@class='link-cell'])[1]")).click();
		Thread.sleep(5000);
		try {
			driver.findElement(By.xpath("//*[@name='Approved']")).click();
		} catch (Exception e) {
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@value='Approve']")).click();
		}
		JavascriptExecutor j = (JavascriptExecutor) driver;
		WebElement abc = driver.findElement(By.xpath("//*[@type='submit']"));
		j.executeScript("arguments[0].click();", abc);
		Thread.sleep(3000);
		String successmsg = driver.findElement(approveCOJSuccessMsg).getText();
		Assert.assertEquals(successmsg, "Your change of jurisdiction request has been approved.");
		ObjectRepo.test.log(Status.PASS, "step : Approved the change jurisdiction Request");
		driver.findElement(closeButoonAfterApprovedCoj).click();
	}

	public void statusAfterUserApprovedJurisdiction() throws Exception {
		Thread.sleep(3000);
		System.out.println("step : Click on Welcome button and click on User profile menu ");
		driver.findElement(welcomeMenu).click();
		driver.findElement(userProfile).click();
		ObjectRepo.test.log(Status.PASS, "step : Click on Welcome button and click on User profile menu  ");

		System.out.println("step : Check the request status after approved COJ");
		Thread.sleep(3000);
		String status = driver.findElement(requestStatus).getText();
		Assert.assertEquals(status, "Approved COJ");
		ObjectRepo.test.log(Status.PASS, "step : Check the request status after approved COJ");
	}

	public void denied_COJ() throws InterruptedException {

		System.out.println(" Step : Denied the change jurisdiction Request");
		driver.findElement(By.xpath("(//*[@type='search'])[1]")).click();
		driver.findElement(By.xpath("(//*[@type='search'])[1]")).sendKeys(userId3);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@role='tab']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(firstName));
		driver.findElement(By.xpath("(//a[@class='link-cell'])[1]")).click();
		Thread.sleep(5000);
		try {
			driver.findElement(By.xpath("//*[@name='Deny']")).click();
		} catch (Exception e) {
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@value='Deny']")).click();
		}
		Thread.sleep(2000);

		driver.findElement(reasonForDenial).click();
		driver.findElement(denialReason).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='Comments']")).sendKeys("Test");
		JavascriptExecutor j = (JavascriptExecutor) driver;
		WebElement abc = driver.findElement(By.xpath("//*[@type='submit']"));
		j.executeScript("arguments[0].click();", abc);
		Thread.sleep(3000);
		String successmsg = driver.findElement(denialCOJMsg).getText();
		Assert.assertEquals(successmsg, "Your change of jurisdiction request has been denied.");
		ObjectRepo.test.log(Status.PASS, "step : denied the change jurisdiction Request");
		driver.findElement(closeButoonAfterApprovedCoj).click();
	}

	public void statusAfterUserDeniedJurisdiction() throws Exception {
		Thread.sleep(3000);
		System.out.println("step : Click on Welcome button and click on User profile menu ");
		driver.findElement(welcomeMenu).click();
		driver.findElement(userProfile).click();
		ObjectRepo.test.log(Status.PASS, "step : Click on Welcome button and click on User profile menu  ");

		System.out.println("step : Check the request status after denied COJ");
		Thread.sleep(3000);
		String status = driver.findElement(requestStatus).getText();
		Assert.assertEquals(status, "Denied COJ");
		ObjectRepo.test.log(Status.PASS, "step : Check the request status after denied COJ");
	}

	public void clearSecurityAnswer() throws Exception {
		Thread.sleep(3000);
		System.out.println("step : Click on Welcome button and click on change Passphrase menu ");
		Thread.sleep(3000);
		driver.findElement(welcomeMenu).click();
		driver.findElement(changePassphrase).click();
		ObjectRepo.test.log(Status.PASS, "step : Click on Welcome button and click on change Passphrase menu  ");
		System.out.println("Step : clear security Answer functionality on Reset Passphrase and Security Questions");

		WebElement Element = driver.findElement(securityQues1field);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Thread.sleep(6000);
		driver.findElement(securityQues1field).click();
		driver.findElement(secQues1).click();
		driver.findElement(ans1).sendKeys("Test");
		driver.findElement(securityQues2field).click();
		driver.findElement(secQues2).click();
		driver.findElement(ans2).sendKeys("Test1");
		driver.findElement(securityQues3field).click();
		driver.findElement(secQues3).click();
		driver.findElement(ans3).sendKeys("Test2");
		Thread.sleep(2000);
		driver.findElement(ans1).clear();
		driver.findElement(ans2).clear();
		driver.findElement(ans3).clear();
		String ans = driver.findElement(ans1).getText();
		Assert.assertEquals(ans, "");
		ObjectRepo.test.log(Status.PASS,
				"step : clear security Answer functionality on Reset Passphrase and Security Questions");
	}

	public void commentFieldWhenApplicationDeniedByRegistrar() throws Exception {
		driver.findElement(By.xpath("(//*[@type='search'])[1]")).click();
		driver.findElement(By.xpath("(//*[@type='search'])[1]")).sendKeys(userId3);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@role='tab']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(firstName));
		driver.findElement(By.xpath("(//a[@class='link-cell'])[1]")).click();
		Thread.sleep(3000);

		WebElement Element = driver.findElement(By.xpath("//*[@value='Deny']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Element);

		Thread.sleep(2000);
		try {
			driver.findElement(By.xpath("//*[@name='Deny']")).click();
		} catch (Exception e) {
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@value='Deny']")).click();
		}
		Thread.sleep(3000);
		WebElement Element1 = driver.findElement(reasonForDenial);
		js.executeScript("arguments[0].scrollIntoView();", Element1);
		Thread.sleep(2000);
		driver.findElement(reasonForDenial).click();
		driver.findElement(denialReason).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='Comments']")).click();
		WebElement inputField = driver.findElement(By.xpath("//*[@id='Comments']"));
		inputField.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		String errormsg = driver.findElement(commentErrorMsg).getText();
		System.out.println(errormsg);
		Assert.assertEquals(errormsg, "Comments is required");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='Comments']")).sendKeys("@@@@@@@@@@@@@@");
		Thread.sleep(3000);
		String errormsg1 = driver.findElement(commentErrorMsg).getText();
		System.out.println(errormsg1);
		Assert.assertEquals(errormsg1, "Invalid Comments");
		driver.findElement(By.xpath("//*[@id='Comments']")).clear();
		driver.findElement(By.xpath("//*[@id='Comments']")).sendKeys("Testing");
		JavascriptExecutor j = (JavascriptExecutor) driver;
		WebElement abc = driver.findElement(By.xpath("//*[@type='submit']"));
		j.executeScript("arguments[0].click();", abc);
		Thread.sleep(3000);
		String msg = driver.findElement(By.xpath("//*[text()='User request has been denied.']")).getText();
		Assert.assertEquals(msg, "User request has been denied.");
	}

	public void commentFieldWhenApplicationIsRequestRevisionByRegistrar() throws Exception {
		driver.findElement(By.xpath("(//*[@type='search'])[1]")).click();
		driver.findElement(By.xpath("(//*[@type='search'])[1]")).sendKeys(userId3);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@role='tab']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(firstName));
		driver.findElement(By.xpath("(//a[@class='link-cell'])[1]")).click();
		Thread.sleep(3000);

		WebElement Element = driver.findElement(requestRevision);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Thread.sleep(2000);
		try {
			driver.findElement(By.xpath("//*[@name='RequestRevision']")).click();
		} catch (Exception e) {
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@value='Request Revisions']")).click();
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='Comments']")).click();
		WebElement inputField = driver.findElement(By.xpath("//*[@id='Comments']"));
		inputField.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		String errormsg = driver.findElement(commentErrorMsg).getText();
		System.out.println(errormsg);
		Assert.assertEquals(errormsg, "Comments is required");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='Comments']")).sendKeys("@@@@@@@@@@@@@@");
		Thread.sleep(3000);
		String errormsg1 = driver.findElement(commentErrorMsg).getText();
		System.out.println(errormsg1);
		Assert.assertEquals(errormsg1, "Invalid Comments");
		driver.findElement(By.xpath("//*[@id='Comments']")).clear();
		driver.findElement(By.xpath("//*[@id='Comments']")).sendKeys("Testing");
		JavascriptExecutor j = (JavascriptExecutor) driver;
		WebElement abc = driver.findElement(By.xpath("//*[@type='submit']"));
		j.executeScript("arguments[0].click();", abc);
		Thread.sleep(3000);
		String msg = driver.findElement(By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']")).getText();
		Assert.assertEquals(msg, "User has successfully requested revisions");
	}

	public void Verification_of_preview_functionality_for_edited_page() throws InterruptedException {
		driver.findElement(btnSetting).click();
		driver.findElement(btnCMS).click();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(btnHeader));
		Thread.sleep(2000);
		driver.findElement(btnHeader).click();
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		String abc = "ANNOUNCEMENTS - English";
		driver.findElement(textBox).click();
		driver.findElement(textBox).clear();
		driver.findElement(textBox).sendKeys(abc);
		driver.switchTo().parentFrame();

		wait.until(ExpectedConditions.visibilityOfElementLocated(btnPreview));
		driver.findElement(btnPreview).click();
		String Title = driver.findElement(HeaderTitle).getText();
		Assert.assertEquals(abc, Title);
		System.out.println("Preview functionality for edited page verified successfully");
		ObjectRepo.test.log(Status.PASS, "Preview functionality for edited page verified successfully");

	}

	public void Login_with_Jurisdiction_Authority() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(userid).sendKeys(prop.getProperty("LoginAsAuthorityUsernameCalifornia"));
		driver.findElement(passphrase).sendKeys(prop.getProperty("LoginAsAuthorityPasswordCalifornia"));
//		Thread.sleep(4000);
		new WebDriverWait(driver, 40).until(ExpectedConditions.elementToBeClickable(loginbutton));
//		driver.findElement(checkBoxRememberMe).click();
		WebElement element = driver.findElement(loginbutton);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
//		driver.findElement(answerField).sendKeys(prop.getProperty("SecurityAnswer2"));
//		driver.findElement(continueButtonForLogin).click();
//		String welcomeMsg = driver.findElement(By.xpath("//*[text()='Welcome!']")).getText();
//		Assert.assertEquals(welcomeMsg, "Welcome!");
	}

//	public void runtime_Login_with_Jurisdiction_Authority() throws InterruptedException {
//		Thread.sleep(3000);
//		driver.findElement(userid).sendKeys("authority.cal");
//		driver.findElement(passphrase).sendKeys("Eqanim@123");
////		Thread.sleep(4000);
//		new WebDriverWait(driver, 40).until(ExpectedConditions.elementToBeClickable(loginbutton));
////		driver.findElement(checkBoxRememberMe).click();
//		WebElement element = driver.findElement(loginbutton);
//		JavascriptExecutor js2 = (JavascriptExecutor) driver;
//		js2.executeScript("arguments[0].click()", element);
////		driver.findElement(answerField).sendKeys(prop.getProperty("SecurityAnswer2"));
////		driver.findElement(continueButtonForLogin).click();
////		String welcomeMsg = driver.findElement(By.xpath("//*[text()='Welcome!']")).getText();
////		Assert.assertEquals(welcomeMsg , "Welcome!");
//	}

	public void Login_with_Jurisdiction_Registrar() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(userid).sendKeys(prop.getProperty("LoginAsJurisdictionUserUsername"));
		driver.findElement(passphrase).sendKeys(prop.getProperty("LoginAsJurisdictionUserPassword"));
//		Thread.sleep(4000);
		new WebDriverWait(driver, 40).until(ExpectedConditions.elementToBeClickable(loginbutton));
//		driver.findElement(checkBoxRememberMe).click();
		WebElement element = driver.findElement(loginbutton);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
//		driver.findElement(answerField).sendKeys(prop.getProperty("SecurityAnswer2"));
//		driver.findElement(continueButtonForLogin).click();
//		String welcomeMsg = driver.findElement(By.xpath("//*[text()='Welcome!']")).getText();
//		Assert.assertEquals(welcomeMsg, "Welcome!");
	}

//	public void runtime_Login_with_Jurisdiction_Registrar() throws InterruptedException {
//		Thread.sleep(3000);
//		driver.findElement(userid).sendKeys("registrar.cal");
//		driver.findElement(passphrase).sendKeys("Eqanim@123");
////		Thread.sleep(4000);
//		new WebDriverWait(driver, 40).until(ExpectedConditions.elementToBeClickable(loginbutton));
////		driver.findElement(checkBoxRememberMe).click();
//		WebElement element = driver.findElement(loginbutton);
//		JavascriptExecutor js2 = (JavascriptExecutor) driver;
//		js2.executeScript("arguments[0].click()", element);
////		driver.findElement(answerField).sendKeys(prop.getProperty("SecurityAnswer2"));
////		driver.findElement(continueButtonForLogin).click();
////		String welcomeMsg = driver.findElement(By.xpath("//*[text()='Welcome!']")).getText();
////		Assert.assertEquals(welcomeMsg , "Welcome!");
//	}

	// Swati/640

	public void UnknownUser() throws InterruptedException {
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.findElement(selectjurisdiction).click();
		driver.findElement(selectCalifornia).click();

		String Autolanguage = driver.findElement(By.xpath("//div[text()='English']")).getText();
		Assert.assertEquals(Autolanguage, "English");
		System.out.println("validated : Autoselected language is English");
		driver.findElement(selectEnglish).click();
		driver.findElement(selectFrench).click();
		System.out.println("validated : French language is selected");
		driver.findElement(contbutton).click();

	}

	public void LanguageValidation() throws InterruptedException {
		WebElement ctrlWelcome = driver.findElement(By.xpath("//*[text()='Welcome!']"));
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Welcome!']")));
		if (ctrlWelcome != null) {
			String welcomeText = ctrlWelcome.getText();
			System.out.println("Text is  : " + welcomeText);
			Assert.assertEquals(welcomeText, "Welcome!");
			System.out.println("Validated : For user content displayed in selected language");
			ObjectRepo.test.log(Status.PASS, "For user content displayed in selected language");
		}
	}

	public void ChangeLanguage() throws InterruptedException {
		new WebDriverWait(driver, 60).until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//h1[contains(@class,'MuiTypography-root MuiTypography-h1')]")));
		driver.findElement(LanguageMenu).click();
		driver.findElement(selectFrench).click();
		WebElement ctrlWelcome = driver.findElement(By.xpath("//*[text()='Welcome!-F']"));
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Welcome-F!']")));
		if (ctrlWelcome != null) {
			String welcomeText = ctrlWelcome.getText();
			System.out.println("Text is  : " + welcomeText);
			Assert.assertEquals(welcomeText, "Welcome!");
			System.out.println("validated : Content displayed in switched language");
			ObjectRepo.test.log(Status.PASS, "Content displayed in switched language");
		}
	}

	public void runtime_Login_with_Jurisdiction_Authority() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(userid).sendKeys(prop.getProperty("LoginAsAuthorityUsernameCalifornia"));
		driver.findElement(passphrase1).sendKeys(prop.getProperty("LoginAsAuthorityPasswordCalifornia"));
//			Thread.sleep(4000);
		new WebDriverWait(driver, 40).until(ExpectedConditions.elementToBeClickable(loginbutton));
//			driver.findElement(checkBoxRememberMe).click();
		WebElement element = driver.findElement(loginbutton);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
//			driver.findElement(answerField).sendKeys(prop.getProperty("SecurityAnswer2"));
//			driver.findElement(continueButtonForLogin).click();
//			String welcomeMsg = driver.findElement(By.xpath("//*[text()='Welcome!']")).getText();
//			Assert.assertEquals(welcomeMsg , "Welcome!");
	}

	public void searchuser() throws InterruptedException {
		driver.findElement(Search1).click();
		driver.findElement(Search1).sendKeys(struserId);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@role='tab']")).click();
		driver.findElement(RegisteredSearchedUser).click();
		Thread.sleep(4000);

		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='User Details']")));
		driver.findElement(Menu).click();
		driver.findElement(InactiveUserProfileAccessOnly).click();

		WebElement element1 = driver.findElement(UserDetails);
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("arguments[0].click()", element1);
		driver.findElement(InactiveUserReasons).sendKeys("No data Required");
		driver.findElement(continueButton).click();
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(SuccessMsg));
		String message1 = driver.findElement(SuccessMsg).getText();
		System.out.println("success message :" + message1);
		Assert.assertEquals(message1,
				"Account status is changed to Profile Access Only. The user can login to the system.");
		ObjectRepo.test.log(Status.PASS, message1);
	}

	public void runtime_Login_with_Jurisdiction_Registrar() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(userid).sendKeys(prop.getProperty("LoginAsJurisdictionUserUsername"));
		driver.findElement(passphrase1).sendKeys(prop.getProperty("LoginAsJurisdictionUserPassword"));
//			Thread.sleep(4000);
		new WebDriverWait(driver, 40).until(ExpectedConditions.elementToBeClickable(loginbutton));
//			driver.findElement(checkBoxRememberMe).click();
		WebElement element = driver.findElement(loginbutton);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
//			driver.findElement(answerField).sendKeys(prop.getProperty("SecurityAnswer2"));
//			driver.findElement(continueButtonForLogin).click();
//			String welcomeMsg = driver.findElement(By.xpath("//*[text()='Welcome!']")).getText();
//			Assert.assertEquals(welcomeMsg , "Welcome!");
	}

	public void UIForForgotPassphrase() {
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Forgot Passphrase?']")));
		driver.findElement(forgotPassphraseLink).click();
		System.out.println("Following elements should be available on Forgot Passphrase :");
		String EnterUserId = driver.findElement(userIDWithLabel).getText();
		System.out.println(EnterUserId);
		String ContinueButton = driver.findElement(forgotUserContbutton).getText();
		System.out.println(ContinueButton);
		ObjectRepo.test.log(Status.PASS, EnterUserId + "," + ContinueButton);
	}

	public void forgotPassphrasevalidData() throws InterruptedException {
		driver.findElement(forgotPassphraseLink).click();
		driver.findElement(emailAddress).sendKeys("test12");
		System.out.println("step2 : Entered user id is valid");
		Thread.sleep(1000);

		driver.findElement(forgotUserContbutton).click();
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(successMessageForPassphrase));
		String ExpectedSuccessMessage = driver.findElement(successMessageForPassphrase).getText();

		System.out.println("Step 4 : Success Message:" + ExpectedSuccessMessage);
		ObjectRepo.test.log(Status.PASS,
				"step4 : Success Message : Email with instruction to reset passphrase will be sent to registered email address");
		String ActualSuccessMessage = "Email with instruction to reset passphrase will be sent to registered email address";
		Assert.assertEquals(ActualSuccessMessage, ExpectedSuccessMessage);
	}

	public void forgotPassphraseinvalidData() throws InterruptedException {
		driver.findElement(forgotPassphraseLink).click();
		System.out.println("step : Click on forgot passphrase Link  ");
		ObjectRepo.test.log(Status.PASS, "step1 : Click on forgot Passphrase Link");
		driver.findElement(emailAddress).sendKeys(prop.getProperty("InvalidUserID1"));
		System.out.println("step : Entered Invalid user Id");
		ObjectRepo.test.log(Status.PASS, "step2 : Entered Invalid UserID");

		String message1 = driver.findElement(errorMessageForUserIDpassphrase).getText();
		System.out.println("Step : Error message :" + message1);
		Assert.assertEquals(message1, "Enter valid User ID");
		ObjectRepo.test.log(Status.PASS, message1);

		WebElement verifyContinueButton = driver.findElement(CONTINUEBtn);
		if (verifyContinueButton.isEnabled()) {
			System.out.println("Step: Continue Button is Enabled");
			System.out.println("Step: User Entered valid data");
		} else {
			System.out.println("Step : Continue Button is Disabled");

		}

		ObjectRepo.test.log(Status.PASS, "step : forgot Passphrase with invalid Data");

	}

	public void forgotPassphraseEmptyData() {
		driver.findElement(forgotPassphraseLink).click();
		System.out.println("step : Click on forgot passphrase Link  ");
		ObjectRepo.test.log(Status.PASS, "step1 : Click on forgot passphrase Link");
		driver.findElement(emailAddress).sendKeys("");
		System.out.println("step : Keep user id field empty");
		ObjectRepo.test.log(Status.PASS, "step2 : Keep user id field empty");

		WebElement verifyContinueButton = driver.findElement(CONTINUEBtn);
		if (verifyContinueButton.isEnabled()) {
			System.out.println("Step: Continue Button is Enabled");
		} else {
			System.out.println("Step: Continue Button is Disabled");
			System.out.println("Step: User ID field is empty");
		}

		ObjectRepo.test.log(Status.PASS, "step : forgot Passphrase with Empty Data");

	}

	public void AllowToChangePassphrase() throws InterruptedException {
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(WelcomeButton));
		driver.findElement(WelcomeButton).click();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='User Profile']")));
		WebElement element = driver.findElement(UserProfile);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);

		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(ChangePassAndSecurity));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,9000)");

		Thread.sleep(1000);
		// new WebDriverWait(driver,
		// 60).until(ExpectedConditions.visibilityOfElementLocated((ChangePassAndSecurity)));
		driver.findElement(ChangePassAndSecurity).click();
		System.out.println("Step: Change Passphrase and Security Questions link Available and Accessible");
		ObjectRepo.test.log(Status.PASS,
				"step : Change Passphrase and Security Questions link Available and Accessible");
		ObjectRepo.test.log(Status.PASS, "step : Reset Passphrase and Security Questions page displayed");
	}

	public void assignRoleToUserwithinsameRoleType() throws InterruptedException {
		driver.findElement(CloseButtonOnTerms).click();
		Thread.sleep(500);
		driver.findElement(Search1).click();
		driver.findElement(Search1).sendKeys(struserId);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@role='tab']")).click();
		driver.findElement(RegisteredSearchedUser).click();
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1700)");
		Thread.sleep(1000);
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(500);

		// driver.findElement(By.xpath("(//*[@data-testid='CloseIcon'])[1]")).click();
		driver.findElement(SelectRole).click();
		driver.findElement(SelectIndividualRole).click();
		driver.findElement(SelectAlternateAccountRepresentativeRole).click();
		Thread.sleep(1000);

		Thread.sleep(4000);
		WebElement abc = driver.findElement(SubmitButton);
		j.executeScript("arguments[0].click();", abc);
		Thread.sleep(6000);

		String successmsg = driver.findElement(RoleChangeSuccessMsg).getText();
		Assert.assertEquals("User role has been changed.", successmsg);
		System.out.println("JU is able to change user role within same role type");
		ObjectRepo.test.log(Status.PASS, "JU is able to change user role within same role type");

	}

	public void assignRoleToUserwithindifferentRoleType() throws InterruptedException {
		driver.findElement(CloseButtonOnTerms).click();
		Thread.sleep(500);
		driver.findElement(Search1).click();
		driver.findElement(Search1).sendKeys(struserId);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@role='tab']")).click();
		driver.findElement(RegisteredSearchedUser).click();
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1800)");
		Thread.sleep(1000);

		driver.findElement(SelectRoleType).click();
		driver.findElement(By.xpath("(//*[text()='Jurisdiction Users'])")).click();
		JavascriptExecutor j1 = (JavascriptExecutor) driver;
		j1.executeScript("window.scrollBy(0,250)", "");

		driver.findElement(SelectRole).click();
		Thread.sleep(1000);
		driver.findElement(SelectRegistrarRole).click();

		Thread.sleep(4000);
		WebElement abc = driver.findElement(SubmitButton);
		JavascriptExecutor j5 = (JavascriptExecutor) driver;
		j5.executeScript("arguments[0].click();", abc);
		Thread.sleep(6000);

		String successmsg = driver.findElement(By.xpath("//p[text()='Proposed Role Change request is raised.']"))
				.getText();
		Assert.assertEquals("Proposed Role Change request is raised.", successmsg);
		System.out.println("JU is able to change user role within different role type");
		ObjectRepo.test.log(Status.PASS, "JU is able to change user role within different role type");

	}

	public void Termsandconditions() throws InterruptedException {
		try {
			WebElement PageHeader = driver.findElement(By.xpath(
					"//*[text()='Updated Terms and Conditions' and contains(@class,\"MuiTypography-root MuiTypography-h2\")]"));
			PageHeader.isDisplayed();
			Thread.sleep(500);
			ObjectRepo.test.log(Status.PASS, "step : Terms and condition pop Displayed");
			driver.findElement(TermCheckbox).click();
			Thread.sleep(500);
			driver.findElement(UpdateTermConditionsContinewButton).click();
			Thread.sleep(1000);
			driver.findElement(CloseButtonOnTerms).click();
			Thread.sleep(500);
		} catch (Exception e) {
			System.out.println("Terms and conditions pop up not displayed");
		}
	}

	public void runtime_Login_with_Approved_User() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(userid).sendKeys(struserId);

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Pass@12345");
//			Thread.sleep(4000);
		new WebDriverWait(driver, 40).until(ExpectedConditions.elementToBeClickable(loginbutton));
//			driver.findElement(checkBoxRememberMe).click();
		WebElement element = driver.findElement(loginbutton);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
//			driver.findElement(answerField).sendKeys(prop.getProperty("SecurityAnswer2"));
//			driver.findElement(continueButtonForLogin).click();
//			String welcomeMsg = driver.findElement(By.xpath("//*[text()='Welcome!']")).getText();
//			Assert.assertEquals(welcomeMsg , "Welcome!");
		driver.findElement(answerField).sendKeys(prop.getProperty("SecurityAnswer2"));
		driver.findElement(continueButtonForLogin).click();
//			String welcomeMsg = driver.findElement(By.xpath("//*[text()='Welcome!']")).getText();
//			Assert.assertEquals(welcomeMsg, "Welcome!");

	}

	public void runtime_Login_with_Pending_User() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(userid).sendKeys(struserId);

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Pass@12345");
//			Thread.sleep(4000);
		new WebDriverWait(driver, 40).until(ExpectedConditions.elementToBeClickable(loginbutton));
//			driver.findElement(checkBoxRememberMe).click();
		WebElement element = driver.findElement(loginbutton);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
//			driver.findElement(answerField).sendKeys(prop.getProperty("SecurityAnswer2"));
//			driver.findElement(continueButtonForLogin).click();
//			String welcomeMsg = driver.findElement(By.xpath("//*[text()='Welcome!']")).getText();
//			Assert.assertEquals(welcomeMsg , "Welcome!");
		driver.findElement(answerField).sendKeys(prop.getProperty("SecurityAnswer2"));
		driver.findElement(continueButtonForLogin).click();
//			String welcomeMsg = driver.findElement(By.xpath("//*[text()='Welcome!']")).getText();
//			Assert.assertEquals(welcomeMsg, "Welcome!");

	}

	public void ChangeJurisdictionfromUser() throws InterruptedException {
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(welButton));
		WebElement element = driver.findElement(welButton);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		Thread.sleep(500);
		WebElement element1 = driver.findElement(UserProfile);
		js2.executeScript("arguments[0].click()", element1);

		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(ChangeJU));
		driver.findElement(ChangeJU).click();
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(SelectJU));
		Thread.sleep(1000);
		driver.findElement(SelectJU).click();
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//span[text()='Washington' and contains(@class,\"MuiTypography-root MuiTypography-body1 MuiListItemText-primary\")]")));
		driver.findElement(By.xpath(
				"//span[text()='Quebec' and contains(@class,\"MuiTypography-root MuiTypography-body1 MuiListItemText-primary\")]"))
				.click();
		driver.findElement(countinue).click();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,930)");
		Thread.sleep(4000);

		driver.findElement(TermCheckbox).click();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.findElement(countinue).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		driver.findElement(By.xpath(
				"//p[text()='Your User Registration has been transferred to the selected Jurisdiction successfully.']"))
				.click();
	}

	public void DenyChangeJUFromRegistrarwithreason() throws InterruptedException {
		driver.findElement(By.xpath("//*[@data-testid='ExpandMoreIcon']")).click();
		driver.findElement(Search2).click();
		JavascriptExecutor j2 = (JavascriptExecutor) driver;
		j2.executeScript("window.scrollBy(0,761)");
		driver.findElement(Search2).sendKeys(struserId);
		Thread.sleep(3000);
		WebElement element2 = driver.findElement(PendingSearchedUser);
		Actions action = new Actions(driver);
		action.moveToElement(element2).build().perform();
		driver.findElement(PendingSearchedUser).click();
		Thread.sleep(6000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1800)");
		Thread.sleep(1000);
		WebElement element3 = driver.findElement(Deny);
		Actions action1 = new Actions(driver);
		action1.moveToElement(element3).build().perform();
		driver.findElement(Deny).click();

		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(SelectReasonDenial));
		driver.findElement(SelectReasonDenial).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()='Denial Reason 1']")).click();
		Thread.sleep(1000);

		driver.findElement(commentfield).sendKeys("Test Comment");
		Thread.sleep(1000);

		js.executeScript("window.scrollBy(0,2650)");
		new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(SubmitButton));
		WebElement E2 = driver.findElement(SubmitButton);
		js.executeScript("arguments[0].click();", E2);
		//
//			String successmsg = driver.findElement(By.xpath("//*[text()='Your change of jurisdiction request has been denied.']"))
//					.getText();
//			Assert.assertEquals("Your change of jurisdiction request has been denied.", successmsg);
//			System.out.println("Your change of jurisdiction request has been denied.");
//			ObjectRepo.test.log(Status.PASS, "Role Change Request have been denied by Registrar");
	}

	public void DenyChangeJUFromRegistrarwithoutreason() throws InterruptedException {
		driver.findElement(By.xpath("//*[@data-testid='ExpandMoreIcon']")).click();
		driver.findElement(Search2).click();
		JavascriptExecutor j2 = (JavascriptExecutor) driver;
		j2.executeScript("window.scrollBy(0,761)");
		driver.findElement(Search2).sendKeys(struserId);
		Thread.sleep(3000);
		WebElement element2 = driver.findElement(PendingSearchedUser);
		Actions action = new Actions(driver);
		action.moveToElement(element2).build().perform();
		driver.findElement(PendingSearchedUser).click();
		Thread.sleep(6000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1800)");
		Thread.sleep(1000);
		WebElement element3 = driver.findElement(Deny);
		Actions action1 = new Actions(driver);
		action1.moveToElement(element3).build().perform();
		driver.findElement(Deny).click();

//			new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(SelectReasonDenial));
//			driver.findElement(SelectReasonDenial).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[text()='Denial Reason 1']")).click();
//			Thread.sleep(1000);
		//
//			driver.findElement(By.xpath("//textarea[contains(@class,'MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputMultiline') and @name='Comments']")).sendKeys("Test Comment");
//			Thread.sleep(1000);
		//
		js.executeScript("window.scrollBy(0,2650)");
		WebElement E2 = driver.findElement(SubmitButton);
		if (E2.isEnabled()) {
			System.out.println("Denial Reason Selected");
		} else {
			System.out.println("Denial Reason not selected and any comment not provided");
			ObjectRepo.test.log(Status.PASS, "Denial Reason not selected and any comment not provided");
		}

	}

	public void runtime_Login_with_QAJurisdiction_Registrar() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(userid).sendKeys(prop.getProperty("LoginAsJUQA"));
		driver.findElement(password).sendKeys(prop.getProperty("LoginAsJUQAPassword"));
//			Thread.sleep(4000);
		new WebDriverWait(driver, 40).until(ExpectedConditions.elementToBeClickable(loginbutton));
//			driver.findElement(checkBoxRememberMe).click();
		WebElement element = driver.findElement(loginbutton);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		driver.findElement(answerField).sendKeys(prop.getProperty("SecurityAnswer2"));
		driver.findElement(continueButtonForLogin).click();
//			String welcomeMsg = driver.findElement(By.xpath("//*[text()='Welcome!']")).getText();
//			Assert.assertEquals(welcomeMsg , "Welcome!");
	}

	public void RevisionRequestFromRegistrar() throws InterruptedException {
		driver.findElement(By.xpath("//*[@data-testid='ExpandMoreIcon']")).click();
		driver.findElement(Search2).click();
		JavascriptExecutor j2 = (JavascriptExecutor) driver;
		j2.executeScript("window.scrollBy(0,761)");
		driver.findElement(Search2).sendKeys(struserId);
		Thread.sleep(3000);
		WebElement element2 = driver.findElement(PendingSearchedUser);
		Actions action = new Actions(driver);
		action.moveToElement(element2).build().perform();
		driver.findElement(PendingSearchedUser).click();
		Thread.sleep(6000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1800)");
		Thread.sleep(1000);
		WebElement element3 = driver.findElement(RevisionRequest);
		Actions action1 = new Actions(driver);
		action1.moveToElement(element3).build().perform();
		driver.findElement(RevisionRequest).click();
		Thread.sleep(1000);
		driver.findElement(commentfield).sendKeys("Test Comment");
		Thread.sleep(1000);

		js.executeScript("window.scrollBy(0,2650)");
		new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(SubmitButton));
		WebElement E2 = driver.findElement(SubmitButton);
		js.executeScript("arguments[0].click();", E2);
		Thread.sleep(1000);
		new WebDriverWait(driver, 60).until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[text()='User has successfully requested revisions']")));
		String successmsg = driver.findElement(By.xpath("//p[text()='User has successfully requested revisions']"))
				.getText();
		Assert.assertEquals(successmsg, "User has successfully requested revisions");
		System.out.println("User has successfully requested revisions");
		ObjectRepo.test.log(Status.PASS, "User has successfully requested revisions");
	}

	public void InactiveUserFromJU() throws InterruptedException {

		new WebDriverWait(driver, 40).until(ExpectedConditions.elementToBeClickable(CloseButtonOnTerms));
		driver.findElement(CloseButtonOnTerms).click();
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(Search1));
		driver.findElement(Search1).click();
		driver.findElement(Search1).sendKeys(struserId);
		Thread.sleep(4000);
		// driver.findElement(By.xpath("//button[@role='tab']")).click();
		driver.findElement(RegisteredSearchedUser).click();
		Thread.sleep(4000);

		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(UserDetalisheader));
		driver.findElement(Menu).click();
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(DeactiveUserlogin));
		driver.findElement(DeactiveUserlogin).click();
		//
//			WebElement element1 = driver.findElement(DeactiveUserlogin);
//			JavascriptExecutor js3 = (JavascriptExecutor) driver;
//			js3.executeScript("arguments[0].click()", element1);

		driver.findElement(DeactiveWithoutProfileAccess).click();
		Thread.sleep(1000);
		driver.findElement(DeactiveprofileReasons).sendKeys("No data Required");
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(countinue));
		driver.findElement(countinue).click();
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//p[text()='Account status is changed to Inactive. The user can not login to the system.']")));
		String message1 = driver
				.findElement(By.xpath(
						"//p[text()='Account status is changed to Inactive. The user can not login to the system.']"))
				.getText();
		System.out.println("success message :" + message1);
		Assert.assertEquals(message1, "Account status is changed to Inactive. The user can not login to the system.");
		ObjectRepo.test.log(Status.PASS, message1);
		Thread.sleep(1000);
		driver.findElement(CloseButtonOnTerms).click();
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(Search1));
		driver.findElement(Search1).click();
		driver.findElement(Search1).sendKeys(struserId);
		Thread.sleep(4000);

		String element4 = driver.findElement(By.xpath("(//div[@class='MuiDataGrid-cellContent'])[5]")).getText();
		System.out.println("User Status :" + element4);
		Assert.assertEquals(element4, "Inactive");
		ObjectRepo.test.log(Status.PASS, message1);

	}

	public void InactiveUserWithoutReasonFromJU() throws InterruptedException {
		new WebDriverWait(driver, 40).until(ExpectedConditions.elementToBeClickable(CloseButtonOnTerms));
		driver.findElement(CloseButtonOnTerms).click();
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(Search1));
		driver.findElement(Search1).click();
		driver.findElement(Search1).sendKeys(struserId);
		Thread.sleep(4000);
		// driver.findElement(By.xpath("//button[@role='tab']")).click();
		driver.findElement(RegisteredSearchedUser).click();
		Thread.sleep(4000);

		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(UserDetalisheader));
		driver.findElement(Menu).click();
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(DeactiveUserlogin));
		driver.findElement(DeactiveUserlogin).click();

		WebElement element1 = driver.findElement(DeactiveUserlogin);
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("arguments[0].click()", element1);
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(DeactiveWithoutProfileAccess));
		driver.findElement(DeactiveWithoutProfileAccess).click();

		WebElement E1 = driver.findElement(countinue);
		if (E1.isEnabled()) {
			System.out.println("User Entered Reson");
		} else {
			System.out.println("Continue Button is disabled please enter reason for inactive user");

		}

	}

	public void InactiveUserWithInvalidReasonFromJU() throws InterruptedException {
		new WebDriverWait(driver, 40).until(ExpectedConditions.elementToBeClickable(CloseButtonOnTerms));
		driver.findElement(CloseButtonOnTerms).click();
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(Search1));
		driver.findElement(Search1).click();
		driver.findElement(Search1).sendKeys(struserId);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@role='tab']")).click();
		driver.findElement(RegisteredSearchedUser).click();
		Thread.sleep(4000);

		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(UserDetalisheader));
		driver.findElement(Menu).click();
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(DeactiveUserlogin));
		Thread.sleep(500);
		driver.findElement(DeactiveUserlogin).click();

		WebElement element1 = driver.findElement(DeactiveUserlogin);
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("arguments[0].click()", element1);
		Thread.sleep(1000);
		driver.findElement(DeactiveWithoutProfileAccess).click();

		driver.findElement(DeactiveprofileReasons).sendKeys("@@@@#$");
		Thread.sleep(1000);

		WebElement element = driver.findElement(By.xpath("//p[@id='deactiveProfileReason-helper-text']"));
		String element7 = driver.findElement(By.xpath("//p[@id='deactiveProfileReason-helper-text']")).getText();
		System.out.println("Error Message :" + element7);
		if (element.isDisplayed()) {
			System.out.println("Continue Button is disabled please enter valid reason for inactive user");

		} else {
			System.out.println("User Entered valid Reson");

		}
	}

	public void ActivateUserFromJU() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@role='tab']")).click();
		driver.findElement(RegisteredSearchedUser).click();
		Thread.sleep(4000);
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(UserDetalisheader));
		driver.findElement(Menu).click();
		Thread.sleep(1000);
		driver.findElement(ActiveProfileAccess).click();

		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//p[text()='Account status is changed to Active. The user can login to the system.']")));
		String message1 = driver
				.findElement(By
						.xpath("//p[text()='Account status is changed to Active. The user can login to the system.']"))
				.getText();
		System.out.println("success message :" + message1);
		Assert.assertEquals(message1, "Account status is changed to Active. The user can login to the system.");
		ObjectRepo.test.log(Status.PASS, message1);
		new WebDriverWait(driver, 40).until(ExpectedConditions.elementToBeClickable(CloseButtonOnTerms));
		driver.findElement(CloseButtonOnTerms).click();

		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(Search1));
		driver.findElement(Search1).click();
		driver.findElement(Search1).sendKeys(struserId);
		Thread.sleep(4000);

		String element4 = driver.findElement(By.xpath("(//div[@class='MuiDataGrid-cellContent'])[5]")).getText();
		System.out.println("User Status :" + element4);
		String element5 = driver.findElement(By.xpath("(//div[@class='MuiDataGrid-cellContent'])[7]")).getText();
		System.out.println("User Account Status :" + element5);

		Assert.assertEquals(element4, "Active");
		ObjectRepo.test.log(Status.PASS, message1);
	}

	public void searchuserInPending() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@data-testid='ExpandMoreIcon']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@type='search'])[2]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
		driver.findElement(Search2).sendKeys(struserId);
		Thread.sleep(5000);

	}

	public void Login_with_QAJurisdiction_Authority() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(userid).sendKeys("registrar2.que");
		driver.findElement(passphrase1).sendKeys("Eqanim@123");

		new WebDriverWait(driver, 40).until(ExpectedConditions.elementToBeClickable(loginbutton));
//			driver.findElement(checkBoxRememberMe).click();
		WebElement element = driver.findElement(loginbutton);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		driver.findElement(answerField).sendKeys(prop.getProperty("SecurityAnswer2"));
		driver.findElement(continueButtonForLogin).click();
	}

	public void ViewDetails_For_RegisterdUser() throws InterruptedException {

		driver.findElement(RegisteredSearchedUser).click();
		Thread.sleep(4000);
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(UserDetalisheader));
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,985)", "");
		String message1 = driver.findElement(By.xpath("(//p[text()='California'])[2]")).getText();
		System.out.println("Jurisdiction :" + message1);
		Assert.assertEquals(message1, "California");
		ObjectRepo.test.log(Status.PASS, "User is registered with california jurisdiction");

		System.out.println(
				"Jurisdiction Authority is able to view the details of any user  who are in their Jurisdiction only");
		ObjectRepo.test.log(Status.PASS,
				"Jurisdiction Authority is able to view the details of any user  who are in their Jurisdiction only");

	}

	public void ViewDetails_Foruser_ProposedtoAuthority() throws InterruptedException {
		driver.findElement(PendingSearchedUser).click();
		Thread.sleep(2000);
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(UserDetalisheader));
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,985)", "");
		String message1 = driver.findElement(By.xpath("//p[text()='Proposed to Authority']")).getText();
		System.out.println("Status :" + message1);
		Assert.assertEquals(message1, "Proposed to Authority");
		ObjectRepo.test.log(Status.PASS, "User Request Status is Proposed to Authority");

		System.out.println(
				"Jurisdiction Authority is able to view the details of any user with Proposed to Authority status");
		ObjectRepo.test.log(Status.PASS,
				"Jurisdiction Authority is able to view the details of any user with Proposed to Authority status");
	}

	public void Cancel_COJ_FromUser() throws InterruptedException {
		driver.findElement(CloseButtonOnTerms).click();
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(welButton));
		WebElement element = driver.findElement(welButton);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		Thread.sleep(500);

		WebElement element1 = driver.findElement(UserProfile);
		js2.executeScript("arguments[0].click()", element1);
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(UserProfilePage));
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@href='/change-jurisdiction']")).click();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		new WebDriverWait(driver, 60).until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Change Jurisdiction Request']")));
		driver.findElement(selectJurisdictionCancelButton).click();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h6[text()='Warning!']")));
		driver.findElement(selectJurisdictionContButton).click();
		Thread.sleep(2000);
		String message2 = driver
				.findElement(By.xpath("//p[text()='Your change of jurisdiction request has been cancelled.']"))
				.getText();
		System.out.println("Status :" + message2);
		Assert.assertEquals(message2, "Your change of jurisdiction request has been cancelled.");
		ObjectRepo.test.log(Status.PASS, "Your change of jurisdiction request has been cancelled.");

		driver.findElement(CloseButtonOnTerms).click();
		// driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		// driver.findElement(By.xpath("(//div[@class='MuiDataGrid-cellContent'])[1]")).click();
		String message3 = driver.findElement(By.xpath("(//div[@class='MuiDataGrid-cellContent'])[1]")).getText();
		System.out.println("User Request Status :" + message3);
	}
	
	public void StatusChangeFromJA() throws InterruptedException {
		driver.findElement(By.xpath("//*[@data-testid='ExpandMoreIcon']")).click();
		driver.findElement(By.xpath("(//*[@type='search'])[2]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
		driver.findElement(By.xpath("(//*[@type='search'])[2]")).sendKeys(userId1);
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[@class='link-cell'])[6]")).click();
		Thread.sleep(6000);
		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		js5.executeScript("window.scrollBy(0,1950)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='Approved']")).click();
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(4000);
		WebElement l = driver.findElement(By.xpath("//*[@type='submit']"));
		j.executeScript("arguments[0].click();", l);
		Thread.sleep(2000);
		String successmsg = driver.findElement(By.xpath("//p[text()='Role Change Approved']")).getText();
		Assert.assertEquals("Role Change Approved", successmsg);
		System.out.println("Role Change Approved");
		ObjectRepo.test.log(Status.PASS, "Role Change Approved");		
	}


	public void AssignRole_to_User_other_than_JU() throws InterruptedException {
		driver.findElement(Search1).click();
		driver.findElement(Search1).sendKeys(struserId);
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@class='link-cell'])[1]")).click();
		Thread.sleep(4000);
		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		js5.executeScript("window.scrollBy(0,1900)");
		Thread.sleep(1000);
		driver.findElement(Approved).click();
		Thread.sleep(1000);
		driver.findElement(SelectRoleType).click();
		driver.findElement(SelectIndividualRole).click();
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(SelectRole).click();
		Thread.sleep(1000);
		driver.findElement(SelectIndividualRole).click();

		Thread.sleep(4000);
		WebElement element2 = driver.findElement(SelectRoleType);
		Actions action = new Actions(driver);
		action.moveToElement(element2).build().perform();
		Thread.sleep(4000);
		WebElement abc = driver.findElement(SubmitButton);
		j.executeScript("arguments[0].click();", abc);
		Thread.sleep(6000);

		String successmsg = driver.findElement(By.xpath("//*[text()='User request has been approved.']")).getText();
		Assert.assertEquals("User request has been approved.", successmsg);
		System.out.println("User request has been approved");
		ObjectRepo.test.log(Status.PASS, "User request has been approved");
	}

	public void CrossJurisdictionfromUser() throws InterruptedException {
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(welButton));
		WebElement element = driver.findElement(welButton);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		Thread.sleep(500);
		WebElement element1 = driver.findElement(UserProfile);
		js2.executeScript("arguments[0].click()", element1);

		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,985)", "");
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(CrossJU));
		driver.findElement(CrossJU).click();
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(SelectJU));
		Thread.sleep(1000);
		driver.findElement(SelectJU).click();

		driver.findElement(By.xpath(
				"//span[text()='Quebec' and contains(@class,\"MuiTypography-root MuiTypography-body1 MuiListItemText-primary\")]"))
				.click();
		Thread.sleep(1000);
		driver.findElement(TermCheckbox).click();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.findElement(countinue).click();

		driver.findElement(selectJurisdictionCancelButton).click();
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h6[text()='Warning!']")));
		System.out.println("Warning pop up displayed");
		driver.findElement(countinue).click();
		Thread.sleep(1000);
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(UserProfilePage));

		String message2 = driver.findElement(UserProfilePage).getText();
		System.out.println("Page Name :" + message2);
		Assert.assertEquals(message2, "User Profile");
		ObjectRepo.test.log(Status.PASS, "User Profile page displayed");
	}

	public void ViewDetails_For_PendingdUser() throws InterruptedException {
		driver.findElement(By.xpath("//*[@data-testid='ExpandMoreIcon']")).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");

		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[@class='link-cell'])[6]")).click();
		Thread.sleep(4000);
		String message1 = driver.findElement(By.xpath("//h1[text()='User Details']")).getText();
		System.out.println("Page Name :" + message1);
		Assert.assertEquals(message1, "User Details");
		ObjectRepo.test.log(Status.PASS, "User Details page is displayed");

		JavascriptExecutor j1 = (JavascriptExecutor) driver;
		j1.executeScript("window.scrollBy(0,985)", "");
		String message2 = driver
				.findElement(By.xpath("(//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-md-4 css-1rral16'])[14]"))
				.getText();
		System.out.println("" + message2);
		ObjectRepo.test.log(Status.PASS, message2);
	}

	public void RevisionRequest_FromJU() throws InterruptedException {
		driver.findElement(Search1).click();
		driver.findElement(Search1).sendKeys(struserId);
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[@href='/jurisdiction-user-actions'])")).click();
		Thread.sleep(4000);
		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		js5.executeScript("window.scrollBy(0,1800)");
		Thread.sleep(1000);
		driver.findElement(Approved).click();
		Thread.sleep(1000);
		driver.findElement(SelectRoleType).click();
		driver.findElement(SelectIndividualRole).click();
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(SelectRole).click();
		Thread.sleep(1000);
		driver.findElement(SelectIndividualRole).click();

		Thread.sleep(4000);
		WebElement element2 = driver.findElement(SelectRoleType);
		Actions action = new Actions(driver);
		action.moveToElement(element2).build().perform();
		Thread.sleep(4000);
		WebElement abc = driver.findElement(SubmitButton);
		j.executeScript("arguments[0].click();", abc);
		Thread.sleep(6000);

		String successmsg = driver.findElement(By.xpath("//*[text()='User request has been approved.']")).getText();
		Assert.assertEquals("User request has been approved.", successmsg);
		System.out.println("User request has been approved");
		ObjectRepo.test.log(Status.PASS, "User request has been approved");
	}

	public void accessibility_Of_Contact_Us_link_for_logged_in_User() throws InterruptedException {
		System.out.println("Step: Click on Contact Us Menu");
		WebElement element = driver.findElement(ConatctUsMenu);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		ObjectRepo.test.log(Status.PASS, "Step: Click on Conatct Us Menu");
		String Contact_Us = driver.findElement(ConatctUsMenu).getText();
		Assert.assertEquals(Contact_Us, "Contact Us");
	}

	public void login_fail_error_message_for_empty_data() throws InterruptedException {
		System.out.println("Step: Keep User id and password field empty and click on Log in button");
		Thread.sleep(4000);
		driver.findElement(LoginButton).click();
		Thread.sleep(4000);
		ObjectRepo.test.log(Status.PASS, "Step: Keep User id and password field empty and click on Log in button");
		String Userid_Errormessage = driver.findElement(UserIdErrorMessage).getText();
		Thread.sleep(5000);
		Assert.assertEquals(Userid_Errormessage, "User ID is required");
		String Passphrase_Errormessage = driver.findElement(PassphraseErrorMessage).getText();
		Assert.assertEquals(Passphrase_Errormessage, "Passphrase is required");

	}

	public void ju_can_Initiate_passphrase_security_questions_changes_for_any_user() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Step: Search any user");
		driver.findElement(SearchField).sendKeys("ab");
		ObjectRepo.test.log(Status.PASS, "Step: Search any user");
		System.out.println("Step: Click on Action button of any user");
		Thread.sleep(10000);

		WebElement element = driver.findElement(actionButton);
//		Actions act =new Actions(driver); 
//		act.sendKeys(Keys.RIGHT).build().perform();//Page Down  
//		System.out.println("Scroll down perfomed");     
//		Thread.sleep(3000);
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()",element);

//		JavascriptExecutor js2 = (JavascriptExecutor) driver;
//        js2.executeScript("window.scrollBy(1125,70)");

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = arguments[0].scrollWidth ", element);
//        js2.executeScript("arguments[0].scrollIntoView();", element);
		Thread.sleep(3000);
		element.click();
	}

	public void unKnown_user_landing_page_is_displayed_in_English_by_default() {
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		String header = driver.findElement(selectJurisdiction_Header).getText();
		Assert.assertEquals(header, "Select Jurisdiction");
	}

	public void displayPagesInSelectedLanguage() {
		String header = driver.findElement(pageHeader).getText();
		Assert.assertEquals(header, "WCI, Inc. Registry Platform");
	}

	public void userisAbleToSwitchBetweenLanguages() {
		System.out.println("Step: Click on language");
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(LanguageArrow));
		driver.findElement(LanguageArrow).click();
		ObjectRepo.test.log(Status.PASS, "Step: Click on language");
		System.out.println("Step: Select French language");
		driver.findElement(spanishLanguage).click();
		ObjectRepo.test.log(Status.PASS, "Step: Select French language");
		String header = driver.findElement(frenchPageHeader).getText();
		Assert.assertEquals(header, "WCI, Inc. Registry Platform-F");
	}

}
