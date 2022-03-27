import java.util.Scanner;

public class ABC244B {
    public static void main(String[] args) {// ■■■■■■■■■■■■■■■■■■■■
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String T = sc.next();
        String[] t = T.split("");
        int x = 0;
        int y = 0;
        int m向き = 0; // 0:東, 1:南, 2:西, 3:北
        for (int i = 0; i < t.length; i++) {
            if (t[i].equals("S")) {
                // 進む
                if (m向き == 0) {
                    x++;
                } else if (m向き == 1) {
                    y--;
                } else if (m向き == 2) {
                    x--;
                } else if (m向き == 3) {
                    y++;
                }
            } else {
                // 回転
                if (m向き==3) {
                    m向き = 0;
                    continue;
                }
                m向き++;
            }
        }

        System.out.println(x + " " + y);

    }// ■■■■■■■■■■■■■■■■■■■■

}


