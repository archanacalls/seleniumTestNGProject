package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	  public WebDriver driver;
	public void intializeDriver() throws IOException {
		FileInputStream  fis = new FileInputStream("C:\\Users\\lenovo\\eclipse-workspace\\FrameWork\\src\\main\\java\\Resources\\data.properties");
	Properties prop =new Properties();
	
	prop.load(fis); 
	String browsername=prop.getProperty("browser");
	
	if(browsername.equalsIgnoreCase("chrome")) {
		 driver=new ChromeDriver();
		}
	else if(browsername.equalsIgnoreCase("Firefox")) {
		 driver=new FirefoxDriver();
	}
	else if(browsername.equalsIgnoreCase("edge")) {
		 driver = new EdgeDriver();
		
	}
	else
	{
		System.out.println("Enter valid browsername");
	}
	}
}
