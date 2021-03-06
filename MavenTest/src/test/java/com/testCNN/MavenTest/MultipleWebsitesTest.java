//@author Rob Worsham
package com.testCNN.MavenTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWebsitesTest {
	
	 WebDriver driver = null;
	 	
	 
	 
@BeforeTest	 
public void setup() {
	WebDriverManager.chromedriver().setup(); 
    driver = new ChromeDriver();
}
	       
	  @Test   	 
     public void multipleWebsitesTest() throws InterruptedException     {   
	        
	    //Open CNN.com
       driver.get("https://www.cnn.com/");
       Thread.sleep(5000);
       driver.get("https://www.ebay.com/");
             
       Thread.sleep(5000);
       driver.get("https://www.microsoft.com/en-us/");
             
       Thread.sleep(5000);
       driver.get("https://www.google.com/");
     /*  driver.findElement(By.id("realbox")).sendKeys("Expensive Cars");
     // driver.findElement(By.xpath("//*[@id=\"input\"]")).sendKeys("Expensive Cars");
      Thread.sleep(8000);
     // driver.navigate().back();
     // Thread.sleep(8000);
      //driver.findElement(By.xpath("//*[@id=\"input\"]")).clear();
      driver.findElement(By.id("realbox")).clear();
      Thread.sleep(5000);
       //driver.findElement(By.xpath("//*[@id=\"input\"]")).sendKeys("drums");
       driver.findElement(By.id("realbox")).sendKeys("drums");
       Thread.sleep(5000);
       //driver.findElement(By.xpath("//*[@id=\"input\"]")).sendKeys(Keys.RETURN);
       driver.findElement(By.id("realbox")).sendKeys(Keys.RETURN);
      // driver.findElement(By.xpath("/html/body/ntp-app//div[1]/ntp-realbox//div/ntp-realbox-icon//div[2]")).click();
      */
	        }
	  @AfterTest
     public void tearDownTest() 
     {
    	 
    	//Close Browser
         driver.close();
  	   driver.quit();  
         System.out.println("Test Completed Successfully");
  	        
	     
	     }  
}



	


	 


