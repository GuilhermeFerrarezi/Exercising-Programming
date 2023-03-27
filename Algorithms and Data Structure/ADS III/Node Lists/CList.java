public class CList {
	
	int size;
	CListNode head;
	
	public CList() {
		this.size = 0;
		head = new CListNode();
		head.next = head;
		head.prev = head;
	}
	
	public void imprimeFirst() {
		if(this.size == 0) {
			System.out.println("Lista vazia");
		}else{
			System.out.println(this.head.next.item);
		}
	}
	
	public void imprimeLast() {
		if(this.size == 0) {
			System.out.println("Lista vazia");
		}else {
			System.out.println(this.head.prev.item);
		}
	}
	
	public void insereFirst(int item) {
		CListNode no_trab = new CListNode(item);
		if(this.size == 0) {
			no_trab.next = this.head;
			no_trab.prev = this.head;
			this.head.next = no_trab;
			this.head.prev = no_trab;
			this.size++;
		}else {
			no_trab.next = this.head.next;
			no_trab.prev = this.head;
			this.head.next.prev = no_trab;
			this.head.next = no_trab;
			this.size++;
		}
	}
	
	public void insereLast(int item) {
		CListNode no_trab = new CListNode(item);
		if(this.size == 0) {
			no_trab.next = this.head;
			no_trab.prev = this.head;
			this.head.next = no_trab;
			this.head.prev = no_trab;
			this.size++;
		}else {
			no_trab.next = this.head;
			no_trab.prev = this.head.prev;
			this.head.prev.next = no_trab;
			this.head.prev = no_trab;
			this.size++;
		}
	}
	
	public void imprimeLista() {
		CListNode no_trab = this.head.next;
		if(this.size == 0) {
			System.out.println("Lista vazia");
		}else {
			for(int i = 0; i < this.size; i++) {
				System.out.printf("%d ", no_trab.item);
				no_trab = no_trab.next;
			}
		System.out.println();
		}
	}
	
	public void deleteFirst() {
		if(this.size == 0) {
			System.out.println("Lista vazia");
		}else if(this.size == 1){
			this.head.next = this.head;
			this.head.prev = this.head;
			this.size--;
		}else {
			this.head.next.next.prev = this.head;
			this.head.next = this.head.next.next;
			this.size--;
		}
	}
	
	public void deleteLast() {
		if(this.size == 0) {
			System.out.println("Lista vazia");
		}else if(this.size == 1) {
			this.head.prev = this.head;
			this.head.next = this.head;
			this.size--;
		}else {
			this.head.prev.prev.next = this.head;
			this.head.prev = this.head.prev.prev;
			this.size--;
		}
	}
