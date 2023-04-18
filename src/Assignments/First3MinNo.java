package Assignments;

public class First3MinNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {7,-6,11,9,0,4};
		int fnum=Integer.MAX_VALUE;
		int snum=Integer.MAX_VALUE;
		int tnum=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(fnum>a[i])
			{
				tnum=snum;
				snum=fnum;
				fnum=a[i];
			}
			else if(snum>a[i])
			{
				tnum=snum;
				snum=a[i];
			}
			else if(tnum>a[i])
				tnum=a[i];
		}
		System.out.println(fnum+" "+snum+" "+tnum);

	}

}
