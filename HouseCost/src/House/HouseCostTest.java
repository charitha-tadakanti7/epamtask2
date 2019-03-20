package House;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author charitha
 * 
 */

public class HouseCostTest {
 public void test()
 {
	 HouseCost h=new HouseCost();
	 assertEquals(24000,h.cost("standard",20),0.0);
	 assertEquals(30000,h.cost("abovestandard",20),0.0);
	 assertEquals(36000,h.cost("highstandard",20),0.0);
	 assertEquals(50000,h.cost("",20),0.0);
 }
}
