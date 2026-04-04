import java.util.*;
public class program65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double distance = sc.nextInt();
        double time = sc.nextInt();
         
        double speed = distance/ (time/60);
         System.out.println(speed);
    }
    
}
