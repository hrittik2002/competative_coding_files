import java.util.Scanner;

class code28{

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        while(t-- > 0){
            long P = Sc.nextLong();
            long a = Sc.nextLong();
            long b = Sc.nextLong();
            long c = Sc.nextLong();
            long x = Sc.nextLong();
            long y = Sc.nextLong();

            
            long bb = b + (x*a);
            long ans1 = P / bb;

            long cc = c + (y*a);
            long ans2 = P / cc;

            if(ans1 > ans2){
                System.out.println(ans1);
            }
            else{
                System.out.println(ans2);
            }
            
        }
    }
}
