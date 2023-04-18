package Assignments;

public class IAmSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//o/p: m ui nelesmai 
		String str="i am selenium";
		String rev="";
//		String[] s=str.split(" ");
//		int n=str.length()-1;
//		for(int j=0;j<s.length;j++)
//		{
//			String sub="";
//				for(int k=0;k<s[j].length();k++)
//				{
//					if(str.charAt(n)==' ')
//					{
//						n--;
//						sub+=str.charAt(n);
//					}
//					else {	
//					sub+=str.charAt(n);
//					}
//					n--;
//				}
//				System.out.print(sub+" ");
//		}
		for(int i=str.length()-1;i>=0;i--)
		{
			if(str.charAt(i)!=' ')
				rev+=str.charAt(i);
		}
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				rev=rev.substring(0,i)+" "+rev.substring(i, rev.length());
			}
		}
		System.out.println(rev);
	}
}
