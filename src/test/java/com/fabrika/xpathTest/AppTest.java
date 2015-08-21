package com.fabrika.xpathTest;

import java.io.File;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.browserlaunchers.locators.GoogleChromeLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class AppTest

{
    /*@Test
    public void testGoogle(){
    	System.out.println("!! Start test Google !!");
    	//ChromeOptions options = new ChromeOptions();
    	//options.setBinary(new File("D:\\install\\java\\chromedriver.exe")); //"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe"
    	//WebDriver driver = new ChromeDriver();
    }*/
    
    @Test
    public void testFirefox(){
    	System.out.println("!! Start test Firefox !!");
    	WebDriver driver = new FirefoxDriver();
    	driver.get("http://www.google.com");
    }
    
    /*@Test
    public void testIE(){
    	System.out.println("!! Start test IE !!");
    	WebDriver driver = new InternetExplorerDriver();
    }*/
}
