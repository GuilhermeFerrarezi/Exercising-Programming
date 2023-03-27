package edIII;  
import java.util.Arrays;  
public class Atividade_2_11 {  
public static void main(String[] args) {  
  
 int[] x = new int[] { 3, 1, 6, 2, 9, 5, 0} ;  
  
 Arrays.sort(x);  
  
 int entrada = Integer.parseInt(args[0]);  
  
 if (Arrays.binarySearch(x, entrada) < 0 )  
 System.out.println("Valor nao encontrado...");   else  
 System.out.println("Valor encontrado...");  
  
 }  
}  
