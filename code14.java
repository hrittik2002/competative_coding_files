import java.util.*;

public class code14{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        while(t-- > 0){
            int n = Sc.nextInt();
            int m = Sc.nextInt();
            char arr[][] = new char[n][m];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    arr[i][j] = Sc.next().charAt(0);
                }
            }

            char wrw[][] = new char[n][m];
            char x = 'W';
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    wrw[i][j] = x;
                    if(x == 'W'){
                        x = 'R';
                    }
                    else if(x == 'R'){
                        x = 'W';
                    }
                }

                if(x == 'W'){
                    x = 'R';
                }
                else if(x == 'R'){
                    x = 'W';
                }

            }

            char rwr[][] = new char[n][m];
            char p = 'R';
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    rwr[i][j] = p;
                    if(p == 'W'){
                        p = 'R';
                    }
                    else if(x == 'R'){
                        p = 'W';
                    }
                }

                if(p == 'W'){
                    p = 'R';
                }
                else if(x == 'R'){
                    p = 'W';
                }
            }
            int flag = 0;
            String str = "";

            function_1(n, m, arr, wrw, flag , str);
            function_2(n, m, arr, rwr, flag , str);

            if(flag == -2){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
                if(str == "rwr"){
                    display(rwr , n , m);
                }
                else if(str == "wrw"){
                    display(rwr , n , m);
                }
            }

            
            

        }
    }


    private static void display(char[][] a, int n, int m) {
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }


    private static void function_2(int n, int m, char[][] arr, char[][] rwr, int flag , String str) {
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(arr[i][j] == 'W' || arr[i][j] == 'R'){
                    if(rwr[i][j] != arr[i][j]){
                        flag--;
                        return;
                    }
                }
            }
        }
        str = "rwr";
        
    }

    private static void function_1(int n , int m , char[][] arr , char[][] wrw , int flag , String str) {
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(arr[i][j] == 'W' || arr[i][j] == 'R'){
                    if(wrw[i][j] != arr[i][j]){
                        flag--;
                        return;
                    }
                }
            }
        }
        str = "wrw";
    }
}