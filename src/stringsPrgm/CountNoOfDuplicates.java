package stringsPrgm;

import java.util.LinkedHashSet;

public class CountNoOfDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Kannada";
		String s=str.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		for (Character ch : set) {
			int count = 0;
			for(int i=0;i<s.length();i++)
			{
				if(ch.equals(s.charAt(i)))
					count++;
			}
			if(count>1)
			System.out.println(ch +" repeated "+count+" times");
			
		}

	}

}
