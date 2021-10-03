import java.util.Scanner;

public class code19{

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        while(t-- > 0){
            int a = Sc.nextInt();
            int b = Sc.nextInt();
            int c = Sc.nextInt();
            int m = Sc.nextInt();

            int x = a / 2;
            int y = b / 2;
            int z = c / 2;

            if(m == 0) {
                System.out.println("YES");
            }
            else{
                if(x + y + z == m){
                    System.out.println("YES");
                }
                else if(x + y + z < m){
                    System.out.println("NO");
                }
                else{

                }
                }
                
            }
        }
    }

