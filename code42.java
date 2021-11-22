import java.util.Scanner;

public class code42{

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        while(t-- > 0){
            int A = Sc.nextInt();
            int B = Sc.nextInt();
            int P = Sc.nextInt();
            int Q = Sc.nextInt();
            int AB = A + B;
            int PQ = P + Q;
            if(AB == PQ){
                System.out.println(0);
            }
            else{
                if((AB % 2 == 0 && PQ % 2 == 0) || (AB % 2 != 0 && PQ % 2 != 0)){
                    System.out.println(2);
                }
                else if((AB % 2 != 0 && PQ % 2 == 0) || (AB % 2 == 0 && PQ % 2 != 0)){
                    System.out.println(1);
                }
            }
        }
    }
}
