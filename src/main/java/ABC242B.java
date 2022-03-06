import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ABC242B {
    public static void main(String[] args) {// ■■■■■■■■■■■■■■■■■■■■

        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        List<String> ソート済み文字列 = Arrays.stream(S.split("")).sorted().collect(Collectors.toList());
        for (String s : ソート済み文字列) {
            System.out.print(s);
        }

    }// ■■■■■■■■■■■■■■■■■■■■

}


