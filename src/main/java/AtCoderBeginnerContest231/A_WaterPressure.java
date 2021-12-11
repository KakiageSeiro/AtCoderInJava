package AtCoderBeginnerContest231;

import java.math.BigDecimal;
import java.util.Scanner;

public class A_WaterPressure {
    public static void main(String[] args) {
        // ■■■■■■■■■■■■■■■■■■■■

        Scanner sc = new Scanner(System.in);

        BigDecimal 水深 = new BigDecimal(sc.next());
        BigDecimal 水圧 = 水深.divide(new BigDecimal(100));

        System.out.println(水圧);

        // ■■■■■■■■■■■■■■■■■■■■
    }
}


