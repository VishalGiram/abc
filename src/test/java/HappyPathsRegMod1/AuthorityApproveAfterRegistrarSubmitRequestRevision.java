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

public class AuthorityApproveAfterRegistrarSubmitRequestRevision extends base {


//	/*
//	 *TC_Id      : C0001
//	 *Tc_Title   : registrar_Approve_And_Assign_ServiceProvider_Role
//	 *Author     : pravin.jogi@eqanim.com           
//	 */
//	@Test(priority = 1,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
//	public void registrar_Approve_And_Assign_ServiceProvider_Role() throws Exception {
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
//
//	}
//
//	/*
//	 *TC_Id      : C0009
//	 *Tc_Title   : Authority_Login_and_Request_Revision_To_Registrar
//	 *Author     : pravin.jogi@eqanim.com           
//	 */
//	@Test(priority = 9,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
//	public void authority_Login_and_Request_Revision_To_Registrar() throws Exception {
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
//		//Quebec Authority Login and Request Revision To Registrar
//		ref1.authorityUserLoginForWelcomingJurisdiction();
//		ref1.handlesecurityQuestion();
//		ref1.registrarSearchUserAndGoToUserDetailsPage();
//		ref1.authorityRequestRevisionToRegistrar();
//		ref.logout();
//		System.out.println("Authority done request revision to user successfully");
//		ObjectRepo.test.log(Status.PASS, "Authority done request revision to user successfully");
//	}
//
//	/*
//	 *TC_Id      : C0010
//	 *Tc_Title   : Registrar_Login_And_Change_User_role
//	 *Author     : pravin.jogi@eqanim.com           
//	 */
//	@Test(priority = 10,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
//	public void registrar_Login_And_Change_User_role() throws Exception {
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
//		//Quebec Authority Login and Request Revision To Registrar
//		ref1.authorityUserLoginForWelcomingJurisdiction();
//		ref1.handlesecurityQuestion();
//		ref1.registrarSearchUserAndGoToUserDetailsPage();
//		ref1.authorityRequestRevisionToRegistrar();
//		ref.logout();
//		System.out.println("Authority done request revision to user successfully");
//		ObjectRepo.test.log(Status.PASS, "Authority done request revision to user successfully");
//		//Quebec Registrar Login and Change User Role
//		ref1.loginAsJurisdictionUserForWelcomingJurisdiction();
//		MYC.Termsandconditions();
//		ref1.registrarSearchUserAndGoToUserDetailsPage();
//		ref1.registrarChangeRoleAfterAuthorityRequestRevision();
//		ref.logout();
//		System.out.println("Registrar change use successfully");
//		ObjectRepo.test.log(Status.PASS, "Authority done request revision to user successfully");
//	}

	/*
	 *TC_Id      : C0011
	 *Tc_Title   : Authority_Login_And_Approve_user
	 *Author     : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 11,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void authority_Login_And_Approve_user() throws Exception {
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
		//Quebec Authority Login and Request Revision To Registrar
		ref1.authorityUserLoginForWelcomingJurisdiction();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.authorityRequestRevisionToRegistrar();
		ref.logout();
		System.out.println("Authority done request revision to user successfully");
		ObjectRepo.test.log(Status.PASS, "Authority done request revision to user successfully");
		//Quebec Registrar Login and Change User Role
		ref1.loginAsJurisdictionUserForWelcomingJurisdiction();
		MYC.Termsandconditions();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		//ref1.registrarChangeRoleAfterAuthorityRequestRevision();
		ref.logout();
		System.out.println("Registrar change use successfully");
		ObjectRepo.test.log(Status.PASS, "Authority done request revision to user successfully");
		//Quebec Authority login and approve user
		ref1.authorityUserLoginForWelcomingJurisdiction();
		MYC.Termsandconditions();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		//ref1.authorityApproveUser();
		ref.logout();
		System.out.println("Authority approve user successfully");
		ObjectRepo.test.log(Status.PASS, "Authority approve user successfully");
	}
}
