import java.util.Scanner;

public class ABC245C {
    public static void main(String[] args) {// ■■■■■■■■■■■■■■■■■■■■
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }

        int[] zzz = new int[N];

        int mae = A[0];
        for (int i = N - 1; i > 0; i--) {
            int aの最後 = A[i];
            int 手前のa = A[i - 1];
            //X[i] - X[i + 1] <= K
            //手前のa - aの最後 <= K
            if (Math.abs(手前のa - aの最後) <= K) continue;




        }


//
//        //X[i] - X[i + 1] <= K
//        int mae = 0;
//        int maetiisai = A[0] > B[0] ? B[0] : A[0];
//        int maeookii = !(A[0] > B[0]) ? B[0] : A[0];
//        mae = maetiisai;
//        zzz[0] = mae;
//        for (int i = 0; i < N - 1; i++) {
//            int tiisai = 0;
//            int ookii = 0;
//            if (A[i + 1] > B[i + 1]) {
//                tiisai = B[i + 1];
//                ookii = A[i + 1];
//            } else {
//                tiisai = A[i + 1];
//                ookii = B[i + 1];
//            }
//
//            int tiisaiZrttai = Math.abs(mae - tiisai);
//            int ookiiZrttai = Math.abs(mae - ookii);
//            if (K - tiisaiZrttai > K - ookiiZrttai) {
//
//            }
//
//
//            // まずは小さい数字で試す
//            // (次のループでmae - ?をやったときに、maeが小さい方が結果が小さくなり、クリアしやすい)
//            if (Math.abs(mae - tiisai) <= K) {
//                mae = tiisai;
//                zzz[i + 1] = mae;
//                continue;
//            }
//
//            // 大きい数字の場合はどうか？
//            if (Math.abs(mae - ookii) <= K) {
//                mae = ookii;
//                zzz[i + 1] = mae;
//                continue;
//            }
//        }
//
//
//        // X先頭だけ大きい方から開始
//        mae = maeookii;
//        zzz[0] = mae;
//        for (int i = 0; i < N - 1; i++) {
//            int tiisai = 0;
//            int ookii = 0;
//            if (A[i + 1] > B[i + 1]) {
//                tiisai = B[i + 1];
//                ookii = A[i + 1];
//            } else {
//                tiisai = A[i + 1];
//                ookii = B[i + 1];
//            }
//
//            // まずは小さい数字で試す
//            // (次のループでmae - ?をやったときに、maeが小さい方が結果が小さくなり、クリアしやすい)
//            if (Math.abs(mae - tiisai) <= K) {
//                mae = tiisai;
//                zzz[i + 1] = mae;
//                continue;
//            }
//
//            // 大きい数字の場合はどうか？
//            if (Math.abs(mae - ookii) <= K) {
//                mae = ookii;
//                zzz[i + 1] = mae;
//                continue;
//            }
//
//            System.out.println("No");
//            return;
//        }
//
//        System.out.println("Yes");


    }// ■■■■■■■■■■■■■■■■■■■■

}


