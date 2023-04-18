package stringsPrgm;

import java.util.LinkedHashSet;

public class CountNoofVowelsWODups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Engineer";
		int count=0;
		LinkedHashSet<Character> set= new LinkedHashSet<>();
		for(int i=0;i<str.length();i++)
		{
			set.add(str.charAt(i));
		}
		for (Character ch : set) {
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				count++;
			}
		}
		System.out.println(count);
		
	}

}
