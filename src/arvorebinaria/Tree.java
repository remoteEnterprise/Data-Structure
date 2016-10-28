package arvorebinaria;

public class Tree implements TreeIF {
	private Node root;
	
	public Tree() {
		this.root = null;
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	@Override
	public void percorrerInorder(Node n) {
		if (n != null) {
			percorrerInorder(n.getLeftSon());
			System.out.println(n.getKey());
			percorrerInorder(n.getRightSon());
		}
	}

	@Override
	public void percorrerPreorder(Node n) {
		if(n != null) {
			System.out.println(n.getKey());
			percorrerPreorder(n.getLeftSon());
			percorrerPreorder(n.getRightSon());
		}	
	}

	@Override
	public void percorrerPosorder(Node n) {
		if(n != null) {
			percorrerPosorder(n.getLeftSon());
			percorrerPosorder(n.getRightSon());
			System.out.println(n.getKey());
		}
		
	}

	@Override
	public Node arvoreBusca(Node x, int key) {
		if(x == null || key == x.getKey()) {
			return x;
		}
		if(key < x.getKey()) {
			return arvoreBusca(x.getLeftSon(), key);
		} else {
			return arvoreBusca(x.getRightSon(), key);
		}
	}

	@Override
	public Node minArvore(Node n) {
		while(n.getLeftSon() != null) {
			n = n.getLeftSon();
		}
		return n;
	}

	@Override
	public Node maxArvore(Node n) {
		while(n.getRightSon() != null) {
			n = n.getRightSon();
		}
		return n;
	}

	@Override
	public Node predecessorArvore(Node n) {
		Node y = null;
		if(n.getLeftSon() != null) {
			return maxArvore(n.getLeftSon());
		}
		y = n.getFather();
		
		while(y != null && n == y.getLeftSon()) {
			n = y;
			y = y.getFather();
		}
		return y;
	}

	@Override
	public Node sucessorArvore(Node n) {
		Node y = null;
		if(n.getRightSon() != null) {
			return minArvore(n.getRightSon());
		}
		y = n.getFather();
		while(y != null && n == y.getRightSon()) {
			n = y;
			y = y.getFather();
		}
		return y;
	}

	@Override
	public void inserirArvore(Tree t, Node n) {
		Node y = null;
		Node x = t.getRoot();
		
		while(x != null) {
			y = x;
			if(n.getKey() < x.getKey()) {
				x = x.getLeftSon();
			} else {
				x = x.getRightSon();
			}
		}
		
		n.setFather(y);
		if(y == null) {
			t.setRoot(n);
		} else {
			if(n.getKey() < y.getKey()) {
				y.setLeftSon(n);
			} else {
				y.setRightSon(n);
			}
		}
	}

	@Override
	public void transplante(Tree t, Node oldNode, Node newNode) {
		if(oldNode.getFather() == null) {
			t.setRoot(newNode);
		} else {
			if(oldNode == oldNode.getFather().getLeftSon()) {
				oldNode.getFather().setLeftSon(newNode);
			} else {
				oldNode.getFather().setRightSon(newNode);
			}
		}
		
		if(newNode != null) {
			newNode.setFather(oldNode.getFather());
		}
	}

	@Override
	public void removerArvore(Tree t, Node z) {
		if(z.getLeftSon() == null) {
			transplante(t, z, z.getRightSon());
		} else {
			if(z.getRightSon() == null) {
				transplante(t, z, z.getLeftSon());
			} else {
				Node y = minArvore(z.getRightSon());
				if(y.getFather() != z) {
					transplante(t, y, y.getRightSon());
					y.setRightSon(z.getRightSon());
					y.getRightSon().setFather(y);
				}
				transplante(t, z, y);
				y.setLeftSon(z.getLeftSon());
				y.getLeftSon().setFather(y);
			}
		}
	}
	
}
