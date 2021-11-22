import java.util.*;

public class code41{

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        while(t-- > 0){
            long x = Sc.nextLong();
            long d = Sc.nextLong();
            //long foo[] = new long[];
            ArrayList<Long> foo  =new ArrayList<Long>();
            long cur = x;
            for(long i = 0; i < 4; i++){
                long min = i + 1;
                if((cur&1) == 1){
                    cur += min;
                }
                else{
                    cur -= min;
                }
                foo.add(cur);
            }
            long temp1 = d % 4;
            int temp = (int) temp1;

            if(temp == 2 || temp == 0){
                if(temp == 0){
                    temp += 4;
                }
                System.out.println(temp-1);
                continue;
            }
            else{
                if(temp == 1){
                    d--;
                    long dem = d/4;
                    if((x&1) == 1){
                        System.out.println(foo.get(temp - 1) + dem*4);
                    }
                    else{
                        System.out.println(foo.get(temp - 1) - dem*4);
                    }
                }
                else{
                    d--;
                    long dem = d/4;

                    if((x&1) == 1){
                        System.out.println(foo.get(temp - 1) - dem*4);
                    }
                    else{
                        System.out.println(foo.get(temp - 1) + dem*4);

                }
            }
        }
    }
}
}
