package stringsPrgm;

public class CountNoOfUppercaseNLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="SofTwArE";
		int u=0;
		int l=0;
		for(int i=0;i<s.length();i++)
		{
			
			if(Character.isUpperCase(s.charAt(i)))
				u++;
			if(Character.isLowerCase(s.charAt(i)))
				l++;
		}
		System.out.println("No of Upper case is: "+u);
		System.out.println("No of Lower case is: "+l);
	}

}
