package Surya;

public class gross_net extends Emp_details
{
	double BS,GS,NS,DA,HRA,PF;
	
	public void calc()
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
