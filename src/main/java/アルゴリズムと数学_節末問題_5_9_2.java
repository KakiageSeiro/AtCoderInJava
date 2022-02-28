import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class アルゴリズムと数学_節末問題_5_9_2 {
    public static void main() {
        // ■■■■■■■■■■■■■■■■■■■■

        Scanner sc = new Scanner(System.in);

        long N人 = sc.nextLong();

        List<Long> A = new ArrayList<>();
        for (int i = 0; i < N人; i++) {
            A.add(sc.nextLong());
        }

        List<Long> B = new ArrayList<>();
        for (int i = 0; i < N人; i++) {
            B.add(sc.nextLong());
        }

        A.sort(Long::compareTo);
        B.sort(Long::compareTo);

        long 距離合計 = 0L;
        for (int i = 0; i < A.size(); i++) {
            long 距離 = Math.abs(A.get(i) - B.get(i));
            距離合計 += 距離;
        }

        System.out.println(距離合計);


        // ■■■■■■■■■■■■■■■■■■■■
    }

}

