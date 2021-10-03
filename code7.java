import java.util.*;

public class code7{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        while(t-- > 0){
            long a = Sc.nextLong();
            long b = Sc.nextLong();
            long d = a - 1;
            long res = 0;
            if(d % 4 == 0){
                res = d;
            }
            else if(d % 4 == 1){
                res = 1;
            }
            else if(d % 4 == 2){
                res = d + 1;
            }
            else res = 0;

            if(res == b){
                System.out.println(a);
            }
            else if((res ^ a) == b){
                System.out.println(a + 2);
            }
            else{
                System.out.println(a + 1);
            }
        }
    }
}

