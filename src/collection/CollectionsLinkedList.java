package collection;

import java.util.Collections;
import java.util.LinkedList;

public class CollectionsLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Object> list = new LinkedList<Object>();
		list.add(10);
		list.add("santhosh");
		list.add(true);
		list.add(null);
		
		System.out.println(list);
		
		LinkedList<Integer> list1 = new LinkedList<>();
		list1.add(10);
		list1.add(40);
		list1.add(20);
		list1.add(50);
		list1.add(30);
		
		Collections.sort(list1);
		System.out.println(list1);
		list.addAll(list1);
		System.out.println(list);
		
		list.addFirst(100);
		list.addLast(200);
		System.out.println(list);
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.removeLast());
		System.out.println(list.removeFirst());
		System.out.println(list);
		System.out.println(list.remove());
		System.out.println(list);
	}

}
