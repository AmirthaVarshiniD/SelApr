package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class EditLeadPage extends ProjectMethods{

	public EditLeadPage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.XPATH,using="//input[@id='updateLeadForm_companyName']")
	private WebElement eleCompanyName;





	public  EditLeadPage enterCompanyName(String data) {
		type(eleCompanyName, data);
		return this;
	}

	@FindBy(how=How.XPATH,using = "//input[@class='smallSubmit']")
	private WebElement eleUpdateButton;

	public  ViewLeadPage clickOnUpdate() {
		click(eleUpdateButton);
		return new ViewLeadPage();
	}


}
