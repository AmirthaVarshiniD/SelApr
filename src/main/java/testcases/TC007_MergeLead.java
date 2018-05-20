package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC007_MergeLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC007_MergeLead";
		testDescription="Merge Lead";
		testNodes="Leads";
		category="Smoke_MergeLead";
		authors="Amirtha";
		browserName="chrome";
		dataSheetName="TC007";
	}
	@Test(dataProvider="fetchData")
	public void mergeLead(String uName,String pwd,String fromLead,String toLead) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickMergeLead()
		.clickFromLead()
		.enterFromLead(fromLead)
		.clickOnFindLead()
		.clickOnFromLeadFirstCell()
		.clickToLead()
		.enterToLead(toLead)
		.clickOnFindLead()
		.clickOnToLeadFirstCell()
		.clickMerge();
	}

}
