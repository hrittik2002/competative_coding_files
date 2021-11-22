import java.util.Scanner;

public class code38{

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        while(t-- > 0){
            int n = Sc.nextInt();
            String s1 = Sc.next();
            String s2 = Sc.next();
            if(s1.charAt(0) == '1' || s2.charAt(n-1) == '1'){
                System.out.println("NO");
                continue;
            }
            int flag = 1;
            for(int i = 0; i < n; i++){
                if(s1.charAt(i) == '1'){
                    if(s2.charAt(i) == '1'){
                        flag = 0;
                    }
                }
            }
            if(flag == 1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

            }
        }
    
}
