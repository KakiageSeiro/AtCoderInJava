import java.util.*;

// 提出時にファイル名がMainで固定される
// 各問題は問題の番号でクラスにし、テストしたい
// ので、別クラスで作成した処理内容をこのファイルのmainメソッドに貼り付けて提出する
public class Main {
    public static void main(String[] args) { // ■■■■■■■■■■■■■■■■■■■■



        Scanner sc = new Scanner(System.in);

        Long n = sc.nextLong();

        Main.f(0L, n);


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
}

