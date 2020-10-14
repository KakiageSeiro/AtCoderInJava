import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //単語の場合はnext()
        //整数の場合はnextInt()
        //文字列（1行）の場合はnextLine()
        int i = sc.nextInt();

        if (i%3==0 && i%5==0) {
            System.out.println("Fizz Buzz");
        } else if (i%3==0) {
            System.out.println("Fizz");
        } else if (i%5==0) {
            System.out.println("Buzz");
        } else {
            System.out.println(i);
        }
    }
}
