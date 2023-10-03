package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupObjectModel {

	public static WebDriver driver;
	
	private By Fname = By.xpath("//input[@name='UserFirstName']");
	
	private By Lname = By.xpath("//input[@name='UserLastName']");
	
	private By Email = By.xpath("//input[@name='UserEmail']");
	
	private By Jobtitle = By.xpath("//select[@name='UserTitle']");
	
	private By Company = By.xpath("//input[@name='CompanyName']");
	
	private By Employees = By.xpath("//select[@name='CompanyEmployees']");
	
	
	public SignupObjectModel(WebDriver driver2)    //this costructor is used for access that driver
	{
		this.driver=driver2;   //driver2 is siginup class driver and driver is webdr 
	}
	


	public WebElement enterFname()  //this method is used to access that private variable
	{
		return driver.findElement(Fname); //
		
	}
	
	public WebElement enterLname()
	{
		return driver.findElement(Lname);
		
	}
	
	public WebElement enterEmail()
	{
		return driver.findElement(Email);
		
	}
	
	public WebElement selectjobTitle()
	{
		return driver.findElement(Jobtitle);
		
	}
	
	public WebElement enterCompanyname()
	{
		return driver.findElement(Company);
		
	}
	
	public WebElement selectEmployee()
	{
		return driver.findElement(Employees);
	}
}
