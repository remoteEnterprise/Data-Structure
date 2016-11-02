package simplelinkedlist;

public class Main {

	public static void main(String[] args) throws SimpleLinkedListEmptyException {
		SimpleLinkedListImpl<String> list = new SimpleLinkedListImpl<String>();
		list.addFirst("Leonardo1");
		list.addFirst("Leonardo2");
		list.addFirst("Leonardo3");
		System.out.println(list.front().getData());
		list.removeFirst();
		System.out.println(list.front().getData());
		list.removeFirst();
		System.out.println(list.front().getData());
		list.removeFirst();
	}

}
