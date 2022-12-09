/* Write a program to display Armstrong numbers between 1 to 1000.
 * Write a program to display Prime number.
 * Write a program to display reverse number.
 */


package Surya;

public class HW2 extends Prime_no
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HW2 obj = new HW2();
		obj.arm();
		obj.reverse();
		obj.prime();
		

	}

	@Override
	public void reverse() 
	{
		// TODO Auto-generated method stub
			int number = 12345, reverse = 0;  
			while(number != 0)   
			{  
			int remainder = number % 10;  
			reverse = reverse * 10 + remainder;  
			number = number/10;  
			}  
			System.out.println("The reverse of the given number is: " + reverse);  
		
	}

	@Override
	public void prime() 
	{
		// TODO Auto-generated method stub
		int i , j, c=0 ;
		System.out.println("Prime number between 1 to 1000 Are : ");

		for( i=1 ; i<=1000; i++)
		{
		for( j=1 ; j<=i ; j++)
		{
		if ( i%j ==0)
			c++;
		}
		if ( c==2)
		System.out.println( + i);
			c=0;
		}
	}
}
