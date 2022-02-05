import java.math.BigInteger;
import java.util.Scanner;

public class ABC238C {

    public static void main() { // ■■■■■■■■■■■■■■■■■■■■

        Scanner sc = new Scanner(System.in);

        Long n = sc.nextLong();

        ABC238C.f(0L, n);


    } // ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■

    static long f(Long x, Long max) {
        Long w割る数 = 998244353L;

        Long x2 = 0L;
        if (x.toString().length() > 1) {
            x2 = (long) (x % Math.pow(10, x.toString().length())
                    + (x % 10))
                    / w割る数;
        }

        if (max < x) {
            if (max.toString().length() == 1) {
                return x;
            } else {
                return x2;
            }
        }

        if (max.toString().length() == 1) {
            return x + f(x + 1, max);
        } else {
            return x2 + f(x + 1, max);
        }

    }

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

