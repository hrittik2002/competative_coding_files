import java.util.*;

public class code13{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        while(t-- > 0){
            long n = Sc.nextLong();
            long s = Sc.nextLong();

            long mid = (n + 1) / 2;
            mid = n - (mid - 1);
            long ans = s /mid;
            System.out.println(ans);

           
            

        }
    }
}