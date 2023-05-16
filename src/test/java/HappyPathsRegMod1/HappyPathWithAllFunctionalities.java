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

public class HappyPathWithAllFunctionalities extends base {
	
//	/*
//     *TC_Id      : C0001
//     *Tc_Title   : UserRegistration
//     *Author     : pravin.jogi@eqanim.com           
//     */
//	@Test(priority = 1,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
//	public void userRegistration() throws Exception {
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
//		}
//	
//	/*
//     *TC_Id      : C0002
//     *Tc_Title   : registered_User_Login
//     *Author     : pravin.jogi@eqanim.com           
//     */
//	@Test(priority = 2,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
//	public void registered_User_Login() throws Exception {
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
//		}
//	
//	/*
//     *TC_Id      : C0003
//     *Tc_Title   : Change_Passphrase_and_AgainLogin_User
//     *Author     : pravin.jogi@eqanim.com           
//     */
//	@Test(priority = 3,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
//	public void change_Passphrase_and_AgainLogin_User() throws Exception {
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
//		}
//
//	/*
//     *TC_Id      : C0004
//     *Tc_Title   : Download_Three_Registration_Forms
//     *Author     : pravin.jogi@eqanim.com           
//     */
//	@Test(priority = 3,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
//	public void download_Three_Registration_Forms() throws Exception {
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
//		}
//	
//	/*
//     *TC_Id      : C0005
//     *Tc_Title   : Change_JurisdictionBy_Pending_User
//     *Author     : pravin.jogi@eqanim.com           
//     */
//	@Test(priority = 5,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
//	public void change_JurisdictionBy_Pending_User() throws Exception {
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
//		
//		}
//	
//	/*
//     *TC_Id      : C0006
//     *Tc_Title   : welcoming_Jurisdiction_Registrar_Login_Raised_Revision_Request
//     *Author     : pravin.jogi@eqanim.com           
//     */
//	@Test(priority = 6,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
//	public void welcoming_Jurisdiction_Registrar_Login_Raised_Revision_Request() throws Exception {
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
//		}
//	
//	/*
//     *TC_Id      : C0007
//     *Tc_Title   : user_login_And_Submit_Revision_Request
//     *Author     : pravin.jogi@eqanim.com           
//     */
//	@Test(priority = 7,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
//	public void user_login_And_Submit_Revision_Request() throws Exception {
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
//		
//		}
//	
//	/*
//     *TC_Id      : C0008
//     *Tc_Title   : registrar_Approve_And_Assign_ServiceProvider_Role
//     *Author     : pravin.jogi@eqanim.com           
//     */
//	@Test(priority = 8,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
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
//		}
//	
//	/*
//     *TC_Id      : C0009
//     *Tc_Title   : Authority_Approve_user
//     *Author     : pravin.jogi@eqanim.com           
//     */
//	@Test(priority = 9,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
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
//		}
//	
//	/*
//     *TC_Id      : C0010
//     *Tc_Title   : Approved_User_Edit_User_Details
//     *Author     : pravin.jogi@eqanim.com           
//     */
//	@Test(priority = 10,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
//	public void approved_User_Edit_User_Details() throws Exception {
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
//		}
//	
//	/*
//     *TC_Id      : C0011
//     *Tc_Title   : Registrar_Approve_Proposed_User_Details
//     *Author     : pravin.jogi@eqanim.com           
//     */
//	@Test(priority = 11,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
//	public void registrar_Approve_Proposed_User_Details() throws Exception {
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
//		}
//	
//	/*
//     *TC_Id      : C0012
//     *Tc_Title   : Registrar_Proposed_Role_Change
//     *Author     : pravin.jogi@eqanim.com           
//     */
//	@Test(priority = 12,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
//	public void registrar_Proposed_Role_Change() throws Exception {
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
//		
//		}
//	
//	/*
//     *TC_Id      : C0013
//     *Tc_Title   : authority_Approve_Proposed_Role_Change
//     *Author     : pravin.jogi@eqanim.com           
//     */
//	@Test(priority = 13,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
//	public void authority_Approve_Proposed_Role_Change() throws Exception {
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
//		}
//	
//	/*
//     *TC_Id      : C0014
//     *Tc_Title   : approve_user_Raised_change_Jurisdiction_Request
//     *Author     : pravin.jogi@eqanim.com           
//     */
//	@Test(priority = 14,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
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
//		}
//	
//	/*
//     *TC_Id      : C0015
//     *Tc_Title   : registrar_Authority_Login_And_Approve_Change_Jurisdiction_Request
//     *Author     : pravin.jogi@eqanim.com           
//     */
//	@Test(priority = 15,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
//	public void registrar_Authority_Login_And_Approve_Change_Jurisdiction_Request() throws Exception {
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
//		//California Registrar Login and approve Change Jurisdiction Request
//		ref1.californiaRegistrar();
//		ref1.handlesecurityQuestion();
//		MYC.Termsandconditions();
//		ref1.registrarSearchUserAndGoToUserDetailsPage();
//		ref1.welcomingRegistrarApproveChangeJurisdictionRequest();
//		ref.logout();
//		System.out.println("Registrar approve change jurisdiction request and proposed to authority successfully");
//		ObjectRepo.test.log(Status.PASS, "Registrar approve change jurisdiction request and proposed to authority successfully");
//		//California Authority Login and approve dual approval for Change Jurisdiction Request
//		ref1.LoginAsCaliforniaAuthority();
//		ref1.handlesecurityQuestion();
//		MYC.Termsandconditions();
//		ref1.registrarSearchUserAndGoToUserDetailsPage();
//		ref1.welcomingRegistrarApproveChangeJurisdictionRequest();
//		ref.logout();
//		System.out.println("Authority approve dual approval for change jurisdiction request successfully");
//		ObjectRepo.test.log(Status.PASS, "Authority approve dual approval for change jurisdiction request successfully");
//		
//		}
//	
//	/*
//     *TC_Id      : C0016
//     *Tc_Title   : Approved_user_Login_And_Raised_Cross_Jurisdiction_request
//     *Author     : pravin.jogi@eqanim.com           
//     */
//	@Test(priority = 16,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
//	public void approved_user_Login_And_Raised_Cross_Jurisdiction_request() throws Exception {
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
//		//California Registrar Login and approve Change Jurisdiction Request
//		ref1.californiaRegistrar();
//		ref1.handlesecurityQuestion();
//		MYC.Termsandconditions();
//		ref1.registrarSearchUserAndGoToUserDetailsPage();
//		ref1.welcomingRegistrarApproveChangeJurisdictionRequest();
//		ref.logout();
//		System.out.println("Registrar approve change jurisdiction request and proposed to authority successfully");
//		ObjectRepo.test.log(Status.PASS, "Registrar approve change jurisdiction request and proposed to authority successfully");
//		//California Authority Login and approve dual approval for Change Jurisdiction Request
//		ref1.LoginAsCaliforniaAuthority();
//		ref1.handlesecurityQuestion();
//		MYC.Termsandconditions();
//		ref1.registrarSearchUserAndGoToUserDetailsPage();
//		ref1.welcomingRegistrarApproveChangeJurisdictionRequest();
//		ref.logout();
//		System.out.println("Authority approve dual approval for change jurisdiction request successfully");
//		ObjectRepo.test.log(Status.PASS, "Authority approve dual approval for change jurisdiction request successfully");
//		//Approve user login and raised cross jurisdiction request
//		ref1.approvedUserLogin();
//		MYC.Termsandconditions();
//		ref1.approvedUserRisedCrossJurisdictionRequest();
//		ref.logout();
//		System.out.println("Approved user raised cross jurisdiction request successfully");
//		ObjectRepo.test.log(Status.PASS, "Approved user raised cross jurisdiction request successfully");
//		}
//	
//	/*
//     *TC_Id      : C0017
//     *Tc_Title   : Original_Jurisdiction_Registrar_Login_And_Share_User_Profile_With_Welcoming_jurisdiction
//     *Author     : pravin.jogi@eqanim.com           
//     */
//	@Test(priority = 17,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
//	public void original_Jurisdiction_Registrar_Login_And_Share_User_Profile_With_Welcoming_jurisdiction() throws Exception {
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
//		//California Registrar Login and approve Change Jurisdiction Request
//		ref1.californiaRegistrar();
//		ref1.handlesecurityQuestion();
//		MYC.Termsandconditions();
//		ref1.registrarSearchUserAndGoToUserDetailsPage();
//		ref1.welcomingRegistrarApproveChangeJurisdictionRequest();
//		ref.logout();
//		System.out.println("Registrar approve change jurisdiction request and proposed to authority successfully");
//		ObjectRepo.test.log(Status.PASS, "Registrar approve change jurisdiction request and proposed to authority successfully");
//		//California Authority Login and approve dual approval for Change Jurisdiction Request
//		ref1.LoginAsCaliforniaAuthority();
//		ref1.handlesecurityQuestion();
//		MYC.Termsandconditions();
//		ref1.registrarSearchUserAndGoToUserDetailsPage();
//		ref1.welcomingRegistrarApproveChangeJurisdictionRequest();
//		ref.logout();
//		System.out.println("Authority approve dual approval for change jurisdiction request successfully");
//		ObjectRepo.test.log(Status.PASS, "Authority approve dual approval for change jurisdiction request successfully");
//		//Approve user login and raised cross jurisdiction request
//		ref1.approvedUserLogin();
//		MYC.Termsandconditions();
//		ref1.approvedUserRisedCrossJurisdictionRequest();
//		ref.logout();
//		System.out.println("Approved user raised cross jurisdiction request successfully");
//		ObjectRepo.test.log(Status.PASS, "Approved user raised cross jurisdiction request successfully");
//		//Original Jurisdiction Registrar(california) login and share profile with Welcoming Jurisdiction
//		ref1.californiaRegistrar();
//		MYC.Termsandconditions();
//		ref1.registrarSearchUserAndGoToUserDetailsPage();
//		ref1.originalJurisdictionRegistrarShareUserProfileWithWelcomingJurisdiction();
//		ref.logout();
//		System.out.println("Original Jurisdiction registrar share user profile with welcoming jurisdiction successfully");
//		ObjectRepo.test.log(Status.PASS, "Original Jurisdiction registrar share user profile with welcoming jurisdiction successfully");	
//		}
//	
//	/*
//     *TC_Id      : C0018
//     *Tc_Title   : Welcoming_Jurisdiction_Registrar_Login_And_View_User_Profile
//     *Author     : pravin.jogi@eqanim.com           
//     */
//	@Test(priority = 18,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
//	public void welcoming_Jurisdiction_Registrar_Login_And_View_User_Profile() throws Exception {
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
//		//California Registrar Login and approve Change Jurisdiction Request
//		ref1.californiaRegistrar();
//		ref1.handlesecurityQuestion();
//		MYC.Termsandconditions();
//		ref1.registrarSearchUserAndGoToUserDetailsPage();
//		ref1.welcomingRegistrarApproveChangeJurisdictionRequest();
//		ref.logout();
//		System.out.println("Registrar approve change jurisdiction request and proposed to authority successfully");
//		ObjectRepo.test.log(Status.PASS, "Registrar approve change jurisdiction request and proposed to authority successfully");
//		//California Authority Login and approve dual approval for Change Jurisdiction Request
//		ref1.LoginAsCaliforniaAuthority();
//		ref1.handlesecurityQuestion();
//		MYC.Termsandconditions();
//		ref1.registrarSearchUserAndGoToUserDetailsPage();
//		ref1.welcomingRegistrarApproveChangeJurisdictionRequest();
//		ref.logout();
//		System.out.println("Authority approve dual approval for change jurisdiction request successfully");
//		ObjectRepo.test.log(Status.PASS, "Authority approve dual approval for change jurisdiction request successfully");
//		//Approve user login and raised cross jurisdiction request
//		ref1.approvedUserLogin();
//		MYC.Termsandconditions();
//		ref1.approvedUserRisedCrossJurisdictionRequest();
//		ref.logout();
//		System.out.println("Approved user raised cross jurisdiction request successfully");
//		ObjectRepo.test.log(Status.PASS, "Approved user raised cross jurisdiction request successfully");
//		//Original Jurisdiction Registrar(california) login and share profile with Welcoming Jurisdiction
//		ref1.californiaRegistrar();
//		MYC.Termsandconditions();
//		ref1.registrarSearchUserAndGoToUserDetailsPage();
//		ref1.originalJurisdictionRegistrarShareUserProfileWithWelcomingJurisdiction();
//		ref.logout();
//		System.out.println("Original Jurisdiction registrar share user profile with welcoming jurisdiction successfully");
//		ObjectRepo.test.log(Status.PASS, "Original Jurisdiction registrar share user profile with welcoming jurisdiction successfully");
//		//Welcoming Jurisdiction Registrar login and view user profile
//		ref1.loginAsJurisdictionUserForWelcomingJurisdiction();
//		MYC.Termsandconditions();
//		ref1.registrarSearchUserAndGoToUserDetailsPage();
//		ref1.welcomingRegistrarViewUserProfile();
//		ref.logout();
//		System.out.println("Welcoming jurisdiction registrar view user profile successfully");
//		ObjectRepo.test.log(Status.PASS, "Welcoming jurisdiction registrar view user profile successfully");
//		}
	
	/*
     *TC_Id      : C0019
     *Tc_Title   : user_Login_And_Close_His_Account
     *Author     : pravin.jogi@eqanim.com           
     */
	@Test(priority = 19,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void user_Login_And_Close_His_Account() throws Exception {
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
		MYC.resetPassphrasePrompt1();
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
		MYC.resetPassphrasePrompt1();
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
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.raisedRevisionRequestUserRegistrationByRegistrar();
		ref.logout();
		System.out.println("Registrar raised revision request to user successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar raised revision request to user successfully");
		//User Login And Submit Revision Request
		Thread.sleep(2000);
		ref1.userLoginWithNewPassphrase();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt1();
		ref1.userSubmitRevisionRequest();
		ref.logout();
		System.out.println("User submit revision request successfully");
		ObjectRepo.test.log(Status.PASS, "User submit revision request successfully");
		//Quebec Registrar Login and approve and assign Service provider role
		ref1.loginAsJurisdictionUserForWelcomingJurisdiction();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
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
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.authorityApproveUser();
		ref.logout();
		System.out.println("Authority approve user successfully");
		ObjectRepo.test.log(Status.PASS, "Authority approve user successfully");
		//Approved User Log in and Edit their User Details
		ref1.approvedUserLogin();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt1();
		ref1.UserEditTheirDetails();
		ref.logout();
		System.out.println("User edit user details successfully");
		ObjectRepo.test.log(Status.PASS, "User edit user details successfully");
		//Quebec Registrar login and approve proposed details
		ref1.loginAsJurisdictionUserForWelcomingJurisdiction();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarApproveProposedUserDetails();
		ref.logout();
		System.out.println("Registrar approve proposed user details successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar approve proposed user details successfully");
		//Quebec Registrar Login and Proposed role change for user
		ref1.loginAsJurisdictionUserForWelcomingJurisdiction();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarProposedRoleChnage();
		ref.logout();
		System.out.println("Registrar proposed role change successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar proposed role change successfully");
		//Quebec Authority Login and Approve Proposed Role Change
		ref1.authorityUserLoginForWelcomingJurisdiction();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.authorityApproveProposedRoleChange();
		ref.logout();
		System.out.println("Authority approve proposed role change successfully");
		ObjectRepo.test.log(Status.PASS, "Authority approve proposed role change successfully");
		//Approved User Log in and raised change jurisdiction request from Quebec To California
		ref1.approvedUserLogin();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt1();
		ref1.changeJurisdictionQuebecToCalifornia();
		ref.logout();
		System.out.println("Approved user submit change jurisdiction request successfully");
		ObjectRepo.test.log(Status.PASS, "Approved user submit change jurisdiction request successfully");
		//California Registrar Login and approve Change Jurisdiction Request
		ref1.californiaRegistrar();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.welcomingRegistrarApproveChangeJurisdictionRequest();
		ref.logout();
		System.out.println("Registrar approve change jurisdiction request and proposed to authority successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar approve change jurisdiction request and proposed to authority successfully");
		//California Authority Login and approve dual approval for Change Jurisdiction Request
		ref1.LoginAsCaliforniaAuthority();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.welcomingRegistrarApproveChangeJurisdictionRequest();
		ref.logout();
		System.out.println("Authority approve dual approval for change jurisdiction request successfully");
		ObjectRepo.test.log(Status.PASS, "Authority approve dual approval for change jurisdiction request successfully");
		//Approve user login and raised cross jurisdiction request
		ref1.approvedUserLogin();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt1();
		ref1.approvedUserRisedCrossJurisdictionRequest();
		ref.logout();
		System.out.println("Approved user raised cross jurisdiction request successfully");
		ObjectRepo.test.log(Status.PASS, "Approved user raised cross jurisdiction request successfully");
		//Original Jurisdiction Registrar(california) login and share profile with Welcoming Jurisdiction
		ref1.californiaRegistrar();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.originalJurisdictionRegistrarShareUserProfileWithWelcomingJurisdiction();
		ref.logout();
		System.out.println("Original Jurisdiction registrar share user profile with welcoming jurisdiction successfully");
		ObjectRepo.test.log(Status.PASS, "Original Jurisdiction registrar share user profile with welcoming jurisdiction successfully");
		//Welcoming Jurisdiction Registrar login and view user profile
		ref1.loginAsJurisdictionUserForWelcomingJurisdiction();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.welcomingRegistrarViewUserProfile();
		ref.logout();
		System.out.println("Welcoming jurisdiction registrar view user profile successfully");
		ObjectRepo.test.log(Status.PASS, "Welcoming jurisdiction registrar view user profile successfully");
		//Approved user log in and Closed His account
		ref1.approvedUserLogin();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt1();
		ref1.approvedUserClosedHisAccount();
		System.out.println("Approve user closed his account successfully");
		ObjectRepo.test.log(Status.PASS, "Approve user closed his account successfully");
		}
}
