import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ABC085B_KagamiMochi {
    public static void main(String[] args) {
        // ■■■■■■■■■■■■■■■■■■■■



        Scanner sc = new Scanner(System.in);

        int 餅の枚数 = sc.nextInt();
        List<Integer> 餅の直径リスト = new ArrayList<>();
        for (int i = 0; i < 餅の枚数; i++) {
            餅の直径リスト.add(sc.nextInt());
        }

        餅の直径リスト.sort(Collections.reverseOrder());

        int 段数 = 0;
        int 今一番上に乗っている餅の直径 = 101; // 制約によって餅の直径は100が最大
        for (Integer 餅の直径 : 餅の直径リスト) {
            if (餅の直径 < 今一番上に乗っている餅の直径) {
                段数++;
                今一番上に乗っている餅の直径 = 餅の直径;
            }
        }

        System.out.println(段数);

        // ■■■■■■■■■■■■■■■■■■■■
    }
}


