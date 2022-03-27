import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ABC245B {
    public static void main(String[] args) {// ■■■■■■■■■■■■■■■■■■■■
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(sc.nextInt());
        }

        A.sort(Integer::compareTo);

        for (int i = 0; i < 2001; i++) {
            if (A.contains(i)) {
                continue;
            }
            System.out.println(i);
            return;
        }

    }// ■■■■■■■■■■■■■■■■■■■■

}


