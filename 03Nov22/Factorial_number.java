import java.util.Scanner;

public class Factorial_number {

	public static void main(String[] args) {
		fact();

	}
	public static void fact()
	{
		int num, fact=1;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the no");
		num=sc.nextInt();
		
		while(num>=1)
		{
			fact=fact*num;
			num--;
		}
		System.out.println("The factorial is="+fact);
	}

}
