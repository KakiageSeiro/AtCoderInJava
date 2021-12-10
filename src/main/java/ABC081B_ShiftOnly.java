import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ABC081B_ShiftOnly {
    public static void main(String[] args) {
        // ■■■■■■■■■■■■■■■■■■■■

        Scanner sc = new Scanner(System.in);

        // 単語:next 整数:nextInt 文字列（1行）:nextLine
        int 数字の個数 = sc.nextInt();

        List<Integer> 数字リスト = new ArrayList<>();
        for (int i = 0; i < 数字の個数; i++) {
            int 数字 = sc.nextInt();
            数字リスト.add(数字);
        }

        int 操作回数 = 0;

        割り切れている:while(true){
            for (int i = 0; i < 数字リスト.size(); i++) {
                int あまり = 数字リスト.get(i) % 2;

                if (あまり == 0) {
                    数字リスト.set(i, 数字リスト.get(i) / 2);
                }else {
                    break 割り切れている;
                }
            }

            操作回数++;
        }
        System.out.println(操作回数);


        // ■■■■■■■■■■■■■■■■■■■■

    }
}


