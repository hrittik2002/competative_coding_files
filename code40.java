import java.util.*;

public class code40{

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        while(t-- > 0){
            String keys = Sc.next();
            String word = Sc.next();
            if(word.length() == 1){
                System.out.println('0');
                continue;
            }
            Map<Character , Integer> map = new HashMap<>();
            for(int i = 1; i < 27; i++){
                map.put(keys.charAt(i - 1) , i);
            }
            long ans = 0;
            for(int i = 1; i < word.length(); i++){
                char l1 = word.charAt(i - 1);
                char l2 = word.charAt(i);
                if(l1 != l2){
                    int x = Math.abs(map.get(l1) - map.get(l2));
                    ans += x;
                } 
            }
            System.out.println(ans);
        }
    }
}