import java.util.Scanner;

// 提出時にファイル名がMainで固定される
// 各問題は問題の番号でクラスにし、テストしたい
// ので、別クラスで作成した処理内容をこのファイルのmainメソッドに貼り付けて提出する
public class Main {
    public static void main(String[] args) {
        // ■■■■■■■■■■■■■■■■■■■■

        Scanner sc = new Scanner(System.in);

        // 単語:next 整数:nextInt 文字列（1行）:nextLine
        String s = sc.next();

        int 答え = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') 答え++;
        }

        System.out.println(答え);



        // ■■■■■■■■■■■■■■■■■■■■
    }
}

