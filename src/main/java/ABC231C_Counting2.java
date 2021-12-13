import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ABC231C_Counting2 {
    public static void main(String[] args) {
        // ■■■■■■■■■■■■■■■■■■■■

        Scanner sc = new Scanner(System.in);

        int n人数 = sc.nextInt();
        int q調査する身長の数 = sc.nextInt();

        List<Integer> 身長リスト = new ArrayList<>();
        for (int i = 0; i < n人数; i++) {
            身長リスト.add(sc.nextInt());
        }

        // 二分探索法のためのソート
        身長リスト.sort(Integer::compareTo);

        for (int i = 0; i < q調査する身長の数; i++) {
            int 調査対象身長 = sc.nextInt();

            // 二分探索
            int ok = n人数; // 身長リスト_小さい順[ok] >= x であることが分かっている
            int ng = -1; // 身長リスト_小さい順[ng] < x であることが分かっている
            while (ok - ng > 1) {
                // 2数値の平均値
                int 二分した値 = (ok + ng) / 2;

                if (身長リスト.get(二分した値) >= 調査対象身長) {
                    // 平均値で解けるなら後半の半分で探索
                    ok = 二分した値;
                } else {
                    // 平均値で解けないなら後半の半分で探索
                    ng = 二分した値;
                }
            }

            System.out.println(n人数 - ok);
        }


        // ■■■■■■■■■■■■■■■■■■■■
    }
}


