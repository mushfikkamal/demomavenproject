package resource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	
	
	public WebDriver driver;
	Properties prop;

	public WebDriver init() throws IOException {
		
		 prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\I-Phone\\DemoMavenProject\\src\\main\\java\\resource\\data.properties");
		prop.load(fis);		
		String browsername=prop.getProperty("chrome");
		
		if (browsername.contains("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\kamal\\Downloads\\seleneum\\downloads\\chromedriver79\\chromedriver_win32\\chromedriver.exe");
			 driver=new ChromeDriver();
		}
		
		else if (browsername.contains("firefox")) {
			System.setProperty("", "");
			driver=new FirefoxDriver();
			}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		return driver;
	}
	
	
	
	
	
	
	
	
	
	

}
