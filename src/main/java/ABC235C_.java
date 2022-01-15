import java.util.*;

public class ABC235C_ {
    public static void main(String[] args) {
        // ■■■■■■■■■■■■■■■■■■■■

        Scanner sc = new Scanner(System.in);

        int 数列の長さ = sc.nextInt();
        int クエリの数 = sc.nextInt();

        Map<Integer, List<Integer>> 数と位置リスト = new HashMap<>();
        for (int i = 0; i < 数列の長さ; i++) {
            int 数 = sc.nextInt();

            if (数と位置リスト.containsKey(数)) {
                数と位置リスト.get(数).add(i + 1);
            } else {
                List<Integer> 位置リスト = new ArrayList<>();
                位置リスト.add(i + 1);
                数と位置リスト.put(数, 位置リスト);
            }
        }

        for (int i = 0; i < クエリの数; i++) {
            int 目的の数 = sc.nextInt();
            int 何回目 = sc.nextInt();

            if (!数と位置リスト.containsKey(目的の数)) {
                System.out.println("-1");
                continue;
            }

            List<Integer> 位置リスト = 数と位置リスト.get(目的の数);
            if (位置リスト.size() < 何回目) {
                System.out.println("-1");
                continue;
            }

            System.out.println(位置リスト.get(何回目 - 1));
        }


        // ■■■■■■■■■■■■■■■■■■■■
    }
}

