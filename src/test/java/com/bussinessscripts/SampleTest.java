package com.bussinessscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTest {
	@Test
public static void testOne() throws InterruptedException {
	 //System.setProperty("", "");
	WebDriverManager.chromedriver().setup();//you wont get any version compatability issuse 
	WebDriver driver=new ChromeDriver();
	System.out.println("browser launched suceesfully");
	Thread.sleep(3000);
	driver.manage().window().maximize();
	driver.get("https://www.rameshsoft.com");
	System.out.println("navigated to :"+driver.getCurrentUrl());
	driver.close();
}
}
