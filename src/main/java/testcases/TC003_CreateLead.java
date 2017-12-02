package testcases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead  extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC003_CreateLead";
		testCaseName = "TC003_CreateLead";
		testDescription = "To Create a Lead";
		category= "Smoke";
		authors	="Imran";
		browserName ="chrome";
	}
	
	
	@Test(dataProvider="fetchData")
	public void createLead(String userName, String passWord,String cName,String fName,String lName) {
		
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCrmsfa()
		.clickLeads()
		.clickCreateLead()
		.enterCompName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.clickCreateLead()
		.VerifyCompany(cName);
			
	}

}

