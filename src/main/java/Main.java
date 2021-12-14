import java.util.Scanner;

// 提出時にファイル名がMainで固定される
// 各問題は問題の番号でクラスにし、テストしたい
// ので、別クラスで作成した処理内容をこのファイルのmainメソッドに貼り付けて提出する
public class Main {
    public static void main(String[] args) {
        // ■■■■■■■■■■■■■■■■■■■■

        Scanner sc = new Scanner(System.in);

        int ボールの数 = sc.nextInt();
        int ペンキの種類 = sc.nextInt();

        int 塗り方の種類 = ペンキの種類;
        for (int i = 0; i < ボールの数 - 1; i++) {
            塗り方の種類 *= (ペンキの種類 - 1);
        }

        System.out.println(塗り方の種類);


        // ■■■■■■■■■■■■■■■■■■■■
    }
}

