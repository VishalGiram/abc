package Tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pageObjects.ApplicantUser;
import pageObjects.ConfigurationSettings;
import pageObjects.Homepage;
import pageObjects.MYClass;
import pageObjects.MyPOMClass;
import pageObjects.PendingUser;
import pageObjects.PrivilegeManagement;
import pageObjects.UserRegistration;
import resources.ObjectRepo;
import resources.base;
import resources.brokenLink;

public class BrokenLinks extends base {
	
	@Test(priority = 1,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void brokenLinkOnHomepage() throws InterruptedException, IOException {
		Homepage ref = new Homepage();
		brokenLink link=new brokenLink();
		ref.selectJurisdictionForQubec();
		link.brokenLinksOnAWebPage();
		
	}
		
	@Test(priority = 2,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void brokenLinkOnConfigurationSettingPage() throws InterruptedException, IOException {
		Homepage ref = new Homepage();
		brokenLink link=new brokenLink();
		MYClass MYC = new MYClass();
		PendingUser ref1=new PendingUser();
		ConfigurationSettings set=new ConfigurationSettings();
		ref.selectJurisdictionForQubec();
		ref.loginAsJurisdictionUser();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		set.configurationSettings();
		link.brokenLinksOnAWebPage();	
	}
	
//	@Test(priority = 3,retryAnalyzer = Analyzer.RetryAnalyzer.class)
//	public void brokenLinkOnPrivilegeManagementPage() throws InterruptedException, IOException {
//		Homepage ref = new Homepage();
//		brokenLink link=new brokenLink();
//		PrivilegeManagement pm=new PrivilegeManagement();
//		ref.selectJurisdictionForQubec();
//		ref.loginAsWCIIncAdminUser();
//		pm.privilegeManagePage();
//		link.brokenLinksOnAWebPage();	
//	}
	
	@Test(priority = 4,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void brokenLinkOnUserRegistrationPage() throws InterruptedException, IOException {
		Homepage ref = new Homepage();
		brokenLink link=new brokenLink();
		UserRegistration ur= new UserRegistration();
		ref.selectJurisdictionForQubec();
		ur.userRegistrationPage();
		link.brokenLinksOnAWebPage();	
	}
	
	@Test(priority = 5,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void brokenLinkOnSelJuriStepPage() throws InterruptedException, IOException {
		Homepage ref = new Homepage();
		brokenLink link=new brokenLink();
		UserRegistration ur=new UserRegistration();
		ref.selectJurisdictionForQubec();
		ur.selJuriStepPage();
		link.brokenLinksOnAWebPage();	
	}
	
	@Test(priority = 6,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void brokenLinkOnPerInfoStepPage() throws InterruptedException, IOException {
		Homepage ref = new Homepage();
		brokenLink link=new brokenLink();
		UserRegistration ur=new UserRegistration();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		link.brokenLinksOnAWebPage();	
	}
	
	@Test(priority = 7,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void brokenLinkOnResiAndMailStepPage() throws InterruptedException, IOException {
		Homepage ref = new Homepage();
		brokenLink link=new brokenLink();
		UserRegistration ur=new UserRegistration();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ur.personalInformation();
		link.brokenLinksOnAWebPage();	
	}
	
	@Test(priority = 8,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void brokenLinkOnEditAndReviewStepPage() throws InterruptedException, IOException {
		Homepage ref = new Homepage();
		brokenLink link=new brokenLink();
		UserRegistration ur=new UserRegistration();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ur.personalInformation();
		ur.residenceAndMailing();
		link.brokenLinksOnAWebPage();	
	}
	
	@Test(priority = 9,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void brokenLinkOnCreUserLoginStepPage() throws Exception {
		Homepage ref = new Homepage();
		brokenLink link=new brokenLink();
		UserRegistration ur=new UserRegistration();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ur.personalInformation();
		ur.residenceAndMailing();
		ur.editAndReview();
		link.brokenLinksOnAWebPage();	
	}
	
//	@Test(priority = 10,retryAnalyzer = Analyzer.RetryAnalyzer.class)
//	public void brokenLinkOnSubReqDocumentPage() throws InterruptedException, IOException {
//		Homepage ref = new Homepage();
//		brokenLink link=new brokenLink();
//		UserRegistration ur=new UserRegistration();
//		ref.selectjurisdictionForCalifornia();
//		ur.submitRequiDocuPage();
//		link.brokenLinksOnAWebPage();	
//	}
	
	@Test(priority = 11,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void brokenLinkOnApplicantUserHomePage() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		brokenLink link=new brokenLink();
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
		link.brokenLinksOnAWebPage();	
	}
	
	@Test(priority = 12,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void brokenLinkOnUserProfilePageOfApplicantUser() throws Exception {
		Homepage ref = new Homepage();
		ApplicantUser app=new ApplicantUser();
		brokenLink link=new brokenLink();
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
		app.userProfileOFApplicantUser();
		//link.brokenLinksOnAWebPage();	
	}
	
	@Test(priority = 13,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void brokenLinkOnResetPassphraseAndSecurityQuestionPageOfApplicantUser() throws Exception {
		Homepage ref = new Homepage();
		ApplicantUser app=new ApplicantUser();
		brokenLink link=new brokenLink();
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
		app.resetPassphraseAndSecurityQuestionOFApplicantUser();
		link.brokenLinksOnAWebPage();	
	}
	
	@Test(priority = 14,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void brokenLinkOnUserDetailsPageOfApplicantUser() throws Exception {
		Homepage ref = new Homepage();
		ApplicantUser app=new ApplicantUser();
		brokenLink link=new brokenLink();
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
		app.userProfileOFApplicantUser();
		app.userDetailsPageOfApplicantUser();
		link.brokenLinksOnAWebPage();	
	}
}
