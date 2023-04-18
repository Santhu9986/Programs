package Assignments;

import java.util.LinkedHashSet;

public class OccuranceOfWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="My name is rishav it contains ri and shav";
		String[] s=str.split(" ");
		LinkedHashSet< String> set=new LinkedHashSet<>();
		for(int i=0;i<s.length;i++)
		{
			set.add(s[i]);
		}
		for (String st : set) {
			int count = 0;
			for(int i=0;i<s.length;i++)
			{
				if(st==s[i])
					count++;
			}
			System.out.println(st+" == "+count);
			
		}

	}

}
