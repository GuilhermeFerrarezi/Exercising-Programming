package edIII;  
import java.util.Arrays;  
public class Atividade_2_3 {  
public static void main(String[] args) {  
  
 int[] x = new int[5];  
 int[] y = x;  
  
 for (int i=0; i<x.length; i++) {  
 x[i] = i+2;  
 y[i] = x[i];  
 }  
 System.out.println(Arrays.toString(y));  
 }  
}
