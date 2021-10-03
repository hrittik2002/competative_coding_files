
import java.util.Arrays;
import java.util.Scanner;

public class code20 {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        while (t-- > 0) {
            int a = Sc.nextInt();
            int b = Sc.nextInt();
            int c = Sc.nextInt();
            int m = Sc.nextInt();

            int arr[] = {a , b , c};
            Arrays.sort(arr);

            if(m > (a-1 + b-1 + c-1)){
                System.out.println("NO");
            }
            else{
                int k = arr[2] - (arr[1] + arr[0] + 1);
                if(m >= k){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }



        }

    }
}
