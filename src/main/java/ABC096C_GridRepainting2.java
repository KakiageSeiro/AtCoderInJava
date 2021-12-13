import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ABC096C_GridRepainting2 {
    public static void main(String[] args) {
        // ■■■■■■■■■■■■■■■■■■■■

        Scanner sc = new Scanner(System.in);

        int 縦 = sc.nextInt();
        int 横 = sc.nextInt();

        List<List<String>> グリッド = new ArrayList<>();
        for (int i = 0; i < 縦; i++) {
            String 一行 = sc.next();
            List<String> 一行の一文字 = new ArrayList<>();
            for (int j = 0; j < 横; j++) {
                一行の一文字.add(String.valueOf(一行.charAt(j)));
            }
            グリッド.add(一行の一文字);
        }

        // 上下左右のどれかが#(黒)の場合は黒に濡れる
        for (int i = 0; i < グリッド.size(); i++) {
            for (int j = 0; j < グリッド.get(i).size(); j++) {
                String 一マス = グリッド.get(i).get(j);

                // 白マスはチェックしない(黒がすべて達成できるのであれば、白も達成できるのが自明)
                if (一マス.equals(".")) continue;

                // 一行目のときは上はみない
                boolean 一行目 = i == 0;
                // 最終行のときは下はみない
                boolean 最終行 = i == 縦 - 1;
                // 一番左のときは左は見ない
                boolean 一番左 = j == 0;
                // 一番右のときは右は見ない
                boolean 一番右 = j == 横 - 1;

                if (!一行目) {
                    String 上 = グリッド.get(i - 1).get(j);
                    if (上.equals("#")) {
                        グリッド.get(i).set(j, "#");
                        グリッド.get(i - 1).set(j, "#");
                        continue;
                    }
                }

                if (!一番左) {
                    String 左 = グリッド.get(i).get(j - 1);
                    if (左.equals("#")) {
                        グリッド.get(i).set(j, "#");
                        グリッド.get(i).set(j - 1, "#");
                        continue;
                    }
                }

                if (!一番右) {
                    String 右 = グリッド.get(i).get(j + 1);
                    if (右.equals("#")) {
                        グリッド.get(i).set(j, "#");
                        グリッド.get(i).set(j + 1, "#");
                        continue;
                    }
                }

                if (!最終行) {
                    String 下 = グリッド.get(i + 1).get(j);
                    if (下.equals("#")) {
                        グリッド.get(i).set(j, "#");
                        グリッド.get(i + 1).set(j, "#");
                        continue;
                    }
                }

                // 塗れない黒があった場合は処理終了
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");

        // ■■■■■■■■■■■■■■■■■■■■
    }
}


