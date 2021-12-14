import java.util.Scanner;

public class ABC046B_AtCoDeerくんとボール色塗り {
    public static void main(String[] args) {
        // ■■■■■■■■■■■■■■■■■■■■

        Scanner sc = new Scanner(System.in);

        int ボールの数 = sc.nextInt();
        int ペンキの種類 = sc.nextInt();

        int 塗り方の種類 = ペンキの種類;
        for (int i = 0; i < ボールの数 - 1; i++) {
            塗り方の種類 *= (ペンキの種類 - 1);
        }

        System.out.println(塗り方の種類);

        // ■■■■■■■■■■■■■■■■■■■■
    }
}


