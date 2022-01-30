import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ABC235B_ {
    public static void main(String[] args) {
        // ■■■■■■■■■■■■■■■■■■■■

        Scanner sc = new Scanner(System.in);

        int 台の数 = sc.nextInt();
        List<Integer> 高さリスト = new ArrayList<>();
        for (int i = 0; i < 台の数; i++) {
            高さリスト.add(sc.nextInt());
        }

        Integer 今立っている台の高さ = 高さリスト.get(0);
        for (int i = 1; i < 高さリスト.size(); i++) {
            if(今立っている台の高さ < 高さリスト.get(i)){
                今立っている台の高さ = 高さリスト.get(i);
                continue;
            }
            break;
        }


        System.out.println(今立っている台の高さ);

        // ■■■■■■■■■■■■■■■■■■■■


    }
}


