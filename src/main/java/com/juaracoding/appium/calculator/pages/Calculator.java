package com.juaracoding.appium.calculator.pages;


import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Calculator {
	
	private AndroidDriver<MobileElement> driver;
	
	public Calculator(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
	}
	
	//Locator
	By btnDua = By.id("com.coloros.calculator:id/digit_2");
	By btnEmpat = By.id("com.coloros.calculator:id/digit_4");
	By btnKurang = By.id("com.coloros.calculator:id/op_sub");
	By btnKali = By.id("com.coloros.calculator:id/op_mul");
	By btnBagi = By.id("com.coloros.calculator:id/op_div");
	By btnSamaDengan = By.id("com.coloros.calculator:id/eq");
	By hasil = By.id("com.coloros.calculator:id/result");
	
	
	//Method
	public void calcKurang() {
		driver.findElement(btnEmpat).click();
		driver.findElement(btnKurang).click();
		driver.findElement(btnDua).click();
		driver.findElement(btnSamaDengan).click();
	}
	
	public void calcKali() {
		driver.findElement(btnEmpat).click();
		driver.findElement(btnKali).click();
		driver.findElement(btnDua).click();
		driver.findElement(btnSamaDengan).click();
	}
	
	public void calcBagi() {
		driver.findElement(btnEmpat).click();
		driver.findElement(btnBagi).click();
		driver.findElement(btnDua).click();
		driver.findElement(btnSamaDengan).click();
	}
	
	
	public String getTxtResult() {
		return driver.findElement(hasil).getText();
	}
	
	
	
}
