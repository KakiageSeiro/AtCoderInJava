import java.math.BigInteger;
import java.util.*;

public class ABC243D {
    public static void main(String[] args) {// ■■■■■■■■■■■■■■■■■■■■
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        BigInteger X = sc.nextBigInteger();
        String S1 = sc.next();
        String[] S = S1.split("");

        for (int i = 0; i < S.length; i++) {
            if(S[i].equals("U")) {
                if (X.remainder(BigInteger.valueOf(2)).equals(new BigInteger(String.valueOf(0)))) {
                    X = X.divide(BigInteger.valueOf(2));
                } else {
                    X = (X.subtract(BigInteger.valueOf(1))).divide(BigInteger.valueOf(2));
                }
                continue;
            }

            if(S[i].equals("R")) {
                X = X.multiply(BigInteger.valueOf(2)).add(BigInteger.valueOf(1));
                continue;
            }

            if(S[i].equals("L")) {
                X = X.multiply(BigInteger.valueOf(2));
            }
        }

        System.out.println(X);


    }// ■■■■■■■■■■■■■■■■■■■■

}


