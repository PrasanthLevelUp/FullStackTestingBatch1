package com.levelup;

import java.util.List;

import org.omg.PortableServer.IdAssignmentPolicy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		//Locators
	/*	1.Id
		2.class
		3.name
		4.tag
		5.linkedtext
		6.partialinktext
		7.xpath
		8.cssSelector*/
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		
		driver.findElement(By.partialLinkText("How")).click();
		
		
		/*driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.name("btnK")).click();*/
		driver.close();

	}

}
