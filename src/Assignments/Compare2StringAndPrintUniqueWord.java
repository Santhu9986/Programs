package Assignments;

import java.util.LinkedHashSet;

public class Compare2StringAndPrintUniqueWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="This is fun show";
		String s1="fun tv show";
		String[] sp=s.split(" ");
		String[] sp1=s1.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<>();
		for(int i=0;i<sp.length;i++)
		{
			set.add(sp[i]);
		}
		for(int i=0;i<sp1.length;i++)
		{
			if(set.contains(sp1[i]))
				set.remove(sp1[i]);
			else
				set.add(sp1[i]);
		}
		for (String str : set)
		{
			System.out.print(str+" ");
		}

	}

}
