import java.util.Scanner;

public class Fibonacci_series {

	public static void main(String[] args) {
		fibo();

	}
	public static void fibo()
	{
	Scanner sc=new Scanner(System.in);
	int a=0,b=1,c,ser;
	
	System.out.println("Enter the no of series for fibonacci");
	ser=sc.nextInt();
	System.out.println(a);
	System.out.println(b);

	do
	{
		c=a+b;
		System.out.println(c);
		a=b;
		b=c;
		ser--;
	}while(ser>=1);
	}

}
