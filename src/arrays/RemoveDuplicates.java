package arrays;

import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4,5,4,1,5,3,2};
		LinkedHashSet<Integer> set=new LinkedHashSet<>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		for (Integer in : set) {
			int count = 0;
			for(int i=0;i<a.length;i++)
			{
				if(in==a[i])
					count++;
			}
			if(count>1)//counting duplicates present in array
			System.out.println(in+" = "+count);
		}

	}

}
