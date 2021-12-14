import java.util.Scanner;

// 提出時にファイル名がMainで固定される
// 各問題は問題の番号でクラスにし、テストしたい
// ので、別クラスで作成した処理内容をこのファイルのmainメソッドに貼り付けて提出する
public class Main {
    public static void main(String[] args) {
        // ■■■■■■■■■■■■■■■■■■■■

        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();

        long イチからbをxで割れる種類数 = b/x;
        long イチからa引く一の値をxで割れる種類数 = (a - 1)/x; // a"より"下の値を利用して割れる種類

        if (a == 0){
            // aが0だった場合は0も倍数に含まれる
            System.out.println(イチからbをxで割れる種類数 + 1);
        } else {
            System.out.println(イチからbをxで割れる種類数 - イチからa引く一の値をxで割れる種類数);
        }

        // ■■■■■■■■■■■■■■■■■■■■
    }
}

