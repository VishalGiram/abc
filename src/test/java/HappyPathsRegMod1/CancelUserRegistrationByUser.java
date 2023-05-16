package HappyPathsRegMod1;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pageObjects.Homepage;
import pageObjects.PendingUser;
import pageObjects.UserRegistration;
import resources.ObjectRepo;
import resources.base;

public class CancelUserRegistrationByUser extends base {

//	/*
//	 *TC_Id      : C0001
//	 *Tc_Title   : UserRegistration
//	 *Author     : pravin.jogi@eqanim.com           
//	 */
//	@Test(priority = 1,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
//	public void userRegistration() throws Exception {
//		Homepage ref = new Homepage(driver, prop);
//		UserRegistration ur=new UserRegistration(driver, prop);
//		PendingUser ref1=new PendingUser(driver, prop);
//		ref.selectJurisdictionForQubec();
//		ur.selectJurisdictionStep();
//		ref1.personalInformation();
//		ref1.residenceAndMailing();
//		ref1.editAndReview();
//		ref1.createUserLogin();
//		System.out.println("User Created successfully.");
//		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
//	}
//
//	/*
//	 *TC_Id      : C0002
//	 *Tc_Title   : registered_User_Login
//	 *Author     : pravin.jogi@eqanim.com           
//	 */
//	@Test(priority = 2,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
//	public void registered_User_Login() throws Exception {
//		Homepage ref = new Homepage(driver, prop);
//		UserRegistration ur=new UserRegistration(driver, prop);
//		PendingUser ref1=new PendingUser(driver, prop);
//		ref.selectJurisdictionForQubec();
//		ur.selectJurisdictionStep();
//		ref1.personalInformation();
//		ref1.residenceAndMailing();
//		ref1.editAndReview();
//		ref1.createUserLogin();
//		System.out.println("User Created successfully.");
//		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
//		ref1.loginAsCreatedUser();
//		System.out.println("User logged in successfully.");
//		ObjectRepo.test.log(Status.PASS, "User logged in successfully.");
//	}

	/*
	 *TC_Id      : C0003
	 *Tc_Title   : cancel_UserRegistration_By_User
	 *Author     : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 3,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void cancel_UserRegistration_By_User() throws Exception {
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
		ref1.cancelUserRegistrationByUser();
		System.out.println("User cancel user registration successfully.");
		ObjectRepo.test.log(Status.PASS, "User cancel user registration successfully.");
	}
}
