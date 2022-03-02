package users;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import pomRepository.ReportsPage;
/***
 * 
 * @author Ajay S
 *
 */
public class ReportDeletion_Test extends Base_Class {
@Test
	public void Report() {	
	
		reportspage=new ReportsPage(driver);
		//Click on the report button in the home page
		homePage.getClickOnReports().click();
		//Clicking on the x button
		reportspage.getClickOnXButton().click();
		//Switching the driver control to the alert popup
		Alert alert = driver.switchTo().alert();
		//Accepting the condition in the popup
        alert.accept();
}
}