import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ABC088B_CardGameForTwo {
    public static void main(String[] args) {
        // ■■■■■■■■■■■■■■■■■■■■

        Scanner sc = new Scanner(System.in);

        int カード枚数 = sc.nextInt();
        List<Integer> カードリスト = new ArrayList<>();

        for (int i = 0; i < カード枚数; i++) {
            カードリスト.add(sc.nextInt());
        }

        カードリスト.sort(Collections.reverseOrder());
        int aliceが取ったカード合計 = 0;
        int bobが取ったカード合計 = 0;
        for (int i = 0; i < カード枚数; i++) {
            if (i % 2 == 0) {
                aliceが取ったカード合計 += カードリスト.get(i);
            } else {
                bobが取ったカード合計 += カードリスト.get(i);
            }
        }

        System.out.println(aliceが取ったカード合計 - bobが取ったカード合計);

        // ■■■■■■■■■■■■■■■■■■■■

    }
}


