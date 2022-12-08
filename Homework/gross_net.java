*Write a program  to create a process which will store the employee details and calculate the employee gross salary and net salary.


package Surya;

public class gross_net extends Emp_details  //new class create and extends another class 
{
	double BS,GS,NS,DA,HRA,PF;
	
	public void calc() //calculation 
	{
		System.out.println("Enter the basic salary");
		BS = sc.nextDouble();
		DA = 0.3*BS;
		HRA = 0.125*BS;
		PF = 0.1*BS;
		GS = BS+DA+HRA;
		NS = GS-PF;
		System.out.println("Your basic salary is :"+BS+""+"RS");
		System.out.println("Your gross salary is :"+GS+""+"RS");
		System.out.println("Your net salary is :"+NS+""+"RS");
	}
}
