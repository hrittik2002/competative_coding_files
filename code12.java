import java.util.*;

public class code12{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        while(t-- > 0){
            int n = Sc.nextInt();
            n = 2 * n;
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = Sc.nextInt();
            }
            int count_odd = 0 , count_even = 0;
            for(int i = 0; i < n; i++){
                if((arr[i] & 1) == 1){
                    count_odd++;
                }
                else{
                    count_even++;
                }
            }
            if(count_even == count_odd){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
           
            

        }
    }
}
