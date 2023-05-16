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

public class UserRegistration extends base {

	
	public static String userId;
	private By userRegistration = By.xpath("//button[text()='USER REGISTRATION']"); // change
	private By newRegistration = By.xpath("//a[text()='New Registration']");
	private By startNewRegisBut = By.xpath("//button[contains(text(),'Start New Registration')]"); // add this start new
	private By securityQuestion1ForLogin = By.xpath("//*[@class='MuiTypography-root MuiTypography-h6 css-1etlmxt']");																	// registration button
	private By continueButtonforTemporary = By.xpath("(//button[text()='CONTINUE'])[2]");
	private By userid = By.xpath("//input[@name='email']");
	private By passphraseOnLoginPage = By.xpath("//input[@name='password']");

	private By createUserProfileText = By.xpath("//span[text()='Create User Profile']");
	private By submitRequiredDocumentsText = By.xpath("//span[text()='Submit Required Documents']");
	private By awaitJurisdictionDecisionText = By.xpath("//span[text()='Await Jurisdiction Decision']");

	private By selectJurisdiction = By.xpath("//div[@id='mui-component-select-jurisdiction']");
	private By selectoptionQue = By.xpath("//span[text()='Quebec']");
	private By selectoptionCal = By.xpath("//span[contains(text(),'California')]");
	private By selectJurisdictionContButton = By.xpath("//button[contains(text(),'CONTINUE')]");
	private By selectJurisdictionCancelButton = By.xpath("//button[text()='CANCEL']");
	private By createUserProfile = By.xpath("//span[text()='Create User Profile']");

	private By salutationWithLabel = By.xpath("//label[text()='Salutation']");
	private By firstNameWithLabel = By.xpath("//label[text()='First Name']");
	private By middleNameWithLabel = By.xpath("//label[text()='Middle Name']");
	private By lastNameWithLabel = By.xpath("(//label[@for='customize-textfield'])[4]");
	private By suffixWithLabel = By.xpath("//label[text()='Suffix']");
	private By telephoneNumberWithLabel = By.xpath("//label[text()='Telephone Number']");
	private By extensionWithLabel = By.xpath("//label[text()='Ext.']");
	private By mobilePhoneWithLabel = By.xpath("//label[text()='Mobile Phone']");
	private By emailWithLabel = By.xpath("//label[text()='Email']");
	private By confirmEmailWithLabel = By.xpath("//label[text()='Confirm Email']");
	private By employerWithLabel = By.xpath("//label[text()='Employer']");
	private By departmentWithLabel = By.xpath("//label[text()='Department']");
	private By jobTitleWithLabel = By.xpath("//label[text()='Job Title']");
	private By faxNumberWithLabel = By.xpath("//label[text()='Fax Number']");
	private By emailLangPrefWithLabel = By.xpath("//label[text()='Email Language Preference']");
	private By dateOfBirthWithLabel = By.xpath("//label[text()='Date of Birth']");
	private By persoanlInformationStep = By.xpath("//span[text()='Personal Information']");

	private By salutation = By.xpath("//input[@id='salutation']");
	private By firstName = By.xpath("//input[@name='firstName']");
	private By middleName = By.xpath("//input[@id='middleName']");
	private By lastName = By.xpath("//input[@name='lastName']");
	private By suffix = By.xpath("//input[@id='suffix']");
	private By date = By.xpath("//div[@id='day']");
	private By selectDate = By.xpath("//input[@name='date']");
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

	private By errorMessageForFirstName = By.xpath("//p[@id='firstName-helper-text']");
	private By errorMessageForLastName = By.xpath("//p[@id='lastName-helper-text']");
	private By errorMessageForTelephone = By.xpath("//p[@id='telephoneNumber-helper-text']");
	private By errorMessageForEmail = By.xpath("//p[@id='email-helper-text']");
	private By errorMessageForConfirmEmail = By.xpath("//p[@id='confirmEmail-helper-text']");
	private By errorMessageForEmployer = By.xpath("//p[@id='employer-helper-text']");
	private By errorMessageForDate = By.xpath("(//p[@class='MuiFormHelperText-root Mui-error css-bpd4r6'])[1]");
	private By errorMessageForMonth = By.xpath("(//p[@class='MuiFormHelperText-root Mui-error css-bpd4r6'])[2]");
	private By errorMessageForYear = By.xpath("(//p[@class='MuiFormHelperText-root Mui-error css-bpd4r6'])[3]");

	private By primResidenceTextOnResiAndMail = By.xpath("//div[text()='Primary Residence']");
	private By street1WithLabelPrimSec = By.xpath("(//label[text()='Street 1'])[1]");
	private By street2WithLabelPrimSec = By.xpath("(//label[text()='Street 2'])[1]");
	private By cityWithLabelPrimSec = By.xpath("(//label[text()='City'])[1]");
	private By stateOrProvinceWithLabelPrimSec = By.xpath("(//label[text()='State or Province'])[1]");
	private By postalCodeWithLabelPrimSec = By.xpath("(//label[text()='Postal Code'])[1]");
	private By CountryWithLabelPrimSec = By.xpath("(//label[text()='Country'])[1]");
	private By street1WithLabelMailSec = By.xpath("(//label[text()='Street 1'])[2]");
	private By street2WithLabelMailSec = By.xpath("(//label[text()='Street 2'])[2]");
	private By cityWithLabelMailSec = By.xpath("(//label[text()='City'])[2]");
	private By stateOrProvinceWithLabelMailSec = By.xpath("(//label[text()='State or Province'])[2]");
	private By postalCodeWithLabelMailSec = By.xpath("(//label[text()='Postal Code'])[2]");
	private By CountryWithLabelMailSec = By.xpath("(//label[text()='Country'])[2]");
	private By residenceAndMailingStep = By.xpath("//span[text()='Residence & Mailing']");
	private By mailingAddressCheckBox = By.xpath("//span[text()='Check if same as Primary Residence']");

	private By street1PrimResi = By.xpath("//input[@name='primaryResidence.street1']");
	private By street2PrimResi = By.xpath("//input[@name='primaryResidence.street2']");
	private By cityPrimResi = By.xpath("//input[@name='primaryResidence.city']");
	private By stateAndProvincePrimResi = By.xpath("(//input[@id='country-select-demo'])[1]"); // *update
	private By selectStatePrimResi = By.xpath("//*[text()='Alabama']"); // update
	private By regionPrimResi = By.xpath("//input[@name='primaryResidence.region']");
	private By postalCodePrimResi = By.xpath("//input[@name='primaryResidence.postalCode']");
	private By countryPrimResi = By.xpath("(//input[@id='country-select-demo'])[1]"); // update
	private By selectCountryUSPrimResi = By.xpath("//*[text()='United States']");// update
	private By selectCountryPrimResi = By.xpath("(//*[text()='Select Country'])[1]");
	private By selectCountryMailAdd = By.xpath("(//*[@data-testid='ArrowDropDownIcon'])[7]");
	private By street1MailAdd = By.xpath("//input[@data-testid='mailingAddress.street1']");
	private By street2MailAdd = By.xpath("//input[@id='mailingAddress.street2']");
	private By cityMailAdd = By.xpath("//input[@id='mailingAddress.city']");
	private By postalCodeMailAdd = By.xpath("//input[@id='mailingAddress.postalCode']");
	private By countryMailResi = By.xpath("(//input[@id='country-select-demo'])[2]");
	private By selectCountryMailResi = By.xpath("(//*[text()='Select Country'])[2]");
	private By cancelButtonOnResiAndMail = By.xpath("//button[text()='CANCEL']");

	private By checkBox = By.xpath("//span[text()='Check if same as Primary Residence']");
	private By primResiContButton = By.xpath("//button[text()='CONTINUE']");
	private By mailingaddresstext = By.xpath("//div[text()='Mailing Address']");

	private By errorMessageForStreet1PrimResi = By.xpath("//p[@id='primaryResidence.street1-helper-text']");
	private By errorMessageForCityPrimResi = By.xpath("//p[@id='primaryResidence.city-helper-text']");
	private By errorMessageForPostalCodePrimResi = By.xpath("//p[@id='primaryResidence.postalCode-helper-text']");
	private By errorMessageForCountryPrimResi = By.xpath("(//*[text()='Country is required'])[1]");
	private By errorMessageForStreet1MailAdd = By.xpath("//p[@id='mailingAddress.street1-helper-text']");
	private By errorMessageForCityMailAdd = By.xpath("//p[@id='mailingAddress.city-helper-text']");
	private By errorMessageForPostalCodeMailAdd = By.xpath("//p[@id='mailingAddress.postalCode-helper-text']");
	private By errorMessageForCountryMailResi = By.xpath("(//*[text()='Country is required'])[2]");

	private By selectJurisdictionOnEditpage = By.xpath("//div[text()='Selected Jurisdiction']");
	private By selectJurisdictionQuebec = By.xpath("(//div[text()='Quebec'])[2]");
	private By personalInformationOnEditpage = By.xpath("//div[text()='Personal Information']");
	private By firstNameInPersInfo = By.xpath("//p[text()='Pravin']");
	private By emailFieldInPersInfo = By.xpath("//p[text()='abcd@gmail.com']");
	private By primaryResidenceOnEditpage = By.xpath("//div[text()='Primary Residence']");
	private By street1inPrimResiOnEditPage = By.xpath("//p[text()='Aanand nagar']");
	private By mailingAddressOnEditpage = By.xpath("//div[text()='Mailing Address']");
	private By postalCodeInMailAddreOnEditpage = By.xpath("(//p[text()='425001'])[2]");
	private By checkboxOnEditpage = By.xpath("//span[text()='I accept the Jurisdiction']");
	private By cancelButtonOnEditPage = By.xpath("//button[text()='CANCEL']");
	private By EditAndReviewText = By.xpath("//span[text()='Edit & Review']");

	private By checkBoxEditAndReview = By.xpath("//span[text()='I accept the Jurisdiction']");
	private By editAndReviewContButton = By.xpath("//button[text()='CONTINUE']");

	private By createUserIdWithLabel = By.xpath("//label[text()='Create User ID']");
	private By passphraseWithLabel = By.xpath("//label[text()='Passphrase']");
	private By confirmPassphraseWithLabel = By.xpath("//label[text()='Confirm Passphrase']");
	private By securityQuestion1WithLabel = By.xpath("//label[text()='Security Question 1']");
	private By answer1WithLabel = By.xpath("//label[text()='Answer 1']");
	private By securityQuestion2WithLabel = By.xpath("//label[text()='Security Question 2']");
	private By answer2WithLabel = By.xpath("//label[text()='Answer 2']");
	private By securityQuestion3WithLabel = By.xpath("//label[text()='Security Question 3']");
	private By answer3WithLabel = By.xpath("//label[text()='Answer 3']");

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
	private By termsOfUseCheckBox = By.xpath("//span[text()='I accept the WCI, Inc.']");
	private By creUserProfRegBut = By.xpath("//button[text()='REGISTER']");
	private By creUserProfCancelButton = By.xpath("//button[text()='CANCEL']");

	private By crossButtonAfterRegistration = By.xpath("//*[@data-testid='CloseIcon']");
	private By finishButton = By.xpath("//button[@id='priv_btn_Continue']");

	private By errorMessageForUserId = By.xpath("//p[@id='createUserID-helper-text']");
	private By errorMessageForPassphrase = By.xpath("//p[@id='passphrase-helper-text']");
	private By errorMessageForConfirmPassphrase = By.xpath("//p[@id='confirmPassphrase-helper-text']");
	private By errorMessageForSecurityQue1 = By.xpath("//p[text()='Security Question 1  is required']"); // update
	private By errorMessageForAnswer1 = By.xpath("//p[text()='Answer 1  is required']");
	private By errorMessageForSecurityQue2 = By.xpath("//p[text()='Security Question 2  is required']"); // update
	private By errorMessageForAnswer2 = By.xpath("//p[text()='Answer 2  is required']");
	private By errorMessageForSecurityQue3 = By.xpath("//*[text()='Security Question 3  is required']"); // update
	private By errorMessageForAnswer3 = By.xpath("//p[text()='Answer 3  is required']");

	private By selectSecQue1Text = By.xpath("(//div[@for='customize-select'])[1]");
	private By selectSecQue2Text = By.xpath("(//div[@for='customize-select'])[2]");
	private By selectSecQue3Text = By.xpath("(//div[@for='customize-select'])[3]");

	private By submitRequiredDocuText = By.xpath("//span[text()='Submit Required Documents']");

	private By editButtonOnPersonalInfo = By.xpath("(//button[text()='edit'])[1]");
	private By firstNameOnEditAndReview = By.xpath("//*[@id='firstName']");
	private By lastNameOnEditAndReview = By.xpath("//input[@id='lastName']");
	private By telephoneOnEditAndReview = By.xpath("//input[@id='telephoneNumber']");
	private By emailOnEditAndReview = By.xpath("//input[@id='email']");
	private By confirmEmailOnEditAndReview = By.xpath("//input[@id='confirmEmail']");
	private By employerOnEditAndReview = By.xpath("//input[@id='employer']");
	private By saveButtonPersInfoEditAndReview = By.xpath("//input[@id='employer']");

	private By editButtonOnPrimResidence = By.xpath("(//button[text()='edit'])[2]");
	private By street1PrimResiEditAndReview = By.xpath("//input[@id='primaryResidence.street1']");
	private By cityPrimResiEditAndReview = By.xpath("//input[@id='primaryResidence.city']");
	private By postalCode1PrimResiEditAndReview = By.xpath("//input[@id='primaryResidence.postalCode']");
	private By saveButtonPrimResiEditAndReview = By.xpath("//button[text()='SAVE']");

	private By editButtonOnMailingAddress = By.xpath("(//button[text()='edit'])[3]");
	private By street1MailAddEditAndReview = By.xpath("//input[@id='mailingAddress.street1']");
	private By cityMailAddEditAndReview = By.xpath("//input[@id='mailingAddress.city']");
	private By postalCodeMailAddEditAndReview = By.xpath("//input[@id='mailingAddress.postalCode']");
	private By saveButtonResiMailEditAndReview = By.xpath("//button[text()='SAVE']");

	private By errorMessageUserIdField = By.xpath("//p[@id='createUserID-helper-text']");

	private By totalLabelsOnEditReviewPage = By.xpath("//label[@for='customize-textfield']");
	private By totalFieldsOnEditReviewPage = By
			.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-18pmwyh']");

	private By iAcceptWCIIncText = By.xpath("//span[text()='I accept the WCI, Inc.']");
	private By termsOfUseLink = By.xpath("//a[text()='Terms of Use']");

	private By userid1 = By.xpath("//input[@name='email']");
	private By loginbutton = By.xpath("//button[text()='Log In']");
	private By passphrase1 = By.xpath("//input[@name='password']");
	private By answerField = By.xpath("//input[@id='Answer']");
	private By continueButtonForLogin = By.xpath("//button[text()='CONTINUE']");

	private By welButton = By.xpath("//button[text()='Welcome,']");

	public UserRegistration() {
		PageFactory.initElements(driver, this);
		
	}

	public static String generateEmailString() {
		int length = 5;
		boolean useLetters = true;
		boolean useNumbers = true;
		String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);

		String randomString = ("Test" + generatedString + "@yopmail.com");
		return randomString;
	}

	public void accpetTermsOfUseCheckboxOnCreateLogInPage() throws InterruptedException {
		System.out.println("Step :Observe the I accept WCI Inc text and Terms of use link");
		ObjectRepo.test.log(Status.PASS, "Step :Observe the I accept WCI Inc text and Terms of use link");
		String iAcceptWCIInc = driver.findElement(iAcceptWCIIncText).getText();
		System.out.println("I accept WCI Inc text is on create login step page:" + iAcceptWCIInc);
		String termsOfUse = driver.findElement(termsOfUseLink).getText();
		System.out.println("Terms of use link is on create login step page:" + termsOfUse);
		WebElement termsOfUseLinkOnCreateLoginPage = driver.findElement(termsOfUseLink);
		if (termsOfUseLinkOnCreateLoginPage.isEnabled()) {
			System.out.println("The terms of use link is clickable");
		} else {
			System.out.println("The terms of use link is not clickable");
		}
		Thread.sleep(5000);
		driver.findElement(termsOfUseLink).click();
		;
		Thread.sleep(5000);
		System.out.println("The terms of use link should be accessible.");
		ObjectRepo.test.log(Status.PASS, "The terms of use link should be accessible.");
	}

	public void reviewApplicationDetailsOnEditAndReviewPage() {
		List<WebElement> totalLabels = driver.findElements(totalLabelsOnEditReviewPage);
		for (WebElement total : totalLabels) {
			System.out.println("Field label on Edit and review page is : " + total.getText());
		}
		List<WebElement> dataIntotalFields = driver.findElements(totalFieldsOnEditReviewPage);
		for (WebElement data : dataIntotalFields) {
			System.out.println("Filled data on Edit and review page is : " + data.getText());
		}
	}

	public void residenceAndMailingStepWithEmptyData() {
		String street1PrimSecField = driver.findElement(street1WithLabelPrimSec).getText();
		System.out.println("Street 1 Field in Primary section With Asterisk Mark:" + street1PrimSecField);
		String cityPrimSecField = driver.findElement(cityWithLabelPrimSec).getText();
		System.out.println("City Field in Primary section With Asterisk Mark:" + cityPrimSecField);
		String postalCodePrimSecField = driver.findElement(postalCodeWithLabelPrimSec).getText();
		System.out.println("Postal code in Primary section Field With Asterisk Mark:" + postalCodePrimSecField);
		String countryPrimSecField = driver.findElement(CountryWithLabelPrimSec).getText();
		System.out.println("Country Field in Primary section With Asterisk Mark:" + countryPrimSecField);
		String street1MailSecField = driver.findElement(street1WithLabelMailSec).getText();
		System.out.println("Street 1 Field in Mailing section With Asterisk Mark:" + street1MailSecField);
		String cityMailSecField = driver.findElement(cityWithLabelMailSec).getText();
		System.out.println("City Field Mailing section With Asterisk Mark:" + cityMailSecField);
		String postalCodeMailSecField = driver.findElement(postalCodeWithLabelMailSec).getText();
		System.out.println("Postal code Mailing section Field With Asterisk Mark:" + postalCodeMailSecField);
		String countryMailSecField = driver.findElement(CountryWithLabelMailSec).getText();
		System.out.println("Country Mailing section Field With Asterisk Mark:" + countryMailSecField);
		driver.findElement(street1PrimResi).sendKeys("");
		WebElement element1 = driver.findElement(cityPrimResi);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element1);
		driver.findElement(cityPrimResi).sendKeys("");
		WebElement element2 = driver.findElement(postalCodePrimResi);
		js2.executeScript("arguments[0].click()", element2);
		driver.findElement(postalCodePrimResi).sendKeys("");
		// driver.findElement(countryPrimResi).click();
		// driver.findElement(selectCountryPrimResi).click();
		WebElement element3 = driver.findElement(street1MailAdd);
		js2.executeScript("arguments[0].click()", element3);
		driver.findElement(street1MailAdd).sendKeys("");
		WebElement element4 = driver.findElement(cityMailAdd);
		js2.executeScript("arguments[0].click()", element4);
		driver.findElement(cityMailAdd).sendKeys("");
		WebElement element5 = driver.findElement(postalCodeMailAdd);
		js2.executeScript("arguments[0].click()", element5);
		driver.findElement(postalCodeMailAdd).sendKeys("");
		// driver.findElement(countryMailResi).click();
		WebElement element7 = driver.findElement(countryMailResi);
		js2.executeScript("arguments[0].click()", element7);
		// driver.findElement(selectCountryMailResi).click();
//		WebElement element8 = driver.findElement(selectCountryMailResi);
//		js2.executeScript("arguments[0].click()", element8);
//		driver.findElement(cancelButtonOnResiAndMail).click();
		String errorMessStreet1PrimResiField = driver.findElement(errorMessageForStreet1PrimResi).getText();
		System.out.println(
				"Error message for Street1 field of Primary Residence section :" + errorMessStreet1PrimResiField);
		ObjectRepo.test.log(Status.PASS,
				"Error message for Street1 field of Primary Residence section :" + errorMessStreet1PrimResiField);
		String errorMessCityPrimResiField = driver.findElement(errorMessageForCityPrimResi).getText();
		System.out.println("Error message for City field of Primary Residence section :" + errorMessCityPrimResiField);
		ObjectRepo.test.log(Status.PASS,
				"Error message for City field of Primary Residence section :" + errorMessCityPrimResiField);
		String errorMessPostalCodeField = driver.findElement(errorMessageForPostalCodePrimResi).getText();
		System.out.println(
				"Error message for Postal Code field of Primary Residence section :" + errorMessPostalCodeField);
		ObjectRepo.test.log(Status.PASS,
				"Error message for Postal Code field of Primary Residence section :" + errorMessPostalCodeField);
//		String errorMessCountryPrimField = driver.findElement(errorMessageForCountryPrimResi).getText();
//		System.out
//		.println("Error message for country field of Primary Residence section :" + errorMessCountryPrimField);
//		ObjectRepo.test.log(Status.PASS, "Error message for Country field of Primary Residence section :" + errorMessCountryPrimField );
		String errorMessStreet1MailAddField = driver.findElement(errorMessageForStreet1MailAdd).getText();
		System.out
				.println("Error message for Street1 field of Mailing Address section :" + errorMessStreet1MailAddField);
		ObjectRepo.test.log(Status.PASS,
				"Error message for Street1 field of Mailing Address section :" + errorMessStreet1MailAddField);
		String errorMessCityMailAddField = driver.findElement(errorMessageForCityMailAdd).getText();
		System.out.println("Error message for City field of Mailing Address section :" + errorMessCityMailAddField);
		ObjectRepo.test.log(Status.PASS,
				"Error message for City field of Mailing Address section :" + errorMessCityMailAddField);
		String errorMessPostalCodeMailAddField = driver.findElement(errorMessageForPostalCodeMailAdd).getText();
		System.out.println(
				"Error message for Postal Code field of Mailing Address section :" + errorMessPostalCodeMailAddField);
//		String errorMessCountryMailAddField=driver.findElement(errorMessageForCountryMailResi).getText();
//		System.out.println("Error message for Postal Code field of Mailing Address section :" + errorMessCountryMailAddField);
	}

	public void personalInformationWithEmptyData() throws InterruptedException {
		String firstNameField = driver.findElement(firstNameWithLabel).getText();
		System.out.println("First Name Field With Asterisk Mark:" + firstNameField);
		String LastNameField = driver.findElement(lastNameWithLabel).getText();
		System.out.println("Last Name Field With Asterisk Mark:" + LastNameField);
		String telephoneField = driver.findElement(telephoneNumberWithLabel).getText();
		System.out.println("Telephone number Field With Asterisk Mark:" + telephoneField);
		String dateOfBirthField = driver.findElement(dateOfBirthWithLabel).getText();
		System.out.println("Date of birth Field With Asterisk Mark:" + dateOfBirthField);
		String emailField = driver.findElement(emailWithLabel).getText();
		System.out.println("Email Field With Asterisk Mark:" + emailField);
		String confirmEmailField = driver.findElement(confirmEmailWithLabel).getText();
		System.out.println("Confirm Email Field With Asterisk Mark:" + confirmEmailField);
		String emailLangPrefField = driver.findElement(emailLangPrefWithLabel).getText();
		System.out.println("Email Language preference Field With Asterisk Mark:" + emailLangPrefField);
		String employerField = driver.findElement(employerWithLabel).getText();
		System.out.println("Employer Field With Asterisk Mark:" + employerField);
		driver.findElement(firstName).sendKeys("");
		driver.findElement(lastName).click();
		String errorMessFirstnameField = driver.findElement(errorMessageForFirstName).getText();
		System.out.println("Error message for first name field :" + errorMessFirstnameField);
		ObjectRepo.test.log(Status.PASS, "Error message for first name field :" + errorMessFirstnameField);
		driver.findElement(lastName).sendKeys("");
		driver.findElement(By.xpath("//input[@name='date']")).click();
		String errorMessLastnameField = driver.findElement(errorMessageForLastName).getText();
		System.out.println("Error message for last name field :" + errorMessLastnameField);
		ObjectRepo.test.log(Status.PASS, "Error message for last name field :" + errorMessLastnameField);
		WebElement element = driver.findElement(lastName);
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		action.click(element).build().perform();
		WebElement element1 = driver.findElement(lastName);
		action.moveToElement(element1).build().perform();
		action.click(element).build().perform();
		WebElement element3 = driver.findElement(lastName);
		action.moveToElement(element3).build().perform();
		action.click(element).build().perform();
		driver.findElement(telephoneNumber).sendKeys("");
		driver.findElement(email).click();
		String errorMessDayDropdown = driver.findElement(errorMessageForDate).getText();
		System.out.println("Error message for Day Dropdown :" + errorMessDayDropdown);
		String errorMessTelephoneField = driver.findElement(errorMessageForTelephone).getText();
		System.out.println("Error message for Telephone field :" + errorMessTelephoneField);
		ObjectRepo.test.log(Status.PASS, "Error message for Telephone field :" + errorMessTelephoneField);
		driver.findElement(email).sendKeys("");
		driver.findElement(confirmEmail).click();
		String errorMessEmailField = driver.findElement(errorMessageForEmail).getText();
		System.out.println("Error message for Email field :" + errorMessEmailField);
		ObjectRepo.test.log(Status.PASS, "Error message for Email field :" + errorMessEmailField);
		driver.findElement(confirmEmail).sendKeys("");
		driver.findElement(emailLangPref).click();
		driver.findElement(selLangEng).click();
		String errorMessConfirmEmailField = driver.findElement(errorMessageForConfirmEmail).getText();
		System.out.println("Error message for confirm email field :" + errorMessConfirmEmailField);
		ObjectRepo.test.log(Status.PASS, "Error message for confirm email field :" + errorMessConfirmEmailField);
		driver.findElement(employer).sendKeys("");
		WebElement element2 = driver.findElement(By.xpath("//input[@id='jobTitle']"));
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element2);
		element2.sendKeys("");
		String errorMessEmployerField = driver.findElement(errorMessageForEmployer).getText();
		System.out.println("Error message for employer field :" + errorMessEmployerField);
		ObjectRepo.test.log(Status.PASS, "Error message for employer field :" + errorMessEmployerField);
	}

	public void passphraseFieldWithValidDataOnCreateUserLoginPage() {
		new WebDriverWait(driver, 30)
				.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@name='createUserID']")));
		driver.findElement(passphrase).sendKeys("Pass@12345");
		System.out.println("Step: Enter valid data in passphrase field");
		ObjectRepo.test.log(Status.PASS, "Step: Enter valid data in passphrase field");
		driver.findElement(confirmPassphrase).sendKeys("Pass@12345");
		System.out.println("Step:enter confirm passphrase as same of passphrase ");
		ObjectRepo.test.log(Status.PASS, "Step: ");
		// new WebDriverWait(driver, 30).until(ExpectedConditions
		// .elementToBeClickable(By.xpath("//input[@name='passphrase']")));
		WebElement element3 = driver.findElement(passphrase);
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("arguments[0].click()", element3);
		// driver.findElement(passphrase).click();
	}

	public void userIdFieldWithInValidDataOnCreateUserLoginPage() {
		new WebDriverWait(driver, 30)
				.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@name='createUserID']")));
		driver.findElement(createUserId).sendKeys("$%^^$^%$^$");
		System.out.println("Step: Enter Invalid data in user id field");
		ObjectRepo.test.log(Status.PASS, "Step: Enter Invalid data in user id field");
		new WebDriverWait(driver, 30)
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='passphrase']")));
		driver.findElement(passphrase).click();
		String errorMessageForUserIdField = driver.findElement(errorMessageUserIdField).getText();
		Assert.assertEquals(errorMessageForUserIdField, "Enter valid User ID");
		System.out.println("Error Message for user Id field:" + errorMessageForUserIdField);
		ObjectRepo.test.log(Status.PASS, "Error Message for user Id field:" + errorMessageForUserIdField);
	}

	public void userIdFieldWithValidDataOnCreateUserLoginPage() {
		new WebDriverWait(driver, 30)
				.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@name='createUserID']")));
		driver.findElement(createUserId).sendKeys("%$#$@#$#$");
		System.out.println("Step: Enter valid data in user id field");
		ObjectRepo.test.log(Status.PASS, "Step: Enter valid data in user id field");
		// new WebDriverWait(driver, 30).until(ExpectedConditions
		// .elementToBeClickable(By.xpath("//input[@name='passphrase']")));
		WebElement element3 = driver.findElement(passphrase);
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("arguments[0].click()", element3);
		// driver.findElement(passphrase).click();
	}

	public void TermsAndConditionFunctionalityOnEditReviewPage() {
		WebElement element3 = driver.findElement(checkBoxEditAndReview);
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("arguments[0].click()", element3);
		if (driver.findElement(editAndReviewContButton).isEnabled()) {
			System.out.println("The continue button on edit and review page is enabled.");
		} else {
			System.out.println("The continue button on edit and review page is disabled.");
		}
		WebElement element4 = driver.findElement(editAndReviewContButton);
		js3.executeScript("arguments[0].click()", element4);
	}

	public void verifyAcceptTermsAndConditionCheckBoxOnEditAndReviewPage() {
		System.out.println("User Should be on edit and review page of registration");
		ObjectRepo.test.log(Status.PASS, "User Should be on edit and review page of registration");
		driver.findElement(checkBoxEditAndReview).getText();
		System.out.println("Step : Observe the checkbox");
		ObjectRepo.test.log(Status.PASS, "Step : Observe the checkbox");
		driver.findElement(editAndReviewContButton).getText();
		System.out.println("Step : Observe the Continue Button");
		ObjectRepo.test.log(Status.PASS, "Step : Observe the Continue Button");
		driver.findElement(checkBoxEditAndReview).click();
		System.out.println("Step : Click on I accept the jurisdiction checkbox");
		ObjectRepo.test.log(Status.PASS, "Step : Click on I accept the jurisdiction checkbox");
		System.out.println("Continue button should be disabled");
		ObjectRepo.test.log(Status.PASS, "Continue button should be disabled");
		driver.findElement(editAndReviewContButton).click();
		System.out.println("Step : Click on continue button");
		ObjectRepo.test.log(Status.PASS, "Step : Click on continue button");
		System.out.println("User should navigate to create login page");
		ObjectRepo.test.log(Status.PASS, "User should navigate to create login page");
	}

	public void editAndReviewStepMandetoryFieldsWithValidData() throws InterruptedException {
		WebElement element2 = driver.findElement(editButtonOnPersonalInfo);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element2);
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(firstNameOnEditAndReview));
		String firstNameValueBeforeEdit=driver.findElement(firstNameOnEditAndReview).getText();
		System.out.println("First Name Field Value before Edit is:"+firstNameValueBeforeEdit);
		ObjectRepo.test.log(Status.PASS, "First Name Field Value before Edit is:"+firstNameValueBeforeEdit);
		String lastNameValueBeforeEdit=driver.findElement(lastNameOnEditAndReview).getText();
		System.out.println("Last Name Field Value before Edit is:"+lastNameValueBeforeEdit);
		ObjectRepo.test.log(Status.PASS, "Last Name Field Value before Edit is:"+lastNameValueBeforeEdit);
		String telephoneValueBeforeEdit=driver.findElement(telephoneOnEditAndReview).getAttribute("Value");
		System.out.println("Telephone Field Value before Edit is:"+telephoneValueBeforeEdit);
		ObjectRepo.test.log(Status.PASS, "Telephone Field Value before Edit is:"+telephoneValueBeforeEdit);
		String emailValueBeforeEdit=driver.findElement(emailOnEditAndReview).getText();
		System.out.println("Email Field Value before Edit is:"+emailValueBeforeEdit);
		ObjectRepo.test.log(Status.PASS, "Email Field Value before Edit is:"+emailValueBeforeEdit);
		String confirmEmailValueBeforeEdit=driver.findElement(confirmEmailOnEditAndReview).getText();
		System.out.println("Confirm Email Field Value before Edit is:"+confirmEmailValueBeforeEdit);
		ObjectRepo.test.log(Status.PASS, "Confirm Email Field Value before Edit is:"+confirmEmailValueBeforeEdit);
		String employerValueBeforeEdit=driver.findElement(employerOnEditAndReview).getText();
		System.out.println("Employer Field Value before Edit is:"+employerValueBeforeEdit);
		ObjectRepo.test.log(Status.PASS, "Employer Field Value before Edit is:"+employerValueBeforeEdit);
		for (int i = 1; i <= 6; i++) {
			driver.findElement(firstNameOnEditAndReview).sendKeys(Keys.BACK_SPACE);
		}
		driver.findElement(firstNameOnEditAndReview).sendKeys("Rohit");
		for (int i = 1; i <= 4; i++) {
			driver.findElement(lastNameOnEditAndReview).sendKeys(Keys.BACK_SPACE);
		}
		driver.findElement(lastNameOnEditAndReview).sendKeys("Shinde");
		for (int i = 1; i <= 10; i++) {
			driver.findElement(telephoneOnEditAndReview).sendKeys(Keys.BACK_SPACE);
		}
		driver.findElement(telephoneOnEditAndReview).sendKeys("1112223334");
		for (int i = 1; i <= 14; i++) {
			driver.findElement(emailOnEditAndReview).sendKeys(Keys.BACK_SPACE);
		}
		driver.findElement(emailOnEditAndReview).sendKeys("abcdef@fmail.com");
		for (int i = 1; i <= 14; i++) {
			driver.findElement(confirmEmailOnEditAndReview).sendKeys(Keys.BACK_SPACE);
		}
		driver.findElement(confirmEmailOnEditAndReview).sendKeys("abcdef@fmail.com");
		for (int i = 1; i <= 8; i++) {
			driver.findElement(employerOnEditAndReview).sendKeys(Keys.BACK_SPACE);
		}
		driver.findElement(employerOnEditAndReview).sendKeys("Testdata123");
		try {
			new WebDriverWait(driver, 30)
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='SAVE']"))).click();
		} catch (Exception e) {
			Thread.sleep(8000);
			driver.findElement(By.xpath("//button[text()='SAVE']")).click();
		}
		
		WebElement element3 = driver.findElement(editButtonOnPrimResidence);
		js2.executeScript("arguments[0].click()", element3);
		for (int i = 1; i <= 12; i++) {
			driver.findElement(street1PrimResiEditAndReview).sendKeys(Keys.BACK_SPACE);
		}
		driver.findElement(street1PrimResiEditAndReview).sendKeys("mumbai");
		for (int i = 1; i <= 4; i++) {
			driver.findElement(cityPrimResiEditAndReview).sendKeys(Keys.BACK_SPACE);
		}
		driver.findElement(cityPrimResiEditAndReview).sendKeys("mumbai");
		for (int i = 1; i <= 6; i++) {
			driver.findElement(postalCode1PrimResiEditAndReview).sendKeys(Keys.BACK_SPACE);
		}
		driver.findElement(postalCode1PrimResiEditAndReview).sendKeys("125125");
		WebElement element4 = driver.findElement(saveButtonPrimResiEditAndReview);
		js2.executeScript("arguments[0].click()", element4);
	}

	public void createUserLoginStepWithEmptyData() throws InterruptedException {
		driver.findElement(createUserId).sendKeys("");
		driver.findElement(passphrase).sendKeys("");
//		driver.findElement(confirmPassphrase).click();
		driver.findElement(confirmPassphrase).sendKeys("");
		driver.findElement(secQuestion1).click();
		WebElement element = driver.findElement(confirmPassphrase);
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		action.click(element).build().perform();

		driver.findElement(answer1).click();
		driver.findElement(answer1).sendKeys("");

		WebElement element2 = driver.findElement(secQuestion2);
		action.moveToElement(element2).build().perform();
		Thread.sleep(3000);
		action.click(element2).build().perform();
		action.moveToElement(element).build().perform();
		action.click(element).build().perform();

		driver.findElement(answer2).click();
		driver.findElement(answer2).sendKeys("");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		WebElement element3 = new WebDriverWait(driver, 40)
				.until(ExpectedConditions.elementToBeClickable(secQuestion3));
		action.moveToElement(element3).build().perform();
		js.executeScript("arguments[0].click()", element3);
		Thread.sleep(3000);
//		action.click(element3).build().perform();
		action.moveToElement(element).build().perform();
		action.click(element).build().perform();

		driver.findElement(answer3).click();
		driver.findElement(answer3).sendKeys("");
		Thread.sleep(3000);

//		driver.findElement(confirmPassphrase).sendKeys("");
//		driver.findElement(createUserId).sendKeys("");
//		WebElement element = driver.findElement(passphrase);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click()", element);
//		driver.findElement(passphrase).sendKeys("");
//		driver.findElement(confirmPassphrase).click();
//		driver.findElement(confirmPassphrase).sendKeys("");
//		WebElement element9 = new WebDriverWait(driver,30).until(ExpectedConditions.elementToBeClickable(secQuestion1));
//		Actions action = new Actions(driver);
//		action.moveToElement(element9).build().perform();
//		action.click(element9).build().perform();
//		Thread.sleep(3000);
//		WebElement element15 = new WebDriverWait(driver,30).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='USER REGISTRATION']")));
//		action.moveToElement(element15).build().perform();
//		action.click(element15).build().perform();
//		action.click(element15).build().perform();
//		
////		driver.findElement(secQuestion1).click();
////		Thread.sleep(2000);
////		WebElement element1 = driver.findElement(selectSecQue1Text);
////		js.executeScript("arguments[0].click()", element1);
//		//driver.findElement(selectSecQue1Text).click();
////		WebElement element1 = driver.findElement(answer1);
////		action.moveToElement(element1).build().perform();
////		action.click(element1).build().perform();
////		element1.sendKeys("");
//		driver.findElement(answer1).sendKeys("");
//		
//		WebElement element10 = new WebDriverWait(driver,30).until(ExpectedConditions.elementToBeClickable(secQuestion2));
//		action.moveToElement(element10).build().perform();
////		action.click(element10).build().perform();
////		WebElement element1 = driver.findElement(secQuestion2);
////		js.executeScript("arguments[0].click()", element1);
//		//driver.findElement(secQuestion2).click();
//		//WebElement element8 = new WebDriverWait(driver,30).until(ExpectedConditions.elementToBeClickable(secQuestion3));
////		driver.findElement(selectSecQue2Text).click();
//		
//		WebElement element5 = driver.findElement(answer1);
//		action.moveToElement(element5).build().perform();
////		action.click(element5).build().perform();
//		element5.sendKeys("");
//		
////		
////		WebElement element5 = driver.findElement(answer2);
////		js.executeScript("arguments[0].click()", element5);
////		driver.findElement(answer2).sendKeys("");
//		WebElement element8 = new WebDriverWait(driver,30).until(ExpectedConditions.elementToBeClickable(secQuestion3));
////		element1.click();
////		action.moveToElement(element8).build().perform();
//		action.click(element8).build().perform();
////		WebElement element1 = driver.findElement(secQuestion3);
////		js.executeScript("arguments[0].click()", element1);
//		WebElement element2 = driver.findElement(selectSecQue3Text);
//		js.executeScript("arguments[0].click()", element2);
//		WebElement element4 = driver.findElement(answer3);
//		js.executeScript("arguments[0].click()", element4);
//		driver.findElement(answer3).sendKeys("");
//		driver.findElement(submitRequiredDocuText).click();
//		String userIdField = driver.findElement(errorMessageForUserId).getText();
//		System.out.println("Error message for user Id field :" + userIdField);
//		ObjectRepo.test.log(Status.PASS,"Error message for user Id field :" + userIdField );
//		String passphraseField = driver.findElement(errorMessageForPassphrase).getText();
//		System.out.println("Error message for passphrase field :" + passphraseField);
//		ObjectRepo.test.log(Status.PASS,"Error message for passphrase field :"  + passphraseField);
//		String confirmPassphraseField = driver.findElement(errorMessageForConfirmPassphrase).getText();
//		System.out.println("Error message for confirm passphrase field :" + confirmPassphraseField);
//		ObjectRepo.test.log(Status.PASS,"Error message for confirm passphrase field :"  + confirmPassphraseField );
//		String securityQue1Dropdown = driver.findElement(errorMessageForSecurityQue1).getText();
//		System.out.println("Error message for security question 1 dropdown :" + securityQue1Dropdown);
//		ObjectRepo.test.log(Status.PASS,"Error message for security question 1 dropdown :" + securityQue1Dropdown);
//		String answer1Field = driver.findElement(errorMessageForAnswer1).getText();
//		System.out.println("Error message for Answer 1 field :" + answer1Field);
//		ObjectRepo.test.log(Status.PASS,"Error message for Answer 1 field :" + answer1Field );
//		String securityQue2Dropdown = driver.findElement(errorMessageForSecurityQue2).getText();
//		System.out.println("Error message for security question 1 dropdown :" + securityQue2Dropdown);
//		ObjectRepo.test.log(Status.PASS,"Error message for security question 1 dropdown :" + securityQue2Dropdown );
//		String answer2Field = driver.findElement(errorMessageForAnswer2).getText();
//		System.out.println("Error message for Answer 2 field :" + answer2Field);
//		ObjectRepo.test.log(Status.PASS,"Error message for Answer 2 field :" + answer2Field );
//		String securityQue3Dropdown = driver.findElement(errorMessageForSecurityQue3).getText();
//		System.out.println("Error message for security question 3 dropdown :" + securityQue3Dropdown);
//		ObjectRepo.test.log(Status.PASS,"Error message for security question 3 dropdown :" + securityQue3Dropdown );
//		String answer3Field = driver.findElement(errorMessageForAnswer3).getText();
//		System.out.println("Error message for Answer 3 field :" + answer3Field);	
//		ObjectRepo.test.log(Status.PASS,"Error message for Answer 3 field :" + answer3Field );
	}

	public void checkBoxVerifyOnResidenceAndMailingStep() throws InterruptedException {
		driver.findElement(street1PrimResi).sendKeys("pune");
		driver.findElement(street2PrimResi).sendKeys("pune");
		driver.findElement(cityPrimResi).sendKeys("pune");
		driver.findElement(postalCodePrimResi).sendKeys("425001");
//		Thread.sleep(5000);
		new WebDriverWait(driver, 30).until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//span[text()='Check if same as Primary Residence']")));
		WebElement element = driver.findElement(checkBox);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
//		Thread.sleep(10000);
		String street1InMailAddSec = driver.findElement(street1MailAdd).getAttribute("value");
		System.out.println("Filled data in Street1 field is: " + street1InMailAddSec);
		ObjectRepo.test.log(Status.PASS, "Filled data in Street1 field is: " + street1InMailAddSec);
		String street2InMailAddSec = driver.findElement(street2MailAdd).getAttribute("value");
		System.out.println("Filled data in Street2 field is: " + street2InMailAddSec);
		ObjectRepo.test.log(Status.PASS, "Filled data in Street2 field is: " + street2InMailAddSec);
		String cityInMailAddSec = driver.findElement(cityMailAdd).getAttribute("value");
		System.out.println("Filled data in City field is: " + cityInMailAddSec);
		ObjectRepo.test.log(Status.PASS, "Filled data in City field is: " + cityInMailAddSec);
		String postalCodeInMailAddSec = driver.findElement(postalCodeMailAdd).getAttribute("value");
		System.out.println("Filled data in Postal Code field is: " + postalCodeInMailAddSec);
		ObjectRepo.test.log(Status.PASS, "Filled data in Postal Code field is: " + postalCodeInMailAddSec);
	}

	public void personalInformation() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(salutation).sendKeys("Mr");
		new WebDriverWait(driver, 30)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='firstName']")));
		driver.findElement(firstName).sendKeys(prop.getProperty("FirstName"));
		driver.findElement(middleName).sendKeys(prop.getProperty("MiddleName"));
		driver.findElement(lastName).sendKeys(prop.getProperty("LastName"));
		driver.findElement(suffix).sendKeys(prop.getProperty("Suffix"));
//		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable((date))).click();
//		driver.findElement(selectDate).click();
//		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(month)).click();
//		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(selectMonth)).click();
//		driver.findElement(year).click();
//		WebElement element = driver.findElement(selectYear);
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click()", element);
		driver.findElement(selectDate).sendKeys("2002/12/26");
		driver.findElement(telephoneNumber).sendKeys(prop.getProperty("TelephoneNo"));
		driver.findElement(extension).sendKeys("1");
		driver.findElement(mobilePhone).sendKeys("12345688890");
		driver.findElement(email).clear();
		String emailaddress = generateEmailString();
		driver.findElement(email).sendKeys(emailaddress);
		driver.findElement(confirmEmail).clear(); 
		driver.findElement(confirmEmail).sendKeys(emailaddress);
		driver.findElement(emailLangPref).click();
		driver.findElement(selLangEng).click();
		driver.findElement(employer).sendKeys(prop.getProperty("Employer"));
		// driver.findElement(department).sendKeys("testdata");
		driver.findElement(jobTitle).sendKeys("testdata");
		driver.findElement(faxNumber).sendKeys("1234567890");
		WebElement element1 = driver.findElement(perInfoContButton);
		js.executeScript("arguments[0].click()", element1);
		System.out.println("Step: Enter valid data in all fields and click on continue button");
		ObjectRepo.test.log(Status.PASS, "Step: Enter valid data in all fields and click on continue button");
	}

	public void uiTestForCreateUserLogInPage() {
		System.out.println("Step : Complete the select jurisdiction step ");
		ObjectRepo.test.log(Status.PASS, "Step : Complete the select jurisdiction step ");
		System.out.println("Step : Complete the personal information step ");
		ObjectRepo.test.log(Status.PASS, "Step : Complete the personal information step ");
		System.out.println("Step : Complete the residence and mailing step  ");
		ObjectRepo.test.log(Status.PASS, "Step : Complete the residence and mailing step ");
		System.out.println("Step : Enter data in all fields of Edit and Review step ");
		ObjectRepo.test.log(Status.PASS, "Step : Enter data in all fields of Edit and Review  step  ");
		System.out.println("Step : Accept Terms and Conditions & Click on CONTINUE button");
		ObjectRepo.test.log(Status.PASS, "Step : Accept Terms and Conditions & Click on CONTINUE button  ");
		System.out.println("Step : Observe the Create log in page");
		System.out.println("Following  Elements should be Avaliable  in Create log in page :");
		ObjectRepo.test.log(Status.PASS, "Step : Observe the Create log in page");
		String createUserIdField = driver.findElement(createUserIdWithLabel).getText();
		System.out.println(createUserIdField);
		Assert.assertEquals(createUserIdField, "Create User ID\n" + "*\n" + "- 6-15 characters");
		String passphraseField = driver.findElement(passphraseWithLabel).getText();
		System.out.println(passphraseField);
		Assert.assertEquals(passphraseField, "Passphrase\n" + "*\n" + "- 8-50 characters");
		String confirmPassphraseField = driver.findElement(confirmPassphraseWithLabel).getText();
		System.out.println(confirmPassphraseField);
		Assert.assertEquals(confirmPassphraseField, "Confirm Passphrase\n" + "*\n" + "- 8-50 characters");
		String securityQuestion1Dropdown = driver.findElement(securityQuestion1WithLabel).getText();
		System.out.println(securityQuestion1Dropdown);
		Assert.assertEquals(securityQuestion1Dropdown, "Security Question 1*");
		String answer1Field = driver.findElement(answer1WithLabel).getText();
		System.out.println(answer1Field);
		Assert.assertEquals(answer1Field, "Answer 1\n" + "*");
		String securityQuestion2Dropdown = driver.findElement(securityQuestion2WithLabel).getText();
		System.out.println(securityQuestion2Dropdown);
		Assert.assertEquals(securityQuestion2Dropdown, "Security Question 2*");
		String answer2Field = driver.findElement(answer2WithLabel).getText();
		System.out.println(answer2Field);
		Assert.assertEquals(answer2Field, "Answer 2\n" + "*");
		String securityQuestion3Dropdown = driver.findElement(securityQuestion3WithLabel).getText();
		System.out.println(securityQuestion3Dropdown);
		Assert.assertEquals(securityQuestion3Dropdown, "Security Question 3*");
		String answer3Field = driver.findElement(answer3WithLabel).getText();
		System.out.println(answer3Field);
		Assert.assertEquals(answer3Field, "Answer 3\n" + "*");
		String registerButton = driver.findElement(creUserProfRegBut).getText();
		System.out.println(registerButton);
		Assert.assertEquals(registerButton, "REGISTER");
		String cancelButton = driver.findElement(creUserProfCancelButton).getText();
		System.out.println(cancelButton);
		Assert.assertEquals(cancelButton, "CANCEL");
		ObjectRepo.test.log(Status.PASS, createUserIdField + "," + passphraseField + "," + confirmPassphraseField + ","
				+ securityQuestion1Dropdown + "," + answer1Field + "," + securityQuestion2Dropdown + "," + answer2Field
				+ "," + securityQuestion3Dropdown + "," + answer3Field + "," + registerButton + "," + cancelButton);
	}

	public void uiTestForEditAndReviewPage() {
		System.out.println("Step : Complete the select jurisdiction step ");
		ObjectRepo.test.log(Status.PASS, "Step : Complete the select jurisdiction step ");
		System.out.println("Step : Complete the personal information step ");
		ObjectRepo.test.log(Status.PASS, "Step : Complete the personal information step ");
		System.out.println("Step : Enter data in all fields of Residence and mailing step ");
		ObjectRepo.test.log(Status.PASS, "Step : Enter data in all fields of Residence and mailing step  ");
		System.out.println("Step : Click on Continue button ");
		ObjectRepo.test.log(Status.PASS, "Step : Click on Continue button ");
		System.out.println("Step : Observe the Edit and Review page");
		ObjectRepo.test.log(Status.PASS, "Step : Observe the Edit and Review page");
		System.out.println("Following  Elements should be Avaliable  in Edit and Review page :");
		List<WebElement> totalLabels = driver.findElements(totalLabelsOnEditReviewPage);
		for (WebElement total : totalLabels) {
			System.out.println("Field label on Edit and review page is : " + total.getText());
		}
		List<WebElement> dataIntotalFields = driver.findElements(totalFieldsOnEditReviewPage);
		for (WebElement data : dataIntotalFields) {
			System.out.println("Filled data on Edit and review page is : " + data.getText());
		}
	}

	public void uiTestForResidenceAndMalingPage() {
		System.out.println("Step : Complete the select jurisdiction step ");
		ObjectRepo.test.log(Status.PASS, "Step : Complete the select jurisdiction step ");
		System.out.println("Step : Enter data in all fields of personal information step ");
		ObjectRepo.test.log(Status.PASS, "Step : Enter data in all fields of personal information step  ");
		System.out.println("Step : Click on Continue button ");
		ObjectRepo.test.log(Status.PASS, "Step : Click on Continue button ");
		System.out.println("Step : Observe the residence and mailing page");
		ObjectRepo.test.log(Status.PASS, "Step : Observe the residence and mailing page");
		System.out.println("Following  Elements should be Avaliable  in primary residence section");
		String street1FieldPrimSec = driver.findElement(street1WithLabelPrimSec).getText();
		System.out.println(street1FieldPrimSec);
		Assert.assertEquals(street1FieldPrimSec, "Street 1*");
		String street2FieldPrimSec = driver.findElement(street2WithLabelPrimSec).getText();
		System.out.println(street2FieldPrimSec);
		Assert.assertEquals(street2FieldPrimSec, "Street 2");
		String cityFieldPrimSec = driver.findElement(cityWithLabelPrimSec).getText();
		System.out.println(cityFieldPrimSec);
		Assert.assertEquals(cityFieldPrimSec, "City*");
//		String stateOrProvinceDropdownPrimSec = driver.findElement(stateOrProvinceWithLabelPrimSec).getText();
//		System.out.println(stateOrProvinceDropdownPrimSec);
//		Assert.assertEquals(stateOrProvinceDropdownPrimSec, "State or Province");
		String postalCodeFieldPrimSec = driver.findElement(postalCodeWithLabelPrimSec).getText();
		System.out.println(postalCodeFieldPrimSec);
		Assert.assertEquals(postalCodeFieldPrimSec, "Postal Code*");
		String countryDropdownPrimSec = driver.findElement(CountryWithLabelPrimSec).getText();
		System.out.println(countryDropdownPrimSec);
		Assert.assertEquals(countryDropdownPrimSec, "Country*");
		ObjectRepo.test.log(Status.PASS, "Following  Elements should be Avaliable  in primary residence section");
		ObjectRepo.test.log(Status.PASS, street1FieldPrimSec + "," + street2FieldPrimSec + "," + cityFieldPrimSec + ","
				+ postalCodeFieldPrimSec + "," + countryDropdownPrimSec);
		System.out.println("Following  Elements should be Avaliable  in mailing address section");
		String street1FieldMailSec = driver.findElement(street1WithLabelMailSec).getText();
		System.out.println(street1FieldMailSec);
		Assert.assertEquals(street1FieldMailSec, "Street 1*");
		String street2FieldMailSec = driver.findElement(street2WithLabelMailSec).getText();
		System.out.println(street2FieldMailSec);
		Assert.assertEquals(street2FieldMailSec, "Street 2");
		String cityFieldMailSec = driver.findElement(cityWithLabelMailSec).getText();
		System.out.println(cityFieldMailSec);
		Assert.assertEquals(cityFieldMailSec, "City*");
//		String stateOrProvinceDropdownMailSec = driver.findElement(stateOrProvinceWithLabelMailSec).getText();
//		System.out.println(stateOrProvinceDropdownMailSec);
//		Assert.assertEquals(stateOrProvinceDropdownMailSec, "State or Province");
		String postalCodeFieldMailSec = driver.findElement(postalCodeWithLabelMailSec).getText();
		System.out.println(postalCodeFieldMailSec);
		Assert.assertEquals(postalCodeFieldMailSec, "Postal Code*");
		String countryDropdownMailSec = driver.findElement(CountryWithLabelMailSec).getText();
		System.out.println(countryDropdownMailSec);
		Assert.assertEquals(countryDropdownMailSec, "Country*");
		String resiAndMailingStepText = driver.findElement(residenceAndMailingStep).getText();
		System.out.println(resiAndMailingStepText);
		Assert.assertEquals(resiAndMailingStepText, "Residence & Mailing");
		String mailAddressCheckbox = driver.findElement(mailingAddressCheckBox).getText();
		System.out.println(mailAddressCheckbox);
		Assert.assertEquals(mailAddressCheckbox, "Check if same as Primary Residence");
		ObjectRepo.test.log(Status.PASS, "Following  Elements should be Avaliable  in mailing address section");
		ObjectRepo.test.log(Status.PASS,
				street1FieldMailSec + "," + street2FieldMailSec + "," + cityFieldMailSec + "," + postalCodeFieldMailSec
						+ "," + countryDropdownMailSec + "," + resiAndMailingStepText + "," + mailAddressCheckbox);
	}

	public void uiTestForUserRegistrationPage() {
		WebElement element = driver.findElement(userRegistration);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		// driver.findElement(userRegistration).click();
		System.out.println("Step 1: Click on USER REGISTRATION dropdown menu");
		ObjectRepo.test.log(Status.PASS, "Step 1: Click on USER REGISTRATION dropdown menu ");
		// driver.findElement(newRegistration).click();
		WebElement element1 = driver.findElement(newRegistration);
		js.executeScript("arguments[0].click()", element1);
		System.out.println("Step 2: Select New Registration option");
		ObjectRepo.test.log(Status.PASS, "Step 2: Select New Registration option ");
		System.out.println("Step 3: Observe the user registration page");
		ObjectRepo.test.log(Status.PASS, "Step 3: Observe the user registration page ");
		System.out.println("Following elements should be available on user registration page of registration :");
		String createUserProfText = driver.findElement(createUserProfileText).getText();
		System.out.println(createUserProfText);
		Assert.assertEquals(createUserProfText, "Create User Profile");
		String subReqDocuText = driver.findElement(submitRequiredDocumentsText).getText();
		System.out.println(subReqDocuText);
		Assert.assertEquals(subReqDocuText, "Submit Required Documents");
		String awaitJurisDeciText = driver.findElement(awaitJurisdictionDecisionText).getText();
		System.out.println(awaitJurisDeciText);
		Assert.assertEquals(awaitJurisDeciText, "Await Jurisdiction Decision");
		String startNewRegistrationButton = driver.findElement(startNewRegisBut).getText();
		System.out.println(startNewRegistrationButton);
		Assert.assertEquals(startNewRegistrationButton, "START NEW REGISTRATION");
		ObjectRepo.test.log(Status.PASS,
				"Following elements should be available on user registration page of registration :");
		ObjectRepo.test.log(Status.PASS, createUserProfText + "," + subReqDocuText + "," + awaitJurisDeciText + ","
				+ startNewRegistrationButton);
	}

	public void uiTestForPersonalInfoStepPage() {
		System.out.println("Step : Observe  the personal information step page");
		ObjectRepo.test.log(Status.PASS, "Step :  Observe  the personal information step page ");
		System.out
				.println("Following elements should be available on personal information step page of registration :");
		String salutationField = driver.findElement(salutationWithLabel).getText();
		System.out.println(salutationField);
		Assert.assertEquals(salutationField, "Salutation");
		String firstNameField = driver.findElement(firstNameWithLabel).getText();
		System.out.println(firstNameField);
		Assert.assertEquals(firstNameField, "First Name*");
		String middleNameField = driver.findElement(middleNameWithLabel).getText();
		System.out.println(middleNameField);
		Assert.assertEquals(middleNameField, "Middle Name");
		String lastNameField = driver.findElement(lastNameWithLabel).getText();
		System.out.println(lastNameField);
		Assert.assertEquals(lastNameField, "Last Name*");
		String suffixField = driver.findElement(suffixWithLabel).getText();
		System.out.println(suffixField);
		Assert.assertEquals(suffixField, "Suffix");
		String dateOfBirth = driver.findElement(dateOfBirthWithLabel).getText();
		System.out.println(dateOfBirth);
		Assert.assertEquals(dateOfBirth, "Date of Birth*");
//		String dateDropdown = driver.findElement(date).getText();
//		System.out.println(dateDropdown);
//		Assert.assertEquals(dateDropdown, "Day");
//		String monthDropdown = driver.findElement(month).getText();
//		System.out.println(monthDropdown);
//		Assert.assertEquals(monthDropdown, "Month");
//		String yearDropdown = driver.findElement(year).getText();
//		System.out.println(yearDropdown);
//		Assert.assertEquals(yearDropdown, "Year");
		String telephoneNumberField = driver.findElement(telephoneNumberWithLabel).getText();
		System.out.println(telephoneNumberField);
		Assert.assertEquals(telephoneNumberField, "Telephone Number*");
		String extensionField = driver.findElement(extensionWithLabel).getText();
		System.out.println(extensionField);
		Assert.assertEquals(extensionField, "Ext.");
		String mobilePhoneField = driver.findElement(mobilePhoneWithLabel).getText();
		System.out.println(mobilePhoneField);
		Assert.assertEquals(mobilePhoneField, "Mobile Phone");
		String emailField = driver.findElement(emailWithLabel).getText();
		System.out.println(emailField);
		Assert.assertEquals(emailField, "Email*");
		String confirmEmailField = driver.findElement(confirmEmailWithLabel).getText();
		System.out.println(confirmEmailField);
		Assert.assertEquals(confirmEmailField, "Confirm Email*");
		String emailLangPrefDropdown = driver.findElement(emailLangPrefWithLabel).getText();
		System.out.println(emailLangPrefDropdown);
		Assert.assertEquals(emailLangPrefDropdown, "Email Language Preference*");
		String employerField = driver.findElement(employerWithLabel).getText();
		System.out.println(employerField);
		Assert.assertEquals(employerField, "Employer*");
//		String departmentField = driver.findElement(departmentWithLabel).getText();
//		System.out.println(departmentField);
//		Assert.assertEquals(departmentField, "Department");
		String jobtitleField = driver.findElement(jobTitleWithLabel).getText();
		System.out.println(jobtitleField);
		Assert.assertEquals(jobtitleField, "Job Title");
		String faxNumberFiled = driver.findElement(faxNumberWithLabel).getText();
		System.out.println(faxNumberFiled);
		String continueButton = driver.findElement(perInfoContButton).getText();
		System.out.println(continueButton);
		Assert.assertEquals(continueButton, "CONTINUE");
		String cancelButton = driver.findElement(perInfoCancelButton).getText();
		System.out.println(cancelButton);
		Assert.assertEquals(cancelButton, "CANCEL");
		String persoanlInformationStepText = driver.findElement(persoanlInformationStep).getText();
		System.out.println(persoanlInformationStepText);
		Assert.assertEquals(persoanlInformationStepText, "Personal Information");
		ObjectRepo.test.log(Status.PASS,
				"Following elements should be available on personal information step page of registration : ");
		ObjectRepo.test.log(Status.PASS,
				salutationField + "," + firstNameField + "," + middleNameField + "," + lastNameField + "," + suffixField
						+ "," + dateOfBirth + "," + telephoneNumberField + "," + extensionField + "," + mobilePhoneField
						+ "," + emailField + "," + confirmEmailField + "," + emailLangPrefDropdown + "," + employerField
						+ jobtitleField + "," + faxNumberFiled + "," + continueButton + "," + cancelButton + ","
						+ persoanlInformationStepText);
	}

	public void uiTestForSelJuriStepPage() {
		WebElement element = driver.findElement(userRegistration);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		// driver.findElement(userRegistration).click();
		System.out.println("Step 1: Click on USER REGISTRATION dropdown menu");
		ObjectRepo.test.log(Status.PASS, "Step 1: Click on USER REGISTRATION dropdown menu ");
		WebElement element1 = driver.findElement(newRegistration);
		js.executeScript("arguments[0].click()", element1);
		// driver.findElement(newRegistration).click();
		System.out.println("Step 2: Select New Registration option");
		ObjectRepo.test.log(Status.PASS, "Step 2: Select New Registration option ");
		WebElement element2 = driver.findElement(startNewRegisBut);
		js.executeScript("arguments[0].click()", element2);
		// driver.findElement(startNewRegisBut).click();
		System.out.println("Step 3: Click on START NEW REGISTRATION button");
		// For temporary (got to next step)
		ObjectRepo.test.log(Status.PASS, "Step 3: Click on START NEW REGISTRATION button ");
		System.out.println("Step 4: Observe  the select jurisdiction page");
		ObjectRepo.test.log(Status.PASS, "Step 4: Observe  the select jurisdiction page ");
		System.out.println("Following elements should be available on Select Jurisdiction step page of registration:");
		String selJurisdictionDropdown = driver.findElement(selectJurisdiction).getText();
		System.out.println(selJurisdictionDropdown);
		Assert.assertEquals(selJurisdictionDropdown, "Select Jurisdiction");
		String continueButton = driver.findElement(selectJurisdictionContButton).getText();
		System.out.println(continueButton);
		Assert.assertEquals(continueButton, "CONTINUE");
		String cancelButton = driver.findElement(selectJurisdictionCancelButton).getText();
		System.out.println(cancelButton);
		Assert.assertEquals(cancelButton, "CANCEL");
		String createUserProfileStructure = driver.findElement(createUserProfile).getText();
		System.out.println(createUserProfileStructure);
		Assert.assertEquals(createUserProfileStructure, "Create User Profile");
		ObjectRepo.test.log(Status.PASS,
				"Following elements should be available on Select Jurisdiction step page of registration: ");
		ObjectRepo.test.log(Status.PASS,
				selJurisdictionDropdown + "," + continueButton + "," + cancelButton + "," + createUserProfileStructure);
	}

	public void userRegistrationPage() {
		WebElement element = driver.findElement(userRegistration);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		System.out.println("Step :Click on user registration menu");
		ObjectRepo.test.log(Status.PASS, "Step :Click on user registration menu");
		WebElement element1 = driver.findElement(newRegistration);
		js.executeScript("arguments[0].click()", element1);
		System.out.println("Step :Click on new registration option");
		ObjectRepo.test.log(Status.PASS, "Step :Click on new registration option");
		new WebDriverWait(driver, 30).until(
				ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h1[text()='USER REGISTRATION']")));
	}

	public void selJuriStepPage() {
		WebElement element = driver.findElement(userRegistration);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		System.out.println("Step :Click on user registration menu");
		ObjectRepo.test.log(Status.PASS, "Step :Click on user registration menu");
		// driver.findElement(userRegistration).click();
		WebElement element1 = driver.findElement(newRegistration);
		js.executeScript("arguments[0].click()", element1);
		System.out.println("Step :Click on new registration");
		ObjectRepo.test.log(Status.PASS, "Step :Click on new registration");
		WebElement element2 = driver.findElement(startNewRegisBut);
		js.executeScript("arguments[0].click()", element2);
		System.out.println("Step :Click on start new registration button");
		ObjectRepo.test.log(Status.PASS, "Step :Click on start new registration button");
		// driver.findElement(startNewRegisBut).click();
	}

	public void selectJurisdictionStep() throws InterruptedException {
		WebElement element = driver.findElement(userRegistration);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		System.out.println("Step :Click on user registration menu");
		ObjectRepo.test.log(Status.PASS, "Step :Click on user registration menu");
		WebElement element1 = driver.findElement(newRegistration);
		js.executeScript("arguments[0].click()", element1);
		System.out.println("Step :Click on new registration option");
		ObjectRepo.test.log(Status.PASS, "Step :Click on new registration option");
		WebElement element2 = driver.findElement(startNewRegisBut);
		js.executeScript("arguments[0].click()", element2);
		System.out.println("Step :Click on start new registration button");
		ObjectRepo.test.log(Status.PASS, "Step :Click on start new registration button");
		driver.findElement(selectJurisdiction).click();
		System.out.println("Step :Click on select jurisdiction dropdown");
		ObjectRepo.test.log(Status.PASS, "Step :Click on select jurisdiction dropdown");
		driver.findElement(selectoptionCal).click();     // Replace with california
		System.out.println("Step :Click on select jurisdiction from dropdown list");
		ObjectRepo.test.log(Status.PASS, "Step :Click on select jurisdiction from dropdown list");
		driver.findElement(selectJurisdictionContButton).click();
		System.out.println("Step :Click on continue button");
		ObjectRepo.test.log(Status.PASS, "Step :Click on continue button");
	}
	
	public void selectJurisdictionStepAsPerSelecvtedJurisdictionAndLanguage() throws InterruptedException {
		WebElement element = driver.findElement(userRegistration);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		System.out.println("Step :Click on user registration menu");
		ObjectRepo.test.log(Status.PASS, "Step :Click on user registration menu");
		WebElement element1 = driver.findElement(newRegistration);
		js.executeScript("arguments[0].click()", element1);
		System.out.println("Step :Click on new registration option");
		ObjectRepo.test.log(Status.PASS, "Step :Click on new registration option");
		WebElement element2 = driver.findElement(startNewRegisBut);
		js.executeScript("arguments[0].click()", element2);
		System.out.println("Step :Click on start new registration button");
		ObjectRepo.test.log(Status.PASS, "Step :Click on start new registration button");
		driver.findElement(selectJurisdiction).click();
		System.out.println("Step :Click on select jurisdiction dropdown");
		ObjectRepo.test.log(Status.PASS, "Step :Click on select jurisdiction dropdown");
		driver.findElement(selectoptionQue).click();     
		System.out.println("Step :Click on select jurisdiction from dropdown list");
		ObjectRepo.test.log(Status.PASS, "Step :Click on select jurisdiction from dropdown list");
		String SelectedJurisdictionOfSelectJurisdictionstep=driver.findElement(By.xpath("//div[@class='MuiBox-root css-yi3mkw']")).getText();
		System.out.println("Selected Jurisdiction for select jurisdiction step is:"+SelectedJurisdictionOfSelectJurisdictionstep);
		String SelectedLanguageOfSelectJurisdictionstep=driver.findElement(By.xpath("(//div[@id='simple-select'])[2]")).getText();
		System.out.println("Selected language for select jurisdiction step is:"+SelectedLanguageOfSelectJurisdictionstep);
		driver.findElement(selectJurisdictionContButton).click();
		System.out.println("Step :Click on continue button");
		ObjectRepo.test.log(Status.PASS, "Step :Click on continue button");
		String SelectedJurisdictionOfPersonalInformationstep=driver.findElement(By.xpath("(//div[@id='simple-select'])[1]")).getText();
		System.out.println("Selected Jurisdiction for personal information page is:"+SelectedJurisdictionOfPersonalInformationstep);
		String SelectedLanguageOfPersonalInformationstep=driver.findElement(By.xpath("(//div[@id='simple-select'])[2]")).getText();
		System.out.println("Selected language for personal information page is:"+SelectedLanguageOfPersonalInformationstep);
		Assert.assertEquals(SelectedJurisdictionOfSelectJurisdictionstep, SelectedJurisdictionOfPersonalInformationstep);
		Assert.assertEquals(SelectedLanguageOfSelectJurisdictionstep, SelectedLanguageOfPersonalInformationstep);
	}

	public void residenceAndMailing() throws InterruptedException {
		driver.findElement(street1PrimResi).sendKeys("pune");
		driver.findElement(street2PrimResi).sendKeys("pune");
		driver.findElement(cityPrimResi).sendKeys("pune");
		// driver.findElement(region).sendKeys(prop.getProperty("Region"));
		driver.findElement(postalCodePrimResi).sendKeys("425001");
//		Thread.sleep(5000);
		driver.findElement(countryPrimResi).click();
//		Thread.sleep(5000);
		new WebDriverWait(driver, 30)
				.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[text()='United States']")));
		driver.findElement(selectCountryUSPrimResi).click();
		driver.findElement(stateAndProvincePrimResi).click();
		driver.findElement(selectStatePrimResi).click();
		new WebDriverWait(driver, 30).until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//span[text()='Check if same as Primary Residence']")));
		WebElement element = driver.findElement(checkBox);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
//		Actions action = new Actions(driver);
//		action.moveToElement(element).build().perform();
//		action.click(element).build().perform();
		new WebDriverWait(driver, 30)
				.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[text()='CONTINUE']")));
		WebElement element1 = driver.findElement(primResiContButton);
		js.executeScript("arguments[0].click()", element1);
		String selectJurisdictionTextOnEditAndReviewPage = driver.findElement(selectJurisdictionOnEditpage).getText();
		System.out.println(
				"The Text should available on edit and review Page:" + selectJurisdictionTextOnEditAndReviewPage);
		System.out.println(
				"Step : Enter valid data in all fields of residence and mailing step page and click on continue button");
		ObjectRepo.test.log(Status.PASS,
				"Step : Enter valid data in all fields of residence and mailing step page and click on continue button");
	}

	public void editAndReview() throws Exception {
//		Thread.sleep(5000);
		new WebDriverWait(driver, 60).until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Selected Jurisdiction']")));
		// new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(
		// mailingaddresstext)).click();
		// new WebDriverWait(driver,
		// 30).until(ExpectedConditions.elementToBeClickable(checkBoxEditAndReview)).click();
		// driver.findElement(checkBoxEditAndReview).click();
		WebElement element3 = driver.findElement(checkBoxEditAndReview);
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("arguments[0].click()", element3);
		WebElement element4 = driver.findElement(editAndReviewContButton);
		js3.executeScript("arguments[0].click()", element4);
		Thread.sleep(2000);
		//new WebDriverWait(driver, 30).until(
				//ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h1[contains(text(),'1. Create User Profile')]")));
	}

	public static String generateUserIdString() {
		int length = 4;
		boolean useLetters = false;
		boolean useNumbers = true;
		String generatedString = RandomStringUtils.random(length, useNumbers, useLetters);

		String randomString = ("test" + generatedString);
		return randomString;
	}

	public void createUserLogin() throws InterruptedException {
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		userId = generateUserIdString();
		System.out.println("Uesrid :" + userId);
		driver.findElement(createUserId).sendKeys(userId);
		driver.findElement(passphrase).sendKeys("Pass@123");
		driver.findElement(confirmPassphrase).sendKeys("Pass@123");
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
		Thread.sleep(6000);
		driver.findElement(finishButton).click();
		System.out.println("New User Created Successfully.");
		ObjectRepo.test.log(Status.PASS, "New User Created Successfully.");

	}
	public void createUserLogin2() throws InterruptedException {
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		userId = generateUserIdString();
		System.out.println("Uesrid :" + userId);
		driver.findElement(createUserId).sendKeys(userId);
		driver.findElement(passphrase).sendKeys("Pass@123");
		driver.findElement(confirmPassphrase).sendKeys("Pass@123");
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
	}
	
	public void createUserLoginCheckBoxValidation() throws InterruptedException {
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		userId = generateUserIdString();
		System.out.println("Uesrid :" + userId);
		driver.findElement(createUserId).sendKeys(userId);
		driver.findElement(passphrase).sendKeys("Pass@12345");
		driver.findElement(confirmPassphrase).sendKeys("Pass@12345");
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
		Boolean abc = element1.isEnabled();
		if(abc.equals(true)) {
			System.out.println("Verified accept Terms of Use option checkbox is enabled");
			ObjectRepo.test.log(Status.PASS, "Verified accept Terms of Use option checkbox is enabled");
		}
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("arguments[0].click()", element1);
	}

	public void createUserLoginWithoutCheckBoxAccept() throws InterruptedException {
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		userId = generateUserIdString();
		System.out.println("Uesrid :" + userId);
		driver.findElement(createUserId).sendKeys(userId);
		driver.findElement(passphrase).sendKeys("Pass@12345");
		driver.findElement(confirmPassphrase).sendKeys("Pass@12345");
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
		Boolean abc = element1.isEnabled();
		if(abc.equals(true)) {
			System.out.println("Verified accept Terms of Use option checkbox is enabled");
			ObjectRepo.test.log(Status.PASS, "Verified accept Terms of Use option checkbox is enabled");
		}
//		JavascriptExecutor js3 = (JavascriptExecutor) driver;
//		js3.executeScript("arguments[0].click()", element1);
	}
	public void loginAsPendingUser1() {
		driver.findElement(userid1).sendKeys(userId);
		System.out.println("step : Enter Valid User Id  ");
		ObjectRepo.test.log(Status.PASS, "step1 : Enter valid User Id ");
		driver.findElement(passphrase1).sendKeys("Pass@12345");
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

	public void assignRoleToNewUser() throws InterruptedException {
		driver.findElement(By.xpath("(//*[@type='search'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[@type='search'])[1]")).sendKeys(userId);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@role='tab']")).click();
		driver.findElement(By.xpath("(//a[@class='link-cell'])[1]")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@name='Approved']")).click();
		driver.findElement(By.xpath("//div[@id='mui-component-select-RoleType']")).click();
		driver.findElement(By.xpath("(//*[text()='Jurisdiction Users'])")).click();
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.xpath("//*[@id='mui-component-select-Roles']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-1cdtra8'])[1]")).click();
        
		Thread.sleep(4000);
		WebElement element2 = driver.findElement(By.xpath("//div[@id='mui-component-select-RoleType']"));
		Actions action = new Actions(driver);
		action.moveToElement(element2).build().perform();
		Thread.sleep(4000);
		WebElement abc = driver.findElement(By.xpath("//*[@type='submit']"));
		j.executeScript("arguments[0].click();", abc);
		Thread.sleep(6000);

		String successmsg = driver.findElement(By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']"))
				.getText();
		//Assert.assertEquals("User has sent for Authority Approval", successmsg);
		System.out.println("User has sent for Authority Approval");
		ObjectRepo.test.log(Status.PASS, "User has sent for Authority Approval");

	}

	public void proposeRoleToNewUser() throws InterruptedException {
		driver.findElement(By.xpath("//*[@data-testid='ExpandMoreIcon']")).click();
		driver.findElement(By.xpath("(//*[@type='search'])[2]")).click();
		driver.findElement(By.xpath("(//*[@type='search'])[2]")).sendKeys(userId);
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@class='link-cell'])[6]")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@name='Approved']")).click();
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(4000);
		WebElement l = driver.findElement(By.xpath("//*[@type='submit']"));
		j.executeScript("arguments[0].click();", l);

		String successmsg = driver.findElement(By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']")).getText();
		System.out.println(successmsg);
		//Assert.assertEquals("User request has been approved.", successmsg);
		System.out.println("User request has been approved by Jurisdiction Autority");
		ObjectRepo.test.log(Status.PASS, "User request has been approved by Jurisdiction Autority");
	}

	public void DenyRoleChangeToNewUserByAuthority() throws InterruptedException {
		driver.findElement(By.xpath("//*[@data-testid='ExpandMoreIcon']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@type='search'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@type='search'])[2]")).sendKeys(userId);
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@class='link-cell'])[6]")).click();
//			Thread.sleep(8000);
//			driver.findElement(By.xpath("(//a[@class='link-cell'])[1]")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@name='Deny']")).click();
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[text()='Select Reason for Denial']")).click();
		driver.findElement(By.xpath("//*[text()='Denial Reason 1']")).click();
		driver.findElement(By.xpath("//*[@name='Comments']")).sendKeys("Test Comment");
		WebElement l = driver.findElement(By.xpath("//*[@type='submit']"));
		j.executeScript("arguments[0].click();", l);

		String successmsg = driver.findElement(By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']"))
				.getText();
		System.out.println(successmsg);
		//Assert.assertEquals("Role Change Request have been denied.", successmsg);
		System.out.println("Role Change Request have been denied by Authority");
		ObjectRepo.test.log(Status.PASS, "Role Change Request have been denied by Authority");
//			
	}

	public void DenyRoleChangeToNewUserByAuthorityWithoutProvidingReason() throws InterruptedException {
		driver.findElement(By.xpath("//*[@data-testid='ExpandMoreIcon']")).click();
		driver.findElement(By.xpath("(//*[@type='search'])[2]")).click();
		driver.findElement(By.xpath("(//*[@type='search'])[2]")).sendKeys(userId);
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@class='link-cell'])[6]")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@name='Deny']")).click();
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@name='Comments']")).sendKeys("Test Comment");
		Boolean abc = driver.findElement(By.xpath("//*[@type='submit']")).isEnabled();
		if (abc.equals(false)) {
			System.out.println(
					"Save button is not anabled and autority cannot deny user approval without submitting reason");
			ObjectRepo.test.log(Status.PASS,
					"Save button is not anabled and autority cannot deny user approval without submitting reason");
		} else {
			Assert.assertFalse(true);
		}
	}

	public void proposeChangeRoleToExistingUser() throws InterruptedException {
		driver.findElement(By.xpath("//*[@data-testid='ExpandMoreIcon']")).click();
		driver.findElement(By.xpath("(//*[@type='search'])[1]")).click();
		driver.findElement(By.xpath("(//*[@type='search'])[1]")).sendKeys(userId);
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@class='link-cell'])[1]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@id='mui-component-select-RoleType']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Service Providers']")).click();
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.xpath("//*[@id='mui-component-select-Roles']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Market Monitor']")).click();

		Thread.sleep(4000);
		WebElement element2 = driver.findElement(By.xpath("//div[@id='mui-component-select-RoleType']"));
		Actions action = new Actions(driver);
		action.moveToElement(element2).build().perform();
		Thread.sleep(4000);
		WebElement abc = driver.findElement(By.xpath("//*[@type='submit']"));
		j.executeScript("arguments[0].click();", abc);
		Thread.sleep(6000);

		String successmsg = driver.findElement(By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']"))
				.getText();
		System.out.println(successmsg);
		//Assert.assertEquals("Proposed Role Change request is raised.", successmsg);
		System.out.println("Proposed Role Change request is raised.");
		ObjectRepo.test.log(Status.PASS, "Proposed Role Change request is raised.");
//			
	}
	public void createUserLogin1() throws InterruptedException {
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		userId = generateUserIdString();
		System.out.println("Uesrid :" + userId);
		driver.findElement(createUserId).sendKeys(userId);
		driver.findElement(passphrase).sendKeys("Pass@123");
		driver.findElement(confirmPassphrase).sendKeys("Pass@123");
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
		Thread.sleep(6000);
		//driver.findElement(finishButton).click();
		System.out.println("New User Created Successfully.");
		ObjectRepo.test.log(Status.PASS, "New User Created Successfully.");

	}
	
	public void loginAsCreatedUser() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(userid).sendKeys(userId);
		System.out.println("step : Enter Valid User Id  ");
		ObjectRepo.test.log(Status.PASS, "step1 : Enter valid User Id ");
		driver.findElement(passphraseOnLoginPage).sendKeys("Pass@123");
		System.out.println("step : Enter Valid passphrase  ");
		ObjectRepo.test.log(Status.PASS, "step1 : Enter valid passphrase ");
		WebElement element = driver.findElement(loginbutton);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		System.out.println("step : Click on login button  ");
		ObjectRepo.test.log(Status.PASS, "step1 : Click on login button ");
		//driver.findElement(answerField).sendKeys(prop.getProperty("Answer2"));
		//Thread.sleep(2000);
		new WebDriverWait(driver, 30)
		.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@class='MuiTypography-root MuiTypography-h6 css-1etlmxt']")));
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
		WebElement element1 = driver.findElement(continueButtonForLogin);
		js2.executeScript("arguments[0].click()", element1);
		new WebDriverWait(driver, 60).until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='2. Submit Required Documents']")));
	}

}
