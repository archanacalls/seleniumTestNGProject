package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPageObjects {

	public WebDriver driver;
	private By username = By.xpath("//input[@name=\"username\"]");
	private By password = By.xpath("//input[@type=\"password\"]");
	private By loginbutton = By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]");
	private By invalidloginmsg = By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']");

	public loginPageObjects(WebDriver driver2) {
		this.driver = driver2;
	}

	public WebElement enterusername() {
		return driver.findElement(username);
	}

	public WebElement enteruserpassword() {
		return driver.findElement(password);
	}

	public WebElement pressloginbutton() {
		return driver.findElement(loginbutton);
	}

	public WebElement invalidmsg() {
		return driver.findElement(invalidloginmsg);
	}

}
