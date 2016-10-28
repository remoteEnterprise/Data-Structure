package arvorebinaria;

public interface TreeIF {
	public void percorrerInorder(Node n);
	public void percorrerPreorder(Node n);
	public void percorrerPosorder(Node n);
	public Node arvoreBusca(Node x, int key);
	public Node minArvore(Node n);
	public Node maxArvore(Node n);
	public Node predecessorArvore(Node n);
	public Node sucessorArvore(Node n);
	public void inserirArvore(Tree t, Node n);
	public void transplante(Tree t, Node oldNode, Node newNode);
	public void removerArvore(Tree t, Node z);
}
