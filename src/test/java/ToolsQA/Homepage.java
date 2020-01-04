package ToolsQA;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjectsa.mainpage;
import resource.base;

public class Homepage extends base{
	


	@Test
	public void clickmain () throws IOException {
		
		driver=init();
		
		driver.get("https://www.amazon.com/");
		
	}
	
	@Test
	public void clicking() {
		
		mainpage m=new mainpage();
		m.getMain().click();
	
	}
	
	@Test(dataProvider="getdata")
	public void parameter(String username, String password, String text) {
		
			
		
	}
	
	@AfterTest
	public void teardown() {
		
		driver.manage().deleteAllCookies();
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	

	@DataProvider
	public Object[][] getdata() {
		
		Object[][] data=new Object[2][3];
		
				data[0][0]="jjkj";
				data[0][1]="hlkfhsdjkl";
				data[0][2]="hkfhsdjkl";
						
				data[1][0]="hlkfsdjkfhsdjkl";
				data[1][1]="hlkfsdjkfhsdjkl";
				data[1][2]="hlkfsdjkfhsdjkl";
				
				return data;
	

	}
	
	
	
}
