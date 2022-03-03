package users;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import genericLibrary.ExcelUtil;
import pomRepository.ReportsPage;
/***
 * 
 * @author Ajay S
 *
 */
public class ReportDeletion_Test extends Base_Class {
	@Test
	public void Report() {	
		ExcelUtil excelUtil = new ExcelUtil();
		reportspage=new ReportsPage(driver);
		String reportName = excelUtil.readStringDataFromExcel("Sheet1",0,0);	
		reportspage=new ReportsPage(driver);
		String expectedHomePageTitle = excelUtil.readStringDataFromExcel("Sheet1",4,0);
		Assert.assertEquals(driver.getTitle(),expectedHomePageTitle,"Home page is not displayed");
		Reporter.log("Home page is displayed",true);
		//Click on the report button in the home page
		String expectedReportPageTitle = excelUtil.readStringDataFromExcel("Sheet1",4,0);
		Assert.assertEquals(driver.getTitle(),expectedReportPageTitle,"Reports page is not displayed");
		Reporter.log("Reports page is displayed",true);
		homePage.getClickOnReports().click();
		//Clicking on the x button
		reportspage.getClickOnXButton().click();
		//Switching the driver control to the alert popup
		Alert alert = driver.switchTo().alert();
		//Accepting the condition in the popup
		alert.accept();
	}
}