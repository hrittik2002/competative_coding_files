import java.util.Scanner;

public class code31{

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        while(t-- > 0){
            String s = Sc.next();
            int A = 0 , B = 0 , C = 0;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == 'A'){
                    A++;
                }
                else if( s.charAt(i) == 'B'){
                    B++;
                }
                else if(s.charAt(i) == 'C'){
                    C++;
                }
            }
            if(B == (A + C)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
