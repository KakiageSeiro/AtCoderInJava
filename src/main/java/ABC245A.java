import java.util.Scanner;

public class ABC245A {
    public static void main(String[] args) {// ■■■■■■■■■■■■■■■■■■■■
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        if(A < C){
            System.out.println("Takahashi");
            return;
        }
        
        if(A > C){
            System.out.println("Aoki");
            return;
        }

        if (B > D) {
            System.out.println("Aoki");
            return;
        }

        System.out.println("Takahashi");

    }// ■■■■■■■■■■■■■■■■■■■■

}


