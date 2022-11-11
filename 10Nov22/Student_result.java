
/*Write a program to accept 5 students record from the user and calculate the grade and percentage. (accept name, roll_no, Marks of 5 Subject) Perform by using array and function*/
import java.util.Scanner;

public class Student_result {

		String name;
		int roll,i,sum,per;
		int marks[]=new int[5];
		Scanner sc=new Scanner(System.in);
		
		public static void main(String[] args) 
		{
			Student_result[] obj=new Student_result[5];
			for(int i=0;i<5;i++)
			{
				obj[i]=new Student_result();
				obj[i].accept();
			}
			System.out.println("All the data is :");
			for(int i=0;i<5;i++)
			{
				obj[i].calc_per();
				obj[i].grade();
			}
		}
		public void accept()
		{
			
			
			System.out.println("Enter your name");
			name=sc.next();
			System.out.println("Enter your roll no");
			roll=sc.nextInt();
			System.out.println("Enter marks of 5 Subject");
			for(i=0;i<5;i++)
			{
				marks[i]=sc.nextInt();
			}
			
		}
		public void calc_per()
		{
			for(i=0;i<5;i++)
			{
				sum=sum+marks[i];
			}
			
			per=(sum*100)/500;
			
		}
		public void grade()
		{
			System.out.println("name="+name);
			System.out.println("Roll number="+roll);
			System.out.println("The percentage is ="+per);
			if(per>=90 && per<=100)
			{
				System.out.println("O Grade");
			}
			else if(per>=70 && per<90)
			{
				System.out.println("A Grade");
			}
			else if(per>=50 && per<70)
			{
				System.out.println("B Grade");
			}
			else if(per>=35 && per<50)
			{
				System.out.println("c Grade");
			}
			else
			{
				System.out.println("Fail");
			}
		}

	}
