import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class アルゴリズムと数学_節_5_7_5 {
    public static void main() {
        // ■■■■■■■■■■■■■■■■■■■■

        Scanner sc = new Scanner(System.in);

        final int W = 1000000007;
        int N段数 = sc.nextInt();
        int n登る段数 = N段数 - 1;

        int[] A最下層の数字 = new int[N段数 + 1];
        for (int i = 1; i <= N段数; i++) {
            A最下層の数字[i] = sc.nextInt();
        }

        List<Integer> k各数字の登場回数をかけた値 = new ArrayList<>();
        for (int i = 1; i <= N段数; i++) {
            int A = A最下層の数字[i];
            int h左を選択しなければならない回数 = i - 1;
            BigInteger nCr = n個のものからr個を選ぶ方法の数(n登る段数, h左を選択しなければならない回数);
            int ans = A * nCr.intValue() % W;

            k各数字の登場回数をかけた値.add(ans);
        }

        int 合計 = k各数字の登場回数をかけた値.stream().mapToInt(x -> x).sum();
        System.out.println(合計);


        // ■■■■■■■■■■■■■■■■■■■■
    }

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

