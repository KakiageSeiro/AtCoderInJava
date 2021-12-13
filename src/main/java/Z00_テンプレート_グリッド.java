import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// テンプレの元ネタ問題 https://atcoder.jp/contests/abc075/tasks/abc075_b
public class Z00_テンプレート_グリッド {

    // ■■■■■■■■■■■■■■■■■■■■メソッドがあるのでmainごとコピペ■■■
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int 縦 = sc.nextInt();
        int 横 = sc.nextInt();

        List<List<String>> グリッド = グリッド作成(sc, 縦, 横);

        for (int i = 0; i < グリッド.size(); i++) {
            for (int j = 0; j < グリッド.get(i).size(); j++) {
                String 一マス = グリッド.get(i).get(j);

                if (一マス.equals("#")) {
                    continue;
                }

                int 周囲の爆弾の数 = 各マスの周囲に対する処理(縦, 横, グリッド, i, j);

                // "."を数字に更新
                グリッド.get(i).set(j, String.valueOf(周囲の爆弾の数));
            }
        }

        for (List<String> 一行 : グリッド) {
            for (String 一マス : 一行) {
                System.out.print(一マス);
            }
            System.out.println("");
        }
    }

    private static int 各マスの周囲に対する処理(int 縦, int 横, List<List<String>> グリッド, int i, int j) {
        // 一行目のときは上はみない
        boolean 一行目 = i == 0;
        // 最終行のときは下はみない
        boolean 最終行 = i == 縦 - 1;
        // 一番左のときは左は見ない
        boolean 一番左 = j == 0;
        // 一番右のときは右は見ない
        boolean 一番右 = j == 横 - 1;

        int 周囲の爆弾の数 = 0;
        if (!一行目) {
            if (!一番左) {
                String 左上 = グリッド.get(i - 1).get(j - 1);
                周囲の爆弾の数 = 左上を参照する処理(周囲の爆弾の数, 左上);
            }

            String 上 = グリッド.get(i - 1).get(j);
            周囲の爆弾の数 = 上を参照する処理(周囲の爆弾の数, 上);

            if (!一番右) {
                String 右上 = グリッド.get(i - 1).get(j + 1);
                周囲の爆弾の数 = 右上を参照する処理(周囲の爆弾の数, 右上);
            }
        }

        if (!一番左) {
            String 左 = グリッド.get(i).get(j - 1);
            周囲の爆弾の数 = 左を参照する処理(周囲の爆弾の数, 左);
        }

        if (!一番右) {
            String 右 = グリッド.get(i).get(j + 1);
            周囲の爆弾の数 = 右を参照する処理(周囲の爆弾の数, 右);
        }

        if (!最終行) {
            if (!一番左) {
                String 左下 = グリッド.get(i + 1).get(j - 1);
                周囲の爆弾の数 = 左下を参照する処理(周囲の爆弾の数, 左下);
            }

            String 下 = グリッド.get(i + 1).get(j);
            周囲の爆弾の数 = 下を参照する処理(周囲の爆弾の数, 下);

            if(!一番右){
                String 右下 = グリッド.get(i + 1).get(j + 1);
                周囲の爆弾の数 = 右下を参照する処理(周囲の爆弾の数, 右下);
            }
        }
        return 周囲の爆弾の数;
    }

    private static int 左上を参照する処理(int 周囲の爆弾の数, String 左上) {
        if (左上.equals("#")) 周囲の爆弾の数++;
        return 周囲の爆弾の数;
    }

    private static int 上を参照する処理(int 周囲の爆弾の数, String 上) {
        if (上.equals("#")) 周囲の爆弾の数++;
        return 周囲の爆弾の数;
    }

    private static int 右上を参照する処理(int 周囲の爆弾の数, String 右上) {
        if (右上.equals("#")) 周囲の爆弾の数++;
        return 周囲の爆弾の数;
    }

    private static int 左を参照する処理(int 周囲の爆弾の数, String 左) {
        if (左.equals("#")) 周囲の爆弾の数++;
        return 周囲の爆弾の数;
    }

    private static int 右を参照する処理(int 周囲の爆弾の数, String 右) {
        if (右.equals("#")) 周囲の爆弾の数++;
        return 周囲の爆弾の数;
    }

    private static int 左下を参照する処理(int 周囲の爆弾の数, String 左下) {
        if (左下.equals("#")) 周囲の爆弾の数++;
        return 周囲の爆弾の数;
    }

    private static int 下を参照する処理(int 周囲の爆弾の数, String 下) {
        if (下.equals("#")) 周囲の爆弾の数++;
        return 周囲の爆弾の数;
    }

    private static int 右下を参照する処理(int 周囲の爆弾の数, String 右下) {
        if (右下.equals("#")) 周囲の爆弾の数++;
        return 周囲の爆弾の数;
    }


    /*  以下の形式で縦(H)横(W)各マスの値(Si)が与えられる時にグリッドを作成する
        H W
        S1S2S3
        .
        .
        .
        SnSnSn
     */
    private static List<List<String>> グリッド作成(Scanner sc, int 縦, int 横) {
        List<List<String>> グリッド = new ArrayList<>();
        for (int i = 0; i < 縦; i++) {
            String 一行 = sc.next();
            List<String> 一行の一文字 = new ArrayList<>();
            for (int j = 0; j < 横; j++) {
                一行の一文字.add(String.valueOf(一行.charAt(j)));
            }
            グリッド.add(一行の一文字);
        }
        return グリッド;
    }
    // ■■■■■■■■■■■■■■■■■■■■
}


