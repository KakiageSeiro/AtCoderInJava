import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ABC098C_Attention {
    public static void main(String[] args) {
        // ■■■■■■■■■■■■■■■■■■■■

        Scanner sc = new Scanner(System.in);

        int 人数 = sc.nextInt();
        List<String> 人の向きリスト = Arrays.stream(sc.next().split("")).collect(Collectors.toList());

        Long[] 左に存在する西を向いている人の人数 = new Long[人数];
        Long[] 右に存在する東を向いている人の人数 = new Long[人数];
        左に存在する西を向いている人の人数[0] = 0L;
        右に存在する東を向いている人の人数[0] = 0L;
        for (int i = 0; i < 人数; i++) {
            long リーダーより左に存在する西を向いている人の数 = 人の向きリスト.subList(0, i).stream().filter(x -> x.equals("W")).count();
            左に存在する西を向いている人の人数[i] = リーダーより左に存在する西を向いている人の数;
            long リーダーより右に存在する東を向いている人の数 = 人の向きリスト.subList(i, 人数).stream().filter(x -> x.equals("E")).count();
            右に存在する東を向いている人の人数[i] = リーダーより右に存在する東を向いている人の数;
        }

        long 最小の向き直り人数 = 300001;
        for (int i = 0; i < 人数; i++) {
            if (最小の向き直り人数 > 左に存在する西を向いている人の人数[i] + 右に存在する東を向いている人の人数[i]) {
                最小の向き直り人数 = 左に存在する西を向いている人の人数[i] + 右に存在する東を向いている人の人数[i];
            }
        }

        System.out.println(最小の向き直り人数);


        // ■■■■■■■■■■■■■■■■■■■■
    }
}


