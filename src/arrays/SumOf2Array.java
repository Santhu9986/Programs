package arrays;

public class SumOf2Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,2,4,9};
		int b[]= {8,6,4,5,8};
		int length=a.length;
		if(a.length<b.length)
		{
			length=b.length;
		}
		for(int i=0;i<length;i++)
		{
			try {
			System.out.print(a[i]+b[i]+" ");
			}
			catch (Exception e) {
				if(a.length<b.length)
				{
					System.out.print(b[i]);
				}
				else
					System.out.println(a[i]);
			}
		}

	}

}
