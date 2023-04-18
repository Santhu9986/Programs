package patternPrgm;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1 2 3 4 5 
//		1 2 3 4 5 
//		1 2 3 4 5 
//		1 2 3 4 5 
//		1 2 3 4 5 
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
				System.out.print(j+" ");
			System.out.println();
		}

	}

}
