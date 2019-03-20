package Calculator;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author charitha
 * 
 */

public class calc_test {
	Calc cal=new Calc();
	@Test
	public void test()
	{
		Calc obj=new Calc();
	    assertEquals(100,obj.add(55, 45));
	    assertEquals(6,obj.add(7,-1));
	    assertEquals(100,obj.multiply(10,10));
	    assertEquals(21,obj.multiply(7,3));
	    assertEquals(4,obj.divide(16, 4));
	    
	    
	}
	

}
