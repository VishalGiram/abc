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

public class ForgotUserIDAndPassphrasePOM extends base {

	
	private By forgotUserIdLink = By.xpath("//a[text()='Forgot User ID?']");   //change
	private By emailAddress = By.xpath("//input[@id='emailId']");
	private By emailAddressWithLabel = By.xpath("//h6[text()='Please enter a valid email address:']");
	private By forgotUserContbutton = By.xpath("//button[text()='CONTINUE']");  //change
	private By forgotPassphraseLink = By.xpath("//a[text()='Forgot Passphrase?']"); //change
	private By userIDWithLabel = By.xpath("//h6[text()='Please enter your User ID:']");
	private By userAddress = By.xpath("//*[@name='emailId']");
	private By forgotPassphraseContbutton = By.xpath("//button[text()='CONTINUE']");
	private By successMessageForUseID = By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']");
	private By successMessageForPassphrase = By.xpath("//p[text()='Email with instruction to reset passphrase will be sent to registered email address.']");
	
	private By createUserId = By.xpath("//input[@name='createUserID']");
	private By passphrase = By.xpath("//input[@name='passphrase']");
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
	private By creUserProfRegBut = By.xpath("//button[text()='REGISTER']");
	private By termsOfUseCheckBox = By.xpath("//span[text()='I accept the WCI, Inc.']");
	private By creUserProfCancelButton = By.xpath("//button[text()='CANCEL']");
	
	private By salutation = By.xpath("//input[@id='salutation']");
	private By firstName = By.xpath("//input[@name='firstName']");
	private By middleName = By.xpath("//input[@id='middleName']");
	private By lastName = By.xpath("//input[@name='lastName']");
	private By suffix = By.xpath("//input[@id='suffix']");
	private By date = By.xpath("//div[@id='day']"); 
	private By selectDate = By.xpath("//li[@data-value='5']");
	private By month = By.xpath("//div[@id='month']"); 
	private By selectMonth = By.xpath("//*[text()='January']");
	private By year = By.xpath("//div[@id='year']"); // update
	private By selectYear = By.xpath("//li[@data-value='1964']");
	private By telephoneNumber = By.xpath("//input[@name='telephoneNumber']");
	private By extension = By.xpath("//input[@id='ext']");
	private By mobilePhone = By.xpath("//input[@id='mobilePhone']");
	private By email = By.xpath("//input[@name='email']");
	private By confirmEmail = By.xpath("//input[@name='confirmEmail']");
	private By emailLangPref = By.xpath("//div[@id='emailLanguagePreference']"); // update
	private By selLangEng = By.xpath("//ul//li[text()='English']");
	private By selLanguage = By.xpath("//li[text()='Select Language']");
	private By employer = By.xpath("//input[@name='employer']");
	private By department = By.xpath("//input[@id='department']");
	private By jobTitle = By.xpath("//input[@id='jobTitle']");
	private By faxNumber = By.xpath("//input[@id='faxNumber']");
	private By perInfoContButton = By.xpath("//button[text()='CONTINUE']"); // update
	private By perInfoCancelButton = By.xpath("//button[text()='CANCEL']");
	
	private By finishButton = By.xpath("//button[text()='FINISH']");
	
	private By selectjurisdiction = By.xpath("//div[text()='Select Jurisdiction']");  //change
    private By selectQubec = By.xpath("//*[text()='Quebec']");
    private By selectlanguage = By.xpath("//div[text()='Select Language']");
    private By selectEnglish = By.xpath("//*[text()='English']");
    private By contbutton = By.xpath("//button[text()='CONTINUE']");
       // private By emailAddress = By.xpath("//input[@id='emailId']");
        private By errorMessageForUserID = By.xpath("//span[text()='Enter valid Email Address']");
        private By CONTINUEBtn=By.xpath("//button[text()='CONTINUE']");
        private By SuccessMessage=By.xpath("(//p[@class='MuiTypography-root MuiTypography-body2 css-74todz'])[1]");
        private By successmessageonsubmitrequireddocument=By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-74todz']");
        private By closesuccessmessageonsubmitrequireddocument=By.xpath("(//*[name()='svg'][@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv'])[1]");
        private By validatesubmitrequireddocument=By.xpath("(//h1[normalize-space()='2. Submit Required Documents'])[1]");
        private By finishbtn=By.xpath("//*[text()='FINISH']");
	
	public ForgotUserIDAndPassphrasePOM() {
		PageFactory.initElements(driver, this);
		
	}
	
	public static String generateUserIdString() {
		int length = 3;
        boolean useLetters = true;
        boolean useNumbers = true;
        String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
        
        String  randomString = ("Testdata"+generatedString);
        return randomString;
	}
	
	public void ValidateSubmitRequiredDocumentsAccessibilityOfSubmitRequiredDocuments() throws Exception
    {
		Thread.sleep(2000);
        String success=driver.findElement(successmessageonsubmitrequireddocument).getText();
        System.out.println(success);
        driver.findElement(closesuccessmessageonsubmitrequireddocument).click();
        String actual=driver.findElement(validatesubmitrequireddocument).getText();
        String expected="2. Submit Required Documents";
        Assert.assertEquals(actual, expected);
        String userID=driver.findElement(By.xpath("//p[text()='User Id:']")).getText();
        System.out.println("User ID is"+ userID);
        System.out.println("Step :User on the Submit Required Documents page");
        ObjectRepo.test.log(Status.PASS, "Step :User on the Submit Required Documents page");
        WebElement btn=driver.findElement(finishbtn);
        if(btn.isDisplayed())
        {
            System.out.println("Step:FINISH Button is Displayed");
        }
        else
        {
            System.out.println("Step:FINISH Button is Not Displayed");
        }
        System.out.println("Step :FINISH Button is Displayed on the Submit Required Documents page");
        ObjectRepo.test.log(Status.PASS, "Step :FINISH Button is Displayed on the Submit Required Documents page");
        driver.findElement(finishbtn).click();
        System.out.println("Step :The user get redirected to public home page.");
        ObjectRepo.test.log(Status.PASS, "Step :The user get redirected to public home page.");
    }
	
	public void forgotIdInvalidEmailData() {
		WebDriverWait wait=new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(forgotUserIdLink));
		//Thread.sleep(2000);
		WebElement element=driver.findElement(forgotUserIdLink);
		Actions action=new Actions(driver);
		action.moveToElement(element).build().perform();
		action.click(element).build().perform();
		driver.findElement(forgotUserIdLink).click();
        //driver.findElement(forgotUserIdLink).click();
        System.out.println("step1 : Click on forgot UserId Link  ");
        ObjectRepo.test.log(Status.PASS, "step1 : Click on forgot UserId Link" );
        driver.findElement(emailAddress).sendKeys("autoregcal2@yopmail.com");
        System.out.println("step2 : Enter email id which is not exists in system");
        ObjectRepo.test.log(Status.PASS, "step2 : Enter email id which is not exists in system" );
        driver.findElement(CONTINUEBtn).click();
        System.out.println("step3 : Click on CONTINUE Button");
        ObjectRepo.test.log(Status.PASS, "step3 : Click on CONTINUE Button" );
        String ExpectedSuccessMessage=driver.findElement(SuccessMessage).getText();
        System.out.println("Step 4 : Success Message:"+ ExpectedSuccessMessage);
        ObjectRepo.test.log(Status.PASS, "step4 : Success Message : Email with User ID information is sent to your registered email address." );
        String ActualSuccessMessage="Email with User ID information is sent to your registered email address.";
        //Assert.assertEquals(ActualSuccessMessage, ExpectedSuccessMessage);
        
    }
	
	public void forgotIdEmptyData() {
		WebDriverWait wait=new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(forgotUserIdLink));
		WebElement element=driver.findElement(forgotUserIdLink);
		Actions action=new Actions(driver);
		action.moveToElement(element).build().perform();
		action.click(element).build().perform();
        System.out.println("step : Click on forgot UserId Link  ");
        ObjectRepo.test.log(Status.PASS, "step1 : Click on forgot UserId Link" );
        driver.findElement(emailAddress).sendKeys("");
        System.out.println("step : Keep email id address field empty");
        ObjectRepo.test.log(Status.PASS, "step2 : Keep email id address field empty" );
        WebElement verifyContinueButton= driver.findElement(CONTINUEBtn);
        if(verifyContinueButton.isEnabled())
        {
            System.out.println("Step: Continue Button is Enabled");
        }
        else
        {
            System.out.println("Step: Continue Button is Disabled");
        }
        
        ObjectRepo.test.log(Status.PASS, "step : Continue Button is Disabled" );
        
    }
	
	public void forgotIdInvalidData() {
		WebDriverWait wait=new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(forgotUserIdLink));
		//Thread.sleep(2000);
		WebElement element=driver.findElement(forgotUserIdLink);
		Actions action=new Actions(driver);
		action.moveToElement(element).build().perform();
		action.click(element).build().perform();
		driver.findElement(forgotUserIdLink).click();
        //driver.findElement(forgotUserIdLink).click();
        System.out.println("step : Click on forgot UserId Link  ");
        ObjectRepo.test.log(Status.PASS, "step1 : Click on forgot UserId Link" );
        driver.findElement(emailAddress).sendKeys(prop.getProperty("InvalidEmail"));
        System.out.println("step : Entered Invalid EmailID");
        ObjectRepo.test.log(Status.PASS, "step2 : Entered Invalid EmailID" );
        String message1=driver.findElement(errorMessageForUserID).getText();
        System.out.println("Step : Error message :"+ message1);
        Assert.assertEquals(message1, "Enter valid Email Address");
        ObjectRepo.test.log(Status.PASS, message1 );
        WebElement verifyContinueButton= driver.findElement(CONTINUEBtn);
        if(verifyContinueButton.isEnabled())
        {
            System.out.println("Step: Continue Button is Enabled");
        }
        else
        {
            System.out.println("Step : Continue Button is Disabled");
        }
        
        ObjectRepo.test.log(Status.PASS, "step : Continue Button is Disabled" );
        
    }
	
	public void createLogInPageForUniqueId() {
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.findElement(createUserId).sendKeys("pravinjogi1");
		driver.findElement(passphrase).sendKeys("Pass@12345");
		driver.findElement(confirmPassphrase).sendKeys("Pass@12345");
		driver.findElement(secQuestion1).click();
		driver.findElement(selSecQue1).click();
		driver.findElement(answer1).sendKeys("Answer1");
		driver.findElement(secQuestion2).click();
		driver.findElement(selSecQue2).click();
		driver.findElement(answer2).sendKeys("Answer2");
		driver.findElement(secQuestion3).click();
		driver.findElement(selSecQue3).click();
		driver.findElement(answer3).sendKeys("Answer3");
		WebElement element = driver.findElement(termsOfUseCheckBox);
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("arguments[0].click()", element);
		WebElement element1 = driver.findElement(creUserProfRegBut);
		js3.executeScript("arguments[0].click()", element1);
		WebElement element2 = driver.findElement(finishButton);
		js3.executeScript("arguments[0].click()", element2);
		driver.findElement(By.xpath("//h4[text()='Log In']")).getText();	
	}
	
	public void personalInformationforUniqueEmail() throws InterruptedException {
		driver.findElement(salutation).sendKeys("Mr");
		new WebDriverWait(driver, 30)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='firstName']")));
		driver.findElement(firstName).sendKeys(prop.getProperty("FirstName"));
		driver.findElement(middleName).sendKeys(prop.getProperty("MiddleName"));
		driver.findElement(lastName).sendKeys(prop.getProperty("LastName"));
		driver.findElement(suffix).sendKeys(prop.getProperty("Suffix"));
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable((date))).click();
		driver.findElement(selectDate).click();
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(month)).click();
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(selectMonth)).click();
		driver.findElement(year).click();
		WebElement element = driver.findElement(selectYear);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		driver.findElement(telephoneNumber).sendKeys(prop.getProperty("TelephoneNo"));
		driver.findElement(extension).sendKeys("1");
		driver.findElement(mobilePhone).sendKeys("12345688890");
		driver.findElement(email).clear();
		driver.findElement(email).sendKeys("pravin@yopmail.com");
		driver.findElement(confirmEmail).clear();
		driver.findElement(confirmEmail).sendKeys("pravin@yopmail.com");
		driver.findElement(emailLangPref).click();
		driver.findElement(selLangEng).click();
		driver.findElement(employer).sendKeys(prop.getProperty("Employer"));
		driver.findElement(department).sendKeys("testdata");
		driver.findElement(jobTitle).sendKeys("testdata");
		driver.findElement(faxNumber).sendKeys("1234567890");
		WebElement element1 = driver.findElement(perInfoContButton);
		js.executeScript("arguments[0].click()", element1);
        System.out.println("Step: Enter valid data in all fields and click on continue button");
		ObjectRepo.test.log(Status.PASS, "Step: Enter valid data in all fields and click on continue button");
	}
	
	public void submitRegistrationApplicationAndTermsOfUseCheckBoxOnCreateLogInPage() throws InterruptedException {
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.findElement(createUserId).sendKeys(generateUserIdString());
		driver.findElement(passphrase).sendKeys("Pass@12345");
		driver.findElement(confirmPassphrase).sendKeys("Pass@12345");
		driver.findElement(secQuestion1).click();
		driver.findElement(selSecQue1).click();
		driver.findElement(answer1).sendKeys("@@@@");
		driver.findElement(secQuestion2).click();
		driver.findElement(selSecQue2).click();
		driver.findElement(answer2).sendKeys("++++");
		Thread.sleep(5000);
		
		WebElement elementp  = driver.findElement(secQuestion3);
//		WebDriverWait wait = new WebDriverWait(driver, 30);
//		wait.until(ExpectedConditions.elementToBeClickable(elementp));
//		
//		//driver.findElement(answer3).click();
//		
//		//elementp.click();
		WebElement element9  = driver.findElement(answer3);
		
//		WebElement element1  = driver.findElement(secQuestion3);
//		WebDriverWait wait = new WebDriverWait(driver, 30);
//		wait.until(ExpectedConditions.elementToBeClickable(element1));
//		Actions action = new Actions(driver);
//		action.click(element1).build().perform();
		
		WebDriverWait wait = new WebDriverWait(driver, 20);     
		wait.until(ExpectedConditions.elementToBeClickable(element9));
		Actions action = new Actions(driver);
		action.moveToElement(element9).moveToElement(elementp).click().build().perform();
	
		driver.findElement(selSecQue3).click();
		driver.findElement(answer3).sendKeys("----");
		String termsOfUseText=driver.findElement(termsOfUseCheckBox).getText();
		System.out.println("The I accept WCI inc terms of use text is :" + termsOfUseText);
		System.out.println("Step : Unchecked Accept Terms & Conditions box  & Try to Click on Register button");
		ObjectRepo.test.log(Status.PASS, "Step : Unchecked Accept Terms & Conditions box  & Try to Click on Register button");
	    WebElement continueButton=driver.findElement(creUserProfRegBut);
	    if(continueButton.isEnabled()) {
	    	System.out.println("The continue button on create log in page should be enabled.");
	    }
	    else {
	    	System.out.println("The continue button on create log in page should be disabled");
	    }
	    System.out.println("Step : Checked Accept Terms & Conditions box  &  Click on Register button");
		ObjectRepo.test.log(Status.PASS, "Step : Checked Accept Terms & Conditions box  & Click on Register button");
		WebElement element3 = driver.findElement(termsOfUseCheckBox);
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("arguments[0].click()", element3);
		if(continueButton.isEnabled()) {
	    	System.out.println("The continue button on create log in page should be enabled.");
	    }
	    else {
	    	System.out.println("The continue button on create log in page should be disabled");
	    }
		WebElement element2 = driver.findElement(creUserProfRegBut);
		js3.executeScript("arguments[0].click()", element2);
	}
	public void forgotUserIDLinkOnHomePageWithValidData() throws InterruptedException {
		System.out.println("step : Click on forgot user id link ");
		ObjectRepo.test.log(Status.PASS, "step : Click on forgot user id link ");
		WebDriverWait wait=new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(forgotUserIdLink));
		Thread.sleep(2000);
		WebElement element=driver.findElement(forgotUserIdLink);
		Actions action=new Actions(driver);
		action.moveToElement(element).build().perform();
		action.click(element).build().perform();
		//driver.findElement(forgotUserIdLink).click();
		WebElement emailaddressField=driver.findElement(emailAddress);
		if(emailaddressField.isEnabled()) {
			System.out.println("Email address field should be clickable");
		}
		else {
			System.out.println("Email address field should not be clickable");
		}
		System.out.println("Step : Enter valid data in email address field");
		ObjectRepo.test.log(Status.PASS, "Step : Enter valid data in email address field");
		driver.findElement(emailAddress).sendKeys("autoregcal2@yopmail.com");
		System.out.println("Step : Click on Continue button");
		ObjectRepo.test.log(Status.PASS, "Step : Click on Continue button");
		//driver.findElement(forgotUserContbutton).click();
		WebElement element1 = driver.findElement(forgotUserContbutton);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element1);
		System.out.println("Step : Observe the success message");
		ObjectRepo.test.log(Status.PASS, "Step : Observe the success message");
		String successMessageAfterForgotUserIDFlow=driver.findElement(successMessageForUseID).getText();
		System.out.println("The success message is : "+successMessageAfterForgotUserIDFlow);
	}
}
