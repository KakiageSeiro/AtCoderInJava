import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class ABC242A {
    public static void main(String[] args) {// ■■■■■■■■■■■■■■■■■■■■

        Scanner sc = new Scanner(System.in);

        int Aシャツもらえる順位 = sc.nextInt();
        int Bランダム選ばれ順位 = sc.nextInt();
        int Cランダム選ばれ人数 = sc.nextInt();
        int Xいろはちゃん順位 = sc.nextInt();

        if (Xいろはちゃん順位 <= Aシャツもらえる順位) {
            System.out.println("1.000000000000");
            return;
        }

        if(Xいろはちゃん順位 > Bランダム選ばれ順位){
            System.out.println("0.000000000000");
            return;
        }

        int 抽選対象人数 = 1000 - Aシャツもらえる順位 - Bランダム選ばれ順位;

        BigDecimal Cbd = new BigDecimal(Cランダム選ばれ人数);
        BigDecimal 抽選対象人数bd = new BigDecimal(抽選対象人数);
        BigDecimal いろはちゃんがもらえる確率 = Cbd.divide(抽選対象人数bd,7, RoundingMode.HALF_UP);

        System.out.println(いろはちゃんがもらえる確率);

    }// ■■■■■■■■■■■■■■■■■■■■

}


