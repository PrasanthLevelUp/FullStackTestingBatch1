package com.levelup;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioAndCheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		String hbbies= "Sports";
		String[] arrhob = hbbies.split(",");
		System.out.println(arrhob.length);
		
		List<WebElement> lits= driver.findElements(By.xpath("//div[@id='hobbiesWrapper']//div[@class='col-md-9 col-sm-12']//div"));
		System.out.println(lits.size());
		
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		exe.executeScript("window.scrollBy(0,400)");
		
		for(WebElement ele:lits) {
			String hobbie= ele.findElement(By.tagName("label")).getText();
			System.out.println(hobbie);
			
			for(String hob:arrhob) {
				if(hob.equalsIgnoreCase(hobbie)) {
					ele.click();
					if(ele.findElement(By.tagName("input")).isSelected()) {
						System.out.println("Pass");
					}
				}
			}
			
		}
	}

}
