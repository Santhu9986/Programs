package Assignments;

public class ReverseTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="I Love Programming";
		String[] s= str.split(" ");
		for(int i=0;i<s.length;i++)
		{
			String temp="";
			for(int j=s[i].length()-1;j>=0;j--)
			{
				temp+=s[i].charAt(j);
			}
			System.out.print(temp+" ");
		}
		

	}

}
