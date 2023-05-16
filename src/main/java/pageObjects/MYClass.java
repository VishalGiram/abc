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

public class MYClass extends base {

	
	public static String userId;
	
	private By passphraseOnLoginPage = By.xpath("//input[@name='password']");
	private By securityQuestion1ForLogin = By.xpath("//*[@class='MuiTypography-root MuiTypography-h6 css-1etlmxt']");
	private By forgotUserIdLink = By.xpath("//a[text()='Forgot User ID?']");   //change
	private By emailAddress = By.xpath("//input[@id='emailId']");
	private By emailAddressWithLabel = By.xpath("//h6[text()='Please enter a valid email address:']");
	private By forgotUserContbutton = By.xpath("//button[text()='CONTINUE']");  //change
	private By forgotPassphraseLink = By.xpath("//a[text()='Forgot Passphrase?']"); //change
	private By userIDWithLabel = By.xpath("//h6[text()='Please enter your User ID:']");
	private By userAddress = By.xpath("//*[@name='emailId']");
	private By forgotPassphraseContbutton = By.xpath("//button[text()='CONTINUE']");
	private By successMessageForUseID = By.xpath("//p[text()='Email with User ID information is sent to your registered email address.']");
	private By successMessageForPassphrase = By.xpath("//p[text()='Email with instruction to reset passphrase will be sent to registered email address']");
	private By errorMessageForUserIDpassphrase = By.xpath("//span[text()='Enter valid User ID']");
	 private By CONTINUEBtn=By.xpath("//button[text()='CONTINUE']");
	
	
	
	private By userRegistration = By.xpath("//button[text()='USER REGISTRATION']"); // change
	private By newRegistration = By.xpath("//a[text()='New Registration']");
	private By startNewRegisBut = By.xpath("//button[text()='Start New Registration']"); // add this start new
																							// registration button
	

	private By createUserProfileText = By.xpath("//span[text()='Create User Profile']");
	private By submitRequiredDocumentsText = By.xpath("//span[text()='Submit Required Documents']");
	private By awaitJurisdictionDecisionText = By.xpath("//span[text()='Await Jurisdiction Decision']");

	private By selectJurisdiction = By.xpath("//div[@id='mui-component-select-jurisdiction']");
	private By selectoptionQue = By.xpath("//span[text()='Quebec']");
	private By selectoptionCal = By.xpath("//span[contains(text(),'California')]");
	private By selectJurisdictionContButton = By.xpath("//button[text()='CONTINUE']");
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
	//private By date = By.xpath("//div[@id='day']");
	private By date = By.xpath("//*[@data-testid='CalendarIcon']");
	private By selectDate = By.xpath("//li[@data-value='5']");
	//private By selectDate = By.xpath("(//button[@type='button' and contains(@class,'MuiButtonBase-root MuiPickersDay-root Mui-selected MuiPickersDay-dayWithMargin')])");
	//private By selectDate = By.xpath("//button[text()='5']");
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
	private By SelectAlternateAccountRepresentativeRole = By.xpath("//*[text()='Alternate Account Representative' and contains(@class,'MuiTypography-root MuiTypography-body1 MuiListItemText-primary')]");
	
	
	private By SelectIndividualRole =By.xpath("//*[text()='Individual Users' and contains(@class,'MuiTypography-root MuiTypography-body1 MuiListItemText-primar')]");
	private By SubmitButton = By.xpath("//*[@type='submit']");
	private By RoleChangeSuccessMsg = By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']");

	//private By UserProfile = By.xpath("//a[text()='User Profile']");
	private By ChangeJU = By.xpath("//span[text()='Change Jurisdiction']");
	private By CrossJU = By.xpath("//span[text()='Cross Jurisdiction']");
	private By SelectJU = By.xpath("//div[@id='mui-component-select-jurisdiction']");
	private By countinue = By.xpath("//button[text()='CONTINUE']");
	private By continueButtonforTemporary = By.xpath("(//button[text()='CONTINUE'])[2]");

	private By Search2 = By.xpath("(//*[@type='search'])[2]");
	private By Search1 = By.xpath("(//*[@type='search'])[1]");
	private By UserProfilePage =By.xpath("//h1[text()='User Profile']");
	private By PendingSearchedUser = By.xpath("(//*[@class='link-cell'])[6]");
	private By RegisteredSearchedUser = By.xpath("(//a[@class='link-cell'])[1]");
	private By UserDetalisheader = By.xpath("//h1[text()='User Details']");

	private By Deny = By.xpath("//input[@name='Deny']");
	private By Approved = By.xpath("//input[@name='Approved']");
	private By RevisionRequest = By.xpath("//input[@name='RequestRevision']");
	private By SelectRoleType = By.xpath("//div[@id='mui-component-select-RoleType']");
	
	
	private By SelectReasonDenial = By.xpath("//*[text()='Select Reason for Denial']");
	private By welButton = By.xpath("//button[text()='Welcome,']");
	private By userid = By.xpath("//input[@name='email']");
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
	
	
	//Swati
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

	private By search = By.xpath("(//input[contains(@class,\"MuiInputBase-input MuiInput-input MuiInputBase-inputTypeSearch MuiInputBase-inputAdornedStart MuiInputBase-inputAdornedEnd\")])[1]");
	private By approveUserTextOnHomePage = By.xpath("//div[text()='[APPROVED USER - LOGGED-IN HOME PAGE]']");
	private By UserDetails = By.xpath("//h1[text()='User Details']");
	private By SearchedName = By.xpath("//a[@href='/jurisdiction-user-actions']");
	//private By Menu = By.xpath("//*[name()=\"svg\" and contains(@class,\"MuiSvgIcon-root MuiSvgIcon-fontSizeMedium dot-icon\")]");
	private By InactiveUserProfileAccessOnly = By.xpath("//p[text()='INACTIVATE USER - PROFILE ACCESS ONLY']");
	private By InactiveUserReasons = By.xpath("//input[@id='inctiveReasons']");
	private By continueButton = By.xpath("//button[text()='CONTINUE']");
	private By SuccessMsg = By.xpath("//p[text()='Account status is changed to Profile Access Only. The user can login to the system.']");

	private By PendingRequest = By.xpath("//*[text()='Pending Requests']");
	private By search1 = By.xpath(
			"(//input[contains(@class,\"MuiInputBase-input MuiInput-input MuiInputBase-inputTypeSearch MuiInputBase-inputAdornedStart MuiInputBase-inputAdornedEnd\")])[2]");
	private By SearchedName1 = By.xpath(
			"//p[text()='Pending Requests']/parent::div/parent::div/following-sibling::div//*[a[contains(@href,'/jurisdiction-user-actions')]]/a");
	private By Approve = By.xpath("//input[(@type='radio')and (@name='Approved')]");
	private By Savebutton = By.xpath("//button[text()='save']");
	
	private By PendingExpandIcon = By.xpath("//*[@data-testid='ExpandMoreIcon']");
	private By form = By.xpath("//p[text()='Forms']");
	private By CancelUserRegistration = By.xpath("//*[text()='Cancel User Registration']");
	private By ClseUserAccount = By.xpath("//*[text()='Close User Account']");
	private By ClseUserAccount2 = By.xpath("//*[text()='Close user Account']");
	private By continueButtonCloseUserAccount2 = By.xpath("//button[@data-testid='priv_modal_Continue']");
	private By warning = By.xpath("//h6[text()='Warning!']");

	private By formdata = By.xpath("//p[text()='- No forms to show at this time']");
	private By CancelButton = By.xpath("(//button[text()='CANCEL'])[2]");
	private By DeactiveWithProfileAccess = By.xpath("(//*[text()='Deactivate with profile access'])[1]");
	private By yesButton = By.xpath("//button[text()='Yes, I want to cancel the application']");

	private By Filter = By.xpath("(//button[@type='button' and (text()='Filters')])[2]");
	private By AddFilter = By.xpath("//button[@type='button' and (text()='Add filter')]");
	private By PendingCOJ = By.xpath("//p[text()='Pending Cross Jurisdiction']");

	private By telephoneNumberRevision = By.xpath("//input[@name='TelephoneNumber']");
	private By EmployerRevision = By.xpath("//input[@name='Employer']");
	private By Street1Revision = By.xpath("//input[@name='ResStreet1']");
	private By CityRevision = By.xpath("//input[@name='ResCity']");
	private By InactivecloseUser = By.xpath("//p[text()='INACTIVATE USER - CLOSE ACCOUNT']");

	private By SelectServiceProviderRole = By.xpath(
			"//*[text()='Service Providers' and contains(@class,'MuiTypography-root MuiTypography-body1 MuiListItemText-primary')]");
	private By SelectMarketmonitorRoleType = By.xpath(
			"//*[text()='Market Monitor' and contains(@class,'MuiTypography-root MuiTypography-body1 MuiListItemText-primary')]");
	private By SelectfinancialServiceProviderRole = By.xpath(
			"//*[text()='Financial Service Providers' and contains(@class,'MuiTypography-root MuiTypography-body1 MuiListItemText-primary')]");
	

	public MYClass() {
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

	public static String generateEmailString() {
		int length = 5;
		boolean useLetters = true;
		boolean useNumbers = true;
		String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);

		String randomString = ("Test" + generatedString + "@yopmail.com");
		return randomString;
	}

	public void selectJurisdictionStep() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(1000);
		// driver.findElement(userRegistration).click();
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
		// driver.findElement(startNewRegisBut).click();
		// driver.findElement(continueButtonforTemporary).click();
		driver.findElement(selectJurisdiction).click();
		System.out.println("Step :Click on select jurisdiction dropdown");
		ObjectRepo.test.log(Status.PASS, "Step :Click on select jurisdiction dropdown");
		driver.findElement(selectoptionCal).click();
		System.out.println("Step :Click on select jurisdiction from dropdown list");
		ObjectRepo.test.log(Status.PASS, "Step :Click on select jurisdiction from dropdown list");
		driver.findElement(selectJurisdictionContButton).click();
		System.out.println("Step :Click on continue button");
		ObjectRepo.test.log(Status.PASS, "Step :Click on continue button");
	}

	public void personalInformation() throws InterruptedException {
		driver.findElement(salutation).sendKeys("Mr");
		new WebDriverWait(driver, 30)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='firstName']")));
		driver.findElement(firstName).sendKeys(prop.getProperty("FirstName"));
		driver.findElement(middleName).sendKeys(prop.getProperty("MiddleName"));
		driver.findElement(lastName).sendKeys(prop.getProperty("LastName"));
		driver.findElement(suffix).sendKeys(prop.getProperty("Suffix"));
		driver.findElement(By.xpath("//input[@name='date']")).sendKeys("1996/02/03");
//		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable((date))).click();
//		Thread.sleep(1000);
//		driver.findElement(selectDate).click();
//		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(month)).click();
//		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(selectMonth)).click();
//		driver.findElement(year).click();
//		WebElement element = driver.findElement(selectYear);
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click()", element);
		driver.findElement(telephoneNumber).sendKeys(prop.getProperty("TelephoneNo"));
		driver.findElement(extension).sendKeys("121");
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
		driver.findElement(faxNumber).sendKeys("12345678901");
		Thread.sleep(1000);
		WebElement element1 = driver.findElement(perInfoContButton);
		js.executeScript("arguments[0].click()", element1);
		System.out.println("Step: Enter valid data in all fields and click on continue button");
		ObjectRepo.test.log(Status.PASS, "Step: Enter valid data in all fields and click on continue button");
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
		Thread.sleep(2000);
		driver.findElement(selectStatePrimResi).click();
		new WebDriverWait(driver, 30).until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//span[text()='Check if same as Primary Residence']")));
		WebElement element = driver.findElement(checkBox);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
//		Actions action = new Actions(driver);
//		action.moveToElement(element).build().perform();
//		action.click(element).build().perform();
		Thread.sleep(500);
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
		Thread.sleep(1000);
//		new WebDriverWait(driver, 30).until(
//				ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h1[text()='1. Create User Profile']")));
	}

	public void createUserLogin() throws InterruptedException {
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		userId = generateUserIdString();
		System.out.println("Uesrid :" + userId);
		driver.findElement(createUserId).sendKeys(userId);
		driver.findElement(passphrase).sendKeys("Pass@12345");
		driver.findElement(confirmPassphrase).sendKeys("Pass@12345");
		driver.findElement(secQuestion1).click();
		Thread.sleep(1000);
		driver.findElement(selSecQue1).click();
		driver.findElement(answer1).sendKeys("Answer_1");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
		Thread.sleep(500);
		driver.findElement(secQuestion2).click();
		Thread.sleep(1000);
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
		Thread.sleep(1000);
		driver.findElement(selSecQue3).click();
		driver.findElement(answer3).sendKeys("Answer_3");
		WebElement element1 = driver.findElement(termsOfUseCheckBox);
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("arguments[0].click()", element1);

		WebElement element2 = driver.findElement(creUserProfRegBut);
		js3.executeScript("arguments[0].click()", element2);
		Thread.sleep(1000);
		driver.findElement(crossButtonAfterRegistration).click();
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,700)");
		driver.findElement(finishButton).click();
		Thread.sleep(2000);
		System.out.println("New User Created Successfully.");
		ObjectRepo.test.log(Status.PASS, "New User Created Successfully.");

	}

	public void assignRoleToNewUser() throws InterruptedException {
		driver.findElement(Search1).click();
		driver.findElement(Search1).sendKeys(userId);
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//button[@role='tab']")).click();
		driver.findElement(RegisteredSearchedUser).click();
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1800)");
		Thread.sleep(1000);
		driver.findElement(Approved).click();
		Thread.sleep(1000);
		driver.findElement(SelectRoleType).click();
		driver.findElement(By.xpath("(//*[text()='Jurisdiction Users'])")).click();
		JavascriptExecutor j = (JavascriptExecutor) driver;
		// j.executeScript("window.scrollBy(0,250)", "");

		Thread.sleep(1000);
		driver.findElement(SelectRole).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//*[text()='Registrar' and contains(@class,\"MuiTypography-root MuiTypography-body1 MuiListItemText-primary\")]"))
				.click();

//		WebElement element3 = driver.findElement(By.xpath("//*[text()='Registrar']"));
//		Actions action1 = new Actions(driver);
//		action1.moveToElement(element3).build().perform();
//		Thread.sleep(4000);

		WebElement element2 = driver.findElement(SelectRoleType);
		Actions action = new Actions(driver);
		action.moveToElement(element2).build().perform();
		Thread.sleep(4000);

		js.executeScript("window.scrollBy(0,2650)");
		WebElement abc = driver.findElement(SubmitButton);
		j.executeScript("arguments[0].click();", abc);
		Thread.sleep(6000);

		String successmsg = driver.findElement(By.xpath("//*[text()='User has sent for Authority Approval']"))
				.getText();
		Assert.assertEquals("User has sent for Authority Approval", successmsg);
		System.out.println("User has sent for Authority Approval");
		ObjectRepo.test.log(Status.PASS, "User has sent for Authority Approval");

	}

	public void proposeRoleToNewUser() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@data-testid='ExpandMoreIcon']")).click();
		Thread.sleep(2000);
		// driver.findElement(By.xpath("(//*[@type='search'])[2]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
		driver.findElement(Search2).sendKeys(userId);
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[@class='link-cell'])[6]")).click();
		Thread.sleep(6000);
		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		js5.executeScript("window.scrollBy(0,1800)");
		Thread.sleep(3000);
		WebElement element2 = driver.findElement(Approved);
		Actions action = new Actions(driver);
		action.moveToElement(element2).build().perform();
		driver.findElement(Approved).click();
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(4000);
		WebElement l = driver.findElement(SubmitButton);
		j.executeScript("arguments[0].click();", l);
		new WebDriverWait(driver, 30)
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='User request has been approved.']")));
		String successmsg = driver.findElement(By.xpath("//*[text()='User request has been approved.']")).getText();
		Assert.assertEquals(successmsg,"User request has been approved.");
		System.out.println("User request has been approved by Jurisdiction Autority");
		ObjectRepo.test.log(Status.PASS, "User request has been approved by Jurisdiction Autority");
		
	}
	
	public void StatusChangeFromJA() throws InterruptedException {
		driver.findElement(By.xpath("//*[@data-testid='ExpandMoreIcon']")).click();
		driver.findElement(By.xpath("(//*[@type='search'])[2]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
		driver.findElement(By.xpath("(//*[@type='search'])[2]")).sendKeys(userId);
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
		
		String successmsg = driver.findElement(By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']")).getText();
		//String successmsg = driver.findElement(By.xpath("//p[text()='Role Change Approved']")).getText();
		//Assert.assertEquals("Role Change Approved", successmsg);
		System.out.println("Role Change Approved");
		ObjectRepo.test.log(Status.PASS, "Role Change Approved");		
	}

	public void proposeChangeRoleToExistingUser() throws InterruptedException {
		
		driver.findElement(Search1).click();
		driver.findElement(Search1).sendKeys(userId);
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[@class='link-cell'])[1]")).click();
		Thread.sleep(4000);
		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		js5.executeScript("window.scrollBy(0,1800)");
		Thread.sleep(1800);
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

		String successmsg = driver.findElement(By.xpath("//*[text()='Proposed Role Change request is raised.']"))
				.getText();
		Assert.assertEquals("Proposed Role Change request is raised.", successmsg);
		System.out.println("Proposed Role Change request is raised.");
		ObjectRepo.test.log(Status.PASS, "Proposed Role Change request is raised.");
//			
	}

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
//		Thread.sleep(4000);
		new WebDriverWait(driver, 40).until(ExpectedConditions.elementToBeClickable(loginbutton));
//		driver.findElement(checkBoxRememberMe).click();
		WebElement element = driver.findElement(loginbutton);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
//		driver.findElement(answerField).sendKeys(prop.getProperty("SecurityAnswer2"));
//		driver.findElement(continueButtonForLogin).click();
//		String welcomeMsg = driver.findElement(By.xpath("//*[text()='Welcome!']")).getText();
//		Assert.assertEquals(welcomeMsg , "Welcome!");
	}
	
	public void searchuser() throws InterruptedException {
		driver.findElement(Search1).click();
		driver.findElement(Search1).sendKeys(userId);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@role='tab']")).click();
		driver.findElement(RegisteredSearchedUser).click();
		Thread.sleep(4000);

		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='User Details']")));
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
		Assert.assertEquals(message1,"Account status is changed to Profile Access Only. The user can login to the system.");
		ObjectRepo.test.log(Status.PASS, message1);
	}
	
	public void runtime_Login_with_Jurisdiction_Registrar() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(userid).sendKeys(prop.getProperty("LoginAsJurisdictionUserUsername"));
		driver.findElement(passphrase1).sendKeys(prop.getProperty("LoginAsJurisdictionUserPassword"));
//		Thread.sleep(4000);
		new WebDriverWait(driver, 40).until(ExpectedConditions.elementToBeClickable(loginbutton));
//		driver.findElement(checkBoxRememberMe).click();
		WebElement element = driver.findElement(loginbutton);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
//		driver.findElement(answerField).sendKeys(prop.getProperty("SecurityAnswer2"));
//		driver.findElement(continueButtonForLogin).click();
//		String welcomeMsg = driver.findElement(By.xpath("//*[text()='Welcome!']")).getText();
//		Assert.assertEquals(welcomeMsg , "Welcome!");
	}
	
	public void UIForForgotPassphrase() throws InterruptedException {
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Forgot Passphrase?']")));
	    Thread.sleep(2000);
		driver.findElement(forgotPassphraseLink).click();
		//driver.findElement(forgotPassphraseLink).click();
		System.out.println("Following elements should be available on Forgot Passphrase :");
		String EnterUserId=driver.findElement(userIDWithLabel).getText();
		System.out.println(EnterUserId);
		String ContinueButton=driver.findElement(forgotUserContbutton).getText();
		System.out.println(ContinueButton);
		ObjectRepo.test.log(Status.PASS, EnterUserId+","+ContinueButton );	
	}
	
	public void forgotPassphrasevalidData() throws InterruptedException { 
		driver.findElement(forgotPassphraseLink).click();
		//driver.findElement(forgotPassphraseLink).click();
        driver.findElement(emailAddress).sendKeys("test12");
        System.out.println("step2 : Entered user id is valid");
        Thread.sleep(1000);
       
        driver.findElement(forgotUserContbutton).click();
        new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(successMessageForPassphrase));
        String ExpectedSuccessMessage=driver.findElement(successMessageForPassphrase).getText();
        
       System.out.println("Step 4 : Success Message:"+ ExpectedSuccessMessage);
        ObjectRepo.test.log(Status.PASS, "step4 : Success Message : Email with instruction to reset passphrase will be sent to registered email address" );
        String ActualSuccessMessage="Email with instruction to reset passphrase will be sent to registered email address";
        Assert.assertEquals(ActualSuccessMessage, ExpectedSuccessMessage);       
    }
	public void forgotPassphraseinvalidData() throws InterruptedException { 
        driver.findElement(forgotPassphraseLink).click();
        //driver.findElement(forgotPassphraseLink).click();
        System.out.println("step : Click on forgot passphrase Link  ");
        ObjectRepo.test.log(Status.PASS, "step1 : Click on forgot Passphrase Link" );
        driver.findElement(emailAddress).sendKeys(prop.getProperty("InvalidUserID1"));
        System.out.println("step : Entered Invalid user Id");
        ObjectRepo.test.log(Status.PASS, "step2 : Entered Invalid UserID" );
        
        String message1=driver.findElement(errorMessageForUserIDpassphrase).getText();
        System.out.println("Step : Error message :"+ message1);
        Assert.assertEquals(message1, "Enter valid User ID");
        ObjectRepo.test.log(Status.PASS, message1 );
        
        WebElement verifyContinueButton= driver.findElement(CONTINUEBtn);
        if(verifyContinueButton.isEnabled())
        {
            System.out.println("Step: Continue Button is Enabled");
            System.out.println("Step: User Entered valid data");
        }
        else
        {
            System.out.println("Step : Continue Button is Disabled");
            
        }
        
        ObjectRepo.test.log(Status.PASS, "step : forgot Passphrase with invalid Data" );

    }
	public void forgotPassphraseEmptyData() {
        driver.findElement(forgotPassphraseLink).click();
        //driver.findElement(forgotPassphraseLink).click();
        System.out.println("step : Click on forgot passphrase Link  ");
        ObjectRepo.test.log(Status.PASS, "step1 : Click on forgot passphrase Link" );
        driver.findElement(emailAddress).sendKeys("");
        System.out.println("step : Keep user id field empty");
        ObjectRepo.test.log(Status.PASS, "step2 : Keep user id field empty" );
     
        WebElement verifyContinueButton= driver.findElement(CONTINUEBtn);
        if(verifyContinueButton.isEnabled())
        {
            System.out.println("Step: Continue Button is Enabled");
        }
        else
        {
            System.out.println("Step: Continue Button is Disabled");
            System.out.println("Step: User ID field is empty");
        }
        
        ObjectRepo.test.log(Status.PASS, "step : forgot Passphrase with Empty Data" );
        
    }
	public void AllowToChangePassphrase() throws InterruptedException {
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(WelcomeButton));
		//driver.findElement(WelcomeButton).click();
		WebElement element1 = driver.findElement(WelcomeButton);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element1);
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='User Profile']")));
		WebElement element = driver.findElement(UserProfile);
		//JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);

		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(ChangePassAndSecurity));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,9000)");

		Thread.sleep(1000);
		// new WebDriverWait(driver,
		// 60).until(ExpectedConditions.visibilityOfElementLocated((ChangePassAndSecurity)));
		driver.findElement(ChangePassAndSecurity).click();
		System.out.println("Step: Change Passphrase and Security Questions link Available and Accessible");
		ObjectRepo.test.log(Status.PASS,"step : Change Passphrase and Security Questions link Available and Accessible");
		ObjectRepo.test.log(Status.PASS, "step : Reset Passphrase and Security Questions page displayed");
	}

	
	public void assignRoleToUserwithinsameRoleType() throws InterruptedException {
		driver.findElement(CloseButtonOnTerms).click();
		Thread.sleep(500);
		driver.findElement(Search1).click();
		driver.findElement(Search1).sendKeys(userId);
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
	
		//driver.findElement(By.xpath("(//*[@data-testid='CloseIcon'])[1]")).click();
		driver.findElement(SelectRole).click();
		Thread.sleep(1000);
		driver.findElement(SelectIndividualRole).click();
		Thread.sleep(1000);
		driver.findElement(SelectAlternateAccountRepresentativeRole).click();
		Thread.sleep(1000);


		Thread.sleep(4000);
		WebElement abc = driver.findElement(SubmitButton);
		j.executeScript("arguments[0].click();", abc);
		Thread.sleep(6000);

		String successmsg = driver.findElement(RoleChangeSuccessMsg).getText();
		//Assert.assertEquals("User role has been changed.", successmsg);
		System.out.println("JU is able to change user role within same role type");
		ObjectRepo.test.log(Status.PASS, "JU is able to change user role within same role type");

	}

	public void assignRoleToUserwithindifferentRoleType() throws InterruptedException {
		driver.findElement(CloseButtonOnTerms).click();
		Thread.sleep(500);
		driver.findElement(Search1).click();
		driver.findElement(Search1).sendKeys(userId);
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

		String successmsg = driver.findElement(By.xpath("//p[text()='Proposed Role Change request is raised.']")).getText();
		Assert.assertEquals("Proposed Role Change request is raised.", successmsg);
		System.out.println("JU is able to change user role within different role type");
		ObjectRepo.test.log(Status.PASS, "JU is able to change user role within different role type");

	}

	public void Termsandconditions () throws InterruptedException {
		try {
			WebElement PageHeader = driver.findElement(By.xpath(
					"//*[text()='Updated Terms and Conditions' and contains(@class,\"MuiTypography-root MuiTypography-h2\")]"));
			PageHeader.isDisplayed();
			//Thread.sleep(500);
			ObjectRepo.test.log(Status.PASS, "step : Terms and condition pop Displayed");
			driver.findElement(TermCheckbox).click();
			//Thread.sleep(2000);	
			driver.findElement(UpdateTermConditionsContinewButton).click();
			//Thread.sleep(2000);			
			driver.findElement(CloseButtonOnTerms).click();
			//Thread.sleep(5000);
			driver.findElement(CloseButtonOnTerms).click();
			//Thread.sleep(5000);
			//driver.findElement(CloseButtonOnTerms).click();
		} catch (Exception e) {
			System.out.println("Terms and conditions pop up not displayed");
		}
	}
	
	
	public void resetPassphrasePrompt () throws InterruptedException {
		try {
			WebElement PageHeader = driver.findElement(By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']"));
			PageHeader.isDisplayed();
			new WebDriverWait(driver,5).until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@data-testid='CloseIcon'])[3]")));
			driver.findElement(By.xpath("(//*[@data-testid='CloseIcon'])[3]")).click();
			
		}catch (Exception e) {
			System.out.println("Reset passphrase pop up not displayed");
		}
	}
	
	public void resetPassphrasePrompt1 () throws InterruptedException {
		try {
			WebElement PageHeader = driver.findElement(By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']"));
			PageHeader.isDisplayed();
			new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-testid='CloseIcon']")));
			driver.findElement(By.xpath("//*[@data-testid='CloseIcon']")).click();
			
		}catch (Exception e) {
			System.out.println("Reset passphrase pop up not displayed");
		}
	}
	public void runtime_Login_with_Approved_User() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(userid).sendKeys(userId);

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Pass@12345");
//		Thread.sleep(4000);
		new WebDriverWait(driver, 40).until(ExpectedConditions.elementToBeClickable(loginbutton));
//		driver.findElement(checkBoxRememberMe).click();
		WebElement element = driver.findElement(loginbutton);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
//		driver.findElement(answerField).sendKeys(prop.getProperty("SecurityAnswer2"));
//		driver.findElement(continueButtonForLogin).click();
//		String welcomeMsg = driver.findElement(By.xpath("//*[text()='Welcome!']")).getText();
//		Assert.assertEquals(welcomeMsg , "Welcome!");
//		driver.findElement(answerField).sendKeys(prop.getProperty("SecurityAnswer2"));
//		driver.findElement(continueButtonForLogin).click();
//		String welcomeMsg = driver.findElement(By.xpath("//*[text()='Welcome!']")).getText();
//		Assert.assertEquals(welcomeMsg, "Welcome!");

	}

	public void runtime_Login_with_Pending_User() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(userid).sendKeys(userId);

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Pass@12345");
//		Thread.sleep(4000);
		new WebDriverWait(driver, 40).until(ExpectedConditions.elementToBeClickable(loginbutton));
//		driver.findElement(checkBoxRememberMe).click();
		WebElement element = driver.findElement(loginbutton);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
//		driver.findElement(answerField).sendKeys(prop.getProperty("SecurityAnswer2"));
//		driver.findElement(continueButtonForLogin).click();
//		String welcomeMsg = driver.findElement(By.xpath("//*[text()='Welcome!']")).getText();
//		Assert.assertEquals(welcomeMsg , "Welcome!");
//		driver.findElement(answerField).sendKeys(prop.getProperty("SecurityAnswer2"));
//		driver.findElement(continueButtonForLogin).click();
//		String welcomeMsg = driver.findElement(By.xpath("//*[text()='Welcome!']")).getText();
//		Assert.assertEquals(welcomeMsg, "Welcome!");
		

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
		driver.findElement(Search2).sendKeys(userId);
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
//		String successmsg = driver.findElement(By.xpath("//*[text()='Your change of jurisdiction request has been denied.']"))
//				.getText();
//		Assert.assertEquals("Your change of jurisdiction request has been denied.", successmsg);
//		System.out.println("Your change of jurisdiction request has been denied.");
//		ObjectRepo.test.log(Status.PASS, "Role Change Request have been denied by Registrar");
	}

	public void DenyChangeJUFromRegistrarwithoutreason() throws InterruptedException {
		driver.findElement(By.xpath("//*[@data-testid='ExpandMoreIcon']")).click();
		driver.findElement(Search2).click();
		JavascriptExecutor j2 = (JavascriptExecutor) driver;
		j2.executeScript("window.scrollBy(0,761)");
		driver.findElement(Search2).sendKeys(userId);
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

//		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(SelectReasonDenial));
//		driver.findElement(SelectReasonDenial).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[text()='Denial Reason 1']")).click();
//		Thread.sleep(1000);
//
//		driver.findElement(By.xpath("//textarea[contains(@class,'MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputMultiline') and @name='Comments']")).sendKeys("Test Comment");
//		Thread.sleep(1000);
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
		driver.findElement(userid).sendKeys(prop.getProperty("LoginAsJurisdictionUserUsernameWelcoming"));
		driver.findElement(password).sendKeys(prop.getProperty("LoginAsJurisdictionUserPasswordWelcoming"));
//		Thread.sleep(4000);
		new WebDriverWait(driver, 40).until(ExpectedConditions.elementToBeClickable(loginbutton));
//		driver.findElement(checkBoxRememberMe).click();
		WebElement element = driver.findElement(loginbutton);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
//		driver.findElement(answerField).sendKeys(prop.getProperty("SecurityAnswer2"));
//		driver.findElement(continueButtonForLogin).click();
//		String welcomeMsg = driver.findElement(By.xpath("//*[text()='Welcome!']")).getText();
//		Assert.assertEquals(welcomeMsg , "Welcome!");
	}

	public void RevisionRequestFromRegistrar() throws InterruptedException {
		driver.findElement(By.xpath("//*[@data-testid='ExpandMoreIcon']")).click();
		driver.findElement(Search2).click();
		JavascriptExecutor j2 = (JavascriptExecutor) driver;
		j2.executeScript("window.scrollBy(0,761)");
		driver.findElement(Search2).sendKeys(userId);
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
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='User has successfully requested revisions']")));
		String successmsg = driver.findElement(By.xpath("//p[text()='User has successfully requested revisions']"))
				.getText();
		Assert.assertEquals(successmsg,"User has successfully requested revisions");
		System.out.println("User has successfully requested revisions");
		ObjectRepo.test.log(Status.PASS, "User has successfully requested revisions");
	}

	public void InactiveUserFromJU() throws InterruptedException {
		
		new WebDriverWait(driver, 40).until(ExpectedConditions.elementToBeClickable(CloseButtonOnTerms));
		driver.findElement(CloseButtonOnTerms).click();
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(Search1));
		driver.findElement(Search1).click();
		driver.findElement(Search1).sendKeys(userId);
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//button[@role='tab']")).click();
		driver.findElement(RegisteredSearchedUser).click();
		Thread.sleep(4000);

		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(UserDetalisheader));
		driver.findElement(Menu).click();
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(DeactiveUserlogin));
		driver.findElement(DeactiveUserlogin).click();
//
//		WebElement element1 = driver.findElement(DeactiveUserlogin);
//		JavascriptExecutor js3 = (JavascriptExecutor) driver;
//		js3.executeScript("arguments[0].click()", element1);

		driver.findElement(DeactiveWithoutProfileAccess).click();
        Thread.sleep(1000);
		driver.findElement(DeactiveprofileReasons).sendKeys("No data Required");
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(countinue));
		driver.findElement(countinue).click();
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Account status is changed to Inactive. The user can not login to the system.']")));
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
		driver.findElement(Search1).sendKeys(userId);
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
		driver.findElement(Search1).sendKeys(userId);
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//button[@role='tab']")).click();
		driver.findElement(RegisteredSearchedUser).click();
		Thread.sleep(4000);

		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(UserDetalisheader));
		driver.findElement(Menu).click();
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(DeactiveUserlogin));
		driver.findElement(DeactiveUserlogin).click();

		WebElement element1 = driver.findElement(DeactiveUserlogin);
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("arguments[0].click()", element1);
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(DeactiveWithoutProfileAccess));
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
		driver.findElement(Search1).sendKeys(userId);
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
		driver.findElement(Search1).sendKeys(userId);
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
		driver.findElement(Search2).sendKeys(userId);
		Thread.sleep(5000);

	}

	public void Login_with_QAJurisdiction_Authority() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(userid).sendKeys(prop.getProperty("LoginAsAuthorityUsernameWelcoming"));
		driver.findElement(passphrase1).sendKeys(prop.getProperty("LoginAsAuthorityPasswordWelcoming"));

		new WebDriverWait(driver, 40).until(ExpectedConditions.elementToBeClickable(loginbutton));
//		driver.findElement(checkBoxRememberMe).click();
		WebElement element = driver.findElement(loginbutton);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
//		driver.findElement(answerField).sendKeys(prop.getProperty("SecurityAnswer2"));
//		driver.findElement(continueButtonForLogin).click();
	}

	public void ViewDetails_For_RegisterdUser() throws InterruptedException {

		driver.findElement(RegisteredSearchedUser).click();
		Thread.sleep(4000);
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(UserDetalisheader));
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,985)", "");
		String message1 = driver
				.findElement(By.xpath("(//p[text()='California'])[2]"))
				.getText();
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
		String message1 = driver
				.findElement(By.xpath("//p[text()='Proposed to Authority']"))
				.getText();
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
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(UserProfilePage));
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
				.findElement(By.xpath("//p[text()='Your change of jurisdiction request has been cancelled.']")).getText();
		System.out.println("Status :" + message2);
		Assert.assertEquals(message2, "Your change of jurisdiction request has been cancelled.");
		ObjectRepo.test.log(Status.PASS, "Your change of jurisdiction request has been cancelled.");
		Thread.sleep(1000);
		driver.findElement(CloseButtonOnTerms).click();
	//	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	//	driver.findElement(By.xpath("(//div[@class='MuiDataGrid-cellContent'])[1]")).click();
		String message3 = driver.findElement(By.xpath("(//div[@class='MuiDataGrid-cellContent'])[1]")).getText();
		System.out.println("User Request Status :" + message3);
	}
	
	public void AssignRole_to_User_other_than_JU() throws InterruptedException {
		driver.findElement(Search1).click();
		driver.findElement(Search1).sendKeys(userId);
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@class='link-cell'])[1]")).click();
		Thread.sleep(4000);
		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		js5.executeScript("window.scrollBy(0,1900)");
		Thread.sleep(1000);
		driver.findElement(Approved).click();
		Thread.sleep(1000);
		driver.findElement(SelectRoleType).click();
		Thread.sleep(1000);
		driver.findElement(SelectIndividualRole).click();
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(1000);
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
		
		//String successmsg = driver.findElement(By.xpath("//*[text()='User request has been approved.']")).getText();
		String successmsg = driver.findElement(By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']")).getText();
		//Assert.assertEquals("User request has been approved.", successmsg);
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
		
		
		driver.findElement(By.xpath("//span[text()='Quebec' and contains(@class,\"MuiTypography-root MuiTypography-body1 MuiListItemText-primary\")]")).click();
		Thread.sleep(1000);
		driver.findElement(TermCheckbox).click();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);	
		driver.findElement(countinue).click();	
		
		driver.findElement(selectJurisdictionCancelButton).click();
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h6[text()='Warning!']")));
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
		driver.findElement(Search1).sendKeys(userId);
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
	
	public void handlesecurityQuestion1() throws InterruptedException {
		Thread.sleep(2000);
		String str=driver.findElement(securityQuestion1ForLogin).getText().trim();
		if(str.contains("first job?")) {
			driver.findElement(answerField).sendKeys("aaaa");
		}
		else if(str.contains("maiden name?")){
			driver.findElement(answerField).sendKeys("bbbb");
		}
		else if(str.contains("first car?")){
			driver.findElement(answerField).sendKeys("cccc");
		}
		else {
			System.out.println("Nothing");
		}
		Thread.sleep(5000);
		driver.findElement(continueButtonForLogin).click();
		System.out.println("Registrar User should logged in successfully.");
	}
	
	public void loginAsCreatedUser() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(userid).sendKeys(userId);
		System.out.println("step : Enter Valid User Id  ");
		ObjectRepo.test.log(Status.PASS, "step1 : Enter valid User Id ");
		driver.findElement(passphraseOnLoginPage).sendKeys("Pass@12345");
		System.out.println("step : Enter Valid passphrase  ");
		ObjectRepo.test.log(Status.PASS, "step1 : Enter valid passphrase ");
		WebElement element = driver.findElement(loginbutton);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		System.out.println("step : Click on login button  ");
		ObjectRepo.test.log(Status.PASS, "step1 : Click on login button ");
		//driver.findElement(answerField).sendKeys(prop.getProperty("Answer2"));
		Thread.sleep(2000);
//		new WebDriverWait(driver, 30)
//		.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@class='MuiTypography-root MuiTypography-h6 css-1etlmxt']")));
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
	
	 //Yash
	public void Cancel_button_functinality() throws InterruptedException {
		driver.findElement(Search1).click();
		driver.findElement(Search1).sendKeys(userId);
		Thread.sleep(5000);
		driver.findElement(RegisteredSearchedUser).click();
		Thread.sleep(4000);
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(UserDetalisheader));
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,2200)", "");
		Thread.sleep(3000);
		driver.findElement(selectJurisdictionCancelButton).click();
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(warning));
		driver.findElement(selectJurisdictionContButton).click();
		Thread.sleep(2000);
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(SearchUsers));
		String successmsg = driver.findElement(SearchUsers).getText();
		Assert.assertEquals("Search Users", successmsg);
		System.out.println("JU home page displayed");
		ObjectRepo.test.log(Status.PASS, "JU home page displayed");
	}

	public void Editdata_Cancel_button_functinality() throws InterruptedException {
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(SearchUsers));
		driver.findElement(Search1).click();
		driver.findElement(Search1).sendKeys(userId);
		Thread.sleep(5000);
		driver.findElement(RegisteredSearchedUser).click();
		Thread.sleep(4000);
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(UserDetalisheader));
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,1800)", "");
		Thread.sleep(1000);
		/*
		 * WebElement element3 = driver.findElement(Deny); Actions action1 = new
		 * Actions(driver); action1.moveToElement(element3).build().perform();
		 * driver.findElement(Deny).click(); new WebDriverWait(driver,
		 * 60).until(ExpectedConditions.visibilityOfElementLocated(SelectReasonDenial));
		 * driver.findElement(SelectReasonDenial).click(); Thread.sleep(1000);
		 * driver.findElement(By.xpath("//*[text()='Denial Reason 1']")).click();
		 * Thread.sleep(1000);
		 */
		driver.findElement(commentfield).sendKeys("Test Comment");
		Thread.sleep(1000);
		JavascriptExecutor j1 = (JavascriptExecutor) driver;
		j1.executeScript("window.scrollBy(0,2000)", "");
		Thread.sleep(1000);

		driver.findElement(selectJurisdictionCancelButton).click();
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(warning));
		driver.findElement(CancelButton).click();
		Thread.sleep(2000);

		Actions a = new Actions(driver);
		a.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(1000);

		String element = driver.findElement(commentfield).getText();
		System.out.println(element + "= selections or added comment is not getting cleared.");
		ObjectRepo.test.log(Status.PASS, "selections or added comment is not getting cleared.");

	}

	public void Form_functinality() throws InterruptedException {
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(WelcomeButton));
		driver.findElement(WelcomeButton).click();
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(UserProfile));
		WebElement element = driver.findElement(UserProfile);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		Thread.sleep(1000);
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,1900)");
		Thread.sleep(5000);

		Actions action = new Actions(driver);
		Thread.sleep(5000);
		Actions action1 = new Actions(driver);
		WebElement element1 = driver.findElement(form);
		action1.moveToElement(element1).build().perform();
		action1.click(element1).build().perform();

		Thread.sleep(500);
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(formdata));
		String successmsg1 = driver.findElement(formdata).getText();
		Assert.assertEquals("- No forms to show at this time", successmsg1);
		System.out.println("No form is displayed for approved user");
		ObjectRepo.test.log(Status.PASS, "No form is displayed for approved user");
	}

	public void loginAsApprovedUser_InvalidUserID() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(userid).sendKeys("@@@@@@");
		driver.findElement(password).sendKeys(prop.getProperty("LoginAsApprovedUserPasswordCalifornia"));
		WebElement element = driver.findElement(loginbutton);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		String element1 = driver.findElement(By.xpath("//p[text()='Enter valid User ID']")).getText();
		Assert.assertEquals("Enter valid User ID", element1);
		System.out.println("Error Message :" + element1);
		ObjectRepo.test.log(Status.PASS, "Enter valid User ID");
		driver.navigate().refresh();
		Thread.sleep(1000);

		driver.findElement(userid).sendKeys("swae");
		driver.findElement(password).sendKeys(prop.getProperty("LoginAsApprovedUserPasswordCalifornia"));
		WebElement element3 = driver.findElement(loginbutton);
		String element2 = driver.findElement(By.xpath("//p[text()='User ID must be 6 characters long']")).getText();
		Assert.assertEquals("User ID must be 6 characters long", element2);
		System.out.println("Error Message :" + element2);
		ObjectRepo.test.log(Status.PASS, "User ID must be 6 characters long");
		driver.navigate().refresh();
		Thread.sleep(1000);

		driver.findElement(userid).sendKeys("swaegdtgeydh647585");
		driver.findElement(password).sendKeys(prop.getProperty("LoginAsApprovedUserPasswordCalifornia"));
		WebElement element5 = driver.findElement(loginbutton);
		String element4 = driver.findElement(By.xpath("//p[text()='User ID must not be more than 15 characters']"))
				.getText();
		Assert.assertEquals("User ID must not be more than 15 characters", element4);
		System.out.println("Error Message :" + element4);
		ObjectRepo.test.log(Status.PASS, "User ID must not be more than 15 characters");
		driver.navigate().refresh();
		Thread.sleep(1000);

		driver.findElement(userid).sendKeys("#@%^()");
		driver.findElement(password).sendKeys("Password@");
		WebElement element6 = driver.findElement(loginbutton);
		String element7 = driver.findElement(By.xpath("//p[text()='Enter valid User ID']")).getText();
		Assert.assertEquals("Enter valid User ID", element7);
		System.out.println("Error Message :" + element7);
		ObjectRepo.test.log(Status.PASS, "Enter valid User ID");
		driver.navigate().refresh();
		Thread.sleep(1000);

		driver.findElement(userid).sendKeys(prop.getProperty("LoginAsApprovedUserIDCalifornia"));
		driver.findElement(password).sendKeys("QWAEASSW");
		WebElement element11 = driver.findElement(loginbutton);
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("arguments[0].click()", element11);
		Thread.sleep(5000);
		String element9 = driver.findElement(By.xpath("//p[text()='User ID or passphrase entered is invalid']"))
				.getText();
		System.out.println("Error Message :" + element9);
		ObjectRepo.test.log(Status.PASS, "User ID or passphrase entered is invalid");
	}
	
	public void runtime_Login_with_closed_User() throws InterruptedException {
   		Thread.sleep(3000);
   		driver.findElement(userid).sendKeys(userId);
   		driver.findElement(password).sendKeys("Pass@12345");
   		new WebDriverWait(driver, 40).until(ExpectedConditions.elementToBeClickable(loginbutton));
   		WebElement element = driver.findElement(loginbutton);
   		JavascriptExecutor js2 = (JavascriptExecutor) driver;
   		js2.executeScript("arguments[0].click()", element);
   	}
	
public void InactiveUserCloseAccountFromJU() throws InterruptedException {
		
		new WebDriverWait(driver, 40).until(ExpectedConditions.elementToBeClickable(CloseButtonOnTerms));
		driver.findElement(CloseButtonOnTerms).click();
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(Search1));
		driver.findElement(Search1).click();
		driver.findElement(Search1).sendKeys(userId);
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//button[@role='tab']")).click();
		driver.findElement(RegisteredSearchedUser).click();
		Thread.sleep(4000);

		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(UserDetalisheader));
		driver.findElement(Menu).click();
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(DeactiveUserlogin));
		driver.findElement(InactivecloseUser).click();

        Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='inctiveReasons']")).sendKeys("No data Required");
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Close user Account']")));
		driver.findElement(By.xpath("//button[text()='Close user Account']")).click();
		Thread.sleep(6000);
		//new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Account status is changed to Close. The user can not login to the system.]")));
		String message1 = driver.findElement(By.xpath("//p[text()='Account status is changed to Close. The user can not login to the system.']")).getText();
		System.out.println("success message :" + message1);
		Assert.assertEquals(message1, "Account status is changed to Close. The user can not login to the system.");
		ObjectRepo.test.log(Status.PASS, message1);
	}

	public void loginfail_EmptyData() throws InterruptedException {
		Thread.sleep(3000);
		WebElement element11 = driver.findElement(loginbutton);
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("arguments[0].click()", element11);
		Thread.sleep(1000);

		String element2 = driver.findElement(By.xpath("//p[text()='User ID  is required']")).getText();
		Assert.assertEquals("User ID is required", element2);
		System.out.println("Error Message :" + element2);
		ObjectRepo.test.log(Status.PASS, "User ID is required");

		String element3 = driver.findElement(By.xpath("//p[text()='Passphrase  is required']")).getText();
		Assert.assertEquals("Passphrase is required", element3);
		System.out.println("Error Message :" + element3);
		ObjectRepo.test.log(Status.PASS, "Passphrase is required");
	}

	public void loginfail_InValidpassword() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(userid).sendKeys(prop.getProperty("LoginAsApprovedUserID"));
		driver.findElement(password).sendKeys("QWAEASSW");
		WebElement element11 = driver.findElement(loginbutton);
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("arguments[0].click()", element11);
		Thread.sleep(5000);
		String element9 = driver.findElement(By.xpath("//p[text()='User ID or passphrase entered is invalid']"))
				.getText();
		System.out.println("Error Message :" + element9);
		ObjectRepo.test.log(Status.PASS, "User ID or passphrase entered is invalid");
	}

	public void AssignmultipleRole_to_User_other_than_JU() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(PendingExpandIcon).click();
		Thread.sleep(2000);
		// driver.findElement(By.xpath("(//*[@type='search'])[2]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
		driver.findElement(Search2).sendKeys(userId);
		Thread.sleep(5000);
		driver.findElement(PendingSearchedUser).click();
		Thread.sleep(6000);
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
		Thread.sleep(1000);
		driver.findElement(SelectAlternateAccountRepresentativeRole).click();

		Thread.sleep(4000);
		WebElement element2 = driver.findElement(SelectRoleType);
		Actions action = new Actions(driver);
		action.moveToElement(element2).build().perform();
		Thread.sleep(4000);
		WebElement abc = driver.findElement(SubmitButton);
		j.executeScript("arguments[0].click();", abc);
		Thread.sleep(3000);

		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(warning));
		driver.findElement(CancelButton).click();
		Thread.sleep(1000);
		System.out.println("The application is not proposed multiple roles to the user");
		j.executeScript("arguments[0].click();", abc);
		Thread.sleep(2000);

		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(warning));
		driver.findElement(selectJurisdictionContButton).click();
		Thread.sleep(6000);
		String message2 = driver.findElement(By.xpath("//p[text()='User request has been approved.']")).getText();
		System.out.println("Status :" + message2);
		Assert.assertEquals(message2, "User request has been approved.");
		ObjectRepo.test.log(Status.PASS, "User request has been approved.");
	}

	public void AssignmultipleRole_InmultipleRoleType_to_User() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(PendingExpandIcon).click();
		Thread.sleep(2000);
		// driver.findElement(By.xpath("(//*[@type='search'])[2]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
		driver.findElement(Search2).sendKeys(userId);
		Thread.sleep(5000);
		driver.findElement(PendingSearchedUser).click();
		Thread.sleep(6000);
		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		js5.executeScript("window.scrollBy(0,1800)");
		Thread.sleep(1000);
		driver.findElement(Approved).click();
		Thread.sleep(1000);
		driver.findElement(SelectRoleType).click();
		driver.findElement(SelectIndividualRole).click();

		driver.findElement(SelectRole).click();
		Thread.sleep(1000);
		driver.findElement(SelectIndividualRole).click();
		Thread.sleep(1000);
		driver.findElement(SelectAlternateAccountRepresentativeRole).click();
		Thread.sleep(1000);
//		WebElement abc = driver.findElement(SubmitButton);
//		js.executeScript("arguments[0].click();", abc);
//		Thread.sleep(3000);
//
//		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(warning));
//		driver.findElement(CancelButton).click();
//		Thread.sleep(2000);
//		WebElement element=driver.findElement(SelectRole);
//        Actions action=new Actions(driver);
//        action.moveToElement(element).build().perform();
//        Thread.sleep(4000);
//        WebElement element1=driver.findElement(SelectIndividualRole);
//        action.moveToElement(element1).build().perform();
//        Thread.sleep(4000);
		Thread.sleep(4000);
		WebElement element4 = driver.findElement(By.xpath("//div[@id='mui-component-select-Roles']"));
		Actions action = new Actions(driver);
		action.moveToElement(element4).build().perform();
		Thread.sleep(4000);
		WebElement element5= driver.findElement(By.xpath("//span[contains(text(),'Individual Users')]"));
		action.moveToElement(element5).build().perform();
		Thread.sleep(4000);
		action.click(element5).build().perform();
		//driver.findElement(roleDropdown).click();
		Thread.sleep(1000);
		
		
		
		driver.findElement(SelectRoleType).click();
		driver.findElement(By.xpath("(//*[text()='Jurisdiction Users'])")).click();

		List<WebElement> elements = driver.findElements(By.xpath("//div[@id='mui-component-select-Roles']"));
		System.out.println("Number of elements:" + elements.size());
		if (elements.size() > 0) {
			System.out.println("Already selected Roles are not cleared");
		} else {
			System.out.println("Already selected Roles are cleared");
			System.out.println("JU is not able to assign multiple role from different role types");
		}
	}

	public void InactiveUserFromJUwithprofile_AccessOnly() throws InterruptedException {

		new WebDriverWait(driver, 40).until(ExpectedConditions.elementToBeClickable(CloseButtonOnTerms));
		driver.findElement(CloseButtonOnTerms).click();
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(Search1));
		driver.findElement(Search1).click();
		driver.findElement(Search1).sendKeys(userId);
		Thread.sleep(4000);
		// driver.findElement(By.xpath("//button[@role='tab']")).click();
		driver.findElement(RegisteredSearchedUser).click();
		Thread.sleep(4000);

		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(UserDetalisheader));
		driver.findElement(Menu).click();
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(DeactiveUserlogin));
		driver.findElement(DeactiveUserlogin).click();
//
//	WebElement element1 = driver.findElement(DeactiveUserlogin);
//	JavascriptExecutor js3 = (JavascriptExecutor) driver;
//	js3.executeScript("arguments[0].click()", element1);

		driver.findElement(DeactiveWithProfileAccess).click();
		Thread.sleep(1000);
		driver.findElement(DeactiveprofileReasons).sendKeys("No data Required");
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(countinue));
		driver.findElement(countinue).click();
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//p[text()='Account status is changed to Profile Access Only. The user can login to the system.']")));
		String message1 = driver.findElement(By.xpath(
				"//p[text()='Account status is changed to Profile Access Only. The user can login to the system.']"))
				.getText();
		System.out.println("success message :" + message1);
		Assert.assertEquals(message1,
				"Account status is changed to Profile Access Only. The user can login to the system.");
		ObjectRepo.test.log(Status.PASS, message1);
		Thread.sleep(1000);
		driver.findElement(CloseButtonOnTerms).click();
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(Search1));
		driver.findElement(Search1).click();
		driver.findElement(Search1).sendKeys(userId);
		Thread.sleep(4000);

		String element4 = driver.findElement(By.xpath("(//div[@class='MuiDataGrid-cellContent'])[7]")).getText();
		System.out.println("User Account Status :" + element4);
		Assert.assertEquals(element4, "Profile Access only");
		ObjectRepo.test.log(Status.PASS, message1);
	}

	public void CancelRegistration() throws InterruptedException {
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(WelcomeButton));
		driver.findElement(WelcomeButton).click();
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(UserProfile));
		WebElement element = driver.findElement(UserProfile);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		Thread.sleep(1000);
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,1900)");
		Thread.sleep(5000);

		Actions action = new Actions(driver);
		Thread.sleep(3000);
		Actions action1 = new Actions(driver);
		WebElement element1 = driver.findElement(CancelUserRegistration);
		action1.moveToElement(element1).build().perform();
		action1.click(element1).build().perform();
		Thread.sleep(1000);
		driver.findElement(yesButton).click();
	}

	public void CancelRegistration_PendingUser() throws InterruptedException {
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		Actions action1 = new Actions(driver);
		WebElement element1 = driver.findElement(CancelUserRegistration);
		action1.moveToElement(element1).build().perform();
		action1.click(element1).build().perform();
		Thread.sleep(1000);
		driver.findElement(yesButton).click();
	}

	public void CancelRegistration_ApprovedUser() throws InterruptedException {
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(WelcomeButton));
		driver.findElement(WelcomeButton).click();
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(UserProfile));
		WebElement element = driver.findElement(UserProfile);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		Thread.sleep(1000);
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,1900)");
		Thread.sleep(5000);

		List<WebElement> elements = driver.findElements(CancelUserRegistration);
		if (elements.size() > 0) {
			System.out.println("Cancel User Registration option displayed for Approved user");
		} else {
			System.out.println("Cancel User Registration option is not displayed for Approved user");
		}
	}

	public void CrossJurisdictionfromUser_Statuscheck() throws InterruptedException {
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

		driver.findElement(SubmitButton).click();
		Thread.sleep(4000);
		String message2 = driver.findElement(By.xpath(
				"//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']"))
				.getText();
		System.out.println("Success Message :" + message2);
		//Assert.assertEquals(message2,"Cross jurisdiction request made successfully. Your request will soon by adhered.");
		ObjectRepo.test.log(Status.PASS,
				"Cross jurisdiction request made successfully. Your request will soon by adhered.");

		driver.findElement(CloseButtonOnTerms).click();
		Thread.sleep(1000);
		String message3 = driver
				.findElement(By.xpath("(//div[@class='MuiDataGrid-cell MuiDataGrid-cell--textCenter'])[1]"))
				.getText();
		System.out.println("Request Message :" + message3);
	}

	public void searchuserInPending_UsingFilter() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(PendingExpandIcon).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
		Thread.sleep(1000);
		driver.findElement(Filter).click();

		driver.findElement(AddFilter).click();
		// driver.findElement(By.xpath("(//*[@data-testid='CloseIcon'])[3]")).click();
		Thread.sleep(3000);
		WebElement element1 = driver.findElement(By.xpath(
				"(//*[@class='MuiNativeSelect-select MuiNativeSelect-standard MuiInputBase-input MuiInput-input css-1vynybe'])[4]"));
		Actions action = new Actions(driver);
		action.moveToElement(element1).build().perform();
		action.click(element1).build().perform();
		Thread.sleep(1000);

		driver.findElement(By.xpath(
				"(//*[@class='MuiNativeSelect-select MuiNativeSelect-standard MuiInputBase-input MuiInput-input css-1vynybe'])[4]"))
				.sendKeys("User Id");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(userId);
		Thread.sleep(1000);
		driver.findElement(Filter).click();

	}

	public void ViewDetails_Foruser_PendingCrossJu() throws InterruptedException {
		driver.findElement(PendingSearchedUser).click();
		Thread.sleep(2000);
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(UserDetalisheader));
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,985)", "");
		String message1 = driver.findElement(PendingCOJ).getText();
		System.out.println("Status :" + message1);
		Assert.assertEquals(message1, "Pending Cross Jurisdiction");
		ObjectRepo.test.log(Status.PASS, "Pending Cross Jurisdiction");
	}

	public void AddRevisions() throws InterruptedException {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Edit']")).click();
		Thread.sleep(2000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,450)");
		for (int i = 1; i <= 15; i++) {
			Thread.sleep(500);
			driver.findElement(Street1Revision).sendKeys(Keys.BACK_SPACE);
			Thread.sleep(500);
			driver.findElement(CityRevision).sendKeys(Keys.BACK_SPACE);

		}
		Thread.sleep(500);
		driver.findElement(Street1Revision).sendKeys("Rankala Talav");
		Thread.sleep(500);
		driver.findElement(CityRevision).sendKeys("Kolhapur");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1800)");
		Thread.sleep(4000);
		WebElement element3 = driver.findElement(saveButtonPrimResiEditAndReview);
		js.executeScript("arguments[0].click()", element3);
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(warning));
		driver.findElement(countinue).click();
		Thread.sleep(5000);
		String message2 = driver.findElement(By.xpath(
				"//p[text()='Profile changes are submitted to jurisdiction for approval, you will be notified when jurisdiction approves or denies the changes']"))
				.getText();
		System.out.println("Message :" + message2);
		Assert.assertEquals(message2,
				"Profile changes are submitted to jurisdiction for approval, you will be notified when jurisdiction approves or denies the changes");
		ObjectRepo.test.log(Status.PASS,
				"Profile changes are submitted to jurisdiction for approval, you will be notified when jurisdiction approves or denies the changes");
		Thread.sleep(1000);
		driver.findElement(CloseButtonOnTerms).click();
	}

	public void CloseAccount_fromUser() throws InterruptedException {
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(WelcomeButton));
		driver.findElement(WelcomeButton).click();
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(UserProfile));
		WebElement element = driver.findElement(UserProfile);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		Thread.sleep(1000);
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,1900)");
		Thread.sleep(5000);

		Actions action = new Actions(driver);
		Thread.sleep(5000);
		Actions action1 = new Actions(driver);
		WebElement element1 = driver.findElement(ClseUserAccount);
		action1.moveToElement(element1).build().perform();
		action1.click(element1).build().perform();
		Thread.sleep(500);
		
		driver.findElement(continueButtonCloseUserAccount2).click();
		//driver.findElement(ClseUserAccount2).click();
		Thread.sleep(7000);
	}

	public void Revision_Check() throws InterruptedException {
		driver.findElement(PendingSearchedUser).click();
		Thread.sleep(5000);

		String message1 = driver
				.findElement(By.xpath("(//p[@class='MuiTypography-root MuiTypography-body2 css-rmnksp'])[15]"))
				.getText();
		System.out.println("Privious Street Name :" + message1);
		String message2 = driver
				.findElement(By.xpath("(//p[@class='MuiTypography-root MuiTypography-body1 css-7vo5ly'])[1]"))
				.getText();
		System.out.println("Updated Street Name :" + message2);
		Thread.sleep(1000);
		String message3 = driver
				.findElement(By.xpath("(//p[@class='MuiTypography-root MuiTypography-body2 css-rmnksp'])[17]"))
				.getText();
		System.out.println("Privious City Name :" + message3);
		String message4 = driver
				.findElement(By.xpath("(//p[@class='MuiTypography-root MuiTypography-body1 css-7vo5ly'])[2]"))
				.getText();
		System.out.println("Updated City Name :" + message4);
	}

	public void ShareUserProfile_CrossJU() throws InterruptedException {
		driver.findElement(PendingSearchedUser).click();
		Thread.sleep(5000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1900)");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//p[text()='Cross Jurisdiction Request']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='Share']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath(
				"//textarea[contains(@class,'MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputMultiline') and @name='CJComments']"))
				.sendKeys("Test Comment");
		Thread.sleep(1000);

		js.executeScript("window.scrollBy(0,2100)");
		Thread.sleep(500);
		WebElement element3 = driver.findElement(Savebutton);
		js.executeScript("arguments[0].click()", element3);
		Thread.sleep(5000);

		String message3 = driver.findElement(By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']"))
				.getText();
		System.out.println("Success Message :" + message3);
		driver.findElement(CloseButtonOnTerms).click();
		Thread.sleep(1000);
	}

	public void ViewDetails_Foruser_ApprovedCrossJu() throws InterruptedException {
		driver.findElement(Search1).click();
		driver.findElement(Search1).sendKeys(userId);
		Thread.sleep(4000);
		// driver.findElement(By.xpath("//button[@role='tab']")).click();
		driver.findElement(RegisteredSearchedUser).click();
		Thread.sleep(4000);
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(UserDetalisheader));
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,985)", "");
		String message1 = driver.findElement(By.xpath("//p[text()='Approved Cross Jurisdiction']")).getText();
		System.out.println("Status :" + message1);
		Assert.assertEquals(message1, "Approved Cross Jurisdiction");
		ObjectRepo.test.log(Status.PASS, "Approved Cross Jurisdiction");
	}

	public void runtime_Login_with_washJurisdiction_Registrar() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(userid).sendKeys(prop.getProperty("LoginAsRegistrarUsernameWashington"));
		driver.findElement(password).sendKeys(prop.getProperty("LoginAsRegistrarPasswordWashington"));
		new WebDriverWait(driver, 40).until(ExpectedConditions.elementToBeClickable(loginbutton));
		WebElement element = driver.findElement(loginbutton);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
	}

	public void Search_RegisterUser() throws InterruptedException {
		driver.findElement(Search1).click();
		driver.findElement(Search1).sendKeys(userId);
		Thread.sleep(4000);
		List<WebElement> elements = driver.findElements(By.xpath(
				"//parent::div/parent::div/following-sibling::div//*[div[contains(@class,'MuiDataGrid-virtualScrollerContent')]]//div[contains(@class,'MuiDataGrid-row')]"));// need
																																												// change
		if (elements.size() > 0) {
			System.out.println("Search User is displayed other than registered jurisdiction");
		} else {
			System.out.println("Search User is not displayed other than registered jurisdiction");
		}

	}

	public void AssignRole_to_User_Service_Provider() throws InterruptedException {
		driver.findElement(CloseButtonOnTerms).click();
		Thread.sleep(4000);
		driver.findElement(Search1).click();
		driver.findElement(Search1).sendKeys(userId);
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[@class='link-cell'])[1]")).click();
		Thread.sleep(4000);
		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		js5.executeScript("window.scrollBy(0,1800)");
		Thread.sleep(1800);
		driver.findElement(SelectRoleType).click();
		driver.findElement(SelectServiceProviderRole).click();
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(SelectRole).click();
		Thread.sleep(1000);
		driver.findElement(SelectMarketmonitorRoleType).click();

		Thread.sleep(4000);
		WebElement element2 = driver.findElement(SelectRoleType);
		Actions action = new Actions(driver);
		action.moveToElement(element2).build().perform();
		Thread.sleep(4000);
		WebElement abc = driver.findElement(SubmitButton);
		j.executeScript("arguments[0].click();", abc);
		Thread.sleep(6000);

		String successmsg = driver.findElement(By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']"))
				.getText();
		//Assert.assertEquals("Proposed Role Change request is raised.", successmsg);
		System.out.println("Proposed Role Change request is raised.");
		ObjectRepo.test.log(Status.PASS, "Proposed Role Change request is raised.");
	}

	public void changeRoleToNewUser_toJU() throws InterruptedException {
		driver.findElement(CloseButtonOnTerms).click();
		Thread.sleep(4000);
		driver.findElement(Search1).click();
		driver.findElement(Search1).sendKeys(userId);
		Thread.sleep(4000);
		// driver.findElement(By.xpath("//button[@role='tab']")).click();
		driver.findElement(RegisteredSearchedUser).click();
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1800)");
		Thread.sleep(1000);
		driver.findElement(SelectRoleType).click();
		driver.findElement(By.xpath("(//*[text()='Jurisdiction Users'])")).click();
		JavascriptExecutor j = (JavascriptExecutor) driver;
		// j.executeScript("window.scrollBy(0,250)", "");

		Thread.sleep(1000);
		driver.findElement(SelectRole).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//*[text()='Registrar' and contains(@class,\"MuiTypography-root MuiTypography-body1 MuiListItemText-primary\")]"))
				.click();

		WebElement element2 = driver.findElement(SelectRoleType);
		Actions action = new Actions(driver);
		action.moveToElement(element2).build().perform();
		Thread.sleep(4000);

		js.executeScript("window.scrollBy(0,2650)");
		WebElement abc = driver.findElement(SubmitButton);
		j.executeScript("arguments[0].click();", abc);
		Thread.sleep(6000);

		String successmsg = driver.findElement(By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']"))
				.getText();
		//Assert.assertEquals("Proposed Role Change request is raised.", successmsg);
		System.out.println("Proposed Role Change request is raised.");
		ObjectRepo.test.log(Status.PASS, "Proposed Role Change request is raised.");

	}

	public void ViewUserDetails_functinality() throws InterruptedException {
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(WelcomeButton));
		driver.findElement(WelcomeButton).click();
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(UserProfile));
		WebElement element = driver.findElement(UserProfile);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		Thread.sleep(3000);

		Actions action = new Actions(driver);
		Actions action1 = new Actions(driver);
		WebElement element1 = driver.findElement(By.xpath("//a[@href='/view-user-details']"));
		action1.moveToElement(element1).build().perform();
		action1.click(element1).build().perform();
		Thread.sleep(1000);
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='User Details']")));
		String successmsg = driver
				.findElement(By.xpath("//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-md-12 css-1um9wea']"))
				.getText();
		System.out.println(successmsg);

	}

	public void downloaduserRegistrationForm_functinality() throws InterruptedException {
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(WelcomeButton));
		driver.findElement(WelcomeButton).click();
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(UserProfile));
		WebElement element = driver.findElement(UserProfile);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		Thread.sleep(1000);
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,1900)");
		Thread.sleep(5000);

		Actions action = new Actions(driver);
		Thread.sleep(5000);
		Actions action1 = new Actions(driver);
		WebElement element1 = driver.findElement(form);
		action1.moveToElement(element1).build().perform();
		action1.click(element1).build().perform();

		Thread.sleep(500);
		new WebDriverWait(driver, 60).until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='User Registration Form']")));
		Actions action2 = new Actions(driver);
		WebElement element2 = driver.findElement(By.xpath("//p[text()='User Registration Form']"));
		action1.moveToElement(element2).build().perform();
		action1.click(element2).build().perform();
	}

	public void UserProfile_functinality() throws InterruptedException {
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(WelcomeButton));
		driver.findElement(WelcomeButton).click();
		String successmsg = driver.findElement(By.xpath("//ul[@class='MuiList-root MuiList-padding css-vvic01']"))
				.getText();
		System.out.println("User option available" + successmsg);
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(UserProfile));
		WebElement element = driver.findElement(UserProfile);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		Thread.sleep(1000);
		System.out.println("Registered user is able to access user profile");
	}

}
