package TestNG_HWs;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

// username = admin
// password = password123

public class UserAuthenticationTest2 {

	UserAuthentication user = new UserAuthentication();

	@Test(dataProvider = "auth")
	public void testAuthenticate(String username, String password) {
		boolean expectedResult = user.authenticate(username, password);
		boolean actualResult = username.equals("admin") && password.equals("password123");
		
		Reporter.log("Test 2 for authentication");

		Assert.assertEquals(actualResult, expectedResult, "Authentication result mismatch!");
	}

	@DataProvider(name = "auth")
	public Object[][] providerAuthData() {
		return new Object[][] {

				// 1 Positive Case
				{ "admin", "password123" },

				// 4 Negative Cases
				{ "momen mushtaha", "passw" }, 
				{ "abood masood", "123pass" }, 
				{ "muhammed siam", "6678" },
				{ "ADMIN", "PASSWORD123" }, 
				
				// 7 Edge Cases
				{ "    ", "password123" }, 
				{ "admin", "           " },
				{ "admin$$$$", "Wrong User" },
				{ "admin", "password123@@@@" },
				{ "admin", "           Password123" },
				{ null, null }, // Remember: QA job is break the system to ensure from the quality. So, You will see if null will break it or not. (it should)
				{ null, "" }
		};
	}
	/* Remeber:
	 * 		expected: true, actual: true => pass 
	 * 		expected: false, actual: false => pass
	 * 		expected: false, actual: true => fail 
	 * 		expected: true, actual: false => fail
	 * 	if one of them is difference from the other => fail test case
	 */
}