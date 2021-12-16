import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ABC087C_Candies {
    public static void main(String[] args) {
        // ■■■■■■■■■■■■■■■■■■■■

        Scanner sc = new Scanner(System.in);

        int 列数 = sc.nextInt();

        List<Integer> 一列目 = new ArrayList<>();
        for (int i = 0; i < 列数; i++) {
            一列目.add(sc.nextInt());
        }

        List<Integer> 二列目 = new ArrayList<>();
        for (int i = 0; i < 列数; i++) {
            二列目.add(sc.nextInt());
        }

        int アメの数 = 0;
        List<Integer> ルートごとのアメの数 = new ArrayList<>();
        for (int 下に移動する列 = 0; 下に移動する列 < 列数; 下に移動する列++) {
            int 一列目で取るアメの数合計 = 一列目.subList(0, 下に移動する列 + 1).stream().mapToInt(x -> x).sum();
            int 二列目の取るアメの数合計 = 二列目.subList(下に移動する列, 列数).stream().mapToInt(x -> x).sum();

            ルートごとのアメの数.add(一列目で取るアメの数合計 + 二列目の取るアメの数合計);
        }


        System.out.println(ルートごとのアメの数.stream().mapToInt(x -> x).max().getAsInt());



        // ■■■■■■■■■■■■■■■■■■■■
    }
}


