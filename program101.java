import java.util.*;
public class program66 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();

            
        }
        int maxSum = arr[0];
        int currentSum =0;
         
        for(int i = 0; i < n; i++){
            currentSum = currentSum + arr[i];
            if(currentSum > maxSum){
             maxSum = currentSum;
        }
        if(currentSum < 0){
            currentSum = 0;
        }


    }
      System.out. println(maxSum);
    
}
}
