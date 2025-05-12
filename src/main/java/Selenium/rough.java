package Selenium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class rough {
	
	public static void main(String[] args) throws InterruptedException {
		
//	WebDriverManager.chromedriver().setup();	
//	WebDriver driver=new ChromeDriver();
//	driver.get("https://www.google.com//");
//	driver.manage().window().maximize();
//	driver.findElement(By.name("q")).sendKeys("Test Automation");
//	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//	
//   List<WebElement> l=driver.findElements(By.partialLinkText(""));
//   System.out.println(l);
//   System.out.println(l);
//	
//	//Actions act=new Actions(driver);
//	//WebElement home_f=
//	driver.findElement(By.xpath("//span[text()='Home & Furniture']")).click();
//
//	//act.moveToElement(home_f).build().perform();
//	Thread.sleep(1000);
//	
//	driver.findElement(By.xpath("//a[text()='Living Room Furniture']")).click();
		
		
		
		
		
   
//   WebDriverManager.chromedriver().setup();
//   WebDriver driver = new ChromeDriver();
//   driver.manage().window().maximize();
//   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//   driver.get("https://www.geeksforgeeks.org/");
//   
   
   
   
//
//   // Get all the available Links
//   List<WebElement> links= driver.findElements(By.tagName("a"));
//
//   // Iterating through all the Links and printing link
//   // text
//   for (WebElement link : links) {
//       System.out.println(link.getText());
//       
       
    
   /*
       	// Important code of serching all links of webpage
     
      
      // int count=0;
       List<WebElement> links = driver.findElements(By.tagName("a"));       
       for(int i=0;i<links.size();i++) {    	   
    	   try {
    		   
    	   WebElement link=links.get(i);
    	   //String href = link.getAttribute("href");
    	   String text=link.getText();
    	 driver.findElement(By.partialLinkText(text)).click();
    	 driver.navigate().back();
		   System.out.println(i+text);

    	   }catch(Exception e) {
    		   
    		   System.out.println(e);   
    	   }
       }
       
       // Iterate through the list and print the href attribute of each link
//       for (WebElement link : links) {
//           String href = link.getAttribute("href");
//    	   //String text=link.getText();
//    	   
//           count++;
//          // System.out.println(text);
//       		}
       
   //System.out.println(count);
   */
   
   
  // ArrayList<String> list=new ArrayList<>();
   HashSet<String> set=new HashSet<>();
   HashSet<String> names = new HashSet<>();
   names.add("Alice");
   names.add("Bob");
   names.add("Charlie");
   names.add("Alice1");
   names.add("Bob1");
   names.add(null);
   // Convert HashSet to an array
   String[] namesArray = names.toArray(new String[0]);

   // Iterate using a traditional for loop
   for (int i = 0; i < namesArray.length; i++) {
       System.out.println(namesArray[i]);
   }
   
   
   
   
   
	}

}
