import java.util.Scanner;

public class code43{

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        while(t-- > 0){
            int n = Sc.nextInt();
            boolean flag = true;
            int arr[] = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = Sc.nextInt();
                if(i > 0 && arr[i-1] % arr[i]!=0){
                    flag = false;
                }
            }
            
            
            if(flag == true){
                for(int i = 0; i < n; i++){
                    System.out.print(arr[i]);
                    System.out.print(' ');
                }
                System.out.println();
            }
            else{
                System.out.println(-1);
            }
        }
    }
}
