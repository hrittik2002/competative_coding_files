import java.util.Scanner;

class code17{

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        while(t-- > 0){
            int n = Sc.nextInt();
            int k = Sc.nextInt();
            String s = Sc.next();

            int count1 = 0 , count0 = 0;
            for(int i = 0; i < n; i++){
                char ch = s.charAt(i);
                if(ch == '0'){
                    count0++;
                }
                else if(ch == '1'){
                    count1++;
                }
            }

            int last1 = -1;
            int last0 = -1;
            for(int i = 0; i < n; i++){
                if(s.charAt(i) == '1'){
                    last1 = i;
                }
                if(s.charAt(i) == '0'){
                    last0 = i;
                }
            }

            int first0 = n;
            for(int i = n-1; i >= 0; i--){
                if(s.charAt(i) == '0'){
                    first0 = i;
                }
            }
            
            if(s.charAt(0) == '0'){
                System.out.println(-1);
                continue;
            }

            if(k >= 2){
                if(count0 == 0){
                    System.out.println(-1);
                }
                else{
                    if(last1 > first0){
                        System.out.println(last1 + 1);
                    }
                    else{
                        System.out.println(-1);
                    }
                }
            }
            else if(k == 1){
                if(count0 == 0){
                    System.out.println(-1);
                }
                else{
                    System.out.println(last0 + 1);
                }

            }

            

        }
    }
}


/**
 * int count1 = 0 , count0 = 0;
 * for(int i = 0; i < n; i++){
                char ch = s.charAt(i);
                if(ch == '0'){
                    count0++;
                }
                else if(ch == '1'){
                    count1++;
                }
            }
 */