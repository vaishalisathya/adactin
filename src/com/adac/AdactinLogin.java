package com.adac;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinLogin {

	public static void main(String[] args) throws IOException 
	{
		
		// Browser Launch 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		//Object creation for the web driver
		WebDriver drive = new ChromeDriver();
		//Navigating to the web page with get web element method
		drive.get("https://adactinhotelapp.com/");
		//Maximizing web page 
		drive.manage().window().maximize();
		
		//Implicit Wait - it can be called once but waits for every web element
		drive.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement uname = drive.findElement(By.xpath("//input[@id='username']"));
		uname.sendKeys("nivi2430");
		WebElement pass = drive.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys("vaishu24041998");
		WebElement loginbtn = drive.findElement(By.xpath("//input[@id='login']"));
		loginbtn.click();
	
		WebElement location = drive.findElement(By.xpath("//select[@id='location']"));
		Select sloc = new Select(location);
		sloc.selectByValue("London");
		
		WebElement hotels = drive.findElement(By.xpath("//select[@id='hotels']"));
		Select shotel = new Select(hotels);
		shotel.selectByIndex(4);
		
		WebElement roomtype = drive.findElement(By.id("room_type"));
		Select sroomtype = new Select(roomtype);
		sroomtype.selectByVisibleText("Deluxe");
		
		WebElement noofroom = drive.findElement(By.xpath("//select[@id='room_nos']"));
		Select snoroom = new Select(noofroom);
		snoroom.selectByValue("3");
		
		WebElement checkin = drive.findElement(By.xpath("//input[@id='datepick_in']"));
		checkin.sendKeys("05/04/2024");
		
		WebElement checkout = drive.findElement(By.xpath("//input[@id='datepick_out']"));
		checkout.sendKeys("07/04/2024");
		
		WebElement adults = drive.findElement(By.name("adult_room"));
		Select sadults = new Select(adults);
		sadults.selectByVisibleText("3 - Three");
		
		WebElement child = drive.findElement(By.xpath("//select[@id='child_room']"));
		Select schild = new Select(child);
		schild.selectByVisibleText("2 - Two");
		
		WebElement search = drive.findElement(By.id("Submit"));
		search.click();
		
		WebElement select = drive.findElement(By.xpath("//input[@id='radiobutton_0']"));
		select.click();
		
		WebElement cont = drive.findElement(By.xpath("//input[@id='continue']"));
		cont.click();
		
		WebElement fname = drive.findElement(By.id("first_name"));
		fname.sendKeys("Vaishali");
		
		WebElement lname = drive.findElement(By.id("last_name"));
		lname.sendKeys("Sathyanarayanan");
		
		WebElement address = drive.findElement(By.id("address"));
		address.sendKeys("No 5,pillayar koil st,tondaiyarpet");
		
		WebElement ccardno = drive.findElement(By.id("cc_num"));
		ccardno.sendKeys("3459789654673478");
		
		WebElement cardtype = drive.findElement(By.name("cc_type"));
		Select scardtype = new Select(cardtype);
		scardtype.selectByVisibleText("Master Card");
		
		WebElement expmonth = drive.findElement(By.name("cc_exp_month"));
		Select sexpmonth = new Select(expmonth);
		sexpmonth.selectByVisibleText("March");
		
		WebElement expyear = drive.findElement(By.name("cc_exp_year"));
		Select sexpyear = new Select(expyear);
		sexpyear.selectByVisibleText("2029");
		
		WebElement cvv = drive.findElement(By.id("cc_cvv"));
		cvv.sendKeys("566");
		
		WebElement book = drive.findElement(By.id("book_now"));
		book.click();
		
		WebElement ltinerary = drive.findElement(By.id("my_itinerary"));
		ltinerary.click();
		
		TakesScreenshot ts = (TakesScreenshot) drive;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\admin\\eclipse-workspace\\ProjectAdactin\\ScreenShot\\Proj_Adactin.png");
		FileUtils.copyFile(source,destination);
		
		}

}
