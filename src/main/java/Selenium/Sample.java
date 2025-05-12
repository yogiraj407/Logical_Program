package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sample {
    
    
    
    
    public static void main(String[]args) throws InterruptedException {
        
        
        WebDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        
    driver.get("https://www.irctc.co.in/nget/train-search");
    
    driver.findElement(By.xpath("//p-autocomplete[@id=\"origin\"]/descendant::input")).sendKeys("Howrah");
    WebElement fromStation = driver.findElement(By.xpath("//span[contains(text(),'HWH')]"));
    if(fromStation.isDisplayed()){
        fromStation.click();
    }
    Thread.sleep(4000);
    driver.findElement(By.xpath("//p-autocomplete[@id=\"destination\"]/descendant::input")).sendKeys("Delhi");
    WebElement toStation = driver.findElement(By.xpath("//span[contains(text(),' DELHI - DLI ')]"));
    if(toStation.isDisplayed()) {
        toStation.click();
    }
    driver.findElement(By.id("journeyQuota")).click();
    WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
    wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li[@role='option' and @aria-label]")));
    List<WebElement> quataSuggestion = driver.findElements(By.xpath("//li[@role='option' and @aria-label]"));
   
    for(WebElement i:quataSuggestion) {
    String label=i.getDomAttribute("aria-label");
    System.out.println(label);
    if(label.contains("LADIES")) { 
        i.click();
    }
    }

    driver.findElement(By.xpath("//p-calendar[contains(@aria-label,'Enter Journey Date.')]")).click();
    
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'ui-datepicker-group')]")));
    
    String CMonth= driver.findElement(By.xpath("//span[contains(@class,'ui-datepicker-month')]")).getText();
    String Cyear = driver.findElement(By.xpath("//span[contains(@class,'ui-datepicker-year')]")).getText();
    while(!(CMonth.equals("March") && Cyear.equals("2025"))) {
        
        driver.findElement(By.xpath("//span[contains(@class,'chevron-right')]")).click();
         CMonth= driver.findElement(By.xpath("//span[contains(@class,'ui-datepicker-month')]")).getText();
         Cyear = driver.findElement(By.xpath("//span[contains(@class,'ui-datepicker-year')]")).getText();
        
    }
    
    driver.findElement(By.xpath("//a[text()='18']")).click();
        
    }

    }