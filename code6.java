import java.util.*;

public class code6{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        while(t-- > 0){
            long n = Sc.nextLong();
            String s = Sc.next();

            for(int i = 0; i < n; i++){
                if(s.charAt(i) == 'U'){
                    System.out.print("D");
                }
                else if(s.charAt(i) == 'D'){
                    System.out.print('U');
                }
                else if(s.charAt(i) == 'L'){
                    System.out.print('L');
                }
                else if(s.charAt(i) == 'R'){
                    System.out.print('R');
                }
            }
            System.out.println();
        }
    }
}
