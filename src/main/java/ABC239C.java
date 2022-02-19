import java.util.Scanner;

public class ABC239C {
    public static void main(String[] args) {// ■■■■■■■■■■■■■■■■■■■■

        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        // 方角を出す
        // +1+2 と +2+1をやる

        // 20 40
        // 11 31
        // 02 42
        // 13 33
        // 04 24

        int xの差 = Math.abs(x1 - x2);
        int yの差 = Math.abs(y1 - y2);

        if(xの差 == 2 && yの差 == 0) {
            System.out.println("Yes");
            return;
        }
        if(xの差 == 4 && yの差 == 0) {
            System.out.println("Yes");
            return;
        }
        if(xの差 == 1 && yの差 == 1) {
            System.out.println("Yes");
            return;
        }
        if(xの差 == 3 && yの差 == 1) {
            System.out.println("Yes");
            return;
        }
        if(xの差 == 0 && yの差 == 2) {
            System.out.println("Yes");
            return;
        }
        if(xの差 == 4 && yの差 == 2) {
            System.out.println("Yes");
            return;
        }
        if(xの差 == 1 && yの差 == 3) {
            System.out.println("Yes");
            return;
        }
        if(xの差 == 3 && yの差 == 3) {
            System.out.println("Yes");
            return;
        }
        if(xの差 == 0 && yの差 == 4) {
            System.out.println("Yes");
            return;
        }
        if(xの差 == 2 && yの差 == 4) {
            System.out.println("Yes");
            return;
        }

        System.out.println("No");



    }// ■■■■■■■■■■■■■■■■■■■■

    static boolean isユークリッド距離(int a, int b, int c, int d){
        return Math.sqrt(5) == Math.sqrt(Math.pow((a - c), 2) +  Math.pow((b - d), 2));
    }
}


