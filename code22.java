import java.util.Scanner;

class code22{

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        while(t-- > 0){
            int n = Sc.nextInt();
            if(n == 1){
                System.out.println(3);
            }
            else{
                String s = "";
                s = s + "2";
                for(int i = 1; i <n-1; i++){
                    s = s + "0";
                }
                s = s + "1";
                System.out.println(s);
            }
        }
    }
}
