package Assignments;

public class ReverseStatementAndWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="my name is ok";
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev+=str.charAt(i);
		}
		System.out.println(rev);
	}

}
