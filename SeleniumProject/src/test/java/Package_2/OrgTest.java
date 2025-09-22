package Package_2;

import org.testng.annotations.Test;

public class OrgTest {

	@Test(groups = {"regressionTest","smokeTest"})
	public void createOrgTest() {
		System.out.println("Execute createOrgTest");
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
	public void modifyOrgTest() {
		System.out.println("Execute modifyOrgTest");
	}
}
