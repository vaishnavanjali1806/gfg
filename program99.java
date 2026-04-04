import java.util.*;
public class program64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int n = sc.nextInt();
         double happy = N;
         double sad = 0;

         for(int i = 0; i < n; i++){
            double newHappy = 0.3 * happy + 0.5 * sad;
            double newSad = 0.7 * happy + 0.5 * sad;

           happy = newHappy ;
           sad =  newSad;
         }
         System.out.println((int) happy + "  "+ (int) sad);
    }
}
