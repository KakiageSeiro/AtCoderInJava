import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ABC248C {

    static long N;
    static long M;
    static long K;
    static long wari;

    public static void main(String[] args) {// ■■■■■■■■■■■■■■■■■■■■
        Scanner sc = new Scanner(System.in);

        N = sc.nextLong();
        M = sc.nextLong();
        K = sc.nextLong();
        wari = 998244353;

        // 1 <= a <= M

        List<Integer> arr = new ArrayList<>();
        for (long i = 0; i < N; i++) {
            arr.add(1);
        }

        for (int i = 1; i <= N; i++) {
            aaaa(arr, i);
        }

        System.out.println(count);

    }// ■■■■■■■■■■■■■■■■■■■■

    static long count = 0;

    static List<Integer> aaaa(List<Integer> list, int keta) {
        // 条件を確認
        long sum = 0;
        for (Integer i : list) {
            sum += i;
        }
        if (sum <= K) {
            count++;
            count = Math.floorMod(count, wari);
        }

        boolean 今のけたはMまで見た = list.get(keta - 1) == M;
        boolean 最後の桁 = keta == N;
        if (今のけたはMまで見た && 最後の桁) {
            return list;
        }

        if (今のけたはMまで見た) {
            // 次の桁の値をインクリメント
            list.set(keta, list.get(keta) + 1);
            // 次の桁に移動
            return aaaa(list, keta + 1);
        }

        // 今のけたをインクリメントして再起
        list.set(keta - 1, list.get(keta - 1) + 1);
        return aaaa(list, keta);
    }
}


