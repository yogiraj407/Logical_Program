package Selenium;

import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;
//import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class z_Handson {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Velocity Class\\Automation\\appication and software instalation\\instalation\\chromedriver.exe");
	
		WebDriver driver =new ChromeDriver();
		
		
		
		Thread.sleep(3000);
		WebElement createaccount = driver.findElement(By.xpath("(//a[@role='button'])[2]"));//by index
	       createaccount.click();
	       
	       Thread.sleep(10000);
	        
	          WebElement month = driver.findElement(By.xpath("//select[@aria-label='Month']"));
		
	         Select s= new Select(month);
	          
	          s.selectByIndex(2);
	          
	          s.selectByValue("4");
	          s.selectByVisibleText("May");
		
		
	}
	
	
	
	
	
}
