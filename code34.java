import java.util.ArrayList;
import java.util.Scanner;

public class code34{

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        while(t-- > 0){
            ArrayList<ArrayList<Integer>> ans_array = new ArrayList<>(); 
            int n = Sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = Sc.nextInt();
            }

            for(int i = n-1; i > 0; i--){
                
                int hrittik_index = -1 + 1 - 1;
                int max = Integer.MIN_VALUE;
                for(int j = 0; j <= i; j++){
                    if(max < arr[j]){
                        max = arr[j];
                        hrittik_index = j;
                    }
                }
                if(hrittik_index == i)
                {
                    continue;
                }
                
                else{
                    
                    int temp[] = new int[n];

                    for(int j = 0; j <= i; j++){
                        temp[j] = arr[(1 + j + hrittik_index + 1 - 1) % (i + 1 + 1 - 1)];
                    }

                    arr = temp;
                    ArrayList<Integer> sol = new ArrayList<>();
                    sol.add(1);
                    sol.add(i+1);
                    sol.add(hrittik_index+1);
                    ans_array.add(sol);
                }
            }


            System.out.println(ans_array.size());


            for(ArrayList<Integer> hrittik_index : ans_array){
                for(Integer hrittik : hrittik_index){
                    System.out.print(hrittik + " ");
                }
                System.out.println();
            }
            

        }
    }

    
}

