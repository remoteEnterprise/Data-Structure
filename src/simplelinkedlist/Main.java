package simplelinkedlist;

public class Main {

	public static void main(String[] args) throws SimpleLinkedListEmptyException {
		SimpleLinkedListImpl<String> list = new SimpleLinkedListImpl<String>();
		list.addFirst("Leonardo1");
		list.addFirst("Leonardo2");
		list.addFirst("Leonardo3");
		list.addFirst("Leonardo4");
		list.addFirst("Leonardo5");
		list.addFirst("Leonardo6");
		System.out.println(list.front().getData());
		System.out.println(list.removeFirst().getData());
		System.out.println(list.front().getData());
		System.out.println(list.removeFirst().getData());
		System.out.println(list.front().getData());
		System.out.println(list.removeFirst().getData());
		System.out.println(list.front().getData());
		System.out.println(list.removeFirst().getData());
		System.out.println(list.front().getData());
		System.out.println(list.removeFirst().getData());
		System.out.println(list.front().getData());
		System.out.println(list.removeFirst().getData());
	}

}
