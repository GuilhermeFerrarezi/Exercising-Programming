package CList;

public class CListNode {
    int item;
    CListNode next;
    CListNode prev;

    //constrtur para node nulo
    public CListNode(){
        this.item = 0;
        this.next = null;
        this.prev = null;
    }

    //constrtor para lista com node único (sem prev nem next)
    public CListNode(int item){
        this.item = item;
        this.next = null;
        this.prev = null;
    }
    //constrtor para novo node completo
    public CListNode(int item, CListNode next, CListNode prev){
        this.item = item;
        this.next = next;
        this.prev = prev;
    }

    
}
