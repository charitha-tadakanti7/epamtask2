package Calculator;
/**
 * 
 * @author charitha
 *simple calculator program
 *
 */

public class Calc {
	public int add(int a,int b)
	{
		return a+b;
	}
	public int subtract(int a,int b)
	{
		return a-b;
	}
	public int multiply(int a,int b)
	{
		return a*b;
	}
	public int divide(int a,int b)
	{
		int res=0;
	try {
		 res=a/b;
	}
	catch(ArithmeticException e) {
		
	}
	return res;
	}

}
