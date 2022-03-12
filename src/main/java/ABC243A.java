import java.util.Scanner;

public class ABC243A {
    public static void main(String[] args) {// ■■■■■■■■■■■■■■■■■■■■
        Scanner sc = new Scanner(System.in);

        int Vボトル = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        while (true) {

            Vボトル = Vボトル - A;
            if (Vボトル < 0) {
                System.out.println("F");
                return;
            }

            Vボトル = Vボトル - B;
            if (Vボトル < 0) {
                System.out.println("M");
                return;
            }

            Vボトル = Vボトル - C;
            if (Vボトル < 0) {
                System.out.println("T");
                return;
            }

        }



    }// ■■■■■■■■■■■■■■■■■■■■

}


