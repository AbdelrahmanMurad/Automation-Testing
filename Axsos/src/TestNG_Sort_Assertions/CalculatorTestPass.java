package TestNG_Sort_Assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CalculatorTestPass extends Calculater{
	   @Test
	    public void testAddition() {
	        SoftAssert softassert = new SoftAssert();

	        // Get the actual result from addition method in Calculator class
	        int actualResult = addition(5, 6);

	        // Set an expected result
	        int expectedResult = 10;

			softassert.assertEquals(actualResult, expectedResult, "Values not matched");
	    }
}
