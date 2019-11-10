package amit.SeleniumProject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestXPath2 {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "D:\\Java Videos and Notes\\6 Selenium - bhanu and edureka - notes\\Drivers and exe\\geckodriver.exe");	
		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("file:///C:/Users/asus/Desktop/TryHtml.html");
		
//		WebElement w = driver.findElement(By.xpath("//select[1]"));
		
		List<WebElement> li = driver.findElements(By.xpath("//select[1]/*"));
		List<WebElement> li1 = driver.findElements(By.xpath("//select[1]/option"));
		
		System.out.println(li.size());

	}

}
