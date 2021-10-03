import java.util.*;

public class code11{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        while(t-- > 0){
            int n = Sc.nextInt();
            int[] arr = new int[n];
            int arr_sum = 0;
            for(int i = 0; i < n; i++){
                arr[i] = Sc.nextInt();
                arr_sum += arr[i];
            }
            if(arr_sum == n){
                System.out.println(0);
            }
            else if(arr_sum < n){
                System.out.println(1);
            }
            else{
                System.out.println(arr_sum - n);
            }
            

        }
    }
}
