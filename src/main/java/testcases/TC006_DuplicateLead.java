package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC006_DuplicateLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC006_DuplicateLead";
		testDescription="Duplicate Lead";
		testNodes="Leads";
		category="Smoke_DuplicateLead";
		authors="Amirtha";
		browserName="chrome";
		dataSheetName="TC006";
	}
	@Test(dataProvider="fetchData")
	public void duplicateLead(String uName,String pwd,String fName,String title,String cName) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLead()
		.enterFirstName(fName)
		.clickOnFindLead()
		.clickOnFirstCell()
		.clickDuplicate()
		.verifyPageTitle(title)
		.enterCompanyName(cName)
		.clickCreateLead();
	}

}
