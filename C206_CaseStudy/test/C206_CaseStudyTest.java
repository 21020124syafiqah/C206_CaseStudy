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
		S1 = new Stall("Western cuisine","S1", "17-09-2022");
		S2 = new Stall("Japanese cuisine","S2", "26-08-2022");
		S3 = new Stall("Chinese cuisine","S3", "09-08-2022");
		
		stallList = new ArrayList<Stall>();
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
		
		
	}

}
