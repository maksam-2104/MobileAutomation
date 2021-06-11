package com.cyient.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class WebAppTest {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("platformvName", "Android");
		cap.setCapability("deviceName", "redmi");
		cap.setCapability("browserName", "chrome");
	    cap.setCapability("chromedriverExecutable", "C:\\Users\\ADITYA\\Desktop\\Automation\\Component\\chromedriver.exe");
        //send DesiredCapabilities details to the appium server
        AndroidDriver<WebElement>  driver=new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), cap);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
     driver.get("https://magento.com/");
    driver.findElement(By.xpath(" //span[contains(text(),'Sign in')]")).click();
    driver.findElementByXPath("//input[@id='email']").sendKeys("johnmiller@gmail.com");
    driver.findElementByXPath("//input[@id='pass']").sendKeys("john@123");
    driver.findElementByXPath("//button[@id='send2']").click();
    
    System.out.println(driver.getTitle());
    System.out.println(driver.getCurrentUrl());
    driver.quit();
    
    
	}

}
