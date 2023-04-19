package Assignments;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="tool";
		String str2="lott";
		char[] s1=str1.toCharArray();
		char[] s2=str2.toCharArray();
		Arrays.sort(s1);
		Arrays.sort(s2);
		boolean flag = true;
		if(s1.length!=s2.length)
			System.out.println("These are not anagram");
		else
			for(int i=0;i<s1.length;i++)
				if(s1[i]!=s2[i])
				{
					flag=false;
					break;
				}
		if(flag)
			System.out.println("These are anagram");
		else
			System.out.println("These are not anagram");
	}
}
