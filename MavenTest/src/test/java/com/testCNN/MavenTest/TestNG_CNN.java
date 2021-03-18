package com.testCNN.MavenTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_CNN {
	

 public static void main(String[] args) {
	
	 WebDriver driver;

	  
	     {
	        WebDriverManager.chromedriver().setup();
	    
	   
	     {
	        driver = new ChromeDriver();
	    
       driver.get("https://www.cnn.com/");
       driver.close();
	     
	        if (driver != null) {
	            driver.quit();
	        }
	     }
	     }  
	     }
}


	


	 


