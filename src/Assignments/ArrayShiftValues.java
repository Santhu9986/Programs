package Assignments;

public class ArrayShiftValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub4
		int[] a= {5,4,1,2,3};
		int[] b=new int[a.length];
		int key=2;
		int count=0,k=a.length-key;
		for(int i=key;i<a.length;i++)
		{
			b[count++]=a[i];
		}
		for(int i=0;i<key;i++)
		{
			b[k++]=a[i];
		}
		for(int i=0;i<b.length;i++)
		System.out.println(b[i]);
		

	}

}
