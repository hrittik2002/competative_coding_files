import java.util.Scanner;

class code24{

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        while(t-- > 0){
            int n = Sc.nextInt();
            // even
            if((n/2) % 2 == 0){
                System.out.println("YES");
                int i = 1;
                while(i <= n){
                    System.out.print(i + " ");
                    if(i + 1 == n/2){
                        i = i + 3;
                    }
                    else{
                        i = i + 2;
                    }
                }
                System.out.println();
                i = 2;
                while(i < n){
                    System.out.print(i + " ");
                    if(i == n/2){
                        i = i + 1;
                    }
                    else{
                        i = i + 2;
                    }
                }
                System.out.println();
            }
            //odd
            else{
                System.out.println("NO");
            }
        }
    }
}
