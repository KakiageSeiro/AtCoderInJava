import java.util.Scanner;

public class アルゴリズムと数学_節_5_5_1 {
    public static void main() {
        // ■■■■■■■■■■■■■■■■■■■■

        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        long max = Math.max(Math.max(a * c, a * d), Math.max(b * c, b * d));
        System.out.println(max);


        // ■■■■■■■■■■■■■■■■■■■■
    }
}

