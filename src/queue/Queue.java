package queue;

import grafos.Node;
/**
 * Static Queue
 * @author Leonardo
 * "Freedom call, the cry of barren souls"
 */
public class Queue implements QueueIF {
	private int head;					//F
	private int tail;						//R
	private Node[] nodes;
	private int capacity;				//N
	private int size;
	
	public Queue(int cap) {
		this.head = 0;
		this.tail = 0;
		this.size = 0;
		this.capacity = cap;
		this.nodes = new Node[this.capacity];
	}
	
	@Override
	public void enQueue(Node n) throws QueueFullException{
		if(this.size() == this.capacity) {
			throw new QueueFullException();
		}
		this.nodes[this.tail] = n;
		this.tail = (this.tail + 1) % this.capacity;
		this.size++;
		System.out.println("Enfileirou "+n.getNum());
	}

	@Override
	public Node deQueue() throws QueueEmptyException {
		if(this.isEmpty()) {
			throw new QueueEmptyException();
		}
		Node temp = this.nodes[this.head];
		this.head = (this.head + 1) % this.capacity;
		this.size--;
		return temp;
	}

	@Override
	public int size() {
        return  this.size;
	}

	@Override
	public boolean isEmpty() {
		return this.size == 0;
	}

	@Override
	public Node front() throws QueueEmptyException {
		if(this.isEmpty()) {
			throw new QueueEmptyException();
		}
		
		return this.nodes[this.head];
	}
}
