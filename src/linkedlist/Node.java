package linkedlist;

public class Node {
	private Object data;
	private Node prox;
	private Node ant;
	
	public Node(Object data, Node prox, Node ant) {
		this.data = data;
		this.prox = prox;
		this.ant = ant;
	}
	
	public Node() {
		this(null, null, null);
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Node getProx() {
		return prox;
	}

	public void setProx(Node prox) {
		this.prox = prox;
	}

	public Node getAnt() {
		return ant;
	}

	public void setAnt(Node ant) {
		this.ant = ant;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		if (ant == null) {
			if (other.ant != null)
				return false;
		} else if (!ant.equals(other.ant))
			return false;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (prox == null) {
			if (other.prox != null)
				return false;
		} else if (!prox.equals(other.prox))
			return false;
		return true;
	}
}
