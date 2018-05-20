package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{

	public CreateLeadPage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompanyName;
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstName;
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastName;
	
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleCreateLeadButton;
	
	
	@And("Enter company Name as (.*)")
	public  CreateLeadPage enterCompanyName(String data) {
		type(eleCompanyName, data);
		return this;
	}
	@And("Enter First name as (.*)")
	public  CreateLeadPage enterFirstName(String data) {
		type(eleFirstName, data);
		return this;
	}
	@And("Enter Last Name as (.*)")
	public  CreateLeadPage enterLastName(String data) {
		type(eleLastName, data);
		return this;
	}
	@And("Click Create1")
	public  ViewLeadPage clickCreateLead() {
		click(eleCreateLeadButton);
		return new ViewLeadPage();
	}
	@And("Create lead success")
	public void createLeadSuccess()
	{
		System.out.println("Create lead Successful");
	}
	

}
