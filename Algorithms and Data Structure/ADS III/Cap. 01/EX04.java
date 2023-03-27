package edIII;  
public class Atividade_2_4 {  
public static void main(String[] args) {  
  
 int[] x = new int[5];  
 int[] y = new int[8];  
  
 for (int i=1; i<x.length; i++) {  
 x[i] = x[i-1] + 2;  
 y[i] = x[i];  
 }  
 for (int i=0; i<y.length ; i++)  
 System.out.print(y[i] + " ");  
 }  
  
}
