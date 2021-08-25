package com.levelup;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonandCheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();

		String expect = "female";
		String expehobbies = "sports,reading,music";
		String[] att = expehobbies.split(",");
		System.out.println(att.length);
		List<WebElement> list = driver.findElements(By
				.xpath("//div[@id='genterWrapper']//div[@class='custom-control custom-radio custom-control-inline']"));
		System.out.println(list.size());
		for (WebElement ele : list) {
			WebElement currentgende = ele.findElement(By.tagName("label"));
			if (currentgende.getText().equalsIgnoreCase(expect)) {
				currentgende.click();
				WebElement input = ele.findElement(By.tagName("input"));
				if (input.isSelected()) {
					System.out.println("Pass");
				} else {
					System.out.println("Fail");}				break;}}

		List<WebElement> lists = driver.findElements(By.xpath(
				"//div[@id='hobbiesWrapper']//div[@class='custom-control custom-checkbox custom-control-inline']"));

		System.out.println(list.size());
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		
		for(WebElement ele:lists) {
			WebElement current = ele.findElement(By.tagName("label"));
			
			for(String str:att) {
				
				if(current.getText().equalsIgnoreCase(str)) {
					current.click();
					WebElement input = ele.findElement(By.tagName("input"));
					if (input.isSelected()) {
						System.out.println("Pass");
					} else {
						System.out.println("Fail");
					}
				}
			}
			
			
		}
		


		driver.close();
	}

}
