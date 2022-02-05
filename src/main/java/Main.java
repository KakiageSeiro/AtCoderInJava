import java.util.*;

// 提出時にファイル名がMainで固定される
// 各問題は問題の番号でクラスにし、テストしたい
// ので、別クラスで作成した処理内容をこのファイルのmainメソッドに貼り付けて提出する
public class Main {
    public static void main(String[] args) { // ■■■■■■■■■■■■■■■■■■■■

        Scanner sc = new Scanner(System.in);

        int n切る回数 = sc.nextInt();
        List<Integer> k切った箇所 = new ArrayList<>();
        k切った箇所.add(0);
        k切った箇所.add(360);

        int t前回切った角度 = 0;
        for (int i = 0; i < n切る回数; i++) {
            int k角度 = sc.nextInt();

            t前回切った角度 = t前回切った角度 + k角度;

            if (t前回切った角度 > 360) {
                k切った箇所.add(t前回切った角度  - 360);
                t前回切った角度 = t前回切った角度  - 360;
            } else {
                k切った箇所.add(t前回切った角度);
            }
        }

        k切った箇所.sort(Comparator.reverseOrder());
        int 一番大きい角度 = 0;
        for (int i = 0; i < k切った箇所.size(); i++) {
            if (i == 0) continue;

            int 内角 = k切った箇所.get(i - 1) - k切った箇所.get(i);
            if(一番大きい角度 < 内角){
                一番大きい角度 = 内角;
            }
        }

        System.out.println(一番大きい角度);


    } // ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■

}

