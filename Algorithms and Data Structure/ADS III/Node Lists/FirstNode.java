package uscs;

public class Node {
	int item;
	Node next;


public Node() {
	this.item = 0;
	this.next = null;
}

public Node(int item) {
	this.item = item;
	this.next = null;
}

public void Imprime_Lista() {
	Node x = this;
	
	while (x!=null) {
		System.out.println("  "+x.item);
		x = x.next;
	}
}

public void Insert_Item(int item) {
	Node y = new Node(item);
	y.next = this.next;
	this.next = y;
}

public void Deleta_Prox_Item() {
	this.next = this.next.next;
}

public void Altera_Item(int item) {
	this.item = item;
}
}

public class Main {
	public static void main(String[] args) {
		Node n1 = new Node(8);
		Node n2 = new Node(5);
		Node n3 = new Node(9);
		
		n1.next = n2;
		n2.next = n3;
		
		n1.Imprime_Lista();
		
		n1.Deleta_Prox_Item();
		
		n1.Imprime_Lista();
		
		n3.Insert_Item(7);
		
		n1.Imprime_Lista();
	}
}
