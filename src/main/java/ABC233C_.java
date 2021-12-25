import java.util.*;

public class ABC233C_ {
    // ■■■■■■■■■■■■■■■■■■■■

    static int count = 0;
    static int 袋の数 = 0;
    static Long 総積 = 0L;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] 袋の数と総積 = sc.nextLine().split(" ");

        袋の数 = Integer.parseInt(袋の数と総積[0]);
        総積 = Long.parseLong(袋の数と総積[1]);

        List<List<Integer>> 袋の中身リスト = new ArrayList<>();
        for (int i = 0; i < 袋の数; i++) {
            List<Integer> ボールリスト = new ArrayList<>();
            String aaa = sc.nextLine();
            String[] ボールarray = aaa.split(" ");
            for (int j = 0; j < ボールarray.length; j++) {
                ボールリスト.add(Integer.parseInt(ボールarray[j]));
            }
            袋の中身リスト.add(ボールリスト);
        }

        List<List<Integer>> 取り出し方パターン = new ArrayList<>();
        取り出し方パターンを作る(袋の中身リスト, 1L, 0);

        System.out.println(count);
    }

    private static void 取り出し方パターンを作る(List<List<Integer>> 袋の中身リスト, Long 積, int 見る袋index) {
        if (袋の数 == 見る袋index) {
            if (Objects.equals(総積, 積)) count += 1;
            return;
        }

        List<Integer> 見る袋 = 袋の中身リスト.get(見る袋index);
        for (int i = 0; i < 見る袋.size(); i++) {
            if (積 > 総積 / 見る袋.get(i)) continue;
            取り出し方パターンを作る(袋の中身リスト, 積 * 見る袋.get(i), 見る袋index + 1);
        }
    }

    // ■■■■■■■■■■■■■■■■■■■■
}


