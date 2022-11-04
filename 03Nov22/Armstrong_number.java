import java.util.Scanner;

public class Armstrong_number {

	public static void main(String[] args) {
		armstrong();

	}
	public static void armstrong()
	{
		int num, s=0, r;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a Number");
		num=sc.nextInt();
		int num1=num;
		do
		{
			r=num%10;
			s=s+(r*r*r);
			num=num/10;
		}
		while(num>0);
		
		if(num1==s)
		{
			System.out.println("It is an armstrong no"+s);
		}
	}

}
