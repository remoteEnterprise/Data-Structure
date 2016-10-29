package fila;

import grafos.Node;

public class Fila<T> implements FilaIF {
	private int inicio;
	private int fim;
	private int size;
	private Node[] nodes;
	private static final int CAPACIDADE = 1000;
	private int capacidade;
	
	public Fila(int cap) {
		this.inicio = 0;
		this.fim = 0;
		this.size = 0;
		this.capacidade = cap;
		this.nodes = new Node[this.capacidade];
	}
	@Override
	public void enQueue(Node n) throws FilaCheiaException{
		if(this.size == nodes.length) {
			throw new FilaCheiaException();
		}
		
		this.nodes[this.fim] = n;
		if(this.fim == this.nodes.length) {
			this.fim = 1;
		} else {
			this.fim = this.fim + 1;
		}
		this.size++;
	}

	@Override
	public Node deQueue() throws FilaVaziaException {
		if(this.isEmpty()) {
			throw new FilaVaziaException();
		}
		
		Node temp = this.nodes[this.inicio];
		if(this.inicio == this.nodes.length) {
			this.inicio = 1;
		} else {
			this.inicio = this.inicio + 1;
		}
		this.size--;
		return temp;
	}

	@Override
	public int size() {
		return this.size;
	}

	@Override
	public boolean isEmpty() {
		return this.size == 0;
	}

	@Override
	public Node front() throws FilaVaziaException {
		if(this.isEmpty()) {
			throw new FilaVaziaException();
		}
		
		return this.nodes[this.inicio];
	}
	
}
