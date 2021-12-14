import java.math.BigDecimal;
import java.util.Scanner;

public class ABC055B_TrainingCamp {
    public static void main(String[] args) {
        // ■■■■■■■■■■■■■■■■■■■■

        Scanner sc = new Scanner(System.in);

        int トレーニング回数 = sc.nextInt();
        BigDecimal パワー = new BigDecimal(1);

        for (int i = 1; i <= トレーニング回数; i++) {
            パワー = パワー.multiply(new BigDecimal(i)).remainder(new BigDecimal(1000000000 + 7));
        }

        System.out.println(パワー);

        // ■■■■■■■■■■■■■■■■■■■■
    }
}


