package resources;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;

public class brokenLink extends base {
	String url = "";
	String urlText="";
	int count;

	public void brokenLinksOnAWebPage() throws InterruptedException {
		Thread.sleep(5000);
		new WebDriverWait(driver, 40).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a")));
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.iterator());
		int totallinks = links.size();
		ObjectRepo.test.log(Status.PASS, "The links are present on webpage are as below:");
		for(WebElement link:links) {
			System.out.println(link.getText());
//			if(link.isEnabled()) {
//				System.out.println(link + "It is valid link");
//			}
//			else
//				System.out.println(link + "It is not valid link");
			ObjectRepo.test.log(Status.PASS, link.getText());
		}
		System.out.println("Total links prsent on webpage: " +totallinks);
		Iterator<WebElement> it = links.iterator();
		while (it.hasNext()) {
			url = it.next().getAttribute("href");
			if (url == null || url.isEmpty()) {
				count++;
				
				System.out.println(url);
				
			}
			
		}
		System.out.println("No of broken links present: " + count);
	}
}
