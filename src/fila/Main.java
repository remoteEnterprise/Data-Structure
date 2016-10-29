package fila;

import grafos.Node;

public class Main {
	public static void main(String[] args) {
		Fila fila = new Fila(3);
		Node n0 = new Node(0);
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		
		try {
			fila.enQueue(n0);
			fila.enQueue(n1);
			fila.enQueue(n2);
			System.out.println(fila.front().getNum());
			System.out.println(fila.size());
		} catch(FilaCheiaException | FilaVaziaException e ) {
			e.printStackTrace();
		}
	}
}
