package arrays;

import java.util.Scanner;

public class SumOfMinNosinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {60,40,80,20,10};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("enter the sum of how many nos : (The array length is:"+a.length+" )");
		Scanner sc=new Scanner(System.in);
		int value = sc.nextInt();
		int sum=1;
		System.out.println("The first "+value+" minimum nos are: ");
		for(int i=0;i<value;i++)
		{
			System.out.print(a[i]+ " ");
			sum+=a[i];
		}
		System.out.println();
		System.out.println("The sum  of "+value+" is: "+sum);
		sc.close();
	}

}
