import java.util.Scanner;

public class code37{

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        while(t-- > 0){
            long n = Sc.nextLong();
            long r = n;
            long x = n - 1;
            long l = -1 * x;
            System.out.println(l + " " + r); 
        }
    }
}

