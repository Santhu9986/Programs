package arrays;

import java.util.Scanner;

public class MinNoInArray {

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
		System.out.println("enter the which min no to find: (The array length is:"+a.length+" )");
		Scanner sc=new Scanner(System.in);
		int index = sc.nextInt();
		System.out.println("The value of the "+index +" minimum no in the array is: "+a[index-1]);
		sc.close();
	}

}
