package edIII;  
import java.util.Arrays;  
public class Atividade_2_5 {  
public static void main(String[] args) {  
  
 int[] x = new int[3];  
 int[] y = new int[5];  
  
 for (int i=1; i<x.length; i++) {  
 x[i] = x[i-1] + 2;  
 y[i] = x[i];  
 }  
 System.out.println(Arrays.toString(y));  
 }  
}  
