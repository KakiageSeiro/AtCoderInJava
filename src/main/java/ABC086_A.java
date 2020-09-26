import java.util.Scanner;

public class ABC086_A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //単語の場合はnext()
        //整数の場合はnextInt()
        //文字列（1行）の場合はnextLine()
        int a = sc.nextInt();
        int b = sc.nextInt();
        if ((a * b) % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}


