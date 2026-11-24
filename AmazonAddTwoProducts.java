package testngprograms;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonAddTwoProducts {

		
		@Test
		public void SearchTwoProducts() throws InterruptedException{
			
		EdgeDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
			
		driver.get("https://www.amazon.in/ap/signin?openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		Thread.sleep(2000);
		WebElement a1 =driver.findElement(By.id("ap_email_login"));
		a1.sendKeys("8855913018");
		Thread.sleep(3000);
			
		WebElement a2 =driver.findElement(By.id("continue"));
		a2.click();
		Thread.sleep(3000);
			
		WebElement a3 =driver.findElement(By.id("ap_password"));
		a3.sendKeys("Arati@1234");
		Thread.sleep(3000);
			
		WebElement a4 =driver.findElement(By.id("signInSubmit"));
		a4.click();		
		
		Thread.sleep(3000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Toys");
		Thread.sleep(3000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(3000);
		List<WebElement> list =driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));  
		list.get(0).click();
		list.get(1).click();
		
		Set<String> id =driver.getWindowHandles();
		Iterator<String> pcid= id.iterator();
		String parentid = pcid.next();
		String childid = pcid.next();
		driver.switchTo().window(childid);
		Thread.sleep(3000);
		
		WebElement f1 =driver.findElement(By.xpath("//span[@class='a-button a-button-span11 a-button-base a-button-small']"));
		f1.click();
		WebElement f2 =driver.findElement(By.xpath("//span[@class='a-icon a-icon-small-trash']"));
		f2.click();
			Thread.sleep(3000);	
	        driver.quit();
	
}
}
