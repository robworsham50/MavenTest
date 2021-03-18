package com.testCNN.MavenTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CNNTest {
	
	 WebDriver driver = null;
	 	
	 
	 
@BeforeTest	 
public void setup() {
	WebDriverManager.chromedriver().setup(); 
    driver = new ChromeDriver();
}
	       
	  @Test   	 
     public void cnnTest()     {   
	        
	    //Open CNN.com
       driver.get("https://www.cnn.com/");
       
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



	


	 


