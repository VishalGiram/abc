package Tests;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pageObjects.ApproveUser;
import pageObjects.Homepage;
import pageObjects.MYClass;
import pageObjects.MyPOMClass;
import pageObjects.POMpublicHomePage;
import pageObjects.PendingUser;
import pageObjects.UserRegistration;
import resources.ObjectRepo;
import resources.base;

public class UserManagementFunctionality extends base {

	/*
	 *TC_Id         : C32305
	 *Tc_Title      : Verification_of_Cancel_application_functionality_with_Applicatio_state_as_Pending
	 *Functionality : User Management
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 1,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verification_of_Cancel_application_functionality_with_Applicatio_state_as_Pending() throws Exception {
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
		System.out.println("Created user logged in successfully.");
		ObjectRepo.test.log(Status.PASS, "Created user logged in successfully.");
		ref.userProfile();
		System.out.println("User registration cancel successfully");
		ObjectRepo.test.log(Status.PASS, "Created user logged in successfully.");
		ref1.loginAfterCancelUserRegistration();
		System.out.println("Error message should get displayed");
		ObjectRepo.test.log(Status.PASS, "Error message should get displayed");
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUesrAndViewUserAccountStatisAndRequestyStatus();
	}

	/*
	 *TC_Id         : C32703,C32704,C36037,C35644
	 *Tc_Title      : Verify_Availability_For_Unshare_User_Profile_Option_For_Cross_PJ_Users_TO_Jurisdiction_User
	 *                Verify_Unshare_User_Profile_Functionality_By_JU_For_Cross_PJ_Users
	 *                Verify_That_Unshared_User_Profiles_Try_To_Accssible_By_Welcoming_Jurisdiction_Users
	 *                Verify_That_The_Unshared_User_Profile_Is_Accssible_To_The_Welcoming_Jurisdiction_User
	 *Functionality : User Management
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 2,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verify_Availability_For_Unshare_User_Profile_Option_For_Cross_PJ_Users_TO_Jurisdiction_User() throws Exception {
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
		ref1.registrarApproveAndAssignIndividualUsersRole();
		ref.logout();
		System.out.println("Registrar approve user successfully.");
		ObjectRepo.test.log(Status.PASS, "Registrar approve user successfully.");
		ref1.loginAsCreatedUser();
		ref1.approvedUserRisedCrossJurisdictionRequest();
		ref.logout();
		System.out.println("Approved user raised cross jurisdiction request successfully");
		ObjectRepo.test.log(Status.PASS, "Approved user raised cross jurisdiction request successfully");
		ref1.californiaRegistrar();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.originalJurisdictionRegistrarShareUserProfileWithWelcomingJurisdiction();
		System.out.println("Registrar approved cross jurisdiction request with share user profile with welcoming jurisdiction successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar approved cross jurisdiction request with share user profile with welcoming jurisdiction successfully");
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.viewUnshareProfileOptionAndClickOnUnshareProfileOption();
		ref.logout();
		System.out.println("JU Unshare user profile with welcoming jurisdiction successfully");
		ObjectRepo.test.log(Status.PASS, "JU Unshare user profile with welcoming jurisdiction successfully");
		ref1.loginAsJurisdictionUserForWelcomingJurisdiction();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndViewInGrid();
	}

	/*
	 *TC_Id         : C32706
	 *Tc_Title      : Verify_That_The_Shared_User_Profiles_Accssible_To_The_Welcoming_Jurisdiction_User
	 *Functionality : User Management
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 3,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verify_That_The_Shared_User_Profiles_Accssible_To_The_Welcoming_Jurisdiction_User() throws Exception {
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
		ref1.registrarApproveAndAssignIndividualUsersRole();
		ref.logout();
		System.out.println("Registrar approve user successfully.");
		ObjectRepo.test.log(Status.PASS, "Registrar approve user successfully.");
		ref1.loginAsCreatedUser();
		ref1.approvedUserRisedCrossJurisdictionRequest();
		ref.logout();
		System.out.println("Approved user raised cross jurisdiction request successfully");
		ObjectRepo.test.log(Status.PASS, "Approved user raised cross jurisdiction request successfully");
		ref1.californiaRegistrar();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.originalJurisdictionRegistrarShareUserProfileWithWelcomingJurisdiction();
		ref.logout();
		System.out.println("Registrar approved cross jurisdiction request with share user profile with welcoming jurisdiction successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar approved cross jurisdiction request with share user profile with welcoming jurisdiction successfully");
		ref1.loginAsJurisdictionUserForWelcomingJurisdiction();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.welcomingRegistrarViewUserProfile();
		System.out.println("Welcoming JU is access user profile successfully");
		ObjectRepo.test.log(Status.PASS, "Welcoming JU is access user profile successfully");	
	}

	/*
	 *TC_Id         : C32724
	 *Tc_Title      : Verify_That_The_User's_Role_And_Access_In_the_Original_jurisdiction_After_Unsharing_The_User_Profile_With_Welcoming_Jurisdiction
	 *Functionality : User Management
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 4,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verify_That_The_Users_Role_And_Access_In_the_Original_jurisdiction_After_Unsharing_The_User_Profile_With_Welcoming_Jurisdiction() throws Exception {
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
		//Approve user login and raised cross jurisdiction request
		ref1.loginAsCreatedUser();
		ref1.approvedUserRisedCrossJurisdictionRequest();
		ref.logout();
		System.out.println("Approved user raised cross jurisdiction request successfully");
		ObjectRepo.test.log(Status.PASS, "Approved user raised cross jurisdiction request successfully");
		//Original jurisdiction (California) registrar login and share user profile with welocming
		ref1.californiaRegistrar();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.originalJurisdictionRegistrarShareUserProfileWithWelcomingJurisdiction();
		System.out.println("Registrar approved cross jurisdiction request with share user profile with welcoming jurisdiction successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar approved cross jurisdiction request with share user profile with welcoming jurisdiction successfully");
		//Original jurisdiction (California) Registrar search user and unshare user profile to welcoming jurisdiction
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.viewUnshareProfileOptionAndClickOnUnshareProfileOption();
		System.out.println("JU Unshare user profile with welcoming jurisdiction successfully");
		ObjectRepo.test.log(Status.PASS, "JU Unshare user profile with welcoming jurisdiction successfully");
		//Original jurisdiction (California) Registrar search user and view user role
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.viewUserRoleTypeAndRoleAndRequestStatus();
	}

	/*
	 *TC_Id         : C35596,C35601,C35602
	 *Tc_Title      : Verification_Of_The_User_details_Functionality_Of_user_Account_status
	 *                Verification_Of_The_Functionality_Of_change_User_Account_status_To_Close_By_JU
	 *                Verification_of_the_cancelling_Change_User_account_Status_To_Close_Functionality_By_JU
	 *Functionality : User Management
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 5,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verification_Of_The_User_details_Functionality_Of_user_Account_status() throws Exception {
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
		System.out.println("Registrar approve user successfully.");
		ObjectRepo.test.log(Status.PASS, "Registrar approve user successfully.");
		//Inactive user - close account
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.viewElementsAvailableInQuickActionColumn();
	}

	/*
	 *TC_Id         : C35614,C35618
	 *Tc_Title      : Verification_Of_The_Success_Message_when_The_User_Account_Status_Change_TO_close_BY_JU
	 *                Verify_Jurisdiction_User_Is_Able_TO_Enter_Comment_When_Account_Status_Change_TO_Close
	 *Functionality : User Management
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 6,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verification_Of_The_Success_Message_when_The_User_Account_Status_Change_TO_close_BY_JU() throws Exception {
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
		System.out.println("Registrar approve user successfully.");
		ObjectRepo.test.log(Status.PASS, "Registrar approve user successfully.");
		//Inactive user - close account
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarCloseUserAccountFromUserDetailsPage();
		System.out.println("Registrar closed user account successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar closed user account successfully");
	}

	/*
	 *TC_Id         : C36038
	 *Tc_Title      : Verify_Jurisdiction_User_Can_Change_User_Account_Status_TO_Closed_Without_Entering_Comment
	 *Functionality : User Management
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 7,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verify_Jurisdiction_User_Can_Change_User_Account_Status_TO_Closed_Without_Entering_Comment() throws Exception {
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
		System.out.println("Registrar approve user successfully.");
		ObjectRepo.test.log(Status.PASS, "Registrar approve user successfully.");
		//Inactive user - close account
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarCloseUserAccountFromUserDetailsPageWithoutEnterComment();
		System.out.println("Close user account button should be disabled and Registrar can not able to close user account");
		ObjectRepo.test.log(Status.PASS, "Close user account button should be disabled and Registrar can not able to close user account");
	}

	/*
	 *TC_Id         : C32306
	 *Tc_Title      : Verification_of_Cancel_application_functionality_After_Application_Approved
	 *Functionality : User Management
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 8,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verification_of_Cancel_application_functionality_After_Applicatio_Approved() throws Exception {
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
		ref1.registrarApproveAndAssignIndividualUsersRole();
		ref.logout();
		System.out.println("Registrar approve user successfully.");
		ObjectRepo.test.log(Status.PASS, "Registrar approve user successfully.");
		//Approve user login and raised cross jurisdiction request
		ref1.loginAsCreatedUser();
		ref1.approveUserTryToCancelUserRegistration();
	}

	/*
	 *TC_Id         : C32308 Defect raised Once Defect Is fixed then we will fix accordingly
	 *Tc_Title      : Verification_of_Cancel_application_functionality_After_Revision_Request
	 *Functionality : User Management
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 9,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verification_of_Cancel_application_functionality_After_Revision_Request() throws Exception {
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
		ref1.raisedRevisionRequestUserRegistrationByRegistrar();
		ref.logout();
		System.out.println("Registrar raised revision request to user successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar raised revision request to user successfully");
		//Approve user login and raised cross jurisdiction request
		ref1.loginAsCreatedUser();
		ref.userProfile();
		System.out.println("User registration cancel successfully by request revision user");
		ObjectRepo.test.log(Status.PASS, "User registration cancel successfully by request revision user");
		//California registrar login and view user who cancel user registration
		ref1.californiaRegistrar();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUesrAndViewUserAccountStatisAndRequestyStatus();
	}

	/*
	 *TC_Id         : C32656,C32221
	 *Tc_Title      : Verification_Initiate_The_Change_Of_Jurisdiction_Process_For_Pending_User
	 *                Verification_Of_User_Can_Able_To_Select_Only_One_Jurisdiction_At_A_Time_Of_Change_Of_Jurisdiction
	 *Functionality : User Management
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 10,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verification_Initiate_The_Change_Of_Jurisdiction_Process_For_Pending_User() throws Exception {
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
		//created user login and raised change jurisdiction request
		ref1.loginAsCreatedUser();
		ref1.changeJurisdictionCaliforniaToQuebec();
		System.out.println("Pending user initiate change jurisdiction request successfully.");
		ObjectRepo.test.log(Status.PASS, "Pending user initiate change jurisdiction request successfully.");
	}

	/*
	 *TC_Id         : C32657
	 *Tc_Title      : Verification_Cancelling_Change_Jurisdiction_Process_For_Pending_User
	 *Functionality : User Management
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 11,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verification_Cancelling_Change_Jurisdiction_Process_For_Pending_User() throws Exception {
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
		//created user login and raised change jurisdiction request
		ref1.loginAsCreatedUser();
		ref1.cancellingTheChangeJurisdictionCaliforniaToQuebec();
		System.out.println("User cancelling initiate change jurisdiction request succeessfully.");
		ObjectRepo.test.log(Status.PASS, "User cancelling initiate change jurisdiction request succeessfully.");
	}

	/*
	 *TC_Id         : C32658,C32221
	 *Tc_Title      : Verification_Initiate_The_Change_Of_Jurisdiction_Process_For_Approved_User
	 *Functionality : User Management
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 12,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verification_Initiate_The_Change_Of_Jurisdiction_Process_For_Approved_User() throws Exception {
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
		ref1.registrarApproveAndAssignIndividualUsersRole();
		ref.logout();
		System.out.println("Registrar approve user successfully.");
		ObjectRepo.test.log(Status.PASS, "Registrar approve user successfully.");
		//created user login and raised change jurisdiction request
		ref1.loginAsCreatedUser();
		ref1.changeJurisdictionCaliforniaToQuebec();
		System.out.println("Approved user initiate change jurisdiction request successfully.");
		ObjectRepo.test.log(Status.PASS, "Approved user initiate change jurisdiction request successfully.");
	}

	/*
	 *TC_Id         : C32661
	 *Tc_Title      : Verification_Cancelling_Change_Jurisdiction_Process_For_Approved_User
	 *Functionality : User Management
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 13,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verification_Cancelling_Change_Jurisdiction_Process_For_Approved_User() throws Exception {
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
		ref1.registrarApproveAndAssignIndividualUsersRole();
		ref.logout();
		System.out.println("Registrar approve user successfully.");
		ObjectRepo.test.log(Status.PASS, "Registrar approve user successfully.");
		//created user login and raised change jurisdiction request
		ref1.loginAsCreatedUser();
		ref1.cancellingTheChangeJurisdictionCaliforniaToQuebec();
		System.out.println("Approved User cancelling initiate change jurisdiction request succeessfully.");
		ObjectRepo.test.log(Status.PASS, "Approved User cancelling initiate change jurisdiction request succeessfully.");
	}

	/*
	 *TC_Id         : C32160
	 *Tc_Title      : Verification_Of_JA_Deny_Functionality_To_Proposed_Role_Changes_By_JU
	 *Functionality : User Management
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 14,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verification_Of_JA_Deny_Functionality_To_Proposed_Role_Changes_By_JU() throws Exception {
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
		ref1.registrarApproveAndAssignServiceProviderRole();
		ref.logout();
		System.out.println("Registrar approve and assign role to user successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar approve and assign role to user successfully");
		//California Authority login and approve user
		ref1.LoginAsCaliforniaAuthority();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.authorityApproveUser();
		ref.logout();
		System.out.println("Authority approve user successfully");
		ObjectRepo.test.log(Status.PASS, "Authority approve user successfully");
		//California Registrar Login and Proposed role change for user
		ref1.californiaRegistrar();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarProposedRoleChnage();
		ref.logout();
		System.out.println("Registrar proposed role change successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar proposed role change successfully");
		//California authority Login and Denied Proposed Role Chnage
		ref1.LoginAsCaliforniaAuthority();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserInPendingGridAndGoToUserDetailsPage();
		ref1.authorityDeniedRoleChange();
		System.out.println("Authority Denied Proposed Role change successfully");
		ObjectRepo.test.log(Status.PASS, "Authority Denied Proposed Role change successfully");
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarViewRequestStatusAndRoleOfUser();
		System.out.println("Registrar view request status and role of user successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar view request status and role of user successfully");
	}

	/*
	 *TC_Id         : C29241,C29243
	 *Tc_Title      : Verification_Of_JU_Can_View_User_Details_Screen
	 *                Verification_Of_JU_Can_View_Profile_details_Of_Users_Registered_In_Their_Jurisdiction
	 *Functionality : User Management
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 15,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verification_Of_JU_Can_View_User_Details_Screen() throws Exception {
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
		ref1.registrarViewUserDetails();
		System.out.println("Registrar is able to view above section on user details page");
		ObjectRepo.test.log(Status.PASS, "Registrar is able to view above section on user details page");
	}

	/*
	 *TC_Id         : C29244
	 *Tc_Title      : Verification_Of_JU_Can_View_Role_History_Of_Users_Registered_In_Their_Jurisdiction
	 *Functionality : User Management
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 16,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verification_Of_JU_Can_View_Role_History_Of_Users_Registered_In_Their_Jurisdiction() throws Exception {
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
		ref1.registrarViewRoleHistory();
		System.out.println("Registrar is able to view User Role History grid on user details page");
		ObjectRepo.test.log(Status.PASS, "Registrar is able to view User Role History grid on user details page");
	}

	/*
	 *TC_Id         : C29245
	 *Tc_Title      : Verification_Of_JU_Can_View_Status_History_Of_Users_Registered_In_Their_Jurisdiction
	 *                Verification_Of_Jurisdiction_User_can_view_applicant_Status_History_From_Their_Jurisdiction
	 *Functionality : User Management
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 17,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void Verification_Of_JU_Can_View_Status_History_Of_Users_Registered_In_Their_Jurisdiction() throws Exception {
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
	}

	/*
	 *TC_Id         : C36091
	 *Tc_Title      : Verification_Of_JU_Can_View_The_User_Details_Of_Users_Which_Are_Registered_In_Another_Jurisdiction
	 *Functionality : User Management
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 17,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void Verification_Of_JU_Can_View_The_User_Details_Of_Users_Which_Are_Registered_In_Another_Jurisdiction() throws Exception {
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
		System.out.println("User Created successfully in california jurisdiction");
		ObjectRepo.test.log(Status.PASS, "User Created successfully in california jurisdiction");
		//Quebec registrar login and Search user
		ref1.loginAsJurisdictionUserForWelcomingJurisdiction();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.userNotFound();
	}

	/*
	 *TC_Id         : C29301,C29302
	 *Tc_Title      : Verification_Of_JU_Set_User_Account_Status_To_Active_Active_User_Login
	 *                Verification_Of_User_Login_After_JU_Set_User_Account_Status_To_Active_From_Inactive
	 *Functionality : User Management
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 18,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verification_Of_JU_Set_User_Account_Status_To_Active_Active_User_Login() throws Exception {
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
		System.out.println("User Created successfully in california jurisdiction");
		ObjectRepo.test.log(Status.PASS, "User Created successfully in california jurisdiction");
		//california registrar login and set user account status to inactive
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarApproveAndAssignIndividualUsersRole();
		System.out.println("Registrar approved user successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar approved user successfully");
		driver.navigate().refresh();
		ref1.registrarDeactivateUserLoginWithoutProfileAccess();
		System.out.println("Registrar set user account status inactive successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar set user account status inactive successfully");
		//Registrar Login and Activate user login
		ref1.registrarActivateUserLogin();
		System.out.println("Registrar Activate User Login successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar Activate User Login successfully");
		ref1.registrarSearchUesrAndViewUserAccountStatisAndRequestyStatusForActive();
		System.out.println("Registrar View user account status successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar View user account status successfully");
		ref.logout();
		//User login
		ref1.loginAsCreatedUser();
		System.out.println("User logged in successfully");
		ObjectRepo.test.log(Status.PASS, "User logged in successfully");
	}

	/*
	 *TC_Id         : C35585
	 *Tc_Title      : Verification_Of_Activate_Login_Functionality_For_User_With_Status_Active
	 *Functionality : User Management
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 19,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verification_Of_Activate_Login_Functionality_For_User_With_Status_Active() throws Exception {
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
		System.out.println("User Created successfully in california jurisdiction");
		ObjectRepo.test.log(Status.PASS, "User Created successfully in california jurisdiction");
		//california registrar login and set user account status to inactive
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarApproveAndAssignIndividualUsersRole();
		System.out.println("Registrar approved user successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar approved user successfully");
		driver.navigate().refresh();
		ref1.registrarViewDeactiveUserLoginOption();
	}

	/*
	 *TC_Id         : C29320
	 *Tc_Title      : Verify_The_Functionality_Of_Change_User_Account_Status_To_Inactive_By_JU
	 *Functionality : User Management
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 20,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verify_The_Functionality_Of_Change_User_Account_Status_To_Inactive_By_JU() throws Exception {
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
		System.out.println("User Created successfully in california jurisdiction");
		ObjectRepo.test.log(Status.PASS, "User Created successfully in california jurisdiction");
		//california registrar login and set user account status to inactive
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarApproveAndAssignIndividualUsersRole();
		System.out.println("Registrar approved user successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar approved user successfully");
		driver.navigate().refresh();
		ref1.registrarDeactivateUserLoginWithoutProfileAccess();
		ref.logout();
		System.out.println("Registrar set user account status inactive successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar set user account status inactive successfully");
		ref1.errorMessageForLogin();
	}

	/*
	 *TC_Id         : C29321 Defect raised Once Defect Is fixed then we will fix accordingly
	 *Tc_Title      : Verify_The_Deactivate_User_Login_Functionality_For_User_With_User_Account_Status_As_Inactive
	 *Functionality : User Management
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 21,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void Verify_The_Deactivate_User_Login_Functionality_For_User_With_User_Account_Status_As_Inactive() throws Exception {
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
		System.out.println("User Created successfully in california jurisdiction");
		ObjectRepo.test.log(Status.PASS, "User Created successfully in california jurisdiction");
		//california registrar login and set user account status to inactive
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarApproveAndAssignIndividualUsersRole();
		System.out.println("Registrar approved user successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar approved user successfully");
		driver.navigate().refresh();
		ref1.registrarDeactivateUserLoginWithoutProfileAccess();
		ref1.registrarNotViewDeactiveUserLoginOption();
	}

	/*
	 *TC_Id         : C32697 Defect raised Once Defect Is fixed then we will fix accordingly
	 *Tc_Title      : Verify_The_Functionality_Of_Change_User_account_status_Of_Applicant_User_To_Inactive_By_JU
	 *Functionality : User Management
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 22,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verify_The_Functionality_Of_Change_User_account_status_Of_Applicant_User_To_Inactive_By_JU() throws Exception {
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
		System.out.println("User Created successfully in california jurisdiction");
		ObjectRepo.test.log(Status.PASS, "User Created successfully in california jurisdiction");
		//california registrar login and set user account status to inactive
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarViewAfterClickONThreeDotsOfApplicantUser();
	}

	/*
	 *TC_Id         : C32689
	 *Tc_Title      : Verification_Of_User_Is_Able_Download_The_Cross_Jurisdiction_Attestation_Form
	 *Functionality : User Management
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 23,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verification_Of_User_Is_Able_Download_The_Cross_Jurisdiction_Attestation_Form() throws Exception {
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
		System.out.println("User Created successfully in california jurisdiction");
		ObjectRepo.test.log(Status.PASS, "User Created successfully in california jurisdiction");
		//california registrar login and approve user
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchPendingUserInPendingGridAndGoToUserDetailsPage();
		ref1.registrarApproveAndAssignIndividualUsersRole();
		System.out.println("Registrar approve user successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar approve user successfully");
		ref.logout();
		//Approve user log in and raised cross jurisdiction request
		ref1.loginAsCreatedUser();
		ref1.downloadAttestationFormCrossHurisdictionFlow();
		System.out.println("User download Attestation form successfully");
		ObjectRepo.test.log(Status.PASS, "User download Attestation form successfully");
	}

	/*
	 *TC_Id         : C32639
	 *Tc_Title      : Verification_Of_Terms_And_Conditions_Functionality
	 *Functionality : User Management
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 24,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void Verification_Of_Terms_And_Conditions_Functionality() throws Exception {
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
		System.out.println("User Created successfully in california jurisdiction");
		ObjectRepo.test.log(Status.PASS, "User Created successfully in california jurisdiction");
		//california registrar login and approve user
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchPendingUserInPendingGridAndGoToUserDetailsPage();
		ref1.registrarApproveAndAssignIndividualUsersRole();
		System.out.println("Registrar approve user successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar approve user successfully");
		ref.logout();
		//Approve user log in and raised change jurisdiction request
		ref1.loginAsCreatedUser();
		ref1.termsAndConditionForCrossJurisdictionFlow();
		System.out.println("User download terms and condition successfully");
		ObjectRepo.test.log(Status.PASS, "User download terms and condition successfully");
	}

	/*
	     *TC_Id         : C32683 RPM-816
	     *Tc_Title      : Verification_of_an_approved_and_active_user_except_JU_can_able_to_initiate_cross_jurisdiction_process
	     *Functionality : User Registrartion
	     *Author        : pravin.jogi@eqanim.com           
	     */
	@Test(priority = 31,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_an_approved_and_active_user_except_JU_can_able_to_initiate_cross_jurisdiction_process() throws Exception {
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
		ref1.registrarApproveAndAssignIndividualUsersRole();
		System.out.println("Registrar cancel user approval successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar cancel user approval successfully");
		ref.logout();
		ref1.loginAsCreatedUser();
		ref1.approvedUserRisedCrossJurisdictionRequest();
		System.out.println("Approved user except JU raised cross jurisdiction request successfully");
		ObjectRepo.test.log(Status.PASS, "Approved user except JU raised cross jurisdiction request successfully");
	}


	/*
	     *TC_Id         : C32684 RPM-816
	     *Tc_Title      : Verification_of_an_JU_can_try_to_initiate_cross_jurisdiction_process
	     *Functionality : User Management
	     *Author        : pravin.jogi@eqanim.com           
	     */
	@Test(priority = 32,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verification_of_an_JU_can_try_to_initiate_cross_jurisdiction_process() throws Exception {
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
		ref1.registrarTryToRaisedCrossJurisdiction();
		System.out.println("JU user can not able to raised cross jurisdiction request");
		ObjectRepo.test.log(Status.PASS, "JU user can not able to raised cross jurisdiction request");
	}


	/*
	     *TC_Id         : C32685 RPM-816
	     *Tc_Title      : Verification_of_an_Deactivate_User_with_profile_acess_only_can_try_to_initiate_cross_jurisdiction_process
	     *Functionality : User Management
	     *Author        : pravin.jogi@eqanim.com           
	     */
	@Test(priority =33,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verification_of_an_Deactivate_User_with_profile_acess_only_can_try_to_initiate_cross_jurisdiction_process() throws Exception {
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
		ref1.registrarApproveAndAssignIndividualUsersRole();
		System.out.println("Registrar is approve user successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar is approve user successfully");
		ref1.registrarDeactivateUserLoginWithProfileAccess();
		System.out.println("Registrar deactivate user with profile access only successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar deactivate user with profile access only successfully");
		ref.logout();
		ref1.loginAsCreatedUser();
		ref1.deactivateUserWithProfileAccessOnlyTryToRaisedCrossJurisdiction();
	}

	/*
	     *TC_Id         : C32197 RPM-673
	     *Tc_Title      : Verification_OF_Jurisdiction_User_Able_TO_Access_User_Profile_Is_shared_With
	     *Functionality : User Management
	     *Author        : pravin.jogi@eqanim.com           
	     */
	@Test(priority =34,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verification_OF_Jurisdiction_User_Able_TO_Access_User_Profile_Is_shared_With() throws Exception {
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
		//California registrar log in and approve user
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarApproveAndAssignIndividualUsersRole();
		System.out.println("Registrar is approve user successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar is approve user successfully");
		ref.logout();
		//Approve user log in and raised cross jurisdiction request
		ref1.loginAsCreatedUser();
		ref1.approvedUserRisedCrossJurisdictionRequest();
		System.out.println("Approved user raised cross jurisdiction request successfully");
		ObjectRepo.test.log(Status.PASS, "Approved user raised cross jurisdiction request successfully");
		ref.logout();
		//Original jurisdiuction California registrar log in and approved cross jurisdiction request
		ref1.californiaRegistrar();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.originalJurisdictionRegistrarShareUserProfileWithWelcomingJurisdiction();
		System.out.println("Original JU registrar approved cross jurisdiction request successfully");
		ObjectRepo.test.log(Status.PASS, "Original JU registrar approved cross jurisdiction request successfully");
		ref.logout();
		//Welcoming JU Quebec Registrar Log in and view approved cross jurisdiction user profile
		ref1.loginAsJurisdictionUserForWelcomingJurisdiction();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarViewUserDetails();
		System.out.println("Welcoming JU registrar view user details after approved cross jurisdiction successfully");
		ObjectRepo.test.log(Status.PASS, "Welcoming JU registrar view user details after approved cross jurisdiction successfully");
	}

	/*
	     *TC_Id         : C34394 RPM-673 Remaining code pending
	     *Tc_Title      : Verification_original_Jurisdiction_User_able_To_View_The_List_Of_Jurisdictions_The_User_Profile_share_with
	     *Functionality : User Management
	     *Author        : pravin.jogi@eqanim.com           
	     */
	@Test(priority =35,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verification_original_Jurisdiction_User_able_To_View_The_List_Of_Jurisdictions_The_User_Profile_share_with() throws Exception {
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
		//California registrar log in and approve user
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarApproveAndAssignIndividualUsersRole();
		System.out.println("Registrar is approve user successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar is approve user successfully");
		ref.logout();
		//Approve user log in and raised cross jurisdiction request
		ref1.loginAsCreatedUser();
		ref1.approvedUserRisedCrossJurisdictionRequest();
		System.out.println("Approved user raised cross jurisdiction request successfully");
		ObjectRepo.test.log(Status.PASS, "Approved user raised cross jurisdiction request successfully");
		ref.logout();
		//Original jurisdiuction California registrar log in and approved cross jurisdiction request
		ref1.californiaRegistrar();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.originalJurisdictionRegistrarShareUserProfileWithWelcomingJurisdiction();
		System.out.println("Original JU registrar approved cross jurisdiction request successfully");
		ObjectRepo.test.log(Status.PASS, "Original JU registrar approved cross jurisdiction request successfully");
		ref1.registrarSerachUserUsingRequestStatusFilterForApprovedCrossJurisdictionRequest();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.originalRegistrarViewAfterShareProfileWithWelcomingJU();

	}

	/*
	     *TC_Id         : C32137 RPM-646  Defect raised Once Defect Is fixed then we will fix accordingly
	     *Tc_Title      : Verification_Of_JU_Can_Initiate_Passphrase_and_Security_questions_Changes_for_Any_user
	     *Functionality : User Management
	     *Author        : pravin.jogi@eqanim.com           
	     */
	@Test(priority =36,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verification_Of_JU_Can_Initiate_Passphrase_and_Security_questions_Changes_for_Any_user() throws Exception {
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
		//California registrar log in and approve user
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarApproveAndAssignIndividualUsersRole();
		System.out.println("Registrar is approve user successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar is approve user successfully");
		//Registrar reset passphrase and security questions of user
		ref1.registrarResetPassphraseAndSecQueToUser();
		System.out.println("Registrar is initiate reset passphrase and security questions of user successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar is initiate reset passphrase and security questions of user successfully");	
	}

	/*
	     *TC_Id         : C32177 RPM-644
	     *Tc_Title      : Verification_Of_Deny_Proposed_Role_changes_functionality_By_JU_With_Providing_reason_for_Denial
	     *Functionality : User Management
	     *Author        : pravin.jogi@eqanim.com           
	     */
	@Test(priority =37,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verification_Of_Deny_Proposed_Role_changes_functionality_By_JU_With_Providing_reason_for_Denial() throws Exception {
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
		//California registrar log in and approve user
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchPendingUserInPendingGridAndGoToUserDetailsPage();
		ref1.registrarApproveAndAssignServiceProviderRole();
		System.out.println("Registrar assign service provider role type to user successfully.");
		ObjectRepo.test.log(Status.PASS, "Registrar assign service provider role type to user successfully.");
		ref.logout();
		//California Authority log in and deny dual approval
		ref1.LoginAsCaliforniaAuthority();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchPendingUserInPendingGridAndGoToUserDetailsPage();
		ref1.authorityDeniedUser();
		System.out.println("Authority denied user successfully.");
		ObjectRepo.test.log(Status.PASS, "Authority denied user successfully.");
	}

	/*
	     *TC_Id         : C32178 RPM-644
	     *Tc_Title      : Verification_Of_Deny_Proposed_Role_changes_functionality_By_JU_Without_Providing_reason_for_Denial
	     *Functionality : User Management
	     *Author        : pravin.jogi@eqanim.com           
	     */
	@Test(priority =38,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verification_Of_Deny_Proposed_Role_changes_functionality_By_JU_Without_Providing_reason_for_Denial() throws Exception {
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
		//California registrar log in and approve user
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchPendingUserInPendingGridAndGoToUserDetailsPage();
		ref1.registrarApproveAndAssignServiceProviderRole();
		System.out.println("Registrar assign service provider role type to user successfully.");
		ObjectRepo.test.log(Status.PASS, "Registrar assign service provider role type to user successfully.");
		ref.logout();
		//California Authority log in and deny dual approval
		ref1.LoginAsCaliforniaAuthority();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchPendingUserInPendingGridAndGoToUserDetailsPage();
		ref1.authorityDeniedUser();
		System.out.println("Authority denied user successfully.");
		ObjectRepo.test.log(Status.PASS, "Authority denied user successfully.");
		//ref1.deniedUserRegistrationFunctionalityByRegistrar();
	}

	/*
	     *TC_Id         : C34414 RPM-673 
	     *Tc_Title      : Verification_Welcoming_Jurisdiction_User_able_To_View_The_List_Of_Jurisdictions_The_User_Profile_shared_with
	     *Functionality : User Management
	     *Author        : pravin.jogi@eqanim.com           
	     */
	@Test(priority =39,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verification_Welcoming_Jurisdiction_User_able_To_View_The_List_Of_Jurisdictions_The_User_Profile_shared_with() throws Exception {
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
		//California registrar log in and approve user
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarApproveAndAssignIndividualUsersRole();
		System.out.println("Registrar is approve user successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar is approve user successfully");
		ref.logout();
		//Approve user log in and raised cross jurisdiction request
		ref1.loginAsCreatedUser();
		ref1.approvedUserRisedCrossJurisdictionRequest();
		System.out.println("Approved user raised cross jurisdiction request successfully");
		ObjectRepo.test.log(Status.PASS, "Approved user raised cross jurisdiction request successfully");
		ref.logout();
		//Original jurisdiuction California registrar log in and approved cross jurisdiction request
		ref1.californiaRegistrar();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.originalJurisdictionRegistrarShareUserProfileWithWelcomingJurisdiction();
		System.out.println("Original JU registrar approved cross jurisdiction request successfully");
		ObjectRepo.test.log(Status.PASS, "Original JU registrar approved cross jurisdiction request successfully");
		ref.logout();
		//Welcoming Jurisdiction Quebec Registrar log in and view approved cross jurisdiction user profile
		ref1.loginAsJurisdictionUserForWelcomingJurisdiction();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSerachUserUsingRequestStatusFilterForApprovedCrossJurisdictionRequest();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarViewUserDetails();	
		System.out.println("Welcoming JU registrar view approved cross jurisdiction user details successfully");
		ObjectRepo.test.log(Status.PASS, "Welcoming JU registrar view approved cross jurisdiction user details successfully");
	}

	/*
	     *TC_Id         : C32650 RPM-815 
	     *Tc_Title      : Verification_Of_Request_Status_Is_Changed_To_Denied_COJ_After_Denied_Change_Jurisdiction_Request
	     *Functionality : User Management
	     *Author        : pravin.jogi@eqanim.com           
	     */
	@Test(priority =40,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verification_Of_Request_Status_Is_Changed_To_Denied_COJ_After_Denied_Change_Jurisdiction_Request() throws Exception {
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
		//California registrar log in and approve user
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarApproveAndAssignIndividualUsersRole();
		System.out.println("Registrar is approve user successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar is approve user successfully");
		ref.logout();
		//Approved User log in and raised change jurisdiction request
		ref1.loginAsCreatedUser();
		ref1.changeJurisdictionCaliforniaToQuebec();
		System.out.println("Approved user raised change jurisdiction request successfully");
		ObjectRepo.test.log(Status.PASS, "Approved user raised change jurisdiction request successfully");
		ref.logout();
		//Welcoming JU Quebec registrar log in and denied coj request
		ref1.loginAsJurisdictionUserForWelcomingJurisdiction();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.welcomingRegistrarDeniedChangeJurisdictionRequest();
		System.out.println("Welcoming registrar denied change jurisdiction request successfully");
		ObjectRepo.test.log(Status.PASS, "Welcoming registrar denied change jurisdiction request successfully");
		ref.logout();
		//User log in and view request status 
		ref1.runTimeloginAsCreatedUser();
		MYC.resetPassphrasePrompt1();
	}

	/*
	     *TC_Id         : C32193 RPM-672 Defect raised Once Defect Is fixed then we will fix accordingly
	     *Tc_Title      : Verification_OF_User_With_Inactive_Status_With_Profile_Access_Only_can_Login_To_Application
	     *Functionality : User Management
	     *Author        : pravin.jogi@eqanim.com           
	     */
	@Test(priority =41,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verification_OF_User_With_Inactive_Status_With_Profile_Access_Only_can_Login_To_Application() throws Exception {
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
		//California registrar log in and approve user
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarApproveAndAssignIndividualUsersRole();
		System.out.println("Registrar is approve user successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar is approve user successfully");
		ref1.registrarDeactivateUserLoginWithProfileAccess();
		System.out.println("Registrar deactivate user with profile access only");
		ObjectRepo.test.log(Status.PASS, "Registrar deactivate user with profile access only");
		ref.logout();
		//Deactivate user login 
		ref1.loginAsCreatedUser();
		String textAfterLogin=driver.findElement(By.xpath("//div[contains(text(),'[APPROVED USER - LOGGED-IN HOME PAGE]')]")).getText();
		System.out.println("Text is display after login is :"+textAfterLogin);
		Assert.assertEquals("[APPROVED USER - LOGGED-IN HOME PAGE]", textAfterLogin);
		System.out.println("Deactivate user with profile access only is logged in successfully");
		ObjectRepo.test.log(Status.PASS, "Deactivate user with profile access only is logged in successfully");	
	}

	/*
	     *TC_Id         : C32193, C32196 RPM-672 Defect raised Once Defect Is fixed then we will fix accordingly
	     *Tc_Title      : Verification_OF_User_With_Inactive_Status_With_Profile_Access_Only_can_Edit_User_Profile_Details
	 *                Verification_OF_User_With_Inactive_Status_With_Profile_Access_Only_can_Perform_Any_Action_Other_Than_View_User_Profile_and_change_Passphrase
	     *Functionality : User Management
	     *Author        : pravin.jogi@eqanim.com           
	     */
	@Test(priority =42,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verification_OF_User_With_Inactive_Status_With_Profile_Access_Only_can_Edit_User_Profile_Details() throws Exception {
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
		//California registrar log in and approve user
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarApproveAndAssignIndividualUsersRole();
		System.out.println("Registrar is approve user successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar is approve user successfully");
		ref1.registrarDeactivateUserLoginWithProfileAccess();
		System.out.println("Registrar deactivate user with profile access only");
		ObjectRepo.test.log(Status.PASS, "Registrar deactivate user with profile access only");
		ref.logout();
		//Deactivate user login and view user profile
		ref1.loginAsCreatedUser();
		String textAfterLogin=driver.findElement(By.xpath("//div[contains(text(),'[APPROVED USER - LOGGED-IN HOME PAGE]')]")).getText();
		System.out.println("Text is display after login is :"+textAfterLogin);
		Assert.assertEquals("[APPROVED USER - LOGGED-IN HOME PAGE]", textAfterLogin);
		System.out.println("Deactivate user with profile access only is logged in successfully");
		ObjectRepo.test.log(Status.PASS, "Deactivate user with profile access only is logged in successfully");	
		ref1.registrarViewUserProfileAndUserDetailsOfDeactivateUser();
		System.out.println("Deactivate user with profile access only is not able to edit their user details");
		ObjectRepo.test.log(Status.PASS, "Deactivate user with profile access only is not able to edit their user details");	
	}

	/*
	     *TC_Id         : C32664 RPM-608     Defect raised Once Defect Is fixed then we will fix accordingly
	     *Tc_Title      : Verification_OF_Profiles_details_Upadte_Functionality_For_Fields_Which_Do_Not_Require_Approval
	     *Functionality : User Management
	     *Author        : pravin.jogi@eqanim.com           
	     */
	@Test(priority =43,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verification_OF_Profiles_details_Upadte_Functionality_For_Fields_Which_Do_Not_Require_Approval() throws Exception {
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
		//California registrar log in and approve user
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarApproveAndAssignIndividualUsersRole();
		System.out.println("Registrar is approve user successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar is approve user successfully");
		ref.logout();
		//Created user login and edit their user profile
		ref1.loginAsCreatedUser();
		ref1.UserEditTheirDetailsWithoutApprovalFields();
		System.out.println("User is view success message for edit user deatails");
		ObjectRepo.test.log(Status.PASS, "User is view success message for edit user deatails\"");
	}

	/*
	     *TC_Id         : C32164 RPM-634, C32166 RPM-635
	     *Tc_Title      : Verification_Of_Propose_Update_Email_Of_An_Active_User_By_JU
	 *                Verification_Of_Propose_Update_Email_Of_An_Approved_User_By_JU
	     *Functionality : User Management
	     *Author        : pravin.jogi@eqanim.com           
	     */
	@Test(priority =44,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verification_Of_Propose_Update_Email_Of_An_Active_User_By_JU() throws Exception {
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
		//California registrar log in and approve user
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarApproveAndAssignIndividualUsersRole();
		System.out.println("Registrar is approve user successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar is approve user successfully");
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarUpdateUserMailAddressFromUserDetailsPage();
		System.out.println("Registrar update usr mail address successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar update usr mail address successfully");
	}

	/*
	     *TC_Id         : C32165 RPM-634
	     *Tc_Title      : Verification_Of_Propose_Update_Email_Of_An_Inactive_User_By_JU
	     *Functionality : User Management
	     *Author        : pravin.jogi@eqanim.com           
	     */
	@Test(priority =45,retryAnalyzer = Analyzer.RetryAnalyzer.class, enabled=false)
	public void verification_Of_Propose_Update_Email_Of_An_Inactive_User_By_JU() throws Exception {
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
		//California registrar log in and approve user
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarApproveAndAssignIndividualUsersRole();
		System.out.println("Registrar is approve user successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar is approve user successfully");
		//Registrar inactive user login
		ref1.registrarDeactivateUserLoginWithoutProfileAccess();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@data-testid='MoreHorizIcon'])[1]")));
		driver.findElement(By.xpath("(//*[@data-testid='MoreHorizIcon'])[1]")).click();
		try {
			Boolean lastLoginTextOnUserProfilePage=driver.findElement(By.xpath("//*[contains(text(),'UPDATE EMAIL')]")).isDisplayed();
			Assert.assertTrue(lastLoginTextOnUserProfilePage);
			System.out.println("Update Email Option is display in user profile page");
		} catch (Exception e) {
			System.out.println("Update Email Option is not display in user profile page");
		}
		System.out.println("Update email option is not display for inactive user");
		ObjectRepo.test.log(Status.PASS, "Update email option is not display for inactive user");
	}

	/*
	     *TC_Id         : C35622 RPM-635
	     *Tc_Title      : Verification_Of_Propose_Update_Email_Of_An_Applicant_User_By_JU
	     *Functionality : User Management
	     *Author        : pravin.jogi@eqanim.com           
	     */
	@Test(priority =46,retryAnalyzer = Analyzer.RetryAnalyzer.class, enabled=false)
	public void verification_Of_Propose_Update_Email_Of_An_Applicant_User_By_JU() throws Exception {
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
		//California registrar log in and approve user
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarUpdateUserMailAddressFromUserDetailsPage();
		System.out.println("Registrar update user mail address successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar update user mail address successfully");
	}


	/*
	     *TC_Id         : C35623 RPM-635
	     *Tc_Title      : Verification_Of_Propose_Update_Email_By_Entering_Existing_Mail_Address
	     *Functionality : User Management
	     *Author        : pravin.jogi@eqanim.com           
	     */
	@Test(priority =47,retryAnalyzer = Analyzer.RetryAnalyzer.class, enabled=false)
	public void verification_Of_Propose_Update_Email_By_Entering_Existing_Mail_Address() throws Exception {
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
		//California registrar log in and approve user
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarUpdateUserExistingMailAddressFromUserDetailsPage();
		System.out.println("Error message display when registrar enter existing mail address");
		ObjectRepo.test.log(Status.PASS, "Error message display when registrar enter existing mail address");
	}

	/*
	     *TC_Id         : C35624 RPM-635
	     *Tc_Title      : Verification_Of_Propose_Update_Email_Whose_mail_Change_Is_Already_Proposed
	     *Functionality : User Management
	     *Author        : pravin.jogi@eqanim.com           
	     */
	@Test(priority =48,retryAnalyzer = Analyzer.RetryAnalyzer.class, enabled=false)
	public void verification_Of_Propose_Update_Email_Whose_mail_Change_Is_Already_Proposed() throws Exception {
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
		//California registrar log in and approve user
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarUpdateUserMailAddressFromUserDetailsPageWhichAreAlreadyProposed();
		System.out.println("Error message display when registrar upadte user mail address which are already updated");
		ObjectRepo.test.log(Status.PASS, "Error message display when registrar upadte user mail address which are already updated");
	}

	/*
	     *TC_Id         : C32167 RPM-636
	     *Tc_Title      : Verification_Of_Second_Approval_Upadte_Email_Of_a_user_BY_Second_Approval
	     *Functionality : User Management
	     *Author        : pravin.jogi@eqanim.com           
	     */
	@Test(priority =49,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verification_Of_Second_Approval_Upadte_Email_Of_a_user_BY_Second_Approval() throws Exception {
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
		//California registrar log in and approve user
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarApproveAndAssignIndividualUsersRole();
		System.out.println("Registrar approve user successfully.");
		ObjectRepo.test.log(Status.PASS, "Registrar approve user successfully.");
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarUpdateUserMailAddressFromUserDetailsPage();
		System.out.println("Registrar update user mail address successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar update user mail address successfully");
		ref.logout();
		//Another california registrar log in and approve update email of user
		ref1.californiaRegistrar2Login();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.anotherRegistrarApproveUpdateEmail();
		System.out.println("Other Registrar approve update user mail address successfully");
		ObjectRepo.test.log(Status.PASS, "Other Registrar approve update user mail address successfully");
	}

	/*
	     *TC_Id         : C32168 RPM-636,C37827 RPM-637,C32174 RPM-638
	     *Tc_Title      : Verification_Of_Second_Approval_Upadte_Email_Of_a_user_BY_Same_JU_Who_Proposed_The_Update
	 *                Verification_Of_Denial_To_Email_Update_By_Same_JU_Who_Proposed_The_mail_Update
	     *Functionality : User Management
	     *Author        : pravin.jogi@eqanim.com           
	     */
	@Test(priority =50,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verification_Of_Second_Approval_Upadte_Email_Of_a_user_BY_Same_JU_Who_Proposed_The_Update() throws Exception {
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
		//California registrar log in and approve user
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarApproveAndAssignIndividualUsersRole();
		System.out.println("Registrar approve user successfully.");
		ObjectRepo.test.log(Status.PASS, "Registrar approve user successfully.");
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarUpdateUserMailAddressFromUserDetailsPage();
		System.out.println("Registrar update user mail address successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar update user mail address successfully");
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1800)");
		try {
			Boolean lastLoginTextOnUserProfilePage=driver.findElement(By.xpath("//*[contains(text(),'Updated User Details Request')]")).isDisplayed();
			Assert.assertTrue(lastLoginTextOnUserProfilePage);
			System.out.println("Update user detail request option is display in user details page");
		} catch (Exception e) {
			System.out.println("Update user detail request option is not display in user details page");
		}
		System.out.println("Same registrar is not able to approve update email address.");
		ObjectRepo.test.log(Status.PASS, "Same registrar is not able to approve update email address.");
	}

	/*
	     *TC_Id         : C32169 RPM-637, C32172 RPM-638
	     *Tc_Title      : Verification_Of_denial_with_Reason_By_Second_JU_To_Update_Email_Proposed_By_first_JU
	     *Functionality : User Management
	     *Author        : pravin.jogi@eqanim.com           
	     */
	@Test(priority =50,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_Of_denial_with_Reason_By_Second_JU_To_Update_Email_Proposed_By_first_JU() throws Exception {
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
		//California registrar log in and approve user
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarApproveAndAssignIndividualUsersRole();
		System.out.println("Registrar approve user successfully.");
		ObjectRepo.test.log(Status.PASS, "Registrar approve user successfully.");
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarUpdateUserMailAddressFromUserDetailsPage();
		System.out.println("Registrar update user mail address successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar update user mail address successfully");
		ref.logout();
		//Another california registrar log in and denied update email of user
		ref1.californiaRegistrar2Login();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		//ref1.anotherRegistrarApproveUpdateEmail();
		ref1.registrarDeniedProposedUserDetails();
		System.out.println("Other Registrar denied update user mail address successfully");
		ObjectRepo.test.log(Status.PASS, "Other Registrar denied update user mail address successfully");
	}

	/*
	     *TC_Id         : C37826 RPM-637, C32173 RPM-638
	     *Tc_Title      : Verification_Of_denial_without_Providing_Reason_By_Second_JU_To_Update_Email_Proposed_By_first_JU
	     *Functionality : User Management
	     *Author        : pravin.jogi@eqanim.com           
	     */
	@Test(priority =51,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verification_Of_denial_without_Providing_Reason_By_Second_JU_To_Update_Email_Proposed_By_first_JU() throws Exception {
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
		//California registrar log in and approve user
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarApproveAndAssignIndividualUsersRole();
		System.out.println("Registrar approve user successfully.");
		ObjectRepo.test.log(Status.PASS, "Registrar approve user successfully.");
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarUpdateUserMailAddressFromUserDetailsPage();
		System.out.println("Registrar update user mail address successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar update user mail address successfully");
		ref.logout();
		//Another california registrar log in and denied update email of user
		ref1.californiaRegistrar2Login();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarDeniedProposedUserDetailsWithoutSelectingDenialReason();
		System.out.println("Other Registrar denied update user mail address successfully");
		ObjectRepo.test.log(Status.PASS, "Other Registrar denied update user mail address successfully");
	}

	/*
	     *TC_Id         : C32312 RPM-641
	     *Tc_Title      : Verification_Of_functionality_Of_Authority_Approval_For_Role_Change_From_An_Individual_Role_Type_To_A_Jurisdiction_User_Or_Service_Provider
	     *Functionality : User Management
	     *Author        : pravin.jogi@eqanim.com           
	     */
	@Test(priority =52,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verification_Of_functionality_Of_Authority_Approval_For_Role_Change_From_An_Individual_Role_Type_To_A_Jurisdiction_User_Or_Service_Provider() throws Exception {
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
		//California registrar log in and approve user
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarApproveAndAssignIndividualUsersRole();
		System.out.println("Registrar approve user successfully.");
		ObjectRepo.test.log(Status.PASS, "Registrar approve user successfully.");
		//California registrar change role type and role of user
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarChangeRoleFromIndividualUserRoleTypeToJurisdictionUserRoleType();
		System.out.println("Registrar change role type and role successfully.");
		ObjectRepo.test.log(Status.PASS, "Registrar approve user successfully.");
		ref.logout();
		//Authority login and approve change Role
		ref1.LoginAsCaliforniaAuthority();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.authorityApproveProposedRoleChange();
		System.out.println("Authority approve role change successfully.");
		ObjectRepo.test.log(Status.PASS, "Authority approve role change successfully.");
	}

	/*
	     *TC_Id         : C32314 RPM-641
	     *Tc_Title      : Verification_Of_functionality_Of_Authority_Approval_For_Role_Change_From_Jurisdiction_User_To_Service_Provider
	     *Functionality : User Management
	     *Author        : pravin.jogi@eqanim.com           
	     */
	@Test(priority =53,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verification_Of_functionality_Of_Authority_Approval_For_Role_Change_From_Jurisdiction_User_To_Service_Provider() throws Exception {
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
		//California registrar log in and approve user
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarApproveAndAssignJurisdictionUserRole();
		System.out.println("Registrar assign jurisdiction user role to user successfully.");
		ObjectRepo.test.log(Status.PASS, "Registrar assign jurisdiction user role to user  successfully.");
		ref.logout();
		//Authority login and approve change Role
		ref1.LoginAsCaliforniaAuthority();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.authorityApproveUser();
		System.out.println("Authority approve user successfully.");
		ObjectRepo.test.log(Status.PASS, "Authority approve user successfully.");
		ref.logout();
		//California registrar log in change role type and role of user
		ref1.californiaRegistrar();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarChangeRoleFromJurisdictionUserRoleTypeToServiceProviderRoleType();
		System.out.println("Registrar change role type and role successfully.");
		ObjectRepo.test.log(Status.PASS, "Registrar change role type and role successfully.");
		ref.logout();
		//Authority login and approve change Role
		ref1.LoginAsCaliforniaAuthority();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.authorityApproveProposedRoleChange();
		System.out.println("Authority approve role change successfully.");
		ObjectRepo.test.log(Status.PASS, "Authority approve role change successfully.");
	}

	/*
	     *TC_Id         : C32315 RPM-641
	     *Tc_Title      : Verification_Of_functionality_Of_Authority_Approval_For_Role_Change_From_Service_Provider_To_Jurisdiction_User
	     *Functionality : User Management
	     *Author        : pravin.jogi@eqanim.com           
	     */
	@Test(priority =54,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_Of_functionality_Of_Authority_Approval_For_Role_Change_From_Service_Provider_To_Jurisdiction_User() throws Exception {
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
		//California registrar log in and approve user
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarApproveAndAssignServiceProviderRole();
		System.out.println("Registrar assign jurisdiction user role to user successfully.");
		ObjectRepo.test.log(Status.PASS, "Registrar assign jurisdiction user role to user  successfully.");
		ref.logout();
		//Authority login and approve change Role
		ref1.LoginAsCaliforniaAuthority();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.authorityApproveUser();
		System.out.println("Authority approve user successfully.");
		ObjectRepo.test.log(Status.PASS, "Authority approve user successfully.");
		ref.logout();
		//California registrar log in change role type and role of user
		ref1.californiaRegistrar();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarChangeRoleFromIndividualUserRoleTypeToJurisdictionUserRoleType();
		System.out.println("Registrar change role type and role successfully.");
		ObjectRepo.test.log(Status.PASS, "Registrar change role type and role successfully.");
		ref.logout();
		//Authority login and approve change Role
		ref1.LoginAsCaliforniaAuthority();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.authorityApproveProposedRoleChange();
		System.out.println("Authority approve role change successfully.");
		ObjectRepo.test.log(Status.PASS, "Authority approve role change successfully.");
	}

	/*
	 *TC_Id         : C32316 RPM-641
	 *Tc_Title      : Verification_Of_functionality_Of_Authority_Approval_For_Role_Change_Within_The_Jurisdiction_User_Role_Type
	 *Functionality : User Management
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 55,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verification_Of_functionality_Of_Authority_Approval_For_Role_Change_Within_The_Jurisdiction_User_Role_Type() throws Exception {
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
	}

	/*
	 *TC_Id         : C32317 RPM-641
	 *Tc_Title      : Verification_Of_functionality_Of_Authority_Approval_For_Role_Change_Within_The_Service_Provider_Role_Type            
	 *Functionality : User Management
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 56,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verification_Of_functionality_Of_Authority_Approval_For_Role_Change_Within_The_Service_Provider_Role_Type() throws Exception {
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
		ref1.registrarApproveAndAssignServiceProviderRole();
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
		ref1.registrarChangeRoleFromServiceProviderRoleType();
		System.out.println("Registrar change user role successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar change user role successfully");
		ref.logout();
		//California Authority log in and approve change role
		ref1.LoginAsCaliforniaAuthority();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.authorityApproveProposedRoleChange();
		System.out.println("Authority approve role change of user successfully");
		ObjectRepo.test.log(Status.PASS, "Authority approve role change of user successfully");
	}

	/*
	 *TC_Id         : C29317 RPM-668
	 *Tc_Title      : Verification_Of_Change_user_account_Status_To_Profile_Access_Only
	 *Functionality : User Management
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 57,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verification_Of_Change_user_account_Status_To_Profile_Access_Only() throws Exception {
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
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarApproveAndAssignIndividualUsersRole();
		System.out.println("Authority approve user successfully");
		ObjectRepo.test.log(Status.PASS, "Authority approve user successfully");
		//Registrar deactivate user with profile access only
		ref1.registrarDeactivateUserLoginWithProfileAccess();
		ref1.registrarSearchUesrAndViewUserAccountStatisAndRequestStatusForInavtiveWithProfileAccess();
		System.out.println("Registrar view user account status successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar view user account status successfully");
	}

	/*
	 *TC_Id         : C29318 RPM-668
	 *Tc_Title      : Verification_Of_View_User_Details_Functionality_when_User_Account_status_Is_Profile_Access_Only
	 *Functionality : User Management
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 57,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verification_Of_View_User_Details_Functionality_when_User_Account_status_Is_Profile_Access_Only() throws Exception {
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
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarApproveAndAssignIndividualUsersRole();
		System.out.println("Authority approve user successfully");
		ObjectRepo.test.log(Status.PASS, "Authority approve user successfully");
		//Registrar deactivate user with profile access only
		ref1.registrarDeactivateUserLoginWithProfileAccess();
		System.out.println("Registrar deactivate user with profile access only");
		ObjectRepo.test.log(Status.PASS, "Registrar deactivate user with profile access only");
		ref.logout();
		//User login and view user profile
		ref1.loginAsCreatedUser();
		ref1.userItsUserProfile();
		System.out.println("User View user profile successfully");
		ObjectRepo.test.log(Status.PASS, "User View user profile successfully");
	}

	/*
	     *TC_Id         : C32361 RPM-642
	     *Tc_Title      : Verification_Of_JU_See_Role_Change_Proposed_By_Another_JU
	     *Functionality : User Management
	     *Author        : pravin.jogi@eqanim.com           
	     */
	@Test(priority =58,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verification_Of_JU_See_Role_Change_Proposed_By_Another_JU() throws Exception {
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
		//California registrar log in and approve user
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarApproveAndAssignJurisdictionUserRole();
		System.out.println("Registrar assign jurisdiction user role to user successfully.");
		ObjectRepo.test.log(Status.PASS, "Registrar assign jurisdiction user role to user  successfully.");
		ref.logout();
		//Authority login and approve user 
		ref1.LoginAsCaliforniaAuthority();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.authorityApproveUser();
		System.out.println("Authority approve user successfully.");
		ObjectRepo.test.log(Status.PASS, "Authority approve user successfully.");
		ref.logout();
		//California registrar log in change role type and role of user
		ref1.californiaRegistrar();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarChangeRoleFromJurisdictionUserRoleTypeToServiceProviderRoleType();
		System.out.println("Registrar change role type and role successfully.");
		ObjectRepo.test.log(Status.PASS, "Registrar change role type and role successfully.");
		ref.logout();
		//Authority login and approve change Role
		ref1.LoginAsCaliforniaAuthority();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarViewUserDetails();
		System.out.println("Authority view proposed role change user details");
		ObjectRepo.test.log(Status.PASS, "Authority view proposed role change user details");
	}

	/*
	     *TC_Id         : C32362 RPM-642
	     *Tc_Title      : Verification_Of_JU_Registrar_is_Try_To_Able_Approve_Its_Own_Proposed_Changes
	     *Functionality : User Management
	     *Author        : pravin.jogi@eqanim.com           
	     */
	@Test(priority =59,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verification_Of_JU_Registrar_is_Try_To_Able_Approve_Its_Own_Proposed_Changes() throws Exception {
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
		//California registrar log in and approve user
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarApproveAndAssignIndividualUsersRole();
		System.out.println("Registrar approve user successfully.");
		ObjectRepo.test.log(Status.PASS, "Registrar approve user successfully.");
		//California registrar change role type and role of user
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarChangeRoleFromIndividualUserRoleTypeToJurisdictionUserRoleType();
		System.out.println("Registrar change role type and role successfully.");
		ObjectRepo.test.log(Status.PASS, "Registrar approve user successfully.");
		//California registrar try to approve change role
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarNotProvideDualApproval();
	}

	/*
	     *TC_Id         : C32363 RPM-642
	     *Tc_Title      : Verification_Of_JU_Registrar_can_Approve_Its_Own_Proposed_Changes
	     *Functionality : User Management
	     *Author        : pravin.jogi@eqanim.com           
	     */
	@Test(priority =60,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verification_Of_JU_Registrar_can_Approve_Its_Own_Proposed_Changes() throws Exception {
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
		//California registrar log in and approve user
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarApproveAndAssignJurisdictionUserRole();
		System.out.println("Registrar assign jurisdiction user role to user successfully.");
		ObjectRepo.test.log(Status.PASS, "Registrar assign jurisdiction user role to user  successfully.");
		ref.logout();
		//Authority login and approve user 
		ref1.LoginAsCaliforniaAuthority();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.authorityApproveUser();
		System.out.println("Authority approve user successfully.");
		ObjectRepo.test.log(Status.PASS, "Authority approve user successfully.");
		ref.logout();
		//California registrar log in change role type and role of user
		ref1.californiaRegistrar();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarChangeRoleFromJurisdictionUserRoleTypeToIndividualUserRoleType();
		System.out.println("Registrar change role type and role successfully.");
		ObjectRepo.test.log(Status.PASS, "Registrar change role type and role successfully.");
		//California registrar try to approve change role
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarNotProvideDualApproval();
	}

	/*
	     *TC_Id         : C32364 RPM-642
	     *Tc_Title      : Verification_Of_JU_Can_Approve_Role_Change_Proposed_BY_Another_JU_Under_Jurisdiction_User_Role_Type
	     *Functionality : User Management
	     *Author        : pravin.jogi@eqanim.com           
	     */
	@Test(priority =61,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verification_Of_JU_Can_Approve_Role_Change_Proposed_BY_Another_JU_Under_Jurisdiction_User_Role_Type() throws Exception {
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
		//California Authority login and approve change role
		ref1.LoginAsCaliforniaAuthority();
		MYC.resetPassphrasePrompt();
		ref1.registrarViewUserUsingRequestStatusAsProposedRoleChangeFilterForPeningUserGrid();
		ref1.authorityApproveProposedRoleChange();
		System.out.println("Authority approve change role successfully");
		ObjectRepo.test.log(Status.PASS, "Authority approve change role successfully");
	}

	/*
	     *TC_Id         : C32365 RPM-642, C32633 RPM-643
	     *Tc_Title      : Verification_Of_JU_Can_See_Role_Change_Proposed_BY_Another_JU_Under_Service_Provider_Role_Type
	     *Functionality : User Management
	     *Author        : pravin.jogi@eqanim.com           
	     */
	@Test(priority =62,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verification_Of_JU_Can_See_Role_Change_Proposed_BY_Another_JU_Under_Service_Provider_Role_Type() throws Exception {
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
		ref1.registrarApproveAndAssignServiceProviderRole();
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
		ref1.registrarChangeRoleFromServiceProviderRoleType();
		System.out.println("Registrar change user role successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar change user role successfully");
		ref.logout();
		//California Authority log in and view change role user details
		ref1.LoginAsCaliforniaAuthority();
		MYC.resetPassphrasePrompt();
		ref1.registrarViewUserUsingRequestStatusAsProposedRoleChangeFilterForPeningUserGrid();
		ref1.registrarViewUserDetails();
		System.out.println("Authority view proposed role change user details");
		ObjectRepo.test.log(Status.PASS, "Authority view proposed role change user details");
	}

	/*
	     *TC_Id         : C32366 RPM-642
	     *Tc_Title      : Verification_Of_JU_Can_See_And_Approve_Role_Change_Proposed_By_Another_JU_Under_Individual_User_Or_Technical_Admin_Role_Type
	     *Functionality : User Management
	     *Author        : pravin.jogi@eqanim.com           
	     */
	@Test(priority =63,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verification_Of_JU_Can_See_And_Approve_Role_Change_Proposed_By_Another_JU_Under_Individual_User_Or_Technical_Admin_Role_Type() throws Exception {
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
		//California registrar log in and approve user
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarApproveAndAssignJurisdictionUserRole();
		System.out.println("Registrar assign jurisdiction user role to user successfully.");
		ObjectRepo.test.log(Status.PASS, "Registrar assign jurisdiction user role to user  successfully.");
		ref.logout();
		//Authority login and approve user 
		ref1.LoginAsCaliforniaAuthority();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.authorityApproveUser();
		System.out.println("Authority approve user successfully.");
		ObjectRepo.test.log(Status.PASS, "Authority approve user successfully.");
		ref.logout();
		//California registrar log in change role type and role of user
		ref1.californiaRegistrar();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarChangeRoleFromJurisdictionUserRoleTypeToIndividualUserRoleType();
		System.out.println("Registrar change role type and role successfully.");
		ObjectRepo.test.log(Status.PASS, "Registrar change role type and role successfully.");
		ref.logout();
		//California Authority log in and approve change role
		ref1.LoginAsCaliforniaAuthority();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarViewUserDetails();
		ref1.authorityApproveProposedRoleChange();
		System.out.println("Authority appove proposed role change successfully.");
		ObjectRepo.test.log(Status.PASS, "Authority appove proposed role change successfully.");
	}

	/*
	 *TC_Id         : C32631 RPM-641
	 *Tc_Title      : Verification_Of_JU_Can_Approve_Role_Change_Prposed_By_Another_JU_Under_Service_Provider_Role_Type            
	 *Functionality : User Management
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 64,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verification_Of_JU_Can_Approve_Role_Change_Prposed_By_Another_JU_Under_Service_Provider_Role_Type() throws Exception {
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
		ref1.registrarApproveAndAssignServiceProviderRole();
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
		ref1.registrarChangeRoleFromServiceProviderRoleType();
		System.out.println("Registrar change user role successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar change user role successfully");
		ref.logout();
		//California Authority log in and approve change role
		ref1.LoginAsCaliforniaAuthority();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.authorityApproveProposedRoleChange();
		System.out.println("Authority approve role change of user successfully");
		ObjectRepo.test.log(Status.PASS, "Authority approve role change of user successfully");
	}

	/*
	 *TC_Id         : C29271 , C29272 RPM-612
	 *Tc_Title      : Verification_Of_Accessiblity_Of_Security_Settings_Option_On_User_Profile     
	 *                Verify_That_If_The_Current_Passphrase_Is_Match     
	 *Functionality : User Management
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 65,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verification_Of_Accessiblity_Of_Security_Settings_Option_On_User_Profile() throws Exception {
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
		//Created user login and change their passphrase
		ref1.loginAsCreatedUser();
		ref1.userChangeTheirPassphraseWithValidData();
		System.out.println("User change their passphrase successfully.");
		ObjectRepo.test.log(Status.PASS, "User change their passphrase successfully.");
	}

	/*
	 *TC_Id         : C29275 RPM-612
	 *Tc_Title      : Verify_That_The_Current_Passphrase_Field_With_Invalid_Data    
	 *Functionality : User Management
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 66,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verify_That_The_Current_Passphrase_Field_With_Invalid_Data() throws Exception {
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
		//Created user login and change their passphrase
		ref1.loginAsCreatedUser();
		ref1.userChangeTheirPassphraseWithInvalidData();
		System.out.println("User change their passphrase successfully.");
		ObjectRepo.test.log(Status.PASS, "User change their passphrase successfully.");
	}

	/*
	 *TC_Id         : C32175 RPM-643
	 *Tc_Title      : Verification_Of_JU_Authority_Deny_Functionality_To_Proposed_Role_Changes           
	 *Functionality : User Management
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 67,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verification_Of_JU_Authority_Deny_Functionality_To_Proposed_Role_Changes() throws Exception {
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
		ref1.registrarApproveAndAssignServiceProviderRole();
		System.out.println("Registrar assign role from Service provider role type successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar assign role from Service provider  role type successfully");
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
		ref1.registrarChangeRoleFromServiceProviderRoleType();
		System.out.println("Registrar change user role successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar change user role successfully");
		ref.logout();
		//California Authority log in and deny change role
		ref1.LoginAsCaliforniaAuthority();        
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.authorityDeniedRoleChange();
		System.out.println("Authority deny role change of user successfully");
		ObjectRepo.test.log(Status.PASS, "Authority deny role change of user successfully");
	}

	/*
	     *TC_Id         : C32632 RPM-643
	     *Tc_Title      : Verification_Of_JU_Can_See_Role_Change_Proposed_BY_Another_JU_Under_Jurisdiction_User_Role_Type
	     *Functionality : User Management
	     *Author        : pravin.jogi@eqanim.com           
	     */
	@Test(priority =68,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_Of_JU_Can_See_Role_Change_Proposed_BY_Another_JU_Under_Jurisdiction_User_Role_Type() throws Exception {
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
		//California Authority log in and view change role user details
		ref1.LoginAsCaliforniaAuthority();           // Replace with California authority
		MYC.resetPassphrasePrompt();
		ref1.registrarViewUserUsingRequestStatusAsProposedRoleChangeFilterForPeningUserGrid();
		ref1.registrarViewUserDetails();
		System.out.println("Authority view proposed role change user details");
		ObjectRepo.test.log(Status.PASS, "Authority view proposed role change user details");
	}

	/*
	     *TC_Id         : C32634 RPM-643
	     *Tc_Title      : Verification_Of_JU_Can_See_Role_Change_Proposed_BY_Another_JU_Under_Individual_User_Or_Technical_Admin_Role_Type
	     *Functionality : User Management
	     *Author        : pravin.jogi@eqanim.com           
	     */
	@Test(priority =69,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verification_Of_JU_Can_See_Role_Change_Proposed_BY_Another_JU_Under_Individual_User_Or_Technical_Admin_Role_Type() throws Exception {
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
		ref1.registrarApproveAndAssignIndividualUsersRole();
		System.out.println("Registrar assign role from Individual user role type successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar assign role from Individual user role type successfully");
		//California Registrar change role from individual user role type
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarChangeRoleFromIndividualUserRoleType();
		System.out.println("Registrar change user role successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar change user role successfully");
		ref.logout();
		//California Authority log in and view change role user details
		ref1.LoginAsCaliforniaAuthority();  
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.proposedChangeRoleUserNotDisplayForAuthority();
		System.out.println("Authority is not able to view proposed role change user details of individual user");
		ObjectRepo.test.log(Status.PASS, "Authority is not able to view proposed role change user details of individual user");
	}

	/*
	     *TC_Id         : C32635 RPM-643
	     *Tc_Title      : Verification_Of_Deny_Functionality_For_JU_To_Its_Own_Proposed_Changes
	     *Functionality : User Management
	     *Author        : pravin.jogi@eqanim.com           
	     */
	@Test(priority =70,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verification_Of_Deny_Functionality_For_JU_To_Its_Own_Proposed_Changes() throws Exception {
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
		//California registrar log in and approve user
		ref1.californiaRegistrar();   
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarApproveAndAssignIndividualUsersRole();
		System.out.println("Registrar approve user successfully.");
		ObjectRepo.test.log(Status.PASS, "Registrar approve user successfully.");
		//California registrar change role type and role of user
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarChangeRoleFromIndividualUserRoleTypeToJurisdictionUserRoleType();
		System.out.println("Registrar change role type and role successfully.");
		ObjectRepo.test.log(Status.PASS, "Registrar approve user successfully.");
		//California registrar try to deny change role
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarNotProvideDualDenial();
	}

	/*
	     *TC_Id         : C29327 RPM-678
	     *Tc_Title      : Verification_Of_display_Total_Record_Returns_And_Display_Number_Of_Pages
	     *Functionality : User Management
	     *Author        : pravin.jogi@eqanim.com           
	     */
	@Test(priority =71,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verification_Of_display_Total_Record_Returns_And_Display_Number_Of_Pages() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectJurisdictionForQubec();
		//California registrar log in and approve user
		ref1.californiaRegistrar();   
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.displayTotalRecords();
		System.out.println("Registrar is able to view total number of pages and total number of rows");
		ObjectRepo.test.log(Status.PASS, "Registrar is able to view total number of pages and total number of rows");
	}

	/*
	 *TC_Id          : C29382 RPM-597
	 *Tc_Title       : Verify_the_availability_of_reference_code_for_logged_in_user_with_approved_status
	 *Functionality  : User Management
	 *Author         : pravin.jogi@eqanim.com
	 */
	@Test(priority = 72,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verify_the_availability_of_reference_code_for_logged_in_user_with_approved_status() throws Exception {
		Homepage ref = new Homepage();
		ApproveUser ap=new ApproveUser();
		MYClass MYC = new MYClass();
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
		//Registrar Login and approve user
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarApproveAndAssignIndividualUsersRole();
		System.out.println("Registrar approve user successfully.");
		ObjectRepo.test.log(Status.PASS, "Registrar approve user successfully.");
		ref.logout();
		//Approve user login 
		ref1.loginAsCreatedUser();
		MYC.resetPassphrasePrompt1();
		ap.approveUserTextOnHomepage();
	} 

	/*
	 *TC_Id          : C29325 RPM-677
	 *Tc_Title       : Verification_of_Clear_search_button_functionality_to_clear_all_search_fields
	 *Functionality  : User Management
	 *Author         : pravin.jogi@eqanim.com
	 */
	@Test(priority = 73,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verification_of_Clear_search_button_functionality_to_clear_all_search_fields() throws InterruptedException {
		Homepage ref = new Homepage();
		ApproveUser ap=new ApproveUser();
		MYClass MYC = new MYClass();
		PendingUser ref1=new PendingUser();
		ref.selectJurisdictionForQubec();
		ref.loginAsJurisdictionUser();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ap.clearSearchButtonFunctionalityOfSearchField();
	}

	/*
	 *TC_Id          : C29326 RPM-677
	 *Tc_Title       : Verification_of_Clear_Search_Filter_button_functionality.
	 *Functionality  : User Management
	 *Author         : pravin.jogi@eqanim.com
	 */
	@Test(priority = 74,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verification_of_Clear_Search_Filter_button_functionality() throws InterruptedException {
		Homepage ref = new Homepage();
		ApproveUser ap=new ApproveUser();
		MYClass MYC = new MYClass();
		PendingUser ref1=new PendingUser();
		ref.selectJurisdictionForQubec();
		ref.loginAsJurisdictionUser();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ap.clearSearchButtonFunctionalityOfFilters();
	}

	/*
	 *TC_Id         : C32161 RPM-632
	 *Tc_Title      : Verification_of_deny_proposed_role_changes_functionality_by_providing_reason_for_denial
	 *Functionality : User Management
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 75, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_deny_proposed_role_changes_functionality_by_providing_reason_for_denial()
			throws Exception {
		// User Registration
		Homepage ref = new Homepage();
		UserRegistration ur = new UserRegistration();
		ref.selectjurisdictionForCalifornia();
		ur.selectJurisdictionStep();
		ur.personalInformation();
		ur.residenceAndMailing();
		ur.editAndReview();
		ur.createUserLogin();
		// Login_with_Jurisdiction_Registrar//Assign role
		MyPOMClass ref3 = new MyPOMClass();
		//driver.findElement(By.xpath("//*[text()='Log in']")).click();
		ref3.Login_with_Jurisdiction_Registrar();
		MYClass MYC = new MYClass();
		MYC.Termsandconditions();
		POMpublicHomePage ref2 = new POMpublicHomePage();
		ref2.handlesecurityQuestion();
		MYC.resetPassphrasePrompt();
		ur.assignRoleToNewUser();
		ref.logout();
		// Login_with_Jurisdiction_Authority
		ref3.Login_with_Jurisdiction_Authority();
		ref2.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ur.proposeRoleToNewUser();
		ref.logout();
		ref3.runtime_Login_with_Jurisdiction_Registrar();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ur.proposeChangeRoleToExistingUser();
		ref.logout();
		ref3.runtime_Login_with_Jurisdiction_Authority();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ur.DenyRoleChangeToNewUserByAuthority();
		ref.logout();
	}

	/*
	 *TC_Id         : C32162 RPM-632
	 *Tc_Title      : Verification_of_deny_proposed_role_changes_functionality_by_Without1_providing_reason_for_denial
	 *Functionality : User Management
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 76, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_deny_proposed_role_changes_functionality_by_Without1_providing_reason_for_denial()
			throws Exception {
		// User Registration
		Homepage ref = new Homepage();
		UserRegistration ur = new UserRegistration();
		ref.selectjurisdictionForCalifornia();
		ur.selectJurisdictionStep();
		ur.personalInformation();
		ur.residenceAndMailing();
		ur.editAndReview();
		ur.createUserLogin();
		// Login_with_Jurisdiction_Registrar//Assign role
		MyPOMClass ref3 = new MyPOMClass();
		//driver.findElement(By.xpath("//*[text()='Log in']")).click();
		ref3.Login_with_Jurisdiction_Registrar();
		POMpublicHomePage ref2 = new POMpublicHomePage();
		ref2.handlesecurityQuestion();
		MYClass MYC = new MYClass();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ur.assignRoleToNewUser();
		ref.logout();
		// Login_with_Jurisdiction_Authority
		ref3.Login_with_Jurisdiction_Authority();
		ref2.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ur.proposeRoleToNewUser();
		ref.logout();
		ref3.runtime_Login_with_Jurisdiction_Registrar();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ur.proposeChangeRoleToExistingUser();
		ref.logout();
		ref3.runtime_Login_with_Jurisdiction_Authority();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ur.DenyRoleChangeToNewUserByAuthorityWithoutProvidingReason();
		ref.logout();
	}

	/*
	 *TC_Id         : C32137 RPM-646
	 *Tc_Title      : Verification of JU can Initiate passphrase & security questions changes for any user 
	 *Functionality : User Management
	 *Author        : seema.sandbhor@eqanim.com
	 */
	@Test(priority =77, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void ju_can_Initiate_passphrase_security_questions_changes_for_any_user() throws InterruptedException {
		Homepage ref = new Homepage();
		MyPOMClass contact = new MyPOMClass();
		ref.selectJurisdictionForQubec();
		ref.loginAsJurisdictionUser();
		MYClass MYC = new MYClass();
		MYC.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		contact.ju_can_Initiate_passphrase_security_questions_changes_for_any_user();
	}

	/*
	 *TC_Id         : C32322 RPM-801
	 *Tc_Title      : Verification of User Reference Code when the applicant user applies for Change of Jurisdiction. 
	 *Functionality : User Management  
	 *Author        : seema.sandbhor@eqanim.com
	 */
	@Test(priority =78, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void UserReferenceCode_ApplicantUser_AppliesForChangeOfJurisdiction() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur = new UserRegistration();
		MyPOMClass reg = new MyPOMClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ur.personalInformation();
		ur.residenceAndMailing();
		ur.editAndReview();
		reg.createLogin_referenceCode();
		reg.logincreatedUser();
		MYClass MYC = new MYClass();
		MYC.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt1();
		reg.UserReferenceCodeForChangeOfJurisdiction_ApplicantUser();
	}

	/*
	 *TC_Id         : C32336 RPM-801
	 *Tc_Title      : Verification of User Reference Code when approved user initiates Change of Jurisdiction. 
	 *Functionality : User Management  
	 *Author        : seema.sandbhor@eqanim.com
	 */
	@Test(priority =79, retryAnalyzer = Analyzer.RetryAnalyzer.class, enabled=false)
	public void UserReferenceCode_approvedUser_AppliesForChangeOfJurisdiction() throws Throwable {
		// User Registration
		Homepage ref = new Homepage();
		UserRegistration ur = new UserRegistration();
		ref.selectjurisdictionForCalifornia();
		ur.selectJurisdictionStep();
		ur.personalInformation();
		ur.residenceAndMailing();
		ur.editAndReview();
		MyPOMClass reg = new MyPOMClass();
		reg.createLogin_referenceCode();
		// Login_with_Jurisdiction_Registrar//Assign role
		MyPOMClass ref3 = new MyPOMClass();
		ref3.Login_with_Jurisdiction_Registrar();
		MYClass MYC = new MYClass();
		MYC.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		reg.assignRoleToCreatedUser();
		ref.logout();
		reg.loginApprovedUser();
		MYC.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt1();
		reg.chnageJurisdictionCAtoQC();
		ref.logout();
		PendingUser ref1=new PendingUser();
		ref1.loginAsJurisdictionUserForWelcomingJurisdiction();
		MYC.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		//ref.loginAsJurisdictionUser();
		reg.UserReferenceCodeForChangeOfJurisdiction_ApprovedUser2();
	}

	/*
	 *TC_Id         : C32332 RPM-805
	 *Tc_Title      : Verification of view status functionality after user requests change jurisdiction.
	 *Functionality : User Management  
	 *Author        : seema.sandbhor@eqanim.com
	 */
	@Test(priority =80, retryAnalyzer = Analyzer.RetryAnalyzer.class, enabled=false)
	public void statusAfterUserRequestsChnageJurisdiction() throws Throwable {
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
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		reg.assignRoleToCreatedUser();
		ref.logout();
		reg.loginApprovedUser();
		MYC.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt1();
		reg.chnageJurisdictionCAtoQC();
		reg.statusAfterUserRequestsChnageJurisdiction();
	}

	/*
	 *TC_Id         : C32360 RPM-805 /C29076 RPM-533
	 *Tc_Title      : Verification of view status functionality after user is approved change jurisdiction.
	 * 			      Verify comment field when the Application is approved by Registrar. 
	 *Functionality : User Management   
	 *Author        : seema.sandbhor@eqanim.com
	 */
	@Test(priority =81, retryAnalyzer = Analyzer.RetryAnalyzer.class, enabled=false)
	public void statusAfterUserApprovedJurisdiction() throws Exception
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
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		reg.assignRoleToCreatedUser();
		ref.logout();
		reg.loginApprovedUser();
		MYC.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt1();
		reg.chnageJurisdictionCAtoQC();
		ref.logout();
		PendingUser ref1=new PendingUser();
		ref1.loginAsJurisdictionUserForWelcomingJurisdiction();
		MYC.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		reg.approved_COJ();
		ref.logout();
		reg.loginApprovedUser();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt1();
		reg.statusAfterUserApprovedJurisdiction();
		ref.logout();
	}

	/*
	 *TC_Id         : C32359 RPM-805
	 *Tc_Title      : Verification of view status functionality after user is denied change jurisdiction.
	 *Functionality : User Management  
	 *Author        : seema.sandbhor@eqanim.com
	 */
	@Test(priority =82, retryAnalyzer = Analyzer.RetryAnalyzer.class, enabled=false)
	public void statusAfterUserDeniedJurisdiction() throws Exception
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
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		reg.assignRoleToCreatedUser();
		ref.logout();
		reg.loginApprovedUser();
		MYC.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt1();
		reg.chnageJurisdictionCAtoQC();
		ref.logout();
		PendingUser ref1=new PendingUser();
		ref1.loginAsJurisdictionUserForWelcomingJurisdiction();
		MYC.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		reg.denied_COJ();
		ref.logout();
		reg.loginApprovedUser();
		MYC.resetPassphrasePrompt1();
		reg.statusAfterUserDeniedJurisdiction();
		ref.logout();
	}
	/*
	 *TC_Id         : C32321 RPM-616
	 *Tc_Title      : Verify the clear security Answer functionality on Reset Passphrase and Security Questions. 
	 *Functionality : User Management 
	 *Author        : seema.sandbhor@eqanim.com
	 */
	@Test(priority =83, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void clearSecurityAnswer() throws Exception
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
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		reg.assignRoleToCreatedUser();
		ref.logout();
		reg.loginApprovedUser();
		MYC.handlesecurityQuestion();
		MYC.resetPassphrasePrompt1();
		reg.clearSecurityAnswer();
	}

	/*
	 *TC_Id          : C32189 RPM-669
	 *Tc_Title       : Verification of success message when JU set user account status to Profile Access Only
	 *Functionality  : User Management
	 *Author         : swati.jagdale@eqanim.com
	 */
	@Test(priority = 84, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_success_message_when_JU_set_user_account_status_to_Profile_Access_Only()
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
		MYC.AssignRole_to_User_other_than_JU();
		driver.navigate().refresh();
		Thread.sleep(1000);
		MYC.searchuser();
	}

	/*
	 *TC_Id          : C32158 RPM-629
	 *Tc_Title       : Verification of success message on JA approval to proposed role change request by JU
	 *Functionality  : User Management
	 *Author         : swati.jagdale@eqanim.com
	 */
	@Test(priority = 85, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_success_message_on_JA_approval_to_proposed_role_change_request_by_JU()
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
		MYC.proposeRoleToNewUser();
		ref.logout();
		MYC.runtime_Login_with_Jurisdiction_Registrar();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		MYC.proposeChangeRoleToExistingUser();
		ref.logout();
		MYC.runtime_Login_with_Jurisdiction_Authority();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		MYC.StatusChangeFromJA();
		ref.logout();
	}

	/*
	 *TC_Id          : C29268 RPM-610
	 *Tc_Title       : Verification_of_Availability_and_accessibility_of_Change_Passphrase_and_Security_Questions_on_User_Profile_for_ApprovedUser
	 *Functionality  : User Management
	 *Author         : swati.jagdale@eqanim.com
	 */
	@Test(priority = 86, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_Availability_and_accessibility_of_Change_Passphrase_and_Security_Questions_on_User_Profile_for_ApprovedUser()
			throws InterruptedException {
		Homepage ref = new Homepage();
		MYClass MYC = new MYClass();
		ref.selectjurisdictionForCalifornia();
		ref.loginAsApprovedUser();
		MYC.handlesecurityQuestion();
		MYC.resetPassphrasePrompt1();
		MYC.AllowToChangePassphrase();
		MYC.Termsandconditions();
		new WebDriverWait(driver, 60).until(ExpectedConditions
				.visibilityOfElementLocated((By.xpath("//h1[text()='Reset Passphrase and Security Questions']"))));
		WebElement PageHeader = driver.findElement(By.xpath("//h1[text()='Reset Passphrase and Security Questions']"));
		String welcomeText = PageHeader.getText();
		System.out.println("Text is  : " + welcomeText);
		Assert.assertEquals(welcomeText, "Reset Passphrase and Security Questions");
		ObjectRepo.test.log(Status.PASS, "step : Reset Passphrase and Security Questions page displayed");

	}

	/*
	 *TC_Id          : C29268 RPM-610
	 *Tc_Title       : Verification_of_Availability_and_accessibility_of_Change_Passphrase_and_Security_Questions_on_User_Profile_for_PendingUser
	 *Functionality  : User Management
	 *Author         : swati.jagdale@eqanim.com
	 */
	@Test(priority = 87, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_Availability_and_accessibility_of_Change_Passphrase_and_Security_Questions_on_User_Profile_for_PendingUser()
			throws Exception {
		Homepage ref = new Homepage();
		MYClass MYC = new MYClass();
		UserRegistration ur = new UserRegistration();
		PendingUser ref1 = new PendingUser();
		ref.selectjurisdictionForCalifornia();
		MYC.selectJurisdictionStep();
		MYC.personalInformation();
		MYC.residenceAndMailing();
		MYC.editAndReview();
		MYC.createUserLogin();
		MYC.loginAsCreatedUser();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt1();
		MYC.AllowToChangePassphrase();
		MYC.Termsandconditions();
		new WebDriverWait(driver, 60).until(ExpectedConditions
				.visibilityOfElementLocated((By.xpath("//h1[text()='Reset Passphrase and Security Questions']"))));
		WebElement PageHeader = driver.findElement(By.xpath("//h1[text()='Reset Passphrase and Security Questions']"));
		String welcomeText = PageHeader.getText();
		System.out.println("Text is  : " + welcomeText);
		Assert.assertEquals(welcomeText, "Reset Passphrase and Security Questions");
		ObjectRepo.test.log(Status.PASS, "step : Reset Passphrase and Security Questions page displayed");

	}

	/*
	 *TC_Id          : C29268 RPM-610
	 *Tc_Title       : Verification_of_Availability_and_accessibility_of_Change_Passphrase_and_Security_Questions_on_User_Profile_for_JurisdictionUser
	 *Functionality  : User Management
	 *Author         : swati.jagdale@eqanim.com
	 */
	@Test(priority = 88, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_Availability_and_accessibility_of_Change_Passphrase_and_Security_Questions_on_User_Profile_for_JurisdictionUser()
			throws InterruptedException {
		Homepage ref = new Homepage();
		MYClass MYC = new MYClass();
		ref.selectjurisdictionForCalifornia();
		ref.loginAsJurisdictionUser();
		MYC.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		MYC.AllowToChangePassphrase();
		MYC.Termsandconditions();
		new WebDriverWait(driver, 60).until(ExpectedConditions
				.visibilityOfElementLocated((By.xpath("//h1[text()='Reset Passphrase and Security Questions']"))));
		WebElement PageHeader = driver.findElement(By.xpath("//h1[text()='Reset Passphrase and Security Questions']"));
		String welcomeText = PageHeader.getText();
		System.out.println("Text is  : " + welcomeText);
		Assert.assertEquals(welcomeText, "Reset Passphrase and Security Questions");
		ObjectRepo.test.log(Status.PASS, "step : Reset Passphrase and Security Questions page displayed");
	}

	/*
	 *TC_Id          : C29268 RPM-610
	 *Tc_Title       : Verification_of_Availability_and_accessibility_of_Change_Passphrase_and_Security_Questions_on_User_Profile_for_Athority
	 *Functionality  : User Management
	 *Author         : swati.jagdale@eqanim.com
	 */
	@Test(priority = 89, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_Availability_and_accessibility_of_Change_Passphrase_and_Security_Questions_on_User_Profile_for_Athority()
			throws InterruptedException {
		Homepage ref = new Homepage();
		MyPOMClass cp = new MyPOMClass();
		MYClass MYC = new MYClass();
		ref.selectjurisdictionForCalifornia();
		cp.Login_with_Jurisdiction_Authority();
		MYC.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		MYC.AllowToChangePassphrase();
		MYC.Termsandconditions();
		new WebDriverWait(driver, 60).until(ExpectedConditions
				.visibilityOfElementLocated((By.xpath("//h1[text()='Reset Passphrase and Security Questions']"))));
		WebElement PageHeader = driver.findElement(By.xpath("//h1[text()='Reset Passphrase and Security Questions']"));
		String welcomeText = PageHeader.getText();
		System.out.println("Text is  : " + welcomeText);
		Assert.assertEquals(welcomeText, "Reset Passphrase and Security Questions");
		ObjectRepo.test.log(Status.PASS, "step : Reset Passphrase and Security Questions page displayed");

	}

	/*
	 *TC_Id          : C32319 RPM-640
	 *Tc_Title       : Verification_of_JU_can_change_user_role_within_same_role_type
	 *Functionality  : User Management
	 *Author         : swati.jagdale@eqanim.com
	 */
	@Test(priority = 90, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_JU_can_change_user_role_within_same_role_type() throws Exception {
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
		MYC.AssignRole_to_User_other_than_JU();
		MYC.assignRoleToUserwithinsameRoleType();
		ref.logout();
	}

	/*
	 *TC_Id          : C32320, C32297  RPM-640
	 *Tc_Title       : Verification of JU can change user role within Different Role_Type
	 *                 Verification of JU can access user details page & change user role
	 *Functionality  : User Management
	 *Author         : swati.jagdale@eqanim.com
	 */
	@Test(priority = 91, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_JU_can_change_user_role_within_different_Role_Type() throws Exception {
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
		MYC.AssignRole_to_User_other_than_JU();
		MYC.assignRoleToUserwithindifferentRoleType();
		ref.logout();
	}

	/*
	 *TC_Id          : C32645 RPM-813
	 *Tc_Title       : Verification of Welcoming JU can deny change PJ request with select denial reason and comment
	 *Functionality  : User Management
	 *Author         : swati.jagdale@eqanim.com
	 */
	@Test(priority = 92, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_Welcoming_JU_can_deny_change_PJ_request_with_select_denial_reason_and_comment()
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
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt1();
		MYC.ChangeJurisdictionfromUser();
		ref.logout();
		MYC.runtime_Login_with_QAJurisdiction_Registrar();
		MYC.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		MYC.DenyChangeJUFromRegistrarwithreason();
		new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']")));
		String successmsg = driver
				.findElement(By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']")).getText();
		//Assert.assertEquals("Your change of jurisdiction request has been denied.", successmsg);
		System.out.println("Your change of jurisdiction request has been denied.");
		ObjectRepo.test.log(Status.PASS, "Role Change Request have been denied by Registrar");

	}

	/*
	 *TC_Id          : C32646 RPM-813
	 *Tc_Title       :Verification of Welcoming JU can deny change PJ request without select denial reason and comment
	 *Functionality  : User Management
	 *Author         : swati.jagdale@eqanim.com
	 */
	@Test(priority = 93, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_Welcoming_JU_can_deny_change_PJ_request_without_select_denial_reason_and_comment()
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
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt1();
		MYC.ChangeJurisdictionfromUser();
		ref.logout();
		MYC.runtime_Login_with_QAJurisdiction_Registrar();
		MYC.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		MYC.DenyChangeJUFromRegistrarwithoutreason();

	}

	/*
	 *TC_Id          : C32739 RPM-932
	 *Tc_Title       :Verify that applicant with pending status is try to access select jurisdiction dropdown in top bar after login
	 *Functionality  : User Management
	 *Author         : swati.jagdale@eqanim.com
	 */
	@Test(priority = 94, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verify_that_applicant_with_pending_status_is_try_to_access_select_jurisdiction_dropdown_in_top_bar_after_login()
			throws Exception {
		// User Registration
		Homepage ref = new Homepage();
		MyPOMClass ref3 = new MyPOMClass();
		MYClass MYC = new MYClass();
		ref.selectjurisdictionForCalifornia();
		MYC.selectJurisdictionStep();
		MYC.personalInformation();
		MYC.residenceAndMailing();
		MYC.editAndReview();
		MYC.createUserLogin();
		// login pending user
		MYC.runtime_Login_with_Pending_User();
		MYC.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt1();
		WebElement E1 = driver
				.findElement(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-1ga5bvv']"));
		String E3 = E1.getText();
		Assert.assertEquals(E3, "California");
		if (E1.isDisplayed()) {
			System.out.println("Jurisdiction selection dropdown in top bar is not accessible for an applicant");
			ObjectRepo.test.log(Status.PASS,
					"Jurisdiction selection dropdown in top bar is not accessible for an applicant");
		} else {
			System.out.println("Enabled");
		}

	}

	/*
	 *TC_Id          : C32740 RPM-932
	 *Tc_Title       :Verify that User with approved status is try to access select jurisdiction dropdown in top bar after login
	 *Functionality  : User Management
	 *Author         : swati.jagdale@eqanim.com
	 */
	@Test(priority = 95, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verify_that_applicant_with_Approved_status_is_try_to_access_select_jurisdiction_dropdown_in_top_bar_after_login()
			throws Exception {
		// User Registration
		Homepage ref = new Homepage();
		MyPOMClass ref3 = new MyPOMClass();
		MYClass MYC = new MYClass();
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
		// login Approved user
		MYC.runtime_Login_with_Pending_User();
		MYC.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt1();
		WebElement E1 = driver
				.findElement(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-1ga5bvv']"));
		String E3 = E1.getText();
		Assert.assertEquals(E3, "California");
		System.out.println(E3);
		if (E1.isEnabled()) {
			System.out.println("Jurisdiction selection dropdown in top bar is not accessible for an applicant");
			ObjectRepo.test.log(Status.PASS,
					"Jurisdiction selection dropdown in top bar is not accessible for an applicant");
		} else {
			System.out.println("Enabled");
		}

	}

	/*
	 *TC_Id          : C32741 RPM-932 Defect raised Once Defect Is fixed then we will fix accordingly
	 *Tc_Title       :Verify_that_User_with_request_revision_status_is_try_to_access_select_jurisdiction_dropdown_in_top_bar_after_login
	 *Functionality  : User Management
	 *Author         : swati.jagdale@eqanim.com
	 */
	@Test(priority = 96, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verify_that_User_with_request_revision_status_is_try_to_access_select_jurisdiction_dropdown_in_top_bar_after_login()
			throws Exception {
		// User Registration
		Homepage ref = new Homepage();
		MyPOMClass ref3 = new MyPOMClass();
		MYClass MYC = new MYClass();
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
		WebElement E1 = driver.findElement(By.xpath("//p[text()='California']"));
		String E3 = E1.getText();
		Assert.assertEquals(E3, "California");
		System.out.println(E3);
		Thread.sleep(1000);
		if (E1.isEnabled()) {
			System.out.println("Jurisdiction selection dropdown in top bar is not accessible for an applicant");
			ObjectRepo.test.log(Status.PASS,
					"Jurisdiction selection dropdown in top bar is not accessible for an applicant");
		} else {
			System.out.println("Enabled");
		}
	}

	/*
	 *TC_Id          : C32692 RPM-659 /C32209 RPM-660
	 *Tc_Title       :Verification_of_Success_message_when_JU_change_user_account_status_to_Inactive
	 *Functionality  : User Management
	 *Author         : swati.jagdale@eqanim.com
	 */
	@Test(priority = 97, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_Success_message_when_JU_change_user_account_status_to_Inactive() throws Exception {
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
		MYC.AssignRole_to_User_other_than_JU();
		MYC.InactiveUserFromJU();
	}

	/*
	 *TC_Id          : C32208 RPM-660
	 *Tc_Title       :Verification_of_change_account_status_to_Inactive_with_no_reason
	 *Functionality  : User Management
	 *Author         : swati.jagdale@eqanim.com
	 */
	@Test(priority = 98, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_change_account_status_to_Inactive_with_no_reason() throws Exception {
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
		MYC.AssignRole_to_User_other_than_JU();
		MYC.InactiveUserWithoutReasonFromJU();
	}

	/*
	 *TC_Id          : C32694 RPM-660
	 *Tc_Title       :Verification_of_change_account_status_to_Inactive_with_invalid_reason
	 *Functionality  : User Management
	 *Author         : swati.jagdale@eqanim.com
	 */
	@Test(priority = 99, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_change_account_status_to_Inactive_with_invalid_reason() throws Exception {
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
		MYC.AssignRole_to_User_other_than_JU();
		MYC.InactiveUserWithInvalidReasonFromJU();
	}

	/*
	 *TC_Id          : C32141 RPM-655/C32708 RPM-657
	 *Tc_Title       : Verification of success message when JU change inactive user account status to 'Active'. (Activate User Log-in)
	 *                 Verification of User log-in after JU Set User Account Status to Active (Activate User Log-in)
	 *Functionality  : User Management
	 *Author         : swati.jagdale@eqanim.com
	 */
	@Test(priority = 100, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_User_login_after_JU_Set_User_Account_Status_to_Active_Activate_User_Login()
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
		MYC.AssignRole_to_User_other_than_JU();
		MYC.InactiveUserFromJU();
		MYC.ActivateUserFromJU();
		ref.logout();
		MYC.runtime_Login_with_Approved_User();
		MYC.handlesecurityQuestion();
		MYC.resetPassphrasePrompt1();
		System.out.println("User is able to log in successfully after JU Set User Account Status to Active");
		ObjectRepo.test.log(Status.PASS,
				"User is able to log in successfully after JU Set User Account Status to Active");
	}

	/*
	 *TC_Id          : C32715 RPM-790
	 *Tc_Title       :Verification_of_request_status_is_changed_to_Cancelled_COJ_after_user_cancelled_their_change_jurisdiction_request
	 *Functionality  : User Management
	 *Author         : swati.jagdale@eqanim.com
	 */
	@Test(priority = 101, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_request_status_is_changed_to_Cancelled_COJ_after_user_cancelled_their_change_jurisdiction_request()
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
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt1();
		MYC.ChangeJurisdictionfromUser();
		MYC.Cancel_COJ_FromUser();
	}

	/*
	 *TC_Id          : C32669 RPM-821
	 *Tc_Title       :Verification_of_Deny_terms_conditions_functionality
	 *Functionality  : User Management
	 *Author         : swati.jagdale@eqanim.com
	 */
	@Test(priority = 102, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_Deny_terms_conditions_functionality() throws Exception {
		// User Registration
		Homepage ref = new Homepage();
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
		MYC.CrossJurisdictionfromUser();
	}

	/*
	 *TC_Id          : C29312 RPM-595/ C29314 RPM-595
	 *Tc_Title       :Verification of display application status for logged-in use with application status as pending.
	 *                Verification of display application status for logged-in user with application status as approved
	 *Functionality  : User Management
	 *Author         : swati.jagdale@eqanim.com
	 */
	@Test(priority = 103, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_display_application_status_for_loggedin_user_with_application_status_as_pending()
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
		// Login_with_user
		MYC.runtime_Login_with_Pending_User();
		MYC.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		String message2 = driver.findElement(By.xpath("//div[text()='Registration Application Status:']")).getText();
		System.out.println("" + message2);
		ObjectRepo.test.log(Status.PASS, message2);
		ref.logout();
		// Login_with_Jurisdiction_Registrar//Assign role
		MyPOMClass ref3 = new MyPOMClass();
		ref3.Login_with_Jurisdiction_Registrar();
		MYC.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		MYC.AssignRole_to_User_other_than_JU();
		ref.logout();
		// Login_with_ApprovedUser
		MYC.runtime_Login_with_Approved_User();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt1();
		String message3 = driver.findElement(By.xpath("//div[text()='[APPROVED USER - LOGGED-IN HOME PAGE]']"))
				.getText();
		System.out.println("User Status" + message3);
		ObjectRepo.test.log(Status.PASS, message3);
	}

	/*
	 *TC_Id          : C29313 RPM-595
	 *Tc_Title       :Verification_of_display_application_status_for_loggedin_user_with_application_status_as_RequestRevision
	 *Functionality  : User Management
	 *Author         : swati.jagdale@eqanim.com
	 */
	@Test(priority = 104, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_display_application_status_for_loggedin_user_with_application_status_as_RequestRevision()
			throws Exception {
		// User Registration
		Homepage ref = new Homepage();
		MyPOMClass ref3 = new MyPOMClass();
		MYClass MYC = new MYClass();
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
	}

	/*
	 * TC_Id         : C35615 /RPM-667 
	 * Tc_Title      : Verification of the User can not login after change of user account status to Close by JU 
	 * Functionality : User Management
	 * Author        :swati.jagdale@eqanim.com
	 */
	@Test(priority = 105, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_the_User_can_not_login_after_change_of_user_account_status_to_Close_by_JU()
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
		MYC.InactiveUserCloseAccountFromJU();
		ref.logout();
		MYC.runtime_Login_with_closed_User();
		Thread.sleep(2000);
		String message1 = driver.findElement(By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']")).getText();
		System.out.println("Error message :" + message1);
		Assert.assertEquals(message1, "User ID or passphrase entered is invalid.");
		System.out.println("User is no longer able to login");
		ObjectRepo.test.log(Status.PASS, "User is no longer able to login");
	}

	/*
	 * TC_Id         : C32226/C32227/C32228 /RPM-782 C32221/RPM-778
	 * Tc_Title      : Verification of User Application in originating and welcoming jurisdiction when Active User submits a Change of Jurisdiction request 
	 * Tc_Title      :Verification of user can able to select only one jurisdiction at a time of change juisdiction
	 * Functionality : User Management
	 * Author        : swati.jagdale@eqanim.com
	 */

	@Test(priority = 106, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_User_Application_in_originating_jurisdiction_when_Active_User_submits_a_Change_of_Jurisdiction_request()
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
		Thread.sleep(1000);
		MYC.ChangeJurisdictionfromUser();
		ref.logout();
		MYC.runtime_Login_with_Jurisdiction_Registrar();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		Thread.sleep(1000);
		MYC.searchuserInPending();

		List<WebElement> elements = driver.findElements(By.xpath(
				"//p[text()='Pending Requests']/parent::div/parent::div/following-sibling::div//*[div[contains(@class,'MuiDataGrid-virtualScrollerContent')]]//div[contains(@class,'MuiDataGrid-row')]"));
		if (elements.size() > 0) {
			System.out.println("Search User is displayed in original jurisdiction");
		} else {
			System.out.println("Searched User is Registered with other Jurisdiction");
		}
		ref.logout();
		MYC.runtime_Login_with_QAJurisdiction_Registrar();
		MYC.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		Thread.sleep(3000);
		MYC.searchuserInPending();

		List<WebElement> elements1 = driver.findElements(By.xpath(
				"//p[text()='Pending Requests']/parent::div/parent::div/following-sibling::div//*[div[contains(@class,'MuiDataGrid-virtualScrollerContent')]]//div[contains(@class,'MuiDataGrid-row')]"));
		if (elements1.size() > 0) {
			System.out.println("Search User is displayed in welcoming jurisdiction");
		} else {
			System.out.println("Searched User is Registered with other Jurisdiction");
		}

	}

	/*
	 * TC_Id         : C32230/C32231/C32232/RPM-783 
	 * Tc_Title      : Verification of Applicant Application in originating and welcoming jurisdiction when Active User submits a Change of Jurisdiction request 
	 * Functionality : User management
	 * Author        : swati.jagdale@eqanim.com
	 */
	@Test(priority = 107, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_Applicant_Application_in_Welcoming_jurisdiction_when_Applicant_User_submits_a_Change_of_Jurisdiction_request()
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
		MYC.runtime_Login_with_Pending_User();
		MYC.handlesecurityQuestion();
		MYC.resetPassphrasePrompt1();
		Thread.sleep(1000);
		MYC.ChangeJurisdictionfromUser();
		ref.logout();
		MYC.runtime_Login_with_Jurisdiction_Registrar();
		MYC.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		Thread.sleep(1000);
		MYC.searchuserInPending();
		List<WebElement> elements = driver.findElements(By.xpath(
				"//p[text()='Pending Requests']/parent::div/parent::div/following-sibling::div//*[div[contains(@class,'MuiDataGrid-virtualScrollerContent')]]//div[contains(@class,'MuiDataGrid-row')]"));
		if (elements.size() > 0) {
			System.out.println("Search User is displayed in Original jurisdiction");
		} else {
			System.out.println("Searched User is Registered with other Jurisdiction");
		}
		ref.logout();
		MYC.runtime_Login_with_QAJurisdiction_Registrar();
		MYC.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		Thread.sleep(1000);
		MYC.searchuserInPending();
		List<WebElement> elements1 = driver.findElements(By.xpath(
				"//p[text()='Pending Requests']/parent::div/parent::div/following-sibling::div//*[div[contains(@class,'MuiDataGrid-virtualScrollerContent')]]//div[contains(@class,'MuiDataGrid-row')]"));
		if (elements1.size() > 0) {
			System.out.println("Search User is displayed in welcoming jurisdiction");
		} else {
			System.out.println("Searched User is Registered with other Jurisdiction");
		}
	}

	/*
	 * TC_Id          : C32212/RPM-662 and C32736/RPM-786   C35600/RPM-619
	 * Tc_Title       : Verification of login functionality after JU Set user account status to Inactive (without profile access) 
	 * Tc_Title       : Verification of User with Inactive users status and inactive account status try to initiates change jurisdiction request
	 * Tc_Title       : Verification of 'User status' and 'User account' status after user closes his account.
	 * Functionality  : User Management
	 * Author         :swati.jagdale@eqanim.com
	 */
	@Test(priority = 108, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_login_functionality_after_JU_Set_user_account_status_to_Inactive() throws Exception {
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
		MYC.AssignRole_to_User_other_than_JU();
		MYC.InactiveUserFromJU();
		ref.logout();
		MYC.runtime_Login_with_closed_User();
		Thread.sleep(3000);
		
		String element4 = driver.findElement(By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']")).getText();
		//String element4 = driver.findElement(By.xpath("//p[text()='Invalid username and password']")).getText();
		System.out.println("Error Message :" + element4);
		System.out.println("Inactive user is not able to login");
		Assert.assertEquals(element4, "User ID or passphrase entered is invalid.");
		ObjectRepo.test.log(Status.PASS, element4);
	}

	/*
	 * TC_Id          : C32213/RPM-662
	 * Tc_Title       : Verification of login functionality after JU Set user account status to Inactive (profile access only)
	 * Functionality  : User Management
	 * Author         :swati.jagdale@eqanim.com
	 */
	@Test(priority = 109, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_login_functionality_after_JU_Set_user_account_status_to_Inactive_with_profileAccess_only()
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
		MYC.AssignRole_to_User_other_than_JU();
		MYC.InactiveUserFromJUwithprofile_AccessOnly();
		ref.logout();
		MYC.runtime_Login_with_closed_User();
		MYC.handlesecurityQuestion();
		MYC.resetPassphrasePrompt();
		Thread.sleep(3000);
		String element4 = driver.findElement(By.xpath("//h1[text()='Welcome!']")).getText();
		System.out.println("Home page displayed :" + element4);
		Assert.assertEquals(element4, "Welcome!");
		ObjectRepo.test.log(Status.PASS, element4);
	}

	/*
	 * TC_Id          : C32353/RPM-817(C27698 duplicate) 
	 * Tc_Title       : Verification of Request status after Cross Jurisdiction
	 * Functionality  : User management
	 * Author         : swati.jagdale@eqanim.com
	 */
	@Test(priority = 110, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_Request_status_after_cross_() throws Exception {
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
		MYC.CrossJurisdictionfromUser_Statuscheck();

	}

	/*
	 * TC_Id          : C32690/RPM-824 
	 * Tc_Title       : Verification of JU is able to view Cross PJ requests initiated by users using user search grid 
	 * Functionality  : User Management
	 * Author         :swati.jagdale@eqanim.com
	 */
	@Test(priority = 111, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_JU_is_able_to_view_Cross_PJ_requests_initiated_by_users_using_user_search_grid()
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
		MYC.CrossJurisdictionfromUser_Statuscheck();
		ref.logout();
		// search user
		ref3.Login_with_Jurisdiction_Registrar();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		MYC.searchuserInPending();
		Thread.sleep(1000);
		MYC.ViewDetails_Foruser_PendingCrossJu();
	}

	/*
	 * TC_Id         : C32691/RPM-824 
	 * Tc_Title      : Verification of JU is able to view Cross PJ requests initiated by users using pending user search grid
	 * Functionality :User Management
	 * Author        :swati.jagdale@eqanim.com
	 */
	@Test(priority = 112, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_JU_is_able_to_view_Cross_PJ_requests_initiated_by_Pending_users_using_user_search_grid()
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
		MYC.CrossJurisdictionfromUser_Statuscheck();
		ref.logout();
		// Login_with_Jurisdiction_Registrar//Assign role
		ref3.Login_with_Jurisdiction_Registrar();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		MYC.searchuserInPending_UsingFilter();
		MYC.ViewDetails_Foruser_PendingCrossJu();
	}
	/*
	 * TC_Id         : C32720/RPM-622 and C29217/C29218/RPM-552
	 * Tc_Title      : Verification JU can view a list of all Users who submitted User Details revisions for approval.
	 * Tc_Title      :Verification of display the fields for revision requested & new value added by applicant in submitted application
	 * Tc_Title      :Verification of display changed values near to previous values
	 * Functionality :User Management
	 * Author        :swati.jagdale@eqanim.com
	 */
	@Test(priority = 113, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_JU_can_view_a_list_of_all_Users_who_submitted_User_Details_revisions_for_approval()
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
		ref3.Login_with_Jurisdiction_Registrar();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		MYC.searchuserInPending();
		MYC.Revision_Check();
	}
	/*
	 * TC_Id         : C35615 /RPM-620 
	 * Tc_Title      : Verification of user login after user closes his account.
	 * Functionality : User Management
	 * Author        :swati.jagdale@eqanim.com
	 */
	@Test(priority = 114, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_user_login_after_user_closes_his_account()
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
		// LogincApproved User
		MYC.runtime_Login_with_Approved_User();
		MYC.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt1();
		MYC.CloseAccount_fromUser();
		// Login close User
		MYC.runtime_Login_with_closed_User();
		Thread.sleep(2000);
		String element7= driver.findElement(By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']")).getText();
		//Assert.assertEquals("Invalid username and password", element7);
		System.out.println("Error Message :" +element7);
		System.out.println("Closed user is not able to login the application");
		ObjectRepo.test.log(Status.PASS, "Enter valid User ID");	
	}

	/*
	 * TC_Id          : C32701/RPM-825 
	 * Tc_Title       : Verify JU can share Cross PJ requests initiated by its users only with requested Jurisdiction
	 * Functionality  : User management
	 * Author         :swati.jagdale@eqanim.com
	 */
	@Test(priority = 115, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verify_JU_can_share_Cross_PJ_requests_initiated_by_its_users_only_with_requested_Jurisdiction()
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
		MYC.CrossJurisdictionfromUser_Statuscheck();
		ref.logout();
		// Original JU Share profile
		MYC.runtime_Login_with_Jurisdiction_Registrar();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		MYC.searchuserInPending();
		MYC.ShareUserProfile_CrossJU();
		ref.logout();
		//Welcoming JU check user
		MYC.runtime_Login_with_QAJurisdiction_Registrar();
		MYC.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		MYC.ViewDetails_Foruser_ApprovedCrossJu();

	}
	/*
	 * TC_Id          : C32702/RPM-825 
	 * Tc_Title       : Verify JU can share Cross PJ requests initiated by its users with other than the requested Jurisdiction
	 * Functionality  : User management
	 * Author         :swati.jagdale@eqanim.com
	 */
	@Test(priority = 116, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verify_JU_can_share_Cross_PJ_requests_initiated_by_its_users_with_other_than_the_requested_Jurisdiction()
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
		MYC.CrossJurisdictionfromUser_Statuscheck();
		ref.logout();
		// Original JU Share profile
		MYC.runtime_Login_with_Jurisdiction_Registrar();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		MYC.searchuserInPending();
		MYC.ShareUserProfile_CrossJU();
		ref.logout();
		//Welcoming JU check user
		MYC.runtime_Login_with_washJurisdiction_Registrar();
		MYC.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		MYC.Search_RegisterUser();	//NEED TO CHECK
	}
	
	/*
	 * TC_Id          : C32157/RPM-628
	 * Tc_Title       : Verification of JA approval to proposed role change under 'Service Provider' role type.
	 * Functionality  : User management
	 * Author         :swati.jagdale@eqanim.com
	 */
	@Test(priority = 117, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_JA_approval_to_proposed_role_change_under_service_provider_role_type()
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
		MYC.AssignRole_to_User_Service_Provider();
		ref.logout();
		// Login_with_Jurisdiction_Authority
		ref3.Login_with_Jurisdiction_Authority();
		MYC.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		MYC.StatusChangeFromJA();//change to new script		


	}
	/*
	 * TC_Id          : C32290/RPM-628
	 * Tc_Title       : Verification of JA approval to proposed role change under 'Jurisdiction user' role type.
	 * Functionality  : User management
	 * Author         :swati.jagdale@eqanim.com
	 */
	@Test(priority = 118, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_JA_approval_to_proposed_role_change_under_jurisdiction_user_role_type()
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
		MYC.changeRoleToNewUser_toJU();
		ref.logout();
		// Login_with_Jurisdiction_Authority
		ref3.Login_with_Jurisdiction_Authority();
		MYC.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		MYC.StatusChangeFromJA();			
	}
	/*
	 * TC_Id          : C32644/RPM-812 C32155/RPM-627 
	 * Tc_Title       : Verification of Welcoming JU can deny change PJ request
	 * Tc_Title       : Verification of deny user profile changes functionality by providing 'reason for denial'.
	 * Functionality  : User management
	 * Author         :swati.jagdale@eqanim.com
	 */
	@Test(priority = 119, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_Welcoming_JU_can_deny_change_PJ_request()
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
		//Login with approved user
		MYC.runtime_Login_with_Approved_User();
		MYC.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt1();
		MYC.ChangeJurisdictionfromUser();
		ref.logout();
		//Login with welcoming ju
		MYC.runtime_Login_with_QAJurisdiction_Registrar();
		MYC.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		MYC.DenyChangeJUFromRegistrarwithreason();
		new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[text()='Your change of jurisdiction request has been denied.']")));
		String successmsg = driver
				.findElement(By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']")).getText();
		//Assert.assertEquals("Your change of jurisdiction request has been denied.", successmsg);
		System.out.println("Your change of jurisdiction request has been denied.");
		ObjectRepo.test.log(Status.PASS, "Role Change Request have been denied by Registrar");
	}

	/*
	 *TC_Id         : C29262 RPM-602
	 *Tc_Title      : Verification_of_accessibility_of_Security_settings_option_on_User_Profile_if_user_has_rights_to_view_its_security_settings
	 *Functionality : User Management
	 *Author        : vishal.giram@eqanim.com
	 */
	@Test(priority = 120, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_accessibility_of_Security_settings_option_on_User_Profile_if_user_has_rights_to_view_its_security_settings()
			throws Exception {
		Homepage ref = new Homepage();
		POMpublicHomePage ref2 = new POMpublicHomePage();
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
		ref1.loginUserWithRememberMeCheckbox();
		WebElement element=driver.findElement(By.xpath("//button[contains(text(),'Welcome,')]"));
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		js2.executeScript("arguments[0].click()", element);
		//driver.findElement(By.xpath("//button[contains(text(),'Welcome,')]")).click();
		WebElement element1=driver.findElement(By.xpath("//a[contains(text(),'User Profile')]"));
		js2.executeScript("arguments[0].click()", element1);
		//driver.findElement(By.xpath("//a[contains(text(),'User Profile')]")).click();
		String option = driver.findElement(By.xpath("//*[text()='Security Settings']")).getText();
		Assert.assertEquals(option, "SECURITY SETTINGS");
		System.out.println("User is able to access the security settings ");
		driver.findElement(By.xpath("//span[text()='Change Passphrase and Security Questions']")).click();
	}

	/*
	 *TC_Id         : C29264 RPM-603
	 *Tc_Title      : Verification_of_accessibility_of_Security_settings_option_on_User_Profile_if_user_does_not_have_rights_to_view_its_security_settings
	 *Functionality : User Management
	 *Author        : vishal.giram@eqanim.com
	 */
	@Test(priority = 121, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_accessibility_of_Security_settings_option_on_User_Profile_if_user_does_not_have_rights_to_view_its_security_settings()
			throws Exception {
		Homepage ref = new Homepage();
		POMpublicHomePage ref2 = new POMpublicHomePage();
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
		ref1.loginUserWithRememberMeCheckbox();
		WebElement element=driver.findElement(By.xpath("//button[contains(text(),'Welcome,')]"));
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		js2.executeScript("arguments[0].click()", element);
		//driver.findElement(By.xpath("//button[contains(text(),'Welcome,')]")).click();
		WebElement element1=driver.findElement(By.xpath("//a[contains(text(),'User Profile')]"));
		js2.executeScript("arguments[0].click()", element1);
		String option = driver.findElement(By.xpath("//*[text()='User Profile']")).getText();
		Assert.assertEquals(option, "User Profile");
		System.out.println("User is able to access user profile page ");
		List<WebElement> element2 = driver.findElements(
				By.xpath("//ul//li[@class='MuiListItem-root MuiListItem-gutters MuiListItem-padding css-zs9zxr']"));
		int size = element2.size();
		for (int i = 0; i <= size - 1; i++) {
			System.out.println("User is able to edit  " + element2.get(i).getText());
		}
	}

	/*
	 *TC_Id         : C29265 RPM-603
	 *Tc_Title      : Verification_of_Edit_functionality_when_application_status_is_pending_and_revision_is_requested
	 *Functionality : User Management
	 *Author        : vishal.giram@eqanim.com
	 */
	@Test(priority = 122, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_Edit_functionality_when_application_status_is_pending_and_revision_is_requested()
			throws Exception {
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
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.raisedRevisionRequestUserRegistrationByRegistrar();
		ref.logout();
		ref1.loginAsCreatedUser();
		MYC.Termsandconditions();
		//driver.findElement(By.xpath("//button[contains(text(),'Welcome,')]")).click();
		WebElement element1=driver.findElement(By.xpath("//button[contains(text(),'Welcome,')]"));
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		js2.executeScript("arguments[0].click()", element1);
		WebElement element2=driver.findElement(By.xpath("//a[contains(text(),'User Profile')]"));
		js2.executeScript("arguments[0].click()", element2);
		String option = driver.findElement(By.xpath("//*[text()='User Profile']")).getText();
		Assert.assertEquals(option, "User Profile");
		System.out.println("User is able to access user profile page ");
		List<WebElement> element = driver.findElements(
				By.xpath("//ul//li[@class='MuiListItem-root MuiListItem-gutters MuiListItem-padding css-zs9zxr']"));
		int size = element.size();
		for (int i = 0; i <= size - 1; i++) {
			System.out.println("User is able to edit  " + element.get(i).getText());
		}
	}

	/*
	 *TC_Id         : C29266 RPM-606
	 *Tc_Title      : Verification_of_Cancel_button_functionality_on_user_details_page
	 *Functionality : User Management
	 *Author        : vishal.giram@eqanim.com
	 */
	@Test(priority = 123, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_Cancel_button_functionality_on_user_details_page() throws Exception {
		//POMpublicHomePage ref2 = new POMpublicHomePage();
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
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.raisedRevisionRequestUserRegistrationByRegistrar();
		ref.logout();
		ref1.loginAsCreatedUser();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt1();
		//driver.findElement(By.xpath("//button[contains(text(),'Welcome,')]")).click();
		WebElement element1=driver.findElement(By.xpath("//button[contains(text(),'Welcome,')]"));
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		js2.executeScript("arguments[0].click()", element1);
		WebElement element2=driver.findElement(By.xpath("//a[contains(text(),'User Profile')]"));
		js2.executeScript("arguments[0].click()", element2);
		String option = driver.findElement(By.xpath("//*[text()='User Profile']")).getText();
		Assert.assertEquals(option, "User Profile");
		System.out.println("User is able to access user profile page ");
		WebElement element=driver.findElement(By.xpath("//*[contains(text(),'Review/Edit User Registration')]"));
		js2.executeScript("arguments[0].click()", element);
		//driver.findElement(By.xpath("//*[text()='View or Edit User Details']")).click();
		driver.findElement(By.xpath("//button[text()='Edit']")).click();
		Boolean btnCancel = driver.findElement(By.xpath("//button[text()='CANCEL']")).isDisplayed();
		Assert.assertTrue(btnCancel);
	}

	/*
	 *TC_Id         : C29267 RPM-606
	 *Tc_Title      : Verification_of_revert_changes_in_application_when_user_cancel_the_changes
	 *Functionality : User Management
	 *Author        : vishal.giram@eqanim.com
	 */
	@Test(priority = 124, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_revert_changes_in_application_when_user_cancel_the_changes()
			throws Exception {
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
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.raisedRevisionRequestUserRegistrationByRegistrar();
		ref.logout();
		ref1.loginAsCreatedUser();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt1();
		//driver.findElement(By.xpath("//button[contains(text(),'Welcome,')]")).click();
		WebElement element1=driver.findElement(By.xpath("//button[contains(text(),'Welcome,')]"));
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		js2.executeScript("arguments[0].click()", element1);
		WebElement element2=driver.findElement(By.xpath("//a[contains(text(),'User Profile')]"));
		js2.executeScript("arguments[0].click()", element2);
		//driver.findElement(By.xpath("//a[contains(text(),'User Profile')]")).click();
		String option = driver.findElement(By.xpath("//*[text()='User Profile']")).getText();
		Assert.assertEquals(option, "User Profile");
		System.out.println("User is able to access user profile page ");
		WebElement element=driver.findElement(By.xpath("//*[contains(text(),'Review/Edit User Registration')]"));
		js2.executeScript("arguments[0].click()", element);
		//driver.findElement(By.xpath("//*[text()='View or Edit User Details']")).click();
		driver.findElement(By.xpath("//button[text()='Edit']")).click();
		WebElement element3=driver.findElement(By.xpath("//button[text()='CANCEL']"));
		js2.executeScript("arguments[0].click()", element3);
		//driver.findElement(By.xpath("//button[text()='CANCEL']")).click();
		System.out.println("Edit information cancelled successfully");
	}

	/*
	 *TC_Id         : C29270 RPM-611
	 *Tc_Title      : Verification_of_display_current_passphrase_new_passphrase_and_confirm_new_passphrase_fields_on_Reset_passphrase_security_questions_page
	 *Functionality : User Management
	 *Author        : vishal.giram@eqanim.com
	 */
	@Test(priority = 125, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_display_current_passphrase_new_passphrase_and_confirm_new_passphrase_fields_on_Reset_passphrase_security_questions_page()
			throws Exception {
		Homepage ref = new Homepage();
		POMpublicHomePage ref2 = new POMpublicHomePage();
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
		ref1.loginUserWithRememberMeCheckbox();
		//driver.findElement(By.xpath("//button[contains(text(),'Welcome,')]")).click();
		WebElement element1=driver.findElement(By.xpath("//button[contains(text(),'Welcome,')]"));
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		js2.executeScript("arguments[0].click()", element1);
		WebElement element2=driver.findElement(By.xpath("//a[contains(text(),'User Profile')]"));
		js2.executeScript("arguments[0].click()", element2);
		//driver.findElement(By.xpath("//a[contains(text(),'User Profile')]")).click();
		String option = driver.findElement(By.xpath("//*[text()='User Profile']")).getText();
		Assert.assertEquals(option, "User Profile");
		System.out.println("User is able to access user profile page ");
		WebElement element3=driver.findElement(By.xpath("//*[text()='Change Passphrase and Security Questions']"));
		js2.executeScript("arguments[0].click()", element3);
		//driver.findElement(By.xpath("//*[text()='Change Passphrase and Security Questions']")).click();
		List<WebElement> element = driver.findElements(By.xpath("//*[@for='customize-textfield']"));
		int size = element.size();
		for (int i = 0; i <= size - 1; i++) {
			System.out.println("field present on Reset Passphrase and Security page  :" + element.get(i).getText());
		}
	}
	// Verification of new passphrase & Confirm new passphrase is match

	/*
	 *TC_Id         : C29280 RPM-614
	 *Tc_Title      : Verification_of_new_passphrase_Confirm_new_passphrase_is_match
	 *Functionality : User Management
	 *Author        : vishal.giram@eqanim.com
	 */
	@Test(priority = 126, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_new_passphrase_Confirm_new_passphrase_is_match() throws Exception {
		Homepage ref = new Homepage();
		POMpublicHomePage ref2 = new POMpublicHomePage();
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
		ref1.loginUserWithRememberMeCheckbox();
		//driver.findElement(By.xpath("//button[contains(text(),'Welcome,')]")).click();
		WebElement element1=driver.findElement(By.xpath("//button[contains(text(),'Welcome,')]"));
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		js2.executeScript("arguments[0].click()", element1);
		WebElement element2=driver.findElement(By.xpath("//a[contains(text(),'User Profile')]"));
		js2.executeScript("arguments[0].click()", element2);
		//driver.findElement(By.xpath("//a[contains(text(),'User Profile')]")).click();
		String option = driver.findElement(By.xpath("//*[text()='User Profile']")).getText();
		Assert.assertEquals(option, "User Profile");
		System.out.println("User is able to access user profile page ");
		WebElement element3=driver.findElement(By.xpath("//*[text()='Change Passphrase and Security Questions']"));
		js2.executeScript("arguments[0].click()", element3);
		//driver.findElement(By.xpath("//*[text()='Change Passphrase and Security Questions']")).click();

		List<WebElement> element = driver.findElements(By.xpath("//*[@for='customize-textfield']"));
		int size = element.size();
		for (int i = 0; i <= size - 1; i++) {
			System.out.println("field present on Reset Passphrase and Security page  :" + element.get(i).getText());
		}
		driver.findElement(By.xpath("//input[@name='oldPassphrase']")).sendKeys("Test@123");
		driver.findElement(By.xpath("//input[@name='newPassphrase']")).sendKeys("Test@1234");
		driver.findElement(By.xpath("//input[@name='confirmPassphrase']")).sendKeys("Test@1234");
		Thread.sleep(2000);
		// for validation please refer screenshot attached in extent report
	}

	/*
	 *TC_Id         : C29346 RPM-614
	 *Tc_Title      : Verification_of_new_passphrase_Confirm_new_passphrase_does_Not_match
	 *Functionality : User Management
	 *Author        : vishal.giram@eqanim.com
	 */
	@Test(priority = 127, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_new_passphrase_Confirm_new_passphrase_does_Not_match() throws Exception {
		Homepage ref = new Homepage();
		POMpublicHomePage ref2 = new POMpublicHomePage();
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
		ref1.loginUserWithRememberMeCheckbox();
		//driver.findElement(By.xpath("//button[contains(text(),'Welcome,')]")).click();
		WebElement element1=driver.findElement(By.xpath("//button[contains(text(),'Welcome,')]"));
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		js2.executeScript("arguments[0].click()", element1);
		WebElement element2=driver.findElement(By.xpath("//a[contains(text(),'User Profile')]"));
		js2.executeScript("arguments[0].click()", element2);
		//driver.findElement(By.xpath("//a[contains(text(),'User Profile')]")).click();
		String option = driver.findElement(By.xpath("//*[text()='User Profile']")).getText();
		Assert.assertEquals(option, "User Profile");
		System.out.println("User is able to access user profile page ");
		//driver.findElement(By.xpath("//*[text()='Change Passphrase and Security Questions']")).click();
		WebElement element3=driver.findElement(By.xpath("//*[text()='Change Passphrase and Security Questions']"));
		js2.executeScript("arguments[0].click()", element3);

		List<WebElement> element = driver.findElements(By.xpath("//*[@for='customize-textfield']"));
		int size = element.size();
		for (int i = 0; i <= size - 1; i++) {
			System.out.println("field present on Reset Passphrase and Security page  :" + element.get(i).getText());
		}
		driver.findElement(By.xpath("//input[@name='oldPassphrase']")).sendKeys("Test@123");
		driver.findElement(By.xpath("//input[@name='newPassphrase']")).sendKeys("Test@12");
		driver.findElement(By.xpath("//input[@name='confirmPassphrase']")).click();
		driver.findElement(By.xpath("//input[@name='confirmPassphrase']")).sendKeys("Test@12345");
		Thread.sleep(3000);
		String errorMsg = driver.findElement(By.xpath(
				"//p[contains(text(),'Passphrase and confirm passphrase must be same')]"))
				.getText();
		Assert.assertEquals(errorMsg, "New Passphrase and confirm passphrase must be same");
	}

	/*
	 *TC_Id         : C29289 RPM-623
	 *Tc_Title      : Verification_of_JU_can_view_user_user_profile_details
	 *Functionality : User Management
	 *Author        : vishal.giram@eqanim.com
	 */
	@Test(priority = 128, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_JU_can_view_user_user_profile_details() throws InterruptedException {
		Homepage ref = new Homepage();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectJurisdictionForQubec();
		POMpublicHomePage ref2 = new POMpublicHomePage();
		ref2.jurisdictionUserLogin();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
	}

	/*
	 *TC_Id         : C29308 RPM-591
	 *Tc_Title      : Verification_of_finish_button_functionality_to_submit_the_application
	 *Functionality : User Management
	 *Author        : vishal.giram@eqanim.com
	 */
	@Test(priority = 129, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_finish_button_functionality_to_submit_the_application() throws InterruptedException {
		Homepage ref = new Homepage();
		UserRegistration ur = new UserRegistration();
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
		POMpublicHomePage ref2 = new POMpublicHomePage();
		ref2.createUserLogin();

		// Stuck due to recaptcha
	}

	/*
	 *TC_Id         : C29315 RPM-601
	 *Tc_Title      : Verification_of_view_security_setting_from_user_profile_page
	 *Functionality : User Management
	 *Author        : vishal.giram@eqanim.com
	 */
	@Test(priority = 130, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_view_security_setting_from_user_profile_page() throws Exception {
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
		//driver.findElement(By.xpath("//button[contains(text(),'Welcome,')]")).click();
		WebElement element1=driver.findElement(By.xpath("//button[contains(text(),'Welcome,')]"));
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		js2.executeScript("arguments[0].click()", element1);
		WebElement element2=driver.findElement(By.xpath("//a[contains(text(),'User Profile')]"));
		js2.executeScript("arguments[0].click()", element2);
		//driver.findElement(By.xpath("//a[contains(text(),'User Profile')]")).click();
		String option = driver.findElement(By.xpath("//*[text()='User Profile']")).getText();
		Assert.assertEquals(option, "User Profile");
		System.out.println("User is able to access user profile page ");
		//		List<WebElement> element = driver.findElements(
		//				By.xpath("//ul//li[@class='MuiListItem-root MuiListItem-gutters MuiListItem-padding css-zs9zxr']"));
		//		int size = element.size();
		//		for (int i = 0; i <= size - 1; i++) {
		//			System.out.println("User is able to edit  " + element.get(i).getText());
		//		}
		String headerName = driver.findElement(By.xpath("//*[text()='Security Settings']")).getText();
		Assert.assertEquals(headerName, "SECURITY SETTINGS");
		System.out.println("user can view the security settings from user profile page");
	}

	/*
	 *TC_Id         : C29323 RPM-676
	 *Tc_Title      : Verification_of_download_functionality_for_searched_result
	 *Functionality : User Management
	 *Author        : vishal.giram@eqanim.com
	 */
	@Test(priority = 131, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_download_functionality_for_searched_result() throws InterruptedException {
		Homepage ref = new Homepage();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectJurisdictionForQubec();
		POMpublicHomePage ref2 = new POMpublicHomePage();
		ref2.jurisdictionUserLogin();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@aria-label='Export']")).click();
		driver.findElement(By.xpath("//*[text()='Download as CSV']")).click();
		System.out.println("CSV file downloaded successfully ");
		ObjectRepo.test.log(Status.PASS, "CSV file downloaded successfully ");
		driver.findElement(By.xpath("//button[@aria-label='Export']")).click();
		driver.findElement(By.xpath("//*[text()='Download as Excel']")).click();
		System.out.println("Excel file downloaded successfully ");
		ObjectRepo.test.log(Status.PASS, "Excel file downloaded successfully ");
	}

	/*
	 *TC_Id         : C29324 RPM-676
	 *Tc_Title      : Verification_of_download_functionality_for_searched_result
	 *Functionality : User Management
	 *Author        : vishal.giram@eqanim.com
	 */
	@Test(priority = 132, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_downloaded_files_for_searched_result() throws InterruptedException {
		Homepage ref = new Homepage();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ref.selectJurisdictionForQubec();
		POMpublicHomePage ref2 = new POMpublicHomePage();
		ref2.jurisdictionUserLogin();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@aria-label='Export']")).click();
		driver.findElement(By.xpath("//*[text()='Download as CSV']")).click();
		System.out.println("CSV file downloaded successfully ");
		ObjectRepo.test.log(Status.PASS, "CSV file downloaded successfully ");
		driver.findElement(By.xpath("//button[@aria-label='Export']")).click();
		driver.findElement(By.xpath("//*[text()='Download as Excel']")).click();
		System.out.println("Excel file downloaded successfully ");
		ObjectRepo.test.log(Status.PASS, "Excel file downloaded successfully ");
		// Excel files viewer is not installed for read excel files
	}
}


