import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ABC079C_TrainTicket {
    public static void main(String[] args) {
        // ■■■■■■■■■■■■■■■■■■■■

        Scanner sc = new Scanner(System.in);


        List<Integer> 数列 = Arrays.stream(sc.next().split("")).map(x -> Integer.parseInt(x)).collect(Collectors.toList());
        for (int i = 0; ; i++) {
            if (printExpression(数列.get(0), 数列.get(1), 数列.get(2), 数列.get(3), i)) return;
        }
    }

    private static boolean printExpression(int a, int b, int c, int d, int ビットマスク) {
        int 計算結果 = 0;
        計算結果 += a;

        boolean b論理積 = (ビットマスク & 1) > 0;
        計算結果 += b論理積 ? b : -b;

        boolean c論理積 = (ビットマスク & 2) > 0;
        計算結果 += c論理積 ? c : -c;

        boolean d論理積 = (ビットマスク & 4) > 0;
        計算結果 += d論理積 ? d : -d;

        if (計算結果 == 7) {
            String bオペレータ = b論理積 ? "+" : "-";
            String cオペレータ = c論理積 ? "+" : "-";
            String dオペレータ = d論理積 ? "+" : "-";
            System.out.println(
                    a + bオペレータ + b + cオペレータ + c + dオペレータ + d +
                    "=" + 計算結果
            );
            return true;
        }

        return false;
    }

    // ■■■■■■■■■■■■■■■■■■■■
}


