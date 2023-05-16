package pageObjects;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.Status;

import resources.ObjectRepo;
import resources.base;

public class NewClass extends base {

	
	
	private By errorMessageUserIdField = By.xpath("//p[@id='createUserID-helper-text']");
	private By errorMessageforExistingUserIdUse = By.xpath("//p[@id='createUserID-helper-text']");
	private By errorMessageForconfirmPassphrase = By.xpath("//p[text()='Passphrase and confirm passphrase must be same']");
	private By errorMessagePassphraseField = By.xpath("//p[@id='passphrase-helper-text']");
	private By createUserProfileText = By.xpath("//h1[text()='1. Create User Profile']");
	private By selectSecurityQue1 = By.xpath("//div[@id='mui-component-select-securityQuestion1']");
	private By errorMessageWhenPassphrsaeFieldEmpty = By.xpath("//p[@id='passphrase-helper-text']");
	private By errorMessageWhenConfirmPassphrsaeFieldEmpty = By.xpath("//p[@id='confirmPassphrase-helper-text']");
	private By errorMessageUserIDFieldWhenEmpty = By.xpath("//*[contains(text(),'Create User ID  is required')]");
	
	private By invalidErrorMessageForEmail = By.xpath("//p[@id='email-helper-text']");
	private By invalidErrorMessageForConfirmEmail = By.xpath("//p[@id='confirmEmail-helper-text']");
	private By errorMessageForEmailAvailable = By.xpath("//p[@id='email-helper-text']");
	
	private By selectJurisdiction = By.xpath("//div[@id='mui-component-select-jurisdiction']");
	private By selectoption = By.xpath("//span[text()='California']");
	private By selectJurisdictionContButton = By.xpath("//button[text()='CONTINUE']");
	
	private By searchField = By.xpath("//input[@id=':r9t:']");
	private By searchRecord = By.xpath("(//div[@class='link-cell pointer-cursor MuiDataGrid-cell MuiDataGrid-cell--textCenter'])[1]");
	
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
	
	private By errorMessageForFirstNameField = By.xpath("//p[@id='firstName-helper-text']");
	private By errorMessageForLastNameField = By.xpath("//p[@id='lastName-helper-text']");
	private By errorMessageForTelephoneField = By.xpath("//p[@id='telephoneNumber-helper-text']");
	private By errorMessageForEmailField = By.xpath("//p[@id='email-helper-text']");
	private By errorMessageForConfirmEmailField = By.xpath("//p[@id='confirmEmail-helper-text']");
	private By errorMessageForEmployerField = By.xpath("//p[@id='employer-helper-text']");
	
	private By street1PrimResi = By.xpath("//input[@name='primaryResidence.street1']");
	private By cityPrimResi = By.xpath("//input[@name='primaryResidence.city']");
	private By postalCodePrimResi = By.xpath("//input[@name='primaryResidence.postalCode']");
	private By countryPrimResi = By.xpath("(//input[@id='country-select-demo'])[2]");
	private By selectCountryPrimResi = By.xpath("(//*[text()='Select Country'])[1]");
	private By street1MailAdd = By.xpath("//input[@data-testid='mailingAddress.street1']");
	private By cityMailAdd = By.xpath("//input[@id='mailingAddress.city']");
	private By postalCodeMailAdd = By.xpath("//input[@id='mailingAddress.postalCode']");
	
	private By errorMessageForStreet1FieldOnPrimSec = By.xpath("//p[@id='primaryResidence.street1-helper-text']");
	private By errorMessageForCityFieldOnPrimSec = By.xpath("//p[@id='primaryResidence.city-helper-text']");
	private By errorMessageForPostalCodeFieldOnPrimSec = By.xpath("//*[@id='primaryResidence.postalCode-helper-text']");
	private By errorMessageForStreet1FieldOnResiSec = By.xpath("//p[@id='mailingAddress.street1-helper-text']");
	private By errorMessageForCityFieldResiSec = By.xpath("//p[@id='mailingAddress.city-helper-text']");
	private By errorMessageForPostalCodeFieldOnResiSec = By.xpath("//*[@id='mailingAddress.postalCode-helper-text']");
	
	private By createUserId = By.xpath("//input[@name='createUserID']");
	private By passphrase = By.xpath("//input[@name='passphrase']");
	private By confirmPassphrase = By.xpath("//input[@id='confirmPassphrase']");
	private By answer1 = By.xpath("//input[@name='answer1']");
	private By answer2 = By.xpath("//input[@name='answer2']");
	private By answer3 = By.xpath("//input[@name='answer3']");
	
	private By errorMessageForUserID = By.xpath("//p[@id='createUserID-helper-text']");
	private By errorMessageForPassphrase = By.xpath("//p[@id='passphrase-helper-text']");
	private By errorMessageForConfirmPassphrase = By.xpath("//p[@id='confirmPassphrase-helper-text']");
	private By errorMessageForAnswer1 = By.xpath("//p[@id='answer1-helper-text']");
	private By errorMessageForAnswer2 = By.xpath("//p[@id='answer2-helper-text']");
	private By errorMessageForAnswer3 = By.xpath("//p[@id='answer3-helper-text']");
	
	private By editButtonOnPersonalInfo = By.xpath("(//button[text()='edit'])[1]");
	private By firstNameOnEditAndReview = By.xpath("//*[@id='firstName']");
	private By lastNameOnEditAndReview = By.xpath("//input[@id='lastName']");
	private By telephoneOnEditAndReview = By.xpath("//input[@id='telephoneNumber']");
	private By emailOnEditAndReview = By.xpath("//input[@id='email']");
	private By confirmEmailOnEditAndReview = By.xpath("//input[@id='confirmEmail']");
	private By employerOnEditAndReview = By.xpath("//input[@id='employer']");
	private By saveButtonPersInfoEditAndReview = By.xpath("//input[@id='employer']");
	
	private By editButtonOnPrimResidence = By.xpath("(//button[text()='edit'])[1]");
	private By street1PrimResiEditAndReview = By.xpath("//input[@id='primaryResidence.street1']");
	private By cityPrimResiEditAndReview = By.xpath("//input[@id='primaryResidence.city']");
	private By postalCode1PrimResiEditAndReview = By.xpath("//input[@id='primaryResidence.postalCode']");
	private By saveButtonPrimResiEditAndReview = By.xpath("//button[text()='SAVE']");
	
	private By errorMessageForFirstName = By.xpath("//p[text()='First Name  is required']");
	private By errorMessageForLastName = By.xpath("//p[text()='Last Name  is required']");
	private By errorMessageForTelephone = By.xpath("//p[text()='Telephone Number  is required']");
	private By errorMessageForEmail = By.xpath("//p[text()='Email  is required']");
	private By errorMessageForConfirmEmail = By.xpath("//p[@id='confirmEmail-helper-text']");
	private By errorMessageForEmployer = By.xpath("//*[text()='Employer  is required']");
	
	private By errorMessageForStreet1PrimResi = By.xpath("(//p[text()='Street 1  is required'])[1]");
	private By errorMessageForCityPrimResi = By.xpath("(//p[text()='City  is required'])[1]");
	private By errorMessageForPostalCodePrimResi = By.xpath("(//p[text()='Postal Code  is required'])[1]");
	private By errorMessageForCountryPrimResi = By.xpath("(//*[text()='Country  is required'])[1]");
	
	private By errorMessageForStreet1MailAdd = By.xpath("(//p[text()='Street 1  is required'])[2]");
	private By errorMessageForCityMailAdd = By.xpath("(//p[text()='City  is required'])[2]");
	private By errorMessageForPostalCodeMailAdd = By.xpath("(//p[text()='Postal Code  is required'])[2]");
	
	public NewClass() {
		PageFactory.initElements(driver, this);
		
	}
	
	public void editAndReviewStepMandetoryFieldsWithEmptyData() throws InterruptedException {
		WebElement element2=driver.findElement(editButtonOnPersonalInfo);
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		js2.executeScript("arguments[0].click()", element2);
		for(int i=1;i<=6;i++) {
			driver.findElement(firstNameOnEditAndReview).sendKeys(Keys.BACK_SPACE);
		}
		for(int i=1;i<=4;i++) {
			driver.findElement(lastNameOnEditAndReview).sendKeys(Keys.BACK_SPACE);
		}
		for(int i=1;i<=10;i++) {
			driver.findElement(telephoneOnEditAndReview).sendKeys(Keys.BACK_SPACE);
		}
		for(int i=1;i<=21;i++) {
			driver.findElement(emailOnEditAndReview).sendKeys(Keys.BACK_SPACE);
		}
		for(int i=1;i<=21;i++) {
			driver.findElement(confirmEmailOnEditAndReview).sendKeys(Keys.BACK_SPACE);
		}
		for(int i=1;i<=8;i++) {
			driver.findElement(employerOnEditAndReview).sendKeys(Keys.BACK_SPACE);
		}
		String errorMessFirstnameField = driver.findElement(errorMessageForFirstName).getText();
		System.out.println("Error message for first name field :" + errorMessFirstnameField);
		ObjectRepo.test.log(Status.PASS, "Error message for first name field :" + errorMessFirstnameField);
		String errorMessLastnameField = driver.findElement(errorMessageForLastName).getText();
		System.out.println("Error message for last name field :" + errorMessLastnameField);
		ObjectRepo.test.log(Status.PASS, "Error message for last name field :" + errorMessLastnameField);
		String errorMessTelephoneField = driver.findElement(errorMessageForTelephone).getText();
		System.out.println("Error message for Telephone field :" + errorMessTelephoneField);
		ObjectRepo.test.log(Status.PASS, "Error message for Telephone field :" + errorMessTelephoneField);
		String errorMessEmailField = driver.findElement(errorMessageForEmail).getText();
		System.out.println("Error message for Email field :" + errorMessEmailField);
		ObjectRepo.test.log(Status.PASS, "Error message for Email field :" + errorMessEmailField);
		String errorMessConfirmEmailField = driver.findElement(errorMessageForConfirmEmail).getText();
		System.out.println("Error message for confirm email field :" + errorMessConfirmEmailField);
		ObjectRepo.test.log(Status.PASS, "Error message for confirm email field :" + errorMessConfirmEmailField);
		String errorMessEmployerField = driver.findElement(errorMessageForEmployer).getText();
		System.out.println("Error message for employer field :" + errorMessEmployerField);
		ObjectRepo.test.log(Status.PASS, "Error message for employer field :" + errorMessEmployerField);
		WebElement element3=driver.findElement(editButtonOnPrimResidence);
		js2.executeScript("arguments[0].click()", element3);
		for(int i=1;i<=12;i++) {
			driver.findElement(street1PrimResiEditAndReview).sendKeys(Keys.BACK_SPACE);
		}
		for(int i=1;i<=4;i++) {
			driver.findElement(cityPrimResiEditAndReview).sendKeys(Keys.BACK_SPACE);
		}
		for(int i=1;i<=6;i++) {
			driver.findElement(postalCode1PrimResiEditAndReview).sendKeys(Keys.BACK_SPACE);
		}
		//driver.findElement(countryPrimResi).click();
		//driver.findElement(selectCountryPrimResi).click();
		WebElement element4=driver.findElement(editButtonOnPrimResidence);
	    js2.executeScript("arguments[0].click()", element4);
//		WebElement element5=driver.findElement(street1MailAdd);
//		js2.executeScript("arguments[0].click()", element5);
		//driver.findElement(street1MailAdd).click();
		String errorMessStreet1PrimResiField = driver.findElement(errorMessageForStreet1PrimResi).getText();
		System.out.println(
				"Error message for Street1 field of Primary Residence section :" + errorMessStreet1PrimResiField);
		ObjectRepo.test.log(Status.PASS, "Error message for Street1 field of Primary Residence section :" + errorMessStreet1PrimResiField);
		String errorMessCityPrimResiField = driver.findElement(errorMessageForCityPrimResi).getText();
		System.out.println("Error message for City field of Primary Residence section :" + errorMessCityPrimResiField);
		ObjectRepo.test.log(Status.PASS, "Error message for City field of Primary Residence section :" + errorMessCityPrimResiField );
		String errorMessPostalCodePrimResiField = driver.findElement(errorMessageForPostalCodePrimResi).getText();
		System.out.println("Error message for postal code of Primary Residence section :" + errorMessPostalCodePrimResiField);
		ObjectRepo.test.log(Status.PASS, "Error message for postal code field of Primary Residence section :" + errorMessPostalCodePrimResiField );
//		String errorMessCountryPrimField = driver.findElement(errorMessageForCountryPrimResi).getText();
//		System.out
//		.println("Error message for country field of Primary Residence section :" + errorMessCountryPrimField);
//		ObjectRepo.test.log(Status.PASS, "Error message for Country field of Primary Residence section :" + errorMessCountryPrimField );
//		for(int i=1;i<=12;i++) {
//			driver.findElement(street1MailAdd).sendKeys(Keys.BACK_SPACE);
//		}
//		for(int i=1;i<=4;i++) {
//			driver.findElement(cityMailAdd).sendKeys(Keys.BACK_SPACE);
//		}
//		for(int i=1;i<=6;i++) {
//			driver.findElement(postalCodeMailAdd).sendKeys(Keys.BACK_SPACE);
//		}
//		driver.findElement(By.xpath("(//input[@id='country-select-demo'])[4]")).click();
//		String errorMessStreet1MailAddField = driver.findElement(errorMessageForStreet1MailAdd).getText();
//		System.out
//				.println("Error message for Street1 field of Mailing Address section :" + errorMessStreet1MailAddField);
//		ObjectRepo.test.log(Status.PASS, "Error message for Street1 field of Mailing Address section :" + errorMessStreet1MailAddField );
//		String errorMessCityMailField = driver.findElement(errorMessageForCityMailAdd).getText();
//		System.out.println("Error message for City field of Primary Residence section :" + errorMessCityMailField);
//		ObjectRepo.test.log(Status.PASS, "Error message for City field of Primary Residence section :" + errorMessCityMailField );
//		String errorMessPostalCodeMailAddField = driver.findElement(errorMessageForCityMailAdd).getText();
//		System.out.println("Error message for postal code field of Primary Residence section :" + errorMessPostalCodeMailAddField);
//		ObjectRepo.test.log(Status.PASS, "Error message for postal code field of Primary Residence section :" + errorMessPostalCodeMailAddField );
	}

	public void editAndReviewStepMandetoryFieldsWithInvalidData() throws InterruptedException {
		WebElement element2=driver.findElement(editButtonOnPersonalInfo);
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		js2.executeScript("arguments[0].click()", element2);
		for(int i=1;i<=6;i++) {
			driver.findElement(firstNameOnEditAndReview).sendKeys(Keys.BACK_SPACE);
		}
		driver.findElement(firstNameOnEditAndReview).sendKeys("^%$#%^");
		String errorMessageFirstName=driver.findElement(errorMessageForFirstNameField).getText();
		Assert.assertEquals(errorMessageFirstName, "Invalid First Name");
		System.out.println("Error Message for First Name field:" +errorMessageFirstName);
		ObjectRepo.test.log(Status.PASS, "Error Message for First Name  field:" +errorMessageFirstName);
		for(int i=1;i<=4;i++) {
			driver.findElement(lastNameOnEditAndReview).sendKeys(Keys.BACK_SPACE);
		}
		driver.findElement(lastNameOnEditAndReview).sendKeys("%^$$$%");
		String errorMessageLastName=driver.findElement(errorMessageForLastNameField).getText();
		Assert.assertEquals(errorMessageLastName, "Invalid Last Name");
		System.out.println("Error Message for Last Name  field:" +errorMessageLastName);
		ObjectRepo.test.log(Status.PASS, "Error Message for Last Name field:" +errorMessageLastName);
		for(int i=1;i<=10;i++) {
			driver.findElement(telephoneOnEditAndReview).sendKeys(Keys.BACK_SPACE);
		}
		driver.findElement(telephoneOnEditAndReview).sendKeys("111");
		String errorMessageTelephone=driver.findElement(errorMessageForTelephoneField).getText();
		Assert.assertEquals(errorMessageTelephone, "Telephone Number must not be less than 10 characters");
		System.out.println("Error Message for Telephone field:" +errorMessageTelephone);
		ObjectRepo.test.log(Status.PASS, "Error Message for Telephone field:" +errorMessageTelephone);
		for(int i=1;i<=14;i++) {
			driver.findElement(emailOnEditAndReview).sendKeys(Keys.BACK_SPACE);
		}
		driver.findElement(emailOnEditAndReview).sendKeys("abcdefjhom");
		String errorMessageEmail=driver.findElement(errorMessageForEmailField).getText();
		Assert.assertEquals(errorMessageEmail, "Invalid Email");
		System.out.println("Error Message for Email field:" +errorMessageEmail);
		ObjectRepo.test.log(Status.PASS, "Error Message for Email field:" +errorMessageEmail);
		for(int i=1;i<=14;i++) {
			driver.findElement(confirmEmailOnEditAndReview).sendKeys(Keys.BACK_SPACE);
		}
		driver.findElement(confirmEmailOnEditAndReview).sendKeys("abcdfmaicom");
		String errorMessageConfirmEmail=driver.findElement(errorMessageForConfirmEmailField).getText();
		Assert.assertEquals(errorMessageConfirmEmail, "Invalid Confirm Email");
		System.out.println("Error Message for Confirm Email field:" +errorMessageConfirmEmail);
		ObjectRepo.test.log(Status.PASS, "Error Message for Confirm Email field:" +errorMessageConfirmEmail);
		for(int i=1;i<=8;i++) {
			driver.findElement(employerOnEditAndReview).sendKeys(Keys.BACK_SPACE);
		}
		driver.findElement(employerOnEditAndReview).sendKeys("$%$%$%$");
		String errorMessageEmployer=driver.findElement(errorMessageForEmployerField).getText();
		Assert.assertEquals(errorMessageEmployer, "Invalid Employer");
		System.out.println("Error Message for Employer field:" +errorMessageEmployer);
		ObjectRepo.test.log(Status.PASS, "Error Message for Employer field:" +errorMessageEmployer);
		WebElement element3=driver.findElement(editButtonOnPrimResidence);
		js2.executeScript("arguments[0].click()", element3);
		Thread.sleep(2000);
		for(int i=1;i<=12;i++) {
			driver.findElement(street1PrimResiEditAndReview).sendKeys(Keys.BACK_SPACE);
		}
		driver.findElement(street1PrimResiEditAndReview).sendKeys("$$%$$");
		String errorMessageStreet1FieldOnPrimSec=driver.findElement(errorMessageForStreet1FieldOnPrimSec).getText();
		Assert.assertEquals(errorMessageStreet1FieldOnPrimSec, "Invalid Street 1");
		System.out.println("Error Message for Street 1 field of primary residence section:" +errorMessageStreet1FieldOnPrimSec);
		ObjectRepo.test.log(Status.PASS, "Error Message for Street 1 field of primary residence section:" +errorMessageStreet1FieldOnPrimSec);
		for(int i=1;i<=4;i++) {
			driver.findElement(cityPrimResiEditAndReview).sendKeys(Keys.BACK_SPACE);
		}
		driver.findElement(cityPrimResiEditAndReview).sendKeys("^%^%^");
		String errorMessageCityFieldOnPrimSec=driver.findElement(errorMessageForCityFieldOnPrimSec).getText();
		Assert.assertEquals(errorMessageCityFieldOnPrimSec, "Invalid City");
		System.out.println("Error Message for City field of primary residence section:" +errorMessageCityFieldOnPrimSec);
		ObjectRepo.test.log(Status.PASS, "Error Message for City field of primary residence section:" +errorMessageCityFieldOnPrimSec);
	}
	
	public void verifictionOfMandetoryFieldWithInvalidDataOnCreateUserLogin() {
		driver.findElement(createUserId).sendKeys("%$$%$%$%");
		driver.findElement(passphrase).sendKeys("434324434");
		driver.findElement(confirmPassphrase).sendKeys("4343");
		driver.findElement(answer1).sendKeys("^%%");
		driver.findElement(answer2).sendKeys("^%%");
		driver.findElement(answer3).sendKeys("^%%");
		String errorMessageUserIDField=driver.findElement(errorMessageForUserID).getText();
		Assert.assertEquals(errorMessageUserIDField, "Enter valid User ID");
		System.out.println("Error Message for User ID field:" +errorMessageUserIDField);
		ObjectRepo.test.log(Status.PASS, "Error Message for User ID field:" +errorMessageUserIDField);
		String errorMessagePassphraseField=driver.findElement(errorMessageForPassphrase).getText();
		Assert.assertEquals(errorMessagePassphraseField, "Passphrase is invalid");
		System.out.println("Error Message for passphrase field:" +errorMessagePassphraseField);
		ObjectRepo.test.log(Status.PASS, "Error Message for Passphrase field:" +errorMessagePassphraseField);
		String errorMessageConfirmPassphraseField=driver.findElement(errorMessageForConfirmPassphrase).getText();
		Assert.assertEquals(errorMessageConfirmPassphraseField, "Passphrase and confirm passphrase must be same");
		System.out.println("Error Message for confirm passphrase field:" +errorMessageConfirmPassphraseField);
		ObjectRepo.test.log(Status.PASS, "Error Message for confirm passphrase field:" +errorMessageConfirmPassphraseField);
		String errorMessageAnswer1Field=driver.findElement(errorMessageForAnswer1).getText();
		Assert.assertEquals(errorMessageAnswer1Field, "Answer 1 requires minimum 4 characters");
		System.out.println("Error Message for Answer 1 field:" +errorMessageAnswer1Field);
		ObjectRepo.test.log(Status.PASS, "Error Message for Answer 1 field:" +errorMessageAnswer1Field);
		String errorMessageAnswer2Field=driver.findElement(errorMessageForAnswer2).getText();
		Assert.assertEquals(errorMessageAnswer2Field, "Answer 2 requires minimum 4 characters");
		System.out.println("Error Message for Answer 2 field:" +errorMessageAnswer2Field);
		ObjectRepo.test.log(Status.PASS, "Error Message for Answer 2 field:" +errorMessageAnswer2Field);
		String errorMessageAnswer3Field=driver.findElement(errorMessageForAnswer3).getText();
		Assert.assertEquals(errorMessageAnswer3Field, "Answer 3 requires minimum 4 characters");
		System.out.println("Error Message for Answer 3 field:" +errorMessageAnswer3Field);
		ObjectRepo.test.log(Status.PASS, "Error Message for Answer 3 field:" +errorMessageAnswer3Field);
	}
	public void verifictionOfMandetoryFieldWithInvalidDataOnResidenceAndMailing() {
		driver.findElement(street1PrimResi).sendKeys("%$$^$^$6");
		String errorMessageStreet1FieldOnPrimSec=driver.findElement(errorMessageForStreet1FieldOnPrimSec).getText();
		Assert.assertEquals(errorMessageStreet1FieldOnPrimSec, "Invalid Street 1");
		System.out.println("Error Message for Street 1 field of primary residence section:" +errorMessageStreet1FieldOnPrimSec);
		ObjectRepo.test.log(Status.PASS, "Error Message for Street 1 field of primary residence section:" +errorMessageStreet1FieldOnPrimSec);
		driver.findElement(cityPrimResi).sendKeys("%$$^$^$6");
		String errorMessageCityFieldOnPrimSec=driver.findElement(errorMessageForCityFieldOnPrimSec).getText();
		Assert.assertEquals(errorMessageCityFieldOnPrimSec, "Invalid City");
		System.out.println("Error Message for City field of primary residence section:" +errorMessageCityFieldOnPrimSec);
		ObjectRepo.test.log(Status.PASS, "Error Message for City field of primary residence section:" +errorMessageCityFieldOnPrimSec);
		driver.findElement(postalCodePrimResi).sendKeys("%$$^$^$6");
		String postalCodeFieldOnPrimSec=driver.findElement(errorMessageForPostalCodeFieldOnPrimSec).getText();
		Assert.assertEquals(postalCodeFieldOnPrimSec, "Invalid Postal Code");
		System.out.println("Error Message for Street 1 field of Mailing address section:" +postalCodeFieldOnPrimSec);
		ObjectRepo.test.log(Status.PASS, "Error Message for Street 1 field of Mailing address section:" +postalCodeFieldOnPrimSec);
		driver.findElement(street1MailAdd).sendKeys("%$$^$^$6");
		String errorMessageStreet1FieldOnResiSec=driver.findElement(errorMessageForStreet1FieldOnResiSec).getText();
		Assert.assertEquals(errorMessageStreet1FieldOnResiSec, "Invalid Street 1");
		System.out.println("Error Message for Street 1 field of Mailing address section:" +errorMessageStreet1FieldOnResiSec);
		ObjectRepo.test.log(Status.PASS, "Error Message for Street 1 field of Mailing address section:" +errorMessageStreet1FieldOnResiSec);
		driver.findElement(cityMailAdd).sendKeys("%$$^$^$6");
		String errorMessageCityFieldOnResiSec=driver.findElement(errorMessageForCityFieldResiSec).getText();
		Assert.assertEquals(errorMessageCityFieldOnResiSec, "Invalid City");
		System.out.println("Error Message for City field of Mailing address section:" +errorMessageCityFieldOnResiSec);
		ObjectRepo.test.log(Status.PASS, "Error Message for City field of Mailing address section:" +errorMessageCityFieldOnResiSec);
		driver.findElement(postalCodeMailAdd).sendKeys("%$$^$^$6");	
		String postalCodeFieldOnResiSec=driver.findElement(errorMessageForPostalCodeFieldOnResiSec).getText();
		Assert.assertEquals(postalCodeFieldOnResiSec, "Invalid Postal Code");
		System.out.println("Error Message for Street 1 field of Mailing address section:" +postalCodeFieldOnResiSec);
		ObjectRepo.test.log(Status.PASS, "Error Message for Street 1 field of Mailing address section:" +postalCodeFieldOnResiSec);
		
	}
	
	public void verifictionOfMandetoryFieldWithInvalidDataOnPersonalInformation() {
		driver.findElement(firstName).sendKeys("%$$^$^$6");
		driver.findElement(lastName).sendKeys("^&%^%^%^");
		driver.findElement(telephoneNumber).sendKeys("$%$%$12354");
		driver.findElement(email).sendKeys("$%$%^%^&");
		driver.findElement(confirmEmail).sendKeys("^%^5665655");
		driver.findElement(employer).sendKeys("^%^5^%%^%");
		String errorMessageFirstName=driver.findElement(errorMessageForFirstNameField).getText();
		Assert.assertEquals(errorMessageFirstName, "Invalid First Name");
		System.out.println("Error Message for First Name field:" +errorMessageFirstName);
		ObjectRepo.test.log(Status.PASS, "Error Message for First Name  field:" +errorMessageFirstName);
		String errorMessageLastName=driver.findElement(errorMessageForLastNameField).getText();
		Assert.assertEquals(errorMessageLastName, "Invalid Last Name");
		System.out.println("Error Message for Last Name  field:" +errorMessageLastName);
		ObjectRepo.test.log(Status.PASS, "Error Message for Last Name field:" +errorMessageLastName);
		String errorMessageTelephone=driver.findElement(errorMessageForTelephoneField).getText();
		Assert.assertEquals(errorMessageTelephone, "Invalid Telephone Number");
		System.out.println("Error Message for Telephone field:" +errorMessageTelephone);
		ObjectRepo.test.log(Status.PASS, "Error Message for Telephone field:" +errorMessageTelephone);
		String errorMessageEmail=driver.findElement(errorMessageForEmailField).getText();
		Assert.assertEquals(errorMessageEmail, "Invalid Email");
		System.out.println("Error Message for Email field:" +errorMessageEmail);
		ObjectRepo.test.log(Status.PASS, "Error Message for Email field:" +errorMessageEmail);
		String errorMessageConfirmEmail=driver.findElement(errorMessageForConfirmEmailField).getText();
		Assert.assertEquals(errorMessageConfirmEmail, "Invalid Confirm Email");
		System.out.println("Error Message for Confirm Email field:" +errorMessageConfirmEmail);
		ObjectRepo.test.log(Status.PASS, "Error Message for Confirm Email field:" +errorMessageConfirmEmail);
		String errorMessageEmployer=driver.findElement(errorMessageForEmployerField).getText();
		Assert.assertEquals(errorMessageEmployer, "Invalid Employer");
		System.out.println("Error Message for Employer field:" +errorMessageEmployer);
		ObjectRepo.test.log(Status.PASS, "Error Message for Employer field:" +errorMessageEmployer);
		
	}
	
	public void userIDFieldWithEmptyDataOnCreateUserLoginPage() throws InterruptedException {
		new WebDriverWait(driver, 30).until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//h1[text()='1. Create User Profile']")));
		driver.findElement(createUserId).sendKeys("");
		WebElement element3 = driver.findElement(passphrase);
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("arguments[0].click()", element3);
		driver.findElement(passphrase).sendKeys("");
		String errorMessageUserIDWhenEmpty=driver.findElement(errorMessageUserIDFieldWhenEmpty).getText();
		Assert.assertEquals(errorMessageUserIDWhenEmpty, "Create User ID is required");
		System.out.println("Error Message for passphrase field:" +errorMessageUserIDWhenEmpty);
		ObjectRepo.test.log(Status.PASS, "Error Message for passphrase field:" +errorMessageUserIDWhenEmpty);
	}
	
	public void reEnterPassphraseFunctionality() {
		new WebDriverWait(driver, 30).until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//h1[text()='1. Create User Profile']")));
		driver.findElement(createUserProfileText).getText();
		driver.findElement(passphrase).sendKeys("sdfsdfd");
		String errorMessagePassphraseForInvalidData=driver.findElement(errorMessagePassphraseField).getText();
		Assert.assertEquals(errorMessagePassphraseForInvalidData, "Passphrase is invalid");
		System.out.println("Error Message for passphrase field:" +errorMessagePassphraseForInvalidData);
		ObjectRepo.test.log(Status.PASS, "Error Message for passphrase field:" +errorMessagePassphraseForInvalidData);
		for(int i=1;i<=7;i++) {
			driver.findElement(passphrase).sendKeys(Keys.BACK_SPACE);
		}
		driver.findElement(passphrase).sendKeys("Pravin@123");
		driver.findElement(confirmPassphrase).sendKeys("Pravin@12345");
		String errorMessageForConfirmPassphrase=driver.findElement(errorMessageForconfirmPassphrase).getText();
		Assert.assertEquals(errorMessageForConfirmPassphrase, "Passphrase and confirm passphrase must be same");
		System.out.println("Error Message for Confirm passphrase field:" +errorMessageForConfirmPassphrase);
		ObjectRepo.test.log(Status.PASS, "Error Message for Confirm passphrase field:" +errorMessageForConfirmPassphrase);
		for(int i=1;i<=10;i++) {
			driver.findElement(passphrase).sendKeys(Keys.BACK_SPACE);
		}
		for(int i=1;i<=12;i++) {
			driver.findElement(confirmPassphrase).sendKeys(Keys.BACK_SPACE);
		}
		driver.findElement(passphrase).sendKeys("Pravin@123");
		driver.findElement(confirmPassphrase).sendKeys("Pravin@123");
		System.out.println("The valid data should be accepted in passphrase and confirm passphrase field");
		ObjectRepo.test.log(Status.PASS, "The valid data should be accepted in passphrase and confirm passphrase field");
	}
	
	public void retainDataFunctionalityUntilTabOrWindowClosed() throws InterruptedException {
		new WebDriverWait(driver, 30).until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//h1[text()='1. Create User Profile']")));
		driver.findElement(createUserProfileText).getText();
		Thread.sleep(5000);
	}
	
	public void retainDataFunctionalityWhenTabOrWindowClosed(){
		new WebDriverWait(driver, 30).until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//h1[text()='1. Create User Profile']")));
		driver.findElement(createUserProfileText).getText();
		driver.navigate().to("https://qa.wci-registry.org/");
		}
	
	public void userIdFieldWithExistingUserIDUse() throws InterruptedException {
		new WebDriverWait(driver, 30).until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//h1[text()='1. Create User Profile']")));
		driver.findElement(createUserId).sendKeys("registrar1.que");
		Thread.sleep(8000);
		String errorMessageForUserId=driver.findElement(errorMessageforExistingUserIdUse).getText();
		//Assert.assertEquals(errorMessageForUserId, "User ID is not available");
		System.out.println("Error Message for user Id field:" +errorMessageForUserId);
		ObjectRepo.test.log(Status.PASS, "Error Message for user Id field:" +errorMessageForUserId);
	}
	
	public void emailAddressFieldWithInvalidData() throws InterruptedException {
		new WebDriverWait(driver, 30).until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//h1[text()='1. Create User Profile']")));
		driver.findElement(email).sendKeys("pravin123456@ail");
		System.out.println("Step: Enter Invalid data in email field");
		ObjectRepo.test.log(Status.PASS, "Step: Enter Invalid data in email field");
		driver.findElement(confirmEmail).sendKeys("pravin123456@ail");
		System.out.println("Step: Enter Invalid data in confirm email field");
		ObjectRepo.test.log(Status.PASS, "Step: Enter Invalid data in confirm email field");
		String errorMessageForEmailField=driver.findElement(invalidErrorMessageForEmail).getText();
		Assert.assertEquals(errorMessageForEmailField, "Invalid Email");
		System.out.println("Error Message for Email field:" +errorMessageForEmailField);
		ObjectRepo.test.log(Status.PASS, "Error Message for Emailfield:" +errorMessageForEmailField);
		String errorMessageForConfirmEmailField=driver.findElement(invalidErrorMessageForConfirmEmail).getText();
		Assert.assertEquals(errorMessageForConfirmEmailField, "Invalid Confirm Email");
		System.out.println("Error Message for Confirm email field:" +errorMessageForConfirmEmailField);
		ObjectRepo.test.log(Status.PASS, "Error Message for Confirm email field:" +errorMessageForConfirmEmailField);
		driver.navigate().refresh();
		driver.findElement(selectJurisdiction).click();
		driver.findElement(selectoption).click();
		driver.findElement(selectJurisdictionContButton).click();
		driver.findElement(email).sendKeys("autoregcal2@yopmail.com");
		Thread.sleep(2000);
		String errorMessageForEmail=driver.findElement(errorMessageForEmailAvailable).getText();
		Assert.assertEquals(errorMessageForEmail, "Email Address is not available");
		System.out.println("Error Message for Email field:" +errorMessageForEmail);
		ObjectRepo.test.log(Status.PASS, "Error Message for Email field:" +errorMessageForEmail);	
	}
	
	public void emailAddressFieldWithValidData() throws InterruptedException {
		new WebDriverWait(driver, 30).until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//h1[text()='1. Create User Profile']")));
		driver.findElement(email).sendKeys("pravin123456@ail.com");
		System.out.println("Step: Enter valid data in email field");
		ObjectRepo.test.log(Status.PASS, "Step: Enter valid data in email field");
		driver.findElement(confirmEmail).sendKeys("pravin123456@ail.com");
		System.out.println("Step: Enter valid data in confirm email field");
		ObjectRepo.test.log(Status.PASS, "Step: Enter valid data in confirm email field");
		driver.findElement(employer).click();
	}
	
	public void passphraseFieldWithEmptyDataOnCreateUserLoginPage() throws InterruptedException {
		new WebDriverWait(driver, 30).until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//h1[text()='1. Create User Profile']")));
		driver.findElement(passphrase).sendKeys("");
		System.out.println("Step: Keep passphrase field empty");
		ObjectRepo.test.log(Status.PASS, "Step: Keep passphrase field empty");
		WebElement element3 = driver.findElement(confirmPassphrase);
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("arguments[0].click()", element3);
		driver.findElement(confirmPassphrase).sendKeys("");
		System.out.println("Step: Keep Confirm passphrase field empty");
		ObjectRepo.test.log(Status.PASS, "Step: Keep Confirm passphrase field empty");
		driver.findElement(selectSecurityQue1).click();
		Thread.sleep(2000);
		String errorMessageForPassphraseFieldWhenEmpty=driver.findElement(errorMessageWhenPassphrsaeFieldEmpty).getText();
		Assert.assertEquals(errorMessageForPassphraseFieldWhenEmpty, "Passphrase is required");
		System.out.println("Error Message for passphrase field:" +errorMessageForPassphraseFieldWhenEmpty);
		ObjectRepo.test.log(Status.PASS, "Error Message for passphrase field:" +errorMessageForPassphraseFieldWhenEmpty);
		String errorMessageForConPassphraseFieldWhenEmpty=driver.findElement(errorMessageWhenConfirmPassphrsaeFieldEmpty).getText();
		Assert.assertEquals(errorMessageForConPassphraseFieldWhenEmpty, "Confirm Passphrase is required");
		System.out.println("Error Message for Confirm passphrase field:" +errorMessageForConPassphraseFieldWhenEmpty);
		ObjectRepo.test.log(Status.PASS, "Error Message for Confirm passphrase field:" +errorMessageForConPassphraseFieldWhenEmpty);
	}
	
	public void passphraseFieldWithInvalidDataOnCreateUserLoginPage() throws InterruptedException {
		new WebDriverWait(driver, 30).until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//h1[text()='1. Create User Profile']")));
		driver.findElement(passphrase).sendKeys("$%^^$^%$^$");
		System.out.println("Step: Enter Invalid data in passphrase field");
		ObjectRepo.test.log(Status.PASS, "Step: Enter Invalid data in passphrase field");
		String errorMessageForPassphraseField=driver.findElement(errorMessagePassphraseField).getText();
		Assert.assertEquals(errorMessageForPassphraseField, "Passphrase is invalid");
		System.out.println("Error Message for Passphrase field:" +errorMessageForPassphraseField);
		ObjectRepo.test.log(Status.PASS, "Error Message for Passphrase field:" +errorMessageForPassphraseField);
	}
	
	public void passphraseFieldWithValidDataOnCreateUserLoginPage() throws InterruptedException {
		new WebDriverWait(driver, 30).until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//h1[text()='1. Create User Profile']")));
		driver.findElement(passphrase).sendKeys("Pass@12345");
		System.out.println("Step: Enter valid data in passphrase field");
		ObjectRepo.test.log(Status.PASS, "Step: Enter valid data in passphrase field");
		//Thread.sleep(2000);
		driver.findElement(confirmPassphrase).sendKeys("Pass@12345");
		//Thread.sleep(2000);
		System.out.println("Step:enter confirm passphrase as same of passphrase ");
		ObjectRepo.test.log(Status.PASS, "Step:enter confirm passphrase as same of passphrase ");
	}
	
	public void userIdFieldWithInValidDataOnCreateUserLoginPage() throws InterruptedException {
		new WebDriverWait(driver, 30).until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//input[@name='createUserID']")));
		driver.findElement(createUserId).sendKeys("@@@@@@@");
		System.out.println("Step: Enter Invalid data in user id field");
		ObjectRepo.test.log(Status.PASS, "Step: Enter Invalid data in user id field");
		new WebDriverWait(driver, 30).until(ExpectedConditions
			.elementToBeClickable(By.xpath("//input[@name='passphrase']")));
		WebElement element3 = driver.findElement(passphrase);
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("arguments[0].click()", element3);
		//driver.findElement(passphrase).click();
		String errorMessageForUserIdField=driver.findElement(errorMessageUserIdField).getText();
		Assert.assertEquals(errorMessageForUserIdField, "Enter valid User ID");
		System.out.println("Error Message for user Id field:" +errorMessageForUserIdField);
		ObjectRepo.test.log(Status.PASS, "Error Message for user Id field:" +errorMessageForUserIdField);
		for(int i=1;i<=6;i++) {
			driver.findElement(createUserId).sendKeys(Keys.BACK_SPACE); 
		}
		driver.findElement(createUserId).sendKeys("user2user");
		System.out.println("Step: Again Enter existing user id in the system");
		ObjectRepo.test.log(Status.PASS, "Step: Again Enter existing user id in the system");
		new WebDriverWait(driver, 30).until(ExpectedConditions
				.elementToBeClickable(By.xpath("//input[@name='passphrase']")));
			driver.findElement(passphrase).click();
			
		String errorMessageForUseridField=driver.findElement(errorMessageUserIdField).getText();
		//Assert.assertEquals(errorMessageForUseridField, "User ID is not available");
		System.out.println("Error Message for user Id field:" +errorMessageForUseridField);
		ObjectRepo.test.log(Status.PASS, "Error Message for user Id field:" +errorMessageForUseridField);
	}
	
	public void userIdFieldWithValidDataOnCreateUserLoginPage() throws InterruptedException {
		new WebDriverWait(driver, 30).until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//input[@name='createUserID']")));
		driver.findElement(createUserId).sendKeys("testData");
		System.out.println("Step: Enter valid data in user id field");
		ObjectRepo.test.log(Status.PASS, "Step: Enter valid data in user id field");
		WebElement element3 = driver.findElement(passphrase);
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("arguments[0].click()", element3);
	    Thread.sleep(2000);
	}
}
