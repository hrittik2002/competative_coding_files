import java.util.*;

public class code9{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        while(t-- > 0){
            int n = Sc.nextInt();
            String s = Sc.next();
            if(n == 1){
                System.out.println(-1 + " " + -1);
                continue;
            }
            char x = s.charAt(0);
            int j = 0;
            for(int i = 1; i < n; i++){
                if(s.charAt(i) != x){
                    j = i;
                    System.out.println(j + " " + (j+1));
                    break;
                }
            }
            if(j == 0){
                System.out.println(-1 + " " + -1);
            }


        }
    }
}
