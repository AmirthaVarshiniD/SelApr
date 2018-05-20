package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class FindLeadsOfMergeLeadPage extends ProjectMethods{

	public FindLeadsOfMergeLeadPage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.XPATH,using="//label[text()='Lead ID:']/following::input[1]")
	private WebElement eleFromLeadID;
	public  FindLeadsOfMergeLeadPage enterFromLead(String data) {
		type(eleFromLeadID, data);
		return this;
	}

	@FindBy(how=How.XPATH,using = "//button[text()='Find Leads']")
	private WebElement eleFindButton;
	public  FindLeadsOfMergeLeadPage clickOnFindLead() {
		click(eleFindButton);
		return this;
	}
	
	@FindBy(how=How.XPATH,using = "((//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])/a)[1]")
	private WebElement eleFromLeadFirstCell;
	public  MergeLeadPage clickOnFromLeadFirstCell() {
		click(eleFromLeadFirstCell);
		switchToWindow(0);
		return new MergeLeadPage();
	}
	
	@FindBy(how=How.XPATH,using="//label[text()='Lead ID:']/following::input[2]")
	private WebElement eleToLeadFirstName;
	public  FindLeadsOfMergeLeadPage enterToLead(String data) {
		type(eleToLeadFirstName, data);
		return this;
	}

	@FindBy(how=How.XPATH,using = "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")
	private WebElement eleToLeadFirstCell;
	public  MergeLeadPage clickOnToLeadFirstCell() {
		click(eleToLeadFirstCell);
		switchToWindow(0);
		return new MergeLeadPage();
	}
	


}
