package com.name.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MR {
	static WebDriver driver;

	 

    // ===============================================================================

   

    /*  

     *   Browser launch and application launch

     */

    public void browserMercuryAppLaunch() throws InterruptedException {

          System.setProperty("webdriver.chrome.driver", "./Webdriver/chromedriver.exe");

          driver = new ChromeDriver();

          driver.manage().window().maximize();

          Thread.sleep(3000);

          driver.get("http://newtours.demoaut.com/");

          Thread.sleep(3000);

    }

}
