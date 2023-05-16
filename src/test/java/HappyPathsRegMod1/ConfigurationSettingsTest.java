package HappyPathsRegMod1;



import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pageObjects.ConfigurationSettings;
import pageObjects.Homepage;
import pageObjects.MYClass;
import pageObjects.MyPOMClass;
import pageObjects.PendingUser;
import pageObjects.UserRegistration;
import resources.ObjectRepo;
import resources.base;

public class ConfigurationSettingsTest extends base {

	/*
	 *TC_Id      : C0001
	 *Tc_Title   : configuration_Settings_Done_By_JSA_User
	 *Author     : pravin.jogi@eqanim.com           
	 */
	@Test(priority = 1,retryAnalyzer = Analyzer.RetryAnalyzer.class,groups= {"module1"})
	public void configuration_Settings_Done_By_JSA_User() throws Exception {
		Homepage ref = new Homepage();
		PendingUser ref1=new PendingUser();
		MYClass MYC = new MYClass();
		ConfigurationSettings ref3=new ConfigurationSettings();
		ref.selectjurisdictionForCalifornia();
		ref1.loginAsJSAUserOfCaliForniaJurisdiction();
		ref1.handlesecurityQuestion();
		MYC.Termsandconditions();
		ref3.configurationSettings();
		ref3.changesInLogInsettingsSection();
	}

}
