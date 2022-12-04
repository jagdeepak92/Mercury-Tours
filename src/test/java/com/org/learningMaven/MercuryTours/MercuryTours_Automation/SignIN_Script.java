package com.org.learningMaven.MercuryTours.MercuryTours_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SignIN_Script {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseURL="http://newtours.demoaut.com/mercurysignon.php";
		System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get(baseURL);
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("supreet");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("hellohello");
		WebElement login=driver.findElement(By.name("login"));
		Actions action= new Actions(driver);
		action.moveToElement(login);
		action.click().build().perform();
		
		
		

	}

}
