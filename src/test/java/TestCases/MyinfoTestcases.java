package TestCases;

import java.awt.Window;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Resources.BaseClass;
import Resources.commonMethods;
import pageObjectModel.MyinfoPageObjects;
import pageObjectModel.loginPageObjects;

public class MyinfoTestcases extends BaseClass {

	@Test
	public void Myinfoinformation() throws InterruptedException, IOException {
		intializeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		loginPageObjects lpo = new loginPageObjects(driver);
		Thread.sleep(2000);
		lpo.enterusername().sendKeys("Admin");
		lpo.enteruserpassword().sendKeys("admin123");
		lpo.pressloginbutton().click();

		MyinfoPageObjects mit = new MyinfoPageObjects(driver);

		Thread.sleep(2000);
		mit.clickonmyinfo().click();
		Thread.sleep(2000);
		mit.putfirstname().sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		mit.putfirstname().sendKeys("Raghav");
		mit.putmiddlename().sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		mit.putmiddlename().sendKeys("Ram");
		mit.putlastname().sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		mit.putlastname().sendKeys("Charan");
		mit.putnickname().sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Thread.sleep(2000);
		mit.putnickname().sendKeys("Aashu");
		mit.putemployeeId().sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		mit.putemployeeId().sendKeys("H2323");
		mit.putotherID().sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		mit.putotherID().sendKeys("4444");
		mit.putDriverLicencenumber().sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		mit.putDriverLicencenumber().sendKeys("343");
		Thread.sleep(2000);
		mit.putSSNnumber().sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		mit.putSSNnumber().sendKeys("333");
		Thread.sleep(3000);
		mit.putSINnumber().sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		mit.putSINnumber().sendKeys("888");

		mit.clickonnationality().click();
		Thread.sleep(2000);

		commonMethods.commonMethodForDropdown(mit.Nationslist(), "British");

		mit.Mariatalstatusarrow().click();
		Thread.sleep(2000);
		mit.Mstatus().click();
	}
}
