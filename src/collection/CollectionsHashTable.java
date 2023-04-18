package collection;

import java.util.Hashtable;
import java.util.Map.Entry;

public class CollectionsHashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,String> hash = new Hashtable<>();
		//hash.put(10, null);// throws NullPointer exception
		hash.put(20, "Santhosh");
		hash.put(10, "abc");
		//hash.put(null, "xyz");// throws NullPointer exception
		hash.put(30, "abc");
		System.out.println(hash);
		
		hash.put(20, "abc");
		hash.put(10, "Santhosh");
		
		System.out.println(hash);
		
		for (Entry<Integer, String> set : hash.entrySet()) 
		{
			System.out.println(set.getKey()+" "+set.getValue());
		}
		
		System.out.println(hash.contains("abc"));
		System.out.println(hash.containsKey(10));
		System.out.println(hash.containsValue("santhosh"));
		System.out.println(hash.get(20));
		System.out.println(hash.remove(30));
		
		System.out.println(hash);

	}

}
