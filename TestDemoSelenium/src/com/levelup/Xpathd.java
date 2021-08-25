package com.levelup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathd {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		

		//Absolute Path
		// in indicates us '/' - its starts from root
		// /html/body/div[2]/div/div/div[2]/div[2]/div[1]/form/div[1]/div[2]/input
		
		//Relative Path
		//it indicates using "//"
		//SImple realtive xpath = //tagname[@attr='attval']
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Malathi");
		
		//text -- //tagname[text()='val']
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		//contains -- //tagname[contains(@att,'val')] -- //tagname[contains(text(),'val')]
		
		WebElement fn = driver.findElement(By.xpath("//label[contains(text(),'Birth')]"));
		
		if(fn.isDisplayed()) {
			System.out.println("Is theri");
		}
		
		//following. following-sibiling, child, parent,preceding
		driver.findElement(By.xpath("//div[@id='userNumber-wrapper']//child::input")).sendKeys("1234567890");
		
		//class . , id #
		driver.findElement(By.cssSelector("input#lastName")).sendKeys("Test");
		
		
		driver.close();

	}

}
