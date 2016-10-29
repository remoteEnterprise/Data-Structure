package grafos;

public class Node {
	private int num;
	private Node predecessor;
	private int distancia;
	private String cor;
	
	public Node(int num) {
		this.num = num;
		this.predecessor = null;
		this.distancia = 999999999;
		this.cor = "BRANCO";
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
}
