import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ABC241B {
    public static void main(String[] args) {// ■■■■■■■■■■■■■■■■■■■■

        Scanner sc = new Scanner(System.in);

        int N本数 = sc.nextInt();
        int M日数 = sc.nextInt();

        int[] A麺の長さ = new int[N本数];
        for (int i = 0; i < N本数; i++) {
            A麺の長さ[i] = sc.nextInt();
        }

        int[] B麺の長さ計画 = new int[M日数];
        for (int i = 0; i < M日数; i++) {
            B麺の長さ計画[i] = sc.nextInt();
        }

        // O(M)
        List<Integer> sすでに食べた麺 = new ArrayList<>();
        for (int i = 0; i < M日数; i++) {
            boolean is該当の麺の長さがある = is該当の麺の長さがある(A麺の長さ, B麺の長さ計画[i], sすでに食べた麺);
            if (!is該当の麺の長さがある) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");

    }// ■■■■■■■■■■■■■■■■■■■■

    // O(Ns)
    private static boolean is該当の麺の長さがある(int[] A麺の長さ, int B麺の長さ計画, List<Integer> sすでに食べた麺) {
        // 該当の麺の長さがあるか調べる O(N)
        for (int j = 0; j < A麺の長さ.length; j++) {
            if (A麺の長さ[j] == B麺の長さ計画) {
                // すでに食べた麺は利用不可 O(s)
                if (sすでに食べた麺.contains(j)) {
                    continue;
                }

                sすでに食べた麺.add(j);
                return true;
            }
        }

        return false;
    }

}

