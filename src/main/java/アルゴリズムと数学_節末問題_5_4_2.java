import java.util.Scanner;

public class アルゴリズムと数学_節末問題_5_4_2 {
    public static void main() {
        // ■■■■■■■■■■■■■■■■■■■■

        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int W = sc.nextInt();
        int[][] A = new int[H + 1][W + 1];

        // マス目の数値を取得
        // O(HW)
        for (int i = 1; i <= H; i++) {
            for (int j = 1; j <= W; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // 横の合計を計算
        // O(HW)
        int[] hSum = new int[H + 1];
        for (int i = 1; i <= H; i++) {
            int count = 0;
            for (int j = 1; j <= W; j++) {
                count += A[i][j];
            }
            hSum[i] = count;
        }

        // 縦の合計を計算
        // O(HW)
        int[] wSum = new int[W + 1];
        for (int j = 1; j <= W; j++) {
            int count = 0;
            for (int i = 1; i <= H; i++) {
                count += A[i][j];
            }
            wSum[j] = count;
        }

        // 縦の合計 + 横の合計 - マスの数
        // O(HW)
//        for (int i = 1; i <= H; i++) {
//            for (int j = 1; j <= W; j++) {
//                int ans = hSum[i] + wSum[j] - A[i][j];
//
//                if (j == 1) System.out.print(ans);
//                else System.out.print(" " + ans);
//            }
//            System.out.println(""); // 改行
//        }

        // 各マスに対する答えを計算する
        int[][] Answer = new int[H + 2][W + 2];
        for (int i = 1; i <= H; i++) {
            for (int j = 1; j <= W; j++) {
                Answer[i][j] = hSum[i] + wSum[j] - A[i][j];
            }
        }

        // 空白区切りで出力
        StringBuilder ans = new StringBuilder();
        for (int i = 1; i <= H; i++) {
            for (int j = 1; j <= W; j++) {
                if (j != 1) ans.append(' ');
                ans.append(Answer[i][j]);
            }
            ans.append('\n');
        }
        System.out.println(ans.toString());
        // ■■■■■■■■■■■■■■■■■■■■
    }

}

