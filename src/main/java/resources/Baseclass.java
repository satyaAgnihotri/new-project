package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Baseclass {
	
	public static WebDriver driver;
	
	 public void driverInitialize() throws IOException
	 {
		 
		 FileInputStream fis = new FileInputStream("C:\\Users\\pc\\eclipse-workspace\\SatyaMavenproject\\src\\main\\java\\resources\\data.properties");
		 //this will read the properties file
		 
		 Properties p = new Properties(); //by this we can use load method
		 
		 p.load(fis);
		 
	   String browserName = p.getProperty("browser");
		 
		if(browserName.equalsIgnoreCase("chrome"))
		{
			
		  driver = new ChromeDriver();
		 //driver.get("https://www.facebook.com/login/");	
		 
		}
		
		else if(browserName.equalsIgnoreCase("edge"))
		{
			 driver = new EdgeDriver();
		}
		 
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			 driver = new FirefoxDriver();
		}
		
		else
		{
			System.out.println("error");
		}
	 }

}
