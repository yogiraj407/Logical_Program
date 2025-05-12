package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import java.time.Duration;

public class class2  {
	
//public static AndroidDriver driver;
	
//	public static AppiumDriverLocalService service;
	
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();	
		WebDriver driver=new ChromeDriver();
		//WebDriverManager.firefoxdriver().setup();
		
		//WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		//driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("book");
		driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys(Keys.ENTER);
		String ActualPrice=driver.findElement(By.xpath("(//span[@class='a-price'])[1]")).getText();
		System.out.println(ActualPrice);
	
//		driver.findElement(By.name("q")).sendKeys("mobile");
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);		
//		
//		WebElement dropdown=driver.findElement(By.className("_2YxCDZ"));
//		Select s=new Select(dropdown);
//	s.selectByValue("10000");
//		
		
	/*	
		public static void main(String[] args) {

		        // Set the desired capabilities for your Android device
		        // Make sure your Appium server is running and the app is installed on the device/emulator
		        // Initialize the AppiumDriver with the desired capabilities
		       // AppiumDriver driver = new AndroidDriver<>(/* DesiredCapabilities here );

		        // Find the element you want to scroll to
		        WebElement elementToFind = driver.findElement(By.id("yourElementId"));

		        // Scroll until the element is visible
		       // scrollToElement(driver, elementToFind);

		        // Now, you can interact with the found element
		        elementToFind.click();

		        // Close the driver session
		        driver.quit();
		    }
/*
		    public static void scrollToElement(AppiumDriver driver, WebElement element) {
		        // Perform a loop to scroll until the element is found
		        while (!isElementVisible(driver, element)) {
		            // Swipe up (adjust the coordinates as needed)
		            swipeUp(driver);
		        }
		    }

		    public static boolean isElementVisible(AppiumDriver driver, WebElement element) {
		        try {
		            // Check if the element is displayed
		            return element.isDisplayed();
		        } catch (Exception e) {
		            // Element is not displayed
		            return false;
		        }
		    }

		    public static void swipeUp(AppiumDriver<MobileElement> driver) {
		        // Set start and end coordinates for the swipe
		        int startX = driver.manage().window().getSize().getWidth() / 2;
		        int startY = (int) (driver.manage().window().getSize().getHeight() * 0.8);
		        int endY = (int) (driver.manage().window().getSize().getHeight() * 0.2);

		        // Create a TouchAction for the swipe gesture
		        TouchAction<?> touchAction = new TouchAction<>(driver);
		        touchAction
		            .press(PointOption.point(startX, startY))
		            .waitAction()
		            .moveTo(PointOption.point(startX, endY))
		            .release()
		            .perform();
		    }
		

  */
		
		
		
	}
}

