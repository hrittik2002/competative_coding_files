import java.util.*;

public class code15{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        while(t-- > 0){
            int n = Sc.nextInt();
            String val = Sc.next();
            long ans = 0;
            for(int i = n-1; i >= 0; i--){
                char x =val.charAt(i);
                if(i == n - 1){
                    ans += Character.getNumericValue(x);   
                }
                else if(x != '0'){
                    ans++;
                    ans += Character.getNumericValue(x);  
                }
            }
            System.out.println(ans);
        }
    }
}