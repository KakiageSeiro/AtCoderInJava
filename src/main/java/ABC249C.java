import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ABC249C {
    public static void main(String[] args) {// ■■■■■■■■■■■■■■■■■■■■
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        String[] s = new String[N+1];
        Map<String, Integer> map = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            s[i]= sc.next();
            for (String ss : s[i].split("")) {
                if (map.containsKey(ss)) {
                    map.replace(ss, map.get(ss) +1);
                } else {
                    map.put(ss, 1);
                }
            }
        }

        int count = 0;
        for (Map.Entry<String, Integer> es : map.entrySet()) {
            if (K <= es.getValue()) {
                count++;
            }
        }


        System.out.println(count);


    }// ■■■■■■■■■■■■■■■■■■■■
}


