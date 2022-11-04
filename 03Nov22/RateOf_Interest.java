import java.util.Scanner;

public class RateOf_Interest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age :- ");
		   int age=sc.nextInt();
		System.out.println("Enter your Gender :- ");
		  char gender=sc.next().charAt(0);
		  if(age>=60) 
		  {
			if(gender=='M'||gender=='m') 
			{
				System.out.println("Your Rate of interest is :- 7%");	
			}
			else
			{
				System.out.println("Your Rate of interest is :- 7.5%");	
			}
			 
		  }
		  else 
			{
				System.out.println("Your Rate of interest is :- 5%");	
			}

	}

}
