package stringsPrgm;

public class CountNoOfVowels {
	
	public static int countVowels(String str)
	{
		String s=str.toLowerCase();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if('a'==s.charAt(i) || 'e'==s.charAt(i) || 'i'==s.charAt(i)
					|| 'o'==s.charAt(i) || 'u'==s.charAt(i))
			{
			count++;	
			}
		}
		return count;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Engineer";
		System.out.println("The no of vowels in "+str+" is: "+countVowels(str));

	}

}
