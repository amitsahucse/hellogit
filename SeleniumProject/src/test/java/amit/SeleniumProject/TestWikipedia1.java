package amit.SeleniumProject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class TestWikipedia1 {

	public static void main(String[] args) throws InterruptedException {
		

	System.setProperty("webdriver.gecko.driver", "D:\\Java Videos and Notes\\6 Selenium - bhanu and edureka - notes\\Drivers and exe\\geckodriver.exe");
	
	WebDriver driver = new FirefoxDriver();
	
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	
	driver.get("http:\\www.wikipedia.org");
//	driver.get("file:///C:/Users/asus/Desktop/TryHtml.html");
	
	
//	WebElement link;
//	link = driver.findElement(By.partialLinkText("English"));
//	link.click();
//	
//	driver.navigate().back();
//	driver.navigate().refresh();
//	driver.navigate().forward();
//	driver.navigate().back();
//	
//	driver.findElement(By.id("searchInput")).sendKeys("Something");
	
//	JavascriptExecutor jse = (JavascriptExecutor) driver;
//	jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//	
//	WebElement x = driver.findElement(By.xpath("//a[contains(text(),'Wikimedia')]"));
//	Actions a = new Actions (driver);
//	a.moveToElement(x).build().perform();
//	
//	driver.findElement(By.name(""));
//	
	
	
	//This is the new one ---- start//
//	WebElement w = driver.findElement(By.tagName("select"));
//	w.click();
//	Select s = new Select (w);
//
//	List<WebElement> list = s.getOptions();
//	
//	System.out.println(list.size());
//	
//	for(int i=0; i<list.size();i++)
//	{
//		System.out.println(list.get(i).getText());
//	}
//	
//	s.selectByIndex(1);
//	
//	driver.findElement(By.linkText("english")).click();
	//This is the new one ---- end//	
	
	
//	
//	WebElement searchbox;
//	searchbox = driver.findElement(By.id("searchInput"));
//	
//	searchbox.sendKeys("Software");
//	Thread.sleep(5000);
//	
//	
//	driver.get("https://www.amazon.in/");
//	WebElement searchbox_amazon;
//	searchbox_amazon = driver.findElement(By.id("twotabsearchtextbox"));
//	searchbox_amazon.sendKeys("RAM");
//	
//	
//	
//	WebElement search_button;
//	search_button= driver.findElement(By.id("twotabsearchtextbox"));
//	search_button.click();
//	
//	JavascriptExecutor jse;
//	jse = (JavascriptExecutor)driver;
//	jse.executeScript("scroll(0, 1000)");
//	
//	driver.quit();
	}

}
