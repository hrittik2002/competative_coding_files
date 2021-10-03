import java.util.*;
import java.text.DecimalFormat;
public class code2 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        while(t-- > 0){
            int n = Sc.nextInt();
            long max = Long.MIN_VALUE;
            long sum = 0;
            long arr[] = new long[n];
            for(int i = 0; i < n; i++){
                arr[i] = Sc.nextLong();
                sum += arr[i];
                if(arr[i] > max) {
                    max = arr[i];
                } 
            }
            sum = sum - max;
            double ans = (double) ((double) sum / (double) (n-1)) + (double) max;
            DecimalFormat dec = new DecimalFormat("#0.000000000");
            System.out.println(dec.format(ans));
        }
    }
    
}
