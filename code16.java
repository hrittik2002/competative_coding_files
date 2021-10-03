import java.util.Scanner;

class code16{

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        while(t-- > 0){

            int n = Sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = Sc.nextInt();
            }

            int sum = 0;
            for(int i = 0; i < n-1; i++){
                sum += Math.abs(arr[i] - arr[i+1]);
            }


            if(sum % 2 != 0){
                for(int j = 0; j < n; j++){
                    System.out.print(arr[j] + " ");
                }
            }
            else if(sum % 2 == 0){
                if(arr[0] % 2 == 0){
                    int temp;
                    int flag = 0;
                    for(int i = 1; i < n; i++){
                        if(arr[i] % 2 != 0){
                            temp = arr[i];
                            arr[i] = arr[0];
                            arr[0] = temp;
                            flag = 1;
                            break; 
                        }
                    }
                        if(flag == 1){
                            for(int j = 0; j < n; j++){
                                System.out.print(arr[j] + " ");
                            }
                        }
                        else{
                            System.out.print(-1);
                        }
                    
                }
                else{
                    int flag = 0;
                    int temp;
                    for(int i = 1; i < n; i++){
                        if(arr[i] % 2 == 0){
                            temp = arr[i];
                            arr[i] = arr[0];
                            arr[0] = temp;
                            flag = 1;
                            break; 
                        }
                    }
                        if(flag == 1){
                            for(int j = 0; j < n; j++){
                                System.out.print(arr[j] + " ");
                            }
                        }
                        else{
                            System.out.print(-1);
                        }
                
            }
        }
        System.out.println();
    }
}
}
