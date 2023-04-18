package arrays;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of array: ");
		int length=sc.nextInt();
		System.out.println("enter the values for array to sort: ");
		int[] a = new int[length];
		for(int i=0;i<length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("the array before sorting is: ");
		for(int i=0;i<length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("array after sorting: ");
		for(int i=0;i<length;i++)
		{
			for(int j=i+1;j<length;j++)
			{
				if(a[i]>a[j])
				{
					a[i]=a[i]+a[j];
					a[j]=a[i]-a[j];
					a[i]=a[i]-a[j];
				}
			}
			System.out.print(a[i]+" ");
		}
		sc.close();
	}

}
