package com.org.learningMaven.MercuryTours.MercuryTours_Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Final_script {

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
			
			driver.findElement(By.xpath("//table//table//table//table//table[1]//tbody[1]//tr[5]//td[1]//input[1]")).click();
			driver.findElement(By.xpath("//table[2]//tbody[1]//tr[7]//td[1]//input[1]")).click();
			WebElement Continue=driver.findElement(By.name("reserveFlights"));
			action.moveToElement(Continue);
			action.click().build().perform();	
			
			driver.findElement(By.xpath("//input[@name='passFirst0']")).sendKeys("jagdeepak");
			driver.findElement(By.xpath("//input[@name='passLast0']")).sendKeys("verka");
			driver.findElement(By.xpath("//input[@name='passFirst1']")).sendKeys("Supreet");
			driver.findElement(By.xpath("//input[@name='passLast1']")).sendKeys("Kaur");
			new Select(driver.findElement(By.xpath("//select[@name='creditCard']"))).selectByVisibleText("Visa");
			driver.findElement(By.xpath("//input[@name='creditnumber']")).sendKeys("256787643");
			
			boolean check= driver.findElement(By.xpath("//select[@name='creditCard']")).isEnabled();
			System.out.println("value is:" + " "+ check);
			
			new Select(driver.findElement(By.xpath("//select[@name='cc_exp_dt_mn']"))).selectByVisibleText("09");
			new Select(driver.findElement(By.xpath("//select[@name='cc_exp_dt_yr']"))).selectByVisibleText("2008");
			driver.findElement(By.xpath("//input[@name='cc_frst_name']")).sendKeys("Jagdeepak");
			driver.findElement(By.xpath("//input[@name='cc_mid_name']")).sendKeys("singh");
			driver.findElement(By.xpath("//input[@name='cc_last_name']")).sendKeys("verka");
			driver.findElement(By.xpath("//input[@name='billAddress1']")).clear();
			driver.findElement(By.xpath("//input[@name='billAddress1']")).sendKeys("8 roehampton cres");
			driver.findElement(By.xpath("//input[@name='billCity']")).clear();
			driver.findElement(By.xpath("//input[@name='billCity']")).sendKeys("Brampton");
			driver.findElement(By.xpath("//input[@name='billState']")).clear();
			driver.findElement(By.xpath("//input[@name='billState']")).sendKeys("onatrio");
			driver.findElement(By.xpath("//input[@name='billZip']")).clear();
			driver.findElement(By.xpath("//input[@name='billZip']")).sendKeys("L6W1S9");
			new Select(driver.findElement(By.xpath("//select[@name='billCountry']"))).selectByVisibleText("CANADA");
			driver.findElement(By.xpath("//tr[15]//td[2]//input[1]")).click();
			boolean check2= driver.findElement(By.xpath("//tr[15]//td[2]//input[1]")).isEnabled();
			System.out.println("BILLING ADDRESS IS CHECKING"+"  "+check2);
			
			
			WebElement Secure_Purchase=driver.findElement(By.xpath("//input[@name='buyFlights']"));
			action.moveToElement(Secure_Purchase);
			action.click().build().perform();
			
			String flightConfirmed=driver.findElement(By.cssSelector("td:nth-child(1) p:nth-child(1) font:nth-child(1) b:nth-child(1) > font:nth-child(2)")).getText();
		//System.out.println("Here is your RECIEPT:"+"  "+flightConfirmed);
			String confirmation=driver.findElement(By.cssSelector("td.frame_header_info b:nth-child(1) font:nth-child(1) font:nth-child(1) b:nth-child(1) > font:nth-child(1)")).getText();
		String Date_Time=driver.findElement(By.cssSelector("td.frame_header_info tbody:nth-child(1) tr:nth-child(1) td:nth-child(2) font:nth-child(1) > b:nth-child(1)")).getText();
		String Departing=driver.findElement(By.cssSelector("td:nth-child(1) table:nth-child(1) tbody:nth-child(1) tr:nth-child(3) > td.frame_header_info")).getText();
		String Returning=driver.findElement(By.cssSelector("td:nth-child(1) table:nth-child(1) tbody:nth-child(1) tr:nth-child(5) > td.frame_header_info")).getText();
		String Number_of_passenger=driver.findElement(By.cssSelector("table:nth-child(1) tbody:nth-child(1) tr:nth-child(7) td.data_left > font:nth-child(1)")).getText();
		String Billing=driver.findElement(By.cssSelector("table:nth-child(1) tbody:nth-child(1) tr:nth-child(9) td:nth-child(1) > p:nth-child(1)")).getText();
		String Tax=driver.findElement(By.cssSelector("td.data_left font:nth-child(1) font:nth-child(1) font:nth-child(1) b:nth-child(1) > font:nth-child(1)")).getText();
		String Price=driver.findElement(By.cssSelector("td:nth-child(1) table:nth-child(1) tbody:nth-child(1) tr:nth-child(12) > td.data_left")).getText();
		driver.findElement(By.cssSelector("tbody:nth-child(1) tr:nth-child(1) td:nth-child(3) a:nth-child(1) > img:nth-child(1)")).click();
		
		System.out.println("HELLO THIS IS YOUR DETAIL SUMMARY   :"+flightConfirmed);
		System.out.println("CONFIRAMTION NUMBER  :"+confirmation);
		System.out.println("DATE AND TIME OF BOOKING   :"+Date_Time);
		System.out.println("DEPARTING  :"+Departing );
		System.out.println("RETURNING   :"+Returning);
		System.out.println("PASSENGER   :"+Number_of_passenger);
		System.out.println("BILLING   :"+Billing);
		System.out.println("TAX    :"+ Tax);
		System.out.println("PRICE OF YOUR TICKET    :"+Price);
		
		//driver.close();
		
	}

}
