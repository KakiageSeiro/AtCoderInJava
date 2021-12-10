import java.util.Scanner;

public class ABC049C_Daydream {
    public static void main(String[] args) {
        // ■■■■■■■■■■■■■■■■■■■■

        Scanner sc = new Scanner(System.in);

        String target = sc.nextLine();

        // 以下の方法だと実行時間が長すぎるみたい
//        while (true) {
//            if (target.endsWith("eraser")) {
//                target = target.substring(target.length() - 6);
//            } else if (target.endsWith("dreamer")) {
//                target = target.substring(0, target.length() - 7);
//            } else if (target.endsWith("dream")) {
//                target = target.substring(0, target.length() - 5);
//            } else if (target.endsWith("erase")) {
//                target = target.substring(0, target.length() - 5);
//            } else {
//                System.out.println("NO");
//                return;
//            }
//
//            if (target.length() == 0) {
//                System.out.println("YES");
//                return;
//            }
//        }

        // "-"に置換するのは"dreraseeam"が来たときにeraseを削除後"dream"になってしまうことを防ぐため
        target = target.replaceAll("eraser", "-");
        target = target.replaceAll("erase", "-");
        target = target.replaceAll("dreamer", "-");
        target = target.replaceAll("dream", "-");
        target = target.replaceAll("-", "");

        if(target.length() == 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

        // ■■■■■■■■■■■■■■■■■■■■
    }
}


