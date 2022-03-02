package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/***
 * 
 * @author Ajay S
 *
 */
public class CreateChartPage {
	public CreateChartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//div[text()='Add to Dashboard']") private WebElement clickOnAddToDashBoard;

	@FindBy(xpath = "//input[@class='reportNameEdit inputFieldWithPlaceholder']")private WebElement inputChartName;

	@FindBy(xpath = "//span[text()='Save']")private WebElement clickOnSave;

	@FindBy(xpath ="//span[@id='ext-gen360']" ) private WebElement clickOnCurrentMonth;

	@FindBy(id = "chartShowPercentsCheckbox") private WebElement clickOnShowPercentage;

	@FindBy(xpath="//span[text()='Export to PDF']") private WebElement clickOnExportToPDF;

	@FindBy(xpath="//span[text()='Download PDF']") private WebElement clickOnDownloadPDF;

	public WebElement getClickOnDownloadPDF() {
		return clickOnDownloadPDF;
	}
	public WebElement getClickOnExportToPDF() {
		return clickOnExportToPDF;
	}
	public WebElement getClickOnCurrentMonth() {
		return clickOnCurrentMonth;
	}
	public WebElement getClickOnShowPercentage() {
		return clickOnShowPercentage;
	}
	public WebElement getClickOnAddToDashBoard() {
		return clickOnAddToDashBoard;
	}
	public WebElement getInputChartName() {
		return inputChartName;
	}

	public WebElement getClickOnSave() {
		return clickOnSave;
	}

}

