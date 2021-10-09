import java.util.ArrayList;
import java.util.Scanner;

class code35{

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<Integer>();
        //System.out.println("Enter values");
        String val = Sc.nextLine();
        String[] val_arr = val.split("\\s+");
        for(int i=0; i < val_arr.length; i++){
            arr.add(Integer.parseInt(val_arr[i]));
        }
        int target = Sc.nextInt();
        int ans[] = new int[2];
        ans = TwoSum(arr , target);
        System.out.println(ans[0] + " " + ans[1]);
        
    }

    private static int[] TwoSum(ArrayList<Integer> arr, int target) {
        int[] ans = new int[2];
        int i = 0 , j = arr.size() - 1;
        while(i < j){
            if(arr.get(i) + arr.get(j) == target){
                ans[0] = i;
                ans[1] = j;
            }
            else if(arr.get(i) + arr.get(j) > target){
                j--;
            }
            else{
                i++;
            }
        }
        return ans;
    }
}
