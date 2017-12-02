package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_EditLead extends ProjectMethods {
	@BeforeClass
	public void setData() {
		dataSheetName = "TC004_EditLead";
		testCaseName = "TC004_EditLead";
		testDescription = "To Edit a Lead";
		category= "Smoke";
		authors	="Dhanusha";
		browserName ="chrome";
	}
	@Test(dataProvider="fetchData")
	 public void EditLead(String userName,String passWord,String fname,String cname) throws InterruptedException 
	 {
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCrmsfa()
		.clickLeads()
		.clickFindLeads()
		.enterfname(fname)	
		.clickFindLeadsButton()
		.clickFirstId()
		.clickEditLead()
		.changeCname(cname)
		.clickUpdate()
		.VerifyCompany(cname)
		.verifyTitle("View Lead | opentaps CRM");
		}
	 

}
