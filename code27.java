import java.util.Scanner;

class code27{

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        while(t-- > 0){
            int N = Sc.nextInt();
            int P = Sc.nextInt();
            int X = Sc.nextInt();
            int Y = Sc.nextInt();
            int arr[] = new int[N];
            for(int i = 0; i < N; i++){
                arr[i] = Sc.nextInt();
            }
            int ans = 0;
            for(int i = 0; i < P; i++){
                if(arr[i] == 0){
                    ans += X;
                }
                else if(arr[i] == 1){
                    ans += Y;
                
                }
            }

            System.out.println(ans);
        }
    }
}