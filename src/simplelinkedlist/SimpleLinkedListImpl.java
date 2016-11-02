package simplelinkedlist;

public class SimpleLinkedListImpl<E> implements SimpleLinkedListIF<E> {
	private Node<E>  tail;
	private Node<E> front;
	private Node<E> nextFront;
	private int size;
	public SimpleLinkedListImpl() {
		this.tail = new Node<E>(null, null);
		this.front = null;
		this.size = 0;
	}
	
	@Override
	public boolean addFirst(E e) {
		Node<E> node = null;
		if(this.isEmpty()) {
			node = new Node<E>(e, null);
			this.tail.setPrev(node);
			this.size++;
			this.front = node;
			return true;
		}
		Node<E> last = this.tail.getPrev();
		node = new Node<E>(e, null);
		this.getTail().setPrev(node);
		node.setPrev(last);
		this.size++;
		if(this.nextFront == null) {
			this.nextFront = node;
		}
		return true;
	}

	@Override
	public Node<E> removeFirst() throws SimpleLinkedListEmptyException{
		if(this.isEmpty()) {
			throw new SimpleLinkedListEmptyException();
		}
		Node<E> firstTemp = this.front();
		this.nextFront.setPrev(null);
		this.front = this.nextFront;
		changeNextFront();
		return firstTemp;
	}

	private void changeNextFront() throws SimpleLinkedListEmptyException {
		for(Node<E> end = this.tail.getPrev(); end != this.front(); end = end.getPrev()) {
			if(end.getPrev() == this.front) {
				this.nextFront = end;
				break;
			}
		}
	}

	@Override
	public int size() {
		return this.size;
	}

	@Override
	public boolean isEmpty() {
		return this.getTail().getPrev() == null;
	}

	@Override
	public Node<E> front() throws SimpleLinkedListEmptyException{
		if(this.isEmpty()) {
			throw new SimpleLinkedListEmptyException();
		}
		return this.front;
	}

	public Node<E> getTail() {
		return this.tail;
	}

	public void setTail(Node<E> tail) {
		this.tail = tail;
	}
}
