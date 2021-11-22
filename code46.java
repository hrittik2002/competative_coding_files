import java.util.Scanner;

public class code46{

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        while(t-- > 0){
            int n = Sc.nextInt();
            int a[] = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = Sc.nextInt();
            }
            int ans = 0 , sum = 0;
            for(int i = 0; i < n; i ++){
                ans = 0;
                for(int j = i + 1; j < n; j++){
                    int pos = a[j] - a[i];
                    int pos2 = a[n-1] - a[j];
                    int val = pos * pos2;
                    ans = Math.max(ans , val);
                    sum = sum + ans;
                }
            }
            System.out.println(sum);
        }
    }
}
