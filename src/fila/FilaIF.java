package fila;

import grafos.Node;

public interface FilaIF {
	public void enfileirar(Node n);
	public void desenfileirar() throws FilaVaziaException;
	public int size();
	public boolean isEmpty();
	public Node front() throws FilaVaziaException;
}
