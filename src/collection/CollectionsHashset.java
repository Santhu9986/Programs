package collection;

import java.util.ArrayList;
import java.util.HashSet;

public class CollectionsHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Object> set = new HashSet<>();
		set.add(10);
		set.add(10);
		set.add("santhosh");
		set.add(null);
		set.add(50);
		set.add(null);
		
		System.out.println(set);
		
		ArrayList<Object> list = new ArrayList<>(set);
		list.add("good");
		list.add(800);
		
		System.out.println(list);
		System.out.println(set.size());
		System.out.println(list.size());
		list.add(null);
		System.out.println(list);
	}

}
