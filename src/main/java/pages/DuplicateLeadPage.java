package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class DuplicateLeadPage extends ProjectMethods{

	public DuplicateLeadPage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompanyName;
	public  DuplicateLeadPage enterCompanyName(String data) {
		type(eleCompanyName, data);
		return this;
	}

	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleCreateLeadButton;
	public  ViewLeadPage clickCreateLead() {
		click(eleCreateLeadButton);
		return new ViewLeadPage();
	}
	
	public DuplicateLeadPage verifyPageTitle(String data)
	{
		verifyTitle(data);
		return this;
	}
	

}
