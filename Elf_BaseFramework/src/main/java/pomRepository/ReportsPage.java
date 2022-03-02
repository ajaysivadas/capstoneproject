package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/***
 * 
 * @author Ajay S
 *
 */
public class ReportsPage {
	public ReportsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='New Report']")private WebElement clickNewReport;
	
	@FindBy(xpath="//div[text()='Configure Report Parameters']") private WebElement clickOnConfigReport;
	
	@FindBy(xpath = "//span[@id='applyReportConfiguration']") private WebElement clickOnGenerateHTMLReport;
	
	@FindBy(xpath="//div[@class='addToDashboard']") private WebElement clickOnAddToDashboard;
	
	@FindBy(xpath="//span[text()='Save']") private WebElement clickOnSave;
	
	@FindBy(xpath="//input[@class='reportNameEdit inputFieldWithPlaceholder']") private WebElement inputTextField;
	
	@FindBy(linkText = "Reports Dashboard") private WebElement clickOnReportDashboard;
	
	@FindBy(xpath = "//span[text()='Create Chart']") private WebElement clickOnCreateChart;
	
	@FindBy(xpath = "//div[text()='Ajay S1233']/../../../..//td[@class='configHeaderRemoveCell']") private WebElement clickOnXButton;
	
	public WebElement getClickOnXButton() {
		return clickOnXButton;
	}
	public WebElement getClickOnCreateChart() {
		return clickOnCreateChart;
	}
	public WebElement getClickOnReportDashboard() {
		return clickOnReportDashboard;
	}
	public WebElement getInputTextField() {
		return inputTextField;
	}
	public WebElement getClickOnSave() {
		return clickOnSave;
	}
	public WebElement getClickOnAddToDashboard() {
		return clickOnAddToDashboard;
	}
	public WebElement getClickOnGenerateHTMLReport() {
		return clickOnGenerateHTMLReport;
	}
	public WebElement getClickOnConfigReport() {
		return clickOnConfigReport;
	}
	public WebElement getClickNewReport() {
		return clickNewReport;
		
	}
	
}
