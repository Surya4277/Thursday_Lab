import java.util.Scanner;

public class User_detail {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your Name:");
		String a=sc.next();
		System.out.print("Enter Your Number:");
		String b=sc.next();
		System.out.print("Enter Your Gender:");
		String c=sc.next();
		System.out.print("Enter Your Address:");
		String d=sc.next();
		System.out.print("Enter Your Gmail:");
		String e=sc.next();
		System.out.print("Enter Your Percentage:");
		float f=sc.nextFloat();
		
		System.out.println("My Name:"+a);
		System.out.println("My Numbe:"+b);
		System.out.println("My Gender:"+c);
		System.out.println("My Address:"+d);
		System.out.println("My Gmail:"+e);
		System.out.println("My Percentage:"+f);
	}

}
