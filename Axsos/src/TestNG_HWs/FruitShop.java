package TestNG_HWs;

import java.util.ArrayList;
import org.testng.Assert;
import org.testng.annotations.*;

public class FruitShop {

	ArrayList<String> fruits = new ArrayList<>();

	@BeforeClass
	public void addItems() {
		fruits.add("Oranges");
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Strawberry");
		System.out.println("Add Items To The Cart");
	}
	
	@Test(priority = 1)
	public void cartLength() {
		Assert.assertEquals(fruits.size(), 4, "Result doesn't match");
		System.out.println("Cart Length Is 4");
	}
	
	@Test(priority = 3)
	public void secondItem() {
		Assert.assertEquals(fruits.get(1), "Banana", "Result doesn't match");
		System.out.println("Second Item Is Banana");
	}
	
	@Test(priority = 2)
	public void noPineapple() {
		for (String fruit : fruits) {
			Assert.assertNotEquals(fruit.toLowerCase(), "pineapple", "Pineapple should not be in the cart");
		}
		System.out.println("No Pineapple In The Cart");
	}
	
	@Test(priority = 4)
	public void addingMango() {
		fruits.add("Mango");
		Assert.assertEquals(fruits.size(), 5, "Result doesn't match");
		System.out.println("Adding Mango To Cart");
	}
	
	@BeforeSuite
	public void welcome() {
		System.out.println("Welcome to the fruit shop");
	}
	
	@AfterSuite
	public void bye() {
		System.out.println("Goodbye and see you later");
	}
}