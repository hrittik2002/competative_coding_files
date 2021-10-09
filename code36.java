import java.util.Arrays;
import java.util.Scanner;

public class code36{

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        while(t-- > 0){
            int n = Sc.nextInt();
            int H = Sc.nextInt();
            int arr[] = new int[n];
            int max = Integer.MIN_VALUE;
            int sndmax = Integer.MIN_VALUE;
            for(int i = 0; i < n; i++){
                arr[i] = Sc.nextInt();
                if(arr[i] > max){
                    sndmax = max;
                    max = arr[i];
                }
                else if(arr[i] > sndmax){
                    sndmax = arr[i];
                }
            }
            

            int ans = 0;
            int j = max;
            while(H > 0){
                H = H - j;
                if(j == max){
                    j = sndmax;
                }
                else if(j == sndmax){
                    j = max;
                }
                ans++;
            }
            System.out.println(ans);
        }
    }
}
