package collection;

import java.util.HashMap;
import java.util.Map.Entry;

public class CollectionsHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Object> map = new HashMap<Integer,Object>();
		map.put(10, "abc:");
		map.put(null, "abc");//allowed
		map.put(20, null);//allowed
		map.put(null, "xyz");//not allowed due to duplicate of null key
		map.put(30, "xyz");
		map.put(30, null);//allowed
		map.put(40, "pqr");
		map.put(50, "qwerty");
		
		System.out.println(map);
		for (Entry<Integer, Object> set : map.entrySet()) {
			System.out.println(set.getKey()+" "+set.getValue());
			
		}
		System.out.println(map.containsKey(10));
		map.remove(50);
		map.remove(10);
		System.out.println(map);
	}

}
