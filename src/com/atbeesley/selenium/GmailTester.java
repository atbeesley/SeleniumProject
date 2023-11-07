package com.atbeesley.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailTester {

	public static void main(String[] args) {
		System.out.println("Commencing test.");
		try {
		System.setProperty("webdriver.chrome.driver", "/Users/alexanderbeesley/Downloads/chromedriver-mac-x64/chromedriver"
				+ "");
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys("test@gmail.com");
		driver.findElement(By.className("VfPpkd-RLmnJb")).click();
		String at = driver.getTitle();
		String et = "gmail";
		driver.close();
		
		if(at.equalsIgnoreCase(et)) {
			System.out.println("Gmail test success");
		} else {
			System.out.println("Gmail test failure.");
		}
		
		} catch(Exception e) {
			System.out.println("Test running failure:" + e);
		}
	}

}
