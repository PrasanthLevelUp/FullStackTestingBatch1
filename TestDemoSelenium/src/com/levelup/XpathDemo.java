package com.levelup;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.get("https://demoqa.com/automation-practice-form");
		driver.navigate().to("https://demoqa.com/automation-practice-form");
		/* /html/body/div[2]/div/div/div[2]/div[2]/div[1]/form/div[1]/div[2]/input */

		// Relative Xpath
		// tagname[@attri = attrival] - simple
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Janani");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("priyannka");

		// *[contains(@id,'val')]
		// *[contains(text(),'val')]
		driver.findElement(By.xpath("//*[contains(@placeholder,'name@example.com')]")).sendKeys("sdfijsfd@gmail.com");
		driver.findElement(By.xpath("//*[contains(text(),'Male')]")).click();

		// *[text()='vala']
		// *[@id='ijsf' or @class='isff']
		driver.findElement(By.xpath("//*[text()='Female'  and  @for='gender-radio-2']")).click();

		// driver.findElement(By.xpath("//*[text()='Select State']")).sendKeys("NCR");
		// driver.findElement(By.xpath("//*[text()='Select
		// State']")).sendKeys(Keys.TAB);

		// traverse - following, following-sibling, child, parent, ancestor
		// //tagname[@att='val']//child::tagname

		// cssSelector - id - #, class - .

		driver.findElement(By.cssSelector("input#firstName")).sendKeys("XXX");

		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();

	}

}
