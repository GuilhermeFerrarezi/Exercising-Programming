import java.util.Arrays;

public Integer retornaDoisMaioresValores() {

		if (this.size < 2) {

			return null;

		}

		else {

			Node no_trab = this.head;
                       int arr[] = {};

            for (int i = 0; no_trab != null; i++){
                    arr[i] = no_trab;
                    no_trab = no_trab.next;
            } 
			
            Arrays.sort(arr);

            int maior = arr[lenght - 1];
            int maior2 = arr[lenght - 2];

            return maior;
			}

			}
