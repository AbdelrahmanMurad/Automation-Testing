package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeSuite;

public class NewTest {

	@Test
	public void f() {
		System.out.println("Test1");
	}

	@Test
	public void f2() {
		System.out.println("Test2");
	}

	@Test
	public void f3() {
		System.out.println("Test3");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");

	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}

}
