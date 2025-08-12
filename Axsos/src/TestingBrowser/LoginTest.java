package TestingBrowser;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {

    @BeforeClass
    public void beforeClass() {
        System.out.println("Open Chrome");
    }

    @Test
    public static void testSuccessfulLogin() {
        System.out.println("Successful Login");
    }

    @Test
    public static void testInvalidLogin() {
        System.out.println("Unsuccessful Login");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Close Chrome");
    }
}
