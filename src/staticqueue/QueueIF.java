package staticqueue;

import grafos.Node;

public interface QueueIF {
	public void enQueue(Node n) throws QueueFullException;
	public Node deQueue() throws QueueEmptyException;
	public int size();
	public boolean isEmpty();
	public Node front() throws QueueEmptyException;
}
