import java.util.*;
import java.util.stream.Collectors;

public class ABC231C_Counting2 {
    public static void main(String[] args) {
        // ■■■■■■■■■■■■■■■■■■■■

        Scanner sc = new Scanner(System.in);

        int 人数 = sc.nextInt();
        int 調査する身長の数 = sc.nextInt();

        HashMap<Integer, Integer> 生徒の身長とその登場回数 = new HashMap<>();
        for (int i = 0; i < 人数; i++) {
            int 生徒の身長 = sc.nextInt();

            if (生徒の身長とその登場回数.containsKey(生徒の身長)) {
                Integer その登場回数 = 生徒の身長とその登場回数.get(生徒の身長);
                生徒の身長とその登場回数.put(生徒の身長, その登場回数 + 1);
            } else {
                生徒の身長とその登場回数.put(生徒の身長, 1);
            }
        }

        List<Map.Entry<Integer, Integer>> 身長の小さい順に並び替えた登場回数リスト =
                生徒の身長とその登場回数.entrySet().stream().sorted(Comparator.comparingInt(Map.Entry::getKey)).collect(Collectors.toList());
        for (int i = 0; i < 調査する身長の数; i++) {
            int 調査する身長 = sc.nextInt();

            int 登場回数合計 = 0;
            for (Map.Entry<Integer, Integer> 身長の小さい順に並び替えた登場回数 : 身長の小さい順に並び替えた登場回数リスト) {
                if (身長の小さい順に並び替えた登場回数.getKey() >= 調査する身長) {
                    登場回数合計 += 身長の小さい順に並び替えた登場回数.getValue();
                }
            }

            System.out.println(登場回数合計);
        }


        // ■■■■■■■■■■■■■■■■■■■■
    }
}


