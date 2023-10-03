package testcases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import pageObjectModel.LoginPageObjects;
import resources.Baseclass;

public class Verifylogin extends Baseclass {
	
	@Test
	
	public void login() throws IOException, InterruptedException
	{
		
		FileInputStream fs = new FileInputStream("C:\\Users\\pc\\Desktop\\Book1.xlsx");
	     
	     XSSFWorkbook workbook = new XSSFWorkbook(fs);
	     
	     XSSFSheet sheet = workbook.getSheetAt(0);
	     
	     XSSFRow row = sheet.getRow(0);
	     
	     XSSFCell cell = row.getCell(0);
	     
	     String c1 = cell.toString();
	     
        XSSFCell cell1 = row.getCell(1);
        
        String c2 = cell1.toString();
		
		driverInitialize();
		Thread.sleep(2000);
		
		driver.get("https://login.salesforce.com/?locale=in");
		
		LoginPageObjects lpo = new LoginPageObjects(driver);
		
		lpo.enterUsername().sendKeys(c1);
		Thread.sleep(2000);
		
		lpo.enterpassword().sendKeys(c2);
		Thread.sleep(2000);
		
		//lpo.clickonlogin().click();
		
	} 

}
