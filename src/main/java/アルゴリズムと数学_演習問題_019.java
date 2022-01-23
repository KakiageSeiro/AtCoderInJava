import java.util.*;

public class アルゴリズムと数学_演習問題_018 {
    public static void main(String[] args) {
        // ■■■■■■■■■■■■■■■■■■■■

        Scanner sc = new Scanner(System.in);

        int n品数 = sc.nextInt();

        long 個数_100 = 0;
        long 個数_200 = 0;
        long 個数_300 = 0;
        long 個数_400 = 0;

        for (int i = 0; i < n品数; i++) {
            int k金額 = sc.nextInt();
            if (k金額 == 100) {
                個数_100++;
            } else if (k金額 == 200) {
                個数_200++;
            } else if (k金額 == 300) {
                個数_300++;
            } else if (k金額 == 400) {
                個数_400++;
            }
        }

        long pパターン数 = (個数_100 * 個数_400) + (個数_200 * 個数_300);

        System.out.println(pパターン数);

        // ■■■■■■■■■■■■■■■■■■■■
    }
}

