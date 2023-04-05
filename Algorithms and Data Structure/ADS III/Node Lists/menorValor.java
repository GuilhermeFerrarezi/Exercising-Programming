import java.util.Arrays;

public Integer menorValor() {

		if (this.size < 2) {

			return null;
		}
		else {

			Node no_trab = this.head;
                       int arr[] = ;

            for (int i = 0; no_trab != null; i++){
                if (no_trab % 2 == 0){
                    arr[i] = no_trab;
                    no_trab = no_trab.next;
                }
            } 
			
            Arrays.sort(arr);

            int menor = arr[0];
            return menor;
}
}
