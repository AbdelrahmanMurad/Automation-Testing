package TestNG_Sort_Assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CalculatorTest_Multiple extends Calculater {
	@Test
	public void testAddition() {
		SoftAssert softassert = new SoftAssert();

		// Get the actual result from addition method in Calculator class
		int actualResult = addition(5, 6);

		softassert.assertEquals(actualResult, 9, "First assertion failed");
		softassert.assertEquals(actualResult, 8, "Second assertion failed");

		softassert.assertAll();
	}
}
