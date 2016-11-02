package simplelinkedlist;

/**
 * Adapted for Queue
 * @author Leonardo
 *
 * @param <E>
 */
public interface SimpleLinkedListIF<E> {
	public boolean addFirst(E e);
	public Node<E> removeFirst() throws SimpleLinkedListEmptyException;
	public int size();
	public boolean isEmpty();
	public Node<E> front() throws SimpleLinkedListEmptyException;
}
