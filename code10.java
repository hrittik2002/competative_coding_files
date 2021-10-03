import java.util.*;

public class code10{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        while(t-- > 0){
            int n = Sc.nextInt();
            int arr[] = new int[n+1];
            for(int i = 1; i <= n; i++){
                arr[i] = Sc.nextInt();
            }
            int count = 0;
            while(!sorted(arr)){
                count++;
                if((count & 1) == 1){
                    for(int i = 1; i <= n; i++){
                        if((i & 1) == 1){
                            if(i+1 <= n && arr[i] > arr[i+1]){
                                swap(arr[i] , arr[i+1] , arr);
                            }
                        }
                    }
                }
                else {
                    for(int i = 1; i <= n; i++){
                        if((i & 1) != 1){
                            if(i+1 <= n && arr[i] > arr[i+1]){
                                swap(i , i+1 , arr);
                            }
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
    public static void swap(int a , int b , int arr[]){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static boolean sorted(int arr[]){
        int n = arr.length;
        for(int i = 1; i < n; i++){
            if(arr[i] != i) return false;
        }
        return true;
    }
}

