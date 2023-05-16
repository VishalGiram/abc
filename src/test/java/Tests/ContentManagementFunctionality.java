package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pageObjects.Homepage;
import pageObjects.MYClass;
import pageObjects.MyPOMClass;
import pageObjects.POMpublicHomePage;
import resources.ObjectRepo;
import resources.base;

public class ContentManagementFunctionality extends base {
	
	/*
	 *TC_Id         : C32095 RPM-767
	 *Tc_Title      : Verification of UnKnown user landing page is displayed in English by default before selecting jurisdiction language 
	 *Functionality : Content Management System
	 *Author        :seema.sandbhor@eqanim.com
	 */
	@Test(priority =0, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void unKnown_user_landing_page_is_displayed_in_English_by_default() throws InterruptedException {
		MyPOMClass contact = new MyPOMClass();
		contact.unKnown_user_landing_page_is_displayed_in_English_by_default();

	}

	/*
	 *TC_Id         : C32097  RPM-768
	 *Tc_Title      : Verification of display pages in selected language to user in selected jurisdiction
	 *Functionality : Content Management System 
	 *Author        : seema.sandbhor@eqanim.com
	 */
	@Test(priority =1, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void display_pages_in_selected_language() throws InterruptedException {
		Homepage ref = new Homepage();
		ref.selectJurisdictionForQubec();
	}

	/*
	 *TC_Id         : C32098 RPM-768
	 *Tc_Title      : Verify that the user is able to switch between languages at any time in application
	 *Functionality : Content Management System 
	 *Author        : seema.sandbhor@eqanim.com
	 */

	@Test(priority =2, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void userisAbleToSwitchBetweenLanguages() throws InterruptedException {
		Homepage ref = new Homepage();
		MyPOMClass contact = new MyPOMClass();
		ref.selectJurisdictionForQubec();
		contact.userisAbleToSwitchBetweenLanguages();
	}
	
	/*
	 *TC_Id         : C32092 RPM-765
	 *Tc_Title      : Verification_of_preview_functionality_for_edited_page
	 *Functionality : Content Management System 
	 *Author        : seema.sandbhor@eqanim.com
	 */
	@Test(priority = 3, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_preview_functionality_for_edited_page() throws InterruptedException {
		Homepage ref = new Homepage();
		ref.selectjurisdictionForCalifornia();
		MYClass MYC = new MYClass();
		POMpublicHomePage ref2 = new POMpublicHomePage();
		ref2.jurisdictionUserLogin();
		ref2.handlesecurityQuestion();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		MyPOMClass ref3 = new MyPOMClass();
		ref3.Verification_of_preview_functionality_for_edited_page();
	}

	/*
	 *TC_Id         : C32093 RPM-765
	 *Tc_Title      : Verification_of_edit_functionality_after_preview_the_page
	 *Functionality : Content Management System 
	 *Author        : seema.sandbhor@eqanim.com
	 */
	@Test(priority = 4, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_edit_functionality_after_preview_the_page() throws InterruptedException {
		Homepage ref = new Homepage();
		ref.selectjurisdictionForCalifornia();
		POMpublicHomePage ref2 = new POMpublicHomePage();
		//MYClass MYC = new MYClass();
		ref2.jurisdictionUserLogin();
		ref2.handlesecurityQuestion();
		MYClass MYC = new MYClass();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		MyPOMClass ref3 = new MyPOMClass();
		ref3.Verification_of_preview_functionality_for_edited_page();
		Thread.sleep(4000);
		WebElement element3 = driver.findElement(By.xpath("(//*[@data-testid='ClearIcon'])[3]"));
		Actions action=new Actions(driver);
		action.moveToElement(element3).build().perform();
		action.click(element3).build().perform();
//		JavascriptExecutor js3 = (JavascriptExecutor) driver;
//		js3.executeScript("arguments[0].click()", element3);
		//driver.findElement(By.xpath("(//*[@data-testid='ClearIcon'])[3]")).click();
		String header = driver.findElement(By.xpath("//*[text()='Content Management']")).getText();
		Assert.assertEquals(header, "Content Management");
		System.out.println("Verification_of_edit_functionality_after_preview_the_page");
		ObjectRepo.test.log(Status.PASS, "Verification_of_edit_functionality_after_preview_the_page");
	}

	/*
	 *TC_Id         : C32094 RPM-765
	 *Tc_Title      : Verification_of_functionalities_of_buttons_links_on_preview_page
	 *Functionality : Content Management System 
	 *Author        : seema.sandbhor@eqanim.com
	 */
	@Test(priority = 5, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void Verification_of_functionalities_of_buttons_links_on_preview_page() throws InterruptedException {
		Homepage ref = new Homepage();
		ref.selectjurisdictionForCalifornia();
		POMpublicHomePage ref2 = new POMpublicHomePage();
		ref2.jurisdictionUserLogin();
		ref2.handlesecurityQuestion();
		MYClass MYC = new MYClass();
		MYC.Termsandconditions();
		MYC.resetPassphrasePrompt();
		MyPOMClass ref3 = new MyPOMClass();
		ref3.Verification_of_preview_functionality_for_edited_page();
		Boolean result = driver.findElement(By.xpath("(//*[@type='text'])[3]")).isEnabled();
		System.out.println(result);
		if (result == true) {
			driver.findElement(By.xpath("(//*[@type='text'])[3]")).sendKeys("UserName");
			System.out.println("User Name text box is enabled ");
		}
		ObjectRepo.test.log(Status.PASS, "Verification_of_functionalities_of_buttons_links_on_preview_page");
	}
	
	/*
     *TC_Id          : C32111 RPM-771
     *Tc_Title       : verification of the display content in a selected language for the known public user
     *Functionality  : Content Management System
     *Author         : swati.jagdale@eqanim.com
     */
	@Test(priority = 6, retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void verification_of_the_display_content_in_a_selected_language_for_the_known_public_user()
			throws InterruptedException {
		Homepage ref = new Homepage();
		ref.selectjurisdictionForCalifornia();
		MYClass MYC = new MYClass();
		MYC.LanguageValidation();
	}
	
	/*
     *TC_Id          : C32109 RPM-771
     *Tc_Title       : verification of the display content in a selected language for the unknown public user
     *Functionality  : Content Management System
     *Author         : swati.jagdale@eqanim.com
     */
//	@Test(priority = 1, retryAnalyzer = Analyzer.RetryAnalyzer.class)
//	public void verification_of_the_display_content_in_a_selected_language_for_the_unknown_user()
//			throws InterruptedException {
//		MYClass MYC = new MYClass();
//		MYC.UnknownUser();
//		MYC.LanguageValidation();
//	}
	
	/*
     *TC_Id          : C32110 RPM-771
     *Tc_Title       : Verify_that_when_a_logged_in_user_switches_between_languages_available_in_their_jurisdiction
     *Functionality  : Content Management System
     *Author         : swati.jagdale@eqanim.com
     */
//	@Test(priority = 2, retryAnalyzer = Analyzer.RetryAnalyzer.class)
//	public void Verify_that_when_a_logged_in_user_switches_between_languages_available_in_their_jurisdiction()
//			throws InterruptedException {
//		Homepage ref = new Homepage();
//		MYClass MYC = new MYClass();
//		ref.selectjurisdictionForCalifornia();
//		ref.loginAsApprovedUser();
//		MYC.handlesecurityQuestion();
//		MYC.Termsandconditions();
//		System.out.println("User should be log in successfully for california Jurisdiction");
//		// MYClass MYC = new MYClass();
//		MYC.ChangeLanguage();
//	}

}
