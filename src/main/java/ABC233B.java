import java.util.Scanner;

public class ABC233B {
    public static void main(String[] args) {
        // ■■■■■■■■■■■■■■■■■■■■

        Scanner sc = new Scanner(System.in);
        int 最初の文字 = sc.nextInt();
        int 最後の文字 = sc.nextInt();
        String 文字列 = sc.next();
        String 抽出文字 = 文字列.substring(最初の文字-1, 最後の文字);
        String 反転文字 = new StringBuilder(抽出文字).reverse().toString();

        boolean 反転文字出力済み = false;
        for (int i = 0; i < 文字列.length(); i++) {
            if (最初の文字 <= i + 1 && i + 1 <= 最後の文字) {
                if (反転文字出力済み) {
                    continue;
                }

                System.out.print(反転文字);
                反転文字出力済み = true;
                continue;
            }

            System.out.print(文字列.charAt(i));
        }



    }// ■■■■■■■■■■■■■■■■■■■■
}


