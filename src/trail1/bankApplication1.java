package trail1;

import java.util.Scanner;



class bankaccount
{
	void deposit() 
	{
		int deposit=4000;
		System.out.println("the deposit is"+deposit);
	}
	void withdraw() 
	{
		int withdraw=2000;
		System.out.println("the withdraw money"+withdraw);
	}
}
class savingsaccount extends bankaccount
{
	void withdraw() 
	{
		Scanner sc=new Scanner(System .in);
		System.out.println("enter the value:");
		int accountbalance =sc.nextInt();
		
		
	if(accountbalance<100)
	{
	System.out.println("the amount is insufficient");	
	}
	else
	{
		int withdraw=2000;
		System.out.println("the withdraw amount is"+withdraw);
		int remaining=accountbalance-withdraw;
		System.out.println("the remaing balance"+remaining);
	}
	
  }
}

public class bankApplication1 {

	public static void main(String[] args) {
		savingsaccount sc= new savingsaccount();
		sc.withdraw();

	} 


}


