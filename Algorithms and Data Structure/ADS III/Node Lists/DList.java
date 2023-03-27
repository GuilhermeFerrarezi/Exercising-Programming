package uscs;

public class DList {

	int size;
	DListNode head;
	DListNode tail;
	
	public DList(int item) {
		DListNode no_trab = new DListNode(item);
		this.size = 1;
		this.head = no_trab;
		this.tail = no_trab;
	}
	
	public DList() {
		this.size = 0;
		this.head = null;
		this.tail = null;
	}
	
	public void imprime_First() {
		if(this.head == null){
			System.out.println("Lista vazia");
		}else {
			System.out.println(this.head.item);
		}
	}
	
	public void imprime_Last() {
		if(this.tail == null) {
			System.out.println("Lista vazia");
		}else {
			System.out.println(this.tail.item);
		}
	}
	
	public void insereFim(int item) {
		DListNode no_trab = new DListNode(item);
		if(this.size == 0) {
			this.head = no_trab;
			this.tail = no_trab;
		}else {
			no_trab.prev = this.tail;
			this.tail.next = no_trab;
			this.tail = no_trab;
		}
		this.size++;
	}
	
	public void insereInicio(int item) {
		DListNode no_trab = new DListNode(item);
		if(this.size == 0) {
			this.head = no_trab;
			this.tail = no_trab;
		}else {
			no_trab.next = this.head;
			this.head.prev = no_trab;
			this.head = no_trab;
		}
		this.size++;
	}
	
	public void imprimeLista() {
		if(this.size == 0) {
			System.out.println("Lista Vazia");
		}else {
			DListNode no_trab = this.head;
			for(int i = 0; i < this.size; i++) {
				System.out.println(no_trab.item);
				no_trab = no_trab.next;
			}
		}
	}
	
	public void imprimeLista2() {
		if(this.size == 0) {
			System.out.println("Lista Vazia");
		}else {
			DListNode no_trab = this.tail;
			for(int i = this.size; i > 0; i--) {
				System.out.println(no_trab.item);
				no_trab = no_trab.prev;
			}
		}
		
	}
	
	public void deleteFirst() {
		if(this.size == 0) {
			System.out.println("Lista Vazia");
		}else {
			this.head = this.head.next;
			this.head.prev = null;
			this.size--;
		}
	}
	
	public void deleteLast() {
		if(this.size == 0) {
			System.out.println("Lista Vazia");
		}else {
			this.tail = this.tail.prev;
			this.tail.next = null;
			this.size--;
		}
	}
	
	public double MediaLista() {
		if(this.size == 0) {
			System.out.println("Lista Vazia");
			return 0;
		}else {
			double media = 0;
			DListNode no_trab = this.head;
			for(int i = 0; i < this.size; i++) {
				media += no_trab.item;
				no_trab = no_trab.next;
			}
			return media/this.size;
		}
	}
	
	public void DobraValores() {
		if(this.size == 0) {
			System.out.println("Lista Vazia");
		}else {
			DListNode no_trab = this.head;
			for(int i = 0; i < this.size; i++) {
				no_trab.item *= 2;
				no_trab = no_trab.next;
			}
		}
	}
	
	public Integer RetornaSegundoItem() {
		if(this.size < 2) {
			return null;
		}else {
			return this.head.next.item;
		}
	}
	
	public DListNode[] GeraArray() {
		if(this.size == 0) {
			System.out.println("Lista Vazia");
			return null;
		}else {
			DListNode[] no_trab = new DListNode[this.size];
			DListNode no_trab2 = this.head;
			for(int i = 0; i < this.size; i++) {
				no_trab[i] = no_trab2;
				no_trab2 = no_trab2.next;
			}
			return no_trab;
		}
	}
	
	public boolean SearchLista(int valor) {
		if(this.size == 0) {
			System.out.println("Lista Vazia");
		}else {
			DListNode no_trab = this.head;
			for(int i = 0; i < this.size; i++) {
				if(no_trab.item == valor) {
					return true;
				}
				no_trab = no_trab.next;
			}
		}
		return false;
	}
}



public class DListNode {

	int item;
	DListNode next;
	DListNode prev;
	
	public DListNode(int item) {
		this.item = item;
		this.next = null;
		this.prev = null;
	}
}



public class Main {

	public static void main(String[] args) {
		
		DList x = new DList(12);
		DListNode[] a;
		x.insereInicio(41);
		x.insereFim(53);
		x.insereInicio(535);
		x.insereFim(6435);
		x.imprime_First();
		x.imprime_Last();
		System.out.println("");
		x.imprimeLista();
		System.out.println("");
		x.imprimeLista2();
		System.out.println("");
		x.DobraValores();
		x.imprimeLista();
		System.out.println("");
		x.RetornaSegundoItem();
		if (x.SearchLista(0)) {
			System.out.println("sim");
		}else {
			System.out.println("nao");
		}
		if (x.SearchLista(82)) {
			System.out.println("sim");
		}else {
			System.out.println("nao");
		}
		System.out.println("");
		x.imprimeLista();
		x.deleteFirst();
		x.deleteLast();
		System.out.println("");
		x.imprimeLista();
		System.out.println("");
		System.out.println(x.MediaLista());
		System.out.println("");
		a = x.GeraArray();
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i].item);
		}
		
	}
	
}
