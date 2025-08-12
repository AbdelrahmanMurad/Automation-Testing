package TestNG_Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTestPass extends Calculator{
    @Test
    public void testAddition() {
        // Get the actual result from addition method in Calculator class
        int actualResult = addition(5, 6);

        // Set an expected result
        int expectedResult = 11;

        // Assert actual and expected results
        Assert.assertEquals(actualResult, expectedResult, "There is an issue in addition");
    }
}
