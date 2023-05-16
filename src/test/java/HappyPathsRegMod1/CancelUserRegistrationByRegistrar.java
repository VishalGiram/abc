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

public class CancelUserRegistrationByRegistrar extends base {

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
//		MyPOMClass ref2=new MyPOMClass(driver,prop);
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
//	 *Tc_Title   : RegistrarUser_Login
//	 *Author     : pravin.jogi@eqanim.com           
//	 */
//	@Test(priority = 2,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
//	public void RegistrarUser_Login() throws Exception {
//		Homepage ref = new Homepage(driver, prop);
//		UserRegistration ur=new UserRegistration(driver, prop);
//		PendingUser ref1=new PendingUser(driver, prop);
//		MyPOMClass ref2=new MyPOMClass(driver,prop);
//		ref.selectJurisdictionForQubec();
//		ur.selectJurisdictionStep();
//		ref1.personalInformation();
//		ref1.residenceAndMailing();
//		ref1.editAndReview();
//		ref1.createUserLogin();
//		System.out.println("User Created successfully.");
//		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
//		ref1.loginAsJurisdictionUser();
//		ref1.handlesecurityQuestion();
//		System.out.println("Jurisdiction user logged in successfully.");
//		ObjectRepo.test.log(Status.PASS, "Jurisdiction user logged in successfully.");
//	}

	/*
	 *TC_Id      : C0003
	 *Tc_Title   : cancel_User_Registration_By_Registrar
	 *Author     : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 3,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void cancel_User_Registration_By_Registrar() throws Exception {
		Homepage ref = new Homepage();
		UserRegistration ur=new UserRegistration();
		PendingUser ref1=new PendingUser();
		MyPOMClass ref2=new MyPOMClass();
		ref.selectJurisdictionForQubec();
		ur.selectJurisdictionStep();
		ref1.personalInformation();
		ref1.residenceAndMailing();
		ref1.editAndReview();
		ref1.createUserLogin();
		System.out.println("User Created successfully.");
		ObjectRepo.test.log(Status.PASS, "User Created successfully.");
		ref1.loginAsJurisdictionUser();
		ref1.handlesecurityQuestion();
		System.out.println("Jurisdiction user logged in successfully.");
		ObjectRepo.test.log(Status.PASS, "Jurisdiction user logged in successfully.");
		ref1.registrarSearchUserAndGoToUserDetailsPage();
		ref1.cancelUserRegistrationByRegistrar();
		System.out.println("User registration cancel by Registrar successfully");
		ObjectRepo.test.log(Status.PASS, "User registration cancel by Registrar successfully");
	}


}
