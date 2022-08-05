import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	private Stall S1;
	private Stall S2;
	private Stall S3;
	
	private ArrayList<Stall> stallList;
	
	ArrayList<OrderClass> orderList;
	
	private OrderClass OC1;
	private OrderClass OC2;
	private OrderClass OC3;
	
	private FoodMenu F1;
	private FoodMenu F2;
	private FoodMenu F3;
	
	private ArrayList<FoodMenu> menuList;


	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
		
	}
	
	@Before
	public void setUp() throws Exception {
		// prepares test data
		S1 = new Stall("Western cuisine","S1", "17-09-2022");
		S2 = new Stall("Japanese cuisine","S2", "26-08-2022");
		S3 = new Stall("Chinese cuisine","S3", "09-08-2022");
		
		stallList = new ArrayList<Stall>();
		
		F1 = new FoodMenu("Fried Chicken", 6);
		F2 = new FoodMenu("Tonkotsu Ramen", 5);
		F3 = new FoodMenu("Dumplings", 4);
		
		menuList = new ArrayList<FoodMenu>();
		
		OC1 = new OrderClass("S101","Sushi","Japanese Food Stall",5.00);
		OC2 = new OrderClass("S102","Chicken rice", "Chinese Food Stall", 3.50);
		OC3 = new OrderClass("S103","Butter Naan", "Indian Food Stall", 3.00);
		
		orderList = new ArrayList<OrderClass>();
		
	}
	
	@Test
	public void testAddStall() {
		assertNotNull("Check if there is a valid Stall arraylist to add to", stallList);
		
		C206_CaseStudy.addStall(stallList, S1);
		assertEquals("Check that Stall arraylist size is 1", 1, stallList.size());
		assertSame("Check that Stall is added", S1, stallList.get(0));
		
		C206_CaseStudy.addStall(stallList, S2);
		assertEquals("Check that Stall arraylist size is 2", 2, stallList.size());
		assertSame("Check that Stall is added", S2, stallList.get(1));
		
		C206_CaseStudy.addStall(stallList, S3);
		assertEquals("Check that Stall arraylist size is 3", 3, stallList.size());
		assertSame("Check that Stall is added", S3, stallList.get(2));
	}
	
	@Test
	public void testViewStall() {
		assertNotNull("Check if there is a valid Stall arraylist to retrieve from", stallList);
		
		String allStalls = C206_CaseStudy.retrieveAllStalls(stallList);
		String testOutput = "";
		assertEquals("Check that viewAllStallsList", testOutput, allStalls);
		
		C206_CaseStudy.addStall(stallList, S1);
		C206_CaseStudy.addStall(stallList, S2);
		C206_CaseStudy.addStall(stallList, S3);
		assertEquals("Check that Stall arraylist size is 3", 3, stallList.size());
		
		allStalls = C206_CaseStudy.retrieveAllStalls(stallList);
		testOutput = String.format("%-30s %-10s %-20s\n", "Western cuisine","S1", "17-09-2022");
		testOutput += String.format("%-30s %-10s %-20s\n", "Japanese cuisine","S2", "26-08-2022");
		testOutput += String.format("%-30s %-10s %-20s\n", "Chinese cuisine","S3", "09-08-2022");
		
		assertEquals("Test that viewAllStallsList", testOutput, allStalls);
	}
	
	@Test
	public void testDeleteStall() {
		assertNotNull("Check if there is a valid Stall arraylist to delete from", stallList);
		String allStalls = C206_CaseStudy.retrieveAllStalls(stallList);
		
		boolean ok = C206_CaseStudy.deleteStalls(stallList, "S1");
		assertTrue("Test if stall can be deleted?", ok);
		
		ok = C206_CaseStudy.deleteStalls(stallList, "S32");
		assertFalse("Test that non-existing stall cannot be deleted?", ok);	
	}
	
	@Test 
	public void testViewFoodMenu() {
		assertNotNull("Test if there is valid FoodMenu arraylist to view from", menuList);
		
		// test if the list of FoodMenu retrieved is empty
		String allMenuItem = C206_CaseStudy.retrieveAllMenu(menuList);
		String testOutput = "";
		assertEquals("Check that viewFoodMenu", testOutput, allMenuItem);
		
		// after adding 3 items to an empty list, test if the size of the list is 3
		C206_CaseStudy.addToFoodMenu(menuList, F1);
		C206_CaseStudy.addToFoodMenu(menuList, F2);
		C206_CaseStudy.addToFoodMenu(menuList, F3);
		assertEquals("Test if the size of the FoodMenu arraylist is 3?", 3, menuList.size());
		
		// test whether the expected output is the same as the list of FoodMenu retrieved 
		allMenuItem = C206_CaseStudy.retrieveAllMenu(menuList);
		
		testOutput = String.format("%-20s $%-5d\n", "Fried Chicken", 6);
		testOutput += String.format("%-20s $%-5d\n", "Tonkotsu Ramen", 5);
		testOutput += String.format("%-20s $%-5d\n", "Dumplings", 4);
		
		assertEquals("Check that viewFoodMenu", testOutput.toUpperCase(), allMenuItem);
	}
	
	
	@Test
	public void testAddOrder() {
		assertNotNull("Check if there is a valid OrderClass arraylist to add to", orderList);
		
		C206_CaseStudy.addOrders(orderList, OC1);
		assertEquals("Check that OrderClass arraylist size is 1", 1, orderList.size());
		assertSame("Check that OrderClass is added", OC1, orderList.get(0));
		
		C206_CaseStudy.addOrders(orderList, OC2);
		assertEquals("Check that OrderClass arraylist size is 2", 2, orderList.size());
		assertSame("Check that OrderClass is added", OC2, orderList.get(1));
		 
		C206_CaseStudy.addOrders(orderList, OC3);
		assertEquals("Check that OrderClass arraylist size is 3", 3, orderList.size());
		assertSame("Check that OrderClass is added", OC3, orderList.get(2));
	}
	
	@Test 
	public void testviewAllOrder() {
		assertNotNull("Test if there is valid OrderClass arraylist to view from", orderList);
		String allOrders = C206_CaseStudy.retrieveAllOrders(orderList);
		
		
	}

}
