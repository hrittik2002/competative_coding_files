import java.util.*;

public class code1{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        ArrayList<Integer> arr =new ArrayList<>();
        arr.add(1);
        arr.add(2);
        for(int i = 3; i < (int) 1e6; i++){
            if(i % 3 != 0 && i % 10 != 3){
                arr.add(i);
            }
        }
        int t = Sc.nextInt();
        while(t-- > 0){
            int k = Sc.nextInt();
            System.out.println(arr.get(k-1));
        }
    }
}