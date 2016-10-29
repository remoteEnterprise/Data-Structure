package fila;

import grafos.Node;

public interface FilaIF {
	public void enQueue(Node n) throws FilaCheiaException;
	public Node deQueue() throws FilaVaziaException;
	public int size();
	public boolean isEmpty();
	public Node front() throws FilaVaziaException;
}
