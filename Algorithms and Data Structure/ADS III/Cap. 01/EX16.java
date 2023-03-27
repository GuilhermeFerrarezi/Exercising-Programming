package edIII;  
import java.util.Arrays;  
public class Atividade_2_15 {  
public static void main(String[] args) {  
 int[][] nums = new int[2][3];  
 for (int r=0; r < nums.length; r++) {  
 for (int c=0; c < nums[r].length; c++)  
 nums [r][c] = c + r + 1;  
 }  
 System.out.println(Arrays.deepToString(nums));  
 }  
}  
