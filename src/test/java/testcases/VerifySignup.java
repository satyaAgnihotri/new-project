package testcases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageObjectModel.SignupObjectModel;
import resources.Baseclass;

public class VerifySignup extends Baseclass {
   
	@Test
	public void signup() throws IOException, InterruptedException
	{
	  driverInitialize();
		
	  driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	
	 SignupObjectModel spo = new SignupObjectModel(driver);
	 
	 spo.enterFname().sendKeys("satya");
	 
	 spo.enterLname().sendKeys("Agnihotri");
	 
	 spo.enterEmail().sendKeys("satya@gmail");
	 
	 WebElement j = spo.selectjobTitle(); 
	 Select s = new Select(j);
	 s.selectByIndex(1);
	 
	 spo.enterCompanyname().sendKeys("Google");
	 
	 WebElement w = spo.enterCompanyname(); 
	 Select e = new Select(w);
	 e.selectByIndex(3);
	}
	
	
}
  