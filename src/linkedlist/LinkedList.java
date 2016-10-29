package linkedlist;

public class LinkedList implements LinkedListIF {
	private Node cabeca;
	private Node cauda;
	private int size;
	
	public LinkedList() {
		this.cabeca = new Node();
		this.cauda = new Node();
		this.cabeca.setProx(this.cauda);
		this.cauda.setAnt(this.cabeca);
		this.size = 0;
	}

	@Override
	public void addFirst(Node n) {
		Node p = this.cabeca.getProx();
		this.cabeca.setProx(n);
		p.setAnt(n);
		n.setProx(p);
		this.size++;
	}

	@Override
	public void addLast(Node n) {
		Node p = this.cauda.getAnt();
		this.cauda.setAnt(n);
		n.setProx(this.cauda);
		p.setProx(n);
		n.setAnt(p);
		this.size++;
	}

	@Override
	public Node removeFirst() {
		Node temp = this.cabeca.getProx();
		this.cabeca.setProx(temp.getProx());
		temp.getProx().setAnt(this.cabeca);
		this.size--;
		return temp;
	}

	@Override
	public Node removeLast() {
		Node temp = this.cauda.getAnt();
		this.cauda.setAnt(temp.getAnt());
		temp.getAnt().setProx(this.cauda);
		this.size--;
		return temp;
	}

	@Override
	public Node getFirst() throws ListaVaziaException {
		if(this.isEmpty()) {
			throw new ListaVaziaException();
		}
		return this.cabeca.getProx();
	}

	@Override
	public Node getLast() throws ListaVaziaException {
		if(this.isEmpty()) {
			throw new ListaVaziaException();
		}
		return this.cauda.getAnt();
	}

	@Override
	public Node getProx(Node n) throws ListaVaziaException {
		if(n.equals(this.cabeca)) {
			throw new ListaVaziaException();
		}
		return n.getProx();
	}

	@Override
	public Node getAnt(Node n) throws ListaVaziaException {
		if(n.equals(this.cauda)) {
			throw new ListaVaziaException();
		}
		
		return n.getAnt();
	}

	@Override
	public int size() {
		return this.size;
	}

	@Override
	public boolean isEmpty() {
		return this.size == 0;
	}
	
	@Override
	public void percorrerLista() throws ListaVaziaException {
		this.percorrerLista(this.cabeca.getProx());
	}
	
	private void percorrerLista(Node ini) throws ListaVaziaException {
		if(this.isEmpty()) {
			throw new ListaVaziaException();
		}
		
		if(ini.getProx() == null) {
			return;
		}
		System.out.println(ini.getData()+" -> ");
		percorrerLista(ini.getProx());
	}

	@Override
	public Node get(int index) throws ListaVaziaException {
		return this.get(index, this.cabeca.getProx());
	}
	
	private Node get(int index, Node ini) throws ListaVaziaException {
		if(this.isEmpty()) {
			throw new ListaVaziaException();
		}
		
		if(index == 0) {
			return ini;
		}
		
		return get(index--, ini.getProx());
		
	}
}
