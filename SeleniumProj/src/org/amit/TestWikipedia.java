package org.amit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestWikipedia {
	


	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Java JSP Servelet\\Selenium\\Drivers and exe\\geckodriver.exe");
		
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("http:\\www.wikipedia.org");
		
		
		WebElement link;
		link = driver.findElement(By.partialLinkText("English"));
		link.click();
		
		WebElement searchbox;
		searchbox = driver.findElement(By.id("searchInput"));
		
		searchbox.sendKeys("Software");
		Thread.sleep(5000);
		driver.quit();
		
		driver.get("https://www.amazon.in/");
		WebElement searchbox_amazon;
		searchbox_amazon = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox_amazon.sendKeys("RAM");
		
		
		
		WebElement search_button;
		search_button= driver.findElement(By.id("twotabsearchtextbox"));
		search_button.click();
		
		JavascriptExecutor jse;
		jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 1000)");
		
		
	}
	
}
