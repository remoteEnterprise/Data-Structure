package queue;

import grafos.Node;

public class Main {
	public static void main(String[] args) throws  QueueFullException, QueueEmptyException{
		Queue queue = new Queue(6);
		Node n0 = new Node(0);
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		
		System.out.println(queue.isEmpty());
		queue.enQueue(n0);
		System.out.println(queue.size());
		queue.enQueue(n1);
		System.out.println(queue.size());
		queue.enQueue(n2);
		System.out.println(queue.size());
		queue.enQueue(n3);
		System.out.println(queue.size());
		queue.enQueue(n4);
		System.out.println(queue.size());
		System.out.println("Front-> "+queue.front().getNum());
		System.out.println(queue.deQueue().getNum());
		System.out.println("Front-> "+queue.front().getNum());
		System.out.println(queue.deQueue().getNum());
		System.out.println("Front-> "+queue.front().getNum());
		System.out.println(queue.deQueue().getNum());
		System.out.println(queue.size());
		System.out.println("Front-> "+queue.front().getNum());
		System.out.println(queue.deQueue().getNum());
		System.out.println(queue.size());
		System.out.println("Front-> "+queue.front().getNum());
		System.out.println(queue.deQueue().getNum());
	}
}
