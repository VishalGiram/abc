package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(resources.listeners.class)
public class base {

	public static WebDriver driver;
	public static Properties prop;
	public static ConfigDataProvider config;
//	public static ExcelDataProvider excel;

	@BeforeSuite
	public void start() throws Exception {
		config = new ConfigDataProvider();
//		excel = new ExcelDataProvider();
	}

	@AfterMethod
	public void teardown() {
//		System.out.println("Closing Browser window");
//		File path = new File("C://Users//VishalGiram//Downloads");
//		File[] files = path.listFiles();
//		for (File file : files) {
//			System.out.println("Deleted filename :" + file.getName());
//			file.delete();
//		}
//		driver.quit();
	}


	@BeforeMethod
	public void setup() throws IOException {
		File src = new File(System.getProperty("user.dir") + "/config.properties");
		FileInputStream fis = new FileInputStream(src);
		prop = new Properties();
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(config.getBaseUrl());
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		} else if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get(config.getBaseUrl());
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		} else if (browserName.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.get(config.getBaseUrl());
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		}
	}

	public String getScreenShotPath(String testCaseName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir") + "\\Screenshots\\" + testCaseName + ".png";
		FileUtils.copyFile(source, new File(destinationFile));
		return destinationFile;

	}

}
