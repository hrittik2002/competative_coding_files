import java.util.Scanner;

class code26{

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        while(t-- > 0){
            long l = Sc.nextInt();
            long r = Sc.nextInt();
            for(int i = 0; i < 3; i++){
                if(l > r){
                    System.out.println(0);
                    continue;
                    
                }
                if(l <= r && l % 3 == 0){
                    break;
                }
                else{
                    i++;
                }
            }

            for(int i = 0; i < 3; i++){
                if(l <= r && r % 3 == 0){
                    break;
                }
                else r--;
            }
            long a = (l / 3);
            long b = (r / 3);
            if(a >= b){
                long ans = (a - b) + 1;
                System.out.println(ans);
            }
            else{
                long ans = (b - a) + 1;
                System.out.println(ans);
            }
            
        }
    }
}
