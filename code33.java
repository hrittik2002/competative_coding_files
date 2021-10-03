import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class code33{

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        while(t-- > 0){
            int n = Sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = Sc.nextInt();
            }

            Deque<Integer> dq = new ArrayDeque<>();
            dq.add(arr[0]);
            for(int i = 1; i < n; i++){
                int hrittik = dq.peekFirst();
                if(arr[i] <= hrittik){
                    dq.offerFirst(arr[i]);
                }
                else{
                    dq.offerLast(arr[i]);
                }
            }
            while(dq.isEmpty() == false){
                int hrittik = dq.peekFirst();
                dq.pollFirst();
                System.out.print(hrittik + " ");
            }
            System.out.println();
        }
    }
}
