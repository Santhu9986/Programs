package arrays;

import java.util.LinkedHashSet;

public class positionInArrayWODuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4,5,4,1,5,3,2};
		LinkedHashSet<Integer> set=new LinkedHashSet<>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		for (Integer in : set) {
			for(int i=0;i<a.length;i++)//change looping statement for reverse order like i=a.length-1;i>=0;i++
			{
				if(in==a[i]) {
					System.out.println(in+" at index of "+i);
					break;
				}
			}
		}
	}

}
