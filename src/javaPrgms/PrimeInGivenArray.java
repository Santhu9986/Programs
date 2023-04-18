package javaPrgms;

public class PrimeInGivenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,3,2,4,6,5,9,7};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0 && a[i]!=1)
			{
			int m=a[i]/2;
			boolean flag=true;
			for(int j=2;j<=m;j++)
			{
				if(a[i]%j==0)
				{
				flag=false;
				break;
				}
			}
			if(flag)
			{
				System.out.print(a[i]+" ");
			}
			}
			
		}

	}

}
