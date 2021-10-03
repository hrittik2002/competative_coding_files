import java.util.Scanner;

public class code32{

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        while(t-- > 0){
            int n = Sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = Sc.nextInt();
            }
            System.out.println(n);

            int l = 0 , r = 0 , d;

            while(l < n){
                int L = l + 1;
                r = findMin(l , n , arr);
                int R = r + 1;
                d = R - L;
                System.out.println(L + " " + R + " " + d);
                l++;
            }

        }
    }

    private static int findMin(int l, int n, int[] arr) {
        int min = Integer.MAX_VALUE;
        int ans = -1;
        for(int i = l; i < n; i++){
            if(arr[i] < min){
                min = arr[i];
                ans = i;
            }
        }
        return ans;
    }
}
