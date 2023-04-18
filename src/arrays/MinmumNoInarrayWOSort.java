package arrays;

public class MinmumNoInarrayWOSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {60,40,80,20,10};
		int fnum=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(fnum>a[i])//change the > to < becomes largest num in array
			{
				fnum=a[i];
			}
		}
		System.out.println(fnum);

	}

}
