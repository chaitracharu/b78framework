package Script;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import page.DemoPage;

public class Test1 extends BaseTest {
	@Test
	public void test1()
	{
		String un= Excel.getCellData(XL_PATH,"test1", 1, 0);
		Reporter.log(un,true);
		Reporter.log("Test1....",true);
		DemoPage d = new DemoPage(driver);
		d.setUsername(un);
		
		 
		
	}
	@Test
	public void test2()
	{
		
		Reporter.log("hi",true);
		
		
		 
		
	}
	
	

}
