import java.util.Scanner;

public class ABC244E {
    public static void main(String[] args) {// ■■■■■■■■■■■■■■■■■■■■
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        int S = sc.nextInt();
        int T = sc.nextInt();
        int X = sc.nextInt();
        int[] U = new int[M + 1];
        int[] V = new int[M + 1];
        for (int i = 1; i <= M; i++) {
            U[i] = sc.nextInt();
            V[i] = sc.nextInt();
        }

        long w = 998244353;

        String 数列 = "";
        for (int i = 1; i < K; i++) { // 数列の長さ。A[0]はS出なければならないので1始まり。A[K]はT出なければならないのでK-1までを調べる
            for (int a = 1; a <= N; a++) { // 数列の要素A[?]に当てはめる数字




                // 頂点A[i] A[i+1]の間を直接結ぶ辺が存在する
                // つまりA[i]==U && A[i+1]==V(もしくはその逆)が存在する

                // U全探索して==A[i]のものを探す
                for (int u = 0; u < U.length; u++) {
                    if (U[u]==a) {
                        for (int a2 = 1; a2 <= N; a2++) { // 数列の要素A[?+1]に当てはめる数字
                            if (V[u]==a2) {
                                // ■OK
                                数列 = 数列 + a;
                                break;
                            }
                        }
                    }
                }
            }
        }


    }// ■■■■■■■■■■■■■■■■■■■■

}


