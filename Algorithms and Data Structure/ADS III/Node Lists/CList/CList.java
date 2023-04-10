package uscs;

public class CList{
    int size;
    CListNode head;

    public CList(){
        CListNode sentinela = new CListNode();
        this.size = 0;
        this.head = sentinela;
        sentinela.next = sentinela;
        sentinela.prev = sentinela;
    }

    public void printFirst(){
        
        if(this.size == 0){
            System.out.println("Lista vazia!");
        }

        else{
            System.out.println("O primeiro item é: "+ this.head.next.item);
        }
    }

    public void printLast(){
        
        if(this.size == 0){
            System.out.println("Lista vazia!");
        }

        else{
            System.out.println("O último item é: "+ this.head.prev.item);
        }
    }

    public void printList(){

        if (this.size == 0)
            System.out.println("Lista vazia...");

        else {
            int cont = 1;
            CListNode no_trab = this.head.next;

            System.out.println("Lista: ");

            while (cont <= this.size){
                System.out.printf("%d ", no_trab.item);
                no_trab = no_trab.next;
                cont++;
        }
    }
    }

    public void insertFirst(int item){
        CListNode node = new CListNode(item);

        if(this.size == 0){
                //define next e prev da sentinela
                this.head.next = node;
                this.head.prev = node;

                //define next e prev do novo node
                node.next = this.head;
                node.prev = this.head;
                this.size++;
            }

        else{
                //define next e prev do node
                node.next = this.head.next;
                node.prev = this.head;
                //encaixa node entre head e ex-primeiro item
                this.head.next.prev = node;
                this.head.next = node;

                this.size++;
        }
    }

        public void insertLast(int item){
            CListNode node = new CListNode(item);
    
            if(this.size == 0){
                    //define next e prev da sentinela
                    this.head.next = node;
                    this.head.prev = node;
    
                    //define next e prev do novo node
                    node.next = this.head;
                    node.prev = this.head;

                    this.size++;
                }
    

            else{
                //define next e prev do node
                node.next = this.head;
                node.prev = this.head.prev;

                //encaixa node entre head e ex-primeiro item
                this.head.prev.next = node;
                this.head.prev = node;

                this.size++; 
            }
        }

            public void deleteFirst() {
                if(this.size == 0) 
                    System.out.println("Lista vazia");

                else if(this.size == 1){
                    this.head.next = this.head;
                    this.head.prev = this.head;
                    this.size--;

                }
                else{
                    this.head.next.next.prev = this.head;
                    this.head.next = this.head.next.next;
                    this.size--;
                }
            }

            public void deleteLast() {
                if(this.size == 0) {
                    System.out.println("Lista vazia");
                }
                else if(this.size == 1) {
                    this.head.prev = this.head;
                    this.head.next = this.head;
                    this.size--;
                }
                else{
                    this.head.prev.prev.next = this.head;
                    this.head.prev = this.head.prev.prev;
                    this.size--;
                }
            }

}
