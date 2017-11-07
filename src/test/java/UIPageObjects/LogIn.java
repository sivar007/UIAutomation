package UIPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LogIn {
	
	WebDriver driver;
	
	@FindBy(how = How.ID, using="hitComp_msLogin_id")
	public WebElement txtBox_userName;
	
	@FindBy(how = How.ID, using="hitComp_msLogin_password")
	public WebElement txtBox_password;
	
	@FindBy(how = How.XPATH, using="//input[@type='submit']")
	public WebElement logInBtn;
	
	public LogIn(WebDriver driver)
	{
		this.driver = driver;
	}
	
	/*
	 * Method for login to application
	 */
	public void logIn(String userName, String password){
		txtBox_userName.sendKeys(userName);
		txtBox_password.sendKeys(password);
		logInBtn.click();
		
	}
	/*
	 * Method for selecting department
	 */

	public void deptSelection(String deptName) {
		driver.findElement(By.xpath("//div[@id='hartdepartments']//div//span[text()='"+deptName+"']//preceding-sibling::img")).click();
		
	}
	

}
