package com.levelup;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSDemo1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		WebElement gender = driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
		WebElement fn = driver.findElement(By.xpath("//input[@id='firstName']"));
		WebElement address = driver.findElement(By.xpath("//*[@id='currentAddress']"));
		
		JavascriptExecutor ex = (JavascriptExecutor) driver;
		ex.executeScript("arguments[0].click();", gender);
		ex.executeScript("arguments[0].value='Malathi'", fn);
		ex.executeScript("document.getElementById('lastName').value='Shaymala'");
		ex.executeScript("arguments[0].scrollIntoView(true);", address);
		//ex.executeScript("window.scrollBy(0,400)");
		
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String jstitle = ex.executeScript("return document.title").toString();
		System.out.println(jstitle);
		String jsurl = ex.executeScript("return document.URL").toString();
		System.out.println(jsurl);

	}

}
