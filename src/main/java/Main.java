import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

// 提出時にファイル名がMainで固定される
// 各問題は問題の番号でクラスにし、テストしたい
// ので、別クラスで作成した処理内容をこのファイルのmainメソッドに貼り付けて提出する
public class Main {

    static int count = 0;
    static Long 袋の数 = 0L;
    static Long 総積 = 0L;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] 袋の数と総積 = sc.nextLine().split(" ");

        袋の数 = Long.parseLong(袋の数と総積[0]);
        総積 = Long.parseLong(袋の数と総積[1]);

        List<List<Long>> 袋リスト = new ArrayList<>();
        for (int i = 0; i < 袋の数; i++) {
            List<Long> ボールリスト = new ArrayList<>();
            String aaa = sc.nextLine();
            String[] ボールarray = aaa.split(" ");
            for (int j = 0; j < ボールarray.length; j++) {
                ボールリスト.add(Long.parseLong(ボールarray[j]));
            }
            袋リスト.add(ボールリスト);
        }

        取り出し方パターンを作る(袋リスト, 1L, 0);

        System.out.println(count);
    }

    private static void 取り出し方パターンを作る(List<List<Long>> 袋リスト, Long 積, int 見る袋index) {
        if (袋の数 == 見る袋index) {
            if (Objects.equals(総積, 積)) count += 1;
            return;
        }

        List<Long> 袋 = 袋リスト.get(見る袋index);
        for (int i = 0; i < 袋.size(); i++) {
            if (積 > 総積 / 袋.get(i)) continue; // 積を計算した結果、総積より大きくなってしまう場合はこれ以上袋をみなくてもいい
            取り出し方パターンを作る(袋リスト, 積 * 袋.get(i), 見る袋index + 1);
        }
    }

}

