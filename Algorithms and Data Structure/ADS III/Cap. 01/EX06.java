package edIII;  
import java.util.Arrays;  
public class Atividade_2_6 {  
public static void main(String[] args) {  
  
 int[] x = new int[3];  
 for (int i=1; i<x.length; i++) {  
 x[i] = x[i-1] + 2;  
 }  
 int[] y = Arrays.copyOf(x, 5);  
  
 for (int i=0; i<y.length; i++)  
 System.out.print(y[i] + " ");  
 }  
}  
