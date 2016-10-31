package queue;

import grafos.Node;

public class Queue implements QueueIF {
	private int head;						//F
		private int tail;						//R
		private Node[] nodes;
	private static final int CAPACITY = 1000;		//N
	private int capacity;											//N
	
	public Queue(int cap) {
		this.head = 0;
		this.tail = 0;
		this.capacity = cap;
		this.nodes = new Node[cap];
	}
	
	public Queue() {
		this.nodes = new Node[CAPACITY];
		this.head = 0;
		this.tail = 0;
		this.capacity = CAPACITY;
	}
	
	@Override
	public void enQueue(Node n) throws QueueFullException{
		if(this.size() == this.nodes.length-1) {
			throw new QueueFullException();
		}
		this.nodes[this.tail] = n;
		this.tail = this.tail + 1;
	}

	@Override
	public Node deQueue() throws QueueEmptyException {
		if(this.isEmpty()) {
			throw new QueueEmptyException();
		}
		Node temp = this.nodes[this.head];
		this.nodes[this.head] = null;
		this.head = this.head + 1;
		return temp;
	}

	@Override
	public int size() {
        return  (this.capacity - this.head + this.tail) % this.capacity;
	}

	@Override
	public boolean isEmpty() {
		return this.head == this.tail;
	}

	@Override
	public Node front() throws QueueEmptyException {
		if(this.isEmpty()) {
			throw new QueueEmptyException();
		}
		
		return this.nodes[this.head];
	}
}
