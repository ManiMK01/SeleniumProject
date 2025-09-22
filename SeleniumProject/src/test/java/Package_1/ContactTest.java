package Package_1;

import org.testng.annotations.Test;

import GenericUtility.BaseClass;

public class ContactTest extends BaseClass {
	@Test(groups = {"regressionTest","smokeTest"})
	public void createContactTest() {
		System.out.println("Execute createContactTest");
		
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		String USERNAME = System.getProperty("username");
		String PASSWORD = System.getProperty("password");
		
		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		
	}
	
	@Test(groups = {"regressionTest","smokeTest"})
	public void modifyContactTest() {
		System.out.println("Execute modifyContactTest");
	}
	
	@Test(groups = "regressionTest")
	public void deleteContactTest() {
		System.out.println("Execute DeleteContact");
	}
	@Test(groups = "regressionTest")
	public void newContactTest() {
		System.out.println("Execute newContact");
	}
}
