import java.util.Scanner;

class code18{

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        while(t-- > 0){
            int n = Sc.nextInt();
            String str = "";
            for(int i = 0; i < n; i++){
                str = str + "(";
            }
            for(int i = 0; i < n; i++){
                str = str + ")";
            }
            System.out.println(str);

            int a = n - 1;
            int b = n;
            int k = n - 1;
            char ch[] = str.toCharArray();
            while(k > 0){
                ch[a] = ')';
                ch[b] = '(';
                a--;
                b++;
                System.out.println(String.valueOf(ch));
                ch = str.toCharArray();
                k--;
            }
        }
    }
}