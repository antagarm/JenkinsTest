

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTest {
	FirefoxDriver driver;
	WebDriverWait wait;
	
	@BeforeTest
	public void beforeTest() {
	
		driver= new FirefoxDriver();
		wait = new WebDriverWait(driver, 10);
	
	}
	@Test
	public void test() throws InterruptedException {
		driver.get("https://f1news.ru");
		WebElement element=driver.findElement(By.cssSelector(".navbar_head li:nth-child(2)"));
		element.click();
		Thread.sleep(2000);
	
	}
	
	@AfterTest
	public void afterTest() {
		driver.close();
		
		
	}
	
	


}
