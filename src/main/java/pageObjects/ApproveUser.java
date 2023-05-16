package pageObjects;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.Status;

import resources.ObjectRepo;
import resources.base;

public class ApproveUser extends base{
	
	
	
	private By welcomeText = By.xpath("//h1[text()='Welcome!']");
	private By approveUserTextOnHomePage = By.xpath("//div[text()='[APPROVED USER - LOGGED-IN HOME PAGE]']");
	
	private By searchFieldOfSearchUsers = By.xpath("(//input[@placeholder='Search…'])[1]");
	private By searchUsersSectionText = By.xpath("//button[text()='Search Users']");
	private By clearButtonInSearchField = By.xpath("//*[@data-testid='CloseIcon']");
	private By searchResultText = By.xpath("//a[@class='link-cell']");
	
	private By filtersOnSearchUserGrid = By.xpath("(//button[text()='Filters'])[1]");
	private By filtersValue = By.xpath("//input[@placeholder='Filter value']");
	private By addFiltersButton = By.xpath("//button[text()='Add filter']");
	private By filtersValueAfterAddfilter = By.xpath("(//input[@placeholder='Filter value'])[2]");
	private By clearButtonInFilterOption1 = By.xpath("(//*[@data-testid='CloseIcon'])[3]");
	private By clearButtonInFilterOption2 = By.xpath("(//*[@data-testid='CloseIcon'])[4]");
	
	private By pendingRequest = By.xpath("//p[text()='Pending Requests']");
	
	public ApproveUser() {
		PageFactory.initElements(driver, this);
		
	}
	
	public void pendingRequestGridInUserManagementSection() throws InterruptedException {
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Search Users']")));
		driver.findElement(pendingRequest).click();
		System.out.println("Step: Click on Pending Requests option on USER MANAGEMENT section");
		ObjectRepo.test.log(Status.PASS, "Step: Click on Pending Requests option on USER MANAGEMENT section");
		
	}
	
	public void clearSearchButtonFunctionalityOfFilters() throws InterruptedException {
		System.out.println("Step: Click on filters option");
		ObjectRepo.test.log(Status.PASS, "Step: Click on filters option");
		driver.findElement(filtersOnSearchUserGrid).click();
		System.out.println("Step: Enter valid data in filter value field");
		ObjectRepo.test.log(Status.PASS, "Step: Enter valid data in filter value field");
		driver.findElement(filtersValue).sendKeys("pra");
		Thread.sleep(5000);
		//driver.findElement(filtersOnSearchUserGrid).click();
		System.out.println("Step: Click on add filter button");
		ObjectRepo.test.log(Status.PASS, "Step: Click on add filter button");
		driver.findElement(addFiltersButton).click();
		Thread.sleep(5000);
		System.out.println("Step: Enter valid data in filter value field");
		ObjectRepo.test.log(Status.PASS, "Step: Enter valid data in filter value field");
		driver.findElement(filtersValueAfterAddfilter).sendKeys("pravin");
		Thread.sleep(5000);
		driver.findElement(clearButtonInFilterOption2).click();
		Thread.sleep(5000);
		driver.findElement(clearButtonInFilterOption1).click();
		Thread.sleep(2000);
	}
	
	public void clearSearchButtonFunctionalityOfSearchField() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Step: Enter valid data in search field");
		ObjectRepo.test.log(Status.PASS, "Step: Enter valid data in search field");
		driver.findElement(searchFieldOfSearchUsers).sendKeys("automation");
		Thread.sleep(5000);
		String searchResultTextAfterSearch=driver.findElement(searchResultText).getText();
		System.out.println("Search result after searching :" + searchResultTextAfterSearch);
		ObjectRepo.test.log(Status.PASS, "Search result after searching :" + searchResultTextAfterSearch);
		System.out.println("Step: Click on cross button of search field");
		ObjectRepo.test.log(Status.PASS, "Step: Click on cross button of search field");
		driver.findElement(clearButtonInSearchField).click();
		Thread.sleep(5000);
	}
	
	public void approveUserTextOnHomepage() {
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Welcome!']")));
		String approveUserText=driver.findElement(approveUserTextOnHomePage).getText();
		System.out.println("The approved user text is :" + approveUserText);
		Assert.assertEquals(approveUserText, "[APPROVED USER - LOGGED-IN HOME PAGE]");
		ObjectRepo.test.log(Status.PASS, "The approved user text is :" + approveUserText );
	}

}
