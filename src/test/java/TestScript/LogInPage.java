package TestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import UIPageObjects.HomePageObjects;
import UIPageObjects.LogIn;

public class LogInPage {
	
	static WebDriver driver;
	LogIn login;
	HomePageObjects homePage;
	@BeforeTest
	public void launchApplication(){
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sivaravula\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://cftest.hsc.usf.edu/dwdeptassignment");
	 login = PageFactory.initElements(driver, LogIn.class);
	 homePage = PageFactory.initElements(driver,HomePageObjects.class);
	
	}
	
	@Test(priority=1,description="This function will login to the application")
	public void logInToApplication(){
		login.logIn("sivaravula", "Bahubali1");
		
	}
	
	@Test(priority=2,description="Selecting the department")
	public void  selectDept1() throws InterruptedException {
		Thread.sleep(4000);
	login.deptSelection("AMBULATORY SURGERY CENTER");
	}
	
	@Test(priority=3,description="Selecting the department")
	public void selectDept2() throws InterruptedException {
		Thread.sleep(4000);
	login.deptSelection("ANCILLARY SUPPORT");

	
	}
	
}
