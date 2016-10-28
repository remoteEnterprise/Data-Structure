package arvorebinaria;

public class Main {

	public static void main(String[] args) {
		Node n0 = new Node(37, new Integer(10));
		Node n1 = new Node(24, new Integer(11));
		Node n2 = new Node(42, new Integer(12));
		Node n3 = new Node(7, new Integer(13));
		Node n4 = new Node(32, new Integer(14));
		Node n5 = new Node(40, new Integer(15));
		Node n6 = new Node(42, new Integer(16));
		Node n7 = new Node(2, new Integer(17));
		Node n8 = new Node(120, new Integer(18));
		Tree tree = new Tree();
		tree.inserirArvore((Tree) tree, n0);
		tree.inserirArvore((Tree) tree, n1);
		tree.inserirArvore((Tree) tree, n2);
		tree.inserirArvore((Tree) tree, n3);
		tree.inserirArvore((Tree) tree, n4);
		tree.inserirArvore((Tree) tree, n5);
		tree.inserirArvore((Tree) tree, n6);
		tree.inserirArvore((Tree) tree, n7);
		tree.inserirArvore((Tree) tree, n8);
		System.out.println(tree.predecessorArvore(tree.getRoot()).getKey());
		System.out.println(tree.getRoot().getKey());
		tree.percorrerInorder(tree.getRoot());
		System.out.println("");
		tree.percorrerPreorder(tree.getRoot());
		System.out.println("");
		tree.percorrerPosorder(tree.getRoot());
	}

}
