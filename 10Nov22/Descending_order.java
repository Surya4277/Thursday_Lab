import java.util.Arrays;
import java.util.Collections;

/*Write a program to accept size from user accordingly accept no from the user and find out the greater no, smaller no, display no in ascending and descending order (Using function and array)*/

public class Descending_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Initializing the array
        Integer array[] = { 1, 2, 3, 4, 5 };
  
        // Sorting the array in descending order
        Arrays.sort(array, Collections.reverseOrder());
  
        // Printing the elements
        System.out.println(Arrays.toString(array));

	}

}
