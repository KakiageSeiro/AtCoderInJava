import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ABC239D {
    public static void main(String[] args) {// ■■■■■■■■■■■■■■■■■■■■

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        List<Integer> s素数リスト = 素数リスト作成();
        List<Integer> ss素数の差リスト = 素数の差リスト作成(s素数リスト);

        int 青木さんが選べる数字の範囲 = d - c;
        List<Integer> キルゾーンのindexリスト = new ArrayList<>();
        for (int i = 0; i < ss素数の差リスト.size(); i++) {
            if (ss素数の差リスト.get(i) > 青木さんが選べる数字の範囲) {
                キルゾーンのindexリスト.add(i);
            }
        }

        // 青木さんが選べる範囲がたとえば3~5のとき、キルゾーンが3で差が1だと
        // 高橋さんが1を選択,青木さんが5選択で素数を選べる可能性があるので
        // cより小さいキルゾーンを探す
        int cより小さい中で最小のキルゾーンindex = 999999999;
        for (int i = 0; i < キルゾーンのindexリスト.size(); i++) {
            if(c > キルゾーンのindexリスト.get(i)){
                cより小さい中で最小のキルゾーンindex = キルゾーンのindexリスト.get(i);
                break;
            }
        }

        if (cより小さい中で最小のキルゾーンindex == 999999999) {
            // キルゾーンがない場合は青木さんの勝ち
            System.out.println("Aoki");
            return;
        }

        // キルゾーンに青木さんを誘導するために高橋さんが選ぶべき数字
        int 高橋さんが選ぶべき数字 = cより小さい中で最小のキルゾーンindex - c + 1;

        // 高橋さんが選ぶべき数字を高橋さんが選択できるか
        if (b >= 高橋さんが選ぶべき数字) {
            System.out.println("Takahashi");
            return;
        }

        System.out.println("Aoki");


    }// ■■■■■■■■■■■■■■■■■■■■

    private static List<Integer> 素数の差リスト作成(List<Integer> s素数リスト) {
        List<Integer> 素数の差リスト = new ArrayList<>();
        for (int i = 0; i < s素数リスト.size() - 1; i++) {
            int 素数の差 = s素数リスト.get(i + 1) - s素数リスト.get(i);
            素数の差リスト.add(素数の差);
        }
        return 素数の差リスト;
    }

    private static List<Integer> 素数リスト作成() {
        List<Integer> s素数リスト = new ArrayList<>();
        s素数リスト.add(2);
        s素数リスト.add(3);
        s素数リスト.add(5);
        s素数リスト.add(7);
        s素数リスト.add(11);
        s素数リスト.add(13);
        s素数リスト.add(17);
        s素数リスト.add(19);
        s素数リスト.add(23);
        s素数リスト.add(29);
        s素数リスト.add(31);
        s素数リスト.add(37);
        s素数リスト.add(41);
        s素数リスト.add(43);
        s素数リスト.add(47);
        s素数リスト.add(53);
        s素数リスト.add(59);
        s素数リスト.add(61);
        s素数リスト.add(67);
        s素数リスト.add(71);
        s素数リスト.add(73);
        s素数リスト.add(79);
        s素数リスト.add(83);
        s素数リスト.add(89);
        s素数リスト.add(97);
        s素数リスト.add(101);
        s素数リスト.add(103);
        s素数リスト.add(107);
        s素数リスト.add(109);
        s素数リスト.add(113);
        s素数リスト.add(127);
        s素数リスト.add(131);
        s素数リスト.add(137);
        s素数リスト.add(139);
        s素数リスト.add(149);
        s素数リスト.add(151);
        s素数リスト.add(157);
        s素数リスト.add(163);
        s素数リスト.add(167);
        s素数リスト.add(173);
        s素数リスト.add(179);
        s素数リスト.add(181);
        s素数リスト.add(191);
        s素数リスト.add(193);
        s素数リスト.add(197);
        s素数リスト.add(199);
        s素数リスト.add(211); // tt高橋さんの選択の次の素数に入るかも?
        return s素数リスト;
    }
}


