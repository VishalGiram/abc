package HappyPathsRegMod1;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pageObjects.Homepage;
import pageObjects.MYClass;
import pageObjects.MyPOMClass;
import pageObjects.PendingUser;
import pageObjects.UserRegistration;
import resources.ObjectRepo;
import resources.base;

public class WelcomingRegistrarDeniedChangeJurisdictionRequest extends base {

//	/*
//	 *TC_Id      : C0001
//	 *Tc_Title   : approve_user_Raised_change_Jurisdiction_Request
//	 *Author     : pravin.jogi@eqanim.com           
//	 */
//	@Test(priority = 1,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
//	public void approve_user_Raised_change_Jurisdiction_Request() throws Exception {
//		Homepage ref = new Homepage(driver, prop);
//		UserRegistration ur=new UserRegistration(driver, prop);
//		PendingUser ref1=new PendingUser(driver, prop);
//		MyPOMClass ref2=new MyPOMClass(driver, prop);
//		ref.selectJurisdictionForQubec();
//		//User Creation
//		ur.selectJurisdictionStep();
//		ref1.personalInformation();
//		ref1.residenceAndMailing();
//		ref1.editAndReview();
//		ref1.createUserLogin();
//		System.out.println("User Created successfully.");
//		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
//		//Created user login
//		ref1.loginAsCreatedUser();
//		MYClass MYC = new MYClass(driver, prop);
//		MYC.Termsandconditions();
//		System.out.println("User logged in successfully.");
//		ObjectRepo.test.log(Status.PASS, "User logged in successfully.");
//		//Change passphrase and security questions
//		ref1.changePassphraseAndSecurityQuestions();
//		ref.logout();
//		System.out.println("User change passphrase and security questions successfully.");
//		ObjectRepo.test.log(Status.PASS, "User change passphrase and security questions successfully.");
//		//User log in with new passphrase
//		ref1.userLoginWithNewPassphrase();
//		MYC.Termsandconditions();
//		//Download 3 user registration forms
//		ref1.downloadThreeRegistrationForms();
//		System.out.println("User download user registration forms successfully.");
//		ObjectRepo.test.log(Status.PASS, "User download user registration forms successfully.");
//		//Change Jurisdiction
//		ref2.chnageJurisdictionCAtoQC();
//		ref.logout();
//		System.out.println("User submit change jurisdiction request successfully");
//		ObjectRepo.test.log(Status.PASS, "User submit change jurisdiction request successfully");
//		//Welcoming (Quebec) Registrar Log in and raised revision request
//		ref1.loginAsJurisdictionUserForWelcomingJurisdiction();
//		ref1.handlesecurityQuestion();
//		MYC.Termsandconditions();
//		ref1.registrarSearchUserAndGoToUserDetailsPage();
//		ref1.raisedRevisionRequestUserRegistrationByRegistrar();
//		ref.logout();
//		System.out.println("Registrar raised revision request to user successfully");
//		ObjectRepo.test.log(Status.PASS, "Registrar raised revision request to user successfully");
//		//User Login And Submit Revision Request
//		Thread.sleep(2000);
//		ref1.userLoginWithNewPassphrase();
//		MYC.Termsandconditions();
//		ref1.userSubmitRevisionRequest();
//		ref.logout();
//		System.out.println("User submit revision request successfully");
//		ObjectRepo.test.log(Status.PASS, "User submit revision request successfully");
//		//Quebec Registrar Login and approve and assign Service provider role
//		ref1.loginAsJurisdictionUserForWelcomingJurisdiction();
//		MYC.Termsandconditions();
//		ref1.registrarSearchUserAndGoToUserDetailsPage();
//		ref1.registrarViewOldValeAndNewValueAfterUserSubmitRequestRevision();
//		ref1.registrarApproveAndAssignServiceProviderRole();
//		ref.logout();
//		System.out.println("Registrar approve and assign role to user successfully");
//		ObjectRepo.test.log(Status.PASS, "Registrar approve and assign role to user successfully");
//		//Quebec Authority approve user
//		ref1.authorityUserLoginForWelcomingJurisdiction();
//		ref1.handlesecurityQuestion();
//		MYC.Termsandconditions();
//		ref1.registrarSearchUserAndGoToUserDetailsPage();
//		ref1.authorityApproveUser();
//		ref.logout();
//		System.out.println("Authority approve user successfully");
//		ObjectRepo.test.log(Status.PASS, "Authority approve user successfully");
//		//Approved User Log in and Edit their User Details
//		ref1.approvedUserLogin();
//		MYC.Termsandconditions();
//		ref1.UserEditTheirDetails();
//		ref.logout();
//		System.out.println("User edit user details successfully");
//		ObjectRepo.test.log(Status.PASS, "User edit user details successfully");
//		//Quebec Registrar login and approve proposed details
//		ref1.loginAsJurisdictionUserForWelcomingJurisdiction();
//		MYC.Termsandconditions();
//		ref1.registrarSearchUserAndGoToUserDetailsPage();
//		ref1.registrarApproveProposedUserDetails();
//		ref.logout();
//		System.out.println("Registrar approve proposed user details successfully");
//		ObjectRepo.test.log(Status.PASS, "Registrar approve proposed user details successfully");
//		//Quebec Registrar Login and Proposed role change for user
//		ref1.loginAsJurisdictionUserForWelcomingJurisdiction();
//		MYC.Termsandconditions();
//		ref1.registrarSearchUserAndGoToUserDetailsPage();
//		ref1.registrarProposedRoleChnage();
//		ref.logout();
//		System.out.println("Registrar proposed role change successfully");
//		ObjectRepo.test.log(Status.PASS, "Registrar proposed role change successfully");
//		//Quebec Authority Login and Approve Proposed Role Change
//		ref1.authorityUserLoginForWelcomingJurisdiction();
//		ref1.registrarSearchUserAndGoToUserDetailsPage();
//		ref1.authorityApproveProposedRoleChange();
//		ref.logout();
//		System.out.println("Authority approve proposed role change successfully");
//		ObjectRepo.test.log(Status.PASS, "Authority approve proposed role change successfully");
//		//Approved User Log in and raised change jurisdiction request from Quebec To California
//		ref1.approvedUserLogin();
//		MYC.Termsandconditions();
//		ref1.changeJurisdictionQuebecToCalifornia();
//		ref.logout();
//		System.out.println("Approved user submit change jurisdiction request successfully");
//		ObjectRepo.test.log(Status.PASS, "Approved user submit change jurisdiction request successfully");
//
//	}

	/*
	 *TC_Id      : C0002
	 *Tc_Title   : Registrar_Denied_Change_Jurisdiction_Request
	 *Author     : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 2,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void registrar_Denied_Change_Jurisdiction_Request() throws Exception {
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
		MYClass MYC = new MYClass();
		MYC.Termsandconditions();
		System.out.println("User logged in successfully.");
		ObjectRepo.test.log(Status.PASS, "User logged in successfully.");
		//Change passphrase and security questions
		ref1.changePassphraseAndSecurityQuestions();
		ref.logout();
		System.out.println("User change passphrase and security questions successfully.");
		ObjectRepo.test.log(Status.PASS, "User change passphrase and security questions successfully.");
		//User log in with new passphrase
		ref1.userLoginWithNewPassphrase();
		MYC.Termsandconditions();
		//Download 3 user registration forms
		ref1.downloadThreeRegistrationForms();
		System.out.println("User download user registration forms successfully.");
		ObjectRepo.test.log(Status.PASS, "User download user registration forms successfully.");
		//Change Jurisdiction
		ref2.chnageJurisdictionCAtoQC();
		ref.logout();
		System.out.println("User submit change jurisdiction request successfully");
		ObjectRepo.test.log(Status.PASS, "User submit change jurisdiction request successfully");
		//Welcoming (Quebec) Registrar Log in and raised revision request
		ref1.loginAsJurisdictionUserForWelcomingJurisdiction();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.raisedRevisionRequestUserRegistrationByRegistrar();
		ref.logout();
		System.out.println("Registrar raised revision request to user successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar raised revision request to user successfully");
		//User Login And Submit Revision Request
		Thread.sleep(2000);
		ref1.userLoginWithNewPassphrase();
		MYC.Termsandconditions();
		ref1.userSubmitRevisionRequest();
		ref.logout();
		System.out.println("User submit revision request successfully");
		ObjectRepo.test.log(Status.PASS, "User submit revision request successfully");
		//Quebec Registrar Login and approve and assign Service provider role
		ref1.loginAsJurisdictionUserForWelcomingJurisdiction();
		MYC.Termsandconditions();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarViewOldValeAndNewValueAfterUserSubmitRequestRevision();
		ref1.registrarApproveAndAssignServiceProviderRole();
		ref.logout();
		System.out.println("Registrar approve and assign role to user successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar approve and assign role to user successfully");
		//Quebec Authority approve user
		ref1.authorityUserLoginForWelcomingJurisdiction();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.authorityApproveUser();
		ref.logout();
		System.out.println("Authority approve user successfully");
		ObjectRepo.test.log(Status.PASS, "Authority approve user successfully");
		//Approved User Log in and Edit their User Details
		ref1.approvedUserLogin();
		MYC.Termsandconditions();
		ref1.UserEditTheirDetails();
		ref.logout();
		System.out.println("User edit user details successfully");
		ObjectRepo.test.log(Status.PASS, "User edit user details successfully");
		//Quebec Registrar login and approve proposed details
		ref1.loginAsJurisdictionUserForWelcomingJurisdiction();
		MYC.Termsandconditions();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarApproveProposedUserDetails();
		ref.logout();
		System.out.println("Registrar approve proposed user details successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar approve proposed user details successfully");
		//Quebec Registrar Login and Proposed role change for user
		ref1.loginAsJurisdictionUserForWelcomingJurisdiction();
		MYC.Termsandconditions();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarProposedRoleChnage();
		ref.logout();
		System.out.println("Registrar proposed role change successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar proposed role change successfully");
		//Quebec Authority Login and Approve Proposed Role Change
		ref1.authorityUserLoginForWelcomingJurisdiction();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.authorityApproveProposedRoleChange();
		ref.logout();
		System.out.println("Authority approve proposed role change successfully");
		ObjectRepo.test.log(Status.PASS, "Authority approve proposed role change successfully");
		//Approved User Log in and raised change jurisdiction request from Quebec To California
		ref1.approvedUserLogin();
		MYC.Termsandconditions();
		ref1.changeJurisdictionQuebecToCalifornia();
		ref.logout();
		System.out.println("Approved user submit change jurisdiction request successfully");
		ObjectRepo.test.log(Status.PASS, "Approved user submit change jurisdiction request successfully");
		//California Registrar Login and Denied Change Jurisdiction Request
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.welcomingRegistrarDeniedChangeJurisdictionRequest();
		ref.logout();
		System.out.println("Registrar denied change jurisdiction request successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar denied change jurisdiction request successfully");
	}
}
