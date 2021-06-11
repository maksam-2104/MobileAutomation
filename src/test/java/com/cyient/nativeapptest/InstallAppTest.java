package com.cyient.nativeapptest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class InstallAppTest {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("platformvName", "Android");
		cap.setCapability("deviceName", "Maya");
		cap.setCapability("app", "C:\\Users\\ADITYA\\Desktop\\Automation\\java_workspace\\MobileAutomation\\src\\test\\resources\\Appium\\Khan Academy_v6.3.0_apkpure.com.apk");
		
		 AndroidDriver<WebElement>  driver=new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), cap);
	}

}
