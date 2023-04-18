package Assignments;

import java.util.LinkedHashSet;

public class PrintCharOccuranceInGivenFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="malyalam";//o/p: m:2a:3l:2y:1
		LinkedHashSet<Character>set = new LinkedHashSet<>();
		for(int i=0;i<str.length();i++)
			set.add(str.charAt(i));
		for (Character ch : set) {
			int count=0;
			for(int i=0;i<str.length();i++)
			{
				if(ch==str.charAt(i))
					count++;
			}
			System.out.print(ch+":"+count);
		}

	}

}
