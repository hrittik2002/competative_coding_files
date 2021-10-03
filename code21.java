import java.util.Scanner;

class code21{

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        while(t-- > 0){
            int arr[] = new int[7];
            for(int i = 0; i < 7; i++){
                arr[i] = Sc.nextInt();
            }
            int count1 = 0 , count0 = 0;
            for(int i = 0; i < 7; i++){
                if(arr[i] == 1){
                    count1++;
                }
                else{
                    count0++;
                }
            }
            if(count1 > count0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
