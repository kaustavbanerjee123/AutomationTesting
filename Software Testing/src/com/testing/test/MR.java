package com.testing.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MR

{

	// ================================================================================

	 

    /*

     * Photo Upload with AutoIT

     */

	private static final TimeUnit TimeUnit = null;
	private static final String SECONDS = null;
	static WebDriver driver;

	// public void browserMercuryAppLaunch() throws InterruptedException{

	System.setProperty("webdriver.chrome.driver","./Webdriver/chromedriver.exe");

	driver = new ChromeDriver();

	driver.manage().window().maximize();

	driver.get("http://www.newtours.demoaut.com/");

	Thread.sleep(3000);

	}

	public void mercuryLogin()throws InterruptedException{

	Thread.sleep(3000);;

	WebElement uName = driver.findElement(By.name("userName"));

	uName.sendKeys("kaustavbanerjee123");

	Thread.sleep(3000);

	WebElement pwd = driver.findElement(By.name("password"));

	pwd.sendKeys("nirmal@208");

	Thread.sleep(3000);

	WebElement login = driver.findElement(By.name("login"));

	login.click();

	Thread.sleep(3000);

	//Robot r1 = new Robot();

	//r1.keyPress(KeyEvent.VK_ENTER);

	//Actions builder = new Actions(driver);

	//builder.moveToElement(login).build().perform();

	//builder.click(login).build().perform();

	}
	public void verifyLogin1() throws InterruptedException{

	String expTitle = "Find a Flight: Mercury Tours:";

	String actTitle = driver.getTitle();

	System.out.println("The system prints the line:" + actTitle);

	if(actTitle.equals(expTitle)) {

	System.out.println("Test case has passed");

	}

	else
		
	{
		
	System.out.println("Test case has failed");

	}
	}

	public void passengerNo() throws InterruptedException{

	WebElement passNo = driver.findElement(By.name("passCount"));

	Select sel = new Select(passNo);

	sel.selectByVisibleText("4");

	Thread.sleep(2000);
	}

	public void departFrom() throws InterruptedException{

	WebElement dptfm = driver.findElement(By.xpath("//select[@name='fromPort']"));

	Select sel = new Select(dptfm);

	sel.selectByVisibleText("London");

	Thread.sleep(2000);

	}
	
	public void travelMonth() throws InterruptedException{

		WebElement onmonth = driver.findElement(By.xpath("//select[@name='fromMonth']"));

		Select sel = new Select(onmonth);

		sel.selectByVisibleText("August");

		Thread.sleep(2000);

		}

		public void travelDate() throws InterruptedException{

		WebElement ondate = driver.findElement(By.xpath("//select[@name='fromDay']"));

		Select sel = new Select(ondate);

		sel.selectByVisibleText("20");

		Thread.sleep(2000);
		}

		public void arriveInCity() throws InterruptedException{
			
		WebElement oncity = driver.findElement(By.xpath("//select[@name='toPort']"));

		Select sel = new Select(oncity);

		sel.selectByVisibleText("Sydney");

		Thread.sleep(2000);
		}

		public void returnMonth() throws InterruptedException{

		WebElement retmon = driver.findElement(By.xpath("//select[@name='toMonth']"));

		Select sel = new Select(retmon);

		sel.selectByVisibleText("September");

		Thread.sleep(2000);

		}

		public void returnDate() throws InterruptedException{
			
		WebElement retdate = driver.findElement(By.xpath("//select[@name='toDay']"));

		Select sel = new Select(retdate);

		sel.selectByVisibleText("18");

		Thread.sleep(2000);

		}
		public void airlineType() throws InterruptedException{
			
		WebElement airtyp = driver.findElement(By.xpath("//select[@name='airline']"));

		Select sel = new Select(airtyp);

		sel.selectByVisibleText("Blue Skies Airlines");

		Thread.sleep(2000);
		}
		public void clickContinue() throws InterruptedException{

		WebElement contin = driver.findElement(By.xpath("//input[@name='findFlights']"));


		contin.click(); //

	// ================================================================================

	 

    /*

     * Photo Upload with AutoIT

     */

    public void autoITTest ()throws InterruptedException, IOException {

         System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

         driver = new ChromeDriver();

         driver.manage().window().maximize();

         driver.get("https://imgbb.com/");

         Thread.sleep(4000);

         WebElement btnStartUpload = driver.findElement(By.xpath("//a[@class='btn btn-big blue']"));

         btnStartUpload.click();

         Thread.sleep(2000);

         Runtime.getRuntime().exec("./autoitexe/autoitfileupload.exe");

         Thread.sleep(6000);

         WebElement btnUpload = driver.findElement(By.xpath("//button[@class='btn btn-big green']"));

         btnUpload.click();

         Thread.sleep(5000);

    }
}
















   

    






    


    		 
    


    
    
    


    







    



	   
	   
   



     
     
     
     
     







    