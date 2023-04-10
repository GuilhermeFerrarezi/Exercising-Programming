package uscs;

public class main {

    public static void main(String[] args) {
        CList lista = new CList();

        lista.insertFirst(6);
        lista.insertLast(7);
        lista.insertLast(8);

        lista.printList();
        lista.printFirst();
        lista.printLast();

        lista.deleteFirst();
        lista.deleteLast();
        
        lista.printList();
    }
}
