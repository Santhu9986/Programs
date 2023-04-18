package patternPrgm;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		A B C D E 
//		A B C D E 
//		A B C D E 
//		A B C D E 
//		A B C D E 
		for(char i='A';i<='E';i++)
		{
			for(char j='A';j<='E';j++)
				System.out.print(j+ " ");
			System.out.println();
		}
		System.out.println();
		//------OR------
		for(int i=1;i<=5;i++)
		{
			char k='A';
			for(int j=1;j<=5;j++)
				System.out.print(k++ +" ");
			System.out.println();
		}

	}

}
