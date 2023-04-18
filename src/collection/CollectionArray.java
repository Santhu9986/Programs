package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionArray {

	public static void main(String[] args) {
		
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(10);
		list.add("santhosh");
		list.add(true);
		list.add(null);
		
		System.out.println(list);
		
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(40);
		list1.add(20);
		list1.add(50);
		list1.add(30);
		
		Collections.sort(list1);
		System.out.println(list1);
		list.addAll(list1);
		System.out.println(list);
		
		if(list.contains("santhosh"))
			System.out.println("is present");
		else
			System.out.println("is not present");
		
		System.out.println(list.get(2)); //fetch the value of index 2
		System.out.println(list.size()); //get the size of the list
		System.out.println(list.remove(3)); //remove the value at index 3
		System.out.println(list.indexOf("santhosh")); //get the index value of santhosh
		for (Object value : list)//find the value 1 by 1
		{
			System.out.println(value);
		}
		Iterator<Object> it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
