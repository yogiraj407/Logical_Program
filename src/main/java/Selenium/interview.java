package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class interview {
	
	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.irctc.co.in");

		
		/*
		driver.get("https://www.facebook.com/");
		
		//Handling of dynamic webelements
		driver.findElement(By.xpath("//button[contains(@id,'u_0_5')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		driver.findElement(By.xpath("//button[starts-with(@id,'u_0_5')]")).click();
		driver.findElement(By.xpath("//form[@data-testid='royal_login_form']/descendant::button")).click();//this and above lines are same
		driver.findElement(By.xpath("//button[1]")).click();

		driver.findElement(By.xpath("//button[text()='Log in']")).click();
*/
	//	driver.get("https://www.flipkart.com/");
		
		
		
	
	}

}
