import java.util.*;

public class code3 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        while(t-- > 0){
            int n = Sc.nextInt();
            long arr[] = new long[n];
            for(int i = 0; i < n; i++){
                arr[i] = Sc.nextLong();
            }
            long ans = Long.MIN_VALUE;
            for(int i = 1; i < n; i++){
                long x = arr[i] * arr[i-1];
                if(x > ans) ans = x;
            }
            System.out.println(ans);
        }
    }    
}
