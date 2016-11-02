package dynamicqueue;

public class DynamicQueueEmptyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public DynamicQueueEmptyException() {
		super("Queue Empty.");
	}
}
