import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ABC238B {

    public static void main() { // ■■■■■■■■■■■■■■■■■■■■

        Scanner sc = new Scanner(System.in);

        int n切る回数 = sc.nextInt();
        List<Integer> k切った箇所 = new ArrayList<>();
        k切った箇所.add(0);
        k切った箇所.add(360);

        int t前回切った角度 = 0;
        for (int i = 0; i < n切る回数; i++) {
            int k角度 = sc.nextInt();

            t前回切った角度 = t前回切った角度 + k角度;

            if (t前回切った角度 > 360) {
                k切った箇所.add(t前回切った角度  - 360);
                t前回切った角度 = t前回切った角度  - 360;
            } else {
                k切った箇所.add(t前回切った角度);
            }
        }

        k切った箇所.sort(Comparator.reverseOrder());
        int 一番大きい角度 = 0;
        for (int i = 0; i < k切った箇所.size(); i++) {
            if (i == 0) continue;

            int 内角 = k切った箇所.get(i - 1) - k切った箇所.get(i);
            if(一番大きい角度 < 内角){
                一番大きい角度 = 内角;
            }
        }

        System.out.println(一番大きい角度);


    } // ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■

    // 遅いみたい
    static BigInteger n個のものからr個を選ぶ方法の数(long nLong, long rLong) {
        if (nLong < rLong) {
            return new BigInteger("0");
        }

        // nCr = n! / r!(n-r)!
        // n(n-1)/r
        BigInteger n = new BigInteger(String.valueOf(nLong));
        BigInteger r = new BigInteger(String.valueOf(rLong));
        return factorial階乗(n).divide( // n! / の部分
                factorial階乗(r).multiply( // r!( の部分
                        factorial階乗(n.subtract(r)) // n-_r の部分
                )
        );
    }

    /*****************************************
     BigIntegerの四則演算メモ
     + add
     - subtract
     * multiply
     / divide
     *****************************************/
    static BigInteger factorial階乗(BigInteger target) {
        if (target.longValue() == 0) {
            return new BigInteger("1");
        }
        return target.multiply(factorial階乗(target.subtract(new BigInteger("1"))));
    }

}

