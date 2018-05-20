package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class MergeLeadPage extends ProjectMethods{

	public MergeLeadPage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.XPATH,using="(//img[@alt=\"Lookup\"])[1]")
	private WebElement eleClickOnFromLead;
	public  FindLeadsOfMergeLeadPage clickFromLead() {
		click(eleClickOnFromLead);
		switchToWindow(1);
		return new FindLeadsOfMergeLeadPage();
		
	}
	
	@FindBy(how=How.XPATH,using="(//img[@alt=\"Lookup\"])[2]")
	private WebElement eleClickOnToLead;
	public  FindLeadsOfMergeLeadPage clickToLead() {
		click(eleClickOnToLead);
		switchToWindow(1);
		return new FindLeadsOfMergeLeadPage();
	}
	
	@FindBy(how=How.XPATH,using="//a[text()='Merge']")
	private WebElement eleClickMerge;
	public  ViewLeadPage clickMerge() {
		click(eleClickMerge);
		acceptAlert();
		return new ViewLeadPage();
	}
	
	

}
