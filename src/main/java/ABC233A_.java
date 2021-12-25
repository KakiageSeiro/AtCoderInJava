import java.util.Scanner;

public class ABC233A_ {
    public static void main(String[] args) {
        // ■■■■■■■■■■■■■■■■■■■■

        Scanner sc = new Scanner(System.in);

        int 最初の金額 = sc.nextInt();
        int 目標の金額 = sc.nextInt();

        int 足りない金額 = 目標の金額 - 最初の金額;
        boolean 一桁円分の10円切手が必要 = 足りない金額 % 10 > 0;
        int 足りない10円切手の枚数 = 足りない金額 / 10;

        if(足りない10円切手の枚数 < 0){
            System.out.println("0");
            return;
        }

        if (一桁円分の10円切手が必要) {
            System.out.println(足りない10円切手の枚数 + 1);
        } else {
            System.out.println(足りない10円切手の枚数);
        }
        // ■■■■■■■■■■■■■■■■■■■■


    }
}


