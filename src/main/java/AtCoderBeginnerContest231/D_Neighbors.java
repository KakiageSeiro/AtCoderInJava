package AtCoderBeginnerContest231;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D_Neighbors {
    public static void main(String[] args) {
        // ■■■■■■■■■■■■■■■■■■■■

        Scanner sc = new Scanner(System.in);

        int 人数 = sc.nextInt();
        int 条件数 = sc.nextInt();

        List<Integer> 人リスト = new ArrayList<>();
        for (int i = 0; i < 人数; i++) {
            順序の組み合わせを作る(人数, 人リスト);
        }





        for (int i = 0; i < 条件数; i++) {
            int 一人目 = sc.nextInt();
            int 二人目 = sc.nextInt();


        }


        // ■■■■■■■■■■■■■■■■■■■■
    }

    private static List<Integer> 順序の組み合わせを作る(int 人数, List<Integer> 人リスト) {

        if (人数 == 0) {
            return 人リスト;
        }

        for (int i = 0; i < 人数; i++) {
            List<Integer> 順序 = new ArrayList<>();
            人リスト.add()
            順序の組み合わせを作る(人数 - 1, 人リスト);
        }
    }
}


