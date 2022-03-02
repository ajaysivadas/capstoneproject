package users;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import genericLibrary.ExcelUtil;
import pomRepository.CreateChartPage;
import pomRepository.ReportsPage;
/***
 * 
 * @author Ajay S
 *
 */
public class ChartCreation_Test extends Base_Class {
	@Test
	public void Create_Chart() {
		//Click on the report 	
		
		ExcelUtil excelUtil = new ExcelUtil();
		String expectedHomePageTitle = excelUtil.readStringDataFromExcel("Sheet1",4,0);
		
		Assert.assertEquals(driver.getTitle(),expectedHomePageTitle,"Home page is not displayed");
		Reporter.log("Home page is displayed",true);
		
		String expectedReportPageTitle = excelUtil.readStringDataFromExcel("Sheet1",5,0);
		Assert.assertEquals(driver.getTitle(),expectedReportPageTitle,"Reports page is not displayed");
		Reporter.log("Reports page is displayed",true);
		homePage.getClickOnReports().click();
		ReportsPage reportsPage = new ReportsPage(driver);
		//Clicking on Create Chart
		reportsPage.getClickOnCreateChart().click();
		CreateChartPage createChartPage=new CreateChartPage(driver);	
		//Clicking on add to dashboard
		createChartPage.getClickOnAddToDashBoard().click();
		//reading from the data excel sheet
		String chartName = excelUtil.readStringDataFromExcel("Sheet1",2,0);
		//Entering the name for the report created 
		createChartPage.getInputChartName().sendKeys(chartName);
		//Clicking on the save button
		createChartPage.getClickOnSave().click();
		//Clicking on show Percentage checkbox
		createChartPage.getClickOnShowPercentage().click();
		//Clicking on Export to PDF
		createChartPage.getClickOnExportToPDF().click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//Clicking on download PDF
		createChartPage.getClickOnDownloadPDF().click();

	}
}