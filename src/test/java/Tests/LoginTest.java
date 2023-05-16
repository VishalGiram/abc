package Tests;

import java.io.IOException;

import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;

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

public class LoginTest extends base {

	@Test(priority = 1,retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void quebecJurisdiction() throws InterruptedException {
		Homepage ref = new Homepage(); 
		ref.selectJurisdictionForQubec();
		ref.loginAsUser();
		System.out.println("User should be log in successfully for Qubec Jurisdiction");
		ObjectRepo.test.log(Status.PASS, "Quebec user log in to the application");
		ref.logout();
		System.out.println("User should be log out successfully.");
		ObjectRepo.test.log(Status.PASS, "Quebec user  log out from the application");
	}

//	@Test(priority = 2,retryAnalyzer = Analyzer.RetryAnalyzer.class)
//	public void californiaJurisdiction() throws InterruptedException {
//		Homepage ref = new Homepage();
//		ref.selectjurisdictionForCalifornia();
//		ref.loginAsUser();
//		System.out.println("User should be log in successfully for California Jurisdiction");
//		ObjectRepo.test.log(Status.PASS, "California user log in to the application");
//		ref.logout();
//		System.out.println("User should be log out successfully.");
//		ObjectRepo.test.log(Status.PASS, "California user  log out from the application");
//	}

//	@Test(priority = 3,retryAnalyzer = Analyzer.RetryAnalyzer.class)
//	public void novaScotiaJurisdiction() throws InterruptedException {
//		Homepage ref = new Homepage();
//		ref.selectjurisdictionForNovaScotia();
//		ref.loginAsUser();
//		System.out.println("User should be log in successfully for Nova Scotia Jurisdiction");
//		ObjectRepo.test.log(Status.PASS, "Nova scotia user log in to the application");
//		ref.logout();
//		System.out.println("User should be log out successfully.");
//		ObjectRepo.test.log(Status.PASS, "Nova scotia user  log out from the application");
//	}

//	@Test(priority = 4,retryAnalyzer = Analyzer.RetryAnalyzer.class)
//	public void washingtonJurisdiction() throws InterruptedException {
//		Homepage ref = new Homepage();
//		ref.selectjurisdictionForWashington();
//		ref.loginAsUser();
//		System.out.println("User should be log in successfully for Washington Jurisdiction");
//		ObjectRepo.test.log(Status.PASS, "Washington user log in to the application");
//		ref.logout();
//		System.out.println("User should be log out successfully.");
//		ObjectRepo.test.log(Status.PASS, "Washington user  log out from the application");
//	}
	
	
	
	
//	/*
//     *TC_Id       : C27725
//     *Tc_Title    : Verify_the_Contact_Us_Inquiry_functionality_for_not_logged_in_user_with_Empty_data 
//     *Author      : pravin.jogi@eqanim.com
//     */
//	@Test(priority = 8,retryAnalyzer = Analyzer.RetryAnalyzer.class)
//	public void verify_the_Contact_Us_Inquiry_functionality_for_not_logged_in_user_with_Empty_data() throws InterruptedException {
//		Homepage ref = new Homepage();
//		ref.selectjurisdictionForCalifornia();
//		ref.contactUsForNotLoggedInUserWithEmptyData();
//	}
	
	
}
