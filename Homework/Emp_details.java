package Surya;

import java.util.Scanner;

public class Emp_details 
{
	Scanner sc = new Scanner(System.in);
	int emp_id, emp_age, contact_no;
	String emp_name, emp_address;
	
	public void accept()
	{
		System.out.println("Enter Employee ID :");
		emp_id = sc.nextInt();
		System.out.println("Enter Employee Name :");
		emp_name = sc.next();
		System.out.println("Enter Employee Age :");
		emp_age = sc.nextInt();
		System.out.println("Enter Employee Address :");
		emp_address = sc.next();
		System.out.println("Enter Employee Contact Number :");
		contact_no = sc.nextInt();
	}
}
