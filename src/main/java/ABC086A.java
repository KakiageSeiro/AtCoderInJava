import java.util.Scanner;

public class ABC086A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 単語:next 整数:nextInt 文字列（1行）:nextLine
        int a = sc.nextInt();
        int b = sc.nextInt();
        if ((a * b) % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}


