package javaPrgms;

import java.util.Scanner;

public class PrimeNumberfor1toN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		for(int i=2;i<=n;i++)
		{
			boolean flag=true;
			int m=i/2;
			for(int j=2;j<=m;j++)
			{
				if(i%j==0)
				{
					flag=false;
				}
			}
			if(flag)
			{
				System.out.print(i+" ");
			}
		}

	}

}
