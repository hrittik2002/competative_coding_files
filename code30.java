import java.util.Scanner;

class code30{

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        while(t-- > 0){
            long a = Sc.nextLong();
            long b = Sc.nextLong();
            if(solve(a, b) == true){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            
            
        }
    }
    public static boolean solve(long a , long b){
        if(a == 1) return true;
        if(a % 5 == 0){
            if(b % 5 == 0){
                return true;
            }
            else{
                return false;
            }
        }
        if(a % 7 == 0){
            if(b % 7 == 0){
                return true;
            }
            else{
                return false;
            }
        }
        if(a % 3 == 0){
            if(b % 3 == 0){
                return true;
            }
            else{
                return false;
            }
        }
        if(a % 2 == 0){
            if(b % 2 == 0){
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }
}
