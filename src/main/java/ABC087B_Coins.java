import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ABC087B_Coins {
    public static void main(String[] args) {
        // ■■■■■■■■■■■■■■■■■■■■

        Scanner sc = new Scanner(System.in);

        // 単語:next 整数:nextInt 文字列（1行）:nextLine
        int 枚数500円 = sc.nextInt();
        int 枚数100円 = sc.nextInt();
        int 枚数50円 = sc.nextInt();
        int 目標金額 = sc.nextInt(); // 50の倍数

        // 全ての組み合わせを求めて、その合計金額と一致する数
        // 全ての組み合わせ = 500円枚数 * 100円枚数 * 50円枚数
        int ちょうどにする方法の数 = 0;
        for (int i500 = 0; i500 <= 枚数500円; i500++) { // ０枚も調査するため0で初期化。５００円の枚数が2枚の場合、2枚時点のループもしたいため<=で条件指定
            for (int i100 = 0; i100 <= 枚数100円; i100++) {
                for (int i50 = 0; i50 <= 枚数50円; i50++) {
                    int 値段_500円 = i500 * 500;
                    int 値段_100円 = i100 * 100;
                    int 値段_50円 = i50 * 50;
                    int 合計 = 値段_500円 + 値段_100円 + 値段_50円;

                    if(合計 == 目標金額) ちょうどにする方法の数++;
                }
            }
        }

        System.out.println(ちょうどにする方法の数);


        // ■■■■■■■■■■■■■■■■■■■■

    }
}


