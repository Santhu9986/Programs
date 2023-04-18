package arrays;

public class AppendAllZerosAtLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,0,0,0,1,2,3};
		int n = a.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
		{
			if(a[i]==0 && a[j]!=0)
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
		}
			
		}
	}
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
}
