package linkedlist;

public interface LinkedListIF {
	public void addFirst(Node n);
	public void addLast(Node n);
	public Node removeFirst();
	public Node removeLast();
	public Node getFirst() throws ListaVaziaException;
	public Node getLast() throws ListaVaziaException;
	public Node getProx(Node n) throws ListaVaziaException;
	public Node getAnt(Node n) throws ListaVaziaException;
	public int size();
	public boolean isEmpty();
	public void percorrerLista() throws ListaVaziaException;
	public Node get(int index) throws ListaVaziaException;
	
}
