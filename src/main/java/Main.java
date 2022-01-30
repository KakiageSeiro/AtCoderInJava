import java.util.*;

// 提出時にファイル名がMainで固定される
// 各問題は問題の番号でクラスにし、テストしたい
// ので、別クラスで作成した処理内容をこのファイルのmainメソッドに貼り付けて提出する
public class Main {
    public static void main(String[] args) { // ■■■■■■■■■■■■■■■■■■■■

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String[] a = s.split("");
        int n = a.length;

        int x = 0; // 先頭から連続するaの個数
        for (int i = 0; i < n; i++) {
            if (a[i].equals("a")) x++;
            else break;
        }

        int y = 0; // 末尾から連続するaの個数
        for (int i = n - 1; i >= 0; i--) {
            if (a[i].equals("a")) y++;
            else break;
        }

        // 文字列のすべてがaだった
        if (x == n) {
            System.out.println("Yes");
            return;
        }

        // 先頭のaが末尾より多い場合は、aをいくら先頭に追加しても回文にならない
        if (x > y) {
            System.out.println("No");
            return;
        }


        String 先頭と末尾のaを除外した文字列 = s.substring(x, n - y);
        StringBuilder sb = new StringBuilder(先頭と末尾のaを除外した文字列);
        String s逆 = sb.reverse().toString();
        if (先頭と末尾のaを除外した文字列.equals(s逆)) {
            System.out.println("No");
        }


//        int 末尾のaを除外した文字数 = n - y;
//        for (int i = x; i < 末尾のaを除外した文字数; i++) {
//            if (!a[i].equals(a[x + 末尾のaを除外した文字数 - i - 1])) {
//                System.out.println("No");
//                return;
//            }
//        }

        System.out.println("Yes");


    } // ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
}

