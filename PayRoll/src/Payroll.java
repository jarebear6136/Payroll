import java.util.*;
/*
 * A java program to compute gross pay based upon hours worked and rate of pay
 * Hours exceeding 40 is eligible for overtime pay 1.5 of the pay rate
 * 10/7/20
 * Jarrett Nobles
 */
public class Payroll 
{
	//instance variables
	private double hoursWorked;
	private double rateOfPay;
	private double grossPay;
	private double tax;
	private double netPay;
	
	//constructor sets the initial values of the instance variables
	public Payroll() 
	{
		hoursWorked=0.00;
		rateOfPay=0.00;
		grossPay=0.00;
		tax=0.00;
		netPay=0.00;
		
		
		
	}
	////////////////////////////////////
	public void getInfo() 
	{
		Scanner in=new Scanner(System.in);
		//prompt for hours worked and rate of pay
		System.out.println("Enter the number of hours worked: ");
		hoursWorked=in.nextDouble();
		System.out.println("Enter the rate of pay");
		rateOfPay=in.nextDouble();
		
		
		
	}
	//////////////////////////////////////
	public void computePay() 
	{
		double regPay=0.00;
		double otPay=0.00;
		if(hoursWorked>40) 
		{
			regPay=40*rateOfPay;
			otPay=(hoursWorked-40)*(rateOfPay*1.5);
			grossPay=regPay+otPay;
			
		}
		else 
		{
			regPay=hoursWorked*rateOfPay;
			grossPay=regPay;
			
		}
		
	}
	//////////////////////////////////////
	public double getRate() 
	{
		return rateOfPay;
	}
	/////////////////////////////////////
	public double getHours() 
	{
		return hoursWorked;
		
	}
	/////////////////////////////////////
	public double getGrossPay() 
	{
		return grossPay;
	}
	///////////////////////////////////////
	//compute tax
	public double incTax()
	{
		tax=tax*grossPay;
		return tax;
		
		
	}
	//////////////////////////////////////
	//compute netpay
	public double nPay() 
	{
		netPay=grossPay-tax;
		return netPay;
		
	}
}
