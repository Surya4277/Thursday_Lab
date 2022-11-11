/* Write a program to perform the swapping of two no with third variable and without third variable using function*/

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		Swapping obj=new Swapping();
		obj.accept();

	}
	public void accept()
	{
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		Swapp_without(num1,num2);
		Swapp_with(num1,num2);
	}
	public void Swapp_without(int num1,int num2)
	{

		System.out.println(" The number are=");
		System.out.println("num1="+num1+" and num2="+num2);
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("After swapping the no are=");
		System.out.println("num1="+num1+" and num2="+num2);
		
	}
	public void Swapp_with(int num1,int num2)
	{
		int temp;
		System.out.println(" The no are=");
		System.out.println("num1="+num1+" and num2="+num2);
		
		temp=num1;
		num1=num2;
		num2=temp;
		
		System.out.println("After swapping the no are=");
		System.out.println("num1="+num1+" and num2="+num2);
		  

	}

}
