import java.util.Scanner;

public class code45{

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        while(t-- > 0){
            int n = Sc.nextInt();
            int arr[] = new int[n];
            int d1 = 0 , d2 = 0;
            for(int i = 0; i < n; i++){
                arr[i] = Sc.nextInt();
                if(arr[i] % 3 == 1){
                    d1++;
                }
                else if(arr[i] % 3 == 2){
                    d2++;
                }
            }
            int ans = 0;
            if(d1 == d2){
                ans += d1;
            }
            else if(d1 > d2){
                ans += d2;
                int k = d1 - d2;
                if(k % 3 != 0){
                    ans = -1;
                }
                else{
                    int z = k/3;
                    int p = z * 2;
                    ans += p;
                }
            }
            else if(d2 > d1){
                ans += d1;
                int k = d2 - d1;
                if(k % 3 != 0){
                    ans = -1;
                }
                else{
                    int z = k/3;
                    int p = z * 2;
                    ans += p;
                }
            }
            System.out.println(ans);
        }
    }
}