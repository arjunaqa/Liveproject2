package com.mycompany.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumProject {
	
	
	@Test
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Resources\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="https://www.makemytrip.com/";
		driver.get(url);
		driver.manage().window().maximize();
		
	}

}
