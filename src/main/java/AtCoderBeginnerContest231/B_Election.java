package AtCoderBeginnerContest231;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B_Election {
    public static void main(String[] args) {
        // ■■■■■■■■■■■■■■■■■■■■

        Scanner sc = new Scanner(System.in);

        int 人数 = sc.nextInt();
        HashMap<String, Integer> 候補者と得票数map = new HashMap<>();

        for (int i = 0; i < 人数; i++) {
            String 投票した候補者 = sc.next();
            if (候補者と得票数map.containsKey(投票した候補者)) {
                Integer 得票数 = 候補者と得票数map.get(投票した候補者);
                候補者と得票数map.put(投票した候補者, 得票数 + 1);
            } else {
                候補者と得票数map.put(投票した候補者, 1);
            }
        }

        String 暫定一位 = "";
        Integer 暫定一位の票数 = 0;
        for (Map.Entry<String, Integer> 候補者と得票数 : 候補者と得票数map.entrySet()) {
            if (候補者と得票数.getValue() > 暫定一位の票数) {
                暫定一位 = 候補者と得票数.getKey();
                暫定一位の票数 = 候補者と得票数.getValue();
            }
        }


        System.out.println(暫定一位);
        // ■■■■■■■■■■■■■■■■■■■■
    }
}


