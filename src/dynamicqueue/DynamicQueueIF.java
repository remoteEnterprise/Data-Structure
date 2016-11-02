package dynamicqueue;

import grafos.Node;

public interface DynamicQueueIF {
	public void enQueue(Node n);
	public Node deQueue();
	public int size();
	public boolean isEmpty();
	public Node front() throws DynamicQueueEmptyException;
}
