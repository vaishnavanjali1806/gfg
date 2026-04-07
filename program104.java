import java.util.*;;
public class program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String sender[] = new String[n];
        String receiver[] = new String[n];
        int amount[] =new int[n];
        int time[] = new int[n];

        for(int i = 0; i < n; i++){
            sender[i] = sc.next();
            receiver[i] = sc.next();
            amount[i] = sc.nextInt();
            time[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                   if(sender[i].equals(sender[j]) &&
                   receiver[i].equals(receiver[j]) &&
                   amount[i] == amount[j] &&
                   time[j] - time[i] <= 60){

                      System.out.println(sender[j]+" "+receiver[j]+" "+amount[j]+" "+time[j]);

            }
        }
    }
    }
}

