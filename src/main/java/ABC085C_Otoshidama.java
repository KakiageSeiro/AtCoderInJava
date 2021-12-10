import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ABC085C_Otoshidama {
    public static void main(String[] args) {
        // ■■■■■■■■■■■■■■■■■■■■

        Scanner sc = new Scanner(System.in);

        int お札枚数 = sc.nextInt();
        int 合計金額 = sc.nextInt();


        int あり得るお札の最大枚数_10000円 = 合計金額 / 10000;
        int あり得るお札の最大枚数_5000円 = 合計金額 / 5000;
        int あり得るお札の最大枚数_1000円 = 合計金額 / 1000;

        for (int i10000 = 0; i10000 <= あり得るお札の最大枚数_10000円; i10000++) {
            for (int i5000 = 0; i5000 <= あり得るお札の最大枚数_5000円; i5000++) {
                int お札1000円の枚数 = お札枚数 - (i10000 + i5000);
                if(お札1000円の枚数 < 0) continue;

                int 合計_10000円札 = i10000 * 10000;
                int 合計_5000円札 = i5000 * 5000;
                int 合計_1000円札 = お札1000円の枚数 * 1000;

                int すべてのお札の合計金額 = 合計_10000円札 + 合計_5000円札 + 合計_1000円札;
                int すべてのお札の合計枚数 = i10000 + i5000 + お札1000円の枚数;

                boolean 合計金額が正しい = すべてのお札の合計金額 == 合計金額;
                boolean お札枚数が正しい = すべてのお札の合計枚数 == お札枚数;
                if (合計金額が正しい && お札枚数が正しい) {
                    System.out.println(i10000 + " " + i5000 + " " + お札1000円の枚数);
                    return;
                }

            }
        }

        System.out.println("-1 -1 -1");

        // ■■■■■■■■■■■■■■■■■■■■
    }
}


