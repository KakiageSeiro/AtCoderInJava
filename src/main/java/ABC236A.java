import java.util.Scanner;

public class ABC236A_ {
    public static void main(String[] args) {
        // ■■■■■■■■■■■■■■■■■■■■

        Scanner sc = new Scanner(System.in);

        String[] s文字列 = sc.next().split("");
        int a前の文字 = sc.nextInt();
        int b後の文字 = sc.nextInt();

        String a = s文字列[a前の文字 - 1];
        String b = s文字列[b後の文字 - 1];

        s文字列[b後の文字 - 1] = a;
        s文字列[a前の文字 - 1] = b;

        for (String s : s文字列) {
            System.out.print(s);
        }




        // ■■■■■■■■■■■■■■■■■■■■


    }
}


