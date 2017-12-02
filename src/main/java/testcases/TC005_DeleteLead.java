package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_DeleteLead extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC005_DeleteLead";
		testCaseName = "TC005_DeleteLead";
		testDescription = "To Delete a Lead";
		category= "Smoke";
		authors	="Dhanusha";
		browserName ="chrome";
	}
	@Test(dataProvider="fetchData")
	 public void DeleteLead(String userName,String passWord,String phno) throws InterruptedException 
	 {
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCrmsfa()
		.clickLeads()
		.clickFindLeads()
		.clickPhoneNum()
		.enterPhoneNum(phno)
		.clickFindLeadsButton()
		.captureFirstLeadId()
		.clickFirstId()
		.clickDelete()
		.clickFindLeads()
		.enterLeadId(firstResLeadid)
		.clickFindLeadsButton()
		.verifyErrorMsg();
		
		
		
	 }

}
