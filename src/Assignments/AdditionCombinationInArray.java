package Assignments;

public class AdditionCombinationInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,3,5,2,8,9,10};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if((a[i]+a[j])==11)
				{
					System.out.println(a[i]+" + "+a[j]+" = 11");
				}
			}
		}

	}

}
