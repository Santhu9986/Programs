package collection;

import java.util.Stack;

public class CollectionsStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Object> s = new Stack<Object>();
		s.add(10);
		s.add("santhosh");
		s.add(20);
		System.out.println(s);
		
		s.push(60);
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);

	}

}
