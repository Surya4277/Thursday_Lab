import java.util.Scanner;

public class Radius_user {

	public static void main(String[] args) {
		double radius, circumference, area;
		Scanner sc=new Scanner (System.in);  
		System.out.print("Enter the radius of the circle: ");   
	    radius=sc.nextDouble();  
	    area=(Math.PI*(radius*radius));  
	    System.out.println("The area of the circle is: "+area); 
	    
	    System.out.print("Enter the circumference of the circle: ");   
	    circumference=sc.nextDouble();  
	    area=(circumference*circumference)/(4*Math.PI);  
	    System.out.print("The area of the circle is: "+area);  
	}

}
