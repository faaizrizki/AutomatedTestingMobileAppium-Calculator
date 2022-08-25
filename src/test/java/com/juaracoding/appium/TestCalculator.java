package com.juaracoding.appium;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.juaracoding.appium.calculator.pages.Calculator;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestCalculator {
	
	private static AndroidDriver<MobileElement> driver;
	private Calculator calculator;
	
	@BeforeClass
	public void setUp() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "RMX1911");
		capabilities.setCapability("udid", "af68959d");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability("platformVersion", "10");
		capabilities.setCapability("automationName", "UiAutomator2");
		capabilities.setCapability("appPackage","com.coloros.calculator");
		capabilities.setCapability("appActivity","com.android.calculator2.Calculator");
		
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
	}
	
	@BeforeMethod
	public void pageObject() {
		calculator = new Calculator(driver);
	}
	
	@Test (priority = 1)
	public void testKurang() {
		calculator.calcKurang();
		System.out.println("Hasil = "+calculator.getTxtResult());
		assertEquals(calculator.getTxtResult(), "2");
	}
	
	@Test (priority = 2)
	public void testKali() {
		calculator.calcKali();
		System.out.println("Hasil = "+calculator.getTxtResult());
		assertEquals(calculator.getTxtResult(), "8");
	}
	
	@Test (priority = 3)
	public void testBagi() {
		calculator.calcBagi();
		System.out.println("Hasil = "+calculator.getTxtResult());
		assertEquals(calculator.getTxtResult(), "2");
	}
	
	
	@AfterClass
	public void closeApp() {
		driver.quit();
	}
}
