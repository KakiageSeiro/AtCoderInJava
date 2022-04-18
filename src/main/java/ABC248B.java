import java.util.Scanner;

public class ABC248B {
    public static void main(String[] args) {// ■■■■■■■■■■■■■■■■■■■■
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();
        long K = sc.nextLong();

        int count = 0;
        while(true){
            if(B <= A) {
                System.out.println(count);
                return;
            }

            A = A * K;
            count++;
        }

    }// ■■■■■■■■■■■■■■■■■■■■
}


