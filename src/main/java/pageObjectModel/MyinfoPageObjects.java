package pageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyinfoPageObjects {
public WebDriver driver;
 
 private By mInfo = By.xpath("//span[normalize-space()='My Info']");
 private By firstname= By.xpath("//input[@name=\"firstName\"]");
 private By middlename= By.xpath("//input[@name=\"middleName\"]");
 private By lastname= By.xpath("//input[@name=\"lastName\"]");
private By nickname=By.xpath("//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//div[1]//div[2]//div[1]//div[1]//div[2]//input[1]"); 
private By EmployeeId=By.xpath("//div[@class='orangehrm-edit-employee-content']//div[2]//div[1]//div[1]//div[1]//div[2]//input[1]");
private By OtherID=By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[4]");
private By DriverLicencenumber=By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[5]");
private By SSNnumber=By.xpath("(//label[@class='oxd-label'])[6]");
private By SINnumber=By.xpath("(//label[@class='oxd-label'])[7]");

private By nationalitydropdown=By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]");
private By nationalityoption=By.xpath("//div[@class='oxd-select-option']");////div[@class='oxd-select-text-input']


private By maritialstatusarrow=By.xpath("https://www.youtube.com/watch?v=WHoDJaUfJxw");
private By maritialstatus=By.xpath("(//div[@class='oxd-select-option'])[1]");





public MyinfoPageObjects(WebDriver driver2) {
	this.driver=driver2;
}
//click on myinfo tab
public WebElement clickonmyinfo() {
return driver.findElement(mInfo);
}

//to write firstname
public WebElement putfirstname() {
return driver.findElement(firstname);
	}
//to write middlename
public WebElement putmiddlename() {
return driver.findElement(middlename);
	}

//to write lastname
public WebElement putlastname() {
return driver.findElement(lastname);
	}

//to write nickname 

public WebElement putnickname() {
	return driver.findElement(nickname);
}

//to write EmployeeId

public WebElement putemployeeId() {
	return driver.findElement(EmployeeId);
	}

//to write other Id
public WebElement putotherID() {
	return driver.findElement(OtherID);
}
//to write drivers licence number 
public WebElement putDriverLicencenumber() {
	return driver.findElement(DriverLicencenumber);
}

//to write SSN Number
public WebElement putSSNnumber() {
	return driver.findElement(SSNnumber);
}

//to write SINnumber
public WebElement putSINnumber() {
	return driver.findElement(SINnumber);
}

//to click on dropdown button of nationality
public WebElement clickonnationality() {
	
	return driver.findElement(nationalitydropdown);
	
}

public List<WebElement> Nationslist(){
	return driver.findElements(nationalityoption);
}

public WebElement Mariatalstatusarrow() {
	return driver.findElement(maritialstatusarrow) ;
}

public WebElement Mstatus() {
	return driver.findElement(maritialstatus);
}

}


