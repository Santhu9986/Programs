package Assignments;

public class IAmSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//o/p: m ui nelesmai 
		String str="i am selenium";
		String[] s=str.split(" ");
		int n=str.length()-1;
		for(int j=0;j<s.length;j++)
		{
			String sub="";
				for(int k=0;k<s[j].length();k++)
				{
					if(str.charAt(n)==' ')
					{
						n--;
						sub+=str.charAt(n);
					}
					else {	
					sub+=str.charAt(n);
					}
					n--;
				}
				System.out.print(sub+" ");
		}
	}
}
