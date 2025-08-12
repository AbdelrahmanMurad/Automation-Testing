package TestNG_Parameters;

import org.testng.annotations.*;

public class ParameterizedTest {

	@Test()
	@Parameters("myName")
	public void parameterTest(String myName) {
		System.out.println("Parameterized value is : " + myName);
	}
}
