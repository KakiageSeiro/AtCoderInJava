import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ABC065B_Trained {
    public static void main(String[] args) {
        // ■■■■■■■■■■■■■■■■■■■■

        Scanner sc = new Scanner(System.in);

        long ボタン数 = sc.nextLong();
        List<Integer> 押すと光るボタンリスト = new ArrayList<>();
        for (long i = 0; i < ボタン数; i++) {
            押すと光るボタンリスト.add(sc.nextInt());
        }

        Integer 押すと光るボタン = 押すと光るボタンリスト.get(0);
        for (int i = 0; i < 押すと光るボタンリスト.size(); i++) {
            if (押すと光るボタン == 2) {
                System.out.println(i + 1);
                return;
            }

            押すと光るボタン = 押すと光るボタンリスト.get(押すと光るボタン - 1);
        }

        System.out.println("-1");

        // ■■■■■■■■■■■■■■■■■■■■
    }
}


