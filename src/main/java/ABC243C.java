import java.util.*;

public class ABC243C {
    public static void main(String[] args) {// ■■■■■■■■■■■■■■■■■■■■
        Scanner sc = new Scanner(System.in);

        int N人数 = sc.nextInt();
        Long[] X = new Long[N人数 + 1];
        Long[] Y = new Long[N人数 + 1];
        for (int i = 1; i <= N人数; i++) {
            X[i] = sc.nextLong();
            Y[i] = sc.nextLong();
        }

        String S方角 = sc.next();
        String[] S = S方角.split("");

        Map<Long, List<Integer>> t高さと人 = new HashMap<>();
        for (int i = 1; i <= N人数; i++) {
            if (t高さと人.containsKey(Y[i])) {
                t高さと人.get(Y[i]).add(i);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                t高さと人.put(Y[i], list);
            }
        }

        for (List<Integer> o同じ高さにいる人の番号リスト : t高さと人.values()) {
            if (o同じ高さにいる人の番号リスト.size() <= 1) {
                continue;
            }

            long 右移動する人の最左X座標 = Long.MAX_VALUE;
            long 左移動する人の最右X座標 = Long.MIN_VALUE;
            for (Integer b番号 : o同じ高さにいる人の番号リスト) {
                if (S[b番号 - 1].equals("R")) {
                    if (右移動する人の最左X座標 > X[b番号]) {
                        右移動する人の最左X座標 = X[b番号];
                    }
                    continue;
                }

                if (S[b番号 - 1].equals("L")) {
                    if (左移動する人の最右X座標 < X[b番号]) {
                        左移動する人の最右X座標 = X[b番号];
                    }
                }
            }

            // 全員右移動か全員左移動
            if(左移動する人の最右X座標 == Long.MIN_VALUE || 右移動する人の最左X座標 == Long.MAX_VALUE){
                continue;
            }

            if (左移動する人の最右X座標 - 右移動する人の最左X座標 > 0) {
                System.out.println("Yes");
                return;
            }
        }

        System.out.println("No");

    }// ■■■■■■■■■■■■■■■■■■■■

}


