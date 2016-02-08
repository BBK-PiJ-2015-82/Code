import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.Before;


public class CalculatorTest {
	
	Calculator cal;
	
	@Before
	public void SetUp(){
		cal = new Calculator();
	}
	
	@Test
	public void test1() {
		assertEquals("pass", 2, cal.add(1,1));		
		assertEquals("fail", 3, cal.add(1,1));
	}

}