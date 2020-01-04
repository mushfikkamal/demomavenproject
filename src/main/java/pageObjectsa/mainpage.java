package pageObjectsa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class mainpage {
	
	public WebDriver driver;
	
	
	private By main=By.xpath("//*[@id=\"n-mainpage-description\"]/a");
	
	
	public WebElement getMain() {
		return driver.findElement(main);
		
	}
	
	
	
	
	

}
