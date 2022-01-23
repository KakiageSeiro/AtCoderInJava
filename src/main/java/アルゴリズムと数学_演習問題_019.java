import java.math.BigInteger;
import java.util.*;

public class アルゴリズムと数学_演習問題_019 {

    public static void main(String[] args) {
        // ■■■■■■■■■■■■■■■■■■■■

        Scanner sc = new Scanner(System.in);

        int n枚数 = sc.nextInt();
        long aka赤数 = 0;
        long ki黄数 = 0;
        long ao青数 = 0;

        for (int i = 0; i < n枚数; i++) {
            int i色 = sc.nextInt();
            if (i色 == 1) {
                aka赤数++;
            } else if (i色 == 2) {
                ki黄数++;
            } else if (i色 == 3) {
                ao青数++;
            }
        }

        long ans = (aka赤数 * (aka赤数 - 1)) / 2 +
                (ki黄数 * (ki黄数 - 1)) / 2 +
                (ao青数 * (ao青数 - 1)) / 2;

        System.out.println(ans);

    }

    private static BigInteger n個のものからr個を選ぶ方法の数(long nLong, long rLong) {
        if(nLong < rLong){
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

