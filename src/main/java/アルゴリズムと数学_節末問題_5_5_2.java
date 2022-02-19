import java.util.Arrays;
import java.util.Scanner;

public class アルゴリズムと数学_節末問題_5_5_2 {
    public static void main() {
        // ■■■■■■■■■■■■■■■■■■■■

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] a = new int[N + 1];
        int[] b = new int[N + 1];
        double[] c = new double[N + 1];
        for (int i = 1; i <= N; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextDouble();
        }

        // aとbが両方1(最小)だと仮定すると、x + y <= c なので
        // c[]の中で一番小さい値が、すべてのax + by <= cを満たす最大値になる
        double cの中で一番小さい値 = Arrays.stream(c).min().getAsDouble();

        System.out.println(cの中で一番小さい値);


        // ■■■■■■■■■■■■■■■■■■■■
    }

}

