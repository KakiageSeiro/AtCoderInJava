import java.util.Scanner;

public class ABC245C {
    public static void main(String[] args) {// ■■■■■■■■■■■■■■■■■■■■
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }

        // -----入力ここまで-----

        // ■DPを数学アルゴリズム本で復習後にやってみた
        // dp[]定義を「X[i]-X[i+1]したときに一番小さい値になる数字(X[i+1]に一番近い)」と考える
        // さらに、X[i+1]はAかBから選ぶので、↑をAとB両方で計算した結果、さらに次の値X[i+2]と比較し差が小さいほうを選ぶ必要がある。
        // 全探索になってしまう
        // "さらに次の値X[i+2]と比較し差が小さいほうを選ぶ"ので、後ろから計算したほうが筋がよさそう

        // 後ろから考える
        // 最後にする行動は
        // X[N-1] - X[N] <= K になる
        // ① X[N-1]は、X[N]に近い方をAorBから選ぶ
//        int[] dp = new int[N + 9];

        // 最初のX[N]をどう決める？
        // A[N]とB[N]を決め打ち
//        dp[N - 1] = A[N - 1];
//        for (int i = N - 1; i >= 0; i--) {
//            // ①
//            int min近いほう = Math.min(Math.abs(dp[i] - A[i - 1]), Math.abs(dp[i] - B[i - 1]));
//            dp[i-1]=min近いほう;
//            // 疑問A:近いほうを次のdpにしたとして、次の次のAorBが「今回の遠いほう」に近い場合、遠いほうが最適になるのでは？
//            // ■ここでAtcoderの解説を見る
//
//            // ↓解説をかみ砕く
//            // dpを「X[i]まで考慮したときに、X[i]=A[i]でよいか」とする
//            // epを「X[i]まで考慮したときに、X[i]=B[i]でよいか」とする
//            // dp[3]=true でi=4の時、直前はA[i]でOKだったとわかる
//            // ep[3]=falseでi=4の時、直前はB[i]でNGだったとわかる
//
//            // 今回のdpを判定する
//            //   前回はAで行けた→前回のA-今回のA(A[i-1] - A[i])をしてKと比較①
//            //   前回はBで行けた→前回のB-今回のA(B[i-1] - A[i])をしてKと比較②
//            //     上記どっちかがtrueの場合はdp[i]=trueとする
//            //       dpは「X[n]まで考慮したときに、X[i]=A[i]でよいか」なので、
//            //         「X[今回]まで考慮したときに、X[今回]=A[今回]でよいか」=trueとなる
//
//            // 今回のepを判定する(↑のepバージョンをやる)
//            //   前回はAで行けた→前回のA-今回のB(A[i-1] - B[i])をしてKと比較③
//            //   前回はBで行けた→前回のB-今回のB(B[i-1] - B[i])をしてKと比較④
//
//            // これで疑問Aが解消する(AとB最適がどっちかわからない→両方計算しちゃえばいいじゃん。ってこと)
//
//            // 実装する
//        }

        boolean[] dp = new boolean[N];
        boolean[] ep = new boolean[N];
        dp[0] = true;
        ep[0] = true;
        for (int i = 1; i <= N - 1; i++) {
            // X[i]まで考慮したときに、X[i]=A[i]でよいか(dp)
            // X[i]まで考慮したときに、X[i]=B[i]でよいか(ep)
            // を判定
            if (dp[i - 1]) {
                if (Math.abs(A[i - 1] - A[i]) <= K) dp[i] = true; // ①
                if (Math.abs(A[i - 1] - B[i]) <= K) ep[i] = true; // ③
            }

            if (ep[i - 1]) { // ここは①か③がtrueだったらやらなくていいかも(計算量的には微量(最悪ケースで*2になる)なので今回はそのまま)
                if (Math.abs(B[i - 1] - A[i]) <= K) dp[i] = true; // ②
                if (Math.abs(B[i - 1] - B[i]) <= K) ep[i] = true; // ④
            }
        }

        if (dp[N - 1] || ep[N - 1]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }// ■■■■■■■■■■■■■■■■■■■■
}


