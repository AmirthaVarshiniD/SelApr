package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FindLeadPage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_DeleteLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC005_DeleteLead";
		testDescription="Delete Existing lead";
		testNodes="Leads";
		category="Smoke_DeleteLead";
		authors="Amirtha";
		browserName="chrome";
		dataSheetName="TC005";
	}
	@Test(dataProvider="fetchData")
	public void deleteLead(String uName,String pwd,String fName,String noRecords) {


		FindLeadPage flp = new LoginPage()
				.enterUserName(uName)
				.enterPassword(pwd)
				.clickLogIn()
				.clickCRMSFA()
				.clickLeads()
				.clickFindLead()
				.enterFirstName(fName)
				.clickOnFindLead();
		String firstResLead = flp.captureLeadId();
		flp.clickOnFirstCell()
		.clickDelete()
		.clickFindLead()
		.sendDeletedID(firstResLead)
		.clickOnFindLead()
		.verifyDeletedID(noRecords);

	}

}
