package Selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locator {
	
	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","E:\\Software Testing\\Velocity Class\\Automation\\appication and software instalation\\instalation\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
		
	
		//System.setProperty("webdriver.chrome.driver","E:\\Software Testing\\Velocity Class\\Automation\\appication and software instalation\\instalation\\chromedriver.exe");		
//		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver= new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	    
//		    	 
	//	driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
		  
//		  Point p=new Point(100,100);
//		  driver.manage().window().setPosition(p);
//		  
		  
		  //driver.manage().window().maximize();
	//	driver.get("https://www.browserstack.com/live");
		
		
		
		///************ Locators ***************
		
		///by id
		
//		driver.findElement(By.id("search2")).sendKeys("java");
//		driver.findElement(By.id("learntocode_searchicon")).click();
//		
		
		///by name
		
//		          driver.findElement(By.name("url")).sendKeys("java");
//		          driver.findElement(By.id("live-form-submit-btn")).click();
//		     
		
//		///by tagName
//		
//		driver.findElement(By.tagName("input")).sendKeys("java");
//        driver.findElement(By.id("live-form-submit-btn")).click();
		
		
		///by tagName
//		
//		driver.findElement(By.className("text input-lg input-primary input-margin error-border")).sendKeys("java");
//        driver.findElement(By.id("live-form-submit-btn")).click();
	}
	
	
	

}
