package TestNG_HWs;

import org.testng.annotations.*;

public class TestNG_Annotations {

	@BeforeTest
	public void beforeTest() {
		System.out.println("before test");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("before class");
	}

	@Test
	public void test() {
		System.out.println("test");
	}

	@Test(dependsOnMethods = { "test" })
	public void afterTest() {
		System.out.println("after test");
	}

	@Test(dependsOnMethods = { "afterTest" })
	public void afterClass() {
		System.out.println("after class");
	}
}

/*
 * import org.testng.annotations.Test;
 * 
 * public class TestNG_Annotations {
 * 
 * @Test(priority = 1) public void beforeTest() {
 * System.out.println("before test"); }
 * 
 * @Test(priority = 2) public void beforeClass() {
 * System.out.println("before class"); }
 * 
 * @Test(priority = 3) public void test() { System.out.println("test"); }
 * 
 * @Test(priority = 4) public void afterTest() {
 * System.out.println("after test"); }
 * 
 * @Test(priority = 5) public void afterClass() {
 * System.out.println("after class"); } }
 * 
 */


/*
 * @Test(priority = 1) public void beforeTest() {
 * System.out.println("before test"); }
 * 
 * @Test(priority = 2) public void beforeClass() {
 * System.out.println("before class"); }
 * 
 * @Test(priority = 3) public void test() { System.out.println("test"); }
 * 
 * @Test(priority = 4) public void afterTest() {
 * System.out.println("after test"); }
 * 
 * @Test(priority = 5) public void afterClass() {
 * System.out.println("after class"); }
 */