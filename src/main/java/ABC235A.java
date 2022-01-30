import java.util.Scanner;

public class ABC235A {
    public static void main(String[] args) {
        // ■■■■■■■■■■■■■■■■■■■■

        Scanner sc = new Scanner(System.in);

        int abc = sc.nextInt();
        int a = abc / 100;
        int b = (abc - a * 100) / 10;
        int c = abc % 10;

        int bca = (b * 100) + (c * 10) + a;
        int cab = (c * 100) + (a * 10) + b;

        System.out.println(abc + bca + cab);


        // ■■■■■■■■■■■■■■■■■■■■


    }
}


