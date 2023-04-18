package stringsPrgm;

import java.util.LinkedHashSet;

public class OccuranceOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Kannada";
		String str=s.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<str.length();i++)
		{
			set.add(str.charAt(i));
		}
		
		for (Character character : set) {
		{
			int count = 0;
			for(int j=0;j<str.length();j++)
			{
				
				if(character.equals(str.charAt(j)))
					count++;
			}
			System.out.println("The occurance of "+character+ " is: "+count);
		}

	}

}
}