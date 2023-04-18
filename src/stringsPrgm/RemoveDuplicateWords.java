package stringsPrgm;

import java.util.LinkedHashSet;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="I am I am a software a engineer";
		String[] s = str.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(int i=0;i<s.length;i++)
		{
			set.add(s[i]);
		}
		for (String st : set) {
			System.out.print(st+" ");
		}	
		System.out.println();
		for (String st : set) {
			int count=0;
			for(int i=0;i<s.length;i++)
			{
				if(st.equals(s[i]))
					count++;
			}
			if(count>1)
			System.out.println(st +" is repeated "+count+" times");
		}
	}
}
