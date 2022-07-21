package Care.Mavenjava;

import org.testng.annotations.Test;

public class SeleniumTest {
	
	
	//testng xml file from maven
	//how to execute all test cases from test folder - mvn test
	
	
	@Test
	public void BrowserAutomation() {
		
		System.out.println("BrowserAutomation");
		
	}
	@Test
	public void elementsUI() {
		
		System.out.println("elementsUI");
	}

}
//Test word is important in maven eg.seleniumTest,AppiumTest