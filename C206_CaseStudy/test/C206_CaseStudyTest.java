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

	@Before
	public void setUp() throws Exception {
		S1 = new Stall("Western cuisine","S1", "17-09-2022");
		S2 = new Stall("Japanese cuisine","S2", "26-08-2022");
		S3 = new Stall("Chinese cuisine","S3", "09-08-2022");
		
		stallList = new ArrayList<Stall>();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}
	
	public void testAddStall() {
	}
	
	public void testViewStall() {
		
	}
	
	public void testDeleteStall() {
		
	}

}
