package TestNG_Parameters;

import org.testng.annotations.*;

public class LoginTestDDT {
	@Test(dataProvider = "loginData")
	public void loginTest(String username, String password) {
		System.out.println("Attempting login with username: " + username + " and password: " + password);
		// Perform login logic here
	}

	@DataProvider(name = "loginData")
	public Object[][] provideLoginData() {
		return new Object[][] { { "Murad", "      " }, // should fail in real projects
				{ "user2", "MyPassIs  Strong @11" }, // should passin real projects
				{ "us@#%$#er3", "password3" }, // should fail in real projects
				// Add more test data as needed
		};
	}
}
