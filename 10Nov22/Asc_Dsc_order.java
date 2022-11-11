/*Write a program to accept size from user accordingly accept no from the user and find out the greater no, smaller no, display no in ascending and descending order (Using function and array)*/


import java.util.Scanner;

public class Asc_Dsc_order {
	
	int i,j,temp,size;
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Asc_Dsc_order obj=new Asc_Dsc_order();
		obj.accept();

	}
	public void accept()
	{
		System.out.println("Enter the size");
		size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter "+size+" numbers:");
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		GRT(arr);
		SML(arr);
		ASC(arr);
		DESC(arr);
	}
	public void GRT(int[] arr)
	{
		temp=arr[0];
		for(i=0;i<arr.length;i++)
		{
			if(temp<arr[i])
			{
				temp=arr[i];
			}
		}
		System.out.println("The Greater No is ="+temp);
	}
	public void SML(int[] arr)
	{
		temp=arr[0];
		for(i=0;i<arr.length;i++)
		{
			if(temp>arr[i])
			{
				temp=arr[i];
			}
		}
		System.out.println("The Smaller No is ="+temp);
		
	}
	public void ASC(int[] arr)
	{
	
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("The No in ascending order is =");
		for(i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public void DESC(int[] arr)
	{
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("The No in descending order is =");
		for(i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}


