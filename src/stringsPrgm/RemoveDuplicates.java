package stringsPrgm;

import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Kannada";
		String str=s.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<str.length();i++)
		{
			set.add(str.charAt(i));
		}
		for (Character ch : set) {
			System.out.print(ch);
			
		}

	}

}
