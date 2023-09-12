package Resources;

import org.testng.asserts.SoftAssert;

public class commonMethods {
	
	public static void handleAssertion(String Actual,String Expected) {
	
SoftAssert sa=new  SoftAssert();
		

        String actualText= Actual;
		String expectedText = Expected;
		
		
		sa.assertEquals(actualText, expectedText);
		sa.assertAll();
		
		
		
	}

}
