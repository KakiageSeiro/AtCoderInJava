import java.util.*;

public class ABC246C {
    public static void main(String[] args) {// ■■■■■■■■■■■■■■■■■■■■
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int X = sc.nextInt();

        Map<Integer, Integer> A = new HashMap<>()
        for (int i = 0; i < N; i++) {
            A.put(i, sc.nextInt());
        }

        for (int i = 0; i < K; i++) {
            Map.Entry<Integer, Integer> integerIntegerEntry = A.entrySet().stream().max(new Comparator<Map.Entry<Integer, Integer>>() {
                @Override
                public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                    return o1.getValue() - o2.getValue();
                }
            }).get();
            int maxKey = (int) integerIntegerEntry.getKey();

            A.put(maxKey, Math.max(A.get(maxKey) - X, 0));
        }

        System.out.println(A.values().stream().mapToInt(x -> x).sum());

    }// ■■■■■■■■■■■■■■■■■■■■

}


