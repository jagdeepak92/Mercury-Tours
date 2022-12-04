package com.org.learningMaven.MercuryTours.MercuryTours_Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Register_Script {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String baseURL="http://newtours.demoaut.com/";
			System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.get(baseURL);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
			
			WebElement mouse=driver.findElement(By.linkText("REGISTER"));
			Actions action= new Actions(driver);
			action.moveToElement(mouse);
			action.click().build().perform();
			driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Jagdeepak");
			driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Verka");
			driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("+14377752500");
			driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("jagdeepka0002gmail.com");
			driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("8 roehamton crescent");
			driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Brampton");
			driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Onatrio");
			driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("L6w1s9");
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("jaycee");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Alphabets");
			driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("Alpahbets");
			WebElement submit=driver.findElement(By.xpath("//input[@name='register']"));
			action.moveToElement(submit);
			action.click().build().perform();
			WebElement Sign_in=driver.findElement(By.linkText("sign-in"));
			action.moveToElement(Sign_in);
			action.click().build().perform();
			driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("supreet");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("hellohello ");
			WebElement login=driver.findElement(By.name("login"));
			//Actions action= new Actions(driver);
			action.moveToElement(login);
			action.click().build().perform();
			
			
		//	driver.close();
		
	}

}
