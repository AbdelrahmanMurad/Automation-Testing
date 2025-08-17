package DDT_Excel;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PrimeNumberChecker {

	public boolean isPrime(int number) {
		if (number <= 1) {
//			System.out.println("Not Prime");
			return false;
		}
		
		if (number == 2) {
//			System.out.println("Not Prime");
			return true;
		}
 
		for (int index = 3; index < number; index+=2) {			
			if (number % index == 0) {
//				System.out.println("Not Prime");
				return false;
			}
		}
//		System.out.println("Prime");
		return true;
	}
	}

/*
 
	public boolean isPrime(int number) {
		if (number <= 1) {
//			System.out.println("Not Prime");
			return false;
		}
		
		if (number == 2) {
//			System.out.println("Not Prime");
			return false;
		}

		// dont enclude evene numbers
		for (int index = 3; index < number; index+=2) {			
			if (number % index == 0) {
//				System.out.println("Not Prime");
				return false;
			}
		}
//		System.out.println("Prime");
		return true;
	}


*/