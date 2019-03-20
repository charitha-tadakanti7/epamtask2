package Interest;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author charitha
 * 
 */


public class Interest_test {
	
	public void test() {
	Interest i=new Interest();
	 assertEquals(400,i.simpleInterest(10000,2,2),0.0);
	 assertEquals(4,i.simpleInterest(400,1,1),0.0);
	 assertEquals(615.99,i.compoundInterest(100000, 3, 2),0.0);
	}
}
