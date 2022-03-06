import java.util.Scanner;

public class ABC242C {
    public static void main(String[] args) {// ■■■■■■■■■■■■■■■■■■■■

        Scanner sc = new Scanner(System.in);

        int N桁数 = sc.nextInt();
        int w割る数 = 998244353;

        String 最大の数字 = "";
        for (int i = 0; i < N桁数; i++) {
            最大の数字 = 最大の数字 + "9";
        }

        int start = 999999999;
        if (N桁数 == 1) {
            start = 1;
        } else if (N桁数 == 2) {
            start = 10;
        } else if (N桁数 == 3) {
            start = 100;
        } else if (N桁数 == 4) {
            start = 1000;
        } else if (N桁数 == 5) {
            start = 10000;
        } else if (N桁数 == 6) {
            start = 100000;
        } else if (N桁数 == 7) {
            start = 1000000;
        }

        int count = 0;
        for (int i = start; i <= Integer.parseInt(最大の数字); i++) {
            // 以下の条件を満たす の1個目
            String[] split = String.valueOf(i).split("");
            boolean 以下の条件を満たすの1個目 = true;
            for (int j = 0; j < split.length; j++) {
                if (split[j].equals("0")) {
                    以下の条件を満たすの1個目 = false;
                    break;
                }
            }

            if (!以下の条件を満たすの1個目) continue;

            // 以下の条件を満たす の2個目
            boolean 以下の条件を満たすの2個目 = false;
            for (int j = 0; j < split.length - 1; j++) {
                int abs = Math.abs(Integer.parseInt(split[j]) - Integer.parseInt(split[j + 1]));
                以下の条件を満たすの2個目 = abs <= 1;
                if (!以下の条件を満たすの2個目) break; // 一個でも該当しない場合はNG
            }

            if (以下の条件を満たすの2個目) count++;
        }

        int ans = count % w割る数;
        System.out.println(ans);


    }// ■■■■■■■■■■■■■■■■■■■■

}


