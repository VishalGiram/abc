package Tests;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pageObjects.ConfigurationSettings;
import pageObjects.Homepage;
import pageObjects.MYClass;
import pageObjects.PendingUser;
import resources.ObjectRepo;
import resources.base;

public class ConfigurationSettingsFunctionality extends base {
	
	/*
	 *TC_Id      : C32745
	 *Tc_Title   : Verification_Of_Enable_Remember_Me_Functionality_From_Configuration_Settings
	 *Author     : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 1,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void Verification_Of_Enable_Remember_Me_Functionality_From_Configuration_Settings() throws Exception {
		Homepage ref = new Homepage();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ConfigurationSettings ref3=new ConfigurationSettings();
		ref.selectjurisdictionForCalifornia();
		ref1.loginAsJSAUserOfCaliForniaJurisdiction();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref3.configurationSettings();
		ref3.enableRememberMeFromConfigurationSettings();
	}
	
	/*
	 *TC_Id        : C32743 RPM-703
	 *Tc_Title     : Verify_That_The_Jurisdiction_User_Can_Configure_Contact_Us_email_for_Their_Jurisdiction
	 *Functionality: Configuration Settings
	 *Author       : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 2,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verify_That_The_Jurisdiction_User_Can_Configure_Contact_Us_email_for_Their_Jurisdiction() throws Exception {
		Homepage ref = new Homepage();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ConfigurationSettings ref3=new ConfigurationSettings();
		ref.selectjurisdictionForCalifornia();
		ref1.loginAsJSAUserOfCaliForniaJurisdiction();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		ref3.configurationSettings();	
		ref3.contactUsNotification();
	}
	
	/*
	 *TC_Id        : C35625 RPM-702
	 *Tc_Title     : Verify_The_Jurisdiction_user_can_Access_configurable_Email_setting
	 *Functionality: Configuration Settings
	 *Author       : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 3,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verify_The_Jurisdiction_user_can_Access_configurable_Email_setting() throws Exception {
		Homepage ref = new Homepage();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ConfigurationSettings ref3=new ConfigurationSettings();
		ref.selectjurisdictionForCalifornia();
		ref1.loginAsJSAUserOfCaliForniaJurisdiction();  
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		System.out.println("JSA user logged in successfully");
		ObjectRepo.test.log(Status.PASS, "JSA user logged in successfully");
		ref3.configurationSettings();	
		ref3.jsaViewNotificationSettins();
		System.out.println("JSA user view notification settings");
		ObjectRepo.test.log(Status.PASS, "JSA user view notification settings");
	}
	
	/*
	 *TC_Id        : C32268 RPM-701
	 *Tc_Title     : Verification_Of_JU_Can_Configure_The_Session_time_Out_In_Minutes
	 *Functionality: Configuration Settings
	 *Author       : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 4,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void verification_Of_JU_Can_Configure_The_Session_time_Out_In_Minutes() throws Exception {
		Homepage ref = new Homepage();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ConfigurationSettings ref3=new ConfigurationSettings();
		ref.selectjurisdictionForCalifornia();
		ref1.loginAsJSAUserOfCaliForniaJurisdiction();  
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		System.out.println("JSA user logged in successfully");
		ObjectRepo.test.log(Status.PASS, "JSA user logged in successfully");
		ref3.configurationSettings();	
		ref3.configureSessionTimeOutInMinute();
		System.out.println("JSA user configure session time out in minutes");
		ObjectRepo.test.log(Status.PASS, "JSA user configure session time out in minutes");
	}
	
	/*
	 *TC_Id        : C32752 RPM-690
	 *Tc_Title     : Verification_Of_Number_Of_Days_Passphrase_Is_Remembered_For_Field_With_Valid_Data
	 *Functionality: Configuration Settings
	 *Author       : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 5,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void Verification_Of_Number_Of_Days_Passphrase_Is_Remembered_For_Field_With_Valid_Data() throws Exception {
		Homepage ref = new Homepage();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ConfigurationSettings ref3=new ConfigurationSettings();
		ref.selectjurisdictionForCalifornia();
		ref1.loginAsJSAUserOfCaliForniaJurisdiction();  
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		System.out.println("JSA user logged in successfully");
		ObjectRepo.test.log(Status.PASS, "JSA user logged in successfully");
		ref3.configurationSettings();	
		ref3.numberOfDaysPassphraseRememberedFunctionalityWithValidData();
		System.out.println("JSA user configure number of days passphrase is remembered");
		ObjectRepo.test.log(Status.PASS, "JSA user configure number of days passphrase is remembered");
	}
	
	/*
	 *TC_Id        : C32753 RPM-690
	 *Tc_Title     : Verification_Of_Number_Of_Days_Passphrase_Is_Remembered_For_Field_With_Invalid_Data
	 *Functionality: Configuration Settings
	 *Author       : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 6,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void Verification_Of_Number_Of_Days_Passphrase_Is_Remembered_For_Field_With_Invalid_Data() throws Exception {
		Homepage ref = new Homepage();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ConfigurationSettings ref3=new ConfigurationSettings();
		ref.selectjurisdictionForCalifornia();
		ref1.loginAsJSAUserOfCaliForniaJurisdiction();  
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		System.out.println("JSA user logged in successfully");
		ObjectRepo.test.log(Status.PASS, "JSA user logged in successfully");
		ref3.configurationSettings();	
		ref3.numberOfDaysPassphraseRememberedFunctionalityWithInalidData();
		System.out.println("JSA user is not configure number of days passphrase is remembered with invalid data");
		ObjectRepo.test.log(Status.PASS, "JSA user is not configure number of days passphrase is remembered with invalid data");
	}
}


