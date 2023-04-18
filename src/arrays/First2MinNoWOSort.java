package arrays;

public class First2MinNoWOSort {

	public static void main(String[] args) {
		int a[]= {40,10,80,60,20,-10};
		int fnum=Integer.MAX_VALUE;
		int secnum=Integer.MAX_VALUE;
		int tnum=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(fnum>a[i])//change the > to < becomes largest num in array
			{
				tnum=secnum;
				secnum=fnum;
				fnum=a[i];
			}
			
			else if(secnum>a[i])
			{
				tnum=secnum;
				secnum=a[i];		
			}
			else if(tnum>a[i])
				tnum=a[i];
			}
		
		System.out.println("The first minimum no is: "+fnum);
		System.out.println("The second minimum no is: "+secnum);
		System.out.println("The third minimum no is: "+tnum);
		
	}

}
