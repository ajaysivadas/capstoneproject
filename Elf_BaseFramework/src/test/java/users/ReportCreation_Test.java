package users;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import genericLibrary.ExcelUtil;
import pomRepository.ReportsPage;

public class ReportCreation_Test extends Base_Class{

	@Test
	public void sample() {
		ExcelUtil excelUtil = new ExcelUtil();
		String reportName = excelUtil.readStringDataFromExcel("Sheet1",0,0);	
		reportspage=new ReportsPage(driver);
		//Click on the report button in the home page
		String expectedHomePageTitle = excelUtil.readStringDataFromExcel("Sheet1",4,0);
		Assert.assertEquals(driver.getTitle(),expectedHomePageTitle,"Home page is not displayed");
		Reporter.log("Home page is displayed",true);

		String expectedReportPageTitle = excelUtil.readStringDataFromExcel("Sheet1",4,0);
		Assert.assertEquals(driver.getTitle(),expectedReportPageTitle,"Reports page is not displayed");
		Reporter.log("Reports page is displayed",true);
		homePage.getClickOnReports().click();
		//Click on the new reports in the reports page
		reportspage.getClickNewReport().click();
		//Click on the configure report in the new report window
		reportspage.getClickOnConfigReport().click();
		String expectedConfigHTMLReportPageTitle = excelUtil.readStringDataFromExcel("Sheet1",4,0);
		Assert.assertEquals(driver.getTitle(),expectedConfigHTMLReportPageTitle,"Configure html report page is not displayed");
		Reporter.log("Configure html report page is displayed",true);
		//Click on the Generate HTML Report on the Configure report window
		reportspage.getClickOnGenerateHTMLReport().click();
		//Click on the add to dashboard button
		reportspage.getClickOnAddToDashboard().click();
		//Entering the name for the report created 
		reportspage.getInputTextField().sendKeys(reportName);
		//Clicking on the save button
		reportspage.getClickOnSave().click();
		//Clicking on the report dashboard button to check whether it is displayed on the report dashboard
		reportspage.getClickOnReportDashboard().click();
	}


}


