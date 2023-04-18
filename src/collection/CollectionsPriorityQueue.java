package collection;

import java.util.PriorityQueue;

public class CollectionsPriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Object> prior = new PriorityQueue<>();
		prior.add(50);
		prior.add(20);
		prior.add(30);
		System.out.println(prior);
		System.out.println(prior.peek());
		System.out.println(prior);
		System.out.println(prior.poll());
		System.out.println(prior);
	}

}
