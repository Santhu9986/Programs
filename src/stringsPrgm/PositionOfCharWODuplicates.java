package stringsPrgm;

import java.util.LinkedHashSet;

public class PositionOfCharWODuplicates {
	public static void main(String[] args) {
		String str="Kannada";
		String s=str.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		for (Character ch : set) {
			for(int i=0;i<s.length();i++)
			{
				if(ch.equals(s.charAt(i)))
				{
					System.out.println(ch+" is at "+ (i+1)+" position");
					break;
				}			
			}
		}
	}
}
