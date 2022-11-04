
//Write a program to accept amin and max value from the user and or display the between numbers

import java.util.Scanner;

public class For_loop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i, min, max;
		System.out.print("Enter Minimum Number");
		min=sc.nextInt();
		System.out.print("Enter Maximun Number");
		max=sc.nextInt();
		
		/*for(i=min; i<=max; i++)*/
		while(min<=max)
		{
			/*System.out.println(i);*/
			System.out.println("i="+min);
			min++;
		}

	}

}
