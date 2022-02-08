import java.util.Scanner;

public class アルゴリズムと数学_節末問題_3_7_4 {
    public static void main() {
        // ■■■■■■■■■■■■■■■■■■■■

        Scanner sc = new Scanner(System.in);

        int nカード枚数 = sc.nextInt();
        int s合計 = sc.nextInt();
        Integer[] a数字リスト = new Integer[69];
        for (int i = 1; i <= nカード枚数; i++) {
            a数字リスト[i] = sc.nextInt();
        }

        // dp[i][j]
        // i=左からi番目までのカード
        // j=合計
        // 合計がjになる組み合わせがある場合はtrue
        boolean[][] dp = new boolean[nカード枚数 + 1][s合計 + 1];
        dp[0][0] = true;

        // i=0は「何も選ばない」ということ
        // s合計が0の場合だけtrueになりうる
        if (s合計 == 0) {
            System.out.println("Yes");
            return;
        }

        // s合計が0でない場合、一枚も選ばない選択はすべてfalse
        for (int j = 1; j <= s合計; j++) {
            dp[0][j] = false;
        }

        // 選べる組み合わせはtrueになるように二次元配列を組み立てる
        for (int i = 1; i <= nカード枚数; i++) {
            for (int j = 0; j <= s合計; j++) {
                // j < a[i] のとき、カード i は選べない
                if(j < a数字リスト[i]) {
                    // ので i-1 までのカードの合計をそのまま維持
                    dp[i][j] = dp[i-1][j];
                    continue;
                }

                // j >= a[i] のとき(カードを選んでも目標(s合計)を超えない)選ぶ・選ばない 両方の選択肢がある
                //   カードi-1までの合計がj-A[i-1]であり、カードiを選ぶ
                //     つまり"カードを選んだらjになる"の意
                boolean x = dp[i - 1][j - a数字リスト[i]];
                //   カードi-1までの合計がjであり、カードiを選ばない
                //     つまり"カードを選ばないので前回と変化なし"の意
                boolean y = dp[i - 1][j];

                // カードを選ぶ・選ばない のどちらかでjになれる場合はtrue(選べる組み合わせ)
                dp[i][j] = x || y;
            }
        }

        // dp[N][S]がtrueの場合、合計Sになる選び方が存在する
        if (dp[nカード枚数][s合計]) {
            System.out.println("Yes");
            return;
        }

        System.out.println("No");

        // ■■■■■■■■■■■■■■■■■■■■
    }

}

