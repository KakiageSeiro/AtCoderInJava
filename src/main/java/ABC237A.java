import java.math.BigInteger;
import java.util.Scanner;

public class ABC237A {

    public static void main(String[] args) { // ■■■■■■■■■■■■■■■■■■■■

        Scanner sc = new Scanner(System.in);
        long 最小 = -2147483648L; // -2^31 これ以上
        long 最大 = 2147483648L; // -2^31 これ未満

        long n = sc.nextLong();

        if (最小 <= n && n < 最大) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    } // ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■

    private static BigInteger n個のものからr個を選ぶ方法の数(long nLong, long rLong) {
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

    // BigIntegerの四則演算
    // + add
    // - subtract
    // * multiply
    // / divide
    static BigInteger factorial階乗(BigInteger target) {
        if (target.longValue() == 0) {
            return new BigInteger("1");
        }
        return target.multiply(factorial階乗(target.subtract(new BigInteger("1"))));
    }
}

