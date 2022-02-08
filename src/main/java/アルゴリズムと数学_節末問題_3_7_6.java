import java.util.Scanner;

public class アルゴリズムと数学_節末問題_3_7_6 {
    public static void main() {
        // ■■■■■■■■■■■■■■■■■■■■

        Scanner sc = new Scanner(System.in);

        int n日数 = sc.nextInt();
        Long[] a実力 = new Long[500009];
        for (int i = 1; i <= n日数; i++) {
            a実力[i] = sc.nextLong();
        }

        Long[] dp1 = new Long[500009]; // i日目に勉強する場合の、これまでの実力
        Long[] dp2 = new Long[500009]; // i日目に勉強しない場合の、これまでの実力

        // 0日目は勉強していないので実力0
        dp1[0] = 0L;
        dp2[0] = 0L;

        for (int i = 1; i <= n日数; i++) {
            int 今日 = i;
            int 昨日 = 今日 - 1;

            // 今日勉強する場合
            //   i-1日目(昨日)に勉強しなかった場合、i日目(今日)は勉強できる
            dp1[今日] = dp2[昨日] + a実力[今日];

            // 今日勉強しない場合は以下のどちらか
            //   i-1日目(昨日)に勉強している
            //   i-1日目(昨日)に勉強していない
            dp2[今日] = dp1[昨日] > dp2[昨日] ? dp1[昨日] : dp2[昨日];
        }

        // 最終日にどちらの実力が高いか判定し、出力
        Long ans = dp1[n日数] > dp2[n日数] ? dp1[n日数] : dp2[n日数];
        System.out.println(ans);

        // ■■■■■■■■■■■■■■■■■■■■
    }

}

