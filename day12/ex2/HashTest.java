import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;

import org.junit.Test;
//import newCLass;


public class HashTest {
	
	IntegerString is;


	@Before
	public void setup() {
		is = new IntegerString(10,10);
	}

	@Test
	public void testsConstructorCreatesEmptyArray() {
		int theSize = is.size();
		//newClass test = new newClass();
		assertEquals(theSize, 0);
		assertEquals(true, is.isEmpty());
		//assertEquals(1, 2);
		//assertEquals(1, 1);

//		assertEquals(theSize, 0);
//		System.out.println("Hello");
//		fail();
	}

	@Test
	public void testAddingOne() {
		is.put(0, "thestring");
		assertEquals(is.size(), 1);
		assertEquals(is.getSingleValue(0), "thestring");
	}

	@Test
	public void testCreateLargeList() {
		is = new IntegerString(10000, 1);
		for (int i = 0; i < 1000; i++ ) {
			is.put(i, ("" + i));
		}
		assertEquals(is.size(), 1000);
	}

}