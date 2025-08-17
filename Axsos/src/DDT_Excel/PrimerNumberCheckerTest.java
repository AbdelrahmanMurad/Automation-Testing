package DDT_Excel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.*;

public class PrimerNumberCheckerTest {

	PrimeNumberChecker checkPrime = new PrimeNumberChecker();

	final static String CSV_FILE = "src/resources/PrimeNumberTest.csv";
	final static String DELIMETER = ",";

	@Test(dataProvider = "prime")
	public void testPrime(String description, int number, boolean expectedResult) {
		boolean actualResult = checkPrime.isPrime(number);
		System.out.printf("%-40s %-15d %-20b %-20b%n", description, number, expectedResult, actualResult);
		Assert.assertEquals(expectedResult, actualResult, "Prime Operation FAILED !!");
	}

	@DataProvider(name = "prime")
	public Iterator<Object[]> testPrimeProvide() {
		try {
			Scanner scanner = new Scanner(new File(CSV_FILE)).useDelimiter(DELIMETER);
			if (scanner.hasNextLine()) {
				scanner.nextLine();
			}

			return new Iterator<Object[]>() {
				@Override
				public boolean hasNext() {
					return scanner.hasNextLine();
				}

				@Override
				public Object[] next() {
					// read columns
					String[] parts = scanner.nextLine().split(DELIMETER);
					String description = parts[0].trim();
//					System.out.println(description);
					int number = Integer.parseInt(parts[1].trim());
					boolean expectedResult = Boolean.parseBoolean(parts[2].trim());
					return new Object[] { description, number, expectedResult };
				}
			};
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}

	@BeforeClass
	public void organizeColumns() {

		// Make Table
		System.out.printf("%-40s %-15s %-20s %-20s%n", "Description", "Number", "Expected Result", "Actual Result");
		System.out.println(
				"---------------------------------------------------------------------------------------------");
		/*
		 * %-30s → left-align strings in a 30-character column.
		 * 
		 * %-15d → left-align integer in 15 characters.
		 * 
		 * %-20b → left-align boolean in 20 characters.
		 * 
		 * "%n" → system-independent newline (better than \n).
		 */
	}
}