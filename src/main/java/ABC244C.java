import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ABC244C {
    public static void main(String[] args) {// ■■■■■■■■■■■■■■■■■■■■
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int z上限 = N * 2 + 1;
        Set<Integer> n残り = new HashSet<>();
        for (int i = 2; i <= z上限; i++) {
            n残り.add(i);
        }

        System.out.println("1");
        while (true) {
            int a相手の選択 = sc.nextInt();
            if (a相手の選択 == 0) {
                return;
            }

            n残り.remove(a相手の選択);
            for (Integer n : n残り) {
                System.out.println(n);
                n残り.remove(n);
                break;
            }
        }
    }// ■■■■■■■■■■■■■■■■■■■■

}


