import java.util.*;

public class code5{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        while(t-- > 0){
            long n = Sc.nextInt();
            if(n % 3 == 0){
                System.out.println(n/3 + " " + n/3);
                continue;
            }
            else if(n % 3 == 1){
                System.out.println(((n/3)+1) + " " + n/3);
                continue;
            }
            else if(n % 3 == 2){
                System.out.println(n/3 + " " + ((n/3)+1));
                continue;
            }
        }
    }
}
