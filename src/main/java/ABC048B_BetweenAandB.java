import java.util.Scanner;

public class ABC048B_BetweenAandB {
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


