import java.util.Scanner;

public class アルゴリズムと数学_節_5_6_2 {
    public static void main() {
        // ■■■■■■■■■■■■■■■■■■■■

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int ans = 0;
        for (int i = 1; i <= B; i++) {
            if (is引数で割り切れる数が2つ以上存在する(i, A, B)) {
                ans = i;
            }
        }

        System.out.println(ans);
        // ■■■■■■■■■■■■■■■■■■■■
    }

    static boolean is引数で割り切れる数が2つ以上存在する(int t割る数, int A, int B) {

        // B以下で最大のtの倍数は Math.floorDiv(B, t割る数) * t
        // B=5, t=5 5/5*5=5
        // B=15, t=5 15/5*5=15
        // B=13, t=5 13/5*5=10
        // Math.floorDiv(B, t割る数) だけだと、B"以下"でtの倍数の個数
        int Bをtで割り切れる数 = Math.floorDiv(B, t割る数);    // B/t の小数点切り下げ

        // A以上で最小のtの倍数は Math.ceil(A / t割る数) * t
        // A=5, t=5 5/5*5=5
        // A=15, t=5 15/5*5=15
        // A=13, t=5 13/5*5=15
        // Math.ceil(A / t割る数) だけだと、A"以下"でtの倍数の個数
        int Aをtで割り切れる数 = (int) Math.ceil(A / t割る数); // A/t の小数点切り上げ

        // ■以下がわからない
        // 「A以上B以下のtの倍数が2個以上ある」=「Math.floorDiv(B, t割る数) - Math.ceil(A / t割る数) >= 1」
        // 「B"以下"でtの倍数の個数 - A"以下"でtの倍数の個数 >= 1」でなぜ上になるんだ？
        // そもそも「A以上B以下のtの倍数が2個以上ある」は1個以上の間違いでは？
        boolean A以上B以下のtの倍数が2個以上ある = Bをtで割り切れる数 - Aをtで割り切れる数 >= 2;
        return A以上B以下のtの倍数が2個以上ある;
    }
}

