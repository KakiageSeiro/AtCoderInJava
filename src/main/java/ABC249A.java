import java.util.Scanner;

public class ABC249A {
    public static void main(String[] args) {// ■■■■■■■■■■■■■■■■■■■■
        Scanner sc = new Scanner(System.in);

        int A秒間_taka = sc.nextInt();
        int Bメートル_taka = sc.nextInt();
        int C休み_taka = sc.nextInt();
        int D秒間_aoki = sc.nextInt();
        int Eメートル_aoki = sc.nextInt();
        int F休み_aoki = sc.nextInt();
        int X_秒後 = sc.nextInt();

        boolean taka休み = false;
        int taka休みカウント = 0;
        int taka地点 = 0;
        int taka歩きカウント = 0;
        boolean aoki休み = false;
        int aoki休みカウント = 0;
        int aoki地点 = 0;
        int aoki歩きカウント = 0;
        for (int i = 0; i < X_秒後; i++) {
            if (taka休みカウント == C休み_taka) {
                taka休み = false;
                taka休みカウント = 0;
            }

            if (!taka休み) {
                if (taka歩きカウント == C休み_taka) { // 休みになったら
                    taka休み = true;
                    taka歩きカウント=0;
                    taka休みカウント++;
                } else {
                    taka地点 += Bメートル_taka;
                    taka歩きカウント++;
                }
            } else {
                taka休みカウント++;
            }

            if (aoki休みカウント == F休み_aoki) {
                aoki休み = false;
                aoki休みカウント = 0;
            }

            if (!aoki休み) {
                if (aoki歩きカウント == F休み_aoki) { // 休みになったら
                    aoki休み = true;
                    aoki歩きカウント=0;
                    aoki休みカウント++;
                } else {
                    aoki地点 += Eメートル_aoki;
                    aoki歩きカウント++;
                }
            } else {
                aoki休みカウント++;
            }
        }

        if (taka地点 == aoki地点) {
            System.out.println("Draw");
            return;
        }

        if (taka地点 < aoki地点) {
            System.out.println("Aoki");
            return;
        }

        System.out.println("Takahashi");

    }// ■■■■■■■■■■■■■■■■■■■■
}


