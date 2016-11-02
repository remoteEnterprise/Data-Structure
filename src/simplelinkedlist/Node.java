package simplelinkedlist;

public class Node<E> {
	private E data;
	private Node<E> prev;
	
	public Node(E data, Node<E> prev) {
		this.data = data;
		this.prev = prev;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	public Node<E> getPrev() {
		return this.prev;
	}

	public void setPrev(Node<E> prev) {
		this.prev = prev;
	}
}
