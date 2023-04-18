package Assignments;

public class PrimeNofrom1to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=100;
		if(n==0 || n==1)
			System.out.println(n+" is not a prime");
		for(int i=2;i<=100;i++)
		{
			int m=i/2;
			boolean flag=true;
			for(int j=2;j<=m;j++)
			{
				if(i%j==0)
				{
					flag=false;
					break;
				}
					
			}
			if(flag)
				System.out.print(i+" ");
		}

	}

}
