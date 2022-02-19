import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

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

        // 高橋さんが選べる最大の素数を選ぶ。Bは確実に2以上なので、素数を選べないということはない
        int t高橋さんの選択 = 0;
        for (int i = 0; i < s素数リスト.size(); i++) {
            if (s素数リスト.get(i) <= b) {
                t高橋さんの選択 = s素数リスト.get(i);
            }
        }

        // 青木さんが次の素数を選択できる場合は勝利。
        // 青木さんが選べる数字 + t高橋さんの選択 = 素数リストにあればおK
        int min青木さんが選べる最小の数字 = t高橋さんの選択 + c;
        int max青木さんが選べる最大の数字 = t高橋さんの選択 + d;
        long 青木さんが選べる素数の数 = s素数リスト.stream().filter(s素数 -> min青木さんが選べる最小の数字 <= s素数 && s素数 <= max青木さんが選べる最大の数字).count();

        if(青木さんが選べる素数の数 > 0) {
            System.out.println("Aoki");
            return;
        }

        System.out.println("Takahashi");


    }// ■■■■■■■■■■■■■■■■■■■■

}

