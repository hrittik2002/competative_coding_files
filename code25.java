import java.math.BigInteger;
import java.util.Scanner;

class code25 {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        while (t-- > 0) {
            String l = Sc.next();
            String r = Sc.next();
            if (l.equals(r)) {
                BigInteger L = new BigInteger(l);
                String x = L.toString();
                long sum = 0;

                for(int i = 0; i < x.length();i++){
                    int digit = (int) (x.charAt(i) - '0');
                    sum = sum + digit;
                }
                if(sum % 3 == 0){
                    System.out.println(1);
                }
                else{
                    System.out.println(0);
                }

            } else {
                BigInteger L = new BigInteger(l);
                BigInteger R = new BigInteger(r);
                BigInteger diff = R.subtract(L);
                if (diff.equals(new BigInteger("1"))) {
                    int count = 0;
                    String x = L.toString();
                    long sum = 0;

                    for(int i = 0; i < x.length();i++){
                        int digit = (int) (x.charAt(i) - '0');
                        sum = sum + digit;
                    }

                    String y = R.toString();
                    long sum2 = 0;

                    for(int i = 0; i < x.length();i++){
                        int digit = (int) (x.charAt(i) - '0');
                        sum2 = sum2 + digit;
                    }

                    if(sum % 3 == 0){
                        count++;
                    }
                    else if(sum2 % 3 == 0){
                        count++;
                    }
                    
                    System.out.println(count);
                } else {
                    BigInteger a = diff.add(new BigInteger("1"));
                    BigInteger ans = a.divide(new BigInteger("3"));
                    System.out.println(ans);
                }

            }

        }
    }
}
