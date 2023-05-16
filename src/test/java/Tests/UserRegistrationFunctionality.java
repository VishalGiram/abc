package Tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.xml.sax.helpers.XMLReaderFactory;

import com.aventstack.extentreports.Status;

import pageObjects.ConfigurationSettings;
import pageObjects.ForgotUserIDAndPassphrasePOM;
import pageObjects.Homepage;
import pageObjects.MYClass;
import pageObjects.MyPOMClass;
import pageObjects.NewClass;
import pageObjects.POMpublicHomePage;
import pageObjects.PendingUser;
import pageObjects.UserRegistration;
import resources.ObjectRepo;
import resources.base;

public class UserRegistrationFunctionality extends base {

	/*
	 *TC_Id         : C27803
	 *Tc_Title      : Verification_Of_Edit_Profile_Functionality_When_The_Application_Status_Is_Pending
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 1,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verification_Of_Edit_Profile_Functionality_When_The_Application_Status_Is_Pending() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		//User registration
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		//Craeted User Login
		ref1.loginAsCreatedUser();
		ref1.verifyEditProfileFunctionalityForPendingUser();
	}

	/*
	 *TC_Id         : C27804
	 *Tc_Title      : Verification_Of_Edit_Profile_Functionality_When_The_Application_Status_Is_Revision_Requested
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 2,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verification_Of_Edit_Profile_Functionality_When_The_Application_Status_Is_Revision_Requested() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		//User registration
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		//california registrar login and revision requested to user
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.raisedRevisionRequestUserRegistrationByRegistrar();
		ref.logout();
		System.out.println("Registrar raised revision request to user successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar raised revision request to user successfully");
		//Revision requested User Login and submit revision request
		ref1.loginAsCreatedUser();
		ref1.californiaUserSubmitRevisionRequest();
		System.out.println("User submit revision request successfully");
		ObjectRepo.test.log(Status.PASS, "User submit revision request successfully");
	}

	/*
	 *TC_Id         : C27805
	 *Tc_Title      : Verification_Of_Edit_Profile_Functionality_When_The_Application_Status_Is_Approved
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 3,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verification_Of_Edit_Profile_Functionality_When_The_Application_Status_Is_Approved() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		//User registration
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		//california registrar login and approve/assign user
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarApproveAndAssignIndividualUsersRole();
		ref.logout();
		System.out.println("Registrar approve user successfully.");
		ObjectRepo.test.log(Status.PASS, "Registrar approve user successfully.");
		//Approved user login and edit user details
		ref1.loginAsCreatedUser();
		ref1.verifyEditProfileFunctionalityForApprovedUser();
		System.out.println("Approve user edit their user details successfully.");
		ObjectRepo.test.log(Status.PASS, "Approve user edit their user details successfully.");
	}

	/*
	 *TC_Id         : C32217
	 *Tc_Title      : Verification_Of_Availability_Of_user_Id_When_User_Change_User_Id_From_user_Profile
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 4,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verification_Of_Availability_Of_user_Id_When_User_Change_User_Id_From_user_Profile() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		//User registration
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		//california registrar login and revision requested to user
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.raisedRevisionRequestUserRegistrationByRegistrar();
		ref.logout();
		System.out.println("Registrar raised revision request to user successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar raised revision request to user successfully");
		//Revision requested User Login and submit revision request
		ref1.loginAsCreatedUser();
		ref1.errorMessageForChangesUserIDInRevisionRequestFlow();
		System.out.println("User submit revision request successfully");
		ObjectRepo.test.log(Status.PASS, "User submit revision request successfully");
	}

	/*
	 *TC_Id         : C32286,C32288
	 *Tc_Title      : Verify_That_The_Security_Questions_Propmts_When_User_Accessing_The_URL_For_First_Time
	 *                Verification_Of_User_Login_Functionality_Only_If_The_Username_Passphrase_and_Answer_TO_Security_Questions_are_Matches.
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 5,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verify_That_The_Security_Questions_Propmts_When_User_Accessing_The_URL_For_First_Time() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		//User registration
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		//Created user login with entering User ID And Passphrase
		ref1.loginAsCreatedUserWithEnterUserIDAndPassphrase();
		System.out.println("User enter User ID and Passphrase suucessfully.");
		ObjectRepo.test.log(Status.PASS, "User enter User ID and Passphrase suucessfully.");
		ref1.handleSecurityQuestionForCreatedUser();
		System.out.println("User enter Valid answer for security question and logged in suucessfully.");
		ObjectRepo.test.log(Status.PASS, "User enter Valid answer for security question and logged in suucessfully.");
	}

	/*
	 *TC_Id         : C32287
	 *Tc_Title      : Verify_That_The_Security_Questions_Propmts_When_User_Accessing_The_URL_For_The_Next_Time_In_Same_Browser
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 6,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verify_That_The_Security_Questions_Propmts_When_User_Accessing_The_URL_For_The_Next_Time_In_Same_Browser() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		//User registration
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		//Created user login with entering User ID And Passphrase
		ref1.loginAsCreatedUserWithEnterUserIDAndPassphrase();
		System.out.println("User enter User ID and Passphrase suucessfully.");
		ObjectRepo.test.log(Status.PASS, "User enter User ID and Passphrase suucessfully.");
		Thread.sleep(2000);
		ref1.handleSecurityQuestionForCreatedUser();
		Thread.sleep(2000);
		System.out.println("User enter Valid answer for security question and logged in suucessfully.");
		ObjectRepo.test.log(Status.PASS, "User enter Valid answer for security question and logged in suucessfully.");
		Thread.sleep(2000);
		ref.logout();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		ref1.loginAsCreatedUserWithEnterUserIDAndPassphrase();
		System.out.println("Security questions prompt should not displayed and user logged in successfully.");
		ObjectRepo.test.log(Status.PASS, "Security questions prompt should not displayed and user logged in successfully.");
	}

	/*
	 *TC_Id         : C32289
	 *Tc_Title      : Verification_Of_User_Login_Functionality_Only_If_The_Username_Passphrase_and_Answer_TO_Security_Questions_are_Matches.
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 7,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verification_Of_User_Login_Functionality_Only_If_The_Username_Passphrase_and_Answer_TO_Security_Questions_are_Matches() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		//User registration
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		//Created user login with entering Invalid User ID And Passphrase
		ref.unsuccessfulLoginError();
		System.out.println("Error message should get displayed successfully");
		ObjectRepo.test.log(Status.PASS, "Error message should get displayed successfully");
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		//Created user login with entering Valid User ID And Passphrase
		ref1.loginAsCreatedUserWithEnterUserIDAndPassphrase();
		System.out.println("User enter User ID and Passphrase suucessfully.");
		ObjectRepo.test.log(Status.PASS, "User enter User ID and Passphrase sucessfully.");
		ref1.handleSecurityQuestionForCreatedUserWithInvalidData();
		System.out.println("Error message should get displayed when user enters invalid answer for security question");
		ObjectRepo.test.log(Status.PASS, "Error message should get displayed when user enters invalid answer for security question");
	}

	/*
	 *TC_Id         : C29076
	 *Tc_Title      : Verify_Comment_Field_when_The_Application_Is_Approved_By_Registrar
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 8,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verify_Comment_Field_when_The_Application_Is_Approved_By_Registrar() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		//california registrar login and approve/assign user
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.approveFunctionalityByRegistrar();
		System.out.println("Registrar approve user successfully.");
		ObjectRepo.test.log(Status.PASS, "Registrar approve user successfully.");
	}

	/*
	 *TC_Id         : C29077
	 *Tc_Title      : Verify_Comment_Field_when_The_Application_Is_Denied_By_Registrar
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 9,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verify_Comment_Fieldl_when_The_Application_Is_Approved_By_Registrar() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		//california registrar login and approve/assign user
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.deniedUserRegistrationFunctionalityByRegistrar();
		System.out.println("Registrar denied user successfully.");
		ObjectRepo.test.log(Status.PASS, "Registrar denied user successfully.");
	}

	/*
	 *TC_Id         : C32636,C29232,29180
	 *Tc_Title      : Verify_Comment_Field_when_The_Application_Is_Requesy_Revision_By_Registrar
	 *                Verification_Of_Submit_request_revision_Without_Comment
	 *                Verify_Jurisdiction_User_can_Change_Of_The_User_Registration-Application_TO_Request_Revision_Without_adding_Comment.
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 10,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verify_Comment_Field_when_The_Application_Is_Requesy_Revision_By_Registrar() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		//california registrar login and approve/assign user
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.requestRevisionFunctionalityByRegistrar();
		System.out.println("Registrar request revision to user successfully.");
		ObjectRepo.test.log(Status.PASS, "Registrar request revision to user successfully.");
	}

	/*
	 *TC_Id         : C32637
	 *Tc_Title      : Verify_Comment_Field_when_The_User_Registration_Cancel_By_Registrar
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 11,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verify_Comment_Field_when_The_User_Registration_Cancel_By_Registrar() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		//california registrar login and approve/assign user
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.cancelUserRegistrationFunctionalityByRegistrar();
		System.out.println("Registrar cancel user registration successfully.");
		ObjectRepo.test.log(Status.PASS, "Registrar cancel user registration successfully.");
	}

	/*
	 *TC_Id         : C29231
	 *Tc_Title      : Verification_Of_Jurisdiction_User_Can_Make_Request_Revision_To_Submitted_Application
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 12,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void Verification_Of_Jurisdiction_User_Can_Make_Request_Revision_To_Submitted_Application() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		//california registrar login and raised revision request
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.raisedRevisionRequestUserRegistrationByRegistrar();
		System.out.println("Registrar raised revision request to user successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar raised revision request to user successfully");
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarViewRequestStatus();
		System.out.println("Registrar view request status of user successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar view request status of user successfully");
	}

	/*
	 *TC_Id         : C29238
	 *Tc_Title      : Verification_Of_Submit_Functionality_For_Corrected_Revisions
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 13,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verification_Of_Submit_Functionality_For_Corrected_Revisions() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		//california registrar login and raised request revision
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.raisedRevisionRequestUserRegistrationByRegistrar();
		System.out.println("Registrar raised revision request to user successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar raised revision request to user successfully");
		ref.logout();
		ref1.loginAsCreatedUser();
		ref1.californiaUserSubmitRevisionRequest();
		System.out.println("User submit revision request successfully");
		ObjectRepo.test.log(Status.PASS, "User submit revision request successfully");
	}

	/*
	 *TC_Id         : C35636
	 *Tc_Title      : verify_The_Logion_Functionality_with_Valid_Data
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 14,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verify_The_Logion_Functionality_with_Valid_Data() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		ref1.loginAsCreatedUser();
		String homepage=driver.findElement(By.xpath("//div[@class='MuiBox-root css-knkskr']")).getText();
		System.out.println("Text On Home Page:"+homepage);
		Assert.assertEquals("PENDING", homepage);
		ObjectRepo.test.log(Status.PASS, "Text On Home Page:"+homepage);
		System.out.println("User logged in successfully and homepage is displayed");
		ObjectRepo.test.log(Status.PASS, "User logged in successfully and homepage is displayed");
	}

	/*
	 *TC_Id         : C35637
	 *Tc_Title      : verify_The_Logion_Functionality_with_Invalid_Data
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 15,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verify_The_Logion_Functionality_with_Invalid_Data() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		ref.unsuccessfulLoginError();
		System.out.println("Error message is diaplyed");
		ObjectRepo.test.log(Status.PASS, "Error message is diaplyed");
	}

	/*
	 *TC_Id         : C29066
	 *Tc_Title      : Verification_Jurisdiction_User_Can_View_Applicant_User_status_history_From_Another_Jurisdiction
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 16,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verification_Jurisdiction_User_Can_View_Applicant_User_status_history_From_Another_Jurisdiction() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectJurisdictionForQubec();
		//california registrar login and view user
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarViewUserUsingJurisdictionFilter();
	}

	/*
	 *TC_Id         : C29067,C29065
	 *Tc_Title      : Verify_That_When_Request_statusOf_Applicant_User_Changes_All_Request_Status_Is_Captured_And_displayed_In_User_Status_History
	 *                Verification_Of_Jurisdiction_User_can_view_applicant_Status_History_From_Their_Jurisdiction
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 17,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verify_That_When_Request_statusOf_Applicant_User_Changes_All_Request_Status_Is_Captured_And_displayed_In_User_Status_History() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		//california registrar login and view user details page
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		System.out.println("User Details page is displayed successfully");
		ObjectRepo.test.log(Status.PASS, "User Details page is displayed successfully");
		ref1.registrarViewUserStatusHistory();
		System.out.println("Registrar is able to view User Status History grid on user details page");
		ObjectRepo.test.log(Status.PASS, "Registrar is able to view User Status History grid on user details page");
		ref1.registrarApproveAndAssignIndividualUsersRole();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarViewUserStatusHistoryWithColomnAndColomnValue();
		ref.logout();
		//Created User Login and raised Change jurisdiction request
		ref1.loginAsCreatedUser();
		ref1.changeJurisdictionCaliforniaToQuebec();
		ref.logout();
		////california registrar login and view user details page
		ref1.californiaRegistrar();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarViewUserStatusHistoryWithColomnAndColomnValueAfterUserChangeJurisdiction();
		System.out.println("Registrar is able to view User Status History grid on user details page with updated value in colomn");
		ObjectRepo.test.log(Status.PASS, "Registrar is able to view User Status History grid on user details page with updated value in colomn");
	}

	/*
	 *TC_Id         : C36230
	 *Tc_Title      : Verification_Jurisdiction_User_Can_View_Applicant_User_status_history_From_Another_Jurisdiction_WhoSubmitted_The_Cross_Jurisdiction_Request_Or_Change_Jurisdiction_Request
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 18,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void Verification_Jurisdiction_User_Can_View_Applicant_User_status_history_From_Another_Jurisdiction_WhoSubmitted_The_Cross_Jurisdiction_Request_Or_Change_Jurisdiction_Request() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		//california registrar login and raised request revision
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarApproveAndAssignIndividualUsersRole();
		ref.logout();
		//Created User login and cross jurisdiction request
		ref1.loginAsCreatedUser();
		ref1.approvedUserRisedCrossJurisdictionRequest();
		ref.logout();
		//California registrar login and view user details
		ref1.californiaRegistrar();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarViewUserStatusHistoryWithColomnAndColomnValueAfterUserCrossJurisdiction();
		System.out.println("Registrar is able to view User Status History grid on user details page with updated value in colomn");
		ObjectRepo.test.log(Status.PASS, "Registrar is able to view User Status History grid on user details page with updated value in colomn");
	}

	/*
	 *TC_Id         : C29179
	 *Tc_Title      : Jurisdiction_User_Can_Able_TO_Change_Status_Of_The_User_Registration_Application_To_Request_Revision_WithAdding_Valid_comment
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 19,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void jurisdiction_User_Can_Able_TO_Change_Status_Of_The_User_Registration_Application_To_Request_Revision_WithAdding_Valid_comment() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		//california registrar login and raised request revision
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchPendingUserInPendingGridAndGoToUserDetailsPage();
		ref1.raisedRevisionRequestUserRegistrationByRegistrar();
		System.out.println("Registrar raised request revision successfully.");
		ObjectRepo.test.log(Status.PASS, "Registrar raised request revision successfully.");
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarViewRequestStatus();
		ref.logout();
		//Created user login and view request status
		ref1.loginAsCreatedUser();
		ref1.requestRevisionUserViewHisUserProfile();
		System.out.println("Revision Requested User is view comment added by Registrar");
		ObjectRepo.test.log(Status.PASS, "Revision Requested User is view comment added by Registrar");
	}

	/*
	 *TC_Id         : C29181
	 *Tc_Title      : Jurisdiction_User_Can_Able_TO_Change_Status_Of_The_User_Registration_Application_To_Request_Revision_With_Using_Jurisdiction_Filter
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 20,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void Jurisdiction_User_Can_Able_TO_Change_Status_Of_The_User_Registration_Application_To_Request_Revision_With_Using_Jurisdiction_Filter() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		//california registrar login and raised request revision
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarViewUserUsingJurisdictionFilterForPeningUserGrid();
		ref1.raisedRevisionRequestUserRegistrationByRegistrar();
		System.out.println("Registrar raised request revision successfully.");
		ObjectRepo.test.log(Status.PASS, "Registrar raised request revision successfully.");
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarViewRequestStatus();
		System.out.println("Registrar view user request status successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar view user request status successfully");
	}

	/*
	 *TC_Id         : C29182
	 *Tc_Title      : Jurisdiction_User_Can_Able_TO_Change_Status_Of_The_User_Registration_Application_To_Request_Revision_With_Using_Request_status_Filter
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 21,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void Jurisdiction_User_Can_Able_TO_Change_Status_Of_The_User_Registration_Application_To_Request_Revision_With_Using_Request_status_Filter() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		//california registrar login and raised request revision
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarViewUserUsingRequestStatusFilterForPeningUserGrid();
		ref1.raisedRevisionRequestUserRegistrationByRegistrar();
		System.out.println("Registrar raised request revision successfully.");
		ObjectRepo.test.log(Status.PASS, "Registrar raised request revision successfully.");
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarViewRequestStatus();
		System.out.println("Registrar view user request status successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar view user request status successfully");
	}

	/*
	 *TC_Id         : C29183
	 *Tc_Title      : Jurisdiction_User_Can_Able_TO_Change_Status_Of_The_User_Registration_Application_To_Request_Revision_With_Using_Role_Filter
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 22,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void Jurisdiction_User_Can_Able_TO_Change_Status_Of_The_User_Registration_Application_To_Request_Revision_With_Using_Role_Filter() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		//california registrar login and raised request revision
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarViewUserUsingRoleFilterForPeningUserGrid();
		ref1.raisedRevisionRequestUserRegistrationByRegistrar();
		System.out.println("Registrar raised request revision successfully.");
		ObjectRepo.test.log(Status.PASS, "Registrar raised request revision successfully.");
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarViewRequestStatus();
		System.out.println("Registrar view user request status successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar view user request status successfully");
	}

	/*
	 *TC_Id         : C29080
	 *Tc_Title      : Verify_Assign_Role_Functionality_For_User_During_Approve_Registration_By_Registrar
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 23,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verify_Assign_Role_Functionality_For_User_During_Approve_Registration_By_Registrar() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		//california registrar login and approve/assign user
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.approveFunctionalityByRegistrar();
		System.out.println("Registrar approve user successfully.");
		ObjectRepo.test.log(Status.PASS, "Registrar approve user successfully.");
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarViewRequestStatusAfterApprovedUser();
		System.out.println("Registrar view request status of user");
		ObjectRepo.test.log(Status.PASS, "Registrar view request status of user");
	}

	/*
	 *TC_Id         : C29081
	 *Tc_Title      : Verify_Without_Selecting_Role_Type_and_Role_For_User_During_Approve_Registration_By_Registrar
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 24,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verify_Without_Selecting_Role_Type_and_Role_For_User_During_Approve_Registration_By_Registrar() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		//california registrar login and approve/assign user
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchPendingUserInPendingGridAndGoToUserDetailsPage();
		ref1.withoutSelectingRoleTypeAndRole();
		System.out.println("Registrar is not able to approve user without selecting role type and role");
		ObjectRepo.test.log(Status.PASS, "Registrar is not able to approve user without selecting role type and role");
	}

	/*
	 *TC_Id         : C29082
	 *Tc_Title      : Verify_When_The_Registrar_Assign_roles_From_Jurisdiction_Users_Or_Service_Providers_role_Type_A_Dual_approval_Proposal_sent_TO_Jurisdiction_Authority
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 25,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void Verify_When_The_Registrar_Assign_roles_From_Jurisdiction_Users_Or_Service_Providers_role_Type_A_Dual_approval_Proposal_sent_TO_Jurisdiction_Authority() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		//california registrar login and approve/assign user
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchPendingUserInPendingGridAndGoToUserDetailsPage();
		ref1.registrarApproveAndAssignMultipleRoleServiceProviderRole();
		System.out.println("Registrar is assign role from service provider role type");
		ObjectRepo.test.log(Status.PASS, "Registrar is assign role from service provider role type");
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarViewRequestStatusAfterProposedToAuthority();
		ref.logout();
		//California Authority Login and approve user
		ref1.LoginAsCaliforniaAuthority();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchPendingUserInPendingGridAndGoToUserDetailsPage();
		ref1.authorityApproveUser();
		System.out.println("Authority approve user successfully.");
		ObjectRepo.test.log(Status.PASS, "Authority approve user successfully.");
	}

	/*
	 *TC_Id         : C29083,C29084
	 *Tc_Title      : Verify_Registrar_Can_Select_Roles_Associated_With_The_Selected_Role_Type_During_The_Approval_Process
	 *                Verification_Of_Assigning_Multiple_Roles_From_Same_Role_Type_During_The_Approva_Process
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 26,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void Verify_Registrar_Can_Select_Roles_Associated_With_The_Selected_Role_Type_During_The_Approval_Process() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		//california registrar login and approve/assign user
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchPendingUserInPendingGridAndGoToUserDetailsPage();
		ref1.assignMultipleRoleToUser();
		System.out.println("Registrar is assign multiple role to user");
		ObjectRepo.test.log(Status.PASS, "Registrar is assign multiple role to user");	
	}

	/*
	 *TC_Id         : C29085
	 *Tc_Title      : Verification_Of_Assigning_Multiple_Roles_from_Different_Role_Types_During_The_Approval_Process
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 27,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verification_Of_Assigning_Multiple_Roles_from_Different_Role_Types_During_The_Approval_Process() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		//california registrar login and approve/assign user
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchPendingUserInPendingGridAndGoToUserDetailsPage();
		ref1.assignMultipleRoleToUserAccrossRoleType();
		System.out.println("Registrar is not able to select multiple roles across different role types");
		ObjectRepo.test.log(Status.PASS, "Registrar is not able to select multiple roles across different role types");	
	}

	/*
	 *TC_Id         : C32717
	 *Tc_Title      : Verification_Of_Cancelling_The_user_Registration_Form_after_The_Revised_User_Updated_The_User_Details_form
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 28,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void Verification_Of_Cancelling_The_user_Registration_Form_after_The_Revised_User_Updated_The_User_Details_form() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		//california registrar login and approve/assign user
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchPendingUserInPendingGridAndGoToUserDetailsPage();
		ref1.raisedRevisionRequestUserRegistrationByRegistrar();
		System.out.println("Registrar is Raised revision request successfylly");
		ObjectRepo.test.log(Status.PASS, "Registrar is Raised revision request successfylly");	
		ref.logout();
		//Revision requested user login in and try to submit revision request
		ref1.loginAsCreatedUser();
		ref1.userCancelRevisionRequestSubmittion();
		System.out.println("Cancel functionality working Fine");
		ObjectRepo.test.log(Status.PASS, "Cancel functionality working Fine");	
	}

	/*
	 *TC_Id         : C29063 RPM-528
	 *Tc_Title      : Verification_Of_Jurisdiction_User_Can_View_Applicants_Personal_Information
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 29,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verification_Of_Jurisdiction_User_Can_View_Applicants_Personal_Information() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		//california registrar login and approve/assign user
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchPendingUserInPendingGridAndGoToUserDetailsPage();
		ref1.registrarViewUserDetails();
		System.out.println("Registrar view User details successfully.");
		ObjectRepo.test.log(Status.PASS, "Registrar view User details successfully.");
	}

	/*
	     *TC_Id         : C29362 RPM-534
	     *Tc_Title      : Verify_that_the_registrar_can_cancel_the_user_registration_approval_process
	     *Functionality : User Registrartion
	     *Author        : pravin.jogi@eqanim.com           
	     */
	@Test(priority = 30,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verify_that_the_registrar_can_cancel_the_user_registration_approval_process() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarCancelUserApproval();
		System.out.println("Registrar cancel user approval successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar cancel user approval successfully");
	}

	/*
	     *TC_Id         : C29769 RPM-534
	     *Tc_Title      : Verify_that_registrar_can_cancel_the_user_registration_deny_process
	     *Functionality : User Registrartion
	     *Author        : pravin.jogi@eqanim.com           
	     */
	@Test(priority = 31,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verify_that_registrar_can_cancel_the_user_registration_deny_process() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarCancelDeniedUserRegistration();
		System.out.println("Registrar cancel user approval successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar cancel user approval successfully");
	}

	/*TC_Id         : C29770 RPM-534,C29074 RPM-532    
	 *Tc_Title      : Verify_success_message_after_user_registration_deny_process
	 *                Verify_Deny_Functionality_For_User_Registration_By_Registrar_With_Adding_Reason     
	 *Functionality : User Registrartion    
	 *Author        : pravin.jogi@eqanim.com 
	 */
	@Test(priority = 30,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verify_success_message_after_user_registration_deny_process() throws Exception {
		Homepage ref = new Homepage(); 
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.deniedUserRegistrationFunctionalityByRegistrar();
		System.out.println("Registrar cancel user approval successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar cancel user approval successfully");
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarViewRequestStatusAfterDeniedUser();
		System.out.println("Registrar view user request status successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar view user request status successfully");
	}


	/*
	     *TC_Id         : C29771 RPM-534,C29073 RPM-532
	     *Tc_Title      : Verify_success_message_after_user_registration_Approve_process
	 *                Verify_Approve_Functionality_For_User_Registration_By_Registrar
	     *Functionality : User Registrartion
	     *Author        : pravin.jogi@eqanim.com           
	     */
	@Test(priority = 31,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verify_success_message_after_user_registration_Approve_process() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchPendingUserInPendingGridAndGoToUserDetailsPage();
		ref1.approveFunctionalityByRegistrar();
		System.out.println("Registrar approve user successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar approve user successfully");
	}

	/*
	     *TC_Id         : C29075 RPM-532
	     *Tc_Title      : Verify_Deny_Functionality_For_User_Registration_By_Registrar_Without_Adding_Reason
	     *Functionality : User Registrartion
	     *Author        : pravin.jogi@eqanim.com           
	     */
	@Test(priority = 32,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verify_Deny_Functionality_For_User_Registration_By_Registrar_Without_Adding_Reason() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.deniedFunctionalityWithoutAddingReasons();
		System.out.println("Registrar approve user successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar approve user successfully");
	}

	/*
	     *TC_Id         : C29037, C29038 RPM-396
	     *Tc_Title      : Verification_Of_Registration_Application_When_Application_Status_Is_Revision_Requested
	     *Functionality : User Registrartion
	     *Author        : pravin.jogi@eqanim.com           
	     */
	@Test(priority = 33,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verification_Of_Registration_Application_When_Application_Status_Is_Revision_Requested() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.raisedRevisionRequestUserRegistrationByRegistrar();
		System.out.println("Registrar raised revision request to user successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar raised revision request to user successfully");
		ref.logout();
		ref1.loginAsCreatedUser();
		ref1.californiaUserSubmitRevisionRequest();
		System.out.println("User submit revision request successfully");
		ObjectRepo.test.log(Status.PASS, "User submit revision request successfully");
	}

	/*
	     *TC_Id         : C29056 RPM-396
	     *Tc_Title      : Verify_Applicant_Can_Not_Make_Changes_To_Registration_Application_When_Status_Is_Changed_From_Revision_Requested
	     *Functionality : User Registrartion
	     *Author        : pravin.jogi@eqanim.com           
	     */
	@Test(priority = 34,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verify_Applicant_Can_Not_Make_Changes_To_Registration_Application_When_Status_Is_Changed_From_Revision_Requested() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.raisedRevisionRequestUserRegistrationByRegistrar();
		System.out.println("Registrar raised revision request to user successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar raised revision request to user successfully");
		ref.logout();
		ref1.loginAsCreatedUser();
		MYC.resetPassphrasePrompt1();
		ref1.californiaUserSubmitRevisionRequest();
		System.out.println("User submit revision request successfully");
		ObjectRepo.test.log(Status.PASS, "User submit revision request successfully");
		ref1.verifyEditProfileFunctionalityForPendingUser();
	}

	/*
	 *TC_Id         : C29064 RPM-528
	 *Tc_Title      : Verification_Of_Jurisdiction_User_Can_View_The_applicant_Passphrase_Security_Questions_And_Answers
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 35,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void Verification_Of_Jurisdiction_User_Can_View_The_applicant_Passphrase_Security_Questions_And_Answers() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		//california registrar login and approve/assign user
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchPendingUserInPendingGridAndGoToUserDetailsPage();
		ref1.registrarCanNotViewPassphraseAndSecurityQuestions();
		System.out.println("Registrar can not able to view Security questions and passphrase");
		ObjectRepo.test.log(Status.PASS, "Registrar can not able to view Security questions and passphrase");
	}

	/*
	 *TC_Id         : C29091 RPM-540
	 *Tc_Title      : Verification_Of_Remove_Assigned_Role_From_Jurisdiction_Or_Service_Provider_User
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 36,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void Verification_Of_Remove_Assigned_Role_From_Jurisdiction_Or_Service_Provider_User() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		//california registrar login and approve user
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchPendingUserInPendingGridAndGoToUserDetailsPage();
		ref1.registrarApproveAndAssignMultipleRoleFromJurisdictionUserRoleType();
		System.out.println("Registrar assign multiple role to user from Jurisdiction user role type successfully.");
		ObjectRepo.test.log(Status.PASS, "Registrar assign multiple role to user from Jurisdiction user role type successfully.");
		ref.logout();
		//california authority log in and approve user
		ref1.LoginAsCaliforniaAuthority();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchPendingUserInPendingGridAndGoToUserDetailsPage();
		ref1.authorityApproveUser();
		System.out.println("Authority approve user successfully.");
		ObjectRepo.test.log(Status.PASS, "Authority approve user successfully.");
		ref.logout();
		//California registrar log in and remove one role
		ref1.californiaRegistrar();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.removeRoleFromMultipleRoleFromJurisdictionUserRoleTypeAssignedByRegistrar();
		System.out.println("Registrar remove role from assigned role successfully.");
		ObjectRepo.test.log(Status.PASS, "Registrar remove role from assigned role successfully.");
		ref.logout();
		//California Authority log in and approve role change
		ref1.LoginAsCaliforniaAuthority();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.authorityApproveProposedRoleChange();
		System.out.println("Authority approve role change successfully.");
		ObjectRepo.test.log(Status.PASS, "Authority approve role change successfully.");
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarViewRequestStatusAfterChangeUserRole();
		System.out.println("Registrar view request status of user successfully after remove user role.");
		ObjectRepo.test.log(Status.PASS, "Registrar view request status of user successfully after remove user role.");
	}

	/*
	 *TC_Id         : C35619 RPM-540
	 *Tc_Title      : Verification_Of_Removing_Assigned_Roles_For_users_Other_Than_Jurisdiction_And_service_Providers
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 37,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verification_Of_Removing_Assigned_Roles_For_users_Other_Than_Jurisdiction_And_service_Providers() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		//california registrar login and approve user
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchPendingUserInPendingGridAndGoToUserDetailsPage();
		ref1.assignMultipleRoleToUser();
		System.out.println("Registrar assign multiple role to user successfully.");
		ObjectRepo.test.log(Status.PASS, "Registrar assign multiple role to user successfully.");
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.removeRoleFromMultipleRoleAssignedByRegistrar();
		System.out.println("Registrar remove role from assigned role successfully.");
		ObjectRepo.test.log(Status.PASS, "Registrar remove role from assigned role successfully.");
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarViewRequestStatusAfterChangeUserRole();
		System.out.println("Registrar view request status of user successfully after remove user role.");
		ObjectRepo.test.log(Status.PASS, "Registrar view request status of user successfully after remove user role.");
	}

	/*
	 *TC_Id         : C29088 RPM-538
	 *Tc_Title      : Verification_Of_Assigning_Multiple_Roles_From_different_role_type_During_The_Approval_Process
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 38,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void Verification_Of_Assigning_Multiple_Roles_From_different_role_type_During_The_Approval_Process() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		//california registrar login and approve user
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchPendingUserInPendingGridAndGoToUserDetailsPage();
		ref1.assignMultipleRoleToUserAccrossRoleType();
		System.out.println("Registrar can not assign multiple role from different role type to user successfully.");
		ObjectRepo.test.log(Status.PASS, "Registrar can not assign multiple role from different role type to user successfully.");
	}

	/*
	 *TC_Id         : C29101 RPM-548
	 *Tc_Title      : Verification_Of_Jurisdiction_User_can_View_User_Role_History_with_Selecting_Same_Jurisdiction
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 39,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verification_Of_Jurisdiction_User_can_View_User_Role_History_with_Selecting_Same_Jurisdiction() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		//california registrar login and approve user
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchPendingUserInPendingGridAndGoToUserDetailsPage();
		ref1.registrarViewRoleStatusHistoryGrid();
		System.out.println("Registrar is viewed role status history grid");
		ObjectRepo.test.log(Status.PASS, "Registrar is viewed role status history grid");
	}

	/*
	 *TC_Id         : C29102 RPM-548
	 *Tc_Title      : Verification_Of_Jurisdiction_User_can_View_User_Role_History_with_Using_Filter
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 40,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verification_Of_Jurisdiction_User_can_View_User_Role_History_with_Using_Filter() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		//california registrar login and approve user
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarViewUserUsingRequestStatusFilterForSearchUserGrid();
		ref1.registrarViewRoleStatusHistoryGrid();
		System.out.println("Registrar is viewed role status history grid");
		ObjectRepo.test.log(Status.PASS, "Registrar is viewed role status history grid");
	}

	/*
	 *TC_Id         : C29103 RPM-548
	 *Tc_Title      : Verification_Of_Jurisdiction_User_can_View_User_Role_History_with_Selecting_Status
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 41,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verification_Of_Jurisdiction_User_can_View_User_Role_History_with_Selecting_Status() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		//california registrar login and approve user
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserWithStatusAsRequestRevision();
		ref1.registrarViewRoleStatusHistoryGrid();
		System.out.println("Registrar is viewed role status history grid");
		ObjectRepo.test.log(Status.PASS, "Registrar is viewed role status history grid");
	}

	/*
	 *TC_Id         : C29104 RPM-548
	 *Tc_Title      : Verification_Of_Jurisdiction_User_can_View_User_Role_History_with_Selecting_role
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 42,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verification_Of_Jurisdiction_User_can_View_User_Role_History_with_Selecting_role() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		//california registrar login and approve user
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarViewUserUsingRoleFilterForSearchUserGrid();
		ref1.registrarViewRoleStatusHistoryGrid();
		System.out.println("Registrar is viewed role status history grid");
		ObjectRepo.test.log(Status.PASS, "Registrar is viewed role status history grid");
		//		
		//		WebElement scroll=driver.findElement(By.cssSelector(".xyz"));
		//		JavascriptExecutor js=(JavascriptExecutor)driver;
		//		js.executeScript("document.querySelector(scroll).scrollRight=1000");
	}

	/*
	 *TC_Id         : C32282 RPM-563
	 *Tc_Title      : Verification_Of_Last_Successful_Login_Date_Time_And_Date_Displayed_On_User_Profile_Page
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 43,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void Verification_Of_Last_Successful_Login_Date_Time_And_Date_Displayed_On_User_Profile_Page() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		//Created user login in
		ref1.loginAsCreatedUser();
		ref.logout();
		//Created user agin log in
		ref1.runTimeloginAsCreatedUser();
		MYC.resetPassphrasePrompt1();
		ref1.userViewLastLoginDateAndTime();
		System.out.println("User is able to view last login date and time on user profile page");
		ObjectRepo.test.log(Status.PASS, "User is able to view last login date and time on user profile page");
	}

	/*
	 *TC_Id         : C32283 RPM-563, C35843 RPM-398
	 *Tc_Title      : Verification_Of_Last_Successful_Login_When_User_Logs_In_For_The_First_Time_After_Registration
	 *                Verification_Last_Login_On_Welcome_name_Menu_When_User_Logs_In_For_The_First_Time_After_Registration
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 44,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void Verification_Of_Last_Successful_Login_When_User_Logs_In_For_The_First_Time_After_Registration() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		//Created user login in
		ref1.loginAsCreatedUser();
		ref1.userViewLastLoginDateAndTimeForFirstTimeLogin();
		System.out.println("User is able not to view last login date and time for first time login");
		ObjectRepo.test.log(Status.PASS, "User is able not to view last login date and time for first time login");
	}

	/*
	 *TC_Id         : C27734,C27738 RPM-390
	 *Tc_Title      : Verify_The_Cancel_User_Registration_Application_Functionality
	 *                Verification_Of_Login_Functionality_After_Cancel_The_Application
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 45,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verify_The_Cancel_User_Registration_Application_Functionality() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		//Created user log in and cancel user registration
		ref1.loginAsCreatedUser();
		ref1.cancelUserRegistrationByUser();
		System.out.println("User is cancel his user registration successfully.");
		ObjectRepo.test.log(Status.PASS, "User is cancel his user registration successfully.");
	}

	/*
	 *TC_Id         : C27736 RPM-390
	 *Tc_Title      : Verify_of_Cancel_Button_Functionality_On_Confirmation_Message_Popup
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 46,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verify_of_Cancel_Button_Functionality_On_Confirmation_Message_Popup() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		//Created user log in and cancel user registration
		ref1.loginAsCreatedUser();
		ref1.cancelButtonFunctionalityForCancelUserRegistrationByUser();
		System.out.println("Cancel button functionality working fine");
		ObjectRepo.test.log(Status.PASS, "Cancel button functionality working fine");
	}

	/*
	 *TC_Id         : C27703 RPM-398
	 *Tc_Title      : Verification_Of_Last_Successful_Login_Date_And_Time_On_Welcome_Name
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 45,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verification_Of_Last_Successful_Login_Date_And_Time_On_Welcome_Name() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		//Created user login in
		ref1.loginAsCreatedUser();
		System.out.println("User logged in successfully.");
		ObjectRepo.test.log(Status.PASS, "User logged in successfully.");
		ref.logout();
		//Created user again log in
		ref1.runTimeloginAsCreatedUser();
		MYC.resetPassphrasePrompt1();
		ref.displayLastLoginDateAndTimeAfterLogin();
		System.out.println("The last successful time and date is display");
		ObjectRepo.test.log(Status.PASS, "The last successful time and date is display");
	}

	/*
	 *TC_Id         : C27704 RPM-398
	 *Tc_Title      : Verification_Of_Replacement_Of_New_Successful_Login_Date_And_Time_With_The_Last_Login
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 46,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verification_Of_Replacement_Of_New_Successful_Login_Date_And_Time_With_The_Last_Login() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		//Created user login in
		ref1.loginAsCreatedUser();
		System.out.println("User logged in successfully.");
		ObjectRepo.test.log(Status.PASS, "User logged in successfully.");
		ref.logout();
		//Created user again log in
		ref1.runTimeloginAsCreatedUser();
		MYC.resetPassphrasePrompt1();
		ref1.lastLoginReplaced();
		System.out.println("The last successful time and date is display");
		ObjectRepo.test.log(Status.PASS, "The last successful time and date is display");
	}

	/*
	 *TC_Id         : C29194 RPM-560
	 *Tc_Title      : Verification_Of_Display_Registration_Application_Status_On_User_Profile
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 47,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void Verification_Of_Display_Registration_Application_Status_On_User_Profile() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		//california registrar log in
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarViewUserUsingRoleFilterForSearchUserGrid();
		ref1.raisedRevisionRequestUserRegistrationByRegistrar();
		System.out.println("Registrar raised revision request to user successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar raised revision request to user successfully");
		ref.logout();
		//created user log in and view application status
		ref1.loginAsCreatedUser();
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='MuiBox-root css-knkskr']")));
		String requestRevisionStatusText=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div[2]")).getText();
		System.out.println("User Registration Status :" + requestRevisionStatusText);
		ObjectRepo.test.log(Status.PASS, "User Registration Status :" + requestRevisionStatusText);
		System.out.println("User is view registration application status");
		ObjectRepo.test.log(Status.PASS, "User is view registration application status");
	}

	/*
	 *TC_Id         : C29195 RPM-560
	 *Tc_Title      : Verification_Of_Change_In_Application_Status_When_Applicant_Submit_Requested_Revision
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 48,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verification_Of_Change_In_Application_Status_When_Applicant_Submit_Requested_Revision() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		//california registrar log in
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarViewUserUsingRoleFilterForSearchUserGrid();
		ref1.raisedRevisionRequestUserRegistrationByRegistrar();
		System.out.println("Registrar raised revision request to user successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar raised revision request to user successfully");
		ref.logout();
		//created user log in and view application status
		ref1.loginAsCreatedUser();
		ref1.californiaUserSubmitRevisionRequest();
		System.out.println("User submit request revision successfully");
		ObjectRepo.test.log(Status.PASS, "User submit request revision successfully");
	}

	/*
	 *TC_Id         : C27801 RPM-357
	 *Tc_Title      : Verification_Of_CXancel_User_Registration_Functionality_If_Received_Physical_Documents_Flag_Not_Checked
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 49,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verification_Of_CXancel_User_Registration_Functionality_If_Received_Physical_Documents_Flag_Not_Checked() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		//california registrar log in
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarViewUserUsingRoleFilterForSearchUserGrid();
		//new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='PhysicalDocs']")));
		WebElement checkBox=driver.findElement(By.xpath("//input[@name='PhysicalDocs']"));
		if(checkBox.isSelected()) {
			System.out.println("Physical Documents Received checkbox is checked");
			ObjectRepo.test.log(Status.PASS, "Physical Documents Received checkbox is checked");
		}
		else {
			System.out.println("Physical Documents Received checkbox is Unchecked");
			ObjectRepo.test.log(Status.PASS, "Physical Documents Received checkbox is Unchecked");
		}
		ref.logout();
		//created user log in
		ref1.loginAsCreatedUser();
		ref1.cancelUserRegistrationFunctionalityByUser();
		System.out.println("User cancel his user registration successfully");
		ObjectRepo.test.log(Status.PASS, "User cancel his user registration successfully");
		//California registrar login and view user status
		ref1.californiaRegistrar();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		String requestStatus=driver.findElement(By.xpath("//div[@title='Cancelled by Applicant']")).getText();
		System.out.println("Request Status is:"+requestStatus);
		Assert.assertEquals("Cancelled by Applicant", requestStatus);
		ObjectRepo.test.log(Status.PASS, "Request Status is:"+requestStatus);
		System.out.println("Registrar viewed user status after cancel user registration by user");
		ObjectRepo.test.log(Status.PASS, "Registrar viewed user status after cancel user registration by user");
	}

	/*
	 *TC_Id         : C27802 RPM-357
	 *Tc_Title      : Verification_Of_login_Functionality_For_user_After_Cancel_User_Registration_By_Applicant
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 50,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verification_Of_login_Functionality_For_user_After_Cancel_User_Registration_By_Applicant() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		//Created user login and cancel user registration
		ref1.loginAsCreatedUser();
		ref1.cancelUserRegistrationByUser();
		System.out.println("User cancel user registration successfully");
		ObjectRepo.test.log(Status.PASS, "User cancel user registration successfully");
	}

	/*
	 *TC_Id         : C29363 RPM-541
	 *Tc_Title      : Verify_That_The_Jurisdioction_Authority_Can_View_Proposed_Registratios_For_Roles_And_Proposed_updates_For_Roles
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 51,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verify_That_The_Jurisdioction_Authority_Can_View_Proposed_Registratios_For_Roles_And_Proposed_updates_For_Roles() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		//california registrar log in
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserInPendingGridAndViewUserListInGrid();
		ref1.registrarSearchPendingUserInPendingGridAndGoToUserDetailsPage();
		ref1.registrarViewUserDetails();
		System.out.println("Registrar view user details");
		ObjectRepo.test.log(Status.PASS, "Registrar view user details");
	}

	/*
	 *TC_Id         : C29366 RPM-541
	 *Tc_Title      : Verify_The_Jurisdiction_Authority_can_Approve_Role_Of_User_which_Request_Status_Is_Proposed_To_Authority
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 52,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verify_The_Jurisdiction_Authority_can_Approve_Role_Of_User_which_Request_Status_Is_Proposed_To_Authority() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		//california registrar log in
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchPendingUserInPendingGridAndGoToUserDetailsPage();
		ref1.registrarApproveAndAssignJurisdictionUserRole();
		System.out.println("Registrar assign role from jurisdiction user role type successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar assign role from jurisdiction user role type successfully");
		ref.logout();
		//California Authority login and approve user
		ref1.LoginAsCaliforniaAuthority();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarViewUserUsingRequestStatusAsProposedToAuthorityFilterForPeningUserGrid();
		ref1.authorityApproveUser();
		System.out.println("Authority approve user successfully");
		ObjectRepo.test.log(Status.PASS, "Authority approve user successfully\"");
	}

	/*
	 *TC_Id         : C32300 RPM-541
	 *Tc_Title      : Verify_The_Jurisdiction_Authority_can_Deny_Role_Of_User_which_Request_Status_Is_Proposed_To_Authority
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 53,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verify_The_Jurisdiction_Authority_can_Deny_Role_Of_User_which_Request_Status_Is_Proposed_To_Authority() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		//california registrar log in
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchPendingUserInPendingGridAndGoToUserDetailsPage();
		ref1.registrarApproveAndAssignJurisdictionUserRole();
		System.out.println("Registrar assign role from jurisdiction user role type successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar assign role from jurisdiction user role type successfully");
		ref.logout();
		//California Authority login and denied user
		ref1.LoginAsCaliforniaAuthority();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarViewUserUsingRequestStatusAsProposedToAuthorityFilterForPeningUserGrid();
		ref1.authorityDeniedUser();
		System.out.println("Authority denied user successfully");
		ObjectRepo.test.log(Status.PASS, "Authority denied user successfully\"");
	}

	/*
	 *TC_Id         : C32301 RPM-541
	 *Tc_Title      : Verify_The_Jurisdiction_Authority_can_Approve_Role_Of_User_which_Request_Status_Is_Proposed_Role_Change
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 54,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verify_The_Jurisdiction_Authority_can_Approve_Role_Of_User_which_Request_Status_Is_Proposed_Role_Change() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		//california registrar log in
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchPendingUserInPendingGridAndGoToUserDetailsPage();
		ref1.registrarApproveAndAssignJurisdictionUserRole();
		System.out.println("Registrar assign role from jurisdiction user role type successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar assign role from jurisdiction user role type successfully");
		ref.logout();
		//California Authority login and approve user
		ref1.LoginAsCaliforniaAuthority();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarViewUserUsingRequestStatusAsProposedToAuthorityFilterForPeningUserGrid();
		ref1.authorityApproveUser();
		System.out.println("Authority approve user successfully");
		ObjectRepo.test.log(Status.PASS, "Authority approve user successfully");
		ref.logout();
		//California registrar login and change user role
		ref1.californiaRegistrar();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarChangeRoleFromJurisdictionUserRoleType();
		System.out.println("Registrar change user role successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar change user role successfully");
		ref.logout();
		//California authority login and approve change role of user
		ref1.LoginAsCaliforniaAuthority();
		MYC.resetPassphrasePrompt();
		ref1.registrarViewUserUsingRequestStatusAsProposedRoleChangeFilterForPeningUserGrid();
		ref1.authorityApproveProposedRoleChange();
		System.out.println("Authority approve user change role successfully");
		ObjectRepo.test.log(Status.PASS, "Authority approve user change role successfully");
	}

	/*
	 *TC_Id         : C32302 RPM-541
	 *Tc_Title      : Verify_The_Jurisdiction_Authority_can_Deny_Role_Of_User_which_Request_Status_Is_Proposed_Role_Change
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 55,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verify_The_Jurisdiction_Authority_can_Deny_Role_Of_User_which_Request_Status_Is_Proposed_Role_Change() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		//california registrar log in
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchPendingUserInPendingGridAndGoToUserDetailsPage();
		ref1.registrarApproveAndAssignJurisdictionUserRole();
		System.out.println("Registrar assign role from jurisdiction user role type successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar assign role from jurisdiction user role type successfully");
		ref.logout();
		//California Authority login and approve user
		ref1.LoginAsCaliforniaAuthority();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarViewUserUsingRequestStatusAsProposedToAuthorityFilterForPeningUserGrid();
		ref1.authorityApproveUser();
		System.out.println("Authority approve user successfully");
		ObjectRepo.test.log(Status.PASS, "Authority approve user successfully");
		ref.logout();
		//California registrar login and change user role
		ref1.californiaRegistrar();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarChangeRoleFromJurisdictionUserRoleType();
		System.out.println("Registrar change user role successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar change user role successfully");
		ref.logout();
		//California authority login and denied change role of user
		ref1.LoginAsCaliforniaAuthority();
		MYC.resetPassphrasePrompt();
		ref1.registrarViewUserUsingRequestStatusAsProposedRoleChangeFilterForPeningUserGrid();
		ref1.authorityDeniedRoleChange();
		System.out.println("Authority denied user change role successfully");
		ObjectRepo.test.log(Status.PASS, "Authority denied user change role successfully");
	}

	/*
	 *TC_Id         : C32303 RPM-541
	 *Tc_Title      : Verify_The_Jurisdiction_Authority_can_Request_Revision_Role_Of_User_which_Request_Status_Is_Proposed_To_Authority
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 56,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verify_The_Jurisdiction_Authority_can_Request_Revision_Role_Of_User_which_Request_Status_Is_Proposed_To_Authority() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		//california registrar log in
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchPendingUserInPendingGridAndGoToUserDetailsPage();
		ref1.registrarApproveAndAssignJurisdictionUserRole();
		System.out.println("Registrar assign role from jurisdiction user role type successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar assign role from jurisdiction user role type successfully");
		ref.logout();
		//California Authority login and approve user
		ref1.LoginAsCaliforniaAuthority();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarViewUserUsingRequestStatusAsProposedToAuthorityFilterForPeningUserGrid();
		ref1.authorityRequestRevisionToRegistrar();
		System.out.println("Authority raised request revision to user successfully");
		ObjectRepo.test.log(Status.PASS, "Authority raised request revision to user successfully");
		ref.logout();
		//California registrar log in and view status of user
		ref1.californiaRegistrar();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		String requestStatus=driver.findElement(By.xpath("(//div[contains(text(),'Jurisdiction Request Revisions')])[2]")).getText();
		System.out.println("Request Status after Authority request revision to user:"+requestStatus);
		Assert.assertEquals("Jurisdiction Request Revisions", requestStatus);
		ObjectRepo.test.log(Status.PASS, "Request Status after Authority request revision to user:"+requestStatus);
	}

	/*
	 *TC_Id         : C32304 RPM-541
	 *Tc_Title      : Verify_The_Jurisdiction_Authority_can_Request_Revision_Role_Of_User_which_Request_Status_Is_Proposed_Role_Change
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 57,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void Verify_The_Jurisdiction_Authority_can_Request_Revision_Role_Of_User_which_Request_Status_Is_Proposed_Role_Change() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectjurisdictionForCalifornia();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		//california registrar log in
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchPendingUserInPendingGridAndGoToUserDetailsPage();
		ref1.registrarApproveAndAssignJurisdictionUserRole();
		System.out.println("Registrar assign role from jurisdiction user role type successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar assign role from jurisdiction user role type successfully");
		ref.logout();
		//California Authority login and approve user
		ref1.LoginAsCaliforniaAuthority();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarViewUserUsingRequestStatusAsProposedToAuthorityFilterForPeningUserGrid();
		ref1.authorityApproveUser();
		System.out.println("Authority approve user successfully");
		ObjectRepo.test.log(Status.PASS, "Authority approve user  user successfully");
		ref.logout();
		//California registrar login and change user role
		ref1.californiaRegistrar();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarChangeRoleFromJurisdictionUserRoleType();
		System.out.println("Registrar change user role successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar change user role successfully");
		ref.logout();
		//California Authority login and request revision to registrar
		ref1.LoginAsCaliforniaAuthority();
		MYC.resetPassphrasePrompt();
		ref1.registrarViewUserUsingRequestStatusAsProposedRoleChangeFilterForPeningUserGrid();
		ref1.authorityRequestRevisionToRegistrar();
		System.out.println("Authority request revision to registrar successfully");
		ObjectRepo.test.log(Status.PASS, "Authority request revision to registrar successfully");
		ref.logout();
		//California registrar log in and view request revision user from authority
		ref1.californiaRegistrar();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(text(),'Jurisdiction Request Revisions')])[1]")));
		String jurisdictionReqRevisionText = driver.findElement(By.xpath("(//div[contains(text(),'Jurisdiction Request Revisions')])[1]")).getText();
		System.out.println("Text displyed on upper side when Registrar go to user details page:"+jurisdictionReqRevisionText);
		Assert.assertEquals("Jurisdiction Request Revisions", jurisdictionReqRevisionText);
		ObjectRepo.test.log(Status.PASS, "Text displyed on upper side when Registrar go to user details page:"+jurisdictionReqRevisionText);
		String commentForRequestRevisionByAuthority = driver.findElement(By.xpath("//*[@class='MuiTypography-root MuiTypography-body1 css-1js9zue']")).getText();
		System.out.println("Comment added by Authority for Request Revision:"+commentForRequestRevisionByAuthority);
		Assert.assertEquals("request revision by authority", commentForRequestRevisionByAuthority);
		ObjectRepo.test.log(Status.PASS, "Comment added by Authority for Request Revision:"+commentForRequestRevisionByAuthority);
	}

	/*
	 *TC_Id         : C29191 RPM-558
	 *Tc_Title      : Verificatio_Of_Send_Revision_Request_Multiple_Times_To_Applicant_For_Details_Changed_And_Submitted_By_The_Applicant
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 58,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verificatio_Of_Send_Revision_Request_Multiple_Times_To_Applicant_For_Details_Changed_And_Submitted_By_The_Applicant() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectjurisdictionForCalifornia();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		//california registrar log in raised revision request
		ref1.californiaRegistrar();   
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchPendingUserInPendingGridAndGoToUserDetailsPage();
		ref1.requestRevisionFunctionalityByRegistrar();
		System.out.println("Registrar raised revision request to user successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar raised revision request to user successfully");
		ref.logout();
		//user log in and submit revision request
		ref1.loginAsCreatedUser();
		ref1.californiaUserSubmitRevisionRequest();
		System.out.println("User submit revision request successfully");
		ObjectRepo.test.log(Status.PASS, "User submit revision request successfully");
		ref.logout();
		//california registrar log in and again raised revision request
		ref1.californiaRegistrar();    
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchPendingUserInPendingGridAndGoToUserDetailsPage();
		ref1.requestRevisionFunctionalityByRegistrar();
		System.out.println("Registrar raised revision request again to user successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar raised revision request again to user successfully");
	}

	/*
	 *TC_Id         : C29191 RPM-558
	 *Tc_Title      : Verificatio_Of_JU_Registrar_Is_Able_To_Send_Revision_Request_For_Same_Field_Again_To_The_Same_User_Registration
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 59,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verificatio_Of_JU_Registrar_Is_Able_To_Send_Revision_Request_For_Same_Field_Again_To_The_Same_User_Registration() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectjurisdictionForCalifornia();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		//california registrar log in raised revision request
		ref1.californiaRegistrar();     
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchPendingUserInPendingGridAndGoToUserDetailsPage();
		ref1.requestRevisionFunctionalityByRegistrar();
		System.out.println("Registrar raised revision request to user successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar raised revision request to user successfully");
		ref.logout();
		//user log in and submit revision request
		ref1.loginAsCreatedUser();
		ref1.userSubmitRevisionRequestForSameField();
		System.out.println("User submit revision request successfully");
		ObjectRepo.test.log(Status.PASS, "User submit revision request successfully");
		ref.logout();
		//california registrar log in and again raised revision request
		ref1.californiaRegistrar();     
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchPendingUserInPendingGridAndGoToUserDetailsPage();
		ref1.requestRevisionFunctionalityByRegistrar();
		System.out.println("Registrar raised revision request again to user successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar raised revision request again to user successfully");
	}

	/*
	 *TC_Id         : C27621 RPM-350
	 *Tc_Title      : Verificatio_Of_Retain_Data_Functionality_Until_The_Tab_Or_Window_Is_closed
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 60,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void Verificatio_Of_Retain_Data_Functionality_Until_The_Tab_Or_Window_Is_closed() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectjurisdictionForCalifornia();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Registration done successfully");
		ObjectRepo.test.log(Status.PASS, "User Registration done successfully");
	}

	/*
	 *TC_Id         : C27718 RPM-382
	 *Tc_Title      : Verification_of_accessibility_contact_us_link_for_public_Logged_in_user
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 61,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void Verification_of_accessibility_contact_us_link_for_public_Logged_in_user() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectjurisdictionForCalifornia();
		ref1.contactUsPageIsAccessibleForPublicUser();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Registration done successfully");
		ObjectRepo.test.log(Status.PASS, "User Registration done successfully");
		ref1.loginAsCreatedUser();
		MYC.resetPassphrasePrompt1();
		ref1.contactUsPageIsAccessibleForLoggedInUser();
	}

	/*
	 *TC_Id         : C27720 RPM-382
	 *Tc_Title      : Verify_the_Contact_Us_Inquiry_functionality_for_logged_in_user_with_valid_data
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 61,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void Verify_the_Contact_Us_Inquiry_functionality_for_logged_in_user_with_valid_data() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectjurisdictionForCalifornia();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Registration done successfully");
		ObjectRepo.test.log(Status.PASS, "User Registration done successfully");
		ref1.loginAsCreatedUser();
		MYC.resetPassphrasePrompt1();
		ref1.contactUsPageIsAccessibleForLoggedInUser();
		ref1.contactUsPageForLoggedInUserWithValidData();
		System.out.println("Valid data is accepted by field successfully");
		ObjectRepo.test.log(Status.PASS, "Valid data is accepted by field successfully");
	}

	/*
	 *TC_Id         : C27721 RPM-382
	 *Tc_Title      : Verify_the_Contact_Us_Inquiry_functionality_for_logged_in_user_with_invalid_data
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 62,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void Verify_the_Contact_Us_Inquiry_functionality_for_logged_in_user_with_invalid_data() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectjurisdictionForCalifornia();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Registration done successfully");
		ObjectRepo.test.log(Status.PASS, "User Registration done successfully");
		ref1.loginAsCreatedUser();
		MYC.resetPassphrasePrompt1();
		ref1.contactUsPageIsAccessibleForLoggedInUser();
		ref1.contactUsPageForLoggedInUserWithInValidData();
		System.out.println("Field wise error message is display for invalid data");
		ObjectRepo.test.log(Status.PASS, "Field wise error message is display for invalid data\"");
	}

	/*
	 *TC_Id         : C27722 RPM-382
	 *Tc_Title      : Verify_the_Contact_Us_Inquiry_functionality_for_logged_in_user_with_Empty_data
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 63,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verify_the_Contact_Us_Inquiry_functionality_for_logged_in_user_with_Empty_data() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectjurisdictionForCalifornia();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Registration done successfully");
		ObjectRepo.test.log(Status.PASS, "User Registration done successfully");
		ref1.loginAsCreatedUser();
		MYC.resetPassphrasePrompt1();
		ref1.contactUsPageIsAccessibleForLoggedInUser();
		ref1.contactUsPageForLoggedInUserWithEmptyData();
		System.out.println("Field wise error message is display for empty data");
		ObjectRepo.test.log(Status.PASS, "Field wise error message is display for empty data");
	}

	/*
	 *TC_Id         : C37694 RPM-382
	 *Tc_Title      : Verify_Discard_Functionality_on_Contact_Us_page
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 64,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verify_Discard_Functionality_on_Contact_Us_page() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectjurisdictionForCalifornia();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Registration done successfully");
		ObjectRepo.test.log(Status.PASS, "User Registration done successfully");
		ref1.loginAsCreatedUser();
		MYC.resetPassphrasePrompt1();
		ref1.contactUsPageIsAccessibleForLoggedInUser();
		ref1.discardButtonFunctionalityOnContactUsPage();
		System.out.println("Discard button functionality is working fine");
		ObjectRepo.test.log(Status.PASS, "Discard button functionality is working fine");
	}

	/*
	 *TC_Id        : C27723 RPM-382
	 *Tc_Title     : Verify_the_Contact_Us_Inquiry_functionality_for_Public_user_with_valid_data
	 *Author      : pravin.jogi@eqanim.com
	 */
	@Test(priority = 65,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verify_the_Contact_Us_Inquiry_functionality_for_Public_user_with_valid_data() throws InterruptedException {
		Homepage ref = new Homepage();
		ref.selectJurisdictionForQubec();
		ref.contactUsForNotLoggedInUser();
		System.out.println("Valid data is accepted by field successfully");
		ObjectRepo.test.log(Status.PASS, "Valid data is accepted by field successfully");
	}

	/*
	 *TC_Id         : C27823 RPM-380
	 *Tc_Title      : Verification_of_account_lockout_functionality_when_answer_to_3_security_questions_is_incorrect
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 66,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verification_of_account_lockout_functionality_when_answer_to_3_security_questions_is_incorrect() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectjurisdictionForCalifornia();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Registration done successfully");
		ObjectRepo.test.log(Status.PASS, "User Registration done successfully");
		ref1.runTimeloginAsCreatedUser();
		ref1.handleSecurityQuestionWithInvalidAnswersForCreatedUser();
		ref1.runTimeloginAsCreatedUser();
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']")));
		String errorMessage=driver.findElement(By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']")).getText();
		System.out.println("Error message for temporarily lockout user is:"+errorMessage);
		Assert.assertEquals("Invalid User ID and/or passphrase, or presently locked. Please check your emails, use the \"Forgot Password?\", or contact WCI-Inc. Registry support (link).", errorMessage);
		ObjectRepo.test.log(Status.PASS, "Error message for temporarily lockout user is:"+errorMessage);
		System.out.println("Above error message is displayed and user can not log in.");
		ObjectRepo.test.log(Status.PASS, "Above error message is displayed and user can not log in.");
	}

	/*
	 *TC_Id         : C27827 RPM-380
	 *Tc_Title      : Verification_of_answer_field_on_security_questions_popup_with_empty_data
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 68,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verification_of_answer_field_on_security_questions_popup_with_empty_data() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectjurisdictionForCalifornia();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Registration done successfully");
		ObjectRepo.test.log(Status.PASS, "User Registration done successfully");
		ref1.runTimeloginAsCreatedUser();
		ref1.handleSecurityQuestionWithEmptyDataInAnswersFieldForCreatedUser();
		System.out.println("Above error message is display for answer field");
		ObjectRepo.test.log(Status.PASS, "Above error message is display for answer field");
	}

	/*
	 *TC_Id         : C29251 RPM-381
	 *Tc_Title      : Verification_of_accessibility_of_forgot_passphrase_link_for_applicant
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 70,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verification_of_accessibility_of_forgot_passphrase_link_for_applicant() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectjurisdictionForCalifornia();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Registration done successfully");
		ObjectRepo.test.log(Status.PASS, "User Registration done successfully");
		ref1.accessibleForgotPassphrasePopup();
		System.out.println("Applicant User can accessible forgot passphrase popup");
		ObjectRepo.test.log(Status.PASS, "Applicant User can accessible forgot passphrase popup");
	}

	/*
	 *TC_Id          : C27638 RPM-383
	 *Tc_Title       : Verify_the_email_address_field_with_empty_data
	 *Functionality  : User Registration
	 *Author         : pravin.jogi@eqanim.com
	 */
	@Test(priority = 71,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verify_the_email_address_field_with_empty_data() throws InterruptedException {
		Homepage ref = new Homepage();
		ForgotUserIDAndPassphrasePOM ref1=new ForgotUserIDAndPassphrasePOM();
		ref.selectJurisdictionForQubec();
		ref1.forgotIdEmptyData(); 
	}

	/*
	 *TC_Id          : C32126 RPM-386
	 *Tc_Title       : Verification_of_applicant_can_login_And_download_the_registration_form
	 *Functionality  : User Registration
	 *Author         : pravin.jogi@eqanim.com
	 */
	@Test(priority = 72,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verification_of_applicant_can_login_And_download_the_registration_form() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectjurisdictionForCalifornia();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Registration done successfully");
		ObjectRepo.test.log(Status.PASS, "User Registration done successfully");
		ref1.loginAsCreatedUser();
		ref1.downloadThreeRegistrationForms();
	}

	/*
	 *TC_Id          : C32662 RPM-400
	 *Tc_Title       : Verification_of_select_jurisdiction_And_select_language_functionality_for_public_user_to_register_the_application
	 *Functionality  : User Registration
	 *Author         : pravin.jogi@eqanim.com
	 */
	@Test(priority = 73,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verification_of_select_jurisdiction_And_select_language_functionality_for_public_user_to_register_the_application() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.homePageDisplayedInSelectedjurisdictionAndLanguage();
		System.out.println("Home page is displayed as per selected jurisdiction and selected language");
		ObjectRepo.test.log(Status.PASS, "Home page is displayed as per selected jurisdiction and selected language");
	}

	/*
	 *TC_Id          : C32663 RPM-400
	 *Tc_Title       : Verification_of_display_registration_form_as_per_selected_jurisdiction
	 *Functionality  : User Registration
	 *Author         : pravin.jogi@eqanim.com
	 */
	@Test(priority = 74,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verification_of_display_registration_form_as_per_selected_jurisdiction() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.homePageDisplayedInSelectedjurisdictionAndLanguage();
		ur.selectJurisdictionStepAsPerSelecvtedJurisdictionAndLanguage();
		System.out.println("Personal information page is displayed as per selected jurisdiction and selected language");
		ObjectRepo.test.log(Status.PASS, "Personal information page is displayed as per selected jurisdiction and selected language");
	}

	/*
	 *TC_Id         : C27641 RPM-385/C29380 RPM-597
	 *Tc_Title      : Verification_of_application_status_post_login
	 *                Verification_of_view_reference_code_for_logged-in_user_with_pending_status  
	 *Functionality : User Registration              
	 *Author        : pravin.jogi@eqanim.com
	 */
	@Test(priority = 75,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verification_of_application_status_post_login() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MyPOMClass ref2=new MyPOMClass();
		ref.selectJurisdictionForQubec();
		//User Creation
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		//Created user login
		ref1.loginAsCreatedUser();
		ref.applicationStatusPostLogin();
	}

	/*
	 *TC_Id         : C26429,C26430 RPM-182 / C26436 RPM-184
	 *Tc_Title      : Verify_the_accessbility_of_forgot_user_id_link_on_login_section
	 *              : Verify_the_email_address_field_with_valid_data
	 *              : Verification of forgot user id success message functionality for valid data
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com
	 */
	@Test(priority = 76,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verify_the_accessbility_of_forgot_user_id_link_on_login_section() throws InterruptedException {
		Homepage ref = new Homepage();
		ForgotUserIDAndPassphrasePOM ref1=new ForgotUserIDAndPassphrasePOM();
		ref.selectJurisdictionForQubec();
		ref1.forgotUserIDLinkOnHomePageWithValidData(); 
	}
	/*
	 *TC_Id         : C27684,C27685 RPM-410 / C29011 RPM-335
	 *Tc_Title      : Verification_of_submit_registration_application_without_accepting_Terms_and_Conditions
	 *              : Verification_of_submit_registration_application_by_accepting_Terms_and_Conditions
	 *              : Verification_of_all_mandatory_fields_with_valid_data_on_Create_User_Log-In_page
	 *Functionality : User Registration            
	 *Author        : pravin.jogi@eqanim.com
	 */
	@Test(priority = 77,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_submit_registration_application_without_accepting_Terms_and_Conditions() throws Exception {
		Homepage ref = new Homepage();
		ForgotUserIDAndPassphrasePOM ref1=new ForgotUserIDAndPassphrasePOM();
		UserRegistration ur=new UserRegistration();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ur.personalInformation();
		ur.residenceAndMailing();
		ur.editAndReview();
		ref1.submitRegistrationApplicationAndTermsOfUseCheckBoxOnCreateLogInPage();
	}

	/*
	 *TC_Id         : C26431 RPM-182
	 *Tc_Title      : Verify the email address field with invalid data
	 *Functionality : User Registration 
	 *Author        : mayur.pachpute@eqanim.com
	 */

	@Test(priority = 78,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void VerifyTheEmailAddressFieldWithInvalidData() throws InterruptedException {
		Homepage ref = new Homepage();
		ForgotUserIDAndPassphrasePOM ref1=new ForgotUserIDAndPassphrasePOM();
		ref.selectJurisdictionForQubec();
		ref1.forgotIdInvalidData();
	}

	/*
	 *TC_Id         : C26432 RPM-182
	 *Tc_Title      : Verify the email address field with empty data
	 *Functionality : User Registration 
	 *Author        : mayur.pachpute@eqanim.com
	 */

	@Test(priority = 79,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void VerifyTheEmailAddressFieldWithEmptyData() throws InterruptedException {
		Homepage ref = new Homepage();
		ForgotUserIDAndPassphrasePOM ref1=new ForgotUserIDAndPassphrasePOM();
		ref.selectJurisdictionForQubec();
		ref1.forgotIdEmptyData();

	}

	/*
	 *TC_Id         : C26437 RPM-184
	 *Tc_Title      : Verification of forgot user id success message functionality for invalid data
	 *Functionality : User Registration 
	 *Author        : mayur.pachpute@eqanim.com
	 */

	@Test(priority = 80,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void SuccessMessageFunctionalityForInvalidData() throws InterruptedException {
		Homepage ref = new Homepage();
		ForgotUserIDAndPassphrasePOM ref1=new ForgotUserIDAndPassphrasePOM();
		ref.selectJurisdictionForQubec();
		ref1.forgotIdInvalidEmailData();
	}

	/*
	 *TC_Id          : C27834 RPM-399/C29308 RPM-591
	 *Tc_Title       : Verification of accessibility of Submit Required Documents step in user registration
	 *Tc_Title       : Verification of finish button functionality to submit the application.
	 **Functionality : User Registration 
	 *Author         : mayur.pachpute@eqanim.com
	 */

	@Test(priority = 81,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void VerificationOfAccessibilityOfSubmitRequiredDocumentsStepInUserRegistration() throws Exception {
		Homepage ref = new Homepage();
		ForgotUserIDAndPassphrasePOM ref1=new ForgotUserIDAndPassphrasePOM();
		UserRegistration ur=new UserRegistration();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ur.personalInformation();
		ur.residenceAndMailing();
		ur.editAndReview();
		ur.createUserLogin2();
		ref1.ValidateSubmitRequiredDocumentsAccessibilityOfSubmitRequiredDocuments();  
	}

	/*
	 *TC_Id        : C26438 RPM-185
	 *Tc_Title     : Verify_Unsuccessful_Login_Error_Message.
	 *Functionality: User Registration
	 *Author      : pravin.jogi@eqanim.com
	 */
	@Test(priority = 82,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verify_Unsuccessful_Login_Error_Message() throws InterruptedException {
		Homepage ref = new Homepage();
		ref.selectJurisdictionForQubec();
		ref.unsuccessfulLoginError();
	}

	/*
	 *TC_Id         : C27703 RPM-398
	 *Tc_Title      : Verification_of_last_successful_Login_date_and_Time_on_Welcome_Name_and_User_Profile
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com
	 */
	@Test(priority = 83,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verification_of_last_successful_Login_date_and_Time_on_Welcome_Name_and_User_Profile() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MyPOMClass ref2=new MyPOMClass();
		MYClass MYC = new MYClass();
		ref.selectJurisdictionForQubec();
		//User Creation
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		//Created user login
		ref1.loginAsCreatedUser();
		ref.logout();
		ref1.runTimeloginAsCreatedUser();
		MYC.resetPassphrasePrompt1();
		ref.displayLastLoginDateAndTimeAfterLogin();
	}

	/*
	 *TC_Id         : C27704 RPM-398
	 *Tc_Title      : Verification_of_replacement_of_new_successful_login_date_And_time_with_last_login
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com
	 */
	@Test(priority = 84,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verification_of_replacement_of_new_successful_login_date_And_time_with_last_login() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MyPOMClass ref2=new MyPOMClass();
		MYClass MYC = new MYClass();
		ref.selectJurisdictionForQubec();
		//User Creation
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		//Created user login
		ref1.loginAsCreatedUser();
		ref.logout();
		ref1.runTimeloginAsCreatedUser();
		MYC.resetPassphrasePrompt1();
		ref.displayLastLoginDateAndTimeAfterLogin();
		//ref.logout();
		ref1.runTimeloginAsCreatedUser();
		MYC.resetPassphrasePrompt1();
		ref.displayLastLoginDateAndTimeAfterLogin();
	}

	/*
	 *TC_Id         : C27699 RPM-397
	 *Tc_Title      : Verification_of_Accessibility_privacy_policy_and_terms_for_logged_in_User
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com
	 */
	@Test(priority = 85,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verification_of_Accessibility_privacy_policy_and_terms_for_logged_in_User() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		ref.selectJurisdictionForQubec();
		//User Creation
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		//Created user login
		ref1.loginAsCreatedUser();
		ref.accessibilityWCIIncTermsOfUseLinkAfterLogin();
	}

	/*
	 *TC_Id         : C27700 RPM-397
	 *Tc_Title      : Verification_of_Accessibility_privacy_policy_and_terms_for_not_logged_in_User
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com
	 */
	@Test(priority = 86,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verification_of_Accessibility_privacy_policy_and_terms_for_not_logged_in_User() throws InterruptedException {
		Homepage ref = new Homepage();
		ref.selectJurisdictionForQubec();
		ref.accessibilityWCIIncTermsOfUseLinkBeforeLogin();
	}

	/*
	 *TC_Id       : C27725 RPM-382
	 *Tc_Title    : Verify_the_Contact_Us_Inquiry_functionality_for_public_user_with_Empty_data
	 *Author      : pravin.jogi@eqanim.com
	 */
	@Test(priority = 87,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void Verify_the_Contact_Us_Inquiry_functionality_for_public_user_with_Empty_data() throws InterruptedException {
		Homepage ref = new Homepage();
		ref.selectjurisdictionForCalifornia();
		ref.contactUsForNotLoggedInUserWithEmptyData();
		System.out.println("Error message is displyed for above fields");
		ObjectRepo.test.log(Status.PASS, "Error message is displyed for above fields");
	}


	/*
	 *TC_Id       : C27726 RPM-382
	 *Tc_Title    : Verification_of_all_mandatory_fields_on_Contact_Us_page
	 *Author      : pravin.jogi@eqanim.com
	 */
	@Test(priority = 88,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verification_of_all_mandatory_fields_on_Contact_Us_page() throws InterruptedException {
		Homepage ref = new Homepage();
		PendingUser ref1=new PendingUser();
		ref.selectjurisdictionForCalifornia();
		ref.checkMandetoryFieldsOnContactUsPage();
		System.out.println("Above are all the mandetory fields to submit inquiry");
		ObjectRepo.test.log(Status.PASS, "Above are all the mandetory fields to submit inquiry");
	}

	/*
	 *TC_Id       : C37695 RPM-382
	 *Tc_Title    : Verify_the_Contact_Us_Inquiry_functionality_for_public_user_with_Invalid_data
	 *Author      : pravin.jogi@eqanim.com
	 */
	@Test(priority = 89,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void Verify_the_Contact_Us_Inquiry_functionality_for_public_user_with_Invalid_data() throws InterruptedException {
		Homepage ref = new Homepage();
		PendingUser ref1=new PendingUser();
		ref.selectjurisdictionForCalifornia();
		ref.contactUsPageForPublicUserWithInValidData();
		System.out.println("Error message is displyed for above fields");
		ObjectRepo.test.log(Status.PASS, "Error message is displyed for above fields");
	}

	/*
	 *TC_Id       : C27822 RPM-380
	 *Tc_Title    : Verification_of_log_in_functionality_with_incorrect_credential
	 *Author      : pravin.jogi@eqanim.com
	 */
	@Test(priority = 90,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verification_of_log_in_functionality_with_incorrect_credential() throws InterruptedException {
		Homepage ref = new Homepage();
		PendingUser ref1=new PendingUser();
		ref.selectjurisdictionForCalifornia();
		ref.loginWithValidUserIDAndInvalidPassphrase();
		System.out.println("Passphrase field not accept invalid data");
		ObjectRepo.test.log(Status.PASS, "Passphrase field not accept invalid data");
	}

	/*
	 *TC_Id       : C27821 RPM-380
	 *Tc_Title    : Verification_of_Log_in_Functionality_with_incorrect_answer_to_security_question
	 *Author      : pravin.jogi@eqanim.com
	 */
	@Test(priority = 91,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verification_of_Log_in_Functionality_with_incorrect_answer_to_security_question() throws InterruptedException {
		Homepage ref = new Homepage();
		PendingUser ref1=new PendingUser();
		UserRegistration ur=new UserRegistration();
		ref.selectjurisdictionForCalifornia();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		ref1.runTimeloginAsCreatedUser();
		ref.incorrectAnswerToSecurityQuestion();
		System.out.println("Second quetion is display after enter invalid answer for first question");
		ObjectRepo.test.log(Status.PASS, "Second quetion is display after enter invalid answer for first question");
	}

	/*
	 *TC_Id         : C27835 RPM-329
	 *Tc_Title      :Verification_of_display_accept_Terms_of_Use_option
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 92, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_display_accept_Terms_of_Use_option() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur = new UserRegistration();
		ref.selectjurisdictionForCalifornia();
		ur.selectJurisdictionStep();
		ur.personalInformation();
		ur.residenceAndMailing();
		ur.editAndReview();
		ur.createUserLoginCheckBoxValidation();

	}

	/*
	 *TC_Id         : C27836 RPM-329
	 *Tc_Title      : Verification_of_accessibility_of_accept_Terms_of_use_text_link
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 93, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_accessibility_of_accept_Terms_of_use_text_link() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur = new UserRegistration();
		ref.selectjurisdictionForCalifornia();
		ur.selectJurisdictionStep();
		ur.personalInformation();
		ur.residenceAndMailing();
		ur.editAndReview();
		ur.createUserLoginCheckBoxValidation();
		Boolean abc = driver.findElement(By.xpath("//a[text()='Terms of Use']")).isEnabled();
		Assert.assertTrue(abc);
		System.out.println("Terms of use link is present and user can access ");
		ObjectRepo.test.log(Status.PASS, "Terms of use link is present and user can access ");
	}

	/*
	 *TC_Id         : C27837 RPM-329
	 *Tc_Title      : Verification_of_submit_button_functionality_when_Terms_of_Use_are_accepted
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 94, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_submit_button_functionality_when_Terms_of_Use_are_accepted() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur = new UserRegistration();
		ref.selectjurisdictionForCalifornia();
		ur.selectJurisdictionStep();
		ur.personalInformation();
		ur.residenceAndMailing();
		ur.editAndReview();
		ur.createUserLoginCheckBoxValidation();
		Boolean abc = driver.findElement(By.xpath("//a[text()='Terms of Use']")).isEnabled();
		Assert.assertTrue(abc);
		System.out.println("Terms of use link is present and user can access ");
		ObjectRepo.test.log(Status.PASS, "Terms of use link is present and user can access ");
		WebElement element2 = driver.findElement(By.xpath("//button[text()='REGISTER']"));
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("arguments[0].click()", element2);
		Thread.sleep(4000);
		String avc = driver
				.findElement(By.xpath("//*[text()='A confirmation has been emailed to the address provided.']"))
				.getText();
		Assert.assertEquals(avc, "A confirmation has been emailed to the address provided.");
		System.out.println("A confirmation has been emailed to the address provided.");
		ObjectRepo.test.log(Status.PASS, "A confirmation has been emailed to the address provided.");
		System.out.println("New User Created Successfully.");
		ObjectRepo.test.log(Status.PASS, "New User Created Successfully.");
		System.out.println("Verified submit button functionality when 'Terms of Use' are accepted");
		ObjectRepo.test.log(Status.PASS, "Verified submit button functionality when 'Terms of Use' are accepted");
	}

	/*
	 *TC_Id         : C27838 RPM-329
	 *Tc_Title      : Verification_of_submit_button_functionality_when_Terms_of_Use_are_not_accepted
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 95, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_submit_button_functionality_when_Terms_of_Use_are_not_accepted() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur = new UserRegistration();
		ref.selectjurisdictionForCalifornia();
		ur.selectJurisdictionStep();
		ur.personalInformation();
		ur.residenceAndMailing();
		ur.editAndReview();
		ur.createUserLoginWithoutCheckBoxAccept();
		Boolean abc = driver.findElement(By.xpath("//button[text()='REGISTER']")).isEnabled();
		Assert.assertFalse(abc);
		System.out.println("Without accepting Terms of use checkbox user is not able to register");
		ObjectRepo.test.log(Status.PASS, "Without accepting Terms of use checkbox user is not able to register");
	}

	/*
	 *TC_Id         : C26405 RPM-197
	 *Tc_Title      : UI_Verification_of_Submit_Requirement_Documents_page
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 96, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void UI_Verification_of_Submit_Requirement_Documents_page() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur = new UserRegistration();
		ref.selectjurisdictionForCalifornia();
		ur.selectJurisdictionStep();
		ur.personalInformation();
		ur.residenceAndMailing();
		ur.editAndReview();
		ur.createUserLogin1();
		//		driver.findElement(By.xpath("(//*[@type='button'])[12]")).click();
		//String pageTitle = driver.findElement(By.xpath("//*[text()='2. Submit Required Documents']")).getText();
		//Assert.assertEquals(pageTitle, "2. Submit Required Documents");
		System.out.println("Landing to Submit Required Documents Page");
		ObjectRepo.test.log(Status.PASS, "Landing to Submit Required Documents Page");

		List<WebElement> formsAvail = driver.findElements(By.xpath("//*[contains(text(),'Form')]"));
		System.out.println("total form links available: ");
		for (int i = 0; i <= 6; i++) {
			String formName = formsAvail.get(i).getText();
			if (!(formName == null)) {
				System.out.println(formName);
			}

		}
		List<WebElement> btnAvail = driver.findElements(By.xpath("//button"));
		System.out.println("total buttons available on this page: ");
		for (int j = 0; j <= btnAvail.size() - 1; j++) {
			String btnNames = btnAvail.get(j).getText();
			if (!(btnNames == null)) {
				System.out.println(btnNames);
			}
		}
	}

	/*
	 *TC_Id         : C27718 RPM-382
	 *Tc_Title      : Verification of accessibility contact us link for
	 *Functionality : User Registration
	 *Author        : seema.sandbhor@eqanim.com
	 */
	@Test(priority = 97, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void accessibility_Contact_Us_link_for_logged_in_User() throws InterruptedException {
		Homepage ref = new Homepage();
		MyPOMClass contact = new MyPOMClass();
		ref.selectJurisdictionForQubec();
		contact.accessibility_Of_Contact_Us_link_for_logged_in_User();
	}

	/*
	 *TC_Id         : C27697 RPM-371
	 *Tc_Title      : Verification_oF_login_fail_error_message_for_empty_data
	 *Functionality : User Registration
	 *Author        : seema.sandbhor@eqanim.com
	 */
	@Test(priority = 98, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_oF_login_fail_error_message_for_empty_data() throws InterruptedException {
		Homepage ref = new Homepage();
		MyPOMClass contact = new MyPOMClass();
		ref.selectJurisdictionForQubec();
		contact.login_fail_error_message_for_empty_data();
	}

	/*
	 *TC_Id         : C26405 RPM-197
	 *Tc_Title      : UI Verification of Submit Requirement Documents page.
	 *Functionality : User Registration
	 *Author        : seema.sandbhor@eqanim.com
	 */
	@Test(priority = 99, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void ui_Verification_of_Submit_Requirement_Documents_page() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur = new UserRegistration();
		MyPOMClass reg = new MyPOMClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ur.personalInformation();
		ur.residenceAndMailing();
		ur.editAndReview();
		ur.createUserLogin();
	}

	/*
	 *TC_Id         : C27679 RPM-409
	 *Tc_Title      : Validation of security questions and answers with valid data.
	 *Functionality : User Registration  
	 *Author        : seema.sandbhor@eqanim.com
	 */
	@Test(priority = 100, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void security_questions_and_answers_with_valid_data() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur = new UserRegistration();
		MyPOMClass reg = new MyPOMClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ur.personalInformation();
		ur.residenceAndMailing();
		ur.editAndReview();
		ur.createUserLogin();
		//reg.securityQuestionsAnswers_ValidData();
	}

	/*
	 *TC_Id         : C27680 RPM-409
	 *Tc_Title      : Validation of security questions and answers with valid data.
	 *Functionality : User Registration  
	 *Author        : seema.sandbhor@eqanim.com
	 */
	@Test(priority = 101, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void security_questions_and_answers_with_Invalid_data() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur = new UserRegistration();
		MyPOMClass reg = new MyPOMClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ur.personalInformation();
		ur.residenceAndMailing();
		ur.editAndReview();
		reg.securityQuestionsAnswers_InvalidData();
	}

	/*
	 *TC_Id         : C27681 RPM-409
	 *Tc_Title      : Validation of security questions and answers with empty data. 
	 *Functionality : User Registration 
	 *Author        : seema.sandbhor@eqanim.com
	 */
	@Test(priority = 102, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void security_questions_and_answers_with_Empty_data() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur = new UserRegistration();
		MyPOMClass reg = new MyPOMClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ur.personalInformation();
		ur.residenceAndMailing();
		ur.editAndReview();
		reg.securityQuestionsAnswers_EmptyData();
	}

	/*
	 *TC_Id         : C27682 RPM-409
	 *Tc_Title      : Verify security questions field by selecting duplicate questions.
	 *Functionality : User Registration  
	 *Author        : seema.sandbhor@eqanim.com
	 */
	@Test(priority = 103, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void security_questions_field_by_selecting_dupliate_questions() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur = new UserRegistration();
		MyPOMClass reg = new MyPOMClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ur.personalInformation();
		ur.residenceAndMailing();
		ur.editAndReview();
		reg.duplicateSecurityQuestions();
	}

	/*
	 *TC_Id         : C27683 RPM-409
	 *Tc_Title      : Verify answer field by selecting duplicate answer.
	 *Functionality : User Registration  
	 *Author        : seema.sandbhor@eqanim.com
	 */
	@Test(priority = 104, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void answer_field_by_selecting_dupliate_answer() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur = new UserRegistration();
		MyPOMClass reg = new MyPOMClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ur.personalInformation();
		ur.residenceAndMailing();
		ur.editAndReview();
		reg.duplicateSecurityAnswers();
	}

	/*
	 *TC_Id         : C29077 RPM-533
	 *Tc_Title      : Verify comment field when the application is denied By Registrar
	 *Functionality : User Registration 
	 *Author        : seema.sandbhor@eqanim.com
	 */
	@Test(priority =105, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void commentFieldWhenApplicationDeniedByRegistrar() throws Exception
	{
		Homepage ref = new Homepage();
		UserRegistration ur = new UserRegistration();
		ref.selectjurisdictionForCalifornia();
		ur.selectJurisdictionStep();
		ur.personalInformation();
		ur.residenceAndMailing();
		ur.editAndReview();
		MyPOMClass reg = new MyPOMClass();
		reg.createLogin_referenceCode();
		MyPOMClass ref3 = new MyPOMClass();
		ref3.Login_with_Jurisdiction_Registrar();
		MYClass MYC = new MYClass();
		MYC.handlesecurityQuestion();
		MYC.resetPassphrasePrompt();
		reg.commentFieldWhenApplicationDeniedByRegistrar();
	}

	/*
	 *TC_Id         : C32636 RPM-533
	 *Tc_Title      : Verify comment field when the Application is Request Revisions by Registrar.
	 *Functionality : User Registration  
	 *Author        : seema.sandbhor@eqanim.com
	 */
	@Test(priority =106, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void commentFieldWhenApplicationIsRequestRevision() throws Exception
	{
		Homepage ref = new Homepage();
		UserRegistration ur = new UserRegistration();
		MYClass MYC = new MYClass();
		ref.selectjurisdictionForCalifornia();
		ur.selectJurisdictionStep();
		ur.personalInformation();
		ur.residenceAndMailing();
		ur.editAndReview();
		MyPOMClass reg = new MyPOMClass();
		reg.createLogin_referenceCode();
		MyPOMClass ref3 = new MyPOMClass();
		ref3.Login_with_Jurisdiction_Registrar();
		MYC.handlesecurityQuestion();
		MYC.resetPassphrasePrompt();
		reg.commentFieldWhenApplicationIsRequestRevisionByRegistrar();
	}

	/*
	 *TC_Id         : C27626 RPM-369
	 *Tc_Title      : validation_Of_User_Id_Field_With_Valid_Data.
	 *Functionality : User Registration
	 *Author       : pravin.jogi@eqanim.com
	 */
	@Test(priority = 107,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void validation_Of_User_Id_Field_With_Valid_Data() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		NewClass nc=new NewClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ur.personalInformation(); 
		ur.residenceAndMailing();
		ur.editAndReview();
		nc.userIdFieldWithValidDataOnCreateUserLoginPage();
		System.out.println("The data entered in user id field should be accepted");
		ObjectRepo.test.log(Status.PASS, "The data entered in user id field should be accepted");
	}

	/*
	 *TC_Id         : C27627 RPM-369/C27672 RPM-406
	 *Tc_Title      : Validation_Of_User_Id_Field_With_Invalid_Data.
	 *                Verification_of_user_id_field_with_Duplicate_User_Id
	 *Functionality : User Registration             
	 *Author        : pravin.jogi@eqanim.com
	 */
	@Test(priority = 108,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Validation_Of_User_Id_Field_With_Invalid_Data() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		NewClass nc=new NewClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ur.personalInformation();
		ur.residenceAndMailing();
		ur.editAndReview();
		nc.userIdFieldWithInValidDataOnCreateUserLoginPage();
		System.out.println("The invalid data entered in user id field should not be accepted");
		ObjectRepo.test.log(Status.PASS, "The invalid data entered in user id field should not be accepted");
	}

	/*
	 *TC_Id         : C27628 RPM-369
	 *Tc_Title      : Validation_Of_User_Id_Field_With_Empty_Data
	 *Functionality : User Registration
	 *Author       : pravin.jogi@eqanim.com
	 */
	@Test(priority = 109,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void validation_Of_User_Id_Field_With_Empty_Data() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		NewClass nc=new NewClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ur.personalInformation();
		ur.residenceAndMailing();
		ur.editAndReview();
		nc.userIDFieldWithEmptyDataOnCreateUserLoginPage();
		System.out.println("The invalid data entered in user id field should not be accepted");
		ObjectRepo.test.log(Status.PASS, "The invalid data entered in user id field should not be accepted");
	}

	/*
	 *TC_Id         : C27669 RPM-405/C27630 RPM-369
	 *Tc_Title      : verify_The_Passphrase_Field_With_Valid_Data
	 *                Validation_Of_Passphrase_Field_With_Valid_Data.
	 *Functionality : User Registration              
	 *Author        : pravin.jogi@eqanim.com
	 */
	@Test(priority = 110,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verify_The_Passphrase_Field_With_Valid_Data() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		NewClass nc=new NewClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ur.personalInformation();
		ur.residenceAndMailing();
		ur.editAndReview();
		nc.passphraseFieldWithValidDataOnCreateUserLoginPage();
		System.out.println("Entered passphrase and confirm passphrase should be accepted.");
		ObjectRepo.test.log(Status.PASS, "Entered passphrase and confirm passphrase should be accepted.");
	}

	/*
	 *TC_Id         : C27670 RPM-405/C27631 RPM-369
	 *Tc_Title      : Verify_The_Passphrase_Criteria_For_Invalid_Data
	 *                Validation_Of_Passphrase_Field_With_Invalid_Data.
	 *Functionality : User Registration             
	 *Author        : pravin.jogi@eqanim.com
	 */
	@Test(priority = 111,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verify_The_Passphrase_Criteria_For_Invalid_Data() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		NewClass nc=new NewClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ur.personalInformation();
		ur.residenceAndMailing();
		ur.editAndReview();
		nc.passphraseFieldWithInvalidDataOnCreateUserLoginPage();
		System.out.println("Entered passphrase should not be accepted");
		ObjectRepo.test.log(Status.PASS, "Entered passphrase should not be accepted");
	}

	/*
	 *TC_Id         : C27705 RPM-405/C27632 RPM-369
	 *Tc_Title      : Verify_The_Passphrase_Field_With_Empty_Data
	 *                Validation_Of_Passphrase_Field_With_Empty_Data.
	 *Functionality : User Registration             
	 *Author        : pravin.jogi@eqanim.com
	 */
	@Test(priority = 112,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verify_The_Passphrase_Field_With_Empty_Data() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		NewClass nc=new NewClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ur.personalInformation();
		ur.residenceAndMailing();
		ur.editAndReview();
		nc.passphraseFieldWithEmptyDataOnCreateUserLoginPage();
		System.out.println("Entered passphrase should not be accepted");
		ObjectRepo.test.log(Status.PASS, "Entered passphrase should not be accepted");
	}

	/*
	 *TC_Id         : C27673 RPM-407
	 *Tc_Title      : Verification_Of_Email_Address_Field_With_Valid_Data
	 *Functionality : User Registration 
	 *Author        : pravin.jogi@eqanim.com
	 */
	@Test(priority = 113,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verification_Of_Email_Address_Field_With_Valid_Data() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		NewClass nc=new NewClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		nc.emailAddressFieldWithValidData();
		System.out.println("Entered data in email and confirm email field should be accepted");
		ObjectRepo.test.log(Status.PASS, "Entered data in email and confirm email field should be accepted");
	}

	/*
	 *TC_Id         : C27674 RPM-407/C27677 RPM-408
	 *Tc_Title      : Verification_Of_Email_Address_Field_With_Invalid_Data
	 *Functionality : User Registration 
	 *Author        : pravin.jogi@eqanim.com
	 */
	@Test(priority = 114,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_Of_Email_Address_Field_With_Invalid_Data() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		NewClass nc=new NewClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		nc.emailAddressFieldWithInvalidData();
		System.out.println("Entered data in email and confirm email field should not be accepted");
		ObjectRepo.test.log(Status.PASS, "Entered data in email and confirm email field should not be accepted");
	}

	/*
	 *TC_Id         : C27675 RPM-408/C27629 RPM-369
	 *Tc_Title      : Verification_Of_User_Id_Field_Display_Message_For_Existing_User_Id
	 *                Validation_Of_User_Id_Field_With_User_ID_Which_Is_Already_Exist_In_The_System .
	 *Functionality : User Registration              
	 *Author        : pravin.jogi@eqanim.com
	 */
	@Test(priority = 115,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_Of_User_Id_Field_Display_Message_For_Existing_User_Id() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		NewClass nc=new NewClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ur.personalInformation();
		ur.residenceAndMailing();
		ur.editAndReview();
		nc.userIdFieldWithExistingUserIDUse();
		System.out.println("Entered data in user ID field should not be accepted");
		ObjectRepo.test.log(Status.PASS, "Entered data in user ID field should not be accepted");
	}

	/*
	 *TC_Id         : C27833 RPM-399
	 *Tc_Title      : Verification_Of_Accessibility_Of_Create_User_LogIn_Step_In_User_Registration
	 *Functionality : User Registration 
	 *Author        : pravin.jogi@eqanim.com
	 */
	@Test(priority = 116,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verification_Of_Accessibility_Of_Create_User_LogIn_Step_In_User_Registration() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		NewClass nc=new NewClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ur.personalInformation();
		ur.residenceAndMailing();
		ur.editAndReview();
		System.out.println("The create user log in step page should be opened.");
		ObjectRepo.test.log(Status.PASS, "The create user log in step page should be opened.");
	}

	/*
	 *TC_Id         : C27624 RPM-351
	 *Tc_Title      : Verification_Of_Retain_Data_Functionality_When_Tab_Or_Window_Is_Closed
	 *Functionality : User Registration 
	 *Author        : pravin.jogi@eqanim.com
	 */
	@Test(priority = 117,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verification_Of_Retain_Data_Functionality_When_Tab_Or_Window_Is_Closed() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		NewClass nc=new NewClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ur.personalInformation();
		ur.residenceAndMailing();
		ur.editAndReview();
		nc.retainDataFunctionalityWhenTabOrWindowClosed();
		ur.selJuriStepPage();
		System.out.println("The previously entered data should be removed and New Registration form should be displayed");
		ObjectRepo.test.log(Status.PASS, "The previously entered data should be removed and New Registration form should be displayed");
	}

	/*
	 *TC_Id         : C27623 RPM-351
	 *Tc_Title      : Verification_Of_Retain_Data_Functionality_Until_Tab_Or_Window_Is_Closed
	 *Functionality : User Registration 
	 *Author        : pravin.jogi@eqanim.com
	 */
	@Test(priority = 118,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verification_Of_Retain_Data_Functionality_Until_Tab_Or_Window_Is_Closed() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		NewClass nc=new NewClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ur.personalInformation();
		ur.residenceAndMailing();
		ur.editAndReview();
		nc.retainDataFunctionalityUntilTabOrWindowClosed();
		System.out.println("The entered data should get retained until the tab or window closed");
		ObjectRepo.test.log(Status.PASS, "The entered data should get retained until the tab or window closed");
	}

	/*
	 *TC_Id         : C27616 RPM-336
	 *Tc_Title      : Verification_Of_Reenter_Passphrase_Functionality_Of_Create_User_Login_Page
	 *Functionality : User Registration 
	 *Author        : pravin.jogi@eqanim.com
	 */
	@Test(priority = 119,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verification_Of_Reenter_Passphrase_Functionality_Of_Create_User_Login_Page() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		NewClass nc=new NewClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ur.personalInformation();
		ur.residenceAndMailing();
		ur.editAndReview();
		nc.reEnterPassphraseFunctionality();
	}

	/*
	 *TC_Id         : C29003 RPM-335
	 *Tc_Title      : Verification_of_all_mandatory_fields_with_invalid_data_on_personal_Information_page
	 *Functionality : User Registration 
	 *Author        : pravin.jogi@eqanim.com
	 */
	@Test(priority = 120,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_all_mandatory_fields_with_invalid_data_on_personal_Information_page() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		NewClass nc=new NewClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		nc.verifictionOfMandetoryFieldWithInvalidDataOnPersonalInformation();	
	}

	/*
	 *TC_Id         : C29006 RPM-335
	 *Tc_Title      : Verification_of_all_mandatory_fields_with_invalid_data_on_Residence_And_Mailing_page
	 *Functionality : User Registration 
	 *Author        : pravin.jogi@eqanim.com
	 */
	@Test(priority = 121,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verification_of_all_mandatory_fields_with_invalid_data_on_Residence_And_Mailing_page() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		NewClass nc=new NewClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ur.personalInformation();
		nc.verifictionOfMandetoryFieldWithInvalidDataOnResidenceAndMailing();
	}

	/*
	 *TC_Id         : C29012 RPM-335
	 *Tc_Title      : Verification_of_all_mandatory_fields_with_invalid_data_on_Create_User_LogIn_page
	 *Functionality : User Registration 
	 *Author        : pravin.jogi@eqanim.com
	 */
	@Test(priority = 122,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verification_of_all_mandatory_fields_with_invalid_data_on_Create_User_LogIn_page() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		NewClass nc=new NewClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ur.personalInformation();
		ur.residenceAndMailing();
		ur.editAndReview();
		nc.verifictionOfMandetoryFieldWithInvalidDataOnCreateUserLogin();
	}

	/*
	 *TC_Id         : C29009 RPM-335
	 *Tc_Title      : Verification_of_all_mandatory_fields_with_invalid_data_on_Edit_and_Review_page
	 *Functionality : User Registration 
	 *Author        : pravin.jogi@eqanim.com
	 */
	@Test(priority = 123,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verification_of_all_mandatory_fields_with_invalid_data_on_Edit_and_Review_page() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		NewClass nc=new NewClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ur.personalInformation();
		ur.residenceAndMailing();
		nc.editAndReviewStepMandetoryFieldsWithInvalidData();
	}

	/* 
	 *TC_Id         : C29010 RPM-335/C27659 RPM-402
	 *Tc_Title      : Verification_of_mandatory_fields_with_Empty_data_on_Edit_and_Review_page
	 *                Verification_of_all_required_fields_on_edit_and_review_page
	 *Functionality : User Registration              
	 *Author        : pravin.jogi@eqanim.com
	 */
	@Test(priority = 124,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verification_of_mandatory_fields_with_Empty_data_on_Edit_and_Review_page() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		NewClass nc=new NewClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ur.personalInformation();
		ur.residenceAndMailing();
		nc.editAndReviewStepMandetoryFieldsWithEmptyData();
	}

	/*
	 *TC_Id          : C27761 RPM-177
	 *Tc_Title       : Verify the accessbility of forgot passphrase link on login section
	 *Functionality  : User Registration
	 *Author         : swati.jagdale@eqanim.com
	 */
	@Test(priority = 125, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verify_the_accessbility_of_forgot_passphrase_link_on_login_section() throws Exception {
		Homepage ref = new Homepage();
		MYClass MYC = new MYClass();
		ref.selectjurisdictionForCalifornia();
		MYC.UIForForgotPassphrase();
	}

	/*
	 *TC_Id          : C27762 RPM-177
	 *Tc_Title       : Verification of forgot passphrase functionality with valid data
	 *Functionality  : User Registration
	 *Author         : swati.jagdale@eqanim.com
	 */
	@Test(priority = 126, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_forgot_passphrase_functionality_with_valid_data() throws Exception {
		Homepage ref = new Homepage();
		MYClass MYC = new MYClass();
		ref.selectjurisdictionForCalifornia();
		MYC.forgotPassphrasevalidData();
	}

	/*
	 *TC_Id          : C27763 RPM-177
	 *Tc_Title       : Verification_of_forgot_passphrase_functionality_with_invalid_data
	 *Functionality  : User Registration
	 *Author         : swati.jagdale@eqanim.com
	 */
	@Test(priority = 127, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_forgot_passphrase_functionality_with_invalid_data() throws Exception {
		Homepage ref = new Homepage();
		MYClass MYC = new MYClass();
		ref.selectjurisdictionForCalifornia();
		MYC.forgotPassphraseinvalidData();
	}

	/*
	 *TC_Id          : C27764 RPM-177
	 *Tc_Title       : Verification_of_forgot_passphrase_functionality_with_Empty_data
	 *Functionality  : User Registration
	 *Author         : swati.jagdale@eqanim.com
	 */
	@Test(priority = 128, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_forgot_passphrase_functionality_with_Empty_data() throws Exception {
		Homepage ref = new Homepage();
		MYClass MYC = new MYClass();
		ref.selectjurisdictionForCalifornia();
		MYC.forgotPassphraseEmptyData();
	}

	/*
	 *TC_Id          : C29207 RPM-555
	 *Tc_Title       :Verify_the_Jurisdiction_Authority_can_view_the_details_of_any_user_with_Proposed_to_Authority_status
	 *Functionality  : User Registration
	 *Author         : swati.jagdale@eqanim.com
	 */
	@Test(priority = 129, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verify_the_Jurisdiction_Authority_can_view_the_details_of_any_user_with_Proposed_to_Authority_status()
			throws Exception {
		// User Registration
		Homepage ref = new Homepage();
		MYClass MYC = new MYClass();
		ref.selectjurisdictionForCalifornia();
		MYC.selectJurisdictionStep();
		MYC.personalInformation();
		MYC.residenceAndMailing();
		MYC.editAndReview();
		MYC.createUserLogin();
		// Login_with_Jurisdiction_Registrar//Assign role
		MyPOMClass ref3 = new MyPOMClass();
		ref3.Login_with_Jurisdiction_Registrar();
		MYC.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		MYC.assignRoleToNewUser();
		ref.logout();
		// Login_with_Jurisdiction_Authority
		ref3.Login_with_Jurisdiction_Authority();
		MYC.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		MYC.searchuserInPending();
		MYC.ViewDetails_Foruser_ProposedtoAuthority();
	}

	/*
	 *TC_Id          : C29211 RPM-555
	 *Tc_Title       :Verify_that_JA_cannot_view_user_details_of_users_of_other_jurisdiction
	 *Functionality  : User Registration
	 *Author         : swati.jagdale@eqanim.com
	 */
	@Test(priority = 130, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verify_that_JA_cannot_view_user_details_of_users_of_other_jurisdiction() throws Exception {
		// User Registration
		Homepage ref = new Homepage();
		MYClass MYC = new MYClass();
		ref.selectjurisdictionForCalifornia();
		MYC.selectJurisdictionStep();
		MYC.personalInformation();
		MYC.residenceAndMailing();
		MYC.editAndReview();
		MYC.createUserLogin();
		// Login_with_Jurisdiction_Registrar//Assign role
		MyPOMClass ref3 = new MyPOMClass();
		ref3.Login_with_Jurisdiction_Registrar();
		MYC.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		MYC.assignRoleToNewUser();
		ref.logout();
		// Login_with_Jurisdiction_Authority
		MYC.Login_with_QAJurisdiction_Authority();
		MYC.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		MYC.searchuserInPending();

		List<WebElement> elements = driver.findElements(By.xpath(
				"//p[text()='Pending Requests']/parent::div/parent::div/following-sibling::div//*[div[contains(@class,'MuiDataGrid-virtualScrollerContent')]]//div[contains(@class,'MuiDataGrid-row')]"));
		System.out.println("Number of elements:" + elements.size());
		if (elements.size() > 0) {
			System.out.println("Searched User is Registered with logged in Jurisdiction");
		} else {
			System.out.println("Searched User is Registered with other Jurisdiction");
			System.out.println("JA cannot view user details of users of other jurisdiction.");
			ObjectRepo.test.log(Status.PASS, "JA cannot view user details of users of other jurisdiction.");
		}

	}

	/*
	 *TC_Id          : C29209 RPM-555
	 *Tc_Title       :Verify_that_the_Jurisdiction_Authority_can_view_the_details_of_users_who_are_in_their_Jurisdiction_only
	 *Functionality  : User Registration
	 *Author         : swati.jagdale@eqanim.com
	 */
	@Test(priority = 131, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verify_that_the_Jurisdiction_Authority_can_view_the_details_of_users_who_are_in_their_Jurisdiction_only()
			throws Exception {
		// Login_with_Jurisdiction_Authority
		Homepage ref = new Homepage();
		MYClass MYC = new MYClass();
		MyPOMClass ref3 = new MyPOMClass();
		ref.selectjurisdictionForCalifornia();
		ref3.Login_with_Jurisdiction_Authority();
		MYC.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		MYC.ViewDetails_For_RegisterdUser();
	}

	/*
	 *TC_Id          : C29062 RPM-527
	 *Tc_Title       :Verification_of_Jurisdiction_User_can_select_and_view_the_details_of_any_pending_user_registration_application
	 *Functionality  : User Registration
	 *Author         : swati.jagdale@eqanim.com
	 */
	@Test(priority = 132, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_Jurisdiction_User_can_select_and_view_the_details_of_any_pending_user_registration_application()
			throws Exception {

		Homepage ref = new Homepage();
		MYClass MYC = new MYClass();
		ref.selectjurisdictionForCalifornia();
		// Login_with_Jurisdiction_Registrar//Assign role
		MyPOMClass ref3 = new MyPOMClass();
		ref3.Login_with_Jurisdiction_Registrar();
		MYC.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		MYC.ViewDetails_For_PendingdUser();
	}

	/*
	 * TC_Id         : C29100 and C32074/RPM-547 
	 * Tc_Title      : Verification of cancel button functionality of user details page/Verification of Cancel button on 'Warning' popup of User details page. 
	 * Functionality : User Registration
	 * Author        : swati.jagdale@eqanim.com
	 */
	@Test(priority = 133, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verfication_of_cancel_button_functionality_of_user_details_page() throws Exception {
		Homepage ref = new Homepage();
		MyPOMClass ref3 = new MyPOMClass();
		MYClass MYC = new MYClass();
		// User create
		ref.selectjurisdictionForCalifornia();
		MYC.selectJurisdictionStep();
		MYC.personalInformation();
		MYC.residenceAndMailing();
		MYC.editAndReview();
		MYC.createUserLogin();
		// Login_with_Jurisdiction_Registrar//Assign role
		ref3.Login_with_Jurisdiction_Registrar();
		MYC.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		MYC.AssignRole_to_User_other_than_JU();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		MYC.Cancel_button_functinality();
		MYC.Editdata_Cancel_button_functinality();
	}

	/*
	 * TC_Id         : C32750/RPM-345
	 * Tc_Title      : Verification of user registration copy removal from the profile after approval of the User. 
	 * Functionality : User Registration
	 * Author        : swati.jagdale@eqanim.com
	 */
	@Test(priority = 134, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_user_registration_copy_removal_from_the_profile_after_approval_of_the_User()
			throws Exception {
		// User Registration
		Homepage ref = new Homepage();
		MYClass MYC = new MYClass();
		ref.selectjurisdictionForCalifornia();
		MYC.selectJurisdictionStep();
		MYC.personalInformation();
		MYC.residenceAndMailing();
		MYC.editAndReview();
		MYC.createUserLogin();
		// Login_with_Jurisdiction_Registrar//Assign role
		MyPOMClass ref3 = new MyPOMClass();
		ref3.Login_with_Jurisdiction_Registrar();
		MYC.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		MYC.AssignRole_to_User_other_than_JU();
		ref.logout();
		MYC.runtime_Login_with_Approved_User();
		MYC.handlesecurityQuestion();
		MYC.resetPassphrasePrompt1();
		Thread.sleep(3000);
		MYC.Form_functinality();
	}

	/*
	 * TC_Id          : C27696/RPM-371(C27698 duplicate) 
	 * Tc_Title       : Verification of Login fail error message for invalid data
	 * Functionality  : User Registration
	 * Author         : swati.jagdale@eqanim.com
	 */
	@Test(priority = 135, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Error_message_LoginFail() throws Exception {

		Homepage ref = new Homepage();
		MYClass MYC = new MYClass();
		ref.selectjurisdictionForCalifornia();
		MYC.loginAsApprovedUser_InvalidUserID();
	}

	/*
	 * TC_Id          : C27697/RPM-371 
	 * Tc_Title       : Verification of Login fail error message for empty data 
	 * Functionality  : User Registration
	 * Author         : swati.jagdale@eqanim.com
	 */
	@Test(priority = 136, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void LoginFail_EmptyData() throws Exception {
		Homepage ref = new Homepage();
		MYClass MYC = new MYClass();
		ref.selectjurisdictionForCalifornia();
		MYC.loginfail_EmptyData();
	}

	/*
	 * TC_Id          : C29086/C29087 /RPM-538 
	 * Tc_Title       : Verification of assigning multiple roles from same role type during the user registration approval process and  Verification of if registrar cancels to confirm the prompt 
	 * Functionality  : User Registration
	 * Author         :swati.jagdale@eqanim.com
	 */
	@Test(priority = 137, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_assigning_multiple_roles_from_same_role_type_during_the_user_registration_approval_process()
			throws Exception {
		// User Registration
		Homepage ref = new Homepage();
		UserRegistration ur = new UserRegistration();
		MYClass MYC = new MYClass();
		ref.selectjurisdictionForCalifornia();
		MYC.selectJurisdictionStep();
		MYC.personalInformation();
		MYC.residenceAndMailing();
		MYC.editAndReview();
		MYC.createUserLogin();
		// Login_with_Jurisdiction_Registrar//Assign role
		MyPOMClass ref3 = new MyPOMClass();
		ref3.Login_with_Jurisdiction_Registrar();
		MYC.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		MYC.AssignmultipleRole_to_User_other_than_JU();
	}

	/*
	 * TC_Id          : C29088/RPM-538
	 * Tc_Title       : Verification of assigning multiple roles from different role types during the approval process....pending 
	 * Functionality  : User Registration
	 * Author         :swati.jagdale@eqanim.com
	 */
	@Test(priority = 138, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_assigning_multiple_roles_from_different_role_type() throws Exception {
		// User Registration
		Homepage ref = new Homepage();
		UserRegistration ur = new UserRegistration();
		MYClass MYC = new MYClass();
		ref.selectjurisdictionForCalifornia();
		MYC.selectJurisdictionStep();
		MYC.personalInformation();
		MYC.residenceAndMailing();
		MYC.editAndReview();
		MYC.createUserLogin();
		// Login_with_Jurisdiction_Registrar//Assign role
		MyPOMClass ref3 = new MyPOMClass();
		ref3.Login_with_Jurisdiction_Registrar();
		MYC.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		MYC.AssignmultipleRole_InmultipleRoleType_to_User();
	}

	/*
	 * TC_Id          : C29014/C29374/RPM-353 
	 * Tc_Title       : Verification of Cancel button functionality in Cancel registration Tc_Title : Verification of initiate cancel registration functionality with pending application status 
	 * Functionality  : User Registration
	 * Author         : swati.jagdale@eqanim.com
	 */
	@Test(priority = 139, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_Cancel_button_functionality() throws Exception {
		// User Registration
		Homepage ref = new Homepage();
		UserRegistration ur = new UserRegistration();
		MYClass MYC = new MYClass();
		ref.selectjurisdictionForCalifornia();
		MYC.selectJurisdictionStep();
		MYC.personalInformation();
		MYC.residenceAndMailing();
		MYC.editAndReview();
		MYC.createUserLogin();
		// Pending User
		MYC.runtime_Login_with_Pending_User();
		MYC.handlesecurityQuestion();
		MYC.resetPassphrasePrompt1();
		Thread.sleep(3000);
		String message2 = driver.findElement(By.xpath("//div[text()='Registration Application Status:']")).getText();
		System.out.println("" + message2);
		Thread.sleep(1000);
		MYC.CancelRegistration();
		//driver.findElement(By.xpath("//button[text()='CANCEL']")).click();
		System.out.println("User Registration Not Cancelled");
		// Pending user cancel registration
		//MYC.CancelRegistration_PendingUser();
		MYC.runtime_Login_with_closed_User();
		//MYC.resetPassphrasePrompt1();
		Thread.sleep(3000);
		String element9 = driver.findElement(By.xpath("//p[text()='User ID or passphrase entered is invalid']"))
				.getText();
		System.out.println("Error Message :" + element9);
		ObjectRepo.test.log(Status.PASS, "User ID or passphrase entered is invalid");
		System.out.println("User Registration Cancelled");

	}

	/*
	 * TC_Id          : C29375/RPM-353 
	 * Tc_Title       : Verification of initiate cancel registration functionality with request revision application status 
	 * Functionality  : User Registration
	 * Author         :swati.jagdale@eqanim.com
	 */
	@Test(priority = 140, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_initiate_cancel_registration_functionality_with_request_revision_application_status()
			throws Exception {
		// User Registration
		Homepage ref = new Homepage();
		UserRegistration ur = new UserRegistration();
		MYClass MYC = new MYClass();
		MyPOMClass ref3 = new MyPOMClass();
		ref.selectjurisdictionForCalifornia();
		MYC.selectJurisdictionStep();
		MYC.personalInformation();
		MYC.residenceAndMailing();
		MYC.editAndReview();
		MYC.createUserLogin();
		// Login_with_Jurisdiction_Registrar//Assign role
		ref3.Login_with_Jurisdiction_Registrar();
		MYC.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		MYC.RevisionRequestFromRegistrar();
		ref.logout();
		// login user
		MYC.runtime_Login_with_Pending_User();
		MYC.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt1();
		String message3 = driver.findElement(By.xpath("//div[text()='Registration Application Status:']")).getText();
		System.out.println(" " + message3);
		ObjectRepo.test.log(Status.PASS, message3);
		MYC.CancelRegistration();
		MYC.runtime_Login_with_closed_User();
		//MYC.resetPassphrasePrompt1();
		Thread.sleep(3000);
		String element9 = driver.findElement(By.xpath("//p[text()='User ID or passphrase entered is invalid']"))
				.getText();
		System.out.println("Error Message :" + element9);
		ObjectRepo.test.log(Status.PASS, "User ID or passphrase entered is invalid");
		System.out.println("User Registration Cancelled");
	}

	/*
	 * TC_Id          : C29376/RPM-353 
	 * Tc_Title       : Verification of initiate cancel registration functionality with Approved application status
	 * Functionality  : User Registration
	 * Author         :swati.jagdale@eqanim.com
	 */
	@Test(priority = 141, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_initiate_cancel_registration_functionality_with_Approved_application_status()
			throws Exception {
		// User Registration
		Homepage ref = new Homepage();
		UserRegistration ur = new UserRegistration();
		MYClass MYC = new MYClass();
		MyPOMClass ref3 = new MyPOMClass();
		ref.selectjurisdictionForCalifornia();
		MYC.selectJurisdictionStep();
		MYC.personalInformation();
		MYC.residenceAndMailing();
		MYC.editAndReview();
		MYC.createUserLogin();
		// Login_with_Jurisdiction_Registrar//Assign role
		ref3.Login_with_Jurisdiction_Registrar();
		MYC.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		MYC.AssignRole_to_User_other_than_JU();
		ref.logout();
		// Login_with_ApprovedUser
		MYC.runtime_Login_with_Approved_User();
		MYC.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt1();
		String message3 = driver.findElement(By.xpath("//div[text()='[APPROVED USER - LOGGED-IN HOME PAGE]']"))
				.getText();
		System.out.println("User Status" + message3);
		ObjectRepo.test.log(Status.PASS, message3);
		MYC.CancelRegistration_ApprovedUser();
	}

	/*
	 * TC_Id          : C32142/RPM-342  C27800/RPM387
	 * Tc_Title       : Verification of User profile details access to applicant user.
	 * Tc_Title       : Verification of User profile details Access to the the logged in User
	 * Functionality  : User Registration
	 * Author         :swati.jagdale@eqanim.com
	 */
	@Test(priority = 142, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_User_profile_details_access_to_applicant_user()
			throws Exception {
		// User Registration 
		Homepage ref = new Homepage();
		MYClass MYC = new MYClass();
		ref.selectjurisdictionForCalifornia();
		MYC.selectJurisdictionStep();
		MYC.personalInformation(); 
		MYC.residenceAndMailing(); 
		MYC.editAndReview();
		MYC.createUserLogin();
		//Login to approved user
		MYC.runtime_Login_with_Pending_User();
		MYC.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt1();
		MYC.ViewUserDetails_functinality();	  
	}

	/*
	 * TC_Id          : C32143/RPM-342
	 * Tc_Title       : Verification of User registration form print or download functionality
	 * Functionality  : User Registration
	 * Author         :swati.jagdale@eqanim.com
	 */
	@Test(priority = 143, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_User_registration_form_print_or_download_functionality()
			throws Exception {
		// User Registration 
		Homepage ref = new Homepage();
		MYClass MYC = new MYClass();
		ref.selectjurisdictionForCalifornia();
		MYC.selectJurisdictionStep();
		MYC.personalInformation(); 
		MYC.residenceAndMailing(); 
		MYC.editAndReview();
		MYC.createUserLogin();
		//Login to approved user
		MYC.runtime_Login_with_Pending_User();
		MYC.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt1();
		MYC.downloaduserRegistrationForm_functinality();		    
	}
	/*
	 * TC_Id          : C32144/RPM-342
	 * Tc_Title       : Verification of User registration form download functionality when registration details are updated
	 * Functionality  : User Registration
	 * Author         :swati.jagdale@eqanim.com
	 */
	@Test(priority = 144, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_User_registration_form_download_functionality_when_registration_details_are_updated()
			throws Exception {
		// User Registration
		Homepage ref = new Homepage();
		UserRegistration ur = new UserRegistration();
		MYClass MYC = new MYClass();
		MyPOMClass ref3 = new MyPOMClass();
		ref.selectjurisdictionForCalifornia();
		MYC.selectJurisdictionStep();
		MYC.personalInformation();
		MYC.residenceAndMailing();
		MYC.editAndReview();
		MYC.createUserLogin();
		// Login_with_Jurisdiction_Registrar//Assign role
		ref3.Login_with_Jurisdiction_Registrar();
		MYC.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		MYC.RevisionRequestFromRegistrar();
		ref.logout();
		// Login_with_ApprovedUser
		MYC.runtime_Login_with_Approved_User();
		MYC.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt1();
		MYC.AddRevisions();
		ref.logout();
		// search user
		MYC.runtime_Login_with_Approved_User();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt1();
		MYC.downloaduserRegistrationForm_functinality();	    
	}
	/*
	 * TC_Id          : C27799/RPM-387
	 * Tc_Title       : Verification of Availability & accessibility of user profile
	 * Functionality  : User Registration
	 * Author         :swati.jagdale@eqanim.com
	 */
	@Test(priority = 145, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_Availability_accessibility_of_user_profile()
			throws Exception {
		// User Registration 
		Homepage ref = new Homepage();
		MYClass MYC = new MYClass();
		ref.selectjurisdictionForCalifornia();
		MYC.selectJurisdictionStep();
		MYC.personalInformation(); 
		MYC.residenceAndMailing(); 
		MYC.editAndReview();
		MYC.createUserLogin();
		//Login to approved user
		MYC.runtime_Login_with_Pending_User();
		MYC.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt1();
		MYC.UserProfile_functinality();		    
	}

	/*
	 *TC_Id         : C32308 RPM-600
	 *Tc_Title      : Verification_of_Cancel_application_functionality_after_Revision_Request
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 146,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verification_of_Cancel_application_functionality_after_Revision_Request() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.raisedRevisionRequestUserRegistrationByRegistrar();
		ref.logout();
		ref1.loginAsCreatedUser();
		//ur.loginAsPendingUser1();
		ref.userProfile();
	}

	/*
	 *TC_Id         : C29002 RPM-335/C27648 RPM-401
	 *Tc_Title      : Verification_Of_All_Mandatory_Fields_With_Valid_Data_On_Personal_Information_Page.
	 *                Verify_Personal_Information_Page_For_Valid_Data.
	 *Functionality : User Registration             
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 147,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verify_Personal_Information_Page_For_Valid_Data() throws InterruptedException {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		ref.selectJurisdictionForQubec();
		System.out.println("Step : Complete the select jurisdiction step ");
		ObjectRepo.test.log(Status.PASS, "Step : Complete the select jurisdiction step ");
		ur.selectJurisdictionStep();
		System.out.println("Step : Enter valid data in all fields and click on continue button ");
		ObjectRepo.test.log(Status.PASS, "Step : Enter valid data in all fields and click on continue button");
		ur.personalInformation();
		System.out.println("User should be navigate to residence and mailing step.");
		ObjectRepo.test.log(Status.PASS, "User should be navigate to residence and mailing step.");
	}

	/*
	 *TC_Id         : C29004 RPM-335/C27655 RPM-402
	 *Tc_Title      : Verification_Of_Mandatory_Fields_With_Empty_Data_On_Personal_Information_Page
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com
	 */
	@Test(priority = 148,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_Of_Mandatory_Fields_With_Empty_Data_On_Personal_Information_Page() throws InterruptedException {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		System.out.println("Step : Complete the select jurisdiction step ");
		ObjectRepo.test.log(Status.PASS, "Step : Complete the select jurisdiction step ");
		System.out.println("Step : Keep empty mandatory fields ");
		ObjectRepo.test.log(Status.PASS, "Step : Keep empty mandatory fields ");
		ur.personalInformationWithEmptyData();
	}

	/*
	 *TC_Id         : C29005 RPM-335/C27651 RPM-401
	 *Tc_Title      : Verification_Of_All_Mandatory_Fields_With_Valid_Data_On_Residence_And_Mailing_Page
	 *                Verify_Primary_Residence_And_Mailing_Address_Page_With_Valid_Data.
	 *Functionality : User Registration             
	 *Author        : pravin.jogi@eqanim.com
	 */
	@Test(priority = 149,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_Of_All_Mandatory_Fields_With_Valid_Data_On_Residence_And_Mailing_Page() throws InterruptedException {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		ref.selectJurisdictionForQubec();
		System.out.println("Step : Complete the select jurisdiction step ");
		ObjectRepo.test.log(Status.PASS, "Step : Complete the select jurisdiction step ");
		ur.selectJurisdictionStep();
		System.out.println("Step : Complete the Personal Information step ");
		ObjectRepo.test.log(Status.PASS, "Step : Complete the Personal Information step ");
		ur.personalInformation();
		System.out.println("Step : Enter valid data in all fields of primary residence and mailing address section and click on continue button ");
		ObjectRepo.test.log(Status.PASS, "Step : Enter valid data in all fields of primary residence and mailing address section and click on continue button");
		ur.residenceAndMailing();
		System.out.println("User should be navigate to Edit and Review step.");
		ObjectRepo.test.log(Status.PASS, "User should be navigate to Edit and Review step.");
	}

	/*
	 *TC_Id         : C29007 RPM-335/C27657 RPM-402
	 *Tc_Title      : Verification_Of_Mandatory_Fields_With_Empty_Data_On_Residence_And_Mailing_Page
	 *                Verification_Of_All_Required_Fields_On_Residence_And_Mailing_Page
	 *Functionality : User Registration             
	 *Author        : pravin.jogi@eqanim.com
	 */
	@Test(priority = 150,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_Of_Mandatory_Fields_With_Empty_Data_On_Residence_And_Mailing_Page() throws InterruptedException {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		ref.selectjurisdictionForCalifornia();
		System.out.println("Step : Complete the select jurisdiction step ");
		ObjectRepo.test.log(Status.PASS, "Step : Complete the select jurisdiction step ");
		ur.selectJurisdictionStep();
		System.out.println("Step : Complete the Personal Information step ");
		ObjectRepo.test.log(Status.PASS, "Step : Complete the Personal Information step ");
		ur.personalInformation();
		System.out.println("Step : Keep empty mandatory fields ");
		ObjectRepo.test.log(Status.PASS, "Step : Keep empty mandatory fields ");
		ur.residenceAndMailingStepWithEmptyData();
	}

	/*
	 *TC_Id         : C27654 RPM-401
	 *Tc_Title      : Verification_of_Check_if_same_as_Primary_Residence_check_box_functionality_on_residence_mailing_section
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com
	 */
	@Test(priority = 151,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verification_of_Check_if_same_as_Primary_Residence_check_box_functionality_on_residence_mailing_section() throws InterruptedException {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		ref.selectjurisdictionForCalifornia();
		System.out.println("Step : Complete the select jurisdiction step ");
		ObjectRepo.test.log(Status.PASS, "Step : Complete the select jurisdiction step ");
		ur.selectJurisdictionStep();
		System.out.println("Step : Complete the Personal Information step ");
		ObjectRepo.test.log(Status.PASS, "Step : Complete the Personal Information step ");
		ur.personalInformation();
		ur.checkBoxVerifyOnResidenceAndMailingStep();
	}

	/*
	 *TC_Id         : C27661 RPM-402/C29013 RPM-335
	 *Tc_Title      : Verification_of_all_required_fields_on_create_user_login_page
	 *                Verification_Of_mandatory_fields_with_Empty_data_on_Create_User_Log-In_page
	 *Functionality : User Registration              
	 * Author       : pravin.jogi@eqanim.com
	 */
	//	@Test(priority = 152,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	//	public void verification_of_all_required_fields_on_create_user_login_page() throws Exception {
	//		Homepage ref = new Homepage();
	//		UserRegistration ur=new UserRegistration();
	//		ref.selectjurisdictionForCalifornia();
	//		System.out.println("Step : Complete the select jurisdiction step ");
	//		ObjectRepo.test.log(Status.PASS, "Step : Complete the select jurisdiction step ");
	//		ur.selectJurisdictionStep();
	//		System.out.println("Step : Complete the Personal Information step ");
	//		ObjectRepo.test.log(Status.PASS, "Step : Complete the Personal Information step ");
	//		ur.personalInformation();
	//		System.out.println("Step : Complete the Residence and mailing step ");
	//		ObjectRepo.test.log(Status.PASS, "Step : Complete the Residence and mailing step ");
	//		ur.residenceAndMailing();
	//		System.out.println("Step : Complete the Edit And Review step ");
	//		ObjectRepo.test.log(Status.PASS, "Step : Complete the Edit And Review step ");
	//		ur.editAndReview();
	//		System.out.println("Step : Keep empty mandatory fields of create user log in step ");
	//		ObjectRepo.test.log(Status.PASS, "Step : Keep empty mandatory fields ");
	//		ur.createUserLoginStepWithEmptyData();
	//		}

	/*
	 *TC_Id         : C29008 RPM-335
	 *Tc_Title      : Verification_of_all_mandatory_fields_with_valid_data_on_Edit_And_Review_page
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com
	 */
	@Test(priority = 153,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verification_of_all_mandatory_fields_with_valid_data_on_Edit_And_Review_page() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		ref.selectjurisdictionForCalifornia();
		System.out.println("Step : Complete the select jurisdiction step ");
		ObjectRepo.test.log(Status.PASS, "Step : Complete the select jurisdiction step ");
		ur.selectJurisdictionStep();
		System.out.println("Step : Complete the Personal Information step ");
		ObjectRepo.test.log(Status.PASS, "Step : Complete the Personal Information step ");
		ur.personalInformation();
		System.out.println("Step : Complete the Residence and mailing step ");
		ObjectRepo.test.log(Status.PASS, "Step : Complete the Residence and mailing step ");
		ur.residenceAndMailing();
		System.out.println("Step : Complete the Edit And Review step ");
		ObjectRepo.test.log(Status.PASS, "Step : Complete the Edit And Review step ");
		ur.editAndReviewStepMandetoryFieldsWithValidData();
	}

	/*
	 *TC_Id         : C27604 RPM-331
	 *Tc_Title      : Verification_of_accept_Terms_and_conditions_functionality
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com
	 */
	@Test(priority = 154,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verification_of_accept_Terms_and_conditions_functionality() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		ref.selectjurisdictionForCalifornia();
		System.out.println("Step : Complete the select jurisdiction step ");
		ObjectRepo.test.log(Status.PASS, "Step : Complete the select jurisdiction step ");
		ur.selectJurisdictionStep();
		System.out.println("Step : Complete the Personal Information step ");
		ObjectRepo.test.log(Status.PASS, "Step : Complete the Personal Information step ");
		ur.personalInformation();
		System.out.println("Step : Complete the Residence and mailing step ");
		ObjectRepo.test.log(Status.PASS, "Step : Complete the Residence and mailing step ");
		ur.residenceAndMailing();
		System.out.println("Step :Checked Accept Terms & Conditions check box ");
		ObjectRepo.test.log(Status.PASS, "Step :Checked Accept Terms & Conditions check box ");
		ur.TermsAndConditionFunctionalityOnEditReviewPage();
		System.out.println("Step :Click on Continue button");
		ObjectRepo.test.log(Status.PASS, "Step :Click on Continue button");
	}

	/*
	 *TC_Id          : C27828 RPM-399
	 *Tc_Title       : Verification_of_accessibility_of_registration_step_to_Public_User
	 *Functionality  : User Registration
	 *Author         : pravin.jogi@eqanim.com
	 */
	@Test(priority = 155,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verification_of_accessibility_of_registration_step_to_Public_User() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		ref.selectJurisdictionForQubec();
		ur.userRegistrationPage();
		System.out.println("The registration page should be opened for public User");
		ObjectRepo.test.log(Status.PASS, "The registration page should be opened for public User");
	}

	/*
	 *TC_Id         : C27829 RPM-399
	 *Tc_Title      : Verification_of_accessibility_of_Select_Jurisdiction_step_in_user_registration
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com
	 */
	@Test(priority = 156,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verification_of_accessibility_of_Select_Jurisdiction_step_in_user_registration() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		ref.selectJurisdictionForQubec();
		ur.selJuriStepPage();
		System.out.println("The select jurisdiction step page should be opened");
		ObjectRepo.test.log(Status.PASS, "The registration page should be opened");
	}

	/*
	 *TC_Id         : C27830 RPM-399
	 *Tc_Title      : Verification_of_accessibility_of_Personal_Information_step_in_user_registration
	 *Functionality : User Registration
	 **Author       : pravin.jogi@eqanim.com
	 */
	@Test(priority = 157,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verification_of_accessibility_of_Personal_Information_step_in_user_registration() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		System.out.println("The personal information step page should be opened");
		ObjectRepo.test.log(Status.PASS, "The personal information page should be opened");
	}

	/* 
	 *TC_Id         : C27831 RPM-399
	 *Tc_Title      : Verification_of_accessibility_of_Residence_And_Mailing_step_in_user_registration
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com
	 */
	@Test(priority = 158,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verification_of_accessibility_of_Residence_And_Mailing_step_in_user_registration() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ur.personalInformation();
		System.out.println("The Residence and mailing step page should be opened");
		ObjectRepo.test.log(Status.PASS, "The Residence and mailing page should be opened");
	}

	/*
	 *TC_Id         : C27832 RPM-399
	 *Tc_Title      : Verification_of_accessibility_of_Edit_And_Review_step_in_user_registration
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com
	 */
	@Test(priority = 159,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verification_of_accessibility_of_Edit_And_Review_step_in_user_registration() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ur.personalInformation();
		ur.residenceAndMailing();
		System.out.println("The Edit and review step page should be opened");
		ObjectRepo.test.log(Status.PASS, "The Edit and review step page should be opened");
	}

	/*
	 *TC_Id         : C27605 RPM-333
	 *Tc_Title      : Verification_of_Review_application_details_functionality_before_submit_the_application
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com
	 */
	@Test(priority = 160,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verification_of_Review_application_details_functionality_before_submit_the_application () throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ur.personalInformation();
		ur.residenceAndMailing();
		ur.reviewApplicationDetailsOnEditAndReviewPage();
	}

	/*
	 *TC_Id         : C27835 RPM-329
	 *Tc_Title      : Verification_of_display_accept_Terms_of_Use_option
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com
	 */
		@Test(priority = 161,retryAnalyzer = Analyzer.RetryAnalyzer.class)
		public void verification_of_display_accept_Terms_of_Use_option () throws Exception {
			Homepage ref = new Homepage();
			UserRegistration ur=new UserRegistration();
			ref.selectJurisdictionForQubec();
			ur.selectJurisdictionStep();
			ur.personalInformation();
			ur.residenceAndMailing();
			ur.editAndReview();
			ur.accpetTermsOfUseCheckboxOnCreateLogInPage();
		}

	/*
	 *TC_Id         : C26397 RPM-99
	 *Tc_Title      : UI_Verification_of_landing_page_for_Unknown_user.
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com
	 */
	@Test(priority = 162,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void uI_Verification_of_landing_page_for_Unknown_user() throws InterruptedException {
		Homepage ref = new Homepage();
		ref.uiTestForLandingPageUnknownUser();
	}
	/*
	 *TC_Id         : C26398 RPM-99
	 *Tc_Title      : UI_Verification_of_landing_page_for_known_user.
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com
	 */
	@Test(priority = 163,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void uI_Verification_of_landing_page_for_known_user() throws InterruptedException {
		Homepage ref = new Homepage();
		ref.selectJurisdictionForQubec();
		ref.uiTestForLandingPageKnownUser();
	} 
	/*
	 *TC_Id         : C26399 RPM-99
	 *Tc_Title      : UI_Verification_of_Login_Module_on_Home_page.
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com
	 */
	@Test(priority = 164,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void uI_Verification_of_Login_Module_on_Home_page() throws InterruptedException {
		Homepage ref = new Homepage();
		ref.selectJurisdictionForQubec();
		ref.uiTestForLoginModuleOnHomePage();
	}
	/*
	 *TC_Id         : C26400 RPM-192
	 *Tc_Title      : UI_Verification_of_select_jurisdiction_page.
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com
	 */
	@Test(priority = 165,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void uI_Verification_of_select_jurisdiction_page() throws InterruptedException {
		Homepage ref = new Homepage();
		UserRegistration ur= new UserRegistration();
		ref.selectJurisdictionForQubec();
		ur.uiTestForSelJuriStepPage();

	}
	/*
	 *TC_Id         : C26401 RPM-193
	 *Tc_Title      : UI_Verification_of_personal_information_page .
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com
	 */
	@Test(priority = 166,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void uI_Verification_of_personal_information_page() throws InterruptedException {
		Homepage ref = new Homepage();
		UserRegistration ur= new UserRegistration();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ur.uiTestForPersonalInfoStepPage();
	}
	/*
	 *TC_Id         : C26402 RPM-194
	 *Tc_Title      : UI_Verification_of_Residence_and_mailing_page.
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com
	 */
	@Test(priority = 167,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void uI_Verification_of_Residence_and_mailing_page() throws InterruptedException {
		Homepage ref = new Homepage();
		UserRegistration ur= new UserRegistration();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ur.personalInformation();
		ur.uiTestForResidenceAndMalingPage();
	}
	/*
	 *TC_Id         : C26403 RPM-195
	 *Tc_Title      : UI_Verification_of_Edit_and_Review_page.
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com
	 */
	@Test(priority = 168,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void uI_Verification_of_Edit_and_Review_page() throws InterruptedException {
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		Homepage ref = new Homepage();
		UserRegistration ur= new UserRegistration();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ur.personalInformation();
		ur.residenceAndMailing();
		ur.uiTestForEditAndReviewPage();
	}
	/*
	 *TC_Id         : C26404 RPM-196
	 *Tc_Title      : UI_Verification_of_create_user_login_page.
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com
	 */
	@Test(priority = 169,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void uI_Verification_of_create_user_login_page() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur= new UserRegistration();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ur.personalInformation();
		ur.residenceAndMailing();
		ur.editAndReview();
		ur.uiTestForCreateUserLogInPage();
	}

	/*
	 *TC_Id         : C26439 RPM-191
	 *Tc_Title      : UI_Verification_of_user_Registration_Steps_landing_page .
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com
	 */
	@Test(priority = 170,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void uI_Verification_of_user_Registration_Steps_landing_page() throws InterruptedException {
		Homepage ref = new Homepage();
		UserRegistration ur= new UserRegistration();
		ref.selectJurisdictionForQubec();
		ur.uiTestForUserRegistrationPage();
	}
	/*
	 *TC_Id         : C26440 RPM-230
	 *Tc_Title      : UI_Verification_of_configuration_settings_page.
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com
	 */
	@Test(priority = 171,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void uI_Verification_of_configuration_settings_page() throws InterruptedException {
		Homepage ref = new Homepage();
		ConfigurationSettings cs=new ConfigurationSettings();
		MYClass MYC = new MYClass();
		PendingUser ref1=new PendingUser();
		ref.selectJurisdictionForQubec();
		ref1.loginAsJSAUserOfCaliForniaJurisdiction();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		cs.configurationSettings();
		cs.uiTestForConfigurationSettingsPage();
	}

	/*
	 *TC_Id         : C27719 RPM-382
	 *Tc_Title      : UI_verification_of_Contact_us_Page
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com
	 */
	@Test(priority = 172,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void uI_verification_of_Contact_us_Page() throws Exception {
		Homepage ref = new Homepage();
		ref.selectJurisdictionForQubec();
		ref.uiTestForContactUsOnHomePage();

	}

	/*
	 *TC_Id         : C27733 RPM-201
	 *Tc_Title      : UI_verification_of_JU_Home_Page
	 *Functionality : User Registration
	 *Author        : pravin.jogi@eqanim.com
	 */
	@Test(priority = 173,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void uI_verification_of_JU_Home_Page() throws Exception {
		Homepage ref = new Homepage();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectJurisdictionForQubec();
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref.uiTestForJUHomePage();
	}

	/*
	 *TC_Id         : C27793 RPM-384
	 *Tc_Title      : Verify Remember me checkbox appearnce
	 *Functionality : User Registration
	 *Author        : vishal.giram@eqanim.com
	 */
	@Test(priority = 174, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verify_Remember_me_checkbox_appearnce() throws InterruptedException {
		Homepage ref = new Homepage();
		ref.selectJurisdictionForQubec();
		POMpublicHomePage ref2 = new POMpublicHomePage();
		ref2.validateCheckBox();
	}

	/*
	 *TC_Id         : C27794,C27796 RPM-384
	 *Tc_Title      : Verification_of_Retain_User_ID_functinality_within_24_hours
	 *Functionality : User Registration
	 *Author        : vishal.giram@eqanim.com
	 */
	@Test(priority = 175, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_Retain_User_ID_functinality_within_24_hours() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		POMpublicHomePage ref2 = new POMpublicHomePage();
		ref1.loginUserWithRememberMeCheckbox();
		ref.logout();
		Thread.sleep(2000);
		String userID = driver.findElement(By.xpath("//input[@name='email']")).getAttribute("value");
		System.out.println("UserID fetched from testbox is : " + userID);
		System.out.println("validated : Verification_of_Retain_User_ID_functinality_after_24_hours");
	}

	/*
	 *TC_Id         : C27798 RPM-384
	 *Tc_Title      : Verify_if_User_do_not_select_Remember_me_checkbox_In_the_next_login_userID_Should_Not_be_populated
	 *Functionality : User Registration
	 *Author        : vishal.giram@eqanim.com
	 */
	@Test(priority = 176, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verify_if_User_do_not_select_Remember_me_checkbox_In_the_next_login_userID_Should_Not_be_populated()
			throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		ref1.loginAsCreatedUser();
		ref.logout();
		Thread.sleep(1000);
		String userID = driver.findElement(By.xpath("//input[@name='email']")).getAttribute("value");
		System.out.println("UserID fetched from testbox is : " + userID);
	}
}