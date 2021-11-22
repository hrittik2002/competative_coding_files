import java.util.Scanner;

public class code44{

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        while(t-- > 0){
            int n = Sc.nextInt();
            
            if(n == 1){
                System.out.print(1);
            }
            else{
                int x = 1;
                System.out.print(1);
                System.out.print(" ");
                for(int i = 1; i < n; i++){
                    x = x + 2;
                    System.out.print(x);
                    System.out.print(" ");
                    
                }
            }
            System.out.println();
        }
    }
}