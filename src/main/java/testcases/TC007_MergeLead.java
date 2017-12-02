package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ViewLead;
import wdMethods.ProjectMethods;

public class TC007_MergeLead extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC007_MergeLead";
		testCaseName = "TC007_MergeLead";
		testDescription = "To Merge Lead";
		category= "Smoke";
		authors	="Dhanusha";
		browserName ="chrome";
	}
	@Test(dataProvider="fetchData")
	 public void MergeLead(String userName,String passWord,String fromLeadId,String toLeadId) throws InterruptedException 
	 {
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCrmsfa()
		.clickLeads()
		.clickMergeLeads()
		.clickFromLeadIcon()
		.enterFromLeadId(fromLeadId)
		.clickFindLead()
		.captureFirstResName()
		.clickFirstFromId()
		.clickToLeadIcon()
		.enterToLeadId(toLeadId)
		.clickFindLead()
		.clickFirstToId()
		.clickMerge();
		new ViewLead(driver,test)
		.clickFindLead()
		.enterLeadId(MergeFromLeadId)
		.clickFindLeadsButton()
		.verifyErrorMsg();
}
}