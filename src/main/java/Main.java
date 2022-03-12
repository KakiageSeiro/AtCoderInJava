import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Long[] A = new Long[N];
        Long[] B = new Long[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
        }

        for (int i = 0; i < N; i++) {
            B[i] = sc.nextLong();
        }

        int countZ = 0; //A にも B にも含まれ、その位置も一致している整数
        int countY = 0; //A にも B にも含まれるが、その位置は異なる整数
        for (int i = 0; i < N; i++) {
            if (A[i] == B[i]) {
                countZ++;
            } else {
                for (int j = 0; j < N; j++) {
                    if (i == j) continue;
                    if (A[i] == B[j]) {
                        countY++;
                        break;
                    }
                }
            }
        }

        System.out.println(countZ);
        System.out.println(countY);


    }// ■■■■■■■■■■■■■■■■■■■■
}
