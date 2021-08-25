package com.levelup;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		WebElement gender = driver.findElement(By.xpath("//label[text()='Female']"));
		WebElement LN = driver.findElement(By.id("firstName"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('firstName').value='janani';");
		js.executeScript("arguments[0].click();", gender);
		
		
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		String domain = driver.getPageSource();
		
		System.out.println(title);
		System.out.println(url);
		System.out.println(domain);
		
		
		String jstitle = js.executeScript("return document.title;").toString();
		String jsurl = js.executeScript("return document.URL;").toString();
		System.out.println(jstitle);
		System.out.println(jsurl);
		js.executeScript("window.scrollBy(0,400)");
		js.executeScript("alert('Hi Heloo')");
		//js.executeScript("window.location='https://google.com/'");
		

	}

}
