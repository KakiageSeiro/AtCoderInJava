import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// 提出時にファイル名がMainで固定される
// 各問題は問題の番号でクラスにし、テストしたい
// ので、別クラスで作成した処理内容をこのファイルのmainメソッドに貼り付けて提出する
public class Main {
    public static void main(String[] args) {
        // ■■■■■■■■■■■■■■■■■■■■


        Scanner sc = new Scanner(System.in);

        int 計画数 = sc.nextInt();

        // 初期地点時
        int 経過時間 = 0;
        int 現在のx座標 = 0;
        int 現在のy座標 = 0;

        for (int i = 0; i < 計画数; i++) {
            int 目標到着時間 = sc.nextInt();
            int 目標x座標 = sc.nextInt();
            int 目標y座標 = sc.nextInt();

            int 目標座標までの距離 = Math.abs(現在のx座標 - 目標x座標) + Math.abs(現在のy座標 - 目標y座標);

            boolean すでに遅刻 = 経過時間 > 目標到着時間;
            int 移動に利用できる時間 = 目標到着時間 - 経過時間;
            boolean 時間が足りる = 移動に利用できる時間 >= 目標座標までの距離;
            // その場にとどまれないが、同じ２箇所を行ったり来たりすることで時間つぶしはできる。そのため時間と距離が両方偶数or両方奇数であれば制約をクリアできる。
            boolean 両方偶数か両方奇数 = (移動に利用できる時間 % 2 == 0) == (目標座標までの距離 % 2 == 0);
            boolean 計画を遂行できる = !すでに遅刻 && 時間が足りる && 両方偶数か両方奇数;

            if (!計画を遂行できる) {
                System.out.println("No");
                return;
            }

            // 目標を達成したので、現在の状況を更新
            経過時間 = 目標到着時間;
            現在のx座標 = 目標x座標;
            現在のy座標 = 目標y座標;
        }

        // 計画通り！！！！
        System.out.println("Yes");

        // ■■■■■■■■■■■■■■■■■■■■
    }
}

