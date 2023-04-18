package javaPrgms;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		boolean flag=true;
		if(n==0 || n==1)
			System.out.println(n+" is not a prime number");
		else
		{
			int m=n/2;
			for(int i=2;i<=m;i++)
			{
				if(n%i==0)
				{
					System.out.println(n+" is not a prime number");
					flag=false;
					break;
				}
			}
		}
		if(flag)
			System.out.println(n+" is prime number");
			

	}

}
