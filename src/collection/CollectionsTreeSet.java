package collection;

import java.util.TreeSet;

public class CollectionsTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Object> set = new TreeSet<Object>();
		set.add(10);
		set.add(10);
		set.add(50);
		//set.add("Santhosh");//throws ClassCastException, treeset only stores homogenious type of data
		//set.add(null); //throws NullPointerException, treeset maintains auto sorting due to which throws.
		set.add(30);
		System.out.println(set);
		System.out.println(set.descendingSet());

	}

}
