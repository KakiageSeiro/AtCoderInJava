import java.math.BigInteger;
import java.util.Scanner;

public class ABC237B {

    public static void main(String[] args) { // ■■■■■■■■■■■■■■■■■■■■

        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();

        int[][] b = new int[w][h];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                b[j][i] = sc.nextInt();
            }
        }

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                if (j != 0) {
                    System.out.print(" ");
                }
                System.out.print(b[i][j]);
            }
            System.out.println("");
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

