package com.org.learningMaven.MercuryTours.MercuryTours_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Flight_Finder_Script {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String baseUrl="http://newtours.demoaut.com/mercuryreservation.php";
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.findElement(By.name("userName")).sendKeys("supreet");
		driver.findElement(By.name("password")).sendKeys("hellohello");
		WebElement submit1=driver.findElement(By.xpath("//input[@name='login']"));
		Actions action= new Actions(driver);
		action.moveToElement(submit1);
		action.click().build().perform();
		driver.findElement(By.xpath("//body//b//input[2]")).click();
		new Select (driver.findElement(By.xpath("//select[@name='passCount']"))).selectByVisibleText("2");
		new Select (driver.findElement(By.xpath("//select[@name='fromPort']"))).selectByVisibleText("New York");
		new Select (driver.findElement(By.xpath("//select[@name='fromMonth']"))).selectByVisibleText("August");
		new Select(driver.findElement(By.xpath("//select[@name='fromDay']"))).selectByVisibleText("15");
		new Select(driver.findElement(By.xpath("//select[@name='toPort']"))).selectByVisibleText("Sydney");
		new Select(driver.findElement(By.xpath("//select[@name='toMonth']"))).selectByVisibleText("November");
		new Select(driver.findElement(By.xpath("//select[@name='toDay']"))).selectByVisibleText("30");
		driver.findElement(By.name("servClass")).click();
		new Select(driver.findElement(By.xpath("//select[@name='airline']"))).selectByVisibleText("Blue Skies Airlines");
		WebElement continued=driver.findElement(By.xpath("//input[@name='findFlights']"));
		action.moveToElement(continued);
		action.click().build().perform();
		boolean select=driver.findElement(By.xpath("//select[@name='airline']")).isEnabled();
		boolean select2=driver.findElement(By.xpath("//select[@name='passCount']")).isEnabled();
		System.out.println(select);
		System.out.println(select2);
		
		if(select==true)
		{
			System.out.println("testCase Pass");
		}
		
		else
		{
			System.out.println("Failed test case");
		}
		
		
		driver.close();
		
	
		
		
		
	
	
	}
	

}
