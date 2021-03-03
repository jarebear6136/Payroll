import java.util.*;
import java.text.DecimalFormat;
/*
 * Tester class for constructing a payroll object and invoking methods of the payroll class
 * Jarrett Nobles
 * 10/7/20
 */
public class PayRollTester 
{

	public static void main(String[] args) 
	{
		//construct an object of the payroll class
		Payroll pr= new Payroll();
		
		//construct an object of decimal format
		DecimalFormat cur= new DecimalFormat("$#.###");
		
		//get hours worked and rate of pay
		pr.getInfo();
		pr.computePay();
		double myPay=pr.getGrossPay();
		System.out.println("Hours Worked: "+ pr.getHours()+" "+"Rate of Pay: "+ pr.getRate());
		System.out.println("Gross Pay: "+ cur.format(myPay));
	

	}

}
