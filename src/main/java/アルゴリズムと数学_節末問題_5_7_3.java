import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class アルゴリズムと数学_節末問題_5_7_3 {
    public static void main() {
        // ■■■■■■■■■■■■■■■■■■■■

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long ans = 0L;
        Long[] A = new Long[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
        }

        List<Long> ソート済みリスト = Arrays.stream(A).sorted().collect(Collectors.toList());

        for (int i = 1; i <= N; i++) {
            Long その数 = ソート済みリスト.get(i - 1);
            long その数が何回足されたか = -N + 2L * i - 1L;
            long sその数が何回足されたか_かける_その数 = その数 * その数が何回足されたか;

            ans += sその数が何回足されたか_かける_その数;
        }

        System.out.println(ans);


        // ■■■■■■■■■■■■■■■■■■■■
    }

}

