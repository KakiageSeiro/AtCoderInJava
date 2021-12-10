import java.util.Scanner;

public class ABC083B_SomeSums {
    public static void main(String[] args) {
        // ■■■■■■■■■■■■■■■■■■■■

        Scanner sc = new Scanner(System.in);

        int target = sc.nextInt();
        int これ以上 = sc.nextInt();
        int これ以下 = sc.nextInt();

        int 各桁の和がA以上B以下であるものの総和 = 0;
        for (int i = 1; i <= target; i++) {
            int 各桁の合計 = 0;

            String iString = String.valueOf(i);
            for (int j = 0; j < iString.length(); j++) {
                char 各桁 = iString.charAt(j);
                各桁の合計 += Integer.parseInt(String.valueOf(各桁));
            }

            if (これ以上 <= 各桁の合計 && 各桁の合計 <= これ以下) {
                各桁の和がA以上B以下であるものの総和 += i;
            }
        }

        System.out.println(各桁の和がA以上B以下であるものの総和);

        // ■■■■■■■■■■■■■■■■■■■■

    }
}


