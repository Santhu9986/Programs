package Assignments;

public class MulOfMax3Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {7,-3,0,2,1,-9};
		int fmax=0, smax=0, tmax=0;
		for(int i=0;i<a.length;i++)
		{
			if(fmax<a[i])
			{
				tmax=smax;
				smax=fmax;
				fmax=a[i];
			}
			else if(smax<a[i])
			{
				tmax=smax;
				smax=a[i];
				
			}
			else if(tmax<a[i])
				tmax=a[i];
		}
		System.out.println("The product of max 3 element is: "+(fmax*smax*tmax));

	}

}
