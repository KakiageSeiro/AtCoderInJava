import java.util.*;

public class ABC236C_ {
    public static void main(String[] args) {// ■■■■■■■■■■■■■■■■■■■■

        Scanner sc = new Scanner(System.in);

        int n駅の数 = sc.nextInt();
        int m急行が停まる駅の数 = sc.nextInt();

        List<String> e駅リスト = new ArrayList<>();
        for (int i = 0; i < n駅の数; i++) {
            String 駅名 = sc.next();
            e駅リスト.add(駅名);
        }

        Set<String> k急行駅リスト = new HashSet<>();
        for (int i = 0; i < m急行が停まる駅の数; i++) {
            String 急行駅 = sc.next();
            k急行駅リスト.add(急行駅);
        }


        for (String 駅 : e駅リスト) {
            if (k急行駅リスト.contains(駅)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }


    }// ■■■■■■■■■■■■■■■■■■■■
}


