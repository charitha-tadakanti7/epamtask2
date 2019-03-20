package Interest;

/**
 * 
 * @author charitha
 * program to calculate simple and compound interest
 */

public class Interest {
	public double simpleInterest(double principal,double rate,int year)
	{
		return ((principal*rate*year)/100);
	}
	public double compoundInterest(double principal,double rate,double year)
	{
		double x=(1+(rate)/100);
		double y=Math.pow(x, year)*principal;
		return y;
	}
}
