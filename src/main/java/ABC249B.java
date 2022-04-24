import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ABC249B {
    public static void main(String[] args) {// ■■■■■■■■■■■■■■■■■■■■
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        boolean oo = false;
        boolean ko = false;
        List<String> li = new ArrayList<>();
        for (String i : s.split("")) {
            if (!oo) {
                oo = Character.isUpperCase(i.codePointAt(0));
            }

            if (!ko) {
                ko = !Character.isUpperCase(i.codePointAt(0));
            }

            if (li.contains(i)) {
                System.out.println("No");
                return;
            }

            li.add(i);
        }

        if (oo && ko) {
            System.out.println("Yes");
            return;
        }

        System.out.println("No");

    }// ■■■■■■■■■■■■■■■■■■■■
}


