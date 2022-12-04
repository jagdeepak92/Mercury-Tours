package com.org.learningMaven.MercuryTours.MercuryTours_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Select_Flight_Script {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String baseUrl="http://newtours.demoaut.com/mercuryreservation2.php";
		System.setProperty("webdriver.driver.chrome", "./Drivers\\chromedrivere.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(baseUrl);
		driver.findElement(By.name("userName")).sendKeys("supreet");
		driver.findElement(By.name("password")).sendKeys("hellohello");
		WebElement submit1=driver.findElement(By.xpath("//input[@name='login']"));
		Actions action= new Actions(driver);
		action.moveToElement(submit1);
		action.click().build().perform();
		//driver.close();

	}

}
