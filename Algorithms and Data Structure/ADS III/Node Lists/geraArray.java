import java.util.Arrays;

public Integer[] geraArray() {

    DListNode no_trab = this.head;
    Integer[] arr = new Integer[this.size];
    
    if (this.size == 0){
        return null;
    }
    else {
        for(int i = 0; i < this.size; i++){
            arr[i] = no_trab.item;
            no_trab = no_trab.next;
    }
     return arr;
    }
}
