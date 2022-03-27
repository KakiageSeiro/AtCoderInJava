import java.util.Scanner;

class Main {
    public static void main(String[] args) {
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

        int[] zzz = new int[N];

        //次のA[i]を優先して確認し、行けるならそれを使う動的計画法
        //X[i] - X[i + 1] <= K
        int mae = A[0];
        zzz[0] = mae;
        boolean a始まり = true;
        for (int i = 0; i < N - 1; i++) {
            if (Math.abs(mae - A[i + 1]) <= K){
                mae = A[i + 1];
                zzz[i + 1] = mae;
            } else {
                // Bの場合はどうか？
                if (Math.abs(mae - B[i + 1]) <= K){
                    mae = B[i + 1];
                    zzz[i + 1] = mae;
                    continue;
                }
                a始まり = false; // AB両方条件に当てはまらない
                break; // A優先だと無理なのでもう処理しない
            }
        }

        if (a始まり) {
            System.out.println("Yes");
            return;
        }

        //次のB[i]を優先して確認し、行けるならそれを使う動的計画法
        mae = B[0];
        boolean b始まり = true;
        for (int i = 0; i < N - 1; i++) {
            if (Math.abs(mae - B[i + 1]) <= K){
                mae = B[i + 1];
            } else {
                // Bの場合はどうか？
                if (Math.abs(mae - B[i + 1]) <= K){
                    mae = B[i + 1];
                    continue;
                }
                b始まり = false;
                break; // B優先だと無理なのでもう処理しない
            }
        }

        if (b始まり) {
            System.out.println("Yes");
            return;
        }

        System.out.println("No");

    }// ■■■■■■■■■■■■■■■■■■■■
}
