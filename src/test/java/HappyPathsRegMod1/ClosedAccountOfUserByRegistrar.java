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

public class ClosedAccountOfUserByRegistrar extends base {

	//	/*
	//	 *TC_Id      : C0001
	//	 *Tc_Title   : Authority_Approve_user
	//	 *Author     : pravin.jogi@eqanim.com           
	//	 */
	//	@Test(priority = 1,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	//	public void authority_Approve_user() throws Exception {
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
	//	}
	//
	//	/*
	//	 *TC_Id      : C0010
	//	 *Tc_Title   : Registrar_Deactivate_User_Login_Without_Profile_Access
	//	 *Author     : pravin.jogi@eqanim.com           
	//	 */
	//	@Test(priority = 10,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	//	public void registrar_Deactivate_User_Login_Without_Profile_Access() throws Exception {
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
	//		//Registrar Login and Deactivate user login
	//		ref1.loginAsJurisdictionUserForWelcomingJurisdiction();
	//		ref1.registrarDeactivateUserLoginWithoutProfileAccess();
	//		System.out.println("Registrar Deactivate User Login successfully");
	//		ObjectRepo.test.log(Status.PASS, "Registrar Deactivate User Login successfully");
	//	}
	//
	//	/*
	//	 *TC_Id      : C0011
	//	 *Tc_Title   : Registrar_Activate_User_Login
	//	 *Author     : pravin.jogi@eqanim.com           
	//	 */
	//	@Test(priority = 11,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	//	public void registrar_Activate_User_Login() throws Exception {
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
	//		//Registrar Login and Deactivate user login
	//		ref1.loginAsJurisdictionUserForWelcomingJurisdiction();
	//		ref1.registrarDeactivateUserLoginWithoutProfileAccess();
	//		System.out.println("Registrar Deactivate User Login successfully");
	//		ObjectRepo.test.log(Status.PASS, "Registrar Deactivate User Login successfully");
	//		//Registrar Login and Activate user login
	//		ref1.registrarActivateUserLogin();	
	//		System.out.println("Registrar Activate User Login successfully");
	//		ObjectRepo.test.log(Status.PASS, "Registrar Activate User Login successfully");
	//	}
	//
	//	/*
	//	 *TC_Id      : C0012
	//	 *Tc_Title   : Registrar_Deactivate_User_Login_With_Profile_Access
	//	 *Author     : pravin.jogi@eqanim.com           
	//	 */
	//	@Test(priority = 12,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	//	public void registrar_Deactivate_User_Login_With_Profile_Access() throws Exception {
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
	//		//Registrar Login and Deactivate user login without profile access
	//		ref1.loginAsJurisdictionUserForWelcomingJurisdiction();
	//		ref1.registrarDeactivateUserLoginWithoutProfileAccess();
	//		System.out.println("Registrar deactivate User Login successfully");
	//		ObjectRepo.test.log(Status.PASS, "Registrar deactivate User Login successfully");
	//		//Registrar Login and Activate user login
	//		ref1.registrarActivateUserLogin();
	//		System.out.println("Registrar Activate User Login successfully");
	//		ObjectRepo.test.log(Status.PASS, "Registrar Activate User Login successfully");
	//		//Registrar Login and Deactivate user login with profile access
	//		ref1.registrarDeactivateUserLoginWithProfileAccess();
	//		System.out.println("Registrar deactivate User with profile access Login successfully");
	//		ObjectRepo.test.log(Status.PASS, "Registrar deactivate User with profile access Login successfully");
	//	}
	//
	//	/*
	//	 *TC_Id      : C0012
	//	 *Tc_Title   : registrar_Activate_User_Login1
	//	 *Author     : pravin.jogi@eqanim.com           
	//	 */
	//	@Test(priority = 12,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	//	public void registrar_Activate_User_Login1() throws Exception {
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
	//		//Registrar Login and Deactivate user login without profile access
	//		ref1.loginAsJurisdictionUserForWelcomingJurisdiction();
	//		ref1.registrarDeactivateUserLoginWithoutProfileAccess();
	//		System.out.println("Registrar deactivate User Login successfully");
	//		ObjectRepo.test.log(Status.PASS, "Registrar deactivate User Login successfully");
	//		//Registrar Login and Activate user login
	//		ref1.registrarActivateUserLogin();
	//		System.out.println("Registrar Activate User Login successfully");
	//		ObjectRepo.test.log(Status.PASS, "Registrar Activate User Login successfully");
	//		//Registrar Login and Deactivate user login with profile access
	//		ref1.registrarDeactivateUserLoginWithProfileAccess();
	//		System.out.println("Registrar deactivate User with profile access Login successfully");
	//		ObjectRepo.test.log(Status.PASS, "Registrar deactivate User with profile access Login successfully");
	//		//Registrar Activate user login
	//		ref1.registrarActivateUserLogin();
	//		System.out.println("Registrar activate User with profile access Login successfully");
	//		ObjectRepo.test.log(Status.PASS, "Registrar activate User with profile access Login successfully");
	//	}
	//
	//	/*
	//	 *TC_Id      : C0013
	//	 *Tc_Title   : registrar_update_User_Email
	//	 *Author     : pravin.jogi@eqanim.com           
	//	 */
	//	@Test(priority = 13,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	//	public void registrar_update_User_Email() throws Exception {
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
	//		//Registrar Login and Deactivate user login without profile access
	//		ref1.loginAsJurisdictionUserForWelcomingJurisdiction();
	//		ref1.registrarDeactivateUserLoginWithoutProfileAccess();
	//		System.out.println("Registrar deactivate User Login successfully");
	//		ObjectRepo.test.log(Status.PASS, "Registrar deactivate User Login successfully");
	//		//Registrar Login and Activate user login
	//		ref1.registrarActivateUserLogin();
	//		System.out.println("Registrar Activate User Login successfully");
	//		ObjectRepo.test.log(Status.PASS, "Registrar Activate User Login successfully");
	//		//Registrar Login and Deactivate user login with profile access
	//		ref1.registrarDeactivateUserLoginWithProfileAccess();
	//		System.out.println("Registrar deactivate User with profile access Login successfully");
	//		ObjectRepo.test.log(Status.PASS, "Registrar deactivate User with profile access Login successfully");
	//		//Registrar Activate user login
	//		ref1.registrarActivateUserLogin();
	//		System.out.println("Registrar activate User with profile access Login successfully");
	//		ObjectRepo.test.log(Status.PASS, "Registrar activate User with profile access Login successfully");
	//		//Registrar update user email
	//		ref1.registrarUpdateUserMailAddress();
	//		ref.logout();
	//		System.out.println("Registrar update user mail address successfully");
	//		ObjectRepo.test.log(Status.PASS, "Registrar update user mail address successfully");
	//	}
	//
	//	/*
	//	 *TC_Id      : C0014
	//	 *Tc_Title   : Another_Registrar_Login_And_update_User_Email
	//	 *Author     : pravin.jogi@eqanim.com           
	//	 */
	//	@Test(priority = 14,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	//	public void Another_Registrar_Login_And_update_User_Email() throws Exception {
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
	//		//Registrar Login and Deactivate user login without profile access
	//		ref1.loginAsJurisdictionUserForWelcomingJurisdiction();
	//		MYC.Termsandconditions();
	//		ref1.registrarDeactivateUserLoginWithoutProfileAccess();
	//		System.out.println("Registrar deactivate User Login successfully");
	//		ObjectRepo.test.log(Status.PASS, "Registrar deactivate User Login successfully");
	//		//Registrar Login and Activate user login
	//		ref1.registrarActivateUserLogin();
	//		System.out.println("Registrar Activate User Login successfully");
	//		ObjectRepo.test.log(Status.PASS, "Registrar Activate User Login successfully");
	//		//Registrar Login and Deactivate user login with profile access
	//		ref1.registrarDeactivateUserLoginWithProfileAccess();
	//		System.out.println("Registrar deactivate User with profile access Login successfully");
	//		ObjectRepo.test.log(Status.PASS, "Registrar deactivate User with profile access Login successfully");
	//		//Registrar Activate user login
	//		ref1.registrarActivateUserLogin();
	//		System.out.println("Registrar activate User with profile access Login successfully");
	//		ObjectRepo.test.log(Status.PASS, "Registrar activate User with profile access Login successfully");
	//		//Registrar update user email
	//		ref1.registrarUpdateUserMailAddress();
	//		ref.logout();
	//		System.out.println("Registrar update user mail address successfully");
	//		ObjectRepo.test.log(Status.PASS, "Registrar update user mail address successfully");
	//		//Another Registrar login and update email
	//		ref1.loginAsAnotherRegistrarUserOfQuebecJurisdiction();
	//		ref1.handlesecurityQuestion();
	//		ref1.registrarSearchUserAndGoToUserDetailsPage();
	//		ref1.anotherRegistrarApproveUpdateEmail();
	//		System.out.println("Another Registrar update user mail address successfully");
	//		ObjectRepo.test.log(Status.PASS, "Another Registrar update user mail address successfully");
	//		ref.logout();
	//
	//	}

	/*
	 *TC_Id      : C0015
	 *Tc_Title   : Registrar_Closed_User_Account
	 *Author     : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 15,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void registrar_Closed_User_Account() throws Exception {
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
		//Registrar Login and Deactivate user login without profile access
		ref1.loginAsJurisdictionUserForWelcomingJurisdiction();
		MYC.Termsandconditions();
		ref1.registrarDeactivateUserLoginWithoutProfileAccess();
		System.out.println("Registrar deactivate User Login successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar deactivate User Login successfully");
		//Registrar Login and Activate user login
		ref1.registrarActivateUserLogin();
		System.out.println("Registrar Activate User Login successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar Activate User Login successfully");
		//Registrar Login and Deactivate user login with profile access
		ref1.registrarDeactivateUserLoginWithProfileAccess();
		System.out.println("Registrar deactivate User with profile access Login successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar deactivate User with profile access Login successfully");
		//Registrar Activate user login
		ref1.registrarActivateUserLogin();
		System.out.println("Registrar activate User with profile access Login successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar activate User with profile access Login successfully");
		//Registrar update user email
		ref1.registrarUpdateUserMailAddress();
		ref.logout();
		System.out.println("Registrar update user mail address successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar update user mail address successfully");
		//Another Registrar login and update email
		ref1.loginAsAnotherRegistrarUserOfQuebecJurisdiction();
		ref1.handlesecurityQuestion();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.anotherRegistrarApproveUpdateEmail();
		System.out.println("Another Registrar update user mail address successfully");
		ObjectRepo.test.log(Status.PASS, "Another Registrar update user mail address successfully");
		ref.logout();
		//Registrar login and closed user account
		ref1.loginAsJurisdictionUserForWelcomingJurisdiction();
		ref1.registrarClosedUserAccount();
		System.out.println("Registrar closed user account successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar closed user account successfully");
		ref.logout();
	}
}
