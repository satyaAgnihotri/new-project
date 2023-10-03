package testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sceenshot {
	
	@Test
	
	public void snapshot() throws InterruptedException, IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		TakesScreenshot s = (TakesScreenshot)driver;  //typecast,Convert web driver object to TakeScreenshot
		
		File src = s.getScreenshotAs(OutputType.FILE);
		
		File des = new File("C:\\Users\\pc\\Desktop\\screenshot\\pic1.png");
		
		FileUtils.copyFile(src, des);
		
		
	}

}
