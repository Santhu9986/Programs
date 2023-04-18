package Assignments;

import java.util.LinkedHashSet;

public class AAABBCDDDF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		o/p: a3b2cd3f
		String str="aaabbcdddf";
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		for(int i=0;i<str.length();i++)
		{
			set.add(str.charAt(i));
		}
		for (Character ch : set) {
			int count=0;
			for(int i=0;i<str.length();i++)
			{
				if(ch==str.charAt(i))
					count++;
			}
			System.out.print(ch);
			if(count>1)
			System.out.print(count);
		}
		

	}

}
