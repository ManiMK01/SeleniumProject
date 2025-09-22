package GenericUtility;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	@BeforeSuite(groups = {"regressionTest","smokeTest"})
	public void configBS() {
		System.out.println("Before Suite");
	}
	
	@AfterSuite(groups = {"regressionTest","smokeTest"})
	public void configAS() {
		System.out.println("After Suite");
	}
	
	@BeforeTest(groups = {"regressionTest","smokeTest"})
	public void configBT() {
		System.out.println("Before Test");
	}
	
	@AfterTest(groups = {"regressionTest","smokeTest"})
	public void configAT() {
		System.out.println("Before Test");
	}
	
	@BeforeClass(groups = {"regressionTest","smokeTest"})
	public void configBC() {
		System.out.println("Before Class");
	}
	
	@AfterClass(groups = {"regressionTest","smokeTest"})
	public void configAC() {
		System.out.println("Before Class");
	}
	
	@BeforeMethod(groups = {"regressionTest","smokeTest"})
	public void configBM() {
		System.out.println("Before Method");
	}
	
	@AfterMethod(groups = {"regressionTest","smokeTest"})
	public void configAM() {
		System.out.println("Before Method");
	}
	
}
