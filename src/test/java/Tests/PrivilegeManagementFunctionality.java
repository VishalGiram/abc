package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pageObjects.Homepage;
import pageObjects.MYClass;
import pageObjects.PendingUser;
import pageObjects.PrivilegeManagement;
import pageObjects.UserRegistration;
import resources.ObjectRepo;
import resources.base;

public class PrivilegeManagementFunctionality extends base {
	
	/*
	 *TC_Id         : C29351
	 *Tc_Title      : Verification_Of_Assigning_Roles_From_Same_Role_Type_During_the_Registration_Approval_Process
	 *Functionality : Privilege Management
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 1,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verification_Of_Assigning_Roles_From_Same_Role_Type_During_the_Registration_Approval_Process() throws Exception {
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
		ref1.assignMultipleRoleToUser();
		System.out.println("Registrar approve user successfully.");
		ObjectRepo.test.log(Status.PASS, "Registrar approve user successfully.");
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarViewRequestStatusAfterApprovedUser();
		System.out.println("Registrar view user request status successfully.");
		ObjectRepo.test.log(Status.PASS, "Registrar view user request status successfully.");
	}
	
	/*
	 *TC_Id         : C29352
	 *Tc_Title      : Verification_Of_Assigning_Multiple_Roles_From_Different_Role_Types_During_Registration_Approval_Process
	 *Functionality : Privilege Management
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 2,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verification_Of_Assigning_Multiple_Roles_From_Different_Role_Types_During_Registration_Approval_Process() throws Exception {
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
		ref1.assignMultipleRoleToUserAccrossRoleType();
		System.out.println("Registrar approve user successfully.");
		ObjectRepo.test.log(Status.PASS, "Registrar approve user successfully.");
	}

	/*
	 *TC_Id         : C29353
	 *Tc_Title      : Verification_Of_Assigning_Roles_Functionality_When_Application_status_is_Request_Revision
	 *Functionality : Privilege Management
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 3,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verification_Of_Assigning_Roles_Functionality_When_Application_status_is_Request_Revision() throws Exception {
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
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarViewRequestRevisionUser();
	}
	
	/*
	 *TC_Id         : C32284
	 *Tc_Title      : Verify_That_welcoming_Jurisdiction_User_Is_Able_TO_Any_role_From_Service_Provider_Role_Type_TO_User_Who_Has_requested_Change_Jurisdiction
	 *Functionality : Privilege Management
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 4,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void Verify_That_welcoming_Jurisdiction_User_Is_Able_TO_Any_role_From_Service_Provider_Role_Type_TO_User_Who_Has_requested_Change_Jurisdiction() throws Exception {
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
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarApproveAndAssignIndividualUsersRole();
		System.out.println("Registrar approve user successfully.");
		ObjectRepo.test.log(Status.PASS, "Registrar approve user successfully.");
		ref.logout();
		//Created User login and raised change jurisdiction request
		ref1.loginAsCreatedUser();
		ref1.changeJurisdictionCaliforniaToQuebec();
		System.out.println("Approved user raised change jurisdiction request successfully.");
		ObjectRepo.test.log(Status.PASS, "Approved user raised change jurisdiction request successfully.");
		ref.logout();
		//Welcoming Jurisdiction Registrar login and assign service provider role type to user
		ref1.loginAsJurisdictionUserForWelcomingJurisdiction();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarApproveAndAssignServiceProviderRole();
		System.out.println("Welcoming Jurisdiction Registrar is assign role from service provider role type");
		ObjectRepo.test.log(Status.PASS, "Welcoming Jurisdiction Registrar is assign role from service provider role type");
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarViewRequestStatusAfterProposedToAuthority();
		ref.logout();
		//Welcoming Authority login and approve user
		ref1.authorityUserLoginForWelcomingJurisdiction();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.authorityApproveChangeJurisdiction();
		System.out.println("Welcoming Jurisdiction Authority approve user");
		ObjectRepo.test.log(Status.PASS, "Welcoming Jurisdiction Authority approve user");
		ref.logout();
		//User login and view role
		ref1.runTimeloginAsCreatedUser();
		MYC.resetPassphrasePrompt1();
		ref1.userViewItsUserDetailsPage();
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='MuiTypography-root MuiTypography-body2 css-rmnksp'])[25]")));
		String role=driver.findElement(By.xpath("(//*[@class='MuiTypography-root MuiTypography-body2 css-rmnksp'])[25]")).getText();
		System.out.println("User is able to view his role :" + role);
		Assert.assertEquals("Market Monitor", role);
		ObjectRepo.test.log(Status.PASS, "User is able to view his role :" + role);
		System.out.println("User view his role which assigned by Welcoming Registrar successfully");
		ObjectRepo.test.log(Status.PASS, "User view his role which assigned by Welcoming Registrar successfully");
	}
	
	/*
	 *TC_Id         : C35593
	 *Tc_Title      : Verify_That_welcoming_Jurisdiction_User_Is_Able_TO_Any_role_From_Jurisdiction_Users_Role_Type_TO_User_Who_Has_requested_Change_Jurisdiction
	 *Functionality : Privilege Management
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 4,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"}, enabled=false)
	public void Verify_That_welcoming_Jurisdiction_User_Is_Able_TO_Any_role_From_Jurisdiction_Users_Role_Type_TO_User_Who_Has_requested_Change_Jurisdiction() throws Exception {
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
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarApproveAndAssignIndividualUsersRole();
		System.out.println("Registrar approve user successfully.");
		ObjectRepo.test.log(Status.PASS, "Registrar approve user successfully.");
		ref.logout();
		//Created User login and raised change jurisdiction request
		ref1.loginAsCreatedUser();
		ref1.changeJurisdictionCaliforniaToQuebec();
		System.out.println("Approved user raised change jurisdiction request successfully.");
		ObjectRepo.test.log(Status.PASS, "Approved user raised change jurisdiction request successfully.");
		ref.logout();
		//Welcoming Jurisdiction Registrar login and assign service provider role type to user
		ref1.loginAsJurisdictionUserForWelcomingJurisdiction();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarApproveAndAssignJurisdictionUserRole();
		System.out.println("Welcoming Jurisdiction Registrar is assign role from service provider role type");
		ObjectRepo.test.log(Status.PASS, "Welcoming Jurisdiction Registrar is assign role from service provider role type");
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarViewRequestStatusAfterProposedToAuthority();
		ref.logout();
		//Welcoming Authority login and approve user
		ref1.authorityUserLoginForWelcomingJurisdiction();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.authorityApproveUser();
		System.out.println("Welcoming Jurisdiction Authority approve user");
		ObjectRepo.test.log(Status.PASS, "Welcoming Jurisdiction Authority approve user");
		ref.logout();
		//User login and view role
		ref1.runTimeloginAsCreatedUser();
		MYC.resetPassphrasePrompt1();
		ref1.userViewItsUserDetailsPage();
		String role=driver.findElement(By.xpath("(//*[@class='MuiTypography-root MuiTypography-body2 css-rmnksp'])[25]")).getText();
		System.out.println("User is able to view his role :" + role);
		Assert.assertEquals("Registrar", role);
		ObjectRepo.test.log(Status.PASS, "User is able to view his role :" + role);
		System.out.println("User view his role which assigned by Welcoming Registrar successfully");
		ObjectRepo.test.log(Status.PASS, "User view his role which assigned by Welcoming Registrar successfully");
	}
	
	/*
	 *TC_Id         : C35594
	 *Tc_Title      : Verify_That_welcoming_Jurisdiction_User_Is_Able_TO_Any_role_From_Technical_Admin_System_Users_Role_Type_TO_User_Who_Has_requested_Change_Jurisdiction
	 *Functionality : Privilege Management
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 5,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verify_That_welcoming_Jurisdiction_User_Is_Able_TO_Any_role_From_Technical_Admin_System_Users_Role_Type_TO_User_Who_Has_requested_Change_Jurisdiction() throws Exception {
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
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarApproveAndAssignIndividualUsersRole();
		System.out.println("Registrar approve user successfully.");
		ObjectRepo.test.log(Status.PASS, "Registrar approve user successfully.");
		ref.logout();
		//Created User login and raised change jurisdiction request
		ref1.loginAsCreatedUser();
		ref1.changeJurisdictionCaliforniaToQuebec();
		System.out.println("Approved user raised change jurisdiction request successfully.");
		ObjectRepo.test.log(Status.PASS, "Approved user raised change jurisdiction request successfully.");
		ref.logout();
		//Welcoming Jurisdiction Registrar login and assign service provider role type to user
		ref1.loginAsJurisdictionUserForWelcomingJurisdiction();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarApproveAndAssignTechnicalAdminAndSystemUsersRole();
		System.out.println("Welcoming Jurisdiction Registrar is assign role from service provider role type");
		ObjectRepo.test.log(Status.PASS, "Welcoming Jurisdiction Registrar is assign role from service provider role type");
		ref.logout();
		//User login and view role
		ref1.runTimeloginAsCreatedUser();
		MYC.resetPassphrasePrompt1();
		ref1.userViewItsUserDetailsPage();
		String role=driver.findElement(By.xpath("(//*[@class='MuiTypography-root MuiTypography-body2 css-rmnksp'])[25]")).getText();
		System.out.println("User is able to view his role :" + role);
		Assert.assertEquals("System Admin", role);
		ObjectRepo.test.log(Status.PASS, "User is able to view his role :" + role);
		System.out.println("User view his role which assigned by Welcoming Registrar successfully");
		ObjectRepo.test.log(Status.PASS, "User view his role which assigned by Welcoming Registrar successfully");
	}
	
	/*
	 *TC_Id         : C35595
	 *Tc_Title      : Verify_That_welcoming_Jurisdiction_User_Is_Able_TO_Any_role_From_Individual_Users_Role_Type_TO_User_Who_Has_requested_Change_Jurisdiction
	 *Functionality : Privilege Management
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 6,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verify_That_welcoming_Jurisdiction_User_Is_Able_TO_Any_role_From_Individual_Users_Role_Type_TO_User_Who_Has_requested_Change_Jurisdiction() throws Exception {
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
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarApproveAndAssignTechnicalAdminAndSystemUsersRole();
		System.out.println("Registrar approve user successfully.");
		ObjectRepo.test.log(Status.PASS, "Registrar approve user successfully.");
		ref.logout();
		//Created User login and raised change jurisdiction request
		ref1.loginAsCreatedUser();
		ref1.changeJurisdictionCaliforniaToQuebec();
		System.out.println("Approved user raised change jurisdiction request successfully.");
		ObjectRepo.test.log(Status.PASS, "Approved user raised change jurisdiction request successfully.");
		ref.logout();
		//Welcoming Jurisdiction Registrar login and assign service provider role type to user
		ref1.loginAsJurisdictionUserForWelcomingJurisdiction();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarApproveAndAssignIndividualUsersRoleChangeJurisdiction();
		System.out.println("Welcoming Jurisdiction Registrar is assign role from service provider role type");
		ObjectRepo.test.log(Status.PASS, "Welcoming Jurisdiction Registrar is assign role from service provider role type");
		ref.logout();
		//User login and view role
		ref1.runTimeloginAsCreatedUser();
		MYC.resetPassphrasePrompt1();
		ref1.userViewItsUserDetailsPage();
		String role=driver.findElement(By.xpath("(//*[@class='MuiTypography-root MuiTypography-body2 css-rmnksp'])[25]")).getText();
		System.out.println("User is able to view his role :" + role);
		Assert.assertEquals("Individual Users", role);
		ObjectRepo.test.log(Status.PASS, "User is able to view his role :" + role);
		System.out.println("User view his role which assigned by Welcoming Registrar successfully");
		ObjectRepo.test.log(Status.PASS, "User view his role which assigned by Welcoming Registrar successfully");
	}
	
	/*
	 *TC_Id         : C29354, C36173 RPM-307
	 *Tc_Title      : Verification_Of_Dual_Approval_Functionality_From_Authority_If_User_assigned_With_The_role_Under_Jurisdiction_User_Or_Service_Provider_Role_type
	 *                Verify_That_the_User_has_Access_To_All_privileges_assined_to_That_role
	 *Functionality : Privilege Management
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 7,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void Verification_Of_Dual_Approval_Functionality_From_Authority_If_User_assigned_With_The_role_Under_Jurisdiction_User_Or_Service_Provider_Role_type() throws Exception {
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
		ref1.registrarApproveAndAssignJurisdictionUserRole();
		System.out.println("Registrar assign jurisdiction user role type to user successfully.");
		ObjectRepo.test.log(Status.PASS, "Registrar assign jurisdiction user role type to user successfully.");
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarViewRequestStatusAfterProposedToAuthority();
		ref.logout();
		//California Authority login and approve user
		ref1.LoginAsCaliforniaAuthority();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref1.registrarSearchPendingUserInPendingGridAndGoToUserDetailsPage();
		ref1.authorityApproveUser();
		System.out.println("Authority approve user successfully.");
		ObjectRepo.test.log(Status.PASS, "Authority approve user successfully.");
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarViewRequestStatusAfterApprovedUser();
		ref.logout();
		//Created user login and check privileges
		ref1.loginAsCreatedUser();
		//ref1.registrarSearchPendingUserInPendingGridAndGoToUserDetailsPage();
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,1000)");
//		driver.findElement(By.xpath("(//*[@class='MuiTypography-root MuiTypography-body1 css-1195g5e'])[2]")).click();
//		WebDriverWait wait=new WebDriverWait(driver,20);
//		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//input[@placeholder='Search…'])[2]")));
//		driver.findElement(By.xpath("(//input[@placeholder='Search…'])[2]")).sendKeys("Pending");
//		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//a[@class='link-cell'])[6]")));
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("(//a[@class='link-cell'])[1]")).click();
//		ref1.registrarApproveAndAssignIndividualUsersRole();
//		System.out.println("User assigned privileges successfully : Approve user privilege");
//		ObjectRepo.test.log(Status.PASS, "User assigned privileges successfully : Approve user privilege\"");
//		ref1.registrarDeactivateUserLoginWithoutProfileAccess();
//		System.out.println("User assigned privileges successfully : Deactivate user login without profile access");
//		ObjectRepo.test.log(Status.PASS, "User assigned privileges successfully : Deactivate user login without profile access");
//		ref1.registrarActivateUserLogin();
//		System.out.println("User assigned privileges successfully : Activate user login");
//		ObjectRepo.test.log(Status.PASS, "User assigned privileges successfully : Activate user login");
//		ref1.registrarDeactivateUserLoginWithProfileAccess();
//		System.out.println("User assigned privileges successfully : Deactivate user login With profile access");
//		ObjectRepo.test.log(Status.PASS, "User assigned privileges successfully : Deactivate user login With profile access");
//		ref1.registrarActivateUserLogin();
//		System.out.println("User assigned privileges successfully : Activate user login");
//		ObjectRepo.test.log(Status.PASS, "User assigned privileges successfully : Activate user login");
	}

	/*
	 *TC_Id         : C29355 RPM-307
	 *Tc_Title      : Verification_Of_Approval_Functionality_When_Assigned_Role_Is_Other_Than_Jurisdiction_User_Or_Service_Provider
	 *Functionality : Privilege Management
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 8,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void Verification_Of_Approval_Functionality_When_Assigned_Role_Is_Other_Than_Jurisdiction_User_Or_Service_Provider() throws Exception {
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
		ref1.registrarApproveAndAssignIndividualUsersRole();
		System.out.println("Registrar assign Individual User role type to user successfully.");
		ObjectRepo.test.log(Status.PASS, "Registrar assign Individual User role type to user successfully.");
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.registrarViewRequestStatusAfterApprovedUser();
		System.out.println("Registrar view request status of user successfully.");
		ObjectRepo.test.log(Status.PASS, "Registrar view request status of user successfully.");
	}
	
	/*
	 *TC_Id         : C29356 RPM-308
	 *Tc_Title      : Verification_Of_Jurisdiction_User_Can_Remove_Multiple_role_Assigned_To_user_Other_Than_Jurisdiction_User_Or_Service_Provider_User_Role
	 *Functionality : Privilege Management
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 9,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void Verification_Of_Jurisdiction_User_Can_Remove_Multiple_role_Assigned_To_user_Other_Than_Jurisdiction_User_Or_Service_Provider_User_Role() throws Exception {
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
	 *TC_Id         : C36174 RPM-308
	 *Tc_Title      : Verification_Of_Jurisdiction_User_Can_Remove_Multiple_role_Assigned_To_user_From_Jurisdiction_User_Or_Service_Provider_User_Role
	 *Functionality : Privilege Management
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 10,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void Verification_Of_Jurisdiction_User_Can_Remove_Multiple_role_Assigned_To_user_From_Jurisdiction_User_Or_Service_Provider_User_Role() throws Exception {
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
		ref1.registrarApproveAndAssignMultipleRoleServiceProviderRole();
		System.out.println("Registrar assign multiple role to user from Service provider role type successfully.");
		ObjectRepo.test.log(Status.PASS, "Registrar assign multiple role to user fromService provider role type successfully.");
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
		ref1.removeRoleFromMultipleRoleFromServiceProviderRoleTypeAssignedByRegistrar();
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
	 *TC_Id         : C27601 RPM-252
	 *Tc_Title      : Verify_create_new_role_type_functionality_with_valid_data_by_WCI_Inc_Admin
	 *Functionality : Privilege Management
	 *Author        : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 11,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verify_create_new_role_type_functionality_with_valid_data_by_WCI_Inc_Admin() throws InterruptedException {
		Homepage ref = new Homepage();
		PendingUser ref1=new PendingUser();
		System.out.println("User story No. RPM-252: Verify create new role type functionality with valid data. ");
		ObjectRepo.test.log(Status.PASS, "User story No. RPM-252: Verify create new role type functionality with valid data." );
		PrivilegeManagement role=new PrivilegeManagement();
		ref.selectJurisdictionForQubec();
		ref.loginAsWCIIncAdminUser();
		ref1.handlesecurityQuestion1();
		MYClass MYC = new MYClass();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt1();
		role.createRoleTypePM();
	}
	
	/*
     *TC_Id          : C26450 RPM-238
     *Tc_Title       : Verify_that_reset_search_functionality
     *Functionality  : Privilege Management
     *Author         : pravin.jogi@eqanim.com
     */
	@Test(priority = 12,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verify_that_reset_search_functionality() throws InterruptedException {
		Homepage ref = new Homepage();
		PrivilegeManagement role=new PrivilegeManagement();
		PendingUser ref1=new PendingUser();
		ref.selectJurisdictionForQubec();
		ref.loginAsWCIIncAdminUser();
		ref1.handlesecurityQuestion1();
		MYClass MYC = new MYClass();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt1();
		role.resetButtonFuncForPM();
		System.out.println("Reset button functionality for Privilege Management home page is working");
		ObjectRepo.test.log(Status.PASS, "Reset button functionality is working for Privilege Management home page " );
	}
}
