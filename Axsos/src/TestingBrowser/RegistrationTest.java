package TestingBrowser;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegistrationTest {
	@BeforeClass
	public void beforeClass() {
		System.out.println("Open Chrome");
	}

	@Test
	public static void testSuccessfulRegistration() {
		System.out.println("Successful Registration");
	}

	@Test
	public static void testInvalidRegistration() {
		System.out.println("Unsuccessful Registration");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Close Chrome");
	}
}
