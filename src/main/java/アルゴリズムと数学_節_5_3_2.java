import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class アルゴリズムと数学_節_5_3_2 {
    public static void main() {
        // ■■■■■■■■■■■■■■■■■■■■

        Scanner sc = new Scanner(System.in);

        int n数列の数 = sc.nextInt();
        int k操作回数 = sc.nextInt();

        List<Integer> a数列 = new ArrayList<>();
        for (int i = 0; i < n数列の数; i++) {
            a数列.add(sc.nextInt());
        }

        int sum数列の合計 = a数列.stream().mapToInt(x -> x).sum();
        boolean 数列合計が偶数なのに操作回数が奇数なので0にできない = sum数列の合計 % 2 == 0 && k操作回数 % 2 == 1;
        boolean 数列合計が奇数なのに操作回数が偶数なので0にできない = sum数列の合計 % 2 == 1 && k操作回数 % 2 == 0;
        if (数列合計が偶数なのに操作回数が奇数なので0にできない || 数列合計が奇数なのに操作回数が偶数なので0にできない) {
            System.out.println("No");
            return;
        }

        // Kの操作がすべて-1だとしても、数を0にしきれない場合はNo確定
        if(k操作回数 < sum数列の合計){
            System.out.println("No");
            return;
        }

        // いったん数を0になるまで-1操作をし、その後+1→-1(二回操作)を繰り返すことができるならYes
        int 残り操作回数 = sum数列の合計 - k操作回数;
        if (残り操作回数 % 2 ==0) {
            System.out.println("Yes");
            return;
        }

        System.out.println("No");

        // ■■■■■■■■■■■■■■■■■■■■
    }
}

