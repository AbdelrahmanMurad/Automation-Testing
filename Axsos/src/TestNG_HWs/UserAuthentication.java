package TestNG_HWs;

public class UserAuthentication {

	public boolean authenticate(String username, String password) {
		// Dummy authentication logic
		if (username.equals("admin") && password.equals("password123")) {
			return true;
		} else {
			return false;
		}
	}
}