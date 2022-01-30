import java.math.BigInteger;
import java.util.*;

public class ABC237C {

    public static void main() { // ■■■■■■■■■■■■■■■■■■■■

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String[] a = s.split("");
        int n = a.length;

        int x = 0; // 先頭から連続するaの個数
        for (int i = 0; i < n; i++) {
            if (a[i].equals("a")) x++;
            else break;
        }

        int y = 0; // 末尾から連続するaの個数
        for (int i = n - 1; i >= 0; i--) {
            if (a[i].equals("a")) y++;
            else break;
        }

        // 文字列のすべてがaだった
        if (x == n) {
            System.out.println("Yes");
            return;
        }

        // 先頭のaが末尾より多い場合は、aをいくら先頭に追加しても回文にならない
        if (x > y) {
            System.out.println("No");
            return;
        }


        String 先頭と末尾のaを除外した文字列 = s.substring(x, n - y);
        StringBuilder sb = new StringBuilder(先頭と末尾のaを除外した文字列);
        String s逆 = sb.reverse().toString();
        if (!先頭と末尾のaを除外した文字列.equals(s逆)) {
            System.out.println("No");
            return;
        }


//        int 末尾のaを除外した文字数 = n - y;
//        for (int i = x; i < 末尾のaを除外した文字数; i++) {
//            if (!a[i].equals(a[x + 末尾のaを除外した文字数 - i - 1])) {
//                System.out.println("No");
//                return;
//            }
//        }

        System.out.println("Yes");


    } // ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■

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

