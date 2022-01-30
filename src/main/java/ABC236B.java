import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ABC236B {
    public static void main(String[] args) {
        // ■■■■■■■■■■■■■■■■■■■■

        Scanner sc = new Scanner(System.in);

        int n1セットの枚数 = sc.nextInt();
        int m枚数 = n1セットの枚数 * 4;

        Map<Integer, Integer> m数字_枚数 = new HashMap<>();
        for (int i = 0; i < m枚数 - 1; i++) {
            int 数字 = sc.nextInt();
            if (m数字_枚数.containsKey(数字)) {
                m数字_枚数.replace(数字, m数字_枚数.get(数字) + 1);
            } else {
                m数字_枚数.put(数字, 1);
            }
        }

        for (Map.Entry<Integer, Integer> 数字_枚数 : m数字_枚数.entrySet()) {
            Integer 数字 = 数字_枚数.getKey();
            Integer 枚数 = 数字_枚数.getValue();

            if (枚数 % 4 > 0) {
                System.out.println(数字);
                return;
            }
        }

    }// ■■■■■■■■■■■■■■■■■■■■
}


