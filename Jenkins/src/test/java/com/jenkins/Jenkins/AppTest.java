package com.jenkins.Jenkins;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class AppTest {
	@Test
	public void test1(){
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"/driver/chromedriver");
		 driver= new ChromeDriver();	
		driver.get("https://www.toolsqa.com/mobile-automation/appium/appium-tutorial/");
	}
	
	

	
}



