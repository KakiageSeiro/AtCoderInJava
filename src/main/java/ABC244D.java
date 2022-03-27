import java.util.Scanner;

public class ABC244D {
    public static void main(String[] args) {// ■■■■■■■■■■■■■■■■■■■■
        Scanner sc = new Scanner(System.in);

        String S1 = sc.next();
        String S2 = sc.next();
        String S3 = sc.next();
        String T1 = sc.next();
        String T2 = sc.next();
        String T3 = sc.next();

        int c一致カウント = 0;
        if (S1.equals(T1)) {
            c一致カウント++;
        }

        if (S2.equals(T2)) {
            c一致カウント++;
        }

        if (S3.equals(T3)) {
            c一致カウント++;
        }

        if (c一致カウント == 3) {
            System.out.println("Yes");
            return;
        }

        if (c一致カウント == 2) {
            // 帽子RGBが各1つずつなので、一致が２人いる場合、一致していないが一人となり、つじつまがあわない
        }

        if (c一致カウント == 1) {
            // 10^18は偶数なので、最後には元の色の帽子になる
            System.out.println("No");
        }

        if (c一致カウント == 0) {
            // 一回目の操作で一つ一致状態に
            // 二回目の操作で三つ一致状態に
            // あとは偶数回同じ操作をする

            // 目標1 2 3
            // 初期3 1 2

            // 一回操作後3 2 1
            // 二回操作後1 2 3

            System.out.println("Yes");
        }
    }// ■■■■■■■■■■■■■■■■■■■■

}


