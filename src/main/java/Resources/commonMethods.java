package Resources;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class commonMethods {

	public static void handleAssertion(String Actual, String Expected) {

		SoftAssert sa = new SoftAssert();

		String actualText = Actual;
		String expectedText = Expected;

		sa.assertEquals(actualText, expectedText);
		sa.assertAll();

	}
	
	
	public static void commonMethodForDropdown(List<WebElement> a,String text) {
		
		List<WebElement> Nations = a;

		for (WebElement SN : Nations) {
			if (SN.getText().equalsIgnoreCase(text)) {
				SN.click();
				break;
			}
	}

	}
}
