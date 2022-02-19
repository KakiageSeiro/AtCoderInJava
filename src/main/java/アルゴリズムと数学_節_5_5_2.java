import java.util.Scanner;

public class アルゴリズムと数学_節_5_5_2 {
    public static void main() {
        // ■■■■■■■■■■■■■■■■■■■■

        Scanner sc = new Scanner(System.in);

        int N点の数 = sc.nextInt();
        int K含む点の数 = sc.nextInt();

        int[] X = new int[N点の数 + 1];
        int[] Y = new int[N点の数 + 1];

        for (int i = 0; i < N点の数; i++) {
            X[i + 1] = sc.nextInt();
            Y[i + 1] = sc.nextInt();
        }

        // 長方形左右の辺のx座標はXのどれかと一致するはず
        // 長方形上下の辺のy座標はXのどれかと一致するはず

        long ans = Long.MAX_VALUE;
        for (int i = 1; i <= N点の数; i++) {
            for (int j = 1; j <= N点の数; j++) {
                for (int k = 1; k <= N点の数; k++) {
                    for (int l = 1; l <= N点の数; l++) {
                        // 長方形の位置
                        int 左 = X[i];
                        int 右 = X[j];
                        int 上 = Y[k];
                        int 下 = Y[l];

                        if (長方形に含まれている点の数(N点の数, X, Y, 左, 右, 下, 上) >= K含む点の数) {
                            long 面積 = (long) (右 - 左) * (上 - 下);
                            ans = Math.min(ans, 面積);
                        }
                    }
                }
            }
        }

        System.out.println(ans);

        // ■■■■■■■■■■■■■■■■■■■■
    }

    static int 長方形に含まれている点の数(int N点の数, int[] X, int[] Y, int 左, int 右, int 下, int 上) {
        int 点が含まれている数 = 0;
        for (int i = 1; i <= N点の数; i++) {
            // 点(X[i], Y[i])が長方形に含まれているかどうかを判定
            boolean 点が長方形の左辺より右側 = 左 <= X[i];
            boolean 点が長方形の右辺より左側 = X[i] <= 右;
            boolean 点が長方形の下辺より上側 = 下 <= Y[i];
            boolean 点が長方形の上辺より下側 = Y[i] <= 上;
            if (点が長方形の左辺より右側 && 点が長方形の右辺より左側 && 点が長方形の上辺より下側 && 点が長方形の下辺より上側) {
                点が含まれている数++;
            }
        }
        return 点が含まれている数;
    }
}

