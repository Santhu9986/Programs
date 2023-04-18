package stringsPrgm;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="I am a Software Engineer";
		String reverse = "";
		
		String[] str=s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			String rev=" ";
		for(int j=str[i].length()-1;j>=0;j--)
		{
			
			rev+=str[i].charAt(j);		
		}
		reverse+=rev+" ";
		}
		System.out.println(s);
		System.out.println(reverse);
	}

}
