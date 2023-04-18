package patternPrgm;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        *
//      * *
//    * * *
//  * * * *
//* * * * *
//		for(int i=5;i>0;i--)
//		{
//			for(int j=1;j<i;j++)
//				System.out.print("  ");
//			for(int k=i;k<=5;k++)
//				System.out.print(" *");
//			System.out.println();
//		}
		
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<n;j++)
				System.out.print("  ");
			for(int j=1;j<=i;j++)
				System.out.print("* ");
			System.out.println();
		}

	}

}
