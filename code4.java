import java.util.*;

public class code4 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        while(t-- > 0){
            long n = Sc.nextLong();
            long ans = (n+1) / 10;
            System.out.println(ans);
        }
    }    
}

