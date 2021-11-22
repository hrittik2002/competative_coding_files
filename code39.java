import java.util.Scanner;

public class code39{

    static final int M = 5;

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        while(t-- > 0){
            int n = Sc.nextInt();
            int ans = 0;
            int[][] hrittik_arr = new int[n][M];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < M; j++){
                    hrittik_arr[i][j] = Sc.nextInt();
                }
            }

            boolean flag = solve(n , hrittik_arr);
            if(flag == true){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

            
        }
    }

    private static boolean solve(int n, int[][] my__arr) {
        for(int i = 0; i < M; i++){
            for(int j = i+1; j < M; j++){
                int hrittik2 = 0;
                int hrittik3 = 0;
                int hrittik1 = 0;
                for(int k = 0; k < n; k++){
                    if(my__arr[k][j] == 1) hrittik2++;
                    if(my__arr[k][i] == 1) hrittik1++;
                    if(my__arr[k][j] == 1 && my__arr[k][i] == 1) hrittik3++;
                }
                hrittik2 = hrittik2 - hrittik3;
                hrittik1 = hrittik1 - hrittik3;
                if(hrittik1 <= n/2 && hrittik2 <= n/2 && hrittik1+ hrittik2+hrittik3 == n){
                    return true;
                }
            }
        }
        return false;
    }

    

}
