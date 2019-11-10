package org.amit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestAmazon {

	public static void main(String[] args) {


		System.setProperty("webdriver.gecko.driver", "D:\\Java JSP Servelet\\Selenium\\Drivers and exe\\geckodriver.exe");


		WebDriver driver = new FirefoxDriver();


		driver.get("https://www.amazon.in/");
		WebElement searchbox_amazon;
		searchbox_amazon = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox_amazon.sendKeys("RAM");
 Select 


		WebElement search_button;
		search_button= driver.findElement(By.id("twotabsearchtextbox"));
		search_button.click();

		JavascriptExecutor jse;
		jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 1000)");

		WebElement button;
		button = driver.findElement(By.id("a-autoid-0-announce"));
		button.click();
	}
}