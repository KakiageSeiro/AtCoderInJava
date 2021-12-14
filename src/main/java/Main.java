import java.math.BigDecimal;
import java.util.Scanner;

// 提出時にファイル名がMainで固定される
// 各問題は問題の番号でクラスにし、テストしたい
// ので、別クラスで作成した処理内容をこのファイルのmainメソッドに貼り付けて提出する
public class Main {
    public static void main(String[] args) {
        // ■■■■■■■■■■■■■■■■■■■■

        Scanner sc = new Scanner(System.in);

        int トレーニング回数 = sc.nextInt();
        BigDecimal パワー = new BigDecimal(1);

        for (int i = 1; i <= トレーニング回数; i++) {
            パワー = パワー.multiply(new BigDecimal(i)).remainder(new BigDecimal(1000000000 + 7));
        }

        System.out.println(パワー);



        // ■■■■■■■■■■■■■■■■■■■■
    }
}

