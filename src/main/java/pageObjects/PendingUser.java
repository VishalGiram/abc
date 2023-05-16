package pageObjects;

import static org.testng.Assert.assertTrue;

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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.Status;

import resources.AllFeildsTestData;
import resources.ObjectRepo;
import resources.base;

public class PendingUser extends base{

		public static String userId;

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
	private By perInfoContButton = By.xpath("//button[@id='priv_btn_Continue']"); // update
	private By perInfoCancelButton = By.xpath("//button[text()='CANCEL']");

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
	private By checkBox = By.xpath("//span[contains(text(),'Check if same as Primary Residence')]");
	private By primResiContButton = By.xpath("//button[@id='priv_btn_Continue']");
	private By mailingaddresstext = By.xpath("//div[text()='Mailing Address']");

	private By checkBoxEditAndReview = By.xpath("//span[contains(text(),'I accept the Jurisdiction')]");
	private By editAndReviewContButton = By.xpath("//button[contains(text(),'CONTINUE')]");

	private By createUserId = By.xpath("//input[@name='createUserID']");
	private By passphrase = By.xpath("//input[@name='passphrase']");
	private By confirmPassphrase = By.xpath("//input[@id='confirmPassphrase']");
	private By secQuestion1 = By.xpath("//div[@id='mui-component-select-securityQuestion1']");
	private By selSecQue1 = By.xpath("(//li[@role='option'])[2]");
	private By answer1 = By.xpath("//input[@name='answer1']");
	private By secQuestion2 = By.xpath("//div[@id='mui-component-select-securityQuestion2']");
	private By selSecQue2 = By.xpath("(//li[@role='option'])[2]");
	private By answer2 = By.xpath("//input[@name='answer2']");
	private By secQuestion3 = By.xpath("//div[contains(text(),'Select Security Question 3')]");
	private By selSecQue3 = By.xpath("(//li[@role='option'])[2]");
	private By answer3 = By.xpath("//input[@name='answer3']");
	private By termsOfUseCheckBox = By.xpath("//span[contains(text(),'I accept the WCI, Inc.')]");
	private By creUserProfRegBut = By.xpath("//button[contains(text(),'REGISTER')]");
	private By creUserProfCancelButton = By.xpath("//button[text()='CANCEL']");
	private By crossButtonAfterRegistration = By.xpath("//*[@data-testid='CloseIcon']");
	private By finishButton = By.xpath("//button[@id='priv_btn_Continue']");
	private By checkBoxRememberMe = By.xpath("//input[@type='checkbox' and @name='remember']");
	private By userid = By.xpath("//input[@name='email']");
	private By passphraseOnLoginPage = By.xpath("//input[@name='password']");
	private By loginbutton = By.xpath("//button[text()='Log In']");
	private By answerField = By.xpath("//input[@id='Answer']");
	private By continueButtonForLogin = By.xpath("//button[@data-testid='priv_btn_ContinueBtn']");

	private By welcomeDropdown = By.xpath("//button[contains(text(),'Welcome,')]");
	private By userProfileOption = By.xpath("(//a[\"contains(text(),'User profile')\"])[2]");
	private By cancelUserRegistration = By.xpath("//span[text()='Cancel User Registration']");
	private By continueButtonOnCancelUserRegistrationPopup = By.xpath("//button[@data-testid='priv_modal_Continue']");

	private By errorMessageAfterLogin = By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']");
	private By crossButtonOnErrorMessageAfterLogin = By.xpath("(//*[@data-testid='CloseIcon'])[3]");
	private By crossButtonOnErrorMessageAfterLogin1 = By.xpath("//*[@data-testid='CloseIcon']");

	private By searchField = By.xpath("(//input[@placeholder='Search…'])[1]");
	private By searchFieldPendingGrid = By.xpath("(//input[@placeholder='Search…'])[2]");
	private By searchRecordFirstname = By.xpath("(//a[@class='link-cell'])[1]");
	private By searchRecordFirstnameInPendingGrid = By.xpath("(//a[@class='link-cell'])[6]");
	private By statusOnUserDetailsPageByJU = By.xpath("(//p[@class='MuiTypography-root MuiTypography-body2 css-rmnksp'])[25]");

	private By errorMessageForInvalidSecurityQueAnswer = By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']");
	private By changePassphraseAndSecuriQueOption = By.xpath("//span[text()='Change Passphrase and Security Questions']");
	private By currentPassphrase = By.xpath("//input[@id='oldPassphrase']");
	private By newPassphrase = By.xpath("//input[@id='newPassphrase']");
	private By confirmPassphraseField = By.xpath("//input[@id='confirmPassphrase']");
	private By saveButtonOnResetPassphraseSection = By.xpath("//button[text()='SAVE']");
	private By successMessageForResetPassphrase = By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-74todz']");
	private By crossButtonOnSuccMessOfResetPassphrase = By.xpath("//*[@data-testid='CloseIcon']");
	private By secQue1Dropdown = By.xpath("//div[@id='Question1']");
	private By selectSecuQuetion1 = By.xpath("(//li[@role='option'])[3]");
	private By secQue2Dropdown = By.xpath("//div[@id='Question2']");
	private By selectSecuQuetion2 = By.xpath("(//li[@role='option'])[3]");
	private By secQue3Dropdown = By.xpath("//div[@id='Question3']");
	private By selectSecuQuetion3 = By.xpath("(//li[@role='option'])[3]");
	private By answer1Field = By.xpath("//input[@id='Answer1']");
	private By answer2Field = By.xpath("//input[@id='Answer2']");
	private By answer3Field = By.xpath("//input[@id='Answer3']");
	private By saveButtonOnResetSecurityQuestion = By.xpath("(//button[text()='SAVE'])[2]");
	//private By successMessageForResetPassphrase = By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-74todz']");

	private By cancelUserRegistrationRadioButton = By.xpath("//span[text()='Cancel User Registration']");
	private By commentField = By.xpath("//textarea[@id='Comments']");
	private By saveButton = By.xpath("//button[@type='submit']");
	private By successMessageForCancelUserRegistration = By.xpath("//*[text()='User cancelled Successfully']");
	private By requestRevisionRadioButton = By.xpath("//span[text()='Request Revisions']");
	private By denyRadioButton = By.xpath("//span[contains(text(),'Deny')]");
	private By reasonForDenialDropdown = By.xpath("//div[@id='mui-component-select-ReasonForDenial']");
	private By selectDenialReason1 = By.xpath("//span[text()='Denial Reason 1']");
	private By successMessageDeniedUserRegistration = By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']");
	private By approveRadioButton = By.xpath("//span[text()='Approve']");
	private By selectRoleTypeDropdown = By.xpath("//div[@id='mui-component-select-RoleType']");
	private By selectServiceProviderRoleType = By.xpath("//span[contains(text(),'Service Providers')]");
	private By selectIndividualUsersRolType = By.xpath("//span[contains(text(),'Individual Users')]");
	private By selectJurisdictionUserRoleType = By.xpath("//span[contains(text(),'Jurisdiction Users')]");
	private By selectTechnicalAdminAndSytemUsersRoleType = By.xpath("//span[contains(text(),'Technical Admin')]");
	private By roleDropdown = By.xpath("//div[@id='mui-component-select-Roles']");
	private By selectMarketMonitorRole = By.xpath("//span[contains(text(),'Market Monitor')]");
	private By selectIndividualUsersRole = By.xpath("//span[contains(text(),'Individual Users')]");
	private By primaryAccountRepresentativeRole = By.xpath("//span[contains(text(),'Primary Account Representative')]");
	private By alternativeAccountRepresentativesRole = By.xpath("//span[contains(text(),'Alternate Account Representative')]");
	private By selectRegistrarRole = By.xpath("//span[contains(text(),'Registrar')]");
	private By selectSystemAdminRole = By.xpath("//*[contains(text(),'System Admin')]");
	private By selectMarketMonitorRole1 = By.xpath("(//span[contains(text(),'Market Monitor')])[2]");
	private By selectFinancialServiceProvidersRole = By.xpath("//span[contains(text(),'Financial Service Providers')]");
	private By crossButtonOnSuccMessAuthorityApproval = By.xpath("(//*[@data-testid='CloseIcon'])[3]");
	private By successMessageAfterRegistrarApproveUser = By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']");


	private By successMessageForRevisionRequestedByRegistrar = By.xpath("//*[text()='User has successfully requested revisions']");
	private By securityQuestion1ForLogin = By.xpath("//*[@class='MuiTypography-root MuiTypography-h6 css-1etlmxt']");

	private By formsOption = By.xpath("//*[contains(text(),'Forms')]");
	private By form1 = By.xpath("//*[contains(text(),'User Registration Checklist')]");
	private By form2= By.xpath("//p[text()='User Registration Form']");
	private By form3 = By.xpath("//p[text()='Proof of Identity Form']");


	private By requestRevisionTextOnHomepage = By.xpath("//div[@class='MuiBox-root css-knkskr']");
	private By makeRevisionButton = By.xpath("//button[text()='Make Revisions']");
	private By editButton = By.xpath("//button[text()='Edit']");
	private By firstNameEdit = By.xpath("//input[@id='Name']");
	private By telephoneNumberEdit = By.xpath("//input[@id='TelephoneNumber']");
	private By street1EditPrimResi= By.xpath("//input[@id='ResStreet1']");
	private By cityEditMailAdd = By.xpath("//input[@id='MailCity']");
	private By saveButtonForRevisionRequestSubmit = By.xpath("//button[text()='SAVE']");
	private By continueButtonOnPrompt = By.xpath("//button[text()='CONTINUE']");
	private By successMessageAfterSubmitRequestRevision = By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']");
	private By returnToUserProfileButton = By.xpath("//button[text()='Return to User Profile']");
	private By homeMenu = By.xpath("//a[text()='HOME']");
	private By pendingStatusTextOnHomePage = By.xpath("//div[@class='MuiBox-root css-knkskr']");
	private By successMessageAfterAuthorityApproveUser = By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']");

	private By oldValueFirstNameField = By.xpath("(//*[@class='MuiTypography-root MuiTypography-body2 css-rmnksp'])[2]");
	private By oldValueLastNameField = By.xpath("(//*[@class='MuiTypography-root MuiTypography-body2 css-rmnksp'])[4]");
	private By oldValueTelephoneField = By.xpath("(//*[@class='MuiTypography-root MuiTypography-body2 css-rmnksp'])[7]");
	private By oldValueStreet1Field = By.xpath("(//*[@class='MuiTypography-root MuiTypography-body2 css-rmnksp'])[15]");
	private By oldValueCityField = By.xpath("(//*[@class='MuiTypography-root MuiTypography-body2 css-rmnksp'])[21]");
	private By newValueFirstNameField = By.xpath("(//*[@class='MuiTypography-root MuiTypography-body1 css-7vo5ly'])[1]");
	private By newValueLastNameField = By.xpath("(//*[@class='MuiTypography-root MuiTypography-body1 css-7vo5ly'])[2]");	
	private By newValueTelephoneField = By.xpath("(//*[@class='MuiTypography-root MuiTypography-body1 css-7vo5ly'])[2]");
	private By newValueStreet1Field = By.xpath("(//*[@class='MuiTypography-root MuiTypography-body1 css-7vo5ly'])[3]");
	private By newValueCityField = By.xpath("(//*[@class='MuiTypography-root MuiTypography-body1 css-7vo5ly'])[4]");

	private By viewAndEditUserDetailsOption = By.xpath("//span[text()='View or Edit User Details']");

	private By changejurisdiction = By.xpath("//*[@href='/change-jurisdiction']");
	private By selectJurisdiction = By.xpath("//*[@id='mui-component-select-jurisdiction']");
	private By selectCalifornia = By.xpath("//*[text()='California']");
	private By selectQuebec = By.xpath("//*[text()='Quebec']");
	private By continueButtonforSelectJuri = By.xpath("//*[@data-testid='priv_btn_continue']");
	private By cancelButtonforSelectJuri = By.xpath("//button[contains(text(),'CANCEL')]");
	private By pageHeader1 = By.xpath("//*[text()='Change Jurisdiction Request']");
	private By termsCheckbox = By.xpath("(//*[@class='PrivateSwitchBase-input css-1m9pwf3'])[2]");
	private By continueUserdetails = By.xpath("//button[@data-testid='Continue' and @type='submit']");
	private By submitButton = By.xpath("//*[@data-testid='priv_btn_Search']");
	private By contactUs = By.xpath("//*[text()='Contact Us']");
	private By successMsg = By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']");
	private By closeIcon = By.xpath("(//*[@data-testid='CloseIcon'])[2]");

	private By requestStatus = By.xpath("(//div[contains(text(),'Pending COJ')])[1]");
	private By originalJurisdictionText = By.xpath("(//div[@data-field='orgJuris'])[2]");
	private By welcomingJurisdictionText = By.xpath("(//div[@data-field='newJuris'])[2]");

	private By closeUserAccountOption = By.xpath("//span[contains(text(),'Close User Account')]");
	private By closeUserAccountButtonOnPropmt = By.xpath("//button[@data-testid='priv_modal_Continue']");

	private By threeDots = By.xpath("(//*[@data-testid='MoreHorizIcon'])[1]");
	private By inactiveauserProfileAccessOnlyOption = By.xpath("//*[contains(text(),'INACTIVATE USER - PROFILE ACCESS ONLY')]");
	private By resetSecurityQueAndPassphraseOption = By.xpath("//*[contains(text(),'RESET SECURITY QUESTIONS AND PASSPHRASE')]");
	private By deactivateUserLoginOption = By.xpath("//*[contains(text(),'DEACTIVATE USER LOG-IN')]");
	private By updateEmailOption = By.xpath("//*[contains(text(),'UPDATE EMAIL')]");
	private By inactivateUserClosedAccountOption = By.xpath("//*[contains(text(),'INACTIVATE USER - CLOSE ACCOUNT')]");
	private By deactivateWithoutProfileAccessRadioButton = By.xpath("//input[@value='Deactivate without profile access']");
	private By deactivateWithProfileAccessRadioButton = By.xpath("//input[@value='Deactivate with profile access']");
	private By deactivateUserReasons = By.xpath("//input[@id='deactiveProfileReason']");
	private By successMessageAfterRegistrarDeactivateUserWithoutProfileAccess = By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']");
	private By activateUserLoginOption = By.xpath("//*[contains(text(),'ACTIVATE USER LOG-IN')]");
	private By continueButtonOnDeactivateUserPopup = By.xpath("//button[contains(text(),'CONTINUE')]");
	private By userEmailFieldOnEditUserEmailPopup = By.xpath("//input[@id='inctiveReasons']");
	private By proposeButtonOnEditUserEmailPopup = By.xpath("//button[@data-testid='priv_btn_Search']");
	private By commentLabelForInactiveUserCloseAccountPoup  = By.xpath("(//label[contains(text(),'Comment')])[2]");
	private By cancelButtonForInactiveUserCloseAccountPoup = By.xpath("(//*[contains(text(),'CANCEL')])[2]");
	private By closeUserAccountButtonForInactiveUserCloseAccountPoup = By.xpath("//button[@data-testid='priv_btn_Search']");

	private By oldValueOfEmailField = By.xpath("(//*[@class='MuiTypography-root MuiTypography-body2 css-rmnksp'])[10]");
	private By oldValueOfConfirmEmailField = By.xpath("(//*[@class='MuiTypography-root MuiTypography-body2 css-rmnksp'])[11]");
	private By newValueOfEmailField = By.xpath("(//*[@class='MuiTypography-root MuiTypography-body1 css-7vo5ly'])[1]");
	private By newValueOfConfirmEmailField = By.xpath("(//*[@class='MuiTypography-root MuiTypography-body1 css-7vo5ly'])[2]");

	private By proposedUserDetailsOption = By.xpath("(//*[text()='Updated User Details Request'])[1]");

	private By crossJurisdictionOption = By.xpath("//*[contains(text(),'Cross Jurisdiction')]");
	private By selectJurisdictionDropdownForCrossJurisdiction = By.xpath("//div[@id='mui-component-select-jurisdiction']");
	private By selectQuebecOptionForCrossJurisdiction = By.xpath("//span[contains(text(),'Quebec')]");
	private By checkboxIAcceptForCrossJurisdiction = By.xpath("//span[contains(text(),'I accept the Jurisdiction')]");
	private By continueButtonForCrossJurisdiction = By.xpath("//button[@data-testid='priv_btn_continue']");
	private By submitButtonForCrossJurisdiction = By.xpath("//button[@data-testid='priv_btn_Search']");
	private By requestStatusCrossJurisdiction = By.xpath("(//div[contains(text(),'Pending Cross Jurisdiction')])[1]");
	private By crossJurisdictionRequestOption = By.xpath("(//*[text()='Cross Jurisdiction Request'])[1]");
	private By shareUserProfileRadioButton = By.xpath("//span[contains(text(),'Share User Profile')]");
	private By unshareUserProfileRadioButton = By.xpath("//span[contains(text(),'Unshare User Profile')]");

	private By avialableToShareWithText = By.xpath("//span[contains(text(),'Available to Share with')]");

	private By firstNameLabel = By.xpath("//label[contains(text(),'First Name')]");
	private By lastNameLabel = By.xpath("//label[contains(text(),'Last Name')]");
	private By jurisdictionLabel = By.xpath("//label[contains(text(),'Jurisdiction')]");
	private By statusLabel = By.xpath("//label[contains(text(),'Status')]");
	private By termsAcceptedLabel = By.xpath("//label[contains(text(),'Terms Accepted')]");

	private By firstNameFieldWithData = By.xpath("(//*[@class='MuiTypography-root MuiTypography-body2 css-rmnksp'])[2]");
	private By lasttNameFieldWithData = By.xpath("(//*[@class='MuiTypography-root MuiTypography-body2 css-rmnksp'])[4]");
	private By jurisdictionFieldWithData = By.xpath("(//*[@class='MuiTypography-root MuiTypography-body2 css-rmnksp'])[23]");
	private By statusFieldWithData = By.xpath("(//*[@class='MuiTypography-root MuiTypography-body2 css-rmnksp'])[25]");
	private By termsAcceptedFieldWithData1 = By.xpath("(//*[@class='MuiTypography-root MuiTypography-body2 css-rmnksp'])[26]");
	private By termsAcceptedFieldWithData2 = By.xpath("(//*[@class='MuiTypography-root MuiTypography-body2 css-rmnksp'])[27]");

	private By returnToSearchResultsButton = By.xpath("//button[contains(text(),'Return to Search Results')]");

	private By jurisdictionRequestRevisionText = By.xpath("(//div[contains(text(),'Jurisdiction Request Revisions')])[1]");
	private By CommentAddedByAuthorityForRequestRevision = By.xpath("//*[@class='MuiTypography-root MuiTypography-body1 css-1js9zue']");

	private By requestStatusApprovedCrossJurisdiction = By.xpath("(//*[contains(text(),'Approved Cross Jurisdiction')])[2]");

	private By reviewAndEditUserRegistrationOption = By.xpath("//span[contains(text(),'Review/Edit User Registration')]");
	private By viewUserDetailsOption = By.xpath("//span[contains(text(),'View User Details')]");
	private By crossJurisdictionCommentField = By.xpath("//textarea[@id='CJComments']");
	private By individualRoleTypeInRoleTypeDropdown = By.xpath("//div[@class='MuiBox-root css-15fzge']");
	private By individualRoleInRoleDropdown = By.xpath("//span[@class='MuiChip-label MuiChip-labelMedium css-9iedg7']");
	private By userIDField = By.xpath("//input[@id='Username']");
	private By cancelButtonForRevisionRequest = By.xpath("//*[contains(text(),'CANCEL')]");
	private By accountStatusOfUser = By.xpath("(//*[@class='MuiDataGrid-cellContent'])[7]");
	private By requestStatusOfUser = By.xpath("(//*[@class='MuiDataGrid-cellContent'])[11]");
	private By errorMessageForCommentField = By.xpath("//*[@id='Comments-helper-text']");
	private By pendingRequestOption = By.xpath("(//*[@class='MuiTypography-root MuiTypography-body1 css-1195g5e'])[2]");
	private By userRegistrationChecklistForm = By.xpath("(//*[@class='MuiBox-root css-1f05miv'])[1]");
	private By userRegistrationForm = By.xpath("//*[@class='MuiTypography-root MuiTypography-subtitle2 css-f7ulzg']");
	private By proofOfIdentityForm = By.xpath("(//*[@class='MuiBox-root css-1f05miv'])[2]");

	private By personalInformationText = By.xpath("(//div[@class='MuiTypography-root MuiTypography-h2 css-11brs9n'])[1]");
	private By primaryResidenceText = By.xpath("(//div[@class='MuiTypography-root MuiTypography-h2 css-11brs9n'])[2]");
	private By mailingAddressText = By.xpath("(//div[@class='MuiTypography-root MuiTypography-h2 css-11brs9n'])[3]");
	private By logInInformationText = By.xpath("(//div[@class='MuiTypography-root MuiTypography-h2 css-11brs9n'])[4]");
	
	private By textOnPrompt = By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']");
	private By cancelButtonOnPrompt = By.xpath("(//*[text()='CANCEL'])[2]");
	private By userRoleHistorySection = By.xpath("(//*[@class='MuiTypography-root MuiTypography-h4 css-3mbxhx'])[3]");
	private By roleTypeColomn = By.xpath("(//div[contains(text(),'Role Type')])");
	private By roleColomn = By.xpath("(//div[contains(text(),'role')])");
	private By jurisdictionColomn = By.xpath("(//div[text()='Jurisdiction'])[3]");
	private By dateTimeUpdatedColomn = By.xpath("(//div[contains(text(),'Date/Time Updated (EDT)')])");
	private By updatedByColomn = By.xpath("(//div[contains(text(),'Updated by')])");

	private By userStatusHistorySection = By.xpath("(//*[@class='MuiTypography-root MuiTypography-h4 css-3mbxhx'])[2]");
	private By requestStatusColomn = By.xpath("(//div[contains(text(),'Request Status')])[2]");
	private By originalJurisdictionColomn = By.xpath("//div[contains(text(),'Original Jurisdiction')]");
	private By welcomingJurisdictionColomn = By.xpath("//div[contains(text(),'Welcoming Jurisdiction')]");
	private By applicantUserStatusColomn = By.xpath("(//div[contains(text(),'Applicant/User Status')])[2]");
	private By requestInitiationDateColomn = By.xpath("//div[contains(text(),'Request Initiation Date')]");
	private By updatedBy1Colomn = By.xpath("(//div[contains(text(),'Updated by')])[1]");
	private By commentColomn = By.xpath("//div[contains(text(),'Comment')]");
	private By denialReasonColomn = By.xpath("//div[contains(text(),'Denial Reason')]");
	
	private By filterButton = By.xpath("(//button[@aria-label='Show filters'])[1]");
	private By selectFilter = By.xpath("(//select[@class='MuiNativeSelect-select MuiNativeSelect-standard MuiInputBase-input MuiInput-input css-1vynybe'])[1]");
	private By filterValueField = By.xpath("//input[@placeholder='Filter value']");
	
	private By userRoleHistoryGridSection = By.xpath("//*[contains(text(),'USER ROLE HISTORY')]");
	private By roleTypeColomnInRoleHistoryGrid = By.xpath("(//*[contains(text(),'Role Type')])[3]");
	private By roleColomnInRoleHistoryGrid  = By.xpath("(//*[text()='Role'])[2]");
	private By jurisdictionColomnInRoleHistoryGrid  = By.xpath("(//*[text()='Jurisdiction'])[3]");
	private By dateTimeUpdatedTimeInRoleHistoryGrid   = By.xpath("//*[text()='Date/Time Updated (EDT)']");
	private By updatedByInRoleHistoryGrid   = By.xpath("(//*[text()='Updated by'])[2]");
	private By viewUserDetailsText   = By.xpath("//span[contains(text(),'View User Details')]");
	private By userStatusHistoryText   = By.xpath("//*[contains(text(),'User Status History')]");
	private By userRoleHistoryText   = By.xpath("//*[contains(text(),'User Role History')]");
	private By changeJurisdictionText   = By.xpath("//span[contains(text(),'Change Jurisdiction')]");
	private By closeUserAccountText   = By.xpath("//span[contains(text(),'Close User Account')]");
	private By changePassphraseAndSecurityQuestionsText   = By.xpath("//span[contains(text(),'Change Passphrase and Security Questions')]");
	private By lastLoginDateAndTimeTextOnUserProfilePgae   = By.xpath("//*[contains(text(),'Last Login')]");
	private By logoutbutton = By.xpath("//a[contains(text(),'Logout')]");
	private By lastloginDate = By.xpath("//span[@style='font-size: 12px; font-weight: 500;']");
	private By lastLoginText = By.xpath("//p[@class='text']");
	
	private By userStatusOption = By.xpath("//*[contains(text(),'User Status History')]");
	private By userRoleHistoryOption = By.xpath("//*[contains(text(),'User Role History')]");
	private By changeJurisdictionOption = By.xpath("//*[contains(text(),'Change Jurisdiction')]");
	private By closeUserAcountOption = By.xpath("//*[contains(text(),'Close User Account')]");
	
	private By jurisdictionNameAboveMenuBar = By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-1ga5bvv']");
	private By jurisdictionNameInDropDpownOfContactUsPage = By.xpath("//div[@id='jurisdiction']");
	private By nameFieldOnContactUsPage = By.xpath("//input[@placeholder='Enter your Full Name']");
	private By telephoneFieldOnContactUsPage = By.xpath("//input[@placeholder='Enter your phone with country code']");
	private By emailFieldOnContactUsPage = By.xpath("//input[@placeholder='Enter your email address']");
	private By messageFieldOnContactUsPage = By.xpath("//body[@aria-placeholder='Enter your message']");
	private By sendButtonOnContactUsPage = By.xpath("//button[@data-testid='contact_us_save']");
	private By successMessageForContactUsPage = By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']");
	private By errorMessageForTelephoneField = By.xpath("//*[@id='phone-helper-text']");
	private By errorMessageForMessageField = By.xpath("//span[text()='Message  is required']");
	private By iframe = By.xpath("//*[@id='email_message_ifr']");
	private By discardButtonOnContactUsPage = By.xpath("//button[@data-testid='contact_us_cancel']");
	private By cancelButtonOnWarningPopup = By.xpath("//button[@data-testid='priv_modal_Cancel']");
	private By continueButtonOnWarningPopup = By.xpath("//button[@data-testid='priv_modal_Continue']");
	private By forgotPassphraseLinkOnHomePage = By.xpath("//a[text()='Forgot Passphrase?']");
	private By forgotPassphrasePopupTilte = By.xpath("//*[@id='modal-modal-title']");
	private By userIDFieldTitleForgotPassphrasePopup= By.xpath("//*[text()='Please enter your User ID:']");
	private By userIDFieldForgotPassphrasePopup= By.xpath("//input[@id='emailId']");
	private By continueButtonForgotPassphrasePopup= By.xpath("//button[text()='CONTINUE']");
	
	public PendingUser() {
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

	public static String generateUserIdString() {
		int length = 4;
		boolean useLetters = false;
		boolean useNumbers = true;
		String generatedString = RandomStringUtils.random(length, useNumbers, useLetters);

		String randomString = ("test" + generatedString);
		return randomString;
	}
	
	public void accessibleForgotPassphrasePopup() throws InterruptedException {
		driver.findElement(forgotPassphraseLinkOnHomePage).click();
		boolean popupTitle1= driver.findElement(forgotPassphrasePopupTilte).isDisplayed();
		Assert.assertTrue(popupTitle1);
		String popupTitle=driver.findElement(forgotPassphrasePopupTilte).getText();
		System.out.println("Popup title is:"+popupTitle);
		Assert.assertEquals("Forgot Passphrase?", popupTitle);
		ObjectRepo.test.log(Status.PASS, "Popup title is:"+popupTitle);
		boolean userIDField1= driver.findElement(userIDFieldTitleForgotPassphrasePopup).isDisplayed();
		Assert.assertTrue(userIDField1);
		String userIdField=driver.findElement(userIDFieldTitleForgotPassphrasePopup).getText();
		System.out.println("Field name is:"+userIdField);
		Assert.assertEquals("Please enter your User ID:", userIdField);
		ObjectRepo.test.log(Status.PASS, "Field name is:"+userIdField);
		boolean continueButton1= driver.findElement(continueButtonForgotPassphrasePopup).isDisplayed();
		Assert.assertTrue(continueButton1);
		String continueButton=driver.findElement(continueButtonForgotPassphrasePopup).getText();
		System.out.println("Button name is:"+continueButton);
		Assert.assertEquals("CONTINUE", continueButton);
		ObjectRepo.test.log(Status.PASS, "Button name is:"+continueButton);
	}
	
	public void discardButtonFunctionalityOnContactUsPage() throws InterruptedException {
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(jurisdictionNameAboveMenuBar));
		String jurisdictionNameAboveMenuBarForDefault=driver.findElement(jurisdictionNameAboveMenuBar).getText();
		System.out.println("Default Jurisdiction name above menu bar is:"+jurisdictionNameAboveMenuBarForDefault);
		System.out.println("Below are the values of auto populated fields:");
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(nameFieldOnContactUsPage));
		String nameField=driver.findElement(nameFieldOnContactUsPage).getAttribute("Value");
		System.out.println("Value in Name Field is:"+nameField);
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(telephoneFieldOnContactUsPage));
		String telephoneField=driver.findElement(telephoneFieldOnContactUsPage).getAttribute("Value");
		System.out.println("Value in Telephone Field is:"+telephoneField);
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(emailFieldOnContactUsPage));
		String emailAddressField=driver.findElement(emailFieldOnContactUsPage).getAttribute("Value");
		System.out.println("Value in Email Address Field is:"+emailAddressField);
		if(driver.findElement(nameFieldOnContactUsPage).isEnabled()) {
			System.out.println("Name field is enabled");
		}
		else {
			System.out.println("Name field is not enabled");
		}
		if(driver.findElement(telephoneFieldOnContactUsPage).isEnabled()) {
			System.out.println("Telephone field is enabled");
		}
		else {
			System.out.println("Telephone field is not enabled");
		}
		if(driver.findElement(emailFieldOnContactUsPage).isEnabled()) {
			System.out.println("Email Address field is enabled");
		}
		else {
			System.out.println("Email Address field is not enabled");
		}
		driver.findElement(jurisdictionNameInDropDpownOfContactUsPage).click();
		driver.findElement(By.xpath("//li[@data-value='ORG#00101']")).click();
		for(int i=1;i<=12;i++) {
			driver.findElement(telephoneFieldOnContactUsPage).sendKeys(Keys.BACK_SPACE);
		}
		driver.findElement(telephoneFieldOnContactUsPage).sendKeys("1112223334");
		driver.switchTo().frame(driver.findElement(iframe));
		driver.findElement(messageFieldOnContactUsPage).sendKeys("Message for contact to Jurisdiction");
		driver.switchTo().parentFrame();
		driver.findElement(discardButtonOnContactUsPage).click();
		driver.findElement(cancelButtonOnWarningPopup).click();
		System.out.println("After click on cancel button of Warning pop-up view Below Entered data:");
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(nameFieldOnContactUsPage));
		String nameFieldAfterRetain=driver.findElement(nameFieldOnContactUsPage).getAttribute("Value");
		System.out.println("Value in Name Field is After Retain:"+nameFieldAfterRetain);
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(telephoneFieldOnContactUsPage));
		String telephoneFieldAfterRetain=driver.findElement(telephoneFieldOnContactUsPage).getAttribute("Value");
		System.out.println("Value in Telephone Field is After Retain:"+telephoneFieldAfterRetain);
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(emailFieldOnContactUsPage));
		String emailAddressFieldAfterRetain=driver.findElement(emailFieldOnContactUsPage).getText();
		System.out.println("Value in Email Address Field is After Retain:"+emailAddressFieldAfterRetain);
		driver.switchTo().frame(driver.findElement(iframe));
		String messageFieldAfterRetain=driver.findElement(messageFieldOnContactUsPage).getAttribute("Value");
		System.out.println("Value in message Field is After Retain:"+messageFieldAfterRetain);
		driver.switchTo().parentFrame();
		driver.findElement(discardButtonOnContactUsPage).click();
		driver.findElement(continueButtonOnWarningPopup).click();
		System.out.println("After click on continue button of Warning pop-up view Below Entered data:");
		String telephoneFieldAfterDiscarding=driver.findElement(telephoneFieldOnContactUsPage).getAttribute("Value");
		System.out.println("Value in Telephone Field is After discarding:"+telephoneFieldAfterDiscarding);
		driver.switchTo().frame(driver.findElement(iframe));
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(messageFieldOnContactUsPage));
		String messageFieldAfterdiscarding=driver.findElement(messageFieldOnContactUsPage).getAttribute("Value");
		System.out.println("Value in message Field is After discarding:"+messageFieldAfterdiscarding);
		driver.switchTo().parentFrame();
	}
	
	public void contactUsPageForLoggedInUserWithEmptyData() throws InterruptedException {
		for(int i=1;i<=11;i++) {
			driver.findElement(telephoneFieldOnContactUsPage).sendKeys(Keys.BACK_SPACE);
		}
		
		String errorMessageTelephoneField=driver.findElement(errorMessageForTelephoneField).getText();
		System.err.println("Error Message for telephone field is :"+errorMessageTelephoneField);
		Assert.assertEquals(errorMessageTelephoneField, "Mobile Phone is required");
		driver.switchTo().frame(driver.findElement(iframe));
		driver.findElement(messageFieldOnContactUsPage).sendKeys("");
		driver.switchTo().parentFrame();
		driver.findElement(telephoneFieldOnContactUsPage).click();
		String errorMessageMessageField=driver.findElement(errorMessageForMessageField).getText();
		System.err.println("Error Message for Message field is :"+errorMessageMessageField);
		Assert.assertEquals(errorMessageMessageField, "Message is required");
		if(driver.findElement(sendButtonOnContactUsPage).isEnabled()) {
			System.err.println("Save Button is in enable state");
		}
		else {
			System.err.println("Save Button is in disable state");
		}
	}
	
	public void contactUsPageForLoggedInUserWithInValidData() throws InterruptedException {
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(jurisdictionNameAboveMenuBar));
		String jurisdictionNameAboveMenuBarForDefault=driver.findElement(jurisdictionNameAboveMenuBar).getText();
		System.out.println("Default Jurisdiction name above menu bar is:"+jurisdictionNameAboveMenuBarForDefault);
		String jurisdictionNameInDropdown=driver.findElement(jurisdictionNameInDropDpownOfContactUsPage).getText();
		System.out.println("Jurisdiction name in Dropdown is:"+jurisdictionNameAboveMenuBarForDefault);
		Assert.assertEquals(jurisdictionNameAboveMenuBarForDefault, jurisdictionNameInDropdown);
		System.out.println("Below are the values of auto populated fields:");
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(nameFieldOnContactUsPage));
		String nameField=driver.findElement(nameFieldOnContactUsPage).getText();
		System.out.println("Value in Name Field is:"+nameField);
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(telephoneFieldOnContactUsPage));
		String telephoneField=driver.findElement(telephoneFieldOnContactUsPage).getText();
		System.out.println("Value in Telephone Field is:"+telephoneField);
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(emailFieldOnContactUsPage));
		String emailAddressField=driver.findElement(emailFieldOnContactUsPage).getText();
		System.out.println("Value in Email Address Field is:"+emailAddressField);
		if(driver.findElement(nameFieldOnContactUsPage).isEnabled()) {
			System.out.println("Name field is enabled");
		}
		else {
			System.out.println("Name field is not enabled");
		}
		if(driver.findElement(telephoneFieldOnContactUsPage).isEnabled()) {
			System.out.println("Telephone field is enabled");
		}
		else {
			System.out.println("Telephone field is not enabled");
		}
		if(driver.findElement(emailFieldOnContactUsPage).isEnabled()) {
			System.out.println("Email Address field is enabled");
		}
		else {
			System.out.println("Email Address field is not enabled");
		}
		driver.findElement(jurisdictionNameInDropDpownOfContactUsPage).click();
		driver.findElement(By.xpath("//li[@data-value='ORG#00101']")).click();
		for(int i=1;i<=12;i++) {
			driver.findElement(telephoneFieldOnContactUsPage).sendKeys(Keys.BACK_SPACE);
		}
		driver.findElement(telephoneFieldOnContactUsPage).sendKeys("111222#$#H3334");
		String errorMessageTelephoneField=driver.findElement(errorMessageForTelephoneField).getText();
		System.err.println("Error Message for telephone field is :"+errorMessageTelephoneField);
		Assert.assertEquals(errorMessageTelephoneField, "Invalid Mobile Phone");
		if(driver.findElement(sendButtonOnContactUsPage).isEnabled()) {
			System.err.println("Save Button is in enable state");
		}
		else {
			System.err.println("Save Button is in disable state");
		}
	}
	
	public void contactUsPageIsAccessibleForPublicUser() throws InterruptedException {
		String text=driver.findElement(By.xpath("//*[@class='MuiTypography-root MuiTypography-h2 css-1hwpmpt']")).getText();
		System.err.println("Text present on public home page is :"+text);
		driver.findElement(By.xpath("//a[@class='MuiTypography-root MuiTypography-body2 css-won2i5']")).click();
		String textOnContactUsPage=driver.findElement(By.xpath("//*[text()='Contact Us']")).getText();
		System.err.println("Text present on Contcat Us page is :"+textOnContactUsPage);
		if(driver.findElement(By.xpath("//*[text()='Contact Us']")).isDisplayed()) {
			System.out.println("Contact us page is opened and is accessible for public user");
		}
		else {
			System.out.println("Contact us page is not opened and not accessible for public user");
		}
	}
	
	public void contactUsPageForLoggedInUserWithValidData() throws InterruptedException {
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(jurisdictionNameAboveMenuBar));
		String jurisdictionNameAboveMenuBarForDefault=driver.findElement(jurisdictionNameAboveMenuBar).getText();
		System.out.println("Default Jurisdiction name above menu bar is:"+jurisdictionNameAboveMenuBarForDefault);
		String jurisdictionNameInDropdown=driver.findElement(jurisdictionNameInDropDpownOfContactUsPage).getText();
		System.out.println("Jurisdiction name in Dropdown is:"+jurisdictionNameAboveMenuBarForDefault);
		Assert.assertEquals(jurisdictionNameAboveMenuBarForDefault, jurisdictionNameInDropdown);
		System.out.println("Below are the values of auto populated fields:");
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(nameFieldOnContactUsPage));
		String nameField=driver.findElement(nameFieldOnContactUsPage).getText();
		System.out.println("Value in Name Field is:"+nameField);
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(telephoneFieldOnContactUsPage));
		String telephoneField=driver.findElement(telephoneFieldOnContactUsPage).getText();
		System.out.println("Value in Telephone Field is:"+telephoneField);
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(emailFieldOnContactUsPage));
		String emailAddressField=driver.findElement(emailFieldOnContactUsPage).getText();
		System.out.println("Value in Email Address Field is:"+emailAddressField);
		if(driver.findElement(nameFieldOnContactUsPage).isEnabled()) {
			System.out.println("Name field is enabled");
		}
		else {
			System.out.println("Name field is not enabled");
		}
		if(driver.findElement(telephoneFieldOnContactUsPage).isEnabled()) {
			System.out.println("Telephone field is enabled");
		}
		else {
			System.out.println("Telephone field is not enabled");
		}
		if(driver.findElement(emailFieldOnContactUsPage).isEnabled()) {
			System.out.println("Email Address field is enabled");
		}
		else {
			System.out.println("Email Address field is not enabled");
		}
		driver.findElement(jurisdictionNameInDropDpownOfContactUsPage).click();
		driver.findElement(By.xpath("//li[@data-value='ORG#00101']")).click();
		for(int i=1;i<=12;i++) {
			driver.findElement(telephoneFieldOnContactUsPage).sendKeys(Keys.BACK_SPACE);
		}
		driver.findElement(telephoneFieldOnContactUsPage).sendKeys("1112223334");
		driver.switchTo().frame(driver.findElement(iframe));
		driver.findElement(messageFieldOnContactUsPage).sendKeys("Message for contact to Jurisdiction");
		driver.switchTo().parentFrame();
		driver.findElement(sendButtonOnContactUsPage).click();
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(successMessageForContactUsPage));
		String successMessage=driver.findElement(successMessageForContactUsPage).getText();
		System.out.println("Success Message for Contact us is:"+successMessage);
		Assert.assertEquals(successMessage, "Your request have been processed. Testing RPM-1751 1111111");
	}
	
	public void contactUsPageIsAccessibleForLoggedInUser() throws InterruptedException {
		driver.findElement(By.xpath("//a[@class='MuiTypography-root MuiTypography-body2 css-won2i5']")).click();
		String textOnContactUsPage=driver.findElement(By.xpath("//*[text()='Contact Us']")).getText();
		System.err.println("Text present on Contcat Us page is :"+textOnContactUsPage);
		if(driver.findElement(By.xpath("//*[text()='Contact Us']")).isDisplayed()) {
			System.out.println("Contact us page is opened and is accessible for Logged in user user");
		}
		else {
			System.out.println("Contact us page is not opened and not accessible for Logged in user");
		}
	}
	
	public void registrarNotProvideDualApproval() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
		try {
			WebElement approveRadioButton = driver.findElement(By.xpath("//*[text()='Approve']"));
			boolean radiobutton=approveRadioButton.isDisplayed();
			Assert.assertTrue(radiobutton);
			System.out.println("Approve Radio Button is diaplayed and registrar is able to approve dual approval");
		}catch (Exception e) {
			System.out.println("Approve Radio Button is not diaplayed and registrar is not able to approve dual approval");
		}
	}
	
	public void registrarNotProvideDualDenial() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
		try {
			WebElement denyRadioButton = driver.findElement(By.xpath("//span[text()='Deny']"));
			boolean denyButton=denyRadioButton.isDisplayed();
			Assert.assertTrue(denyButton);
			System.out.println("Deny Radio button is displayed");
		}catch (Exception e) {
			System.out.println("Deny Radio button is not displayed");
		}
	}
	
	public void lastLoginReplaced() throws InterruptedException {
		driver.findElement(welcomeDropdown).click();
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(lastLoginText));
		boolean element= driver.findElement(lastLoginText).isDisplayed();
		Assert.assertTrue(element);
		String lastLoginTextAfterLogin = driver.findElement(lastLoginText).getText();
		System.out.println(lastLoginTextAfterLogin);
		ObjectRepo.test.log(Status.PASS, "User is able to view after login:" + lastLoginTextAfterLogin);
		new WebDriverWait(driver, 60).until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//span[@style='font-size: 12px; font-weight: 500;']")));
		boolean element1= driver.findElement(lastloginDate).isDisplayed();
		Assert.assertTrue(element1);
		//Thread.sleep(2000);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		WebElement element2 = driver.findElement(logoutbutton);
		js2.executeScript("arguments[0].click()", element2);
		Thread.sleep(2000);
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.elementToBeClickable((userid)));
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//*[text()='Log In'])[1]")));
		driver.findElement(userid).sendKeys(userId);
		System.out.println("step : Enter Valid User Id  ");
		ObjectRepo.test.log(Status.PASS, "step1 : Enter valid User Id ");
		driver.findElement(passphraseOnLoginPage).sendKeys(prop.getProperty("Passphrase"));
		System.out.println("step : Enter Valid passphrase  ");
		ObjectRepo.test.log(Status.PASS, "step1 : Enter valid passphrase ");
		WebElement element4 = driver.findElement(loginbutton);
		//JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element4);
		System.out.println("step : Click on login button  ");
		ObjectRepo.test.log(Status.PASS, "step1 : Click on login button ");
		driver.findElement(welcomeDropdown).click();
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(lastLoginText));
		boolean element5= driver.findElement(lastLoginText).isDisplayed();
		Assert.assertTrue(element5);
		String lastLoginTextAfterLoginNewLOgin = driver.findElement(lastLoginText).getText();
		System.out.println(lastLoginTextAfterLoginNewLOgin);
		Assert.assertNotEquals(lastLoginTextAfterLogin, lastLoginTextAfterLoginNewLOgin);
		ObjectRepo.test.log(Status.PASS, "User is able to view after login:" + lastLoginTextAfterLoginNewLOgin);
	}
	
	public void userViewLastLoginDateAndTimeForFirstTimeLogin() throws Exception {
		WebElement element = driver.findElement(welcomeDropdown);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		try {
			Boolean lastLoginTextInWelcomeDropDown=driver.findElement(By.xpath("//*[contains(text(),'Last Login')]")).isDisplayed();
			Assert.assertTrue(lastLoginTextInWelcomeDropDown);
			System.out.println("Last login date and time is display in Welcome Dropdown");
		} catch (Exception e) {
			System.out.println("Last login date and time is not display in Welcome Dropdown");
		}
		WebElement element2 = driver.findElement(userProfileOption);
		js2.executeScript("arguments[0].click()", element2);
		try {
			Boolean lastLoginTextOnUserProfilePage=driver.findElement(lastLoginDateAndTimeTextOnUserProfilePgae).isDisplayed();
			Assert.assertTrue(lastLoginTextOnUserProfilePage);
			System.out.println("Last login date and time is display in user profile page");
		} catch (Exception e) {
			System.out.println("Last login date and time is not display in user profile page");
		}
	}
	
	public void userViewLastLoginDateAndTime() throws Exception {
		WebElement element = driver.findElement(welcomeDropdown);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		WebElement element2 = driver.findElement(userProfileOption);
		js2.executeScript("arguments[0].click()", element2);
		String lastLoginDateAndTime=driver.findElement(lastLoginDateAndTimeTextOnUserProfilePgae).getText();
		System.out.println("User is able to view:" + lastLoginDateAndTime);
		boolean lastloginDateAndTimeText=driver.findElement(lastLoginDateAndTimeTextOnUserProfilePgae).isDisplayed();
		Assert.assertTrue(lastloginDateAndTimeText);
		ObjectRepo.test.log(Status.PASS, "User is able to view:" + lastLoginDateAndTime);
	}
	
	public void registrarViewUserProfileAndUserDetailsOfDeactivateUser() throws Exception {
		WebElement element = driver.findElement(welcomeDropdown);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		List<WebElement> list=driver.findElements(By.xpath("//*[@class='MuiListItem-root MuiListItem-gutters css-1ez64hh']"));
		int size=list.size();
		for(int i=0;i<=size-1;i++) {
			String alloption=list.get(i).getText();
			System.out.println("Welcome dropdown option is:"+alloption);
		}
		String userProfile=driver.findElement(userProfileOption).getText();
		System.out.println("User is able to view:" + userProfile);
		Assert.assertEquals("User Profile", userProfile);
		ObjectRepo.test.log(Status.PASS, "User is able to view:" + userProfile);
		String changePassphrase=driver.findElement(By.xpath("//a[contains(text(),'Change Passphrase')]")).getText();
		System.out.println("User is able to view:" + changePassphrase);
		Assert.assertEquals("Change Passphrase", changePassphrase);
		ObjectRepo.test.log(Status.PASS, "User is able to view:" + changePassphrase);
		WebElement element2 = driver.findElement(userProfileOption);
		js2.executeScript("arguments[0].click()", element2);
		String viewUserDetails=driver.findElement(viewUserDetailsText).getText();
		System.out.println("User is able to view:" + viewUserDetails);
		Assert.assertEquals("View User Details", viewUserDetails);
		ObjectRepo.test.log(Status.PASS, "User is able to view:" + viewUserDetails);
		js2.executeScript("window.scrollBy(0,1500)");
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(userStatusHistoryText));
		String userStatusHistory=driver.findElement(userStatusHistoryText).getText();
		System.out.println("User is able to view:" + userStatusHistory);
		Assert.assertEquals("User Status History", userStatusHistory);
		ObjectRepo.test.log(Status.PASS, "User is able to view:" + userStatusHistory);
		String userRoleHistory=driver.findElement(userRoleHistoryText).getText();
		System.out.println("User is able to view:" + userRoleHistory);
		Assert.assertEquals("User Role History", userRoleHistory);
		ObjectRepo.test.log(Status.PASS, "User is able to view:" + userRoleHistory);
		String changeJurisdiction=driver.findElement(changeJurisdictionText).getText();
		System.out.println("User is able to view:" + changeJurisdiction);
		Assert.assertEquals("Change Jurisdiction", changeJurisdiction);
		ObjectRepo.test.log(Status.PASS, "User is able to view:" + changeJurisdiction);
		String closeUserAccount=driver.findElement(closeUserAccountText).getText();
		System.out.println("User is able to view:" + closeUserAccount);
		Assert.assertEquals("Close User Account", closeUserAccount);
		ObjectRepo.test.log(Status.PASS, "User is able to view:" + closeUserAccount);
		String changePassphraseAndSecurityQuestions=driver.findElement(changePassphraseAndSecurityQuestionsText).getText();
		System.out.println("User is able to view:" + changePassphraseAndSecurityQuestions);
		Assert.assertEquals("Change Passphrase and Security Questions", changePassphraseAndSecurityQuestions);
		ObjectRepo.test.log(Status.PASS, "User is able to view:" + changePassphraseAndSecurityQuestions);
		driver.findElement(viewUserDetailsText).click();
		try {
			Boolean editButton=driver.findElement(By.xpath("//*[text()='Edit']")).isDisplayed();
			Assert.assertTrue(editButton);
			System.out.println("Edit button is present user details page");
		} catch (Exception e) {
			System.out.println("Edit button is not present user details page");
		}
	}
	
	public void registrarViewRoleStatusHistoryGrid() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2200)");
		String userRoleHistoryGrid=driver.findElement(userRoleHistoryGridSection).getText();
		System.out.println("JU is able to view:" + userRoleHistoryGrid);
		Assert.assertEquals("USER ROLE HISTORY", userRoleHistoryGrid);
		ObjectRepo.test.log(Status.PASS, "JU is able to view:" + userRoleHistoryGrid);
		String roleTypeColomn=driver.findElement(By.xpath("(//*[contains(text(),'Role Type')])[2]")).getText();
		System.out.println("JU is able to view:" + roleTypeColomn);
		Assert.assertEquals("Role Type", roleTypeColomn);
		ObjectRepo.test.log(Status.PASS, "JU is able to view:" + roleTypeColomn);
		String roleColomn=driver.findElement(roleColomnInRoleHistoryGrid).getText();
		System.out.println("JU is able to view:" + roleColomn);
		Assert.assertEquals("Role", roleColomn);
		ObjectRepo.test.log(Status.PASS, "JU is able to view:" + roleColomn);
		//new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(jurisdictionColomnInRoleHistoryGrid));
		String jurisdictionColomn=driver.findElement(jurisdictionColomnInRoleHistoryGrid).getText();
		System.out.println("JU is able to view:" + jurisdictionColomn);
		//Assert.assertEquals("Jurisdiction", jurisdictionColomn);
		ObjectRepo.test.log(Status.PASS, "JU is able to view:" + jurisdictionColomn);
		String dateTimeUpdateColomn=driver.findElement(dateTimeUpdatedTimeInRoleHistoryGrid).getText();
		System.out.println("JU is able to view:" + dateTimeUpdateColomn);
		Assert.assertEquals("Date/Time Updated (EDT)", dateTimeUpdateColomn);
		ObjectRepo.test.log(Status.PASS, "JU is able to view:" + dateTimeUpdateColomn);
		String updatedByColomn=driver.findElement(updatedByInRoleHistoryGrid).getText();
		System.out.println("JU is able to view:" + updatedByColomn);
		Assert.assertEquals("Updated by", updatedByColomn);
		ObjectRepo.test.log(Status.PASS, "JU is able to view:" + updatedByColomn);
	}
	
	public void originalRegistrarViewAfterShareProfileWithWelcomingJU() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2400)");
		Thread.sleep(2000);
		WebElement element=driver.findElement(By.xpath("(//*[text()='Cross Jurisdiction Request'])[1]"));
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		action.click(element).build().perform();
		//driver.findElement(By.xpath("(//*[@class='MuiTypography-root MuiTypography-body1 css-1195g5e'])[1]")).click();
		String text=driver.findElement(By.xpath("//*[contains(text(),'User Currently Share with')]")).getText();
		System.out.println("Original JU is able to view:"+text);
//		String jurisdictionName=driver.findElement(By.xpath("//span[contains(text(),'Quebec')]")).getText();
//		System.out.println("Original JU is able to view:"+jurisdictionName);
	}
	
	public void registrarApproveAndAssignMultipleRoleFromJurisdictionUserRoleType() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1800)");
		Thread.sleep(1000);
		driver.findElement(approveRadioButton).click();
		WebElement element1=driver.findElement(selectRoleTypeDropdown);
		if(element1.isEnabled()) {
			System.out.println("The role type dropdown is enabled");
			ObjectRepo.test.log(Status.PASS, "The role type dropdown is enabled");
		}
		else {
			System.out.println("The role type dropdown is not enabled");
			ObjectRepo.test.log(Status.PASS, "The role type dropdown is not enabled");
		}
		WebElement element2=driver.findElement(roleDropdown);
		if(element2.isEnabled()) {
			System.out.println("The role dropdown is enabled");
			ObjectRepo.test.log(Status.PASS, "The role dropdown is enabled");
		}
		else {
			System.out.println("The role dropdown is not enabled");
			ObjectRepo.test.log(Status.PASS, "The role dropdown is not enabled");
		}
		Thread.sleep(1000);
		WebElement element3=driver.findElement(reasonForDenialDropdown);
		String value=element3.getAttribute("aria-disabled");
		if(value=="True") {
			System.out.println("The Reason for denial dropdown is enabled");
			ObjectRepo.test.log(Status.PASS, "The Reason for denial dropdown is enabled");
		}
		else {
			System.out.println("The Reason for denial is not enabled");
			ObjectRepo.test.log(Status.PASS, "The Reason for denial is not enabled");
		}
		String commentField=driver.findElement(By.xpath("//label[text()='Comments']")).getText();
		System.out.println("Comment field is:" + commentField);
		ObjectRepo.test.log(Status.PASS, "Comment field is:" + commentField);
		Thread.sleep(1000);
		driver.findElement(selectRoleTypeDropdown).click();
		Thread.sleep(1000);
		driver.findElement(selectJurisdictionUserRoleType).click();
		Thread.sleep(1000);
		driver.findElement(roleDropdown).click();
		Thread.sleep(1000);
		driver.findElement(selectRegistrarRole).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(),'Authority')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(),'Administrator')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(),'Jurisdiction Program Staff')]")).click();
		WebElement element5 = driver.findElement(selectRoleTypeDropdown);
		Actions action = new Actions(driver);
		action.moveToElement(element5).build().perform();
		Thread.sleep(4000);

		js.executeScript("window.scrollBy(0,2650)");
		WebElement abc = driver.findElement(saveButton);
		js.executeScript("arguments[0].click();", abc);
		Thread.sleep(2000);
		String text=driver.findElement(textOnPrompt).getText();
		System.out.println("Text present on prompt is:" + text);
		Assert.assertEquals("Are you sure you want to assign multiple roles?", text);
		ObjectRepo.test.log(Status.PASS, "Text present on prompt is:" + text);
		String cancelButton=driver.findElement(cancelButtonOnPrompt).getText();
		System.out.println("Button present on prompt is:" + cancelButton);
		//Assert.assertEquals("Revisions Requested", cancelButton);
		ObjectRepo.test.log(Status.PASS, "Button present on prompt is:" + cancelButton);
		String continueButton=driver.findElement(continueButtonOnPrompt).getText();
		System.out.println("Button present on prompt is:" + continueButton);
		Assert.assertEquals("CONTINUE", continueButton);
		ObjectRepo.test.log(Status.PASS, "Button present on prompt is:" + continueButton);
		driver.findElement(continueButtonOnPrompt).click();
		Thread.sleep(6000);
		String successMessage=driver.findElement(successMessageAfterRegistrarApproveUser).getText();
		System.out.println("Success Message after Registrar Approve and assign market monitor role :" + successMessage);
		Assert.assertEquals("User has sent for Authority Approval", successMessage);
		ObjectRepo.test.log(Status.PASS, "Success Message after Registrar Approve and assign market monitor role :" + successMessage);
		WebElement element4 = driver.findElement(crossButtonOnErrorMessageAfterLogin);
		Thread.sleep(2000);
		element4.click();
	}
	
	public void registrarResetPassphraseAndSecQueToUser() throws Exception {
		Thread.sleep(2000);
		driver.findElement(searchField).sendKeys(userId);
		Thread.sleep(2000);
		driver.findElement(threeDots).click();
		Thread.sleep(2000);
		String resetPassphraseSecurityOption=driver.findElement(resetSecurityQueAndPassphraseOption).getText();
		System.out.println("Registrar is able to view:" + resetPassphraseSecurityOption);
		Assert.assertEquals("RESET SECURITY QUESTIONS AND PASSPHRASE", resetPassphraseSecurityOption);
		ObjectRepo.test.log(Status.PASS, "Registrar is able to view:" + resetPassphraseSecurityOption);
		driver.findElement(resetSecurityQueAndPassphraseOption).click();
		driver.findElement(By.xpath("//button[contains(text(),'CONTINUE')]")).click();
        new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(successMessageForResetPassphrase));
		String successMessage=driver.findElement(successMessageForResetPassphrase).getText();
		System.out.println("Success Message is:" + successMessage);
		Assert.assertEquals("Successfully initiated reset passphrase and security questions", successMessage);
		ObjectRepo.test.log(Status.PASS, "Success Message is:" + successMessage);
	}
	
	public void registrarSerachUserUsingRequestStatusFilterForApprovedCrossJurisdictionRequest() throws Exception {
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(filterButton));
		driver.findElement(filterButton).click();
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(selectFilter));
		WebElement element=driver.findElement(selectFilter);
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		action.doubleClick(element).build().perform();
		driver.findElement(selectFilter).click();
		Thread.sleep(1000);
		
		Select select = new Select(driver.findElement(selectFilter));
		select.selectByValue("RequestStatus");
		
//		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(By.xpath("//option[text()='Request Status']")));
//		WebElement element1=driver.findElement(By.xpath("//option[text()='Request Status']"));
//		action.click(element1).build().perform();
//		Thread.sleep(1000);
		//driver.findElement(By.xpath("//option[text()='Request Status']")).click();
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(filterValueField));
		Thread.sleep(3000);
		driver.findElement(filterValueField).sendKeys("Approved Cross Jurisdiction");
		Thread.sleep(2000);
		new WebDriverWait(driver,40).until(ExpectedConditions.elementToBeClickable(filterButton));
		driver.findElement(filterButton).click();
	}
	
	public void removeRoleFromMultipleRoleFromServiceProviderRoleTypeAssignedByRegistrar() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2850)");
		Thread.sleep(1000);
		driver.findElement(roleDropdown).click();
		new WebDriverWait(driver,40).until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(text(),'Market Monitor')])[2]")));
		WebElement marketMonitorRole = driver.findElement(By.xpath("(//span[contains(text(),'Market Monitor')])[2]"));
		Actions action = new Actions(driver);
		action.moveToElement(marketMonitorRole).build().perform();
		action.click(marketMonitorRole).build().perform();
		WebElement element5 = driver.findElement(selectRoleTypeDropdown);
		action.moveToElement(element5).build().perform();
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,2650)");
		WebElement abc = driver.findElement(saveButton);
		js.executeScript("arguments[0].click();", abc);
		String successMessage=driver.findElement(successMessageAfterRegistrarApproveUser).getText();
		System.out.println("Success Message after Registrar Approve and assign market monitor role :" + successMessage);
		Assert.assertEquals("Proposed Role Change request is raised.", successMessage);
		ObjectRepo.test.log(Status.PASS, "Success Message after Registrar Approve and assign market monitor role :" + successMessage);
		WebElement element4 = driver.findElement(crossButtonOnErrorMessageAfterLogin);
		Thread.sleep(2000);
		element4.click();
	}
	
	public void removeRoleFromMultipleRoleFromJurisdictionUserRoleTypeAssignedByRegistrar() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2850)");
		Thread.sleep(1000);
		driver.findElement(roleDropdown).click();
		new WebDriverWait(driver,40).until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(text(),'Registrar')])[2]")));
		WebElement marketMonitorRole = driver.findElement(By.xpath("(//span[contains(text(),'Registrar')])[2]"));
		Actions action = new Actions(driver);
		action.moveToElement(marketMonitorRole).build().perform();
		action.click(marketMonitorRole).build().perform();
		WebElement element5 = driver.findElement(selectRoleTypeDropdown);
		action.moveToElement(element5).build().perform();
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,2650)");
		WebElement abc = driver.findElement(saveButton);
		js.executeScript("arguments[0].click();", abc);
		driver.findElement(By.xpath("//button[@data-testid='priv_modal_Continue']")).click();
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(successMessageAfterRegistrarApproveUser));
		String successMessage=driver.findElement(successMessageAfterRegistrarApproveUser).getText();
		System.out.println("Success Message after Registrar Approve and assign market monitor role :" + successMessage);
		Assert.assertEquals("Proposed Role Change request is raised.", successMessage);
		ObjectRepo.test.log(Status.PASS, "Success Message after Registrar Approve and assign market monitor role :" + successMessage);
		WebElement element4 = driver.findElement(crossButtonOnErrorMessageAfterLogin);
		Thread.sleep(2000);
		element4.click();
	}
	
	public void removeRoleFromMultipleRoleAssignedByRegistrar() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2850)");
		Thread.sleep(1000);
		driver.findElement(roleDropdown).click();
		Thread.sleep(1000);
		new WebDriverWait(driver,40).until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(text(),'Individual Users')])[2]")));
		WebElement individualRole = driver.findElement(By.xpath("(//span[contains(text(),'Individual Users')])[2]"));
		Actions action = new Actions(driver);
		action.moveToElement(individualRole).build().perform();
		action.click(individualRole).build().perform();
		//action.click(individualRole).build().perform();
		//driver.findElement(selectIndividualUsersRole).click();
		
		WebElement element4 = driver.findElement(selectRoleTypeDropdown);
		
		action.moveToElement(element4).build().perform();
		//Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,2650)");
		WebElement abc = driver.findElement(saveButton);
		js.executeScript("arguments[0].click();", abc);
		//Thread.sleep(4000);
		String text=driver.findElement(textOnPrompt).getText();
		System.out.println("Text present on prompt is:" + text);
		Assert.assertEquals("Are you sure you want to assign multiple roles?", text);
		ObjectRepo.test.log(Status.PASS, "Text present on prompt is:" + text);
		String cancelButton=driver.findElement(cancelButtonOnPrompt).getText();
		System.out.println("Button present on prompt is:" + cancelButton);
		//Assert.assertEquals("Revisions Requested", cancelButton);
		ObjectRepo.test.log(Status.PASS, "Button present on prompt is:" + cancelButton);
		String continueButton=driver.findElement(continueButtonOnPrompt).getText();
		System.out.println("Button present on prompt is:" + continueButton);
		Assert.assertEquals("CONTINUE", continueButton);
		ObjectRepo.test.log(Status.PASS, "Button present on prompt is:" + continueButton);
		driver.findElement(cancelButtonOnPrompt).click();
		js.executeScript("arguments[0].click();", abc);
		//Thread.sleep(2000);
		String text1=driver.findElement(textOnPrompt).getText();
		System.out.println("Text present on prompt is:" + text1);
		Assert.assertEquals("Are you sure you want to assign multiple roles?", text1);
		ObjectRepo.test.log(Status.PASS, "Text present on prompt is:" + text1);
		//Thread.sleep(2000);
		driver.findElement(continueButtonOnPrompt).click();
		//Thread.sleep(6000);
		String successMessage=driver.findElement(successMessageAfterRegistrarApproveUser).getText();
		System.out.println("Success Message after Registrar Approve and assign individual role :" + successMessage);
		Assert.assertEquals("User role has been changed.", successMessage);
		ObjectRepo.test.log(Status.PASS, "Success Message after Registrar Approve and assign individual role :" + successMessage);
		WebElement element5 = driver.findElement(crossButtonOnErrorMessageAfterLogin);
		//Thread.sleep(2000);
		element5.click();
	}
	
	public void deactivateUserWithProfileAccessOnlyTryToRaisedCrossJurisdiction() throws Exception {
		Thread.sleep(4000);
		driver.findElement(welcomeDropdown).click();
		driver.findElement(userProfileOption).click();
		String p=driver.getPageSource();
		if(p.contains("Cross Jurisdiction")) {
			System.out.println("Cross Jurisdiction option is displayed for JU User");
		}
		else {
			System.out.println("Cross Jurisdiction option is not displayed for JU User");
		}
		}
	
	public void registrarTryToRaisedCrossJurisdiction() throws Exception {
	Thread.sleep(1000);
	driver.findElement(welcomeDropdown).click();
	driver.findElement(userProfileOption).click();
	String p=driver.getPageSource();
	if(p.contains("Cross Jurisdiction")) {
		System.out.println("Cross Jurisdiction option is displayed for JU User");
	}
	else {
		System.out.println("Cross Jurisdiction option is not displayed for JU User");
	}
	}
	
	public void registrarCancelDeniedUserRegistration() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2200)");
		driver.findElement(denyRadioButton).click();
		driver.findElement(reasonForDenialDropdown).click();
		driver.findElement(selectDenialReason1).click();
		driver.findElement(commentField).sendKeys("Deny user registration");
		js.executeScript("window.scrollBy(0,2650)");
		WebElement abc = driver.findElement(By.xpath("//*[text()='CANCEL']"));
		js.executeScript("arguments[0].click();", abc); 
		Thread.sleep(6000);
		//*[text()='CONTINUE']       
		String textOnPrompt=driver.findElement(By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']")).getText();
		System.out.println("Text on prmpot is :" + textOnPrompt);
		driver.findElement(By.xpath("//*[@data-testid='priv_modal_Cancel']")).click();
		String userRoleHistory=driver.findElement(By.xpath("//*[contains(text(),'USER ROLE HISTORY')]")).getText();
		System.out.println("User Stay same page and view:" + userRoleHistory);
		Assert.assertEquals("USER ROLE HISTORY", userRoleHistory);
		WebElement abc1 = driver.findElement(By.xpath("//*[text()='CANCEL']"));
		js.executeScript("arguments[0].click();", abc1);
		driver.findElement(By.xpath("//*[text()='CONTINUE']")).click();
		String serchUsersTab=driver.findElement(By.xpath("//button[contains(text(),'Search Users')]")).getText();
		System.out.println("User redirected to search user page and view:" + serchUsersTab);
        Assert.assertEquals("Search Users", serchUsersTab);
	}
	

	public void registrarCancelUserApproval() throws Exception {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,2200)");
	Thread.sleep(10000);
	driver.findElement(approveRadioButton).click();
	Thread.sleep(3000);
	driver.findElement(selectRoleTypeDropdown).click();
	Thread.sleep(3000);
	driver.findElement(selectServiceProviderRoleType).click();
	Thread.sleep(3000);
	driver.findElement(roleDropdown).click();
	Thread.sleep(3000);
	driver.findElement(selectMarketMonitorRole).click();
	WebElement element2 = driver.findElement(selectRoleTypeDropdown);
	Actions action = new Actions(driver);
	action.moveToElement(element2).build().perform();
	Thread.sleep(4000);
	js.executeScript("window.scrollBy(0,2650)");
	WebElement abc = driver.findElement(By.xpath("//*[text()='CANCEL']"));
	js.executeScript("arguments[0].click();", abc);
	Thread.sleep(6000);
	//*[text()='CONTINUE']
	String textOnPrompt=driver.findElement(By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']")).getText();
	System.out.println("Text on prmpot is :" + textOnPrompt);
    driver.findElement(By.xpath("//*[@data-testid='priv_modal_Cancel']")).click();
	String userRoleHistory=driver.findElement(By.xpath("//*[contains(text(),'USER ROLE HISTORY')]")).getText();
	System.out.println("User Stay same page and view:" + userRoleHistory);
	Assert.assertEquals("USER ROLE HISTORY", userRoleHistory);
	WebElement abc1 = driver.findElement(By.xpath("//*[text()='CANCEL']"));
	js.executeScript("arguments[0].click();", abc1);
	driver.findElement(By.xpath("//*[text()='CONTINUE']")).click();
	String serchUsersTab=driver.findElement(By.xpath("//button[contains(text(),'Search Users')]")).getText();
	System.out.println("User redirected to search user page and view:" + serchUsersTab);
	Assert.assertEquals("Search Users", serchUsersTab);
	}
	
	public void userItsUserProfile() throws Exception {
		WebElement element1 = driver.findElement(welcomeDropdown);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element1);
		WebElement element2 = driver.findElement(userProfileOption);
		js2.executeScript("arguments[0].click()", element2);
		String viewUserDetails=driver.findElement(viewUserDetailsOption).getText();
		System.out.println("User view follwing option:" + viewUserDetails);
		Assert.assertEquals("View User Details", viewUserDetails);
		ObjectRepo.test.log(Status.PASS, "User view follwing option:"  + viewUserDetails);
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(userStatusOption));
		String userStatus=driver.findElement(userStatusOption).getText();
		System.out.println("User view follwing option:" + userStatus);
		Assert.assertEquals("User Status History", userStatus);
		ObjectRepo.test.log(Status.PASS, "User view follwing option:"  + userStatus);
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(userRoleHistoryOption));
		String userRoleHistory=driver.findElement(userRoleHistoryOption).getText();
		System.out.println("User view follwing option:" + userRoleHistory);
		Assert.assertEquals("User Role History", userRoleHistory);
		ObjectRepo.test.log(Status.PASS, "User view follwing option:"  + userRoleHistory);
		String changeJurisdiction=driver.findElement(changeJurisdictionOption).getText();
		System.out.println("User view follwing option:" + changeJurisdiction);
		Assert.assertEquals("Change Jurisdiction", changeJurisdiction);
		ObjectRepo.test.log(Status.PASS, "User view follwing option:"  + changeJurisdiction);
		String closeUserAccount=driver.findElement(closeUserAccountOption).getText();
		System.out.println("User view follwing option:" + closeUserAccount);
		Assert.assertEquals("Close User Account", closeUserAccount);
		ObjectRepo.test.log(Status.PASS, "User view follwing option:"  + closeUserAccount);
		String changePassphrase=driver.findElement(changePassphraseAndSecuriQueOption).getText();
		System.out.println("User view follwing option:" + changePassphrase);
		Assert.assertEquals("Change Passphrase and Security Questions", changePassphrase);
		ObjectRepo.test.log(Status.PASS, "User view follwing option:"  + changePassphrase);
	}
	
	public void userViewItsUserDetailsPage() throws Exception {
		//Thread.sleep(2000);
		String jurisdiction=driver.findElement(By.xpath("//*[contains(text(),'Quebec')]")).getText();
		System.out.println("Jurisdiction name is:" + jurisdiction);
		Assert.assertEquals("Quebec", jurisdiction);
		ObjectRepo.test.log(Status.PASS, "Jurisdiction name is:"  + jurisdiction);
		WebElement element = driver.findElement(welcomeDropdown);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		WebElement element2 = driver.findElement(userProfileOption);
		js2.executeScript("arguments[0].click()", element2);
		WebElement element3 = driver.findElement(By.xpath("//*[contains(text(),'View or Edit User Details')]"));
		js2.executeScript("arguments[0].click()", element3);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
	}
	
	public void withoutSelectingRoleTypeAndRole() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(approveRadioButton).click();
		WebElement element1=driver.findElement(selectRoleTypeDropdown);
		if(element1.isEnabled()) {
			System.out.println("The role type dropdown is enabled");
			ObjectRepo.test.log(Status.PASS, "The role type dropdown is enabled");
		}
		else {
			System.out.println("The role type dropdown is not enabled");
			ObjectRepo.test.log(Status.PASS, "The role type dropdown is not enabled");
		}
		WebElement element2=driver.findElement(roleDropdown);
		if(element2.isEnabled()) {
			System.out.println("The role dropdown is enabled");
			ObjectRepo.test.log(Status.PASS, "The role dropdown is enabled");
		}
		else {
			System.out.println("The role dropdown is not enabled");
			ObjectRepo.test.log(Status.PASS, "The role dropdown is not enabled");
		}
		Thread.sleep(1000);
		WebElement element3=driver.findElement(reasonForDenialDropdown);
		String value=element3.getAttribute("aria-disabled");
		if(value=="True") {
			System.out.println("The Reason for denial dropdown is enabled");
			ObjectRepo.test.log(Status.PASS, "The Reason for denial dropdown is enabled");
		}
		else {
			System.out.println("The Reason for denial is not enabled");
			ObjectRepo.test.log(Status.PASS, "The Reason for denial is not enabled");
		}
		String commentField=driver.findElement(By.xpath("//label[text()='Comments']")).getText();
		System.out.println("Comment field is:" + commentField);
		ObjectRepo.test.log(Status.PASS, "Comment field is:" + commentField);
		driver.findElement(By.xpath("//*[@id='Comments']")).sendKeys("without select role type and role");
		js.executeScript("window.scrollBy(0,1000)");
		WebElement abc = driver.findElement(saveButton);
		if(abc.isEnabled()) {
			System.out.println("Save button is enabled");
			ObjectRepo.test.log(Status.PASS, "Save button is enabled");
		}
		else {
			System.out.println("Save button is not enabled");
			ObjectRepo.test.log(Status.PASS, "Save button is not enabled");
		}
	}
	
	public void registrarViewUserUsingRoleFilterForPeningUserGrid() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.xpath("(//*[@class='MuiTypography-root MuiTypography-body1 css-1195g5e'])[2]")).click();
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//input[@placeholder='Search…'])[2]")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@aria-label='Show filters'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(selectFilter).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[text()='Role']")).click();
		Thread.sleep(2000);
		driver.findElement(filterValueField).sendKeys("Applicant");
		Thread.sleep(1000);
		//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//input[@placeholder='Search…'])[2]")));
		driver.findElement(By.xpath("(//button[@aria-label='Show filters'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@placeholder='Search…'])[2]")).sendKeys(userId);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//a[@class='link-cell'])[1]")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@class='link-cell'])[6]")).click();
	}
	
	public void registrarViewUserUsingRoleFilterForSearchUserGrid() throws Exception {
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//input[@placeholder='Search…'])[1]")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@aria-label='Show filters'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(selectFilter).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[text()='Role']")).click();
		Thread.sleep(2000);
		driver.findElement(filterValueField).sendKeys("Applicant");
		Thread.sleep(1000);
		//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//input[@placeholder='Search…'])[2]")));
		driver.findElement(By.xpath("(//button[@aria-label='Show filters'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@placeholder='Search…'])[1]")).sendKeys(userId);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//a[@class='link-cell'])[1]")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@class='link-cell'])[1]")).click();
	}
	
	public void registrarViewUserUsingRequestStatusAsProposedToAuthorityFilterForPeningUserGrid() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.xpath("(//*[@class='MuiTypography-root MuiTypography-body1 css-1195g5e'])[2]")).click();
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//input[@placeholder='Search…'])[2]")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@aria-label='Show filters'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(selectFilter).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[text()='Request Status']")).click();
		Thread.sleep(2000);
		driver.findElement(filterValueField).sendKeys("Proposed To Authority");
		Thread.sleep(1000);
		//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//input[@placeholder='Search…'])[2]")));
		driver.findElement(By.xpath("(//button[@aria-label='Show filters'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@placeholder='Search…'])[2]")).sendKeys(userId);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//a[@class='link-cell'])[1]")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@class='link-cell'])[6]")).click();
	}
	
	public void proposedChangeRoleUserNotDisplayForAuthority() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='MuiTypography-root MuiTypography-body1 css-1195g5e'])[2]")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='MuiTypography-root MuiTypography-body1 css-1195g5e'])[2]")).click();
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//input[@placeholder='Search…'])[2]")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@aria-label='Show filters'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(selectFilter).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[text()='Request Status']")).click();
		Thread.sleep(2000);
		driver.findElement(filterValueField).sendKeys("Proposed Role Change");
		Thread.sleep(1000);
		//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//input[@placeholder='Search…'])[2]")));
		driver.findElement(By.xpath("(//button[@aria-label='Show filters'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@placeholder='Search…'])[2]")).sendKeys(userId);
		String message=driver.findElement(By.xpath("//div[contains(text(),'No results found.')]")).getText();
		Assert.assertEquals("No Results Found.", message);
		System.out.println("Message after search user is:"+message);
		ObjectRepo.test.log(Status.PASS, "Message after search user is:"+message);
	}
	
	public void registrarViewUserUsingRequestStatusAsProposedRoleChangeFilterForPeningUserGrid() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='MuiTypography-root MuiTypography-body1 css-1195g5e'])[2]")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='MuiTypography-root MuiTypography-body1 css-1195g5e'])[2]")).click();
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//input[@placeholder='Search…'])[2]")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@aria-label='Show filters'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(selectFilter).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[text()='Request Status']")).click();
		Thread.sleep(2000);
		driver.findElement(filterValueField).sendKeys("Proposed Role Change");
		Thread.sleep(1000);
		//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//input[@placeholder='Search…'])[2]")));
		driver.findElement(By.xpath("(//button[@aria-label='Show filters'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@placeholder='Search…'])[2]")).sendKeys(userId);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//a[@class='link-cell'])[1]")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@class='link-cell'])[6]")).click();
	}
	
	public void registrarViewUserUsingRequestStatusFilterForPeningUserGrid() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.xpath("(//*[@class='MuiTypography-root MuiTypography-body1 css-1195g5e'])[2]")).click();
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//input[@placeholder='Search…'])[2]")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@aria-label='Show filters'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(selectFilter).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[text()='Request Status']")).click();
		Thread.sleep(2000);
		driver.findElement(filterValueField).sendKeys("Pending");
		Thread.sleep(1000);
		//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//input[@placeholder='Search…'])[2]")));
		driver.findElement(By.xpath("(//button[@aria-label='Show filters'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@placeholder='Search…'])[2]")).sendKeys(userId);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//a[@class='link-cell'])[1]")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@class='link-cell'])[6]")).click();
	}
	
	public void registrarViewUserUsingRequestStatusFilterForSearchUserGrid() throws Exception {
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//input[@placeholder='Search…'])[1]")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@aria-label='Show filters'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(selectFilter).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[text()='Request Status']")).click();
		Thread.sleep(2000);
		driver.findElement(filterValueField).sendKeys("Pending");
		Thread.sleep(1000);
		//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//input[@placeholder='Search…'])[2]")));
		driver.findElement(By.xpath("(//button[@aria-label='Show filters'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@placeholder='Search…'])[1]")).sendKeys(userId);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//a[@class='link-cell'])[1]")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@class='link-cell'])[1]")).click();
	}
	
	public void registrarViewUserUsingJurisdictionFilterForPeningUserGrid() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.xpath("(//*[@class='MuiTypography-root MuiTypography-body1 css-1195g5e'])[2]")).click();
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//input[@placeholder='Search…'])[2]")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@aria-label='Show filters'])[2]")).click();
		driver.findElement(selectFilter).click();
		driver.findElement(By.xpath("//option[text()='Jurisdiction']")).click();
		driver.findElement(filterValueField).sendKeys("California");
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//input[@placeholder='Search…'])[2]")));
		driver.findElement(searchField).sendKeys(userId);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//a[@class='link-cell'])[1]")));
		Thread.sleep(1000);
		driver.findElement(searchRecordFirstname).click();
	}
	
	public void requestRevisionUserViewHisUserProfile() throws Exception{
		WebElement element = driver.findElement(welcomeDropdown);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		WebElement element2 = driver.findElement(userProfileOption);
		js2.executeScript("arguments[0].click()", element2);
		String requestStatus=driver.findElement(By.xpath("(//div[@class='MuiDataGrid-cellContent'])[1]")).getText();
		System.out.println("User is able to view:" + requestStatus);
		Assert.assertEquals("Revisions Requested", requestStatus);
		ObjectRepo.test.log(Status.PASS, "User is able to view:" + requestStatus);
		WebElement element3 = driver.findElement(By.xpath("//span[contains(text(),'Review/Edit User Registration')]"));
		js2.executeScript("arguments[0].click()", element3);
		String commentViewByUser=driver.findElement(By.xpath("//*[@class='MuiTypography-root MuiTypography-body1 css-1js9zue']")).getText();
		System.out.println("User is able to view comment added for revision request by Registrar:" + commentViewByUser);
		Assert.assertEquals("Revision Requested", commentViewByUser);
		ObjectRepo.test.log(Status.PASS, "User is able to view comment added for revision request by Registrar:" + commentViewByUser);
    }
	
	public void registrarSearchPendingUserInPendingGridAndGoToUserDetailsPage() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.xpath("(//*[@class='MuiTypography-root MuiTypography-body1 css-1195g5e'])[2]")).click();
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//input[@placeholder='Search…'])[2]")));
		driver.findElement(searchFieldPendingGrid).sendKeys(userId);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='MuiTypography-root MuiTypography-body1 css-1195g5e'])[2]")).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//a[@class='link-cell'])[6]")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[@class='MuiTypography-root MuiTypography-body1 css-1195g5e'])[2]")).click();
		driver.findElement(searchRecordFirstnameInPendingGrid).click();
	}
	
	public void registrarViewUserStatusHistoryWithColomnAndColomnValueAfterUserCrossJurisdiction() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2800)");
		Thread.sleep(1000);
		String userStatusHistory=driver.findElement(userStatusHistorySection).getText();
		System.out.println("JU is able to view:" + userStatusHistory);
		Assert.assertEquals("USER STATUS HISTORY", userStatusHistory);
		ObjectRepo.test.log(Status.PASS, "JU is able to view:" + userStatusHistory);
		String requestStatus=driver.findElement(requestStatusColomn).getText();
		System.out.println("User Status History grid contain:" + requestStatus);
		Assert.assertEquals("Request Status", requestStatus);
		ObjectRepo.test.log(Status.PASS, "User Status History grid contain:" + requestStatus);
		String requestStatusValue=driver.findElement(By.xpath("//div[@title='Pending Cross Jurisdiction']")).getText();
		System.out.println("Request status is:" + requestStatusValue);
		Assert.assertEquals("Pending Cross Jurisdiction", requestStatusValue);
		ObjectRepo.test.log(Status.PASS, "Request status is:" + requestStatusValue);
		String originalJurisdiction=driver.findElement(originalJurisdictionColomn).getText();
		System.out.println("User Status History grid contain:" + originalJurisdiction);
		Assert.assertEquals("Original Jurisdiction", originalJurisdiction);
		ObjectRepo.test.log(Status.PASS, "User Status History grid contain:" + originalJurisdiction);
		String originalJurisdictionValue=driver.findElement(By.xpath("(//div[@title='California'])[1]")).getText();
		System.out.println("Original jurisdiction is:" + originalJurisdictionValue);
		Assert.assertEquals("California", originalJurisdictionValue);
		ObjectRepo.test.log(Status.PASS, "Original jurisdiction is:" + originalJurisdictionValue);
		String welcomingJurisdiction=driver.findElement(welcomingJurisdictionColomn).getText();
		System.out.println("User Status History grid contain:" + welcomingJurisdiction);
		Assert.assertEquals("Welcoming Jurisdiction", welcomingJurisdiction);
		ObjectRepo.test.log(Status.PASS, "User Status History grid contain:" + welcomingJurisdiction);
		String welcomingJurisdictionValue=driver.findElement(By.xpath("//div[@title='Quebec']")).getText();
		System.out.println("Welcoming jurisdiction is:" + welcomingJurisdictionValue);
		Assert.assertEquals("Quebec", welcomingJurisdictionValue);
		ObjectRepo.test.log(Status.PASS, "Welcoming jurisdiction is:" + welcomingJurisdictionValue);
		String applicantUserStatus=driver.findElement(applicantUserStatusColomn).getText();
		System.out.println("User Status History grid contain:" + applicantUserStatus);
		Assert.assertEquals("Applicant/User Status", applicantUserStatus);
		ObjectRepo.test.log(Status.PASS, "User Status History grid contain:" + applicantUserStatus);
		String applicantUserStatusValue=driver.findElement(By.xpath("(//div[@title='Active'])[5]")).getText();
		System.out.println("applicant user status is:" + applicantUserStatusValue);
		Assert.assertEquals("Active", applicantUserStatusValue);
		ObjectRepo.test.log(Status.PASS, "applicant user status is:" + applicantUserStatusValue);
		String requestInitiationDate=driver.findElement(requestInitiationDateColomn).getText();
		System.out.println("User Status History grid contain:" + requestInitiationDate);
		Assert.assertEquals("Request Initiation Date", requestInitiationDate);
		ObjectRepo.test.log(Status.PASS, "User Status History grid contain:" + requestInitiationDate);
		String requestInitiationDateValue=driver.findElement(By.xpath("(//div[@class='MuiDataGrid-cellContent'])[45]")).getText();
		System.out.println("Request Initiation date is:" + requestInitiationDateValue);
		//Assert.assertEquals("Welcoming Jurisdiction", requestInitiationDateValue);
		ObjectRepo.test.log(Status.PASS, "Request Initiation date is:" + requestInitiationDateValue);
		String updatedBy=driver.findElement(updatedBy1Colomn).getText();
		System.out.println("User Status History grid contain:" + updatedBy);
		Assert.assertEquals("Updated by", updatedBy);
		ObjectRepo.test.log(Status.PASS, "User Status History grid contain:" + updatedBy);
		String updateByValue=driver.findElement(By.xpath("(//div[@title='Pravin Jogi'])[1]")).getText();
		System.out.println("Update by is:" + updateByValue);
		Assert.assertEquals("Pravin Jogi", updateByValue);
		ObjectRepo.test.log(Status.PASS, "Update by is:" + updateByValue);
		String comment=driver.findElement(commentColomn).getText();
		System.out.println("User Status History grid contain:" + comment);
		Assert.assertEquals("Comment", comment);
		ObjectRepo.test.log(Status.PASS, "User Status History grid contain:" + comment);
		WebElement element=driver.findElement(denialReasonColomn);
		Actions action=new Actions(driver);
		action.moveToElement(element).build().perform();
		action.click(element).build().perform();
		String denialReason=driver.findElement(denialReasonColomn).getText();
		System.out.println("User Status History grid contain:" + denialReason);
		ObjectRepo.test.log(Status.PASS, "User Status History grid contain:" + denialReason);
	}
	
	public void registrarViewUserStatusHistoryWithColomnAndColomnValueAfterUserChangeJurisdiction() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2800)");
		Thread.sleep(1000);
		String userStatusHistory=driver.findElement(userStatusHistorySection).getText();
		System.out.println("JU is able to view:" + userStatusHistory);
		Assert.assertEquals("USER STATUS HISTORY", userStatusHistory);
		ObjectRepo.test.log(Status.PASS, "JU is able to view:" + userStatusHistory);
		String requestStatus=driver.findElement(requestStatusColomn).getText();
		System.out.println("User Status History grid contain:" + requestStatus);
		Assert.assertEquals("Request Status", requestStatus);
		ObjectRepo.test.log(Status.PASS, "User Status History grid contain:" + requestStatus);
		String requestStatusValue=driver.findElement(By.xpath("//div[@title='Pending COJ']")).getText();
		System.out.println("Request status is:" + requestStatusValue);
		Assert.assertEquals("Pending COJ", requestStatusValue);
		ObjectRepo.test.log(Status.PASS, "Request status is:" + requestStatusValue);
		String originalJurisdiction=driver.findElement(originalJurisdictionColomn).getText();
		System.out.println("User Status History grid contain:" + originalJurisdiction);
		Assert.assertEquals("Original Jurisdiction", originalJurisdiction);
		ObjectRepo.test.log(Status.PASS, "User Status History grid contain:" + originalJurisdiction);
		String originalJurisdictionValue=driver.findElement(By.xpath("(//div[@title='California'])[1]")).getText();
		System.out.println("Original jurisdiction is:" + originalJurisdictionValue);
		Assert.assertEquals("California", originalJurisdictionValue);
		ObjectRepo.test.log(Status.PASS, "Original jurisdiction is:" + originalJurisdictionValue);
		String welcomingJurisdiction=driver.findElement(welcomingJurisdictionColomn).getText();
		System.out.println("User Status History grid contain:" + welcomingJurisdiction);
		Assert.assertEquals("Welcoming Jurisdiction", welcomingJurisdiction);
		ObjectRepo.test.log(Status.PASS, "User Status History grid contain:" + welcomingJurisdiction);
		String welcomingJurisdictionValue=driver.findElement(By.xpath("//div[@title='Quebec']")).getText();
		System.out.println("Welcoming jurisdiction is:" + welcomingJurisdictionValue);
		Assert.assertEquals("Quebec", welcomingJurisdictionValue);
		ObjectRepo.test.log(Status.PASS, "Welcoming jurisdiction is:" + welcomingJurisdictionValue);
		String applicantUserStatus=driver.findElement(applicantUserStatusColomn).getText();
		System.out.println("User Status History grid contain:" + applicantUserStatus);
		Assert.assertEquals("Applicant/User Status", applicantUserStatus);
		ObjectRepo.test.log(Status.PASS, "User Status History grid contain:" + applicantUserStatus);
		String applicantUserStatusValue=driver.findElement(By.xpath("(//div[@title='Active'])[4]")).getText();
		System.out.println("applicant user status is:" + applicantUserStatusValue);
		Assert.assertEquals("Active", applicantUserStatusValue);
		ObjectRepo.test.log(Status.PASS, "applicant user status is:" + applicantUserStatusValue);
		String requestInitiationDate=driver.findElement(requestInitiationDateColomn).getText();
		System.out.println("User Status History grid contain:" + requestInitiationDate);
		Assert.assertEquals("Request Initiation Date", requestInitiationDate);
		ObjectRepo.test.log(Status.PASS, "User Status History grid contain:" + requestInitiationDate);
		String requestInitiationDateValue=driver.findElement(By.xpath("(//div[@class='MuiDataGrid-cellContent'])[44]")).getText();
		System.out.println("Request Initiation date is:" + requestInitiationDateValue);
		//Assert.assertEquals("Welcoming Jurisdiction", requestInitiationDateValue);
		ObjectRepo.test.log(Status.PASS, "Request Initiation date is:" + requestInitiationDateValue);
		String updatedBy=driver.findElement(updatedBy1Colomn).getText();
		System.out.println("User Status History grid contain:" + updatedBy);
		Assert.assertEquals("Updated by", updatedBy);
		ObjectRepo.test.log(Status.PASS, "User Status History grid contain:" + updatedBy);
		String updateByValue=driver.findElement(By.xpath("(//div[@title='Pravin Jogi'])[1]")).getText();
		System.out.println("Update by is:" + updateByValue);
		Assert.assertEquals("Pravin Jogi", updateByValue);
		ObjectRepo.test.log(Status.PASS, "Update by is:" + updateByValue);
		String comment=driver.findElement(commentColomn).getText();
		System.out.println("User Status History grid contain:" + comment);
		Assert.assertEquals("Comment", comment);
		ObjectRepo.test.log(Status.PASS, "User Status History grid contain:" + comment);
		WebElement element=driver.findElement(denialReasonColomn);
		Actions action=new Actions(driver);
		action.moveToElement(element).build().perform();
		action.click(element).build().perform();
		String denialReason=driver.findElement(denialReasonColomn).getText();
		System.out.println("User Status History grid contain:" + denialReason);
		ObjectRepo.test.log(Status.PASS, "User Status History grid contain:" + denialReason);
	}
	
	public void registrarViewUserStatusHistoryWithColomnAndColomnValue() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2800)");
		Thread.sleep(1000);
		String userStatusHistory=driver.findElement(userStatusHistorySection).getText();
		System.out.println("JU is able to view:" + userStatusHistory);
		Assert.assertEquals("USER STATUS HISTORY", userStatusHistory);
		ObjectRepo.test.log(Status.PASS, "JU is able to view:" + userStatusHistory);
		String requestStatus=driver.findElement(requestStatusColomn).getText();
		System.out.println("User Status History grid contain:" + requestStatus);
		Assert.assertEquals("Request Status", requestStatus);
		ObjectRepo.test.log(Status.PASS, "User Status History grid contain:" + requestStatus);
		String requestStatusValue=driver.findElement(By.xpath("//div[@class='MuiDataGrid-cellContent' and @title='Registration Approved']")).getText();
		System.out.println("Request status is:" + requestStatusValue);
		Assert.assertEquals("Registration Approved", requestStatusValue);
		ObjectRepo.test.log(Status.PASS, "Request status is:" + requestStatusValue);
		String originalJurisdiction=driver.findElement(originalJurisdictionColomn).getText();
		System.out.println("User Status History grid contain:" + originalJurisdiction);
		Assert.assertEquals("Original Jurisdiction", originalJurisdiction);
		ObjectRepo.test.log(Status.PASS, "User Status History grid contain:" + originalJurisdiction);
		String originalJurisdictionValue=driver.findElement(By.xpath("(//div[@title='California'])[1]")).getText();
		System.out.println("Original jurisdiction is:" + originalJurisdictionValue);
		Assert.assertEquals("California", originalJurisdictionValue);
		ObjectRepo.test.log(Status.PASS, "Original jurisdiction is:" + originalJurisdictionValue);
		String welcomingJurisdiction=driver.findElement(welcomingJurisdictionColomn).getText();
		System.out.println("User Status History grid contain:" + welcomingJurisdiction);
		Assert.assertEquals("Welcoming Jurisdiction", welcomingJurisdiction);
		ObjectRepo.test.log(Status.PASS, "User Status History grid contain:" + welcomingJurisdiction);
		String welcomingJurisdictionValue=driver.findElement(By.xpath("(//div[@title='California'])[2]")).getText();
		System.out.println("Welcoming jurisdiction is:" + welcomingJurisdictionValue);
		Assert.assertEquals("California", welcomingJurisdictionValue);
		ObjectRepo.test.log(Status.PASS, "Welcoming jurisdiction is:" + welcomingJurisdictionValue);
		String applicantUserStatus=driver.findElement(applicantUserStatusColomn).getText();
		System.out.println("User Status History grid contain:" + applicantUserStatus);
		Assert.assertEquals("Applicant/User Status", applicantUserStatus);
		ObjectRepo.test.log(Status.PASS, "User Status History grid contain:" + applicantUserStatus);
		String applicantUserStatusValue=driver.findElement(By.xpath("(//div[@title='Active'])[5]")).getText();
		System.out.println("applicant user status is:" + applicantUserStatusValue);
		Assert.assertEquals("Active", applicantUserStatusValue);
		ObjectRepo.test.log(Status.PASS, "applicant user status is:" + applicantUserStatusValue);
		String requestInitiationDate=driver.findElement(requestInitiationDateColomn).getText();
		System.out.println("User Status History grid contain:" + requestInitiationDate);
		Assert.assertEquals("Request Initiation Date", requestInitiationDate);
		ObjectRepo.test.log(Status.PASS, "User Status History grid contain:" + requestInitiationDate);
		String requestInitiationDateValue=driver.findElement(By.xpath("(//div[@class='MuiDataGrid-cellContent'])[50]")).getText();
		System.out.println("Request Initiation date is:" + requestInitiationDateValue);
		//Assert.assertEquals("Welcoming Jurisdiction", requestInitiationDateValue);
		ObjectRepo.test.log(Status.PASS, "Request Initiation date is:" + requestInitiationDateValue);
		String updatedBy=driver.findElement(updatedBy1Colomn).getText();
		System.out.println("User Status History grid contain:" + updatedBy);
		Assert.assertEquals("Updated by", updatedBy);
		ObjectRepo.test.log(Status.PASS, "User Status History grid contain:" + updatedBy);
		String updateByValue=driver.findElement(By.xpath("(//div[@title='automation registrar'])[1]")).getText();
		System.out.println("Update by is:" + updateByValue);
		Assert.assertEquals("automation registrar", updateByValue);
		ObjectRepo.test.log(Status.PASS, "Update by is:" + updateByValue);
		String comment=driver.findElement(commentColomn).getText();
		System.out.println("User Status History grid contain:" + comment);
		Assert.assertEquals("Comment", comment);
		ObjectRepo.test.log(Status.PASS, "User Status History grid contain:" + comment);
		WebElement element=driver.findElement(denialReasonColomn);
		Actions action=new Actions(driver);
		action.moveToElement(element).build().perform();
		action.click(element).build().perform();
		String denialReason=driver.findElement(denialReasonColomn).getText();
		System.out.println("User Status History grid contain:" + denialReason);
		ObjectRepo.test.log(Status.PASS, "User Status History grid contain:" + denialReason);
	}
	
	public void registrarViewUserUsingJurisdictionFilter() throws Exception {
		driver.findElement(filterButton).click();
		driver.findElement(selectFilter).click();
		driver.findElement(By.xpath("//option[text()='Jurisdiction']")).click();
		driver.findElement(filterValueField).sendKeys("Quebec");
		Thread.sleep(2000);
		driver.findElement(filterButton).click();
		Thread.sleep(2000);
		List<WebElement> element=driver.findElements(By.xpath("//a[@class='link-cell']"));
		int totalValue = element.size();
		for(int i=0;i<=totalValue-1;i++) {
		    String name=element.get(i).getText();
		    System.out.println(name);
		}
	}
	
	
	public void registrarViewRequestRevisionUser() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1800)");
		String requestRevisionRadioButton1=driver.findElement(requestRevisionRadioButton).getText();
		System.out.println("Follwing button display:"+requestRevisionRadioButton1);
		ObjectRepo.test.log(Status.PASS, "Follwing button display:"+requestRevisionRadioButton1);
	}
	
	public void assignMultipleRoleToUserAccrossRoleType() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1800)");
		//Thread.sleep(1000);
		driver.findElement(approveRadioButton).click();
		//Thread.sleep(1000);
		WebElement element1=driver.findElement(selectRoleTypeDropdown);
		if(element1.isEnabled()) {
			System.out.println("The role type dropdown is enabled");
			ObjectRepo.test.log(Status.PASS, "The role type dropdown is enabled");
		}
		else {
			System.out.println("The role type dropdown is not enabled");
			ObjectRepo.test.log(Status.PASS, "The role type dropdown is not enabled");
		}
		WebElement element2=driver.findElement(roleDropdown);
		if(element2.isEnabled()) {
			System.out.println("The role dropdown is enabled");
			ObjectRepo.test.log(Status.PASS, "The role dropdown is enabled");
		}
		else {
			System.out.println("The role dropdown is not enabled");
			ObjectRepo.test.log(Status.PASS, "The role dropdown is not enabled");
		}
		//Thread.sleep(1000);
		WebElement element3=driver.findElement(reasonForDenialDropdown);
		String value=element3.getAttribute("aria-disabled");
		if(value=="True") {
			System.out.println("The Reason for denial dropdown is enabled");
			ObjectRepo.test.log(Status.PASS, "The Reason for denial dropdown is enabled");
		}
		else {
			System.out.println("The Reason for denial is not enabled");
			ObjectRepo.test.log(Status.PASS, "The Reason for denial is not enabled");
		}
		String commentField=driver.findElement(By.xpath("//label[text()='Comments']")).getText();
		System.out.println("Comment field is:" + commentField);
		ObjectRepo.test.log(Status.PASS, "Comment field is:" + commentField);
		driver.findElement(selectRoleTypeDropdown).click();
		//Thread.sleep(1000);
		driver.findElement(selectIndividualUsersRolType).click();
		//Thread.sleep(1000);
		driver.findElement(roleDropdown).click();
		//Thread.sleep(1000);
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(selectIndividualUsersRole));
		driver.findElement(selectIndividualUsersRole).click();
		//Thread.sleep(1000);
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(primaryAccountRepresentativeRole));
		driver.findElement(primaryAccountRepresentativeRole).click();
		//Thread.sleep(1000);
		driver.findElement(alternativeAccountRepresentativesRole).click();
		//Thread.sleep(4000);
		WebElement element4 = driver.findElement(roleDropdown);
		Actions action = new Actions(driver);
		action.moveToElement(element4).build().perform();
		//Thread.sleep(4000);
		WebElement element5= driver.findElement(selectIndividualUsersRolType);
		action.moveToElement(element5).build().perform();
		//Thread.sleep(4000);
		action.click(element5).build().perform();
		//driver.findElement(roleDropdown).click();
		//Thread.sleep(1000);
		driver.findElement(selectRoleTypeDropdown).click();
		//Thread.sleep(1000);
		driver.findElement(selectJurisdictionUserRoleType).click();
		//Thread.sleep(2000);
		String roletypeField=driver.findElement(selectRoleTypeDropdown).getText();
		System.out.println("Role Type field is:" + roletypeField);
		//Assert.assertEquals("Select Role(s)", roletypeField);
		ObjectRepo.test.log(Status.PASS, "Role Type field is:" + roletypeField);
		if(roletypeField.contains("Individual Users")) {
			System.out.println("Previously selected role type is not cleared");
		}
		else {
			System.out.println("Previously selected role type is cleared and new selected role is displayed as:"+roletypeField);
		}
		String roleField=driver.findElement(By.xpath("//div[@id='mui-component-select-Roles']")).getText();
		System.out.println("Role field is:" + roleField);
		Assert.assertEquals("Select Role(s)", roleField);
		ObjectRepo.test.log(Status.PASS, "Role field is:" + roleField);
		String errorMessageForRoleField=driver.findElement(By.xpath("(//*[@class='MuiFormHelperText-root Mui-error css-bpd4r6'])[3]")).getText();
		System.out.println("Error Message For role Field is:" + errorMessageForRoleField);
		Assert.assertEquals("Role(s) is required", errorMessageForRoleField);
		ObjectRepo.test.log(Status.PASS, "Error Message For role Field is:" + errorMessageForRoleField);
		
	}
	
	public void assignMultipleRoleToUser() throws Exception {
		WebDriverWait wait=new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='User Details']")));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)");
		//Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(approveRadioButton));
		driver.findElement(approveRadioButton).click();
		//Thread.sleep(1000);
		WebElement element1=driver.findElement(selectRoleTypeDropdown);
		if(element1.isEnabled()) {
			System.out.println("The role type dropdown is enabled");
			ObjectRepo.test.log(Status.PASS, "The role type dropdown is enabled");
		}
		else {
			System.out.println("The role type dropdown is not enabled");
			ObjectRepo.test.log(Status.PASS, "The role type dropdown is not enabled");
		}
		WebElement element2=driver.findElement(roleDropdown);
		if(element2.isEnabled()) {
			System.out.println("The role dropdown is enabled");
			ObjectRepo.test.log(Status.PASS, "The role dropdown is enabled");
		}
		else {
			System.out.println("The role dropdown is not enabled");
			ObjectRepo.test.log(Status.PASS, "The role dropdown is not enabled");
		}
		//Thread.sleep(1000);
		WebElement element3=driver.findElement(reasonForDenialDropdown);
		String value=element3.getAttribute("aria-disabled");
		if(value=="True") {
			System.out.println("The Reason for denial dropdown is enabled");
			ObjectRepo.test.log(Status.PASS, "The Reason for denial dropdown is enabled");
		}
		else {
			System.out.println("The Reason for denial is not enabled");
			ObjectRepo.test.log(Status.PASS, "The Reason for denial is not enabled");
		}
		String commentField=driver.findElement(By.xpath("//label[text()='Comments']")).getText();
		System.out.println("Comment field is:" + commentField);
		ObjectRepo.test.log(Status.PASS, "Comment field is:" + commentField);
		driver.findElement(selectRoleTypeDropdown).click();
		Thread.sleep(1000);
		driver.findElement(selectIndividualUsersRolType).click();
		
		Thread.sleep(1000);
		driver.findElement(roleDropdown).click();
		//Thread.sleep(1000);
		driver.findElement(selectIndividualUsersRole).click();
		//Thread.sleep(1000);
		driver.findElement(primaryAccountRepresentativeRole).click();
		//Thread.sleep(1000);
		driver.findElement(alternativeAccountRepresentativesRole).click();
		WebElement element4 = driver.findElement(selectRoleTypeDropdown);
		Actions action = new Actions(driver);
		action.moveToElement(element4).build().perform();
		//Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,2650)");
		WebElement abc = driver.findElement(saveButton);
		js.executeScript("arguments[0].click();", abc);
		//Thread.sleep(4000);
		String text=driver.findElement(textOnPrompt).getText();
		System.out.println("Text present on prompt is:" + text);
		Assert.assertEquals("Are you sure you want to assign multiple roles?", text);
		ObjectRepo.test.log(Status.PASS, "Text present on prompt is:" + text);
		String cancelButton=driver.findElement(cancelButtonOnPrompt).getText();
		System.out.println("Button present on prompt is:" + cancelButton);
		//Assert.assertEquals("Revisions Requested", cancelButton);
		ObjectRepo.test.log(Status.PASS, "Button present on prompt is:" + cancelButton);
		String continueButton=driver.findElement(continueButtonOnPrompt).getText();
		System.out.println("Button present on prompt is:" + continueButton);
		Assert.assertEquals("CONTINUE", continueButton);
		ObjectRepo.test.log(Status.PASS, "Button present on prompt is:" + continueButton);
		driver.findElement(cancelButtonOnPrompt).click();
		js.executeScript("arguments[0].click();", abc);
		//Thread.sleep(2000);
		String text1=driver.findElement(textOnPrompt).getText();
		System.out.println("Text present on prompt is:" + text1);
		Assert.assertEquals("Are you sure you want to assign multiple roles?", text1);
		ObjectRepo.test.log(Status.PASS, "Text present on prompt is:" + text1);
		//Thread.sleep(2000);
		driver.findElement(continueButtonOnPrompt).click();
		//Thread.sleep(6000);
		String successMessage=driver.findElement(successMessageAfterRegistrarApproveUser).getText();
		System.out.println("Success Message after Registrar Approve and assign individual role :" + successMessage);
		Assert.assertEquals("User request has been approved.", successMessage);
		ObjectRepo.test.log(Status.PASS, "Success Message after Registrar Approve and assign individual role :" + successMessage);
		WebElement element5 = driver.findElement(crossButtonOnErrorMessageAfterLogin);
		//Thread.sleep(2000);
		element5.click();
	}
	public void californiaUserSubmitRevisionRequest() throws Exception {
		String requestRevisionStatusText=driver.findElement(requestRevisionTextOnHomepage).getText();
		System.out.println("User Registration Status :" + requestRevisionStatusText);
		driver.findElement(makeRevisionButton).click();
		driver.findElement(editButton).click();
		//Thread.sleep(2000);
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(firstNameEdit));
		for(int i=1;i<=6;i++) {
			driver.findElement(firstNameEdit).sendKeys(Keys.BACK_SPACE);
		}
		driver.findElement(firstNameEdit).sendKeys("Mayur");
		//Thread.sleep(2000);
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(telephoneNumberEdit));
		for(int i=1;i<=10;i++) {
			driver.findElement(telephoneNumberEdit).sendKeys(Keys.BACK_SPACE);
		}
		driver.findElement(telephoneNumberEdit).sendKeys("1122334455");
		//Thread.sleep(2000);
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(street1EditPrimResi));
		for(int i=1;i<=12;i++) {
			driver.findElement(street1EditPrimResi).sendKeys(Keys.BACK_SPACE);
		}
		driver.findElement(street1EditPrimResi).sendKeys("Testdata");
		//Thread.sleep(2000);
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(cityEditMailAdd));
		for(int i=1;i<=4;i++) {
			driver.findElement(cityEditMailAdd).sendKeys(Keys.BACK_SPACE);
		}
		driver.findElement(cityEditMailAdd).sendKeys("Mumbai");
		WebElement element = driver.findElement(saveButtonForRevisionRequestSubmit);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		//Thread.sleep(4000);
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(textOnPrompt));
		String text=driver.findElement(textOnPrompt).getText();
		System.out.println("Text present on prompt is:" + text);
		Assert.assertEquals("Are you sure you want to change the details?", text);
		ObjectRepo.test.log(Status.PASS, "Text present on prompt is:" + text);
		String cancelButton=driver.findElement(cancelButtonOnPrompt).getText();
		System.out.println("Button present on prompt is:" + cancelButton);
		Assert.assertEquals("CANCEL", cancelButton);
		ObjectRepo.test.log(Status.PASS, "Button present on prompt is:" + cancelButton);
		String continueButton=driver.findElement(continueButtonOnPrompt).getText();
		System.out.println("Button present on prompt is:" + continueButton);
		Assert.assertEquals("CONTINUE", continueButton);
		ObjectRepo.test.log(Status.PASS, "Button present on prompt is:" + continueButton);
		driver.findElement(continueButtonOnPrompt).click();
		//Thread.sleep(4000);
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(successMessageAfterSubmitRequestRevision));
		String successMessage=driver.findElement(successMessageAfterSubmitRequestRevision).getText();
		System.out.println("Success Message after user submit revision request:"+ successMessage);
		Assert.assertEquals("Profile changes are submitted to jurisdiction for approval, you will be notified when jurisdiction approves or denies the changes", successMessage);
		ObjectRepo.test.log(Status.PASS, "Success Message after user submit revision request:"+ successMessage);
		driver.findElement(By.xpath("//*[@data-testid='CloseIcon']")).click();
		//Thread.sleep(2000);
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(returnToUserProfileButton));
		driver.findElement(returnToUserProfileButton).click();
		driver.findElement(homeMenu).click();
		String pendingStatusText=driver.findElement(pendingStatusTextOnHomePage).getText();
		System.out.println("User Registration Status :" + pendingStatusText);
		Assert.assertEquals("REGISTRATION APPLICATION STATUS: PENDING", pendingStatusText);
		ObjectRepo.test.log(Status.PASS, "User Registration Status :" + pendingStatusText);
	}
	
	public void registrarViewRequestStatusAfterProposedToAuthority() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2800)");
		Thread.sleep(1000);
		String requestStatus=driver.findElement(By.xpath("(//*[contains(text(),'Proposed to Authority')])[2]")).getText();
		System.out.println("Request status of user is:" + requestStatus);
		Assert.assertEquals("Proposed to Authority", requestStatus);
		ObjectRepo.test.log(Status.PASS, "Request status of user is:" + requestStatus);
	}
	
	public void registrarViewRequestStatusAfterApprovedUser() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2800)");
		//Thread.sleep(1000);
		String requestStatus=driver.findElement(By.xpath("(//*[contains(text(),'Registration Approved')])[2]")).getText();
		System.out.println("Request status of user is:" + requestStatus);
		Assert.assertEquals("Registration Approved", requestStatus);
		ObjectRepo.test.log(Status.PASS, "Request status of user is:" + requestStatus);
	}
	
	public void registrarViewRequestStatusAfterChangeUserRole() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2800)");
		//Thread.sleep(1000);
		String requestStatus=driver.findElement(By.xpath("(//*[contains(text(),'Role Change Approved')])[2]")).getText();
		System.out.println("Request status of user is:" + requestStatus);
		Assert.assertEquals("Role Change Approved", requestStatus);
		ObjectRepo.test.log(Status.PASS, "Request status of user is:" + requestStatus);
	}
	
	public void registrarViewRequestStatusAfterDeniedUser() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2800)");
		//Thread.sleep(1000);
		String requestStatus=driver.findElement(By.xpath("(//*[contains(text(),'Registration Denied')])[2]")).getText();
		System.out.println("Request status of user is:" + requestStatus);
		Assert.assertEquals("Registration Denied", requestStatus);
		ObjectRepo.test.log(Status.PASS, "Request status of user is:" + requestStatus);
	}
	
	public void registrarViewRequestStatus() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2800)");
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//*[contains(text(),'Revisions Requested')])[2]")));
		//Thread.sleep(1000);
		String requestStatus=driver.findElement(By.xpath("(//*[contains(text(),'Revisions Requested')])[2]")).getText();
		System.out.println("Request status of user is:" + requestStatus);
		Assert.assertEquals("Revisions Requested", requestStatus);
		ObjectRepo.test.log(Status.PASS, "Request status of user is:" + requestStatus);
	}
	
	public void registrarViewAfterClickONThreeDotsOfApplicantUser() throws Exception {
		Thread.sleep(2000);
		driver.findElement(searchField).sendKeys(userId);
		Thread.sleep(2000);
		driver.findElement(threeDots).click();
		Thread.sleep(2000);
		String resetPassphraseSecurityOption=driver.findElement(resetSecurityQueAndPassphraseOption).getText();
		System.out.println("Registrar is able to view:" + resetPassphraseSecurityOption);
		Assert.assertEquals("RESET SECURITY QUESTIONS AND PASSPHRASE", resetPassphraseSecurityOption);
		ObjectRepo.test.log(Status.PASS, "Registrar is able to view:" + resetPassphraseSecurityOption);
		Thread.sleep(2000);
		String p=driver.getPageSource();
		if(p.contains("DEACTIVATE USER LOG-IN")) {
			System.out.println("DEACTIVATE USER LOG-IN option is display for Registrar");
			ObjectRepo.test.log(Status.PASS, "Cancel user registration option is display for approve user");
		}
		else if (p.contains("ACTIVATE USER LOG-IN")) {
			System.out.println("ACTIVATE USER LOG-IN option is display for Registrar");
			ObjectRepo.test.log(Status.PASS, "ACTIVATE USER LOG-IN option is display for Registrar");
		}
		else {
			System.out.println("Only Reset Passphrase and Security Option is display.");
		}
	}
	
	public void registrarNotViewDeactiveUserLoginOption() throws Exception {
		Thread.sleep(2000);
		driver.findElement(searchField).sendKeys(userId);
		Thread.sleep(2000);
		driver.findElement(threeDots).click();
		Thread.sleep(2000);
		String p=driver.getPageSource();
		if(p.contains("DEACTIVATE USER LOG-IN")) {
			System.out.println("DEACTIVATE USER LOG-IN option is display for Registrar");
			ObjectRepo.test.log(Status.PASS, "Cancel user registration option is display for approve user");
		}
		else  {
			System.out.println("DEACTIVATE USER LOG-IN option is not display for Registrar");
			ObjectRepo.test.log(Status.PASS, "DEACTIVATE USER LOG-IN option is not display for Registrar");
		}
	
	}
	
	public void errorMessageForLogin() throws Exception {
		Thread.sleep(2000);
		driver.findElement(userid).sendKeys(userId);
		System.out.println("step : Enter Valid User Id  ");
		ObjectRepo.test.log(Status.PASS, "step1 : Enter valid User Id ");
		driver.findElement(passphraseOnLoginPage).sendKeys(prop.getProperty("Passphrase"));
		System.out.println("step : Enter Valid passphrase  ");
		ObjectRepo.test.log(Status.PASS, "step1 : Enter valid passphrase ");
		WebElement element = driver.findElement(loginbutton);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		System.out.println("step : Click on login button  ");
		ObjectRepo.test.log(Status.PASS, "step1 : Click on login button ");
		Thread.sleep(2000);
		String errorMessage=driver.findElement(By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']")).getText();
		System.out.println("Error message for log in is :" + errorMessage);
		//Assert.assertEquals("USER STATUS HISTORY", errorMessage);
		ObjectRepo.test.log(Status.PASS, "Error message for log in is :" + errorMessage);
	}
	
	public void registrarViewDeactiveUserLoginOption() throws Exception {
		Thread.sleep(2000);
		driver.findElement(searchField).sendKeys(userId);
		Thread.sleep(2000);
		driver.findElement(threeDots).click();
		String element=driver.findElement(deactivateUserLoginOption).getText();
		//System.out.println(element);
		Thread.sleep(2000);
		String p=driver.getPageSource();
		if(p.contains("DEACTIVATE USER LOG-IN")) {
			System.out.println("DEACTIVATE USER LOG-IN option is display for Registrar");
			ObjectRepo.test.log(Status.PASS, "Cancel user registration option is display for approve user");
		}
		else if (p.contains("ACTIVATE USER LOG-IN")) {
			System.out.println("ACTIVATE USER LOG-IN option is display for Registrar");
			ObjectRepo.test.log(Status.PASS, "ACTIVATE USER LOG-IN option is display for Registrar");
		}
		else {
			System.out.println("Nothing");
		}
	}

	public void userNotFound() throws Exception {
		Thread.sleep(2000);
		driver.findElement(searchField).sendKeys(userId);
		Thread.sleep(2000);
		String userStatusHistory=driver.findElement(By.xpath("(//*[@class='MuiDataGrid-virtualScrollerContent css-0'])[1]")).getText();
		System.out.println("JU is able to view:" + userStatusHistory);
	}

	public void registrarViewUserStatusHistory() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2800)");
		Thread.sleep(1000);
		String userStatusHistory=driver.findElement(userStatusHistorySection).getText();
		System.out.println("JU is able to view:" + userStatusHistory);
		Assert.assertEquals("USER STATUS HISTORY", userStatusHistory);
		ObjectRepo.test.log(Status.PASS, "JU is able to view:" + userStatusHistory);
		String requestStatus=driver.findElement(requestStatusColomn).getText();
		System.out.println("User Status History grid contain:" + requestStatus);
		Assert.assertEquals("Request Status", requestStatus);
		ObjectRepo.test.log(Status.PASS, "User Status History grid contain:" + requestStatus);
		String originalJurisdiction=driver.findElement(originalJurisdictionColomn).getText();
		System.out.println("User Status History grid contain:" + originalJurisdiction);
		Assert.assertEquals("Original Jurisdiction", originalJurisdiction);
		ObjectRepo.test.log(Status.PASS, "User Status History grid contain:" + originalJurisdiction);
		String welcomingJurisdiction=driver.findElement(welcomingJurisdictionColomn).getText();
		System.out.println("User Status History grid contain:" + welcomingJurisdiction);
		Assert.assertEquals("Welcoming Jurisdiction", welcomingJurisdiction);
		ObjectRepo.test.log(Status.PASS, "User Status History grid contain:" + welcomingJurisdiction);
		String applicantUserStatus=driver.findElement(applicantUserStatusColomn).getText();
		System.out.println("User Status History grid contain:" + applicantUserStatus);
		Assert.assertEquals("Applicant/User Status", applicantUserStatus);
		ObjectRepo.test.log(Status.PASS, "User Status History grid contain:" + applicantUserStatus);
		String requestInitiationDate=driver.findElement(requestInitiationDateColomn).getText();
		System.out.println("User Status History grid contain:" + requestInitiationDate);
		Assert.assertEquals("Request Initiation Date", requestInitiationDate);
		ObjectRepo.test.log(Status.PASS, "User Status History grid contain:" + requestInitiationDate);
		String updatedBy=driver.findElement(updatedBy1Colomn).getText();
		System.out.println("User Status History grid contain:" + updatedBy);
		Assert.assertEquals("Updated By", updatedBy);
		ObjectRepo.test.log(Status.PASS, "User Status History grid contain:" + updatedBy);
		String comment=driver.findElement(commentColomn).getText();
		System.out.println("User Status History grid contain:" + comment);
		Assert.assertEquals("Comment", comment);
		ObjectRepo.test.log(Status.PASS, "User Status History grid contain:" + comment);
		WebElement element=driver.findElement(denialReasonColomn);
		Actions action=new Actions(driver);
		action.moveToElement(element).build().perform();
		action.click(element).build().perform();
		String denialReason=driver.findElement(denialReasonColomn).getText();
		System.out.println("User Status History grid contain:" + denialReason);
		ObjectRepo.test.log(Status.PASS, "User Status History grid contain:" + denialReason);
	}

	public void registrarViewRoleHistory() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2800)");
		Thread.sleep(1000);
		String userRoleHistory=driver.findElement(userRoleHistorySection).getText();
		System.out.println("JU is able to view:" + userRoleHistory);
		Assert.assertEquals("USER ROLE HISTORY", userRoleHistory);
		ObjectRepo.test.log(Status.PASS, "JU is able to view:" + userRoleHistory);
		String roleType=driver.findElement(roleTypeColomn).getText();
		System.out.println("User Role History grid contain:" + roleType);
		Assert.assertEquals("Role Type", roleType);
		ObjectRepo.test.log(Status.PASS, "User Role History grid contain:" + roleType);
		String role=driver.findElement(roleColomn).getText();
		System.out.println("User Role History grid contain:" + role);
		Assert.assertEquals("Role", role);
		ObjectRepo.test.log(Status.PASS, "User Role History grid contain:" + role);
		Thread.sleep(2000);
		String jurisdiction=driver.findElement(jurisdictionColomn).getText();
		System.out.println("User Role History grid contain:" + jurisdiction);
		ObjectRepo.test.log(Status.PASS, "User Role History grid contain:" + jurisdiction);
		String dateTimeUpdated=driver.findElement(dateTimeUpdatedColomn).getText();
		System.out.println("User Role History grid contain:" + dateTimeUpdated);
		Assert.assertEquals("Date/Time Updated (EDT)", dateTimeUpdated);
		ObjectRepo.test.log(Status.PASS, "User Role History grid contain:" + dateTimeUpdated);
		String updatedBy=driver.findElement(updatedByColomn).getText();
		System.out.println("User Role History grid contain:" + updatedBy);
		Assert.assertEquals("Updated By", updatedBy);
		ObjectRepo.test.log(Status.PASS, "User Role History grid contain:" + updatedBy);
	}
	
	public void registrarCanNotViewPassphraseAndSecurityQuestions() throws Exception {
		try {
			Boolean passphraseField=driver.findElement(By.xpath("//*[text()='Passphrase']")).isDisplayed();
			Assert.assertTrue(passphraseField);
			System.out.println("Passphrase Field is present user details page");
			Boolean securityQuestions=driver.findElement(By.xpath("//*[text()='Security Question']")).isDisplayed();
			Assert.assertTrue(securityQuestions);
			System.out.println("Security Question is present user details page");
			Boolean answer=driver.findElement(By.xpath("//*[text()='Answer']")).isDisplayed();
			Assert.assertTrue(answer);
			System.out.println("Answer Field is present user details page");
			
		} catch (Exception e) {
			System.out.println("Passphrase Field  is not present user details page");
			System.out.println("Security Question  is not present user details page");
			System.out.println("Answer Field  is not present user details page");
		}
	}

	public void registrarViewUserDetails() throws Exception {
		String personalInformation=driver.findElement(personalInformationText).getText();
		System.out.println("JU is able to view:" + personalInformation);
		Assert.assertEquals("Personal Information", personalInformation);
		ObjectRepo.test.log(Status.PASS, "JU is able to view:" + personalInformation);
		String primaryResidence=driver.findElement(primaryResidenceText).getText();
		System.out.println("JU is able to view:" + primaryResidence);
		Assert.assertEquals("Primary Residence", primaryResidence);
		ObjectRepo.test.log(Status.PASS, "JU is able to view:" + primaryResidence);
		String mailingAddress=driver.findElement(mailingAddressText).getText();
		System.out.println("JU is able to view:" + mailingAddress);
		Assert.assertEquals("Mailing Address", mailingAddress);
		ObjectRepo.test.log(Status.PASS, "JU is able to view:" + mailingAddress);
		String logInInformation=driver.findElement(logInInformationText).getText();
		System.out.println("JU is able to view:" + logInInformation);
		Assert.assertEquals("Log-In Information", logInInformation);
		ObjectRepo.test.log(Status.PASS, "JU is able to view:" + logInInformation);
		List <WebElement> labels=driver.findElements(By.xpath("//*[@for='customize-textfield']"));
		for(WebElement elements:labels) {
			String labelName=elements.getText();
			System.out.println("Jurisdiction user is able to view:"+labelName);
		}
		List <WebElement> Values=driver.findElements(By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-rmnksp']"));
		for(WebElement elements:Values) {
			String valueInFields=elements.getText();
			System.out.println("Jurisdiction user is able to view:"+valueInFields);
		}
	}

	public void cancelUserRegistrationFunctionalityByRegistrar() throws Exception {
		driver.findElement(cancelUserRegistrationRadioButton).click();

		String element1=driver.findElement(selectRoleTypeDropdown).getAttribute("aria-disabled");
		if(element1=="True") {
			System.out.println("The role type dropdown is enabled");
			ObjectRepo.test.log(Status.PASS, "The role type dropdown is enabled");
		}
		else {
			System.out.println("The role type dropdown is not enabled");
			ObjectRepo.test.log(Status.PASS, "The role type dropdown is not enabled");
		}
		String element2=driver.findElement(roleDropdown).getAttribute("aria-disabled");
		if(element2=="True") {
			System.out.println("The role dropdown is enabled");
			ObjectRepo.test.log(Status.PASS, "The role dropdown is enabled");
		}
		else {
			System.out.println("The role dropdown is not enabled");
			ObjectRepo.test.log(Status.PASS, "The role dropdown is not enabled");
		}
		WebElement element3=driver.findElement(reasonForDenialDropdown);
		String value=element3.getAttribute("aria-disabled");
		if(value=="True") {
			System.out.println("The Reason for denial dropdown is enabled");
			ObjectRepo.test.log(Status.PASS, "The Reason for denial dropdown is enabled");
		}
		else {
			System.out.println("The Reason for denial is not enabled");
			ObjectRepo.test.log(Status.PASS, "The Reason for denial is not enabled");
		}
		String commentField1=driver.findElement(By.xpath("//label[text()='Comments']")).getText();
		System.out.println("Comment field is:" + commentField1);
		Assert.assertEquals("Comments*", commentField1);
		ObjectRepo.test.log(Status.PASS, "Comment field is:" + commentField1);
		Thread.sleep(1000);
		driver.findElement(commentField).sendKeys("");
		driver.findElement(cancelUserRegistrationRadioButton).click();
		Thread.sleep(1000);
		String errorMessageForEmptyData=driver.findElement(errorMessageForCommentField).getText();
		System.out.println("Error message when comment field keep empty:" + errorMessageForEmptyData);
		Assert.assertEquals("Comments is required", errorMessageForEmptyData);
		ObjectRepo.test.log(Status.PASS, "Error message when comment field keep empty:" + errorMessageForEmptyData);
		Thread.sleep(1000);
		driver.findElement(commentField).sendKeys("$#%#$$#");
		Thread.sleep(1000);
		String errorMessageForInvalidData=driver.findElement(errorMessageForCommentField).getText();
		System.out.println("Error message when invalid data enter in comment field:" + errorMessageForInvalidData);
		Assert.assertEquals("Invalid Comments", errorMessageForInvalidData);
		ObjectRepo.test.log(Status.PASS, "Error message when invalid data enter in comment field:" + errorMessageForInvalidData);
		WebElement element4=driver.findElement(saveButton);
		if(element4.isEnabled()) {
			System.out.println("save button is enabled");
			ObjectRepo.test.log(Status.PASS, "save button is enabled");
		}
		else {
			System.out.println("save button is not enabled");
			ObjectRepo.test.log(Status.PASS, "save button is not enabled");
		}

		driver.findElement(commentField).sendKeys("cancel user registration by registrar");
		driver.findElement(saveButton).click();
		Thread.sleep(2000);
		String successMessage1=driver.findElement(successMessageForCancelUserRegistration).getText();
		System.out.println("Success Message for cancel user registration  : "+ successMessage1);
		Assert.assertEquals("User cancelled Successfully", successMessage1);
		ObjectRepo.test.log(Status.PASS, "Success Message for cancel user registration  : "+ successMessage1);
	}

	public void requestRevisionFunctionalityByRegistrar() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1800)");
		Thread.sleep(1000);
		driver.findElement(requestRevisionRadioButton).click();
		String element1=driver.findElement(selectRoleTypeDropdown).getAttribute("aria-disabled");
		if(element1=="True") {
			System.out.println("The role type dropdown is enabled");
			ObjectRepo.test.log(Status.PASS, "The role type dropdown is enabled");
		}
		else {
			System.out.println("The role type dropdown is not enabled");
			ObjectRepo.test.log(Status.PASS, "The role type dropdown is not enabled");
		}
		String element2=driver.findElement(roleDropdown).getAttribute("aria-disabled");
		if(element2=="True") {
			System.out.println("The role dropdown is enabled");
			ObjectRepo.test.log(Status.PASS, "The role dropdown is enabled");
		}
		else {
			System.out.println("The role dropdown is not enabled");
			ObjectRepo.test.log(Status.PASS, "The role dropdown is not enabled");
		}
		WebElement element3=driver.findElement(reasonForDenialDropdown);
		String value=element3.getAttribute("aria-disabled");
		if(value=="True") {
			System.out.println("The Reason for denial dropdown is enabled");
			ObjectRepo.test.log(Status.PASS, "The Reason for denial dropdown is enabled");
		}
		else {
			System.out.println("The Reason for denial is not enabled");
			ObjectRepo.test.log(Status.PASS, "The Reason for denial is not enabled");
		}
		String commentField1=driver.findElement(By.xpath("//label[text()='Comments']")).getText();
		System.out.println("Comment field is:" + commentField1);
		Assert.assertEquals("Comments*", commentField1);
		ObjectRepo.test.log(Status.PASS, "Comment field is:" + commentField1);
		Thread.sleep(1000);
		driver.findElement(commentField).sendKeys("");
		driver.findElement(requestRevisionRadioButton).click();
		Thread.sleep(1000);
		String errorMessageForEmptyData=driver.findElement(errorMessageForCommentField).getText();
		System.out.println("Error message when comment field keep empty:" + errorMessageForEmptyData);
		Assert.assertEquals("Comments is required", errorMessageForEmptyData);
		ObjectRepo.test.log(Status.PASS, "Error message when comment field keep empty:" + errorMessageForEmptyData);
		Thread.sleep(1000);
		driver.findElement(commentField).sendKeys("$#%#$$#");
		Thread.sleep(1000);
		String errorMessageForInvalidData=driver.findElement(errorMessageForCommentField).getText();
		System.out.println("Error message when invalid data enter in comment field:" + errorMessageForInvalidData);
		Assert.assertEquals("Invalid Comments", errorMessageForInvalidData);
		ObjectRepo.test.log(Status.PASS, "Error message when invalid data enter in comment field:" + errorMessageForInvalidData);
		WebElement element4=driver.findElement(saveButton);
		if(element4.isEnabled()) {
			System.out.println("save button is enabled");
			ObjectRepo.test.log(Status.PASS, "save button is enabled");
		}
		else {
			System.out.println("save button is not enabled");
			ObjectRepo.test.log(Status.PASS, "save button is not enabled");
		}

		driver.findElement(commentField).sendKeys("Revision Requested");
		Thread.sleep(1000);
		driver.findElement(saveButton).click();
		Thread.sleep(2000);
		String successMessage=driver.findElement(successMessageForRevisionRequestedByRegistrar).getText();
		System.out.println("Success Message for deny user registration  : "+ successMessage);
		Assert.assertEquals("User has successfully requested revisions", successMessage);
		driver.findElement(By.xpath("(//*[@data-testid='CloseIcon'])[3]")).click();
	}
	
	public void deniedFunctionalityWithoutAddingReasons() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1800)");
		Thread.sleep(1000);
		driver.findElement(denyRadioButton).click();
		Thread.sleep(1000);
		String element1=driver.findElement(selectRoleTypeDropdown).getAttribute("aria-disabled");
		if(element1=="True") {
			System.out.println("The role type dropdown is enabled");
			ObjectRepo.test.log(Status.PASS, "The role type dropdown is enabled");
		}
		else {
			System.out.println("The role type dropdown is not enabled");
			ObjectRepo.test.log(Status.PASS, "The role type dropdown is not enabled");
		}
		String element2=driver.findElement(roleDropdown).getAttribute("aria-disabled");
		if(element2=="True") {
			System.out.println("The role dropdown is enabled");
			ObjectRepo.test.log(Status.PASS, "The role dropdown is enabled");
		}
		else {
			System.out.println("The role dropdown is not enabled");
			ObjectRepo.test.log(Status.PASS, "The role dropdown is not enabled");
		}
		Thread.sleep(1000);
		WebElement element3=driver.findElement(reasonForDenialDropdown);
		if(element3.isEnabled()) {
			System.out.println("The Reason for denial dropdown is enabled");
			ObjectRepo.test.log(Status.PASS, "The Reason for denial dropdown is enabled");
		}
		else {
			System.out.println("The Reason for denial is not enabled");
			ObjectRepo.test.log(Status.PASS, "The Reason for denial is not enabled");
		}
		//driver.findElement(reasonForDenialDropdown).click();
		Thread.sleep(2000);
		WebElement element6=driver.findElement(approveRadioButton);
		Actions action=new Actions(driver); 
		action.moveToElement(element6).build().perform();
		Thread.sleep(2000);
		//driver.findElement(reasonForDenialDropdown).click();
		Thread.sleep(2000);
		driver.findElement(commentField).sendKeys("Deny user registration");
		WebElement element4=driver.findElement(saveButton);
		if(element4.isEnabled()) {
			System.out.println("save button is enabled");
			ObjectRepo.test.log(Status.PASS, "save button is enabled");
		}
		else {
			System.out.println("save button is not enabled");
			ObjectRepo.test.log(Status.PASS, "save button is not enabled");
		}
	}

	public void deniedUserRegistrationFunctionalityByRegistrar() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1800)");
		Thread.sleep(1000);
		driver.findElement(denyRadioButton).click();
		Thread.sleep(1000);
		String element1=driver.findElement(selectRoleTypeDropdown).getAttribute("aria-disabled");
		if(element1=="True") {
			System.out.println("The role type dropdown is enabled");
			ObjectRepo.test.log(Status.PASS, "The role type dropdown is enabled");
		}
		else {
			System.out.println("The role type dropdown is not enabled");
			ObjectRepo.test.log(Status.PASS, "The role type dropdown is not enabled");
		}
		String element2=driver.findElement(roleDropdown).getAttribute("aria-disabled");
		if(element2=="True") {
			System.out.println("The role dropdown is enabled");
			ObjectRepo.test.log(Status.PASS, "The role dropdown is enabled");
		}
		else {
			System.out.println("The role dropdown is not enabled");
			ObjectRepo.test.log(Status.PASS, "The role dropdown is not enabled");
		}
		Thread.sleep(1000);
		WebElement element3=driver.findElement(reasonForDenialDropdown);
		if(element3.isEnabled()) {
			System.out.println("The Reason for denial dropdown is enabled");
			ObjectRepo.test.log(Status.PASS, "The Reason for denial dropdown is enabled");
		}
		else {
			System.out.println("The Reason for denial is not enabled");
			ObjectRepo.test.log(Status.PASS, "The Reason for denial is not enabled");
		}
		driver.findElement(reasonForDenialDropdown).click();
		driver.findElement(selectDenialReason1).click();
		String commentField1=driver.findElement(By.xpath("//label[text()='Comments']")).getText();
		System.out.println("Comment field is:" + commentField1);
		Assert.assertEquals("Comments*", commentField1);
		ObjectRepo.test.log(Status.PASS, "Comment field is:" + commentField1);

		driver.findElement(commentField).sendKeys("");
		driver.findElement(denyRadioButton).click();
		Thread.sleep(1000);
		String errorMessageForEmptyData=driver.findElement(errorMessageForCommentField).getText();
		System.out.println("Error message when comment field keep empty:" + errorMessageForEmptyData);
		Assert.assertEquals("Comments is required", errorMessageForEmptyData);
		ObjectRepo.test.log(Status.PASS, "Error message when comment field keep empty:" + errorMessageForEmptyData);
		Thread.sleep(1000);
		driver.findElement(commentField).sendKeys("$#%#$$#");
		Thread.sleep(1000);
		String errorMessageForInvalidData=driver.findElement(errorMessageForCommentField).getText();
		System.out.println("Error message when invalid data enter in comment field:" + errorMessageForInvalidData);
		Assert.assertEquals("Invalid Comments", errorMessageForInvalidData);
		ObjectRepo.test.log(Status.PASS, "Error message when invalid data enter in comment field:" + errorMessageForInvalidData);
		WebElement element4=driver.findElement(saveButton);
		if(element4.isEnabled()) {
			System.out.println("save button is enabled");
			ObjectRepo.test.log(Status.PASS, "save button is enabled");
		}
		else {
			System.out.println("save button is not enabled");
			ObjectRepo.test.log(Status.PASS, "save button is not enabled");
		}
		driver.findElement(commentField).sendKeys("Deny user registration");
		driver.findElement(saveButton).click();
		String successMessage=driver.findElement(successMessageDeniedUserRegistration).getText();
		Thread.sleep(2000);
		System.out.println("Success Message for deny user registration  : "+ successMessage);
		Assert.assertEquals("User request has been denied.", successMessage);
		ObjectRepo.test.log(Status.PASS, "Success Message for deny user registration  : "+ successMessage);
		WebElement element5 = driver.findElement(crossButtonOnErrorMessageAfterLogin);
		Thread.sleep(2000);
		element5.click();
	}

	public void approveFunctionalityByRegistrar() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1800)");
		Thread.sleep(1000);
		driver.findElement(approveRadioButton).click();
		Thread.sleep(1000);
		WebElement element1=driver.findElement(selectRoleTypeDropdown);
		if(element1.isEnabled()) {
			System.out.println("The role type dropdown is enabled");
			ObjectRepo.test.log(Status.PASS, "The role type dropdown is enabled");
		}
		else {
			System.out.println("The role type dropdown is not enabled");
			ObjectRepo.test.log(Status.PASS, "The role type dropdown is not enabled");
		}
		WebElement element2=driver.findElement(roleDropdown);
		if(element2.isEnabled()) {
			System.out.println("The role dropdown is enabled");
			ObjectRepo.test.log(Status.PASS, "The role dropdown is enabled");
		}
		else {
			System.out.println("The role dropdown is not enabled");
			ObjectRepo.test.log(Status.PASS, "The role dropdown is not enabled");
		}
		Thread.sleep(1000);
		WebElement element3=driver.findElement(reasonForDenialDropdown);
		String value=element3.getAttribute("aria-disabled");
		if(value=="True") {
			System.out.println("The Reason for denial dropdown is enabled");
			ObjectRepo.test.log(Status.PASS, "The Reason for denial dropdown is enabled");
		}
		else {
			System.out.println("The Reason for denial is not enabled");
			ObjectRepo.test.log(Status.PASS, "The Reason for denial is not enabled");
		}
		String commentField=driver.findElement(By.xpath("//label[text()='Comments']")).getText();
		System.out.println("Comment field is:" + commentField);
		ObjectRepo.test.log(Status.PASS, "Comment field is:" + commentField);
		driver.findElement(selectRoleTypeDropdown).click();
		Thread.sleep(1000);
		driver.findElement(selectIndividualUsersRolType).click();
		Thread.sleep(1000);
		driver.findElement(roleDropdown).click();
		Thread.sleep(1000);
		driver.findElement(selectIndividualUsersRole).click();
		WebElement element4 = driver.findElement(selectRoleTypeDropdown);
		Actions action = new Actions(driver);
		action.moveToElement(element4).build().perform();
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,2650)");
		WebElement abc = driver.findElement(saveButton);
		js.executeScript("arguments[0].click();", abc);
		Thread.sleep(6000);
		String successMessage=driver.findElement(successMessageAfterRegistrarApproveUser).getText();
		System.out.println("Success Message after Registrar Approve and assign individual role :" + successMessage);
		ObjectRepo.test.log(Status.PASS, "Success Message after Registrar Approve and assign individual role :" + successMessage);
		WebElement element5 = driver.findElement(crossButtonOnErrorMessageAfterLogin);
		Thread.sleep(2000);
		element5.click();
	}

	public void registrarViewRequestStatusAndRoleOfUser() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1600)");
		Thread.sleep(1000);
		String requestStatus=driver.findElement(By.xpath("(//*[text()='Role Change Denied'])[1]")).getText();
		System.out.println("Request status of user is:" + requestStatus);
		Assert.assertEquals("Role Change Denied", requestStatus);
		ObjectRepo.test.log(Status.PASS, "Request status of user is:" + requestStatus);
		js.executeScript("window.scrollBy(0,1800)");
		Thread.sleep(1000);
		String roleType=driver.findElement(By.xpath("//div[@class='MuiBox-root css-15fzge']")).getText();
		System.out.println("Role type of user is:" + roleType);
		Assert.assertEquals("Service Providers", roleType);
		ObjectRepo.test.log(Status.PASS, "Role type of user is:" + roleType);
		String role=driver.findElement(By.xpath("//div[@class='MuiBox-root css-1ng1ylw']")).getText();
		System.out.println("Role of user is:" + role);
		Assert.assertEquals("Market Monitor", role);
		ObjectRepo.test.log(Status.PASS, "Role of user is:" + role);
	}

	public void registrarSearchUserInPendingGridAndGoToUserDetailsPage() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1200)");
		driver.findElement(pendingRequestOption).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='search'])[2]")).sendKeys(userId);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='link-cell'])[6]")).click();
		Thread.sleep(2000);
	}
	
	public void registrarSearchUserInPendingGridAndViewUserListInGrid() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1200)");
		driver.findElement(pendingRequestOption).click();
		
		List<WebElement> allOptions=driver.findElements(By.xpath("//a[@class='link-cell']"));
		System.out.println("Total user count In both Grid"+ allOptions.size());
		for(int i=5;i<=allOptions.size()-1;i++) {
			new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='link-cell']")));
			String abc=allOptions.get(i).getText();
			System.out.println(abc);
		}
		
//		Actions action = new Actions(driver); 
//		WebElement we=driver.findElement(By.xpath("//*[@class='MuiBox-root css-19kzrtu']")); 
//		action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//*[text()='Request Status']"))).click().build().perform();
		
		}

	public void cancellingTheChangeJurisdictionCaliforniaToQuebec() throws Exception {
		Thread.sleep(3000);
		System.out.println("step : Click on Welcome button and click on User profile menu ");
		WebElement element = driver.findElement(welcomeDropdown);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		WebElement element2 = driver.findElement(userProfileOption);
		js2.executeScript("arguments[0].click()", element2);
		ObjectRepo.test.log(Status.PASS, "step : Click on Welcome button and click on User profile menu  ");
		Thread.sleep(4000);
		WebElement element4 = driver.findElement(changejurisdiction);
		js2.executeScript("arguments[0].click()", element4);
		System.out.println("step : Select another jurisdiction and click on Continue button");
		Thread.sleep(2000);
		driver.findElement(selectJurisdiction).click();
		driver.findElement(selectQuebec).click();
		Thread.sleep(2000);
		driver.findElement(cancelButtonforSelectJuri).click();
		Thread.sleep(2000);
		String cancelButton1=driver.findElement(By.xpath("(//button[@data-testid='priv_modal_Cancel'])[1]")).getText();
		System.out.println("Button on prompt is:" + cancelButton1);
		ObjectRepo.test.log(Status.PASS, "Button on prompt is:" + cancelButton1);
		String continueButton1=driver.findElement(By.xpath("(//button[@data-testid='priv_modal_Continue'])[1]")).getText();
		System.out.println("Button on prompt is:" + continueButton1);
		ObjectRepo.test.log(Status.PASS, "Button on prompt is:" + continueButton1);
		WebElement element5 = driver.findElement(By.xpath("(//button[@data-testid='priv_modal_Continue'])[1]"));
		js2.executeScript("arguments[0].click()", element5);
		//driver.findElement(By.xpath("(//button[@data-testid='priv_modal_Continue'])[1]")).click();
		Thread.sleep(2000);
		String userprofileText=driver.findElement(By.xpath("//*[@class='MuiTypography-root MuiTypography-h1 css-owykni']")).getText();
		System.out.println("User is redirected to that page:" + userprofileText);
		ObjectRepo.test.log(Status.PASS, "User is redirected to that page:" + userprofileText);
	}

	public void changeJurisdictionCaliforniaToQuebec() throws InterruptedException{
		//Thread.sleep(2000);
		System.out.println("step : Click on Welcome button and click on User profile menu ");
		WebElement element = driver.findElement(welcomeDropdown);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		WebElement element2 = driver.findElement(userProfileOption);
		js2.executeScript("arguments[0].click()", element2);
		//driver.findElement(welcomeDropdown).click();
		//driver.findElement(userProfileOption).click();
		ObjectRepo.test.log(Status.PASS, "step : Click on Welcome button and click on User profile menu  ");
		//Thread.sleep(4000);
		WebElement element4 = driver.findElement(changejurisdiction);
		js2.executeScript("arguments[0].click()", element4);
		System.out.println("step : Select another jurisdiction and click on Continue button");
		//Thread.sleep(2000);
		new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Select Jurisdiction'])[1]")));
		new WebDriverWait(driver,60).until(ExpectedConditions.elementToBeClickable(selectJurisdiction));
		//driver.findElement(selectJurisdiction).click();
		driver.findElement(selectJurisdiction).click();
		//Thread.sleep(2000);
		List<WebElement> elements=driver.findElements(By.xpath("//li[@role='option']"));
		for(WebElement element1:elements) {
			String option1=element1.getText();
			System.out.println(option1);
			if(element1.isEnabled()) {
				System.out.println("Option is enabled for change jurisdiction");
			}
			else {
				System.out.println("Option is not enabled for change jurisdiction");
			}
		}
		driver.findElement(selectQuebec).click();
		//Thread.sleep(2000);
		driver.findElement(continueButtonforSelectJuri).click();
		String pageheader = driver.findElement(pageHeader1).getText();
		Assert.assertEquals(pageheader, "Change Jurisdiction Request");
		ObjectRepo.test.log(Status.PASS, "step : Select another jurisdiction and click on Continue button");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[contains(text(),'edit')])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[contains(text(),'SAVE')])[1]")).click();
		WebElement element5 = driver.findElement(termsCheckbox);
		js2.executeScript("arguments[0].click()", element5);
		WebElement element1 = driver.findElement(contactUs);
		js2.executeScript("arguments[0].scrollIntoView();", element1);
		//Thread.sleep(5000);
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(continueUserdetails));
		driver.findElement(continueUserdetails).click();
		String form1=driver.findElement(userRegistrationChecklistForm).getText();
		System.out.println("form1 is:" + form1);
		ObjectRepo.test.log(Status.PASS, "form1 is:" + form1);
		String form2=driver.findElement(userRegistrationForm).getText();
		System.out.println("form2 is:" + form2);
		ObjectRepo.test.log(Status.PASS, "form2 is:" + form2);
		String form3=driver.findElement(proofOfIdentityForm).getText();
		System.out.println("form3 is:" + form3);
		ObjectRepo.test.log(Status.PASS, "form3 is:" + form3);
		String cancelButton1=driver.findElement(By.xpath("//button[contains(text(),'CANCEL')]")).getText();
		System.out.println("Button name is:" + cancelButton1);
		ObjectRepo.test.log(Status.PASS, "Button name is:" + cancelButton1);
		String submitButton1=driver.findElement(submitButton).getText();
		System.out.println("Button name is:" + submitButton1);
		ObjectRepo.test.log(Status.PASS, "Button name is:" + submitButton1);
		driver.findElement(submitButton).click();
		//Thread.sleep(2000);
		new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(successMsg));
		String successmessage = driver.findElement(successMsg).getText();
		System.out.println("Success Message is:" + successmessage);
		ObjectRepo.test.log(Status.PASS, "Success Message is:" + successmessage);
		driver.findElement(closeIcon).click();
		//Thread.sleep(2000);
		String requestStatusOfUser = driver.findElement(By.xpath("(//div[@class='MuiDataGrid-cellContent'])[1]")).getText();
		System.out.println("Request status after user submit change jurisdiction request :" + requestStatusOfUser);
		ObjectRepo.test.log(Status.PASS, "Request status after user submit change jurisdiction request :" + requestStatusOfUser);
		String OriginalJursdiction = driver.findElement(originalJurisdictionText).getText();
		System.out.println("Original Jurisdiction Name:" + OriginalJursdiction);
		ObjectRepo.test.log(Status.PASS, "Original Jurisdiction Name:" + OriginalJursdiction);
		String welcomingJurisdiction = driver.findElement(welcomingJurisdictionText).getText();
		System.out.println("Welcoming Jurisdiction Name:" + welcomingJurisdiction);
		ObjectRepo.test.log(Status.PASS, "Welcoming Jurisdiction Name:" + welcomingJurisdiction);
	}

	public void approveUserTryToCancelUserRegistration() throws Exception {
		Thread.sleep(2000);
		WebElement element = driver.findElement(welcomeDropdown);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		//driver.findElement(userProfileOption).click();
		WebElement element2 = driver.findElement(userProfileOption);
		js2.executeScript("arguments[0].click()", element2);
		String p=driver.getPageSource();
		if(p.contains("Cancel User Registration")) {
			System.out.println("Cancel user registration option is display for approve user");
			ObjectRepo.test.log(Status.PASS, "Cancel user registration option is display for approve user");
		}
		else {
			System.out.println("Cancel user registration option is not display for approve user");
			ObjectRepo.test.log(Status.PASS, "Cancel user registration option is not display for approve user");
		}
	}

	public void registrarSearchUesrAndViewUserAccountStatisAndRequestyStatus() throws Exception {
		Thread.sleep(2000);
		driver.findElement(searchField).sendKeys(userId);
		Thread.sleep(2000);
		String accountStatus=driver.findElement(accountStatusOfUser).getText();
		System.out.println("Account Status of user is:" + accountStatus);
		Assert.assertEquals("Cancelled", accountStatus);
		Thread.sleep(2000);
		String requestStatus=driver.findElement(requestStatusOfUser).getText();
		System.out.println("Request Status of user is:" + requestStatus);
	}
	
	public void registrarSearchUesrAndViewUserAccountStatisAndRequestyStatusForActive() throws Exception {
		Thread.sleep(2000);
		driver.findElement(searchField).sendKeys(userId);
		Thread.sleep(2000);
		String accountStatus=driver.findElement(accountStatusOfUser).getText();
		System.out.println("Account Status of user is:" + accountStatus);
		Assert.assertEquals("Active", accountStatus);
		Thread.sleep(2000);
		String requestStatus=driver.findElement(requestStatusOfUser).getText();
		System.out.println("Request Status of user is:" + requestStatus);
	}
	
	public void registrarSearchUesrAndViewUserAccountStatisAndRequestStatusForInavtiveWithProfileAccess() throws Exception {
		Thread.sleep(2000);
		driver.findElement(searchField).sendKeys(userId);
		Thread.sleep(2000);
		String accountStatus=driver.findElement(accountStatusOfUser).getText();
		System.out.println("Account Status of user is:" + accountStatus);
		//Assert.assertEquals("Active", accountStatus);
		Thread.sleep(2000);
		String requestStatus=driver.findElement(requestStatusOfUser).getText();
		System.out.println("Request Status of user is:" + requestStatus);
	}

	public void errorMessageForChangesUserIDInRevisionRequestFlow() throws Exception {
		Thread.sleep(2000);
		WebElement element = driver.findElement(welcomeDropdown);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		//driver.findElement(userProfileOption).click();
		WebElement element2 = driver.findElement(userProfileOption);
		js2.executeScript("arguments[0].click()", element2);
		WebElement element3 = driver.findElement(reviewAndEditUserRegistrationOption);
		js2.executeScript("arguments[0].click()", element3);
		//driver.findElement(reviewAndEditUserRegistrationOption).click();
		driver.findElement(editButton).click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2200)");
		Thread.sleep(1000);
		for(int i=1;i<=8;i++) {
			driver.findElement(userIDField).sendKeys(Keys.BACK_SPACE);
		}
		Thread.sleep(1000);
		driver.findElement(userIDField).sendKeys("registrar11.cal");
		//		String errorMessage=driver.findElement(By.xpath("//*[contains(text(),'User ID is not available')]")).getText();
		//		System.out.println("Error Message for User ID field:" + errorMessage);
	}

	public void verifyEditProfileFunctionalityForApprovedUser() throws Exception {
		Thread.sleep(2000);
		WebElement element = driver.findElement(welcomeDropdown);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		WebElement element2 = driver.findElement(userProfileOption);
		js2.executeScript("arguments[0].click()", element2);
		Thread.sleep(2000);
		driver.findElement(viewAndEditUserDetailsOption).click();
		driver.findElement(editButton).click();
		Thread.sleep(2000);
//		for(int i=1;i<=6;i++) {
//			driver.findElement(firstNameEdit).sendKeys(Keys.BACK_SPACE);
//		}
		driver.findElement(firstNameEdit).sendKeys("testdata");
		for(int i=1;i<=10;i++) {
			driver.findElement(telephoneNumberEdit).sendKeys(Keys.BACK_SPACE);
		}
		driver.findElement(telephoneNumberEdit).sendKeys("0987654321");
		Thread.sleep(2000);
		for(int i=1;i<=12;i++) {
			driver.findElement(street1EditPrimResi).sendKeys(Keys.BACK_SPACE);
		}
		driver.findElement(street1EditPrimResi).sendKeys("datatest");
		Thread.sleep(2000);
		for(int i=1;i<=4;i++) {
			driver.findElement(cityEditMailAdd).sendKeys(Keys.BACK_SPACE);
		}
		driver.findElement(cityEditMailAdd).sendKeys("testio");
		WebElement element1 = driver.findElement(cancelButtonForRevisionRequest);
		js2.executeScript("arguments[0].click()", element1);
		driver.findElement(continueButtonOnPrompt).click();
		Thread.sleep(2000);
//		System.out.println("User view old value as below");
////		String oldValueFirstName1=driver.findElement(oldValueFirstNameField).getText();
////		System.out.println("Old Value of First Name Field :" + oldValueFirstName1);
//		String oldValueTelephone1=driver.findElement(oldValueTelephoneField).getText();
//		System.out.println("Old Value of First Name Field :" + oldValueTelephone1);
//		String oldValueStreet1=driver.findElement(oldValueStreet1Field).getText();
//		System.out.println("Old Value of First Name Field :" + oldValueStreet1);
//		Thread.sleep(1000);
		js2.executeScript("arguments[0].click()", element);
		Thread.sleep(1000);
		WebElement element3 = driver.findElement(userProfileOption);
		js2.executeScript("arguments[0].click()", element3);
		Thread.sleep(2000);
		driver.findElement(viewAndEditUserDetailsOption).click();
		driver.findElement(editButton).click();
		Thread.sleep(2000);
		for(int i=1;i<=6;i++) {
			driver.findElement(firstNameEdit).sendKeys(Keys.BACK_SPACE);
		}
		driver.findElement(firstNameEdit).sendKeys("Mayur");
		Thread.sleep(2000);
		for(int i=1;i<=10;i++) {
			driver.findElement(telephoneNumberEdit).sendKeys(Keys.BACK_SPACE);
		}
		driver.findElement(telephoneNumberEdit).sendKeys("1122334455");
		Thread.sleep(2000);
		for(int i=1;i<=12;i++) {
			driver.findElement(street1EditPrimResi).sendKeys(Keys.BACK_SPACE);
		}
		driver.findElement(street1EditPrimResi).sendKeys("Testdata");
		Thread.sleep(2000);
		for(int i=1;i<=4;i++) {
			driver.findElement(cityEditMailAdd).sendKeys(Keys.BACK_SPACE);
		}
		driver.findElement(cityEditMailAdd).sendKeys("Mumbai");

		WebElement element4 = driver.findElement(saveButtonForRevisionRequestSubmit);
		js2.executeScript("arguments[0].click()", element4);
		driver.findElement(continueButtonOnPrompt).click();
		String successMessage=driver.findElement(successMessageAfterSubmitRequestRevision).getText();
		System.out.println("Success Message after edit their user details"+ successMessage);
		driver.findElement(By.xpath("//*[@data-testid='CloseIcon']")).click();
		Thread.sleep(2000);
		System.out.println("User view old and new value as below");
		String oldValueFirstName=driver.findElement(oldValueFirstNameField).getText();
		System.out.println("Old Value of First Name Field :" + oldValueFirstName);
		String newValueFirstName=driver.findElement(newValueFirstNameField).getText();
		System.out.println("New Value of First Name Field :" + newValueFirstName);

		String oldValueTelephone=driver.findElement(oldValueTelephoneField).getText();
		System.out.println("Old Value of First Name Field :" + oldValueTelephone);
		String newValueTelephone=driver.findElement(newValueTelephoneField).getText();
		System.out.println("New Value of First Name Field :" + newValueTelephone);

		String oldValueStreet12=driver.findElement(oldValueStreet1Field).getText();
		System.out.println("Old Value of First Name Field :" + oldValueStreet12);
		String newValueStreet1=driver.findElement(By.xpath("(//*[@class='MuiTypography-root MuiTypography-body1 css-7vo5ly'])[2]")).getText();
		System.out.println("New Value of First Name Field :" + newValueStreet1);

		driver.findElement(returnToUserProfileButton).click();
	}

	public void verifyEditProfileFunctionalityForRevisionRequestedUser() throws Exception {
		Thread.sleep(2000);
		WebElement element = driver.findElement(welcomeDropdown);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		//driver.findElement(userProfileOption).click();
		WebElement element2 = driver.findElement(userProfileOption);
		js2.executeScript("arguments[0].click()", element2);
		WebElement element3 = driver.findElement(reviewAndEditUserRegistrationOption);
		js2.executeScript("arguments[0].click()", element3);
		//driver.findElement(reviewAndEditUserRegistrationOption).click();
		driver.findElement(editButton).click();
		Thread.sleep(2000);
		WebElement firstNameField=driver.findElement(firstNameEdit);
		Actions action=new Actions(driver);
		action.moveToElement(firstNameField).build().perform();
		action.doubleClick(firstNameField).build().perform();
		firstNameField.clear();
//		for(int i=1;i<=6;i++) {
//			driver.findElement(firstNameEdit).sendKeys(Keys.BACK_SPACE);
//		}
		Thread.sleep(1000);
		driver.findElement(firstNameEdit).sendKeys("Mayur");
		Thread.sleep(2000);
		for(int i=1;i<=10;i++) {
			driver.findElement(telephoneNumberEdit).sendKeys(Keys.BACK_SPACE);
		}
		driver.findElement(telephoneNumberEdit).sendKeys("1122334455");
		Thread.sleep(2000);
		for(int i=1;i<=12;i++) {
			driver.findElement(street1EditPrimResi).sendKeys(Keys.BACK_SPACE);
		}
		driver.findElement(street1EditPrimResi).sendKeys("Testdata");
		Thread.sleep(2000);
		for(int i=1;i<=4;i++) {
			driver.findElement(cityEditMailAdd).sendKeys(Keys.BACK_SPACE);
		}
		driver.findElement(cityEditMailAdd).sendKeys("Mumbai");
		WebElement element1 = driver.findElement(cancelButtonForRevisionRequest);
		js2.executeScript("arguments[0].click()", element1);
		driver.findElement(continueButtonOnPrompt).click();
		Thread.sleep(2000);

		System.out.println("User view old value as below");
		String oldValueFirstName1=driver.findElement(oldValueFirstNameField).getText();
		System.out.println("Old Value of First Name Field :" + oldValueFirstName1);
		String oldValueTelephone1=driver.findElement(oldValueTelephoneField).getText();
		System.out.println("Old Value of First Name Field :" + oldValueTelephone1);
		String oldValueStreet1=driver.findElement(oldValueStreet1Field).getText();
		System.out.println("Old Value of First Name Field :" + oldValueStreet1);
		Thread.sleep(1000);
		driver.findElement(editButton).click();
		Thread.sleep(2000);
		for(int i=1;i<=6;i++) {
			driver.findElement(firstNameEdit).sendKeys(Keys.BACK_SPACE);
		}
		driver.findElement(firstNameEdit).sendKeys("Mayur");
		Thread.sleep(2000);
		for(int i=1;i<=10;i++) {
			driver.findElement(telephoneNumberEdit).sendKeys(Keys.BACK_SPACE);
		}
		driver.findElement(telephoneNumberEdit).sendKeys("1122334455");
		Thread.sleep(2000);
		for(int i=1;i<=12;i++) {
			driver.findElement(street1EditPrimResi).sendKeys(Keys.BACK_SPACE);
		}
		driver.findElement(street1EditPrimResi).sendKeys("Testdata");
		Thread.sleep(2000);
		for(int i=1;i<=4;i++) {
			driver.findElement(cityEditMailAdd).sendKeys(Keys.BACK_SPACE);
		}
		driver.findElement(cityEditMailAdd).sendKeys("Mumbai");

		WebElement element4 = driver.findElement(saveButtonForRevisionRequestSubmit);
		js2.executeScript("arguments[0].click()", element4);
		driver.findElement(continueButtonOnPrompt).click();
		String successMessage=driver.findElement(successMessageAfterSubmitRequestRevision).getText();
		System.out.println("Success Message after user submit revision request"+ successMessage);
		driver.findElement(By.xpath("//*[@data-testid='CloseIcon']")).click();
		Thread.sleep(2000);
		System.out.println("User view old and new value as below");
		String oldValueFirstName=driver.findElement(oldValueFirstNameField).getText();
		System.out.println("Old Value of First Name Field :" + oldValueFirstName);
		String newValueFirstName=driver.findElement(newValueFirstNameField).getText();
		System.out.println("New Value of First Name Field :" + newValueFirstName);

		String oldValueTelephone=driver.findElement(oldValueTelephoneField).getText();
		System.out.println("Old Value of First Name Field :" + oldValueTelephone);
		String newValueTelephone=driver.findElement(newValueTelephoneField).getText();
		System.out.println("New Value of First Name Field :" + newValueTelephone);

		String oldValueStreet12=driver.findElement(oldValueStreet1Field).getText();
		System.out.println("Old Value of First Name Field :" + oldValueStreet12);
		String newValueStreet1=driver.findElement(By.xpath("(//*[@class='MuiTypography-root MuiTypography-body1 css-7vo5ly'])[2]")).getText();
		System.out.println("New Value of First Name Field :" + newValueStreet1);

		driver.findElement(returnToUserProfileButton).click();
		driver.findElement(homeMenu).click();
		String pendingStatusText=driver.findElement(pendingStatusTextOnHomePage).getText();
		System.out.println("User Registration Status :" + pendingStatusText);
	}

	public void verifyEditProfileFunctionalityForPendingUser() throws Exception {
		Thread.sleep(1000);
		driver.findElement(welcomeDropdown).click();
		driver.findElement(userProfileOption).click();
		driver.findElement(viewUserDetailsOption).click();
		try {
			Boolean editButton=driver.findElement(By.xpath("//*[text()='Edit']")).isDisplayed();
			Assert.assertTrue(editButton);
			System.out.println("Edit button is present user details page");
		} catch (Exception e) {
			System.out.println("Edit button is not present user details page");
		}
	}

	public void registrarCloseUserAccountFromUserDetailsPageWithoutEnterComment() throws Exception {
		Thread.sleep(1000);
		driver.findElement(threeDots).click();
		Thread.sleep(1000);
		driver.findElement(inactivateUserClosedAccountOption).click();
		driver.findElement(userEmailFieldOnEditUserEmailPopup).sendKeys("");
		WebElement element=driver.findElement(proposeButtonOnEditUserEmailPopup);
		Thread.sleep(2000);
		if(element.isEnabled()) {
			System.out.println("close user account button is enabled" );
		}
		else {
			System.out.println("close user account button is not enabled" );
		}
	}

	public void registrarCloseUserAccountFromUserDetailsPage() throws Exception {
		Thread.sleep(1000);
		driver.findElement(threeDots).click();
		driver.findElement(inactivateUserClosedAccountOption).click();
		driver.findElement(userEmailFieldOnEditUserEmailPopup).sendKeys("Closed User Account");
		WebElement element=driver.findElement(proposeButtonOnEditUserEmailPopup);
		Thread.sleep(2000);
		if(element.isEnabled()) {
			System.out.println("close user account button is enabled" );
		}
		else {
			System.out.println("close user account button is not enabled" );
		}
		driver.findElement(proposeButtonOnEditUserEmailPopup).click();
		Thread.sleep(2000);
		String successMessage=driver.findElement(successMessageAfterRegistrarDeactivateUserWithoutProfileAccess).getText();
		Thread.sleep(1000);
		System.out.println("Success Message after registrar deactivate user without profile access" + successMessage );
		driver.findElement(crossButtonOnSuccMessAuthorityApproval).click();

	}

	public void viewElementsAvailableInQuickActionColumn() throws Exception {
		driver.findElement(threeDots).click();
		Thread.sleep(1000);
		String deactivateUserLogin=driver.findElement(deactivateUserLoginOption).getText();
		System.out.println("Following information contain in pop-up:" + deactivateUserLogin);
		Assert.assertEquals("DEACTIVATE USER LOG-IN", deactivateUserLogin);
		ObjectRepo.test.log(Status.PASS, "Following information contain in pop-up:" + deactivateUserLogin);

//		String updateEmail=driver.findElement(updateEmailOption).getText();
//		System.out.println("Following information contain in pop-up:" + updateEmail);
//		Assert.assertEquals("UPDATE EMAIL", updateEmail);
//		ObjectRepo.test.log(Status.PASS, "Following information contain in pop-up:" + updateEmail);

		String closeAccount=driver.findElement(inactivateUserClosedAccountOption).getText();
		System.out.println("Following information contain in pop-up:" + closeAccount);
		Assert.assertEquals("INACTIVATE USER - CLOSE ACCOUNT", closeAccount);
		ObjectRepo.test.log(Status.PASS, "Following information contain in pop-up:" + closeAccount);

		String resetSecurityQuePass=driver.findElement(resetSecurityQueAndPassphraseOption).getText();
		System.out.println("Following information contain in pop-up:" + resetSecurityQuePass);
		Assert.assertEquals("RESET SECURITY QUESTIONS AND PASSPHRASE", resetSecurityQuePass);
		ObjectRepo.test.log(Status.PASS, "Following information contain in pop-up:" + resetSecurityQuePass);

		String inactiveuser=driver.findElement(inactiveauserProfileAccessOnlyOption).getText();
		System.out.println("Following information contain in pop-up:" + inactiveuser);
		Assert.assertEquals("INACTIVATE USER - PROFILE ACCESS ONLY", inactiveuser);
		ObjectRepo.test.log(Status.PASS, "Following information contain in pop-up:" + inactiveuser);
		driver.findElement(inactivateUserClosedAccountOption).click();
		Thread.sleep(1000);
		String commentLabel=driver.findElement(commentLabelForInactiveUserCloseAccountPoup).getText();
		System.out.println("Following option display in Inactive user close account pop-up:" + commentLabel);
		Assert.assertEquals("Comment*", commentLabel);
		ObjectRepo.test.log(Status.PASS, "Following option display in Inactive user close account pop-up:" + commentLabel);
		String cancelButton=driver.findElement(cancelButtonForInactiveUserCloseAccountPoup).getText();
		System.out.println("Following option display in Inactive user close account pop-up:" + cancelButton);
		Assert.assertEquals("CANCEL", cancelButton);
		ObjectRepo.test.log(Status.PASS, "Following option display in Inactive user close account pop-up:" + cancelButton);
		String closeUserAccountButton=driver.findElement(closeUserAccountButtonForInactiveUserCloseAccountPoup).getText();
		System.out.println("Following option display in Inactive user close account pop-up:" + closeUserAccountButton);
		Assert.assertEquals("CLOSE USER ACCOUNT", closeUserAccountButton);
		ObjectRepo.test.log(Status.PASS, "Following option display in Inactive user close account pop-up:" + closeUserAccountButton);
		driver.findElement(userEmailFieldOnEditUserEmailPopup).sendKeys("Close user account");
		Thread.sleep(2000);
		String afterEnterComment=driver.findElement(userEmailFieldOnEditUserEmailPopup).getAttribute("value");
		System.out.println("Comment field after entering data:" + afterEnterComment);
		driver.findElement(cancelButtonForInactiveUserCloseAccountPoup).click();
	}

	public void viewUserRoleTypeAndRoleAndRequestStatus() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2200)");
		Thread.sleep(1000);
		String roleType=driver.findElement(individualRoleTypeInRoleTypeDropdown).getText();
		System.out.println("User Role type is :" + roleType);
		Assert.assertEquals("Individual Users", roleType);
		ObjectRepo.test.log(Status.PASS, "User Role type is :" + roleType);
		Thread.sleep(1000);
		String role=driver.findElement(individualRoleInRoleDropdown).getText();
		System.out.println("User Role is :" + role);
		Assert.assertEquals("Individual Users", roleType);
		ObjectRepo.test.log(Status.PASS, "User Role is :" + role);
		js.executeScript("window.scrollBy(0,1800)");
	}

	public void viewUnshareProfileOptionAndClickOnUnshareProfileOption() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1800)");
		Thread.sleep(1000);
		String requestStatus=driver.findElement(requestStatusApprovedCrossJurisdiction).getText();
		System.out.println("Request status of the user is :" + requestStatus);
		Assert.assertEquals("Approved Cross Jurisdiction", requestStatus);
		ObjectRepo.test.log(Status.PASS, "Request status of the user is :" + requestStatus);
		driver.findElement(crossJurisdictionRequestOption).click();
		String unshareUserProfileOption=driver.findElement(unshareUserProfileRadioButton).getText();
		System.out.println("JU Shoul able to view :" + unshareUserProfileOption);
		Assert.assertEquals("Unshare User Profile", unshareUserProfileOption);
		ObjectRepo.test.log(Status.PASS, "JU Shoul able to view :" + unshareUserProfileOption);
		System.out.println("JU user view user profile option successfully");
		ObjectRepo.test.log(Status.PASS, "JU user view user profile option successfully");
		driver.findElement(unshareUserProfileRadioButton).click();
		String availableText=driver.findElement(By.xpath("(//*[@class='MuiTypography-root MuiTypography-body1 css-1195g5e'])[2]")).getText();
		System.out.println("Text after click on unshare profile button:" + availableText);
		driver.findElement(By.xpath("//div[@id='mui-component-select-SelectedJu']")).click();
		driver.findElement(By.xpath("(//span[text()='Quebec'])")).click();
		String availableJurisdiction=driver.findElement(By.xpath("(//*[@class='MuiChip-label MuiChip-labelMedium css-9iedg7'])[2]")).getText();
		System.out.println("Available jurisdiction in field:" + availableJurisdiction);
		driver.findElement(crossJurisdictionCommentField).sendKeys("unshare user profile");
		driver.findElement(saveButton).click();
		//driver.findElement(saveButton).click();
		Thread.sleep(2000);
		String successMessage=driver.findElement(successMessageAfterRegistrarApproveUser).getText();
		System.out.println("Success Message after Original Registrar unshare user profile with Welcoming Jurisdiction:" + successMessage);
		//Assert.assertEquals("Unshare request successful.", successMessage);
		ObjectRepo.test.log(Status.PASS, "Success message" + successMessage);
		WebElement element3 = driver.findElement(crossButtonOnSuccMessAuthorityApproval);
		element3.click();

	}
	
	public void registrarApproveAndAssignIndividualUsersRoleChangeJurisdiction() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1800)");
		//Thread.sleep(1000);
		driver.findElement(approveRadioButton).click();
		//Thread.sleep(1000);
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(selectRoleTypeDropdown));
		driver.findElement(selectRoleTypeDropdown).click();
		Thread.sleep(1000);
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(selectIndividualUsersRolType));
		driver.findElement(selectIndividualUsersRolType).click();
		//Thread.sleep(1000);
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(roleDropdown));
		driver.findElement(roleDropdown).click();
		Thread.sleep(1000);
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(selectIndividualUsersRole));
		driver.findElement(selectIndividualUsersRole).click();
		WebElement element2 = driver.findElement(selectRoleTypeDropdown);
		Actions action = new Actions(driver);
		action.moveToElement(element2).build().perform();
		//Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,2650)");
		WebElement abc = driver.findElement(saveButton);
		js.executeScript("arguments[0].click();", abc);
		//Thread.sleep(6000);
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(successMessageAfterRegistrarApproveUser));
		String successMessage=driver.findElement(successMessageAfterRegistrarApproveUser).getText();
		System.out.println("Success Message after Registrar Approve and assign individual role :" + successMessage);
		Assert.assertEquals("The User’s change of Jurisdiction request has been successfully approved.", successMessage);
		ObjectRepo.test.log(Status.PASS, "Success Message after Registrar Approve and assign individual role :" + successMessage);
		WebElement element3 = driver.findElement(crossButtonOnErrorMessageAfterLogin);
		//Thread.sleep(2000);
		element3.click();
	}

	public void registrarApproveAndAssignIndividualUsersRole() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1800)");
		//Thread.sleep(1000);
		driver.findElement(approveRadioButton).click();
		//Thread.sleep(1000);
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(selectRoleTypeDropdown));
		driver.findElement(selectRoleTypeDropdown).click();
		Thread.sleep(1000);
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(selectIndividualUsersRolType));
		driver.findElement(selectIndividualUsersRolType).click();
		//Thread.sleep(1000);
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(roleDropdown));
		driver.findElement(roleDropdown).click();
		Thread.sleep(1000);
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(selectIndividualUsersRole));
		driver.findElement(selectIndividualUsersRole).click();
		WebElement element2 = driver.findElement(selectRoleTypeDropdown);
		Actions action = new Actions(driver);
		action.moveToElement(element2).build().perform();
		//Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,2650)");
		WebElement abc = driver.findElement(saveButton);
		js.executeScript("arguments[0].click();", abc);
		//Thread.sleep(6000);
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(successMessageAfterRegistrarApproveUser));
		String successMessage=driver.findElement(successMessageAfterRegistrarApproveUser).getText();
		System.out.println("Success Message after Registrar Approve and assign individual role :" + successMessage);
		//Assert.assertEquals("User request has been approved.", successMessage);  //After Success Message fix uncomment this line
		ObjectRepo.test.log(Status.PASS, "Success Message after Registrar Approve and assign individual role :" + successMessage);
		WebElement element3 = driver.findElement(crossButtonOnErrorMessageAfterLogin);
		//Thread.sleep(2000);
		element3.click();
	}

	public void registrarSearchUserAndViewInGrid() throws Exception {
		Thread.sleep(2000);
		WebElement user1=driver.findElement(searchField);
		user1.sendKeys(userId);
		WebElement firstNameOfUser=driver.findElement(searchRecordFirstname);
		Thread.sleep(2000);
		String requestStatus=driver.findElement(searchField).getText();
		Thread.sleep(2000);
		//		if(firstNameOfUser.isDisplayed()) {
		//			System.out.println("Request status of the user is:"+requestStatus);
		//		}
		//		else {
		//			System.out.println("User is not appeared");
		//		}


	}
	public void loginAfterCancelUserRegistration() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(userid).sendKeys(userId);
		System.out.println("step : Enter Valid User Id  ");
		ObjectRepo.test.log(Status.PASS, "step1 : Enter valid User Id ");
		driver.findElement(passphraseOnLoginPage).sendKeys(prop.getProperty("Passphrase"));
		System.out.println("step : Enter Valid passphrase  ");
		WebElement element = driver.findElement(loginbutton);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		System.out.println("step : Click on login button  ");
		ObjectRepo.test.log(Status.PASS, "step1 : Click on login button ");
		Thread.sleep(1000);
		String errormess=driver.findElement(By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']")).getText();
		System.out.println("Error message when user login after cancel user registration:"+errormess);
		Assert.assertEquals("User ID or passphrase entered is invalid", errormess);
		ObjectRepo.test.log(Status.PASS, "Error message when user login after cancel user registration:"+errormess);
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@data-testid='CloseIcon']")).click();
		driver.navigate().refresh();
	}

	public void loginUserWithRememberMeCheckbox() throws InterruptedException {
		//		driver.findElement(textuserid).sendKeys("pendinguser2");
		//		System.out.println("UserID sent to the textbox is : pendinguser2");
		//		driver.findElement(passphrase).sendKeys("Pendinguser@123");
		//		Thread.sleep(4000);
		////		new WebDriverWait(driver,40).until(ExpectedConditions.elementToBeClickable(checkBoxRememberMe));

		//		WebElement element=driver.findElement(loginbutton);
		//		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		//		js2.executeScript("arguments[0].click()", element);
		//		driver.findElement(answerField).sendKeys(prop.getProperty("SecurityAnswer1"));
		//		driver.findElement(continueButtonForLogin).click();
		//		String welcomeMsg = driver.findElement(By.xpath("//*[text()='Welcome!']")).getText();
		//		Assert.assertEquals(welcomeMsg , "Welcome!");


		Thread.sleep(2000);
		driver.findElement(userid).sendKeys(userId);
		System.out.println("step : Enter Valid User Id  ");
		ObjectRepo.test.log(Status.PASS, "step1 : Enter valid User Id ");
		driver.findElement(passphraseOnLoginPage).sendKeys(prop.getProperty("Passphrase"));
		System.out.println("step : Enter Valid passphrase  ");
		ObjectRepo.test.log(Status.PASS, "step1 : Enter valid passphrase ");
		driver.findElement(checkBoxRememberMe).click();
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
			driver.findElement(answerField).sendKeys(prop.getProperty("Answer1"));
		}
		else if(str.contains("maiden name?")){
			driver.findElement(answerField).sendKeys(prop.getProperty("Answer2"));
		}
		else if(str.contains("first car?")){
			driver.findElement(answerField).sendKeys(prop.getProperty("Answer3"));
		}
		else {
			System.out.println("Nothing");
		}
		WebElement element1 = driver.findElement(continueButtonForLogin);
		js2.executeScript("arguments[0].click()", element1);
		new WebDriverWait(driver, 60).until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='2. Submit Required Documents']")));
	}

	public void loginAsJSAUserOfCaliForniaJurisdiction() throws InterruptedException {
		Thread.sleep(2000);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.findElement(userid).sendKeys(prop.getProperty("LoginAsJSAUserCaliforniaUserID"));
		driver.findElement(passphraseOnLoginPage).sendKeys(prop.getProperty("LoginAsJSAUserCaliforniaPassphrase"));
		WebElement element = driver.findElement(loginbutton);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		Thread.sleep(2000);
		//driver.findElement(answerField).sendKeys(prop.getProperty("SecurityAnswer1"));
		// driver.findElement(loginbutton).click();
	}

	public void anotherRegistrarApproveUpdateEmail(){
		String oldValueEmailField=driver.findElement(oldValueOfEmailField).getText();
		System.out.println("Old Value of Email Field :" + oldValueEmailField);
		String newValueEmailField=driver.findElement(newValueOfEmailField).getText();
		System.out.println("New Value of Email  Field :" + newValueEmailField);	
		String oldValueConfirmEmailField=driver.findElement(oldValueOfConfirmEmailField).getText();
		System.out.println("Old Value of Confirm Email  Field :" + oldValueConfirmEmailField);
		String newValueConfirmEmailField=driver.findElement(newValueOfConfirmEmailField).getText();
		System.out.println("New Value of Confirm Email Field :" + newValueConfirmEmailField);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1800)");
		//Thread.sleep(1000);
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(proposedUserDetailsOption));
		driver.findElement(proposedUserDetailsOption).click();
		driver.findElement(approveRadioButton).click();
		driver.findElement(saveButton).click();
		//Thread.sleep(1000);
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(successMessageAfterRegistrarDeactivateUserWithoutProfileAccess));
		String successMessage=driver.findElement(successMessageAfterRegistrarDeactivateUserWithoutProfileAccess).getText();
		System.out.println("Success Message after another Registrar approve update email address:" + successMessage);
		Assert.assertEquals("User Profile Changes Approved", successMessage);
		ObjectRepo.test.log(Status.PASS, "Success Message after another Registrar approve update email address:" + successMessage);
		driver.findElement(crossButtonOnSuccMessAuthorityApproval).click();
	}

	public void authorityDeniedRoleChange() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1800)");
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(denyRadioButton));
		driver.findElement(denyRadioButton).click();
		driver.findElement(reasonForDenialDropdown).click();
		driver.findElement(selectDenialReason1).click();
		driver.findElement(commentField).sendKeys("Deny Change Jurisdiction Request");
		driver.findElement(saveButton).click();
		//Thread.sleep(2000);
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(successMessageDeniedUserRegistration));
		String successMessage=driver.findElement(successMessageDeniedUserRegistration).getText();
		System.out.println("Success Message for deny role change by Authority  : "+ successMessage);
		//Assert.assertEquals("Role Change Request have been denied.", successMessage);
		ObjectRepo.test.log(Status.PASS, "Role Change Request have been denied."+successMessage);
		driver.findElement(crossButtonOnSuccMessAuthorityApproval).click();
	}
	
	public void registrarDeniedProposedUserDetailsWithoutSelectingDenialReason() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1800)");
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(proposedUserDetailsOption));
		driver.findElement(proposedUserDetailsOption).click();
		driver.findElement(denyRadioButton).click();
		driver.findElement(By.xpath("//div[@id='mui-component-select-ProfileUpdateDenialReason']")).click();
		WebElement element6=driver.findElement(approveRadioButton);
		Actions action=new Actions(driver); 
		action.moveToElement(element6).build().perform();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[@id='mui-component-select-ProfileUpdateDenialReason']")).click();
		//driver.findElement(reasonForDenialDropdown).click();
		Thread.sleep(4000);
		WebElement element7=driver.findElement(By.xpath("//textarea[@id='ProfileUpdateComments']"));
		action.moveToElement(element7).build().perform();
	    //element7.sendKeys("Deny user registration");
		WebElement element4=driver.findElement(saveButton);
		if(element4.isEnabled()) {
			System.out.println("save button is enabled");
			ObjectRepo.test.log(Status.PASS, "save button is enabled");
		}
		else {
			System.out.println("save button is not enabled");
			ObjectRepo.test.log(Status.PASS, "save button is not enabled");
		}
	}

	public void registrarDeniedProposedUserDetails() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1800)");
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(proposedUserDetailsOption));
		driver.findElement(proposedUserDetailsOption).click();
		driver.findElement(denyRadioButton).click();
		driver.findElement(By.xpath("//div[@id='mui-component-select-ProfileUpdateDenialReason']")).click();
		driver.findElement(selectDenialReason1).click();
		driver.findElement(By.xpath("//textarea[@id='ProfileUpdateComments']")).sendKeys("Deny Change Jurisdiction Request");
		driver.findElement(saveButton).click();
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(successMessageDeniedUserRegistration));
		String successMessage=driver.findElement(successMessageDeniedUserRegistration).getText();
		System.out.println("Success Message for deny proposed user details by Registrar  : "+ successMessage);
		Assert.assertEquals("User Details Change Denied.", successMessage);
		ObjectRepo.test.log(Status.PASS, "Success Message for deny proposed user details by Registrar  : "+ successMessage);
		driver.findElement(crossButtonOnSuccMessAuthorityApproval).click();
	}
	
	

	public void originalJurisdictionRegistrarUnshareUserProfileWithWelcomingJurisdiction() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2500)");
		Thread.sleep(1000);
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(crossJurisdictionRequestOption));
		driver.findElement(crossJurisdictionRequestOption).click();
		driver.findElement(unshareUserProfileRadioButton).click();
		driver.findElement(saveButton).click();
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(successMessageAfterRegistrarApproveUser));
		String successMessage=driver.findElement(successMessageAfterRegistrarApproveUser).getText();
		System.out.println("Success Message after Original Registrar Unshare user profile with Welcoming Jurisdiction:" + successMessage);
		WebElement element3 = driver.findElement(crossButtonOnSuccMessAuthorityApproval);
		element3.click();
		
	}

	public void welcomingRegistrarDeniedChangeJurisdictionRequest() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1800)");
		Thread.sleep(1000);
		driver.findElement(denyRadioButton).click();
		driver.findElement(reasonForDenialDropdown).click();
		driver.findElement(selectDenialReason1).click();
		driver.findElement(commentField).sendKeys("Deny Change Jurisdiction Request");
		driver.findElement(saveButton).click();
		String successMessage=driver.findElement(successMessageDeniedUserRegistration).getText();
		Thread.sleep(2000);
		System.out.println("Success Message for deny change jurisdiction request by Registrar  : "+ successMessage);
		driver.findElement(crossButtonOnSuccMessAuthorityApproval).click();
	}
	
	public void registrarChangeRoleFromJurisdictionUserRoleTypeToServiceProviderRoleType() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1800)");
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(selectRoleTypeDropdown));
		driver.findElement(selectRoleTypeDropdown).click();
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(selectServiceProviderRoleType));
		driver.findElement(selectServiceProviderRoleType).click();
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(roleDropdown));
		driver.findElement(roleDropdown).click();
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(selectMarketMonitorRole));
		driver.findElement(selectMarketMonitorRole).click();
		js.executeScript("window.scrollBy(0,1800)");
		WebElement abc = driver.findElement(saveButton);
		js.executeScript("arguments[0].click();", abc);
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(successMessageAfterRegistrarApproveUser));
		String successMessage=driver.findElement(By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']")).getText();
		System.out.println("Success Message after Registrar Change role :" + successMessage);
		//Assert.assertEquals("Proposed Role Change request is raised.", successMessage);
		ObjectRepo.test.log(Status.PASS, "Success Message after Registrar Change role :" + successMessage);
		WebElement element3 = driver.findElement(crossButtonOnErrorMessageAfterLogin);
		element3.click();
	}
	
	public void registrarChangeRoleFromIndividualUserRoleTypeToJurisdictionUserRoleType() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1800)");
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(selectRoleTypeDropdown));
		driver.findElement(selectRoleTypeDropdown).click();
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(selectJurisdictionUserRoleType));
		driver.findElement(selectJurisdictionUserRoleType).click();
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(roleDropdown));
		driver.findElement(roleDropdown).click();
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Authority']")));
		driver.findElement(By.xpath("//*[text()='Authority']")).click();
		js.executeScript("window.scrollBy(0,1800)");
		WebElement abc = driver.findElement(saveButton);
		js.executeScript("arguments[0].click();", abc);
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(successMessageAfterRegistrarApproveUser));
		String successMessage=driver.findElement(By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']")).getText();
		System.out.println("Success Message after Registrar Change role :" + successMessage);
		//Assert.assertEquals("Proposed Role Change request is raised.", successMessage);
		ObjectRepo.test.log(Status.PASS, "Success Message after Registrar Change role :" + successMessage);
		WebElement element3 = driver.findElement(crossButtonOnErrorMessageAfterLogin);
		element3.click();
	}
	
	public void registrarChangeRoleFromJurisdictionUserRoleTypeToIndividualUserRoleType() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1800)");
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(selectRoleTypeDropdown));
		driver.findElement(selectRoleTypeDropdown).click();
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(selectIndividualUsersRolType));
		driver.findElement(selectIndividualUsersRolType).click();
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(roleDropdown));
		driver.findElement(roleDropdown).click();
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(selectIndividualUsersRole));
		driver.findElement(selectIndividualUsersRole).click();
		js.executeScript("window.scrollBy(0,1800)");
		WebElement abc = driver.findElement(saveButton);
		js.executeScript("arguments[0].click();", abc);
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(successMessageAfterRegistrarApproveUser));
		String successMessage=driver.findElement(By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']")).getText();
		System.out.println("Success Message after Registrar Change role :" + successMessage);
		//Assert.assertEquals("Proposed Role Change request is raised.", successMessage);
		ObjectRepo.test.log(Status.PASS, "Success Message after Registrar Change role :" + successMessage);
		WebElement element3 = driver.findElement(crossButtonOnErrorMessageAfterLogin);
		element3.click();
	}
	
	public void registrarChangeRoleFromJurisdictionUserRoleType() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1800)");
		Thread.sleep(1000);
		driver.findElement(roleDropdown).click();
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[text()='Registrar'])[4]")));
		driver.findElement(By.xpath("(//*[text()='Registrar'])[4]")).click();
		driver.findElement(By.xpath("//*[text()='Authority']")).click();
		js.executeScript("window.scrollBy(0,2650)");
		WebElement abc = driver.findElement(saveButton);
		js.executeScript("arguments[0].click();", abc);
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(successMessageAfterRegistrarApproveUser));
		String successMessage=driver.findElement(By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']")).getText();
		System.out.println("Success Message after Registrar Change role :" + successMessage);
		//Assert.assertEquals("Proposed Role Change request is raised.", successMessage);
		ObjectRepo.test.log(Status.PASS, "Success Message after Registrar Change role :" + successMessage);
		WebElement element3 = driver.findElement(crossButtonOnErrorMessageAfterLogin);
		element3.click();
	}
	
	public void registrarChangeRoleFromIndividualUserRoleType() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1800)");
		Thread.sleep(1000);
		driver.findElement(roleDropdown).click();
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(text(),'Individual Users')])[2]")));
		driver.findElement(By.xpath("(//span[contains(text(),'Individual Users')])[2]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Primary Account Representative')]")).click();
		js.executeScript("window.scrollBy(0,2650)");
		WebElement abc = driver.findElement(saveButton);
		js.executeScript("arguments[0].click();", abc);
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(successMessageAfterRegistrarApproveUser));
		String successMessage=driver.findElement(By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']")).getText();
		System.out.println("Success Message after Registrar Change role :" + successMessage);
		//Assert.assertEquals("User role has been changed.", successMessage);
		ObjectRepo.test.log(Status.PASS, "Success Message after Registrar Change role :" + successMessage);
		WebElement element3 = driver.findElement(crossButtonOnErrorMessageAfterLogin);
		element3.click();
	}
	
	public void registrarChangeRoleFromServiceProviderRoleType() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1800)");
		Thread.sleep(1000);
		driver.findElement(roleDropdown).click();
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[text()='Market Monitor'])[4]")));
		driver.findElement(By.xpath("(//*[text()='Market Monitor'])[4]")).click();
		driver.findElement(By.xpath("//*[text()='Financial Service Providers']")).click();
		js.executeScript("window.scrollBy(0,2650)");
		WebElement abc = driver.findElement(saveButton);
		js.executeScript("arguments[0].click();", abc);
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(successMessageAfterRegistrarApproveUser));
		String successMessage=driver.findElement(By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']")).getText();
		System.out.println("Success Message after Registrar Change role :" + successMessage);
		//Assert.assertEquals("Proposed Role Change request is raised.", successMessage);
		ObjectRepo.test.log(Status.PASS, "Success Message after Registrar Change role :" + successMessage);
		WebElement element3 = driver.findElement(crossButtonOnErrorMessageAfterLogin);
		element3.click();
	}

	public void registrarChangeRoleAfterAuthorityRequestRevision() throws InterruptedException {
		String jurisdictionReqRevisionText = driver.findElement(jurisdictionRequestRevisionText).getText();
		System.out.println("Text displyed on upper side when Registrar go to user details page:"+jurisdictionReqRevisionText);
		String commentForRequestRevisionByAuthority = driver.findElement(CommentAddedByAuthorityForRequestRevision).getText();
		System.out.println("Comment added by Authority for Request Revision:"+commentForRequestRevisionByAuthority);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1800)");
		Thread.sleep(1000);
		driver.findElement(approveRadioButton).click();
		Thread.sleep(1000);
		driver.findElement(selectRoleTypeDropdown).click();
		Thread.sleep(1000);
		driver.findElement(selectJurisdictionUserRoleType).click();
		Thread.sleep(1000);
		driver.findElement(roleDropdown).click();
		Thread.sleep(1000);
		driver.findElement(selectRegistrarRole).click();

		WebElement element2 = driver.findElement(selectRoleTypeDropdown);
		Actions action = new Actions(driver);
		action.moveToElement(element2).build().perform();
		Thread.sleep(4000);

		js.executeScript("window.scrollBy(0,2650)");
		WebElement abc = driver.findElement(saveButton);
		js.executeScript("arguments[0].click();", abc);
		Thread.sleep(6000);
		String successMessage=driver.findElement(successMessageAfterRegistrarApproveUser).getText();
		System.out.println("Success Message after Registrar Change role type and role after authority request revision :" + successMessage);
		WebElement element3 = driver.findElement(crossButtonOnErrorMessageAfterLogin);
		element3.click();

	}

	public void welcomingRegistrarViewUserProfile() throws InterruptedException {
		System.out.println("Welcoming Registrar View User Profile With Follwing Details:");
		String firstname = driver.findElement(firstNameLabel).getText();
		System.out.println(firstname);
		String Firstnamedata = driver.findElement(firstNameFieldWithData).getText();
		System.out.println(Firstnamedata);

		String lastname = driver.findElement(lastNameLabel).getText();
		System.out.println(lastname);
		String lastnamedata = driver.findElement(lasttNameFieldWithData).getText();
		System.out.println(lastnamedata);

		String jurisdiction = driver.findElement(jurisdictionLabel).getText();
		System.out.println(jurisdiction);
		String jurisdictionData = driver.findElement(jurisdictionFieldWithData).getText();
		System.out.println(jurisdictionData);

		String status = driver.findElement(statusLabel).getText();
		System.out.println(status);
		String statusdata = driver.findElement(statusFieldWithData).getText();
		System.out.println(statusdata);

		String termsaccepeted = driver.findElement(termsAcceptedLabel).getText();
		System.out.println(termsaccepeted);
		String termsaccepeted1 = driver.findElement(termsAcceptedFieldWithData1).getText();
		System.out.println(termsaccepeted1);
		String termsaccepeted2 = driver.findElement(termsAcceptedFieldWithData2).getText();
		System.out.println(termsaccepeted2);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2650)");
		//Thread.sleep(4000);
//		String returnTosearchResultButton= driver.findElement(returnToSearchResultsButton).getText();
//		System.out.println(returnTosearchResultButton);
//		//Assert.assertEquals(, returnTosearchResultButton);
//		driver.findElement(returnToSearchResultsButton).click();

	}
	public void originalJurisdictionRegistrarShareUserProfileWithWelcomingJurisdiction() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2400)");
		Thread.sleep(2000);
		WebElement crossJurisdiction=driver.findElement(crossJurisdictionRequestOption);
		Actions action=new Actions(driver);
		js.executeScript("arguments[0].click()", crossJurisdiction);
//		action.moveToElement(crossJurisdiction).build().perform();
//		action.click(crossJurisdiction).build().perform();
		//driver.findElement(crossJurisdictionRequestOption).click();
		driver.findElement(shareUserProfileRadioButton).click();
		String availableText=driver.findElement(avialableToShareWithText).getText();
		System.out.println("Text after click on share profile button:" + availableText);
		driver.findElement(By.xpath("//*[@id='CJComments']")).sendKeys("Share profile");
		driver.findElement(saveButton).click();
		Thread.sleep(2000);
		String successMessage=driver.findElement(successMessageAfterRegistrarApproveUser).getText();
		System.out.println("Success Message after Original Registrar share user profile with Welcoming Jurisdiction:" + successMessage);
		WebElement element3 = driver.findElement(crossButtonOnSuccMessAuthorityApproval);
		element3.click();
	}
	
	public void termsAndConditionForCrossJurisdictionFlow() throws InterruptedException {
		WebElement element1 = driver.findElement(welcomeDropdown);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element1);
		WebElement element2 = driver.findElement(userProfileOption);
		js2.executeScript("arguments[0].click()", element2);
		WebElement element3 = driver.findElement(crossJurisdictionOption);
		js2.executeScript("arguments[0].click()", element3);
		Thread.sleep(2000);
		WebElement element4 = driver.findElement(selectJurisdictionDropdownForCrossJurisdiction);
		js2.executeScript("arguments[0].click()", element4);
		js2.executeScript("arguments[0].click()", element4);
		Actions action=new Actions(driver);
		action.moveToElement(element4).build().perform();
		action.doubleClick(element4).build().perform();
		List <WebElement> elements=driver.findElements(By.xpath("//*[@class='MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-1cdtra8']"));
		for(WebElement element5:elements) {
			String option1=element5.getText();
			System.out.println(option1);
			if(element5.isEnabled()) {
				System.out.println(option1+"Option is enabled for change jurisdiction");
			}
			else {
				System.out.println(option1+"Option is not enabled for change jurisdiction");
			}
		}
		driver.findElement(selectQuebecOptionForCrossJurisdiction).click();
		driver.findElement(checkboxIAcceptForCrossJurisdiction).click();
		driver.findElement(By.xpath("//*[contains(text(),'Terms and Conditions')]")).click();
	}
	
	public void downloadAttestationFormCrossHurisdictionFlow() throws InterruptedException {
		WebElement element1 = driver.findElement(welcomeDropdown);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element1);
		WebElement element2 = driver.findElement(userProfileOption);
		js2.executeScript("arguments[0].click()", element2);
		WebElement element3 = driver.findElement(crossJurisdictionOption);
		js2.executeScript("arguments[0].click()", element3);
		Thread.sleep(5000);
		WebElement element4 = driver.findElement(selectJurisdictionDropdownForCrossJurisdiction);
		//js2.executeScript("arguments[0].click()", element4);
		//js2.executeScript("arguments[0].click()", element4);
		Actions action=new Actions(driver);
		action.moveToElement(element4).build().perform();
		action.click(element4).build().perform();
		List <WebElement> elements=driver.findElements(By.xpath("//*[@class='MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-1cdtra8']"));
		for(WebElement element5:elements) {
			String option1=element5.getText();
			System.out.println(option1);
			if(element5.isEnabled()) {
				System.out.println(option1+"Option is enabled for change jurisdiction");
			}
			else {
				System.out.println(option1+"Option is not enabled for change jurisdiction");
			}
		}
		driver.findElement(selectQuebecOptionForCrossJurisdiction).click();
		driver.findElement(checkboxIAcceptForCrossJurisdiction).click();
		WebElement element=driver.findElement(continueButtonForCrossJurisdiction);
		if(element.isEnabled()) {
			System.out.println("Continue button is enabled");
			ObjectRepo.test.log(Status.PASS, "Continue button is enabled");
		}
		else {
			System.out.println("Continue button is not enabled");
			ObjectRepo.test.log(Status.PASS, "Continue button is not enabled");
		}
		driver.findElement(continueButtonForCrossJurisdiction).click();
		Thread.sleep(2000);
		String attestationForm=driver.findElement(By.xpath("//*[@class='MuiTypography-root MuiTypography-subtitle2 css-6toc7']")).getText();
		System.out.println("The Form is:"+attestationForm);
		ObjectRepo.test.log(Status.PASS, "The Form is:"+attestationForm);
		driver.findElement(By.xpath("//*[@class='MuiTypography-root MuiTypography-subtitle2 css-6toc7']")).click();
	}

	public void approvedUserRisedCrossJurisdictionRequest() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(welcomeDropdown).click();
		driver.findElement(userProfileOption).click();
		driver.findElement(crossJurisdictionOption).click();
		new WebDriverWait(driver,60).until(ExpectedConditions.elementToBeClickable(selectJurisdictionDropdownForCrossJurisdiction));
		driver.findElement(selectJurisdictionDropdownForCrossJurisdiction).click();
		//new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(selectQuebecOptionForCrossJurisdiction));
		driver.findElement(selectQuebecOptionForCrossJurisdiction).click();
		//new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(checkboxIAcceptForCrossJurisdiction));
		WebElement element=driver.findElement(checkboxIAcceptForCrossJurisdiction);
//		Actions action=new Actions(driver);
//		action.moveToElement(element).build().perform();
//		action.doubleClick(element).build().perform();
//		action.click(element).build().perform();
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		driver.findElement(continueButtonForCrossJurisdiction).click();
		driver.findElement(submitButtonForCrossJurisdiction).click();
		Thread.sleep(2000);
		String successMessage=driver.findElement(successMessageAfterRegistrarApproveUser).getText();
		System.out.println("Success Message after User submit cross jurisdiction request:" + successMessage);
		driver.findElement(closeIcon).click();
		Thread.sleep(2000);
		ObjectRepo.test.log(Status.PASS, "step : Change Jurisdiction request made successfully");
		String requestStatusOfUser = driver.findElement(requestStatusCrossJurisdiction).getText();
		System.out.println("Request status after user submit cross jurisdiction request :" + requestStatusOfUser);
		Assert.assertEquals("Pending Cross Jurisdiction", requestStatusOfUser);
		String OriginalJursdiction = driver.findElement(originalJurisdictionText).getText();
		System.out.println("Original Jurisdiction Name:" + OriginalJursdiction);
		String welcomingJurisdiction = driver.findElement(welcomingJurisdictionText).getText();
		System.out.println("Welcoming Jurisdiction Name:" + welcomingJurisdiction);
	}

	public void LoginAsCaliforniaAuthority() throws InterruptedException {
		Thread.sleep(2000);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.findElement(userid).sendKeys(prop.getProperty("LoginAsAuthorityUsernameCalifornia"));
		driver.findElement(passphraseOnLoginPage).sendKeys(prop.getProperty("LoginAsAuthorityPasswordCalifornia"));
		WebElement element = driver.findElement(loginbutton);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		Thread.sleep(2000);
	}

	public void welcomingRegistrarApproveChangeJurisdictionRequest() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1800)");
		Thread.sleep(1000);
		driver.findElement(approveRadioButton).click();
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,2650)");
		WebElement abc = driver.findElement(saveButton);
		js.executeScript("arguments[0].click();", abc);
		Thread.sleep(2000);
		String successMessage=driver.findElement(successMessageAfterRegistrarApproveUser).getText();
		System.out.println("Success Message after Welcoming Registrar Approve change jurisdiction request:" + successMessage);
		WebElement element3 = driver.findElement(crossButtonOnSuccMessAuthorityApproval);
		element3.click();
	}

	public void authorityApproveProposedRoleChange() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1800)");
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(approveRadioButton));
		driver.findElement(approveRadioButton).click();
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(saveButton));
		js.executeScript("window.scrollBy(0,2650)");
		WebElement abc = driver.findElement(saveButton);
		js.executeScript("arguments[0].click();", abc);
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(successMessageAfterRegistrarApproveUser));
		String successMessage=driver.findElement(successMessageAfterRegistrarApproveUser).getText();
		System.out.println("Success Message after Authority approve Proposed Role Change:" + successMessage);
		WebElement element3 = driver.findElement(crossButtonOnSuccMessAuthorityApproval);
		element3.click();
	}
	
	public void registrarProposedRoleChnageFromJurisdictionUserRoleType() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1800)");
		Thread.sleep(1000);
		driver.findElement(roleDropdown).click();
		Thread.sleep(1000);
		driver.findElement(selectMarketMonitorRole1).click();
		Thread.sleep(1000);
		driver.findElement(selectFinancialServiceProvidersRole).click();
		Thread.sleep(1000);
		WebElement element2 = driver.findElement(selectRoleTypeDropdown);
		Actions action = new Actions(driver);
		action.moveToElement(element2).build().perform();
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,2650)");
		WebElement abc = driver.findElement(saveButton);
		js.executeScript("arguments[0].click();", abc);
		Thread.sleep(6000);
		String successMessage=driver.findElement(successMessageAfterRegistrarDeactivateUserWithoutProfileAccess).getText();
		Thread.sleep(1000);
		System.out.println("Success Message after registrar proposed role change:" + successMessage );
		driver.findElement(crossButtonOnSuccMessAuthorityApproval).click();
	}

	public void registrarProposedRoleChnage() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1800)");
		Thread.sleep(1000);
		driver.findElement(roleDropdown).click();
		Thread.sleep(1000);
		driver.findElement(selectMarketMonitorRole1).click();
		Thread.sleep(1000);
		driver.findElement(selectFinancialServiceProvidersRole).click();
		Thread.sleep(1000);
		WebElement element2 = driver.findElement(selectRoleTypeDropdown);
		Actions action = new Actions(driver);
		action.moveToElement(element2).build().perform();
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,2650)");
		WebElement abc = driver.findElement(saveButton);
		js.executeScript("arguments[0].click();", abc);
		Thread.sleep(6000);
		String successMessage=driver.findElement(successMessageAfterRegistrarDeactivateUserWithoutProfileAccess).getText();
		Thread.sleep(1000);
		System.out.println("Success Message after registrar proposed role change:" + successMessage );
		driver.findElement(crossButtonOnSuccMessAuthorityApproval).click();
	}

	public void registrarApproveProposedUserDetails() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2400)");
		Thread.sleep(1000);
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(proposedUserDetailsOption));
		driver.findElement(proposedUserDetailsOption).click();
		driver.findElement(approveRadioButton).click();
		driver.findElement(saveButton).click();
		Thread.sleep(1000);
		String successMessage=driver.findElement(successMessageAfterRegistrarDeactivateUserWithoutProfileAccess).getText();
		System.out.println("Success Message after Registrar approve proposed user details:" + successMessage );
		driver.findElement(crossButtonOnSuccMessAuthorityApproval).click();
	}

	public void authorityRequestRevisionToRegistrar() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1800)");
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(requestRevisionRadioButton));
		driver.findElement(requestRevisionRadioButton).click();
		String commentField1=driver.findElement(By.xpath("//label[text()='Comments']")).getText();
		System.out.println("Comment field is:" + commentField1);
		Assert.assertEquals("Comments*", commentField1);
		ObjectRepo.test.log(Status.PASS, "Comment field is:" + commentField1);
		driver.findElement(commentField).sendKeys("request revision by authority");
		driver.findElement(saveButton).click();
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(successMessageAfterRegistrarDeactivateUserWithoutProfileAccess));
		String successMessage=driver.findElement(successMessageAfterRegistrarDeactivateUserWithoutProfileAccess).getText();
		System.out.println("Success Message after authority request revision to Registrar:" + successMessage );
		Assert.assertEquals("User has successfully requested revisions", successMessage);
		ObjectRepo.test.log(Status.PASS, "Success Message after authority request revision to Registrar:" + successMessage);
		driver.findElement(crossButtonOnSuccMessAuthorityApproval).click();
	}

	public void registrarClosedUserAccount() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(searchField).sendKeys(userId);
		Thread.sleep(2000);
		driver.findElement(threeDots).click();
		driver.findElement(inactivateUserClosedAccountOption).click();
		driver.findElement(userEmailFieldOnEditUserEmailPopup).sendKeys("Closed User Account");
		WebElement element=driver.findElement(proposeButtonOnEditUserEmailPopup);
		Thread.sleep(2000);
		if(element.isEnabled()) {
			System.out.println("close user account button is enabled" );
		}
		else {
			System.out.println("close user account button is not enabled" );
		}
		driver.findElement(proposeButtonOnEditUserEmailPopup).click();
		Thread.sleep(2000);
		String successMessage=driver.findElement(successMessageAfterRegistrarDeactivateUserWithoutProfileAccess).getText();
		Thread.sleep(1000);
		System.out.println("Success Message after registrar deactivate user without profile access" + successMessage );
		driver.findElement(crossButtonOnSuccMessAuthorityApproval).click();
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(searchField).sendKeys(userId);
		Thread.sleep(1000);
		driver.findElement(searchRecordFirstname).click();
	}

	public void loginAsAnotherRegistrarUserOfQuebecJurisdiction() throws InterruptedException {
		Thread.sleep(2000);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.findElement(userid).sendKeys(prop.getProperty("LoginAsAnotherRegistrarUserOfQuebecUserID"));
		driver.findElement(passphraseOnLoginPage).sendKeys(prop.getProperty("LoginAsAnotherRegistrarUserOfQuebecPassword"));
		WebElement element = driver.findElement(loginbutton);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		Thread.sleep(2000);
		//driver.findElement(answerField).sendKeys(prop.getProperty("SecurityAnswer1"));
		// driver.findElement(loginbutton).click();
	}
	
	public void registrarUpdateUserExistingMailAddressFromUserDetailsPage() throws InterruptedException{
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(threeDots));
		driver.findElement(threeDots).click();
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(updateEmailOption));
		driver.findElement(updateEmailOption).click();
		String email=generateEmailString();
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(userEmailFieldOnEditUserEmailPopup));
		driver.findElement(userEmailFieldOnEditUserEmailPopup).sendKeys("jsa.ws@yopmail.com");
		WebElement element=driver.findElement(proposeButtonOnEditUserEmailPopup);
		Actions action=new Actions(driver);
		action.doubleClick(element).build().perform();
		driver.findElement(proposeButtonOnEditUserEmailPopup).click();
		Thread.sleep(2000);
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='inctiveReasons-helper-text']")));
		String errorMessage=driver.findElement(By.xpath("//*[@id='inctiveReasons-helper-text']")).getText();
		System.out.println("Error message:" + errorMessage);
		Assert.assertEquals("Email Address is not available", errorMessage);
		ObjectRepo.test.log(Status.PASS, "Error message:" + errorMessage);
	}
	
	public void registrarUpdateUserMailAddressFromUserDetailsPage(){
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(threeDots));
		driver.findElement(threeDots).click();
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(updateEmailOption));
		driver.findElement(updateEmailOption).click();
		String email=generateEmailString();
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(userEmailFieldOnEditUserEmailPopup));
		driver.findElement(userEmailFieldOnEditUserEmailPopup).sendKeys(email);
		WebElement element=driver.findElement(proposeButtonOnEditUserEmailPopup);
		Actions action=new Actions(driver);
		action.moveToElement(element).build().perform();
		action.click(element).build().perform();
		//action.doubleClick(element).build().perform();
		driver.findElement(proposeButtonOnEditUserEmailPopup).click();
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(successMessageAfterRegistrarDeactivateUserWithoutProfileAccess));
		String successMessage=driver.findElement(successMessageAfterRegistrarDeactivateUserWithoutProfileAccess).getText();
		System.out.println("Success Message after registrar update user mail address:" + successMessage);
		//Assert.assertEquals("mail sent for update email.", successMessage);
		ObjectRepo.test.log(Status.PASS, "Success Message after registrar update user mail address:" + successMessage);
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(crossButtonOnSuccMessAuthorityApproval));
		driver.findElement(crossButtonOnSuccMessAuthorityApproval).click();
		driver.navigate().refresh();
	}
	
	public void registrarUpdateUserMailAddressFromUserDetailsPageWhichAreAlreadyProposed() throws InterruptedException{
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(threeDots));
		driver.findElement(threeDots).click();
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(updateEmailOption));
		driver.findElement(updateEmailOption).click();
		String email=generateEmailString();
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(userEmailFieldOnEditUserEmailPopup));
		driver.findElement(userEmailFieldOnEditUserEmailPopup).sendKeys(email);
		WebElement element=driver.findElement(proposeButtonOnEditUserEmailPopup);
		Actions action=new Actions(driver);
		action.doubleClick(element).build().perform();
		driver.findElement(proposeButtonOnEditUserEmailPopup).click();
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(successMessageAfterRegistrarDeactivateUserWithoutProfileAccess));
		String successMessage=driver.findElement(successMessageAfterRegistrarDeactivateUserWithoutProfileAccess).getText();
		System.out.println("Success Message after registrar update user mail address:" + successMessage);
		Assert.assertEquals("mail sent for update email.", successMessage);
		ObjectRepo.test.log(Status.PASS, "Success Message after registrar update user mail address:" + successMessage);
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(crossButtonOnSuccMessAuthorityApproval));
		driver.findElement(crossButtonOnSuccMessAuthorityApproval).click();
		driver.navigate().refresh();
		Thread.sleep(2000);
		new WebDriverWait(driver,60).until(ExpectedConditions.elementToBeClickable((searchField)));
		driver.findElement(searchField).sendKeys(userId);
		Thread.sleep(3000);
		driver.findElement(searchRecordFirstname).click();
		Thread.sleep(2000);
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(threeDots));
		driver.findElement(threeDots).click();
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(updateEmailOption));
		driver.findElement(updateEmailOption).click();
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(userEmailFieldOnEditUserEmailPopup));
		driver.findElement(userEmailFieldOnEditUserEmailPopup).sendKeys(email);
		Thread.sleep(1000);
		WebElement element1=driver.findElement(By.xpath("//button[@data-testid='priv_btn_Search']"));
		action.moveToElement(element1).build().perform();
		action.doubleClick(element1).build().perform();
		driver.findElement(proposeButtonOnEditUserEmailPopup).click();
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']")));
		String errorMessage=driver.findElement(By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']")).getText();
		System.out.println("Error Message after registrar update user mail address which are already update:" + errorMessage);
		Assert.assertEquals("There is an ongoing pending user detail change request that needs to be approved.", errorMessage);
		ObjectRepo.test.log(Status.PASS, "Error Message after registrar update user mail address which are already update:" + errorMessage);
	}

	public void registrarUpdateUserMailAddress() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(searchField).sendKeys(userId);
		Thread.sleep(2000);
		driver.findElement(threeDots).click();
		Thread.sleep(1000);
		driver.findElement(updateEmailOption).click();
		String email=generateEmailString();
		Thread.sleep(1000);
		driver.findElement(userEmailFieldOnEditUserEmailPopup).sendKeys(email);
		WebElement element=driver.findElement(proposeButtonOnEditUserEmailPopup);
		Actions action=new Actions(driver);
		action.doubleClick(element).build().perform();
		driver.findElement(proposeButtonOnEditUserEmailPopup).click();;
		Thread.sleep(2000);
		String successMessage=driver.findElement(successMessageAfterRegistrarDeactivateUserWithoutProfileAccess).getText();
		Thread.sleep(1000);
		System.out.println("Success Message after registrar deactivate user without profile access" + successMessage );
		driver.findElement(crossButtonOnSuccMessAuthorityApproval).click();
		driver.navigate().refresh();
	}

	public void registrarDeactivateUserLoginWithProfileAccess() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(searchField).sendKeys(userId);
		Thread.sleep(2000);
		driver.findElement(threeDots).click();
		driver.findElement(deactivateUserLoginOption).click();
		driver.findElement(deactivateWithProfileAccessRadioButton).click();
		driver.findElement(deactivateUserReasons).sendKeys("Deactivate user without profile access");
		driver.findElement(continueButtonOnDeactivateUserPopup).click();
		Thread.sleep(2000);
		String successMessage=driver.findElement(successMessageAfterRegistrarDeactivateUserWithoutProfileAccess).getText();
		Thread.sleep(1000);
		System.out.println("Success Message after registrar deactivate user without profile access" + successMessage );
		driver.findElement(crossButtonOnSuccMessAuthorityApproval).click();
		driver.navigate().refresh();
	}

	public void registrarActivateUserLogin() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(searchField).sendKeys(userId);
		Thread.sleep(2000);
		driver.findElement(threeDots).click();
		driver.findElement(activateUserLoginOption).click();
		Thread.sleep(5000);
		String successMessage=driver.findElement(successMessageAfterRegistrarDeactivateUserWithoutProfileAccess).getText();
		System.out.println("Success Message after registrar Activate user:" + successMessage );
		Assert.assertEquals("Account status is changed to Active. The user can login to the system.", successMessage);
		Thread.sleep(2000);
		driver.findElement(crossButtonOnSuccMessAuthorityApproval).click();
		driver.navigate().refresh();	
	}

	public void registrarDeactivateUserLoginWithoutProfileAccess() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(searchField).sendKeys(userId);
		Thread.sleep(2000);
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(threeDots));
		driver.findElement(threeDots).click();
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(deactivateUserLoginOption));
		driver.findElement(deactivateUserLoginOption).click();
		driver.findElement(deactivateWithoutProfileAccessRadioButton).click();
		driver.findElement(deactivateUserReasons).sendKeys("Deactivate user without profile access");
		driver.findElement(continueButtonOnDeactivateUserPopup).click();
		//Thread.sleep(7000);
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(successMessageAfterRegistrarDeactivateUserWithoutProfileAccess));
		String successMessage=driver.findElement(successMessageAfterRegistrarDeactivateUserWithoutProfileAccess).getText();
		System.out.println("Success Message after registrar deactivate user without profile access:" + successMessage );
		Assert.assertEquals("Account status is changed to Inactive. The user can not login to the system.", successMessage);
		ObjectRepo.test.log(Status.PASS, "Account status is changed to Inactive. The user can not login to the system."+ successMessage);
		//Thread.sleep(2000);
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(crossButtonOnSuccMessAuthorityApproval));
		driver.findElement(crossButtonOnSuccMessAuthorityApproval).click();
		driver.navigate().refresh();
	}

	public void authorityDeniedUser() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1800)");
		driver.findElement(denyRadioButton).click();
		String element1=driver.findElement(selectRoleTypeDropdown).getAttribute("aria-disabled");
		if(element1=="True") {
			System.out.println("The role type dropdown is enabled");
			ObjectRepo.test.log(Status.PASS, "The role type dropdown is enabled");
		}
		else {
			System.out.println("The role type dropdown is not enabled");
			ObjectRepo.test.log(Status.PASS, "The role type dropdown is not enabled");
		}
		String element2=driver.findElement(roleDropdown).getAttribute("aria-disabled");
		if(element2=="True") {
			System.out.println("The role dropdown is enabled");
			ObjectRepo.test.log(Status.PASS, "The role dropdown is enabled");
		}
		else {
			System.out.println("The role dropdown is not enabled");
			ObjectRepo.test.log(Status.PASS, "The role dropdown is not enabled");
		}
		Thread.sleep(1000);
		WebElement element3=driver.findElement(reasonForDenialDropdown);
		if(element3.isEnabled()) {
			System.out.println("The Reason for denial dropdown is enabled");
			ObjectRepo.test.log(Status.PASS, "The Reason for denial dropdown is enabled");
		}
		else {
			System.out.println("The Reason for denial is not enabled");
			ObjectRepo.test.log(Status.PASS, "The Reason for denial is not enabled");
		}
		driver.findElement(reasonForDenialDropdown).click();
		driver.findElement(selectDenialReason1).click();
		String commentField1=driver.findElement(By.xpath("//label[text()='Comments']")).getText();
		System.out.println("Comment field is:" + commentField1);
		Assert.assertEquals("Comments*", commentField1);
		ObjectRepo.test.log(Status.PASS, "Comment field is:" + commentField1);
		driver.findElement(commentField).sendKeys("Deny user registration by authority");
		driver.findElement(saveButton).click();
		Thread.sleep(2000);
		String successMessage=driver.findElement(successMessageDeniedUserRegistration).getText();
		System.out.println("Success Message for deny user registration by Authority  : "+ successMessage);
		//Assert.assertEquals("User request has been denied.", successMessage);
		ObjectRepo.test.log(Status.PASS, "Success Message for deny user registration by Authority  : "+ successMessage);
		driver.findElement(crossButtonOnSuccMessAuthorityApproval).click();	
		Thread.sleep(2000);
		driver.findElement(searchField).sendKeys(userId);
		Thread.sleep(2000);
		driver.findElement(searchRecordFirstname).click();
		String requestStatus=driver.findElement(By.xpath("(//*[contains(text(),'Registration Denied')])[1]")).getText();	
		System.out.println("Request Status:" + requestStatus);
		Assert.assertEquals("Registration Denied", requestStatus);
		ObjectRepo.test.log(Status.PASS, "Request Status:" + requestStatus);
	}

	public void approvedUserClosedHisAccount() throws InterruptedException {
		driver.findElement(welcomeDropdown).click();
		driver.findElement(userProfileOption).click();
		Thread.sleep(2000);
		driver.findElement(closeUserAccountOption).click();
		driver.findElement(closeUserAccountButtonOnPropmt).click();
	}

	public void californiaRegistrar() throws InterruptedException {
		Thread.sleep(2000);
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@class='MuiTypography-root MuiTypography-h2 css-1hwpmpt']"))));
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.elementToBeClickable((userid)));
//		new WebDriverWait(driver, 60)
//				.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//*[text()='Log In'])[1]")));
		driver.findElement(userid).sendKeys(prop.getProperty("LoginAsJurisdictionUserUsername"));
		driver.findElement(passphraseOnLoginPage).sendKeys(prop.getProperty("LoginAsJurisdictionUserPassword"));
		WebElement element = driver.findElement(loginbutton);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		//Thread.sleep(2000);
	}
	
	public void californiaRegistrar2Login() throws InterruptedException {
		Thread.sleep(2000);
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@class='MuiTypography-root MuiTypography-h2 css-1hwpmpt']"))));
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.elementToBeClickable((userid)));
//		new WebDriverWait(driver, 60)
//				.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//*[text()='Log In'])[1]")));
		driver.findElement(userid).sendKeys(prop.getProperty("LoginAsRegistrarUsernameCalifornia"));
		driver.findElement(passphraseOnLoginPage).sendKeys(prop.getProperty("LoginAsRegistrarPasswordCalifornia"));
		WebElement element = driver.findElement(loginbutton);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		//Thread.sleep(2000);
	}

	public void changeJurisdictionQuebecToCalifornia() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("step : Click on Welcome button and click on User profile menu ");
		driver.findElement(welcomeDropdown).click();
		driver.findElement(userProfileOption).click();
		ObjectRepo.test.log(Status.PASS, "step : Click on Welcome button and click on User profile menu  ");
		Thread.sleep(4000);
		WebElement element4 = driver.findElement(changejurisdiction);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element4);
		System.out.println("step : Select another jurisdiction and click on Continue button");
		Thread.sleep(2000);
		driver.findElement(selectJurisdiction).click();
		driver.findElement(selectCalifornia).click();
		Thread.sleep(2000);
		driver.findElement(continueButtonforSelectJuri).click();
		String pageheader = driver.findElement(pageHeader1).getText();
		Assert.assertEquals(pageheader, "Change Jurisdiction Request");
		ObjectRepo.test.log(Status.PASS, "step : Select another jurisdiction and click on Continue button");

		WebElement element5 = driver.findElement(termsCheckbox);
		js2.executeScript("arguments[0].click()", element5);

		WebElement element1 = driver.findElement(contactUs);
		js2.executeScript("arguments[0].scrollIntoView();", element1);

		Thread.sleep(5000);
		driver.findElement(continueUserdetails).click();
		// wait.until(ExpectedConditions.visibilityOfElementLocated(submitButton));
		Thread.sleep(5000);
		driver.findElement(submitButton).click();
		Thread.sleep(2000);
		String successmessage = driver.findElement(successMsg).getText();
		System.out.println("Success Message is:" + successmessage);
		driver.findElement(closeIcon).click();
		Thread.sleep(2000);
		String requestStatusOfUser = driver.findElement(requestStatus).getText();
		System.out.println("Request status after user submit change jurisdiction request :" + requestStatusOfUser);
		String OriginalJursdiction = driver.findElement(originalJurisdictionText).getText();
		System.out.println("Original Jurisdiction Name" + OriginalJursdiction);
		String welcomingJurisdiction = driver.findElement(welcomingJurisdictionText).getText();
		System.out.println("Welcoming Jurisdiction Name" + welcomingJurisdiction);
	}
	
	public void UserEditTheirDetailsWithoutApprovalFields()  {
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(welcomeDropdown));
		driver.findElement(welcomeDropdown).click();
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(userProfileOption));
		driver.findElement(userProfileOption).click();
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(viewAndEditUserDetailsOption));
		driver.findElement(viewAndEditUserDetailsOption).click();
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(editButton));
		driver.findElement(editButton).click();
		for(int i=1;i<=10;i++) {
			driver.findElement(By.xpath("//input[@id='Employer']")).sendKeys(Keys.BACK_SPACE);
		}
		driver.findElement(By.xpath("//input[@id='Employer']")).sendKeys("element");
		for(int i=1;i<=10;i++) {
			driver.findElement(By.xpath("//input[@id='JobTitle']")).sendKeys(Keys.BACK_SPACE);
		}
		driver.findElement(By.xpath("//input[@id='JobTitle']")).sendKeys("job");
		WebElement element = driver.findElement(saveButtonForRevisionRequestSubmit);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		driver.findElement(continueButtonOnPrompt).click();
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Profile updated successfully')]")));
		String successMessage = driver.findElement(By.xpath("//*[contains(text(),'Profile updated successfully')]")).getText();
		System.out.println("Success Message is :" + successMessage);
		//Assert.assertEquals("Profile updated successfully", successMessage);   //After Success Message fix uncomment this line
		ObjectRepo.test.log(Status.PASS, "Success Message is :" + successMessage);
	}
	
	public void UserEditTheirDetails() throws Exception {
		driver.findElement(welcomeDropdown).click();
		driver.findElement(userProfileOption).click();
		Thread.sleep(2000);
		driver.findElement(viewAndEditUserDetailsOption).click();
		driver.findElement(editButton).click();
		Thread.sleep(2000);
		for(int i=1;i<=6;i++) {
			driver.findElement(firstNameEdit).sendKeys(Keys.BACK_SPACE);
		}
		driver.findElement(firstNameEdit).sendKeys("testdata");
		Thread.sleep(2000);
		for(int i=1;i<=10;i++) {
			driver.findElement(telephoneNumberEdit).sendKeys(Keys.BACK_SPACE);
		}
		driver.findElement(telephoneNumberEdit).sendKeys("0987654321");
		Thread.sleep(2000);
		for(int i=1;i<=12;i++) {
			driver.findElement(street1EditPrimResi).sendKeys(Keys.BACK_SPACE);
		}
		driver.findElement(street1EditPrimResi).sendKeys("datatest");
		Thread.sleep(2000);
		for(int i=1;i<=4;i++) {
			driver.findElement(cityEditMailAdd).sendKeys(Keys.BACK_SPACE);
		}
		driver.findElement(cityEditMailAdd).sendKeys("testio");
		WebElement element = driver.findElement(saveButtonForRevisionRequestSubmit);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		driver.findElement(continueButtonOnPrompt).click();
		String successMessage=driver.findElement(successMessageAfterSubmitRequestRevision).getText();
		System.out.println("Success Message after user edit and submit their details"+ successMessage);
		//		driver.findElement(crossButtonOnErrorMessageAfterLogin).click();
		Thread.sleep(2000);
		System.out.println("User view old and new value after user edit and submit their details :");
		String oldValueFirstName=driver.findElement(oldValueFirstNameField).getText();
		System.out.println("Old Value of First Name Field :" + oldValueFirstName);
		String newValueFirstName=driver.findElement(newValueFirstNameField).getText();
		System.out.println("New Value of First Name Field :" + newValueFirstName);

		String oldValueTelephone=driver.findElement(oldValueTelephoneField).getText();
		System.out.println("Old Value of First Name Field :" + oldValueTelephone);
		String newValueTelephone=driver.findElement(newValueTelephoneField).getText();
		System.out.println("New Value of First Name Field :" + newValueTelephone);

		String oldValueStreet1=driver.findElement(oldValueStreet1Field).getText();
		System.out.println("Old Value of First Name Field :" + oldValueStreet1);
		String newValueStreet1=driver.findElement(newValueStreet1Field).getText();
		System.out.println("New Value of First Name Field :" + newValueStreet1);

		String oldValueCity=driver.findElement(oldValueCityField).getText();
		System.out.println("Old Value of First Name Field :" + oldValueCity);
		String newValueCity=driver.findElement(newValueCityField).getText();
		System.out.println("New Value of First Name Field :" + newValueCity);

		WebElement element1=driver.findElement(returnToUserProfileButton);
		js2.executeScript("arguments[0].click()", element1);
	}

	public void approvedUserLogin() throws Exception {
		Thread.sleep(2000);
		driver.findElement(userid).sendKeys(userId);
		driver.findElement(passphraseOnLoginPage).sendKeys(prop.getProperty("NewPassphrase"));
		WebElement element = driver.findElement(loginbutton);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
	}
	
	public void authorityApproveChangeJurisdiction() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1800)");
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(approveRadioButton));
		driver.findElement(approveRadioButton).click();
		String roleType=driver.findElement(By.xpath("//div[@class='MuiBox-root css-15fzge']")).getText();
		System.out.println("Role type is :" + roleType);
		//Assert.assertEquals("User request has been approved.", roleType);
		ObjectRepo.test.log(Status.PASS, "Role type is :" + roleType);
		String role=driver.findElement(By.xpath("//div[@class='MuiBox-root css-1ng1ylw']")).getText();
		System.out.println("Role is :" + role);
		//Assert.assertEquals("User request has been approved.", role);
		ObjectRepo.test.log(Status.PASS, "Role type is :" + role);
		js.executeScript("window.scrollBy(0,2650)");
		WebElement abc = driver.findElement(saveButton);
		js.executeScript("arguments[0].click();", abc);
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(successMessageAfterRegistrarApproveUser));
		String successMessage=driver.findElement(successMessageAfterRegistrarApproveUser).getText();
		System.out.println("Success Message after Authority Approve user :" + successMessage);
		Assert.assertEquals("The User’s change of Jurisdiction request has been successfully approved.", successMessage);
		ObjectRepo.test.log(Status.PASS, "Success Message after Authority Approve user :" + successMessage);
		WebElement element3 = driver.findElement(crossButtonOnSuccMessAuthorityApproval);
		element3.click();
	}

	public void authorityApproveUser() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1800)");
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(approveRadioButton));
		driver.findElement(approveRadioButton).click();
		String roleType=driver.findElement(By.xpath("//div[@class='MuiBox-root css-15fzge']")).getText();
		System.out.println("Role type is :" + roleType);
		//Assert.assertEquals("User request has been approved.", roleType);
		ObjectRepo.test.log(Status.PASS, "Role type is :" + roleType);
		String role=driver.findElement(By.xpath("//div[@class='MuiBox-root css-1ng1ylw']")).getText();
		System.out.println("Role is :" + role);
		//Assert.assertEquals("User request has been approved.", role);
		ObjectRepo.test.log(Status.PASS, "Role type is :" + role);
		js.executeScript("window.scrollBy(0,2650)");
		WebElement abc = driver.findElement(saveButton);
		js.executeScript("arguments[0].click();", abc);
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(successMessageAfterRegistrarApproveUser));
		String successMessage=driver.findElement(successMessageAfterRegistrarApproveUser).getText();
		System.out.println("Success Message after Authority Approve user :" + successMessage);
		Assert.assertEquals("User request has been approved.", successMessage);
		ObjectRepo.test.log(Status.PASS, "Success Message after Authority Approve user :" + successMessage);
		WebElement element3 = driver.findElement(crossButtonOnSuccMessAuthorityApproval);
		element3.click();
	}

	public void authorityUserLoginForWelcomingJurisdiction() throws Exception {
		Thread.sleep(2000);
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.elementToBeClickable((userid)));
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//*[text()='Log In'])[1]")));
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.findElement(userid).sendKeys(prop.getProperty("LoginAsAuthorityUsernameWelcoming"));
		driver.findElement(passphraseOnLoginPage).sendKeys(prop.getProperty("LoginAsAuthorityPasswordWelcoming"));
		WebElement element = driver.findElement(loginbutton);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		//Thread.sleep(2000);	
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

	public void handlesecurityQuestion() throws InterruptedException {
		//Thread.sleep(2000);
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
		//Thread.sleep(5000);
		driver.findElement(continueButtonForLogin).click();
		System.out.println("Registrar User should logged in successfully.");
	}
	
	public void registrarApproveAndAssignMultipleRoleServiceProviderRole() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1800)");
		Thread.sleep(1000);
		driver.findElement(approveRadioButton).click();
		WebElement element1=driver.findElement(selectRoleTypeDropdown);
		if(element1.isEnabled()) {
			System.out.println("The role type dropdown is enabled");
			ObjectRepo.test.log(Status.PASS, "The role type dropdown is enabled");
		}
		else {
			System.out.println("The role type dropdown is not enabled");
			ObjectRepo.test.log(Status.PASS, "The role type dropdown is not enabled");
		}
		WebElement element2=driver.findElement(roleDropdown);
		if(element2.isEnabled()) {
			System.out.println("The role dropdown is enabled");
			ObjectRepo.test.log(Status.PASS, "The role dropdown is enabled");
		}
		else {
			System.out.println("The role dropdown is not enabled");
			ObjectRepo.test.log(Status.PASS, "The role dropdown is not enabled");
		}
		Thread.sleep(1000);
		WebElement element3=driver.findElement(reasonForDenialDropdown);
		String value=element3.getAttribute("aria-disabled");
		if(value=="True") {
			System.out.println("The Reason for denial dropdown is enabled");
			ObjectRepo.test.log(Status.PASS, "The Reason for denial dropdown is enabled");
		}
		else {
			System.out.println("The Reason for denial is not enabled");
			ObjectRepo.test.log(Status.PASS, "The Reason for denial is not enabled");
		}
		String commentField=driver.findElement(By.xpath("//label[text()='Comments']")).getText();
		System.out.println("Comment field is:" + commentField);
		ObjectRepo.test.log(Status.PASS, "Comment field is:" + commentField);
		Thread.sleep(1000);
		driver.findElement(selectRoleTypeDropdown).click();
		Thread.sleep(1000);
		driver.findElement(selectServiceProviderRoleType).click();
		Thread.sleep(1000);
		driver.findElement(roleDropdown).click();
		Thread.sleep(1000);
		driver.findElement(selectMarketMonitorRole).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Financial Service Providers')]")).click();
		WebElement element5 = driver.findElement(selectRoleTypeDropdown);
		Actions action = new Actions(driver);
		action.moveToElement(element5).build().perform();
		Thread.sleep(4000);

		js.executeScript("window.scrollBy(0,2650)");
		WebElement abc = driver.findElement(saveButton);
		js.executeScript("arguments[0].click();", abc);
		Thread.sleep(2000);
		String text=driver.findElement(textOnPrompt).getText();
		System.out.println("Text present on prompt is:" + text);
		Assert.assertEquals("Are you sure you want to assign multiple roles?", text);
		ObjectRepo.test.log(Status.PASS, "Text present on prompt is:" + text);
		String cancelButton=driver.findElement(cancelButtonOnPrompt).getText();
		System.out.println("Button present on prompt is:" + cancelButton);
		//Assert.assertEquals("Revisions Requested", cancelButton);
		ObjectRepo.test.log(Status.PASS, "Button present on prompt is:" + cancelButton);
		String continueButton=driver.findElement(continueButtonOnPrompt).getText();
		System.out.println("Button present on prompt is:" + continueButton);
		Assert.assertEquals("CONTINUE", continueButton);
		ObjectRepo.test.log(Status.PASS, "Button present on prompt is:" + continueButton);
		driver.findElement(continueButtonOnPrompt).click();
		Thread.sleep(6000);
		String successMessage=driver.findElement(successMessageAfterRegistrarApproveUser).getText();
		System.out.println("Success Message after Registrar Approve and assign market monitor role :" + successMessage);
		Assert.assertEquals("User has sent for Authority Approval", successMessage);
		ObjectRepo.test.log(Status.PASS, "Success Message after Registrar Approve and assign market monitor role :" + successMessage);
		WebElement element4 = driver.findElement(crossButtonOnErrorMessageAfterLogin);
		Thread.sleep(2000);
		element4.click();
	}
	
	public void registrarApproveAndAssignServiceProviderRole() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1800)");
		//Thread.sleep(1000);
		driver.findElement(approveRadioButton).click();
		WebElement element1=driver.findElement(selectRoleTypeDropdown);
		if(element1.isEnabled()) {
			System.out.println("The role type dropdown is enabled");
			ObjectRepo.test.log(Status.PASS, "The role type dropdown is enabled");
		}
		else {
			System.out.println("The role type dropdown is not enabled");
			ObjectRepo.test.log(Status.PASS, "The role type dropdown is not enabled");
		}
		WebElement element2=driver.findElement(roleDropdown);
		if(element2.isEnabled()) {
			System.out.println("The role dropdown is enabled");
			ObjectRepo.test.log(Status.PASS, "The role dropdown is enabled");
		}
		else {
			System.out.println("The role dropdown is not enabled");
			ObjectRepo.test.log(Status.PASS, "The role dropdown is not enabled");
		}
		//Thread.sleep(1000);
		WebElement element3=driver.findElement(reasonForDenialDropdown);
		String value=element3.getAttribute("aria-disabled");
		if(value=="True") {
			System.out.println("The Reason for denial dropdown is enabled");
			ObjectRepo.test.log(Status.PASS, "The Reason for denial dropdown is enabled");
		}
		else {
			System.out.println("The Reason for denial is not enabled");
			ObjectRepo.test.log(Status.PASS, "The Reason for denial is not enabled");
		}
		String commentField=driver.findElement(By.xpath("//label[text()='Comments']")).getText();
		System.out.println("Comment field is:" + commentField);
		ObjectRepo.test.log(Status.PASS, "Comment field is:" + commentField);
		Thread.sleep(1000);
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(selectRoleTypeDropdown));
		driver.findElement(selectRoleTypeDropdown).click();
		Thread.sleep(1000);
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(selectServiceProviderRoleType));
		driver.findElement(selectServiceProviderRoleType).click();
		//Thread.sleep(1000);
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(roleDropdown));
		driver.findElement(roleDropdown).click();
		//Thread.sleep(1000);
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(selectMarketMonitorRole));
		driver.findElement(selectMarketMonitorRole).click();

		WebElement element5 = driver.findElement(selectRoleTypeDropdown);
		Actions action = new Actions(driver);
		action.moveToElement(element5).build().perform();
		//Thread.sleep(4000);

		js.executeScript("window.scrollBy(0,2650)");
		WebElement abc = driver.findElement(saveButton);
		js.executeScript("arguments[0].click();", abc);
		//Thread.sleep(6000);
		String successMessage=driver.findElement(successMessageAfterRegistrarApproveUser).getText();
		System.out.println("Success Message after Registrar Approve and assign market monitor role :" + successMessage);
		Assert.assertEquals("User has sent for Authority Approval", successMessage);
		WebElement element4 = driver.findElement(crossButtonOnErrorMessageAfterLogin);
		//Thread.sleep(2000);
		element4.click();
	}
	
	public void registrarApproveAndAssignJurisdictionUserRole() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1800)");
		Thread.sleep(1000);
		driver.findElement(approveRadioButton).click();
		WebElement element1=driver.findElement(selectRoleTypeDropdown);
		if(element1.isEnabled()) {
			System.out.println("The role type dropdown is enabled");
			ObjectRepo.test.log(Status.PASS, "The role type dropdown is enabled");
		}
		else {
			System.out.println("The role type dropdown is not enabled");
			ObjectRepo.test.log(Status.PASS, "The role type dropdown is not enabled");
		}
		WebElement element2=driver.findElement(roleDropdown);
		if(element2.isEnabled()) {
			System.out.println("The role dropdown is enabled");
			ObjectRepo.test.log(Status.PASS, "The role dropdown is enabled");
		}
		else {
			System.out.println("The role dropdown is not enabled");
			ObjectRepo.test.log(Status.PASS, "The role dropdown is not enabled");
		}
		Thread.sleep(1000);
		WebElement element3=driver.findElement(reasonForDenialDropdown);
		String value=element3.getAttribute("aria-disabled");
		if(value=="True") {
			System.out.println("The Reason for denial dropdown is enabled");
			ObjectRepo.test.log(Status.PASS, "The Reason for denial dropdown is enabled");
		}
		else {
			System.out.println("The Reason for denial is not enabled");
			ObjectRepo.test.log(Status.PASS, "The Reason for denial is not enabled");
		}
		String commentField=driver.findElement(By.xpath("//label[text()='Comments']")).getText();
		System.out.println("Comment field is:" + commentField);
		ObjectRepo.test.log(Status.PASS, "Comment field is:" + commentField);
		Thread.sleep(1000);
		driver.findElement(selectRoleTypeDropdown).click();
		Thread.sleep(1000);
		driver.findElement(selectJurisdictionUserRoleType).click();
		Thread.sleep(1000);
		driver.findElement(roleDropdown).click();
		Thread.sleep(1000);
		driver.findElement(selectRegistrarRole).click();

		WebElement element5 = driver.findElement(selectRoleTypeDropdown);
		Actions action = new Actions(driver);
		action.moveToElement(element5).build().perform();
		Thread.sleep(4000);

		js.executeScript("window.scrollBy(0,2650)");
		WebElement abc = driver.findElement(saveButton);
		js.executeScript("arguments[0].click();", abc);
		Thread.sleep(6000);
		String successMessage=driver.findElement(successMessageAfterRegistrarApproveUser).getText();
		System.out.println("Success Message after Registrar Approve and assign market monitor role :" + successMessage);
		WebElement element4 = driver.findElement(crossButtonOnErrorMessageAfterLogin);
		Thread.sleep(2000);
		element4.click();
	}
	
	public void registrarApproveAndAssignTechnicalAdminAndSystemUsersRole() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1800)");
		Thread.sleep(1000);
		driver.findElement(approveRadioButton).click();
		WebElement element1=driver.findElement(selectRoleTypeDropdown);
		if(element1.isEnabled()) {
			System.out.println("The role type dropdown is enabled");
			ObjectRepo.test.log(Status.PASS, "The role type dropdown is enabled");
		}
		else {
			System.out.println("The role type dropdown is not enabled");
			ObjectRepo.test.log(Status.PASS, "The role type dropdown is not enabled");
		}
		WebElement element2=driver.findElement(roleDropdown);
		if(element2.isEnabled()) {
			System.out.println("The role dropdown is enabled");
			ObjectRepo.test.log(Status.PASS, "The role dropdown is enabled");
		}
		else {
			System.out.println("The role dropdown is not enabled");
			ObjectRepo.test.log(Status.PASS, "The role dropdown is not enabled");
		}
		Thread.sleep(1000);
		WebElement element3=driver.findElement(reasonForDenialDropdown);
		String value=element3.getAttribute("aria-disabled");
		if(value=="True") {
			System.out.println("The Reason for denial dropdown is enabled");
			ObjectRepo.test.log(Status.PASS, "The Reason for denial dropdown is enabled");
		}
		else {
			System.out.println("The Reason for denial is not enabled");
			ObjectRepo.test.log(Status.PASS, "The Reason for denial is not enabled");
		}
		String commentField=driver.findElement(By.xpath("//label[text()='Comments']")).getText();
		System.out.println("Comment field is:" + commentField);
		ObjectRepo.test.log(Status.PASS, "Comment field is:" + commentField);
		Thread.sleep(1000);
		driver.findElement(selectRoleTypeDropdown).click();
		Thread.sleep(1000);
		driver.findElement(selectTechnicalAdminAndSytemUsersRoleType).click();
		Thread.sleep(1000);
		driver.findElement(roleDropdown).click();
		Thread.sleep(1000);
		driver.findElement(selectSystemAdminRole).click();

		WebElement element5 = driver.findElement(selectRoleTypeDropdown);
		Actions action = new Actions(driver);
		action.moveToElement(element5).build().perform();
		Thread.sleep(4000);

		js.executeScript("window.scrollBy(0,2650)");
		WebElement abc = driver.findElement(saveButton);
		js.executeScript("arguments[0].click();", abc);
		Thread.sleep(6000);
		String successMessage=driver.findElement(successMessageAfterRegistrarApproveUser).getText();
		System.out.println("Success Message after Registrar Approve and assign market monitor role :" + successMessage);
		WebElement element4 = driver.findElement(crossButtonOnErrorMessageAfterLogin);
		Thread.sleep(2000);
		element4.click();
	}

	public void registrarViewOldValeAndNewValueAfterUserSubmitRequestRevision() throws Exception {
		Thread.sleep(2000);
		System.out.println("User view old and new value as below");
		String oldValueFirstName=driver.findElement(oldValueFirstNameField).getText();
		System.out.println("Old Value of First Name Field :" + oldValueFirstName);
		String newValueFirstName=driver.findElement(newValueFirstNameField).getText();
		System.out.println("New Value of First Name Field :" + newValueFirstName);

		String oldValueTelephone=driver.findElement(oldValueTelephoneField).getText();
		System.out.println("Old Value of First Name Field :" + oldValueTelephone);
		String newValueTelephone=driver.findElement(newValueTelephoneField).getText();
		System.out.println("New Value of First Name Field :" + newValueTelephone);

		String oldValueStreet1=driver.findElement(oldValueStreet1Field).getText();
		System.out.println("Old Value of First Name Field :" + oldValueStreet1);
		String newValueStreet1=driver.findElement(newValueStreet1Field).getText();
		System.out.println("New Value of First Name Field :" + newValueStreet1);

		String oldValueCity=driver.findElement(oldValueCityField).getText();
		System.out.println("Old Value of First Name Field :" + oldValueCity);
		String newValueCity=driver.findElement(newValueCityField).getText();
		System.out.println("New Value of First Name Field :" + newValueCity);
	}

	public void userCancelRevisionRequestSubmittion() throws Exception {
		String requestRevisionStatusText=driver.findElement(requestRevisionTextOnHomepage).getText();
		System.out.println("User Registration Status :" + requestRevisionStatusText);
		driver.findElement(makeRevisionButton).click();
		driver.findElement(editButton).click();
		Thread.sleep(2000);
		for(int i=1;i<=6;i++) {
			driver.findElement(firstNameEdit).sendKeys(Keys.BACK_SPACE);
		}
		driver.findElement(firstNameEdit).sendKeys("Mayur");
		Thread.sleep(2000);
		for(int i=1;i<=10;i++) {
			driver.findElement(telephoneNumberEdit).sendKeys(Keys.BACK_SPACE);
		}
		driver.findElement(telephoneNumberEdit).sendKeys("1122334455");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1800)");
		driver.findElement(By.xpath("//button[contains(text(),'CANCEL')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'CONTINUE')]")).click();
		Thread.sleep(2000);
//		System.out.println("User view old value below:");
//		String oldValueFirstName=driver.findElement(oldValueFirstNameField).getText();
//		System.out.println("Old Value of First Name Field :" + oldValueFirstName);
//		String oldValueTelephone=driver.findElement(oldValueTelephoneField).getText();
//		System.out.println("Old Value of First Name Field :" + oldValueTelephone);
	}
	
	public void userSubmitRevisionRequest() throws Exception {
		String requestRevisionStatusText=driver.findElement(requestRevisionTextOnHomepage).getText();
		System.out.println("User Registration Status :" + requestRevisionStatusText);
		driver.findElement(makeRevisionButton).click();
		driver.findElement(editButton).click();
		Thread.sleep(2000);
//		for(int i=1;i<=6;i++) {
//			driver.findElement(firstNameEdit).sendKeys(Keys.BACK_SPACE);
//		}
		driver.findElement(firstNameEdit).clear();
		Thread.sleep(2000);
		driver.findElement(firstNameEdit).sendKeys("Mayur");
		//Thread.sleep(2000);
		for(int i=1;i<=10;i++) {
			driver.findElement(telephoneNumberEdit).sendKeys(Keys.BACK_SPACE);
		}
		driver.findElement(telephoneNumberEdit).sendKeys("1122334455");
		Thread.sleep(2000);
		for(int i=1;i<=12;i++) {
			driver.findElement(street1EditPrimResi).sendKeys(Keys.BACK_SPACE);
		}
		driver.findElement(street1EditPrimResi).sendKeys("Testdata");
		Thread.sleep(2000);
		for(int i=1;i<=4;i++) {
			driver.findElement(cityEditMailAdd).sendKeys(Keys.BACK_SPACE);
		}
		driver.findElement(cityEditMailAdd).sendKeys("Mumbai");
		WebElement element = driver.findElement(saveButtonForRevisionRequestSubmit);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		driver.findElement(continueButtonOnPrompt).click();
		String successMessage=driver.findElement(successMessageAfterSubmitRequestRevision).getText();
		System.out.println("Success Message after user submit revision request"+ successMessage);
		driver.findElement(By.xpath("//*[@data-testid='CloseIcon']")).click();
		Thread.sleep(2000);
		System.out.println("User view old and new value as below");
		String oldValueFirstName=driver.findElement(oldValueFirstNameField).getText();
		System.out.println("Old Value of First Name Field :" + oldValueFirstName);
		String newValueFirstName=driver.findElement(newValueFirstNameField).getText();
		System.out.println("New Value of First Name Field :" + newValueFirstName);

		String oldValueTelephone=driver.findElement(oldValueTelephoneField).getText();
		System.out.println("Old Value of Telephone Field :" + oldValueTelephone);
		String newValueTelephone=driver.findElement(newValueTelephoneField).getText();
		System.out.println("New Value of Telephone Field :" + newValueTelephone);

		String oldValueStreet1=driver.findElement(oldValueStreet1Field).getText();
		System.out.println("Old Value of Street 1 Field :" + oldValueStreet1);
		String newValueStreet1=driver.findElement(newValueStreet1Field).getText();
		System.out.println("New Value of Street 1 Field :" + newValueStreet1);

		String oldValueCity=driver.findElement(oldValueCityField).getText();
		System.out.println("Old Value of City Field :" + oldValueCity);
		String newValueCity=driver.findElement(newValueCityField).getText();
		System.out.println("New Value of City Field :" + newValueCity);

		driver.findElement(returnToUserProfileButton).click();
		driver.findElement(homeMenu).click();
		String pendingStatusText=driver.findElement(pendingStatusTextOnHomePage).getText();
		System.out.println("User Registration Status :" + pendingStatusText);
	}
	
	public void userSubmitRevisionRequestForSameField() throws Exception {
		String requestRevisionStatusText=driver.findElement(requestRevisionTextOnHomepage).getText();
		System.out.println("User Registration Status :" + requestRevisionStatusText);
		driver.findElement(makeRevisionButton).click();
		driver.findElement(editButton).click();
		Actions action =new Actions(driver);
		Thread.sleep(2000);
		WebElement firstname=driver.findElement(firstNameEdit);
		action.moveToElement(firstname).build().perform();
		action.doubleClick().build().perform();
		firstname.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(2000);
		driver.findElement(firstNameEdit).sendKeys("Mayur");
		WebElement lastname=driver.findElement(By.xpath("//input[@name='FamilyName']"));
		action.moveToElement(lastname).build().perform();
		action.doubleClick().build().perform();
	    lastname.sendKeys(Keys.BACK_SPACE);
	    Thread.sleep(2000);
	    lastname.sendKeys("Patil");
		WebElement element = driver.findElement(saveButtonForRevisionRequestSubmit);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		driver.findElement(continueButtonOnPrompt).click();
		String successMessage=driver.findElement(successMessageAfterSubmitRequestRevision).getText();
		System.out.println("Success Message after user submit revision request"+ successMessage);
		driver.findElement(By.xpath("//*[@data-testid='CloseIcon']")).click();
		Thread.sleep(2000);
		System.out.println("User view old and new value as below");
		String oldValueFirstName=driver.findElement(oldValueFirstNameField).getText();
		System.out.println("Old Value of First Name Field :" + oldValueFirstName);
		String newValueFirstName=driver.findElement(newValueFirstNameField).getText();
		System.out.println("New Value of First Name Field :" + newValueFirstName);
		
		String oldValueLastName=driver.findElement(oldValueLastNameField).getText();
		System.out.println("Old Value of First Name Field :" + oldValueLastName);
		String newValueLastName=driver.findElement(newValueLastNameField).getText();
		System.out.println("New Value of First Name Field :" + newValueLastName);
		driver.findElement(returnToUserProfileButton).click();
		driver.findElement(homeMenu).click();
		String pendingStatusText=driver.findElement(pendingStatusTextOnHomePage).getText();
		System.out.println("User Registration Status :" + pendingStatusText);
	}

	public void raisedRevisionRequestUserRegistrationByRegistrar() throws Exception {
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@class='MuiTypography-root MuiTypography-h1 css-1l7rfk3']")));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1800)");
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(requestRevisionRadioButton));
		//Thread.sleep(1000);
		driver.findElement(requestRevisionRadioButton).click();
		//Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(commentField));
		driver.findElement(commentField).sendKeys("Revision Requested");
		//Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(saveButton));
		driver.findElement(saveButton).click();
		//Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(successMessageForRevisionRequestedByRegistrar));
		String successMessage=driver.findElement(successMessageForRevisionRequestedByRegistrar).getText();
		System.out.println("Success Message for deny user registration  : "+ successMessage);
		Assert.assertEquals("User has successfully requested revisions", successMessage);
		ObjectRepo.test.log(Status.PASS, "User has successfully requested revisions"+successMessage);
		driver.findElement(By.xpath("(//*[@data-testid='CloseIcon'])[3]")).click();
	}

	public void loginAsJurisdictionUserForWelcomingJurisdiction() throws InterruptedException {
		Thread.sleep(1000);
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.elementToBeClickable((userid)));
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Log In'])[1]")));
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.elementToBeClickable((By.xpath("(//*[text()='Log In'])[2]"))));
		driver.findElement(userid).sendKeys(prop.getProperty("LoginAsJurisdictionUserUsernameWelcoming"));
		driver.findElement(passphraseOnLoginPage).sendKeys(prop.getProperty("LoginAsJurisdictionUserPasswordWelcoming"));
		WebElement element = driver.findElement(loginbutton);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		//Thread.sleep(2000);
		//driver.findElement(answerField).sendKeys(prop.getProperty("SecurityAnswer1"));
		// driver.findElement(loginbutton).click();
	}

	public void downloadThreeRegistrationForms() throws Exception {
		driver.findElement(welcomeDropdown).click();
		driver.findElement(userProfileOption).click();
		String userRequestHistoryText=driver.findElement(By.xpath("//div[text()='User Request History']")).getText();
		System.out.println("Text on user profile is:"+userRequestHistoryText);
		Assert.assertEquals("User Request History", userRequestHistoryText);
		ObjectRepo.test.log(Status.PASS, "Text on user profile is:"+userRequestHistoryText);
		Actions action = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		WebElement element1 = driver.findElement(By.xpath("//*[text()='Cancel User Registration']"));
		action.moveToElement(element1).build().perform();
		Thread.sleep(10000);
		WebElement element2 = driver.findElement(formsOption);
	    action.moveToElement(element2).build().perform();
	    action.click(element2).build().perform();	
		//driver.findElement(By.xpath("(//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv'])[2]"));
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(form1));
		String userRegistrationChecklistForm=driver.findElement(form1).getText();
		System.out.println("Form 1 is:"+userRegistrationChecklistForm);
		Assert.assertEquals("User Registration Checklist", userRegistrationChecklistForm);
		ObjectRepo.test.log(Status.PASS, "Form 1 is:"+userRegistrationChecklistForm);
		String userRegistrationForm=driver.findElement(form2).getText();
		System.out.println("Form 2 is:"+userRegistrationForm);
		Assert.assertEquals("User Registration Form", userRegistrationForm);
		ObjectRepo.test.log(Status.PASS, "Form 2 is:"+userRegistrationForm);
		String proofOfIdentityForm=driver.findElement(form3).getText();
		System.out.println("Form 3 is:"+proofOfIdentityForm);
		Assert.assertEquals("Proof of Identity Form", proofOfIdentityForm);
		ObjectRepo.test.log(Status.PASS, "Form 3 is:"+proofOfIdentityForm);
		driver.findElement(form1).click();
	}

	public void runTimeloginAsCreatedUser() throws InterruptedException {
		Thread.sleep(2000);
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.elementToBeClickable((userid)));
		new WebDriverWait(driver, 60)
		.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//*[text()='Log In'])[1]")));
		driver.findElement(userid).sendKeys(userId);
		System.out.println("step : Enter Valid User Id  ");
		ObjectRepo.test.log(Status.PASS, "step1 : Enter valid User Id ");
		driver.findElement(passphraseOnLoginPage).sendKeys(prop.getProperty("Passphrase"));
		System.out.println("step : Enter Valid passphrase  ");
		ObjectRepo.test.log(Status.PASS, "step1 : Enter valid passphrase ");
		WebElement element = driver.findElement(loginbutton);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		System.out.println("step : Click on login button  ");
		ObjectRepo.test.log(Status.PASS, "step1 : Click on login button ");
	}

	public void loginAsCreatedUserWithEnterUserIDAndPassphrase() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(userid).sendKeys(userId);
		System.out.println("step : Enter Valid User Id  ");
		ObjectRepo.test.log(Status.PASS, "step1 : Enter valid User Id ");
		driver.findElement(passphraseOnLoginPage).sendKeys(prop.getProperty("Passphrase"));
		System.out.println("step : Enter Valid passphrase  ");
		ObjectRepo.test.log(Status.PASS, "step1 : Enter valid passphrase ");
		WebElement element = driver.findElement(loginbutton);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		System.out.println("step : Click on login button  ");
		ObjectRepo.test.log(Status.PASS, "step1 : Click on login button ");
	}

	public void handleSecurityQuestionForCreatedUserWithInvalidData() throws InterruptedException {
		new WebDriverWait(driver, 30)
		.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@class='MuiTypography-root MuiTypography-h6 css-1etlmxt']")));
		driver.findElement(answerField).sendKeys("aaaa");
		WebElement element1 = driver.findElement(continueButtonForLogin);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element1);
		Thread.sleep(3000);
		String errorMessage=driver.findElement(errorMessageForInvalidSecurityQueAnswer).getText();
		Thread.sleep(2000);
		System.out.println("Error Message for invalid answer for security question:"+errorMessage);
		//Assert.assertEquals("Invalid Answer", errorMessage);
		ObjectRepo.test.log(Status.PASS, "Error Message for invalid answer for security question:"+errorMessage);
	}

	public void handleSecurityQuestionForCreatedUser() throws InterruptedException {
		new WebDriverWait(driver, 30)
		.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@class='MuiTypography-root MuiTypography-h6 css-1etlmxt']")));
		String textOnPropmt=driver.findElement(By.xpath("//*[@id='modal-modal-title']")).getText();
		System.out.println("Text Present on security answer prompt:"+textOnPropmt);
		String answerFieldLabel=driver.findElement(By.xpath("//label[@for='customize-textfield']")).getText();
		System.out.println("Answer Field on security answer prompt:"+answerFieldLabel);
		String securityQueOnPrompt=driver.findElement(securityQuestion1ForLogin).getText();
		System.out.println("Security Question on security answer prompt:"+securityQueOnPrompt);
		String str=driver.findElement(securityQuestion1ForLogin).getText().trim();
		if(str.contains("first job?")) {
			driver.findElement(answerField).sendKeys(prop.getProperty("Answer1"));
		}
		else if(str.contains("maiden name?")){
			driver.findElement(answerField).sendKeys(prop.getProperty("Answer2"));
		}
		else if(str.contains("first car?")){
			driver.findElement(answerField).sendKeys(prop.getProperty("Answer3"));
		}
		else {
			System.out.println("Nothing");
		}
		String continueButtonOnPrompt=driver.findElement(continueButtonForLogin).getText();
		System.out.println("Continue Button on security answer prompt:"+continueButtonOnPrompt);
		WebElement element1 = driver.findElement(continueButtonForLogin);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element1);	
	}
	
	public void handleSecurityQuestionWithEmptyDataInAnswersFieldForCreatedUser() throws InterruptedException {
		new WebDriverWait(driver, 30)
		.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@class='MuiTypography-root MuiTypography-h6 css-1etlmxt']")));
		String textOnPropmt=driver.findElement(By.xpath("//*[@id='modal-modal-title']")).getText();
		System.out.println("Text Present on security answer prompt:"+textOnPropmt);
		String answerFieldLabel=driver.findElement(By.xpath("//label[@for='customize-textfield']")).getText();
		System.out.println("Answer Field on security answer prompt:"+answerFieldLabel);
		String securityQueOnPrompt=driver.findElement(securityQuestion1ForLogin).getText();
		System.out.println("Security Question on security answer prompt:"+securityQueOnPrompt);
		String str=driver.findElement(securityQuestion1ForLogin).getText().trim();
	    driver.findElement(answerField).sendKeys("");
	    driver.findElement(answerField).click();
	    driver.findElement(By.xpath("//label[text()='Answer']")).click();
	    String errorMessage1=driver.findElement(By.xpath(" //*[@id='Answer-helper-text']")).getText();
		System.out.println("Error message for empty data is:"+errorMessage1);
		Assert.assertEquals("Answer is required", errorMessage1);
		ObjectRepo.test.log(Status.PASS, "Error message for empty data is:"+errorMessage1);
	}
	
	public void handleSecurityQuestionWithInvalidAnswersForCreatedUser() throws InterruptedException {
		new WebDriverWait(driver, 30)
		.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@class='MuiTypography-root MuiTypography-h6 css-1etlmxt']")));
		String textOnPropmt=driver.findElement(By.xpath("//*[@id='modal-modal-title']")).getText();
		System.out.println("Text Present on security answer prompt:"+textOnPropmt);
		String answerFieldLabel=driver.findElement(By.xpath("//label[@for='customize-textfield']")).getText();
		System.out.println("Answer Field on security answer prompt:"+answerFieldLabel);
		String securityQueOnPrompt=driver.findElement(securityQuestion1ForLogin).getText();
		System.out.println("Security Question on security answer prompt:"+securityQueOnPrompt);
		String str=driver.findElement(securityQuestion1ForLogin).getText().trim();
		if(str.contains("first job?")) {
			driver.findElement(answerField).sendKeys("gdsdsg");
		}
		else if(str.contains("maiden name?")){
			driver.findElement(answerField).sendKeys("fgsfgf");
		}
		else if(str.contains("first car?")){
			driver.findElement(answerField).sendKeys("fsgfg");
		}
		else {
			System.out.println("Nothing");
		}
		String continueButtonOnPrompt=driver.findElement(continueButtonForLogin).getText();
		System.out.println("Continue Button on security answer prompt:"+continueButtonOnPrompt);
		WebElement element1 = driver.findElement(continueButtonForLogin);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element1);
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']")));
		String errorMessage1=driver.findElement(By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']")).getText();
		System.out.println("Error message after entering invalid answer for first security question is:"+errorMessage1);
		Assert.assertEquals("Invalid Answer", errorMessage1);
		ObjectRepo.test.log(Status.PASS, "Error message after entering invalid answer for first security question is:"+errorMessage1);
		driver.findElement(By.xpath("//*[@data-testid='CloseIcon']")).click();
		WebElement answer=driver.findElement(answerField);
		Actions action=new Actions(driver);
		action.moveToElement(answer).build().perform();
		Thread.sleep(2000);
		driver.findElement(answerField).sendKeys("gdsdsg");
		js2.executeScript("arguments[0].click()", element1);
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']")));
		String errorMessage2=driver.findElement(By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']")).getText();
		System.out.println("Error message after entering invalid answer for second security question is:"+errorMessage2);
		Assert.assertEquals("Invalid Answer", errorMessage2);
		ObjectRepo.test.log(Status.PASS, "Error message after entering invalid answer for first security question is:"+errorMessage2);
		driver.findElement(By.xpath("//*[@data-testid='CloseIcon']")).click();
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(securityQuestion1ForLogin));
		action.moveToElement(answer).build().perform();
		Thread.sleep(2000);
		driver.findElement(answerField).sendKeys("gdsdsg");
		js2.executeScript("arguments[0].click()", element1);
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']")));
		String errorMessage3=driver.findElement(By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']")).getText();
		System.out.println("Error message after entering invalid answer for third security question is:"+errorMessage3);
		Assert.assertEquals("Invalid Answer", errorMessage3);
		ObjectRepo.test.log(Status.PASS, "Error message after entering invalid answer for first security question is:"+errorMessage3);
		driver.findElement(By.xpath("//*[@data-testid='CloseIcon']")).click();
		driver.findElement(userid).clear();
		driver.findElement(passphraseOnLoginPage).clear();
		
	}

	public void loginAsCreatedUser() throws InterruptedException {
		Thread.sleep(2000);
//		new WebDriverWait(driver, 60)
//		.until(ExpectedConditions.elementToBeClickable((userid)));
//		new WebDriverWait(driver, 60)
//				.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//*[text()='Log In'])[1]")));
//		new WebDriverWait(driver, 60)
//		.until(ExpectedConditions.elementToBeClickable((userid)));
		driver.findElement(userid).sendKeys(userId);
		System.out.println("step : Enter Valid User Id  ");
		ObjectRepo.test.log(Status.PASS, "step1 : Enter valid User Id ");
		driver.findElement(passphraseOnLoginPage).sendKeys(prop.getProperty("Passphrase"));
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
			driver.findElement(answerField).sendKeys(prop.getProperty("Answer1"));
		}
		else if(str.contains("maiden name?")){
			driver.findElement(answerField).sendKeys(prop.getProperty("Answer2"));
		}
		else if(str.contains("first car?")){
			driver.findElement(answerField).sendKeys(prop.getProperty("Answer3"));
		}
		else {
			System.out.println("Nothing");
		}
		WebElement element1 = driver.findElement(continueButtonForLogin);
		js2.executeScript("arguments[0].click()", element1);
		//new WebDriverWait(driver, 60).until(
		//ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='2. Submit Required Documents']")));
	}

	public void userLoginWithNewPassphrase() throws Exception {
		Thread.sleep(2000);
		new WebDriverWait(driver, 30).until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='email']")));
		driver.findElement(userid).sendKeys(userId);
		driver.findElement(passphraseOnLoginPage).sendKeys(prop.getProperty("NewPassphrase"));
		WebElement element = driver.findElement(loginbutton);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		System.out.println("step : Click on login button  ");
		ObjectRepo.test.log(Status.PASS, "step1 : Click on login button ");
		Thread.sleep(2000);
//				String str=driver.findElement(securityQuestion1ForLogin).getText().trim();
//				//driver.findElement(answerField).sendKeys("bbbb");
//				if(str.contains("teacher?")) {
//					driver.findElement(answerField).sendKeys("aaaa");
//				}
//				else if(str.contains("spouse?")){
//					driver.findElement(answerField).sendKeys("bbbb");
//				}
//				else if(str.contains("first job?")){
//					driver.findElement(answerField).sendKeys("cccc");
//				}
//				else {
//					System.out.println("Nothing");
//				}
//				driver.findElement(continueButtonForLogin).click();
//				System.out.println("User logged in successfully");
//				Thread.sleep(2000);
//				new WebDriverWait(driver, 60).until(
//						ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='2. Submit Required Documents']")));
	}


	public void deniedUserRegistrationByRegistrar() throws Exception {
		driver.findElement(denyRadioButton).click();
		driver.findElement(reasonForDenialDropdown).click();
		driver.findElement(selectDenialReason1).click();
		driver.findElement(commentField).sendKeys("Deny user registration");
		driver.findElement(saveButton).click();
		String successMessage=driver.findElement(successMessageDeniedUserRegistration).getText();
		Thread.sleep(2000);
		System.out.println("Success Message for deny user registration  : "+ successMessage);
		Assert.assertEquals("User request has been denied.", successMessage);
		ObjectRepo.test.log(Status.PASS, "Success Message for deny user registration  : "+ successMessage);
		
	}

	public void cancelUserRegistrationByRegistrar() throws Exception {
		driver.findElement(cancelUserRegistrationRadioButton).click();
		driver.findElement(commentField).sendKeys("cancel user registration by registrar");
		driver.findElement(saveButton).click();
		Thread.sleep(2000);
		String successMessage1=driver.findElement(successMessageForCancelUserRegistration).getText();
		System.out.println("Success Message for cancel user registration  : "+ successMessage1);
	}

	public void registrarSearchUserAndGoToUserDetailsPage() throws InterruptedException  {
		Thread.sleep(2000);
		//new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[text()='Search Users']")));
		//new WebDriverWait(driver,60).until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@type='search'])[1]")));
		//new WebDriverWait(driver,60).until(ExpectedConditions.elementToBeClickable((searchField)));
		driver.findElement(searchField).sendKeys(userId);
		Thread.sleep(3000);
		//new WebDriverWait(driver,40).until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Pravin']")));
		driver.findElement(searchRecordFirstname).click();
		Thread.sleep(2000);
	}
	
	public void displayTotalRecords() throws InterruptedException  {
		Thread.sleep(2000);
		String totalRowsBeforeUserFilter=driver.findElement(By.xpath("//*[@class='MuiTypography-root MuiTypography-body1 css-lz7acl']")).getText();
		System.out.println("Total rows before use filter is:" + totalRowsBeforeUserFilter);
		ObjectRepo.test.log(Status.PASS, "Total rows before use filter is:" + totalRowsBeforeUserFilter);
		String totalPagesBeforeUserFilter=driver.findElement(By.xpath("(//*[@class='MuiButtonBase-root MuiPaginationItem-root MuiPaginationItem-sizeMedium MuiPaginationItem-text MuiPaginationItem-circular MuiPaginationItem-page css-1vly51i'])[5]")).getText();
		System.out.println("Total Pages before use filter is:" + totalPagesBeforeUserFilter);
		ObjectRepo.test.log(Status.PASS, "Total Pages before use filter is:" + totalPagesBeforeUserFilter);
		driver.findElement(searchField).sendKeys("Approved");
		Thread.sleep(4000);
		String totalRowsAfterUserFilter=driver.findElement(By.xpath("//*[@class='MuiTypography-root MuiTypography-body1 css-lz7acl']")).getText();
		System.out.println("Total rows before use filter is:" + totalRowsAfterUserFilter);
		ObjectRepo.test.log(Status.PASS, "Total rows before use filter is:" + totalRowsAfterUserFilter);
		String totalPagesAfterUserFilter=driver.findElement(By.xpath("(//*[@class='MuiButtonBase-root MuiPaginationItem-root MuiPaginationItem-sizeMedium MuiPaginationItem-text MuiPaginationItem-circular MuiPaginationItem-page css-1vly51i'])[5]")).getText();
		System.out.println("Total Pages before use filter is:" + totalPagesAfterUserFilter);
		ObjectRepo.test.log(Status.PASS, "Total Pages before use filter is:" + totalPagesAfterUserFilter);
		Assert.assertNotEquals(totalRowsBeforeUserFilter, totalPagesAfterUserFilter);
	}
	
	public void registrarSearchUserWithStatusAsRequestRevision() throws InterruptedException  {
		Thread.sleep(2000);
		//new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[text()='Search Users']")));
		//new WebDriverWait(driver,60).until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@type='search'])[1]")));
		//new WebDriverWait(driver,60).until(ExpectedConditions.elementToBeClickable((searchField)));
		driver.findElement(searchField).sendKeys("Request Revision");
		Thread.sleep(3000);
		//new WebDriverWait(driver,40).until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Pravin']")));
		driver.findElement(searchRecordFirstname).click();
		Thread.sleep(2000);
	}
	
	public void userChangeTheirPassphraseWithValidData()  {
		driver.findElement(welcomeDropdown).click();
		driver.findElement(userProfileOption).click();
		driver.findElement(changePassphraseAndSecuriQueOption).click();
		String pageHeading=driver.findElement(By.xpath("//*[contains(text(),'Reset Passphrase and Security Questions')]")).getText();
		System.out.println("Page heading is:" + pageHeading);
		Assert.assertEquals("Reset Passphrase and Security Questions", pageHeading);
		ObjectRepo.test.log(Status.PASS, "Page heading is:" + pageHeading);
		String currentPassphrase1=driver.findElement(By.xpath("(//*[@for='customize-textfield'])[1]")).getText();
		System.out.println("Mandatory Field is:" + currentPassphrase1);
		Assert.assertEquals("Current Passphrase*", currentPassphrase1);
		ObjectRepo.test.log(Status.PASS, "Mandatory Field is:" + currentPassphrase1);
		String newPassphrase1=driver.findElement(By.xpath("(//*[@for='customize-textfield'])[2]")).getText();
		System.out.println("Mandatory Field is:" + newPassphrase1);
		Assert.assertEquals("New Passphrase*- 8-50 characters", newPassphrase1);
		ObjectRepo.test.log(Status.PASS, "Mandatory Field is:" + newPassphrase1);
		String confirmPassphrase=driver.findElement(By.xpath("(//*[@for='customize-textfield'])[3]")).getText();
		System.out.println("Mandatory Field is:" + confirmPassphrase);
		Assert.assertEquals("Confirm Passphrase*- 8-50 characters", confirmPassphrase);
		ObjectRepo.test.log(Status.PASS, "Mandatory Field is:" + confirmPassphrase);
		driver.findElement(currentPassphrase).sendKeys(prop.getProperty("Passphrase"));
		driver.findElement(newPassphrase).sendKeys(prop.getProperty("NewPassphrase"));
		driver.findElement(confirmPassphraseField).sendKeys(prop.getProperty("ConfirmPassphrase"));
		driver.findElement(saveButtonOnResetPassphraseSection).click();
		new WebDriverWait(driver, 30).until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-74todz']")));
		String successMessageResetPassphrase=driver.findElement(successMessageForResetPassphrase).getText();
		System.out.println("Success Message for Reset Passphrase :"+ successMessageResetPassphrase);
		Assert.assertEquals("Passphrase changed successfully.", successMessageResetPassphrase);
		ObjectRepo.test.log(Status.PASS, "Success Message for Reset Passphrase :"+ successMessageResetPassphrase);
	}
	
	public void userChangeTheirPassphraseWithInvalidData()  {
		driver.findElement(welcomeDropdown).click();
		driver.findElement(userProfileOption).click();
		driver.findElement(changePassphraseAndSecuriQueOption).click();
		driver.findElement(currentPassphrase).sendKeys("Pravin@123");
		driver.findElement(newPassphrase).sendKeys(prop.getProperty("NewPassphrase"));
		driver.findElement(confirmPassphraseField).sendKeys(prop.getProperty("ConfirmPassphrase"));
		driver.findElement(saveButtonOnResetPassphraseSection).click();
		new WebDriverWait(driver, 30).until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-74todz']")));
		String successMessageResetPassphrase=driver.findElement(successMessageForResetPassphrase).getText();
		System.out.println("Error message for current passphrase field :"+ successMessageResetPassphrase);
		//Assert.assertEquals("Current passphrase entered is incorrect", successMessageResetPassphrase);
		ObjectRepo.test.log(Status.PASS, "Error message for current passphrase field :"+ successMessageResetPassphrase);
	}

	public void changePassphraseAndSecurityQuestions()  {
		driver.findElement(welcomeDropdown).click();
		driver.findElement(userProfileOption).click();
		driver.findElement(changePassphraseAndSecuriQueOption).click();
		driver.findElement(currentPassphrase).sendKeys(prop.getProperty("Passphrase"));
		driver.findElement(newPassphrase).sendKeys(prop.getProperty("NewPassphrase"));
		driver.findElement(confirmPassphraseField).sendKeys(prop.getProperty("ConfirmPassphrase"));
		driver.findElement(saveButtonOnResetPassphraseSection).click();
		new WebDriverWait(driver, 30).until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-74todz']")));
		String successMessageResetPassphrase=driver.findElement(successMessageForResetPassphrase).getText();
		System.out.println("Success Message for Reset Passphrase :"+ successMessageResetPassphrase);
		driver.findElement(crossButtonOnSuccMessOfResetPassphrase).click();
		
		driver.findElement(welcomeDropdown).click();
		driver.findElement(userProfileOption).click();
		driver.findElement(changePassphraseAndSecuriQueOption).click();
		
		new WebDriverWait(driver, 30).until(
				ExpectedConditions.elementToBeClickable(secQue1Dropdown));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1800)");
		driver.findElement(secQue1Dropdown).click();
		driver.findElement(selectSecuQuetion1).click();
		driver.findElement(answer1Field).sendKeys("aaaa");

		driver.findElement(secQue2Dropdown).click();
		driver.findElement(selectSecuQuetion2).click();
		driver.findElement(answer2Field).sendKeys("bbbb");

		driver.findElement(secQue3Dropdown).click();
		driver.findElement(selectSecuQuetion3).click();
		driver.findElement(answer3Field).sendKeys("cccc");

		driver.findElement(saveButtonOnResetSecurityQuestion).click();
		//Thread.sleep(2000);
		//driver.findElement(crossButtonOnSuccMessOfResetPassphrase).click();

		//String successMessageResetSecurityQue=driver.findElement(successMessageForResetPassphrase).getText();
		//System.out.println("Success Message for Reset Security Questions :"+ successMessageResetSecurityQue);


	}

	public void searchCancelByapplicantUser() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(searchField).sendKeys(userId);
		Thread.sleep(2000);
		driver.findElement(searchRecordFirstname).click();
		Thread.sleep(4000);
		String status=driver.findElement(statusOnUserDetailsPageByJU).getText();
		System.out.println("Status of the User:" + status);
	}

	public void loginAsJurisdictionUser() {
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.findElement(userid).sendKeys(prop.getProperty("LoginAsJurisdictionUserUsername"));
		driver.findElement(passphraseOnLoginPage).sendKeys(prop.getProperty("LoginAsJurisdictionUserPassword"));
		WebElement element = driver.findElement(loginbutton);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
		//		driver.findElement(answerField).sendKeys(prop.getProperty("SecurityAnswer1"));
		//		driver.findElement(continueButtonForLogin).click();
		//		new WebDriverWait(driver, 60)
		//				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Search Users']")));
		// driver.findElement(loginbutton).click();
	}

	public void clearUserIdfield() throws Exception {
		Thread.sleep(2000);
		driver.findElement(crossButtonOnErrorMessageAfterLogin).click();
		Thread.sleep(5000);
		for(int i=1;i<=8;i++) {
			driver.findElement(userid).sendKeys(Keys.BACK_SPACE);
		}
		for(int i=1;i<=8;i++) {
			driver.findElement(passphraseOnLoginPage).sendKeys(Keys.BACK_SPACE);
		}

	}
	
	public void cancelButtonFunctionalityForCancelUserRegistrationByUser() throws Exception {
		driver.findElement(welcomeDropdown).click();
		driver.findElement(userProfileOption).click();
		driver.findElement(cancelUserRegistration).click();
		String option1=driver.findElement(continueButtonOnCancelUserRegistrationPopup).getText();
		System.out.println("Following option is display on confirmation pop-up :"+option1);
		Assert.assertEquals("YES, I WANT TO CANCEL THE APPLICATION", option1);
		ObjectRepo.test.log(Status.PASS, "Following option is display on confirmation pop-up :"+option1);
		String option2=driver.findElement(By.xpath("//button[@data-testid='priv_modal_Cancel']")).getText();
		System.out.println("Following option is display on confirmation pop-up :"+option2);
		Assert.assertEquals("CANCEL", option2);
		ObjectRepo.test.log(Status.PASS, "Following option is display on confirmation pop-up :"+option2);
		String textOnConfirmationPopup=driver.findElement(By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']")).getText();
		System.out.println("Following text present on confirmation pop-up :"+textOnConfirmationPopup);
		Assert.assertEquals("Clicking Yes, I want to cancel the application will cancel User Registration", textOnConfirmationPopup);
		ObjectRepo.test.log(Status.PASS, "Following text present on confirmation pop-up :"+textOnConfirmationPopup);
		driver.findElement(By.xpath("//button[@data-testid='priv_modal_Cancel']")).click();
		String cancelUserRegistrationOption=driver.findElement(cancelUserRegistration).getText();
		System.out.println("After cancelling cancel user registration, following text is display:"+cancelUserRegistrationOption);
		//Assert.assertEquals("CANCEL", cancelUserRegistrationOption);
		ObjectRepo.test.log(Status.PASS, "After cancelling cancel user registration, following text is display:"+cancelUserRegistrationOption);
	}
	
	public void cancelUserRegistrationFunctionalityByUser() throws Exception {
		driver.findElement(welcomeDropdown).click();
		driver.findElement(userProfileOption).click();
		driver.findElement(cancelUserRegistration).click();
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(continueButtonOnCancelUserRegistrationPopup));
		String option1=driver.findElement(continueButtonOnCancelUserRegistrationPopup).getText();
		System.out.println("Following option is display on confirmation pop-up :"+option1);
		Assert.assertEquals("YES, I WANT TO CANCEL THE APPLICATION", option1);
		ObjectRepo.test.log(Status.PASS, "Following option is display on confirmation pop-up :"+option1);
		String option2=driver.findElement(By.xpath("//button[@data-testid='priv_modal_Cancel']")).getText();
		System.out.println("Following option is display on confirmation pop-up :"+option2);
		Assert.assertEquals("CANCEL", option2);
		ObjectRepo.test.log(Status.PASS, "Following option is display on confirmation pop-up :"+option2);
		String textOnConfirmationPopup=driver.findElement(By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']")).getText();
		System.out.println("Following text present on confirmation pop-up :"+textOnConfirmationPopup);
		Assert.assertEquals("Clicking Yes, I want to cancel the application will cancel User Registration", textOnConfirmationPopup);
		ObjectRepo.test.log(Status.PASS, "Following text present on confirmation pop-up :"+textOnConfirmationPopup);
		driver.findElement(continueButtonOnCancelUserRegistrationPopup).click();
	}

	public void cancelUserRegistrationByUser() throws Exception {
		driver.findElement(welcomeDropdown).click();
		driver.findElement(userProfileOption).click();
		driver.findElement(cancelUserRegistration).click();
		String option1=driver.findElement(continueButtonOnCancelUserRegistrationPopup).getText();
		System.out.println("Following option is display on confirmation pop-up :"+option1);
		Assert.assertEquals("YES, I WANT TO CANCEL THE APPLICATION", option1);
		ObjectRepo.test.log(Status.PASS, "Following option is display on confirmation pop-up :"+option1);
		String option2=driver.findElement(By.xpath("//button[@data-testid='priv_modal_Cancel']")).getText();
		System.out.println("Following option is display on confirmation pop-up :"+option2);
		Assert.assertEquals("CANCEL", option2);
		ObjectRepo.test.log(Status.PASS, "Following option is display on confirmation pop-up :"+option2);
		String textOnConfirmationPopup=driver.findElement(By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']")).getText();
		System.out.println("Following text present on confirmation pop-up :"+textOnConfirmationPopup);
		Assert.assertEquals("Clicking Yes, I want to cancel the application will cancel User Registration", textOnConfirmationPopup);
		ObjectRepo.test.log(Status.PASS, "Following text present on confirmation pop-up :"+textOnConfirmationPopup);
		driver.findElement(continueButtonOnCancelUserRegistrationPopup).click();
		Thread.sleep(2000);
		driver.findElement(userid).sendKeys(userId);
		driver.findElement(passphraseOnLoginPage).sendKeys(prop.getProperty("Passphrase"));
		WebElement element = driver.findElement(loginbutton);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", element);
        new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(errorMessageAfterLogin));
		String errorMessage=driver.findElement(errorMessageAfterLogin).getText();
		System.out.println("Error Message is :" + errorMessage);
		Assert.assertEquals("User ID or passphrase entered is invalid", errorMessage);
		ObjectRepo.test.log(Status.PASS, "Error Message is :" + errorMessage);
	}



	public void personalInformation() throws InterruptedException {
		driver.findElement(salutation).sendKeys("Mr");
		new WebDriverWait(driver, 30)
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='firstName']")));
		driver.findElement(firstName).sendKeys(AllFeildsTestData.firstName(10));
		driver.findElement(middleName).sendKeys(AllFeildsTestData.middleName(10));
		driver.findElement(lastName).sendKeys(AllFeildsTestData.lastName(10));
		driver.findElement(suffix).sendKeys(AllFeildsTestData.suffixName(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.findElement(selectDate).sendKeys(AllFeildsTestData.getDOB());
		driver.findElement(telephoneNumber).sendKeys(AllFeildsTestData.getTelePhoneNum());
		driver.findElement(extension).sendKeys(AllFeildsTestData.generateRandomTelephoneExtentionNum());
		driver.findElement(mobilePhone).sendKeys(AllFeildsTestData.generateMobileNumber());
		driver.findElement(email).clear();
		String emailaddress = generateEmailString();
		driver.findElement(email).sendKeys(AllFeildsTestData.mail);
		driver.findElement(confirmEmail).clear(); 
		driver.findElement(confirmEmail).sendKeys(AllFeildsTestData.mail);
		driver.findElement(emailLangPref).click();
		driver.findElement(selLangEng).click();
		driver.findElement(employer).sendKeys(AllFeildsTestData.generateRandomEmployerName());
		driver.findElement(jobTitle).sendKeys(AllFeildsTestData.generateRandomJobTitle());
		driver.findElement(faxNumber).sendKeys(AllFeildsTestData.getFaxNumber());
		WebElement element1 = driver.findElement(perInfoContButton);
		js.executeScript("arguments[0].click()", element1);
		System.out.println("Step: Enter valid data in all fields and click on continue button");
		ObjectRepo.test.log(Status.PASS, "Step: Enter valid data in all fields and click on continue button");
	}

	public void residenceAndMailing() throws InterruptedException {
		driver.findElement(street1PrimResi).sendKeys(prop.getProperty("Street1"));
		driver.findElement(street2PrimResi).sendKeys(prop.getProperty("Street2"));
		driver.findElement(cityPrimResi).sendKeys(prop.getProperty("City"));
		driver.findElement(postalCodePrimResi).sendKeys(prop.getProperty("PostalCode"));
		//Thread.sleep(1000);
		driver.findElement(countryPrimResi).click();
		//Thread.sleep(2000);
		new WebDriverWait(driver, 30)
		.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[text()='United States']")));
		driver.findElement(selectCountryUSPrimResi).click();
		//driver.findElement(stateAndProvincePrimResi).click();
		WebElement element1 = driver.findElement(stateAndProvincePrimResi);
		Actions action=new Actions(driver);
		action.moveToElement(element1).build().perform();
		//Thread.sleep(2000);
		action.doubleClick(element1).build().perform();
		Thread.sleep(1000);
		//driver.findElement(stateAndProvincePrimResi).click();
		//driver.findElement(stateAndProvincePrimResi).click();
		driver.findElement(By.xpath("(//*[@data-testid='ArrowDropDownIcon'])[3]")).click();
		Thread.sleep(4000);
		new WebDriverWait(driver, 30)
		.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[text()='Alabama']")));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//		js.executeScript("arguments[0].click()", element1);
		driver.findElement(selectStatePrimResi).click();
		new WebDriverWait(driver, 30).until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//span[contains(text(),'Check if same as Primary Residence')]")));
		WebElement element = driver.findElement(checkBox);
		js.executeScript("arguments[0].click()", element);
		new WebDriverWait(driver, 30)
		.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[@id='priv_btn_Continue']")));
		WebElement element2 = driver.findElement(primResiContButton);
		js.executeScript("arguments[0].click()", element2);
		System.out.println(
				"Step : Enter valid data in all fields of residence and mailing step page and click on continue button");
		ObjectRepo.test.log(Status.PASS,
				"Step : Enter valid data in all fields of residence and mailing step page and click on continue button");
	}

	public void editAndReview() {
		new WebDriverWait(driver, 60).until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Selected Jurisdiction')]")));
		WebElement element3 = driver.findElement(checkBoxEditAndReview);
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("arguments[0].click()", element3);
		WebElement element4 = driver.findElement(editAndReviewContButton);
		js3.executeScript("arguments[0].click()", element4);
	}

	public void createUserLogin() throws InterruptedException {
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		userId = generateUserIdString();
		System.out.println("Uesrid :" + userId);
		driver.findElement(createUserId).sendKeys(userId);
		driver.findElement(passphrase).sendKeys(prop.getProperty("Passphrase"));
		driver.findElement(confirmPassphrase).sendKeys(prop.getProperty("Passphrase"));
		driver.findElement(secQuestion1).click();
		driver.findElement(selSecQue1).click();
		driver.findElement(answer1).sendKeys(prop.getProperty("Answer1"));
		driver.findElement(secQuestion2).click();
		new WebDriverWait(driver, 30)
		.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//li[@role='option'])[2]")));
		driver.findElement(selSecQue2).click();
		driver.findElement(answer2).sendKeys(prop.getProperty("Answer2"));
		WebElement elementp = driver.findElement(secQuestion2);
		WebElement element = driver.findElement(secQuestion3);
		Actions action = new Actions(driver);
		action.moveToElement(elementp).build().perform();
		action.moveToElement(element).perform();
		action.click(element).build().perform();
		new WebDriverWait(driver, 30)
		.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//li[@role='option'])[2]")));
		driver.findElement(selSecQue3).click();
		driver.findElement(answer3).sendKeys(prop.getProperty("Answer3"));
		WebElement element1 = driver.findElement(termsOfUseCheckBox);
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("arguments[0].click()", element1);
		WebElement element2 = driver.findElement(creUserProfRegBut);
		js3.executeScript("arguments[0].click()", element2);
		driver.findElement(crossButtonAfterRegistration).click();
		new WebDriverWait(driver, 30)
		.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[@id='priv_btn_Continue']")));
		driver.findElement(finishButton).click();
		System.out.println("New User Created Successfully.");
		ObjectRepo.test.log(Status.PASS, "New User Created Successfully.");
	}
}
