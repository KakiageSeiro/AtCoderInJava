import java.util.Scanner;

public class ABC241C {
    public static void main(String[] args) {// ■■■■■■■■■■■■■■■■■■■■

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[][] S = new String[N + 1][N + 1];
        for (int i = 0; i < N; i++) {
            String[] split = sc.next().split("");
            for (int j = 0; j < split.length; j++) {
                S[i][j] = split[j];
            }
        }

        // 全探索(すべての起点から、8方向の黒の数が4個以上であることを調べる)
        // O(8N) = O(N)
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

                boolean is右にあふれる = j + 5 > N - 1;
                boolean is左にあふれる = j - 5 < 0;
                boolean is下にあふれる = i + 5 > N - 1;
                boolean is上にあふれる = i - 5 < 0;

                // ■今の場所から右側に6連続しそうか調べる
                if (!is右にあふれる) { // マスからあふれるときは調べない
                    // 黒の数をカウント
                    int 右調査時黒count = 0;
                    for (int k = 0; k < 6; k++) {
                        if (S[i][j + k].equals("#")) 右調査時黒count++;
                    }

                    if (右調査時黒count >= 4) {
                        System.out.println("Yes");
                        return;
                    }
                }


                // ■今の場所から左側に6連続しそうか調べる
                if (!is左にあふれる) { // マスからあふれるときは調べない
                    // 黒の数をカウント
                    int 左調査時黒count = 0;
                    for (int k = 0; k < 6; k++) {
                        if (S[i][j - k].equals("#")) 左調査時黒count++;
                    }

                    if (左調査時黒count >= 4) {
                        System.out.println("Yes");
                        return;
                    }
                }


                // ■今の場所から下側に6連続しそうか調べる
                if (!is下にあふれる) { // マスからあふれるときは調べない
                    // 黒の数をカウント
                    int 下調査時黒count = 0;
                    for (int k = 0; k < 6; k++) {
                        if (S[i + k][j].equals("#")) 下調査時黒count++;
                    }

                    if (下調査時黒count >= 4) {
                        System.out.println("Yes");
                        return;
                    }
                }


                // ■今の場所から上側に6連続しそうか調べる
                if (!is上にあふれる) { // マスからあふれるときは調べない
                    // 黒の数をカウント
                    int 上調査時黒count = 0;
                    for (int k = 0; k < 6; k++) {
                        if (S[i - k][j].equals("#")) 上調査時黒count++;
                    }

                    if (上調査時黒count >= 4) {
                        System.out.println("Yes");
                        return;
                    }
                }


                // ■今の場所から右下側に6連続しそうか調べる
                if (!(is下にあふれる || is右にあふれる)) { // マスからあふれるときは調べない
                    // 黒の数をカウント
                    int 右下調査時黒count = 0;
                    for (int k = 0; k < 6; k++) {
                        if (S[i + k][j + k].equals("#")) 右下調査時黒count++;
                    }

                    if (右下調査時黒count >= 4) {
                        System.out.println("Yes");
                        return;
                    }
                }


                // ■今の場所から右上側に6連続しそうか調べる
                if (!(is上にあふれる || is右にあふれる)) { // マスからあふれるときは調べない
                    // 黒の数をカウント
                    int 右上調査時黒count = 0;
                    for (int k = 0; k < 6; k++) {
                        if (S[i - k][j + k].equals("#")) 右上調査時黒count++;
                    }

                    if (右上調査時黒count >= 4) {
                        System.out.println("Yes");
                        return;
                    }
                }


                // ■今の場所から左下側に6連続しそうか調べる
                if (!(is下にあふれる || is左にあふれる)) { // マスからあふれるときは調べない
                    // 黒の数をカウント
                    int 左下調査時黒count = 0;
                    for (int k = 0; k < 6; k++) {
                        if (S[i + k][j - k].equals("#")) 左下調査時黒count++;
                    }

                    if (左下調査時黒count >= 4) {
                        System.out.println("Yes");
                        return;
                    }
                }


                // ■今の場所から左上側に6連続しそうか調べる
                if (!(is上にあふれる || is左にあふれる)) { // マスからあふれるときは調べない
                    // 黒の数をカウント
                    int 左上調査時黒count = 0;
                    for (int k = 0; k < 6; k++) {
                        if (S[i - k][j - k].equals("#")) 左上調査時黒count++;
                    }

                    if (左上調査時黒count >= 4) {
                        System.out.println("Yes");
                        return;
                    }
                }
            }
        }

        System.out.println("No");


    }// ■■■■■■■■■■■■■■■■■■■■
}

