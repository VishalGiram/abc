package pageObjects;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.Status;

import resources.ObjectRepo;
import resources.base;

public class PrivilegeManagement extends base {
     

	private By admin= By.xpath("//div[text()='Admin']");
	private By selAdminWci= By.xpath("//li[text()='WCI, Inc Admin']");
	private By selAdmin= By.xpath("//li[text()='Admin']");
	private By settings= By.xpath("//button[text()='SETTINGS']");
	private By priviMangement= By.xpath("//a[text()='Privilege Management']");
	private By creNewRoleType= By.xpath("//span[text()='Create New Role Type']");
	private By roleTypeName= By.xpath("//input[@id='roleTypeName']");
	private By description= By.xpath("//input[@id='roleTypeDescription']");
	private By createButton= By.xpath("//button[text()='CREATE']");
	private By sucMessageRoleType= By.xpath("//p[text()='roletype created successfully']");
	
	private By jurisdiction= By.xpath("(//div[@id='simple-select'])[1]");
	private By selQuebec= By.xpath("//li[text()='Quebec']");
	private By selCalifornia= By.xpath("//li[text()='California']");
	private By selectPageDropdown= By.xpath("//input[@id='country-select-demo']");
	private By selectPageOptionFromDropdown= By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd MuiAutocomplete-input MuiAutocomplete-inputFocused css-1uvydh2']");
	private By searchButton= By.xpath("//button[text()='SEARCH']");
	private By jurisUserRoleType= By.xpath("//h4[text()='Jurisdiction Users']");
	
	private By jurisCheckbox= By.xpath("//span[text()='Jurisdiction Users']");
	private By roleDropdown= By.xpath("//div[text()='Select Role(s)']");
	private By selectRegistrarRole= By.xpath("//span[text()='Registrar']");
	private By searchControlField= By.xpath("//input[@placeholder='Enter control name...']");
	private By releText= By.xpath("//label[text()='Search Page']");
	private By searchPageField= By.xpath("//input[@placeholder='Enter page name...']");
	private By resetButton= By.xpath("//button[@data-testid='priv_btn_Reset']");
	private By searchText= By.xpath("//h6[text()='Search']");
	
	public PrivilegeManagement () {
		PageFactory.initElements(driver, this);
	}
	
    public void displayAllRoleType() {
		
	}
	public void resetButtonFuncForPM() throws InterruptedException {
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(settings));
		driver.findElement(settings).click();
		System.out.println("step : Click on settings ");
		ObjectRepo.test.log(Status.PASS, "step : Click on settings" );
		driver.findElement(priviMangement).click();
		System.out.println("step : Click on Privilege management ");
		ObjectRepo.test.log(Status.PASS, "step : Click on Privilege management" );
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='country-select-demo']")).click();
		driver.findElement(By.xpath("//input[@id='country-select-demo']")).sendKeys("Page_ChangeJusrisdiction");
		driver.findElement(By.xpath("//*[text()='Page_ChangeJusrisdiction']")).click();
	    WebDriverWait wait=new WebDriverWait(driver,20);
	    wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[text()='RESET']")));
		WebElement element=driver.findElement(resetButton);
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		js2.executeScript("arguments[0].click()", element);
		System.out.println("step : Click on reset button ");
		ObjectRepo.test.log(Status.PASS, "step : Click on reset button" );
	}
	public String generateString() {
		int length = 14;
        boolean useLetters = true;
        boolean useNumbers = true;
        String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
        String  randomString = ("Test" + generatedString);
        return randomString;
	}
	
	public void privilegeManagePage() {
		//driver.findElement(settings).click();
		WebElement element = driver.findElement(settings);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		System.out.println("step5 : Click on Settings ");
		ObjectRepo.test.log(Status.PASS, "step5 : Click on Setting" );
        driver.findElement(priviMangement).click();
        System.out.println("step6 : Click on Privilege Management ");
		ObjectRepo.test.log(Status.PASS, "step6 : Click on Privilege Management " );
		
		
	}
	public void createRoleTypePM() {
		driver.findElement(settings).click();
		System.out.println("step3 : Click on Settings ");
		ObjectRepo.test.log(Status.PASS, "step3 : Click on Setting" );
        driver.findElement(priviMangement).click();
        System.out.println("step4 : Click on Privilege Management ");
		ObjectRepo.test.log(Status.PASS, "step4 : Click on Privilege Management " );
		WebElement element=driver.findElement(creNewRoleType);
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		js2.executeScript("arguments[0].click()", element);
		//driver.findElement(creNewRoleType).click();
		System.out.println("step5 : Click on Create New Role Type ");
		ObjectRepo.test.log(Status.PASS, "step5 : Click on Create New Role Type " );
        driver.findElement(roleTypeName).sendKeys(generateString());
		System.out.println("step6 : Enter Role Type Name ");
		ObjectRepo.test.log(Status.PASS, "step6 : Enter Role Type Name " );
		driver.findElement(description).sendKeys(prop.getProperty("Descrition"));
		System.out.println("step7 : Enter Role Type Description ");
		ObjectRepo.test.log(Status.PASS, "step7 : Enter Role Type Description " );
		driver.findElement(createButton).click();
		System.out.println("step8 : Click On Create Button");
		ObjectRepo.test.log(Status.PASS, "step8 : Click On Create Button " );
//		String message1=driver.findElement(sucMessageRoleType).getText();
//		System.out.println("success message :"+ message1);
//		Assert.assertEquals(message1, "roletype created successfully");
//		ObjectRepo.test.log(Status.PASS, message1 );
	}
	
	
	
	public void filcompRoleType() throws InterruptedException {
		driver.findElement(settings).click();
		System.out.println("step : Click on Settings ");
		ObjectRepo.test.log(Status.PASS, "step : Click on Settings" );
		driver.findElement(priviMangement).click();
		System.out.println("step : Click on Privilege Management ");
		ObjectRepo.test.log(Status.PASS, "step : Click on Privilege Management " );
		Thread.sleep(5000);
		driver.findElement(selectPageDropdown).click();
		System.out.println("step : Click page dropdown ");
		ObjectRepo.test.log(Status.PASS, "step : Click page dropdown" );
		Thread.sleep(2000);
		//driver.findElement(selectPageOptionFromDropdown).click();
		System.out.println("step : Select page name from dropdown");
		ObjectRepo.test.log(Status.PASS, "step : Select page name from dropdown" );
		WebElement element=driver.findElement(searchButton);
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		js2.executeScript("arguments[0].click()", element);
		//driver.findElement(searchButton).click();
		System.out.println("step : Click on Search button ");
		ObjectRepo.test.log(Status.PASS, "step : Click on Search button " );
		Thread.sleep(5000);
	}
	
	
}
