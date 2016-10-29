package arvorebinaria;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Tree tree = new Tree();
		Node[] nodes = new Node[1000000];
		
		for(int i = 0; i < nodes.length; i++) {
			nodes[i] = new Node(i, "");
		}
		
		embaralhar(nodes);
		
		for(int i = 0; i < nodes.length; i++) {
			tree.inserirArvore(tree, nodes[i]);
		}
//		System.out.println(tree.predecessorArvore(tree.getRoot()).getKey());
		System.out.println(tree.getRoot().getKey());
//		tree.percorrerInorder(tree.getRoot());
//		System.out.println("");
//		tree.percorrerPreorder(tree.getRoot());
//		System.out.println("");
//		tree.percorrerPosorder(tree.getRoot());
	}
	
	public static Node Vetor2Arvore(Node[] nodes, int ini, int fim) {
		if(ini > fim) {
			return null;
		}
		int mid = ini + (fim - ini) / 2;
		Node x = nodes[mid];
		x.setLeftSon(Vetor2Arvore(nodes, ini, mid-1));
		x.setRightSon(Vetor2Arvore(nodes, mid+1, fim));
		return x;
	}
	
	public static void embaralhar(Node[] nodes) {
		int n = nodes.length;
		Random rand = new Random();
		for(int i = 0; i < n; i++) {
			int r = rand.nextInt(n);
			Node temp = nodes[i];
			nodes[i] = nodes[r];
			nodes[r] = temp;
		}
	}

}
