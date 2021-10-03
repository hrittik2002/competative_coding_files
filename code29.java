import java.util.Scanner;

class code29{

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        while(t-- > 0){
            String s = Sc.next();
            char flag = '0';
            long ans = 0;
            for(int i = 0; i < s.length(); i++){
                char ch = s.charAt(i);
                if(ch == flag){
                    if(flag == '0'){
                        flag = '1';
                    }
                    else{
                        flag = '0';
                    }
                    ans++;
                }
            }
            System.out.println(ans);
            
        }
    }
}
