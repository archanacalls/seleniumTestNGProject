package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Resources.BaseClass;
import Resources.commonMethods;
import pageObjectModel.loginPageObjects;

public class login extends BaseClass{
	@Test
	
	public void verifyValidLogin() throws IOException, InterruptedException {
		intializeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		loginPageObjects lpo=new loginPageObjects(driver);
		Thread.sleep(2000);
		lpo.enterusername().sendKeys("Admin");
		lpo.enteruserpassword().sendKeys("admin123");
		lpo.pressloginbutton().click();
		
		commonMethods.handleAssertion(3"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index",driver.getCurrentUrl());
		
			}

}
