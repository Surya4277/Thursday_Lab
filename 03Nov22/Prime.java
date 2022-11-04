import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		
		
		Prime();

	}
	public static void Prime()
	{
		int num, i;
		 Scanner sc=new Scanner(System.in);  
	       System.out.print("Enter a number : ");  
	       num = sc.nextInt(); 
	       
	       for(i=2;i<=num;i++)
	       {
	    	   if(num%i==0)
	    	   {
	    		   break;
	    	   }
	       }
	       if (num==i)
	       {  
	           System.out.println("Is a prime number" +num);  
	       } 
	       else 
	       {  
	           System.out.println("Is not a prime number" +num); 
	       }
	}

}
