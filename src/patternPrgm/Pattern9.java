package patternPrgm;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		5 
//		5 4 
//		5 4 3 
//		5 4 3 2 
//		5 4 3 2 1 

		int n=5;
		for(int i=1;i<=n;i++)
		{
			int k=n;
			for(int j=1;j<=i;j++)
				System.out.print(k-- +" ");
			System.out.println();
		}

	}

}
