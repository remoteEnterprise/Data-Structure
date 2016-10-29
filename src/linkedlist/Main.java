package linkedlist;

public class Main {

	public static void main(String[] args) throws ListaVaziaException {
		LinkedList lista = new LinkedList();
		Node n = new Node();
		Node n2 = new Node();
		Node n3 = new Node();
		n.setData("LEONARDO");
		n2.setData("CAMILA");
		n3.setData("CAIO");
		lista.addFirst(n3);
		lista.addFirst(n);
		lista.addLast(n2);
		System.out.println(lista.get(0).getData());
//		System.out.println(lista.getFirst().getData());
//		System.out.println(lista.removeFirst().getData());
//		System.out.println(lista.getFirst().getData());
		lista.percorrerLista();
	}
}
