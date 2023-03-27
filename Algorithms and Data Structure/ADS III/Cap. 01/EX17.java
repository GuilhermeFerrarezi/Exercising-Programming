package edIII;  
import java.util.Arrays;  
public class Atividade_2_17 {  
public static void main(String[] args) {  
 int NMAX = 3;  
 int [][] mt = new int[NMAX] [];  
 for (int n=0; n < NMAX ; n++ )  
 mt[n] = new int[n+1];  
 for (int n=0; n<mt.length; n++) {  
 for (int k=0; k < mt[n].length; k++)  
 mt[n][k] = n + k;  
 }  
 System.out.println(Arrays.deepToString(mt)) ;  
  
 }  
}  
