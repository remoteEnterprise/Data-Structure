package arvorebinaria;

public class Node {
	private int key;
	private Object data;
	private Node father;
	private Node leftSon;
	private Node rightSon;
	
	public Node(int key, Object data) {
		this.key = key;
		this.data = data;
		this.father = null;
		this.leftSon = null;
		this.rightSon = null;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Node getFather() {
		return father;
	}

	public void setFather(Node father) {
		this.father = father;
	}

	public Node getLeftSon() {
		return leftSon;
	}

	public void setLeftSon(Node leftSon) {
		this.leftSon = leftSon;
	}

	public Node getRightSon() {
		return rightSon;
	}

	public void setRightSon(Node rightSon) {
		this.rightSon = rightSon;
	}
	
	public boolean isLeaf() {
		return (this.leftSon == null) && (this.rightSon == null);
	}
	
}
