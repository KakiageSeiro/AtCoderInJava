import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ABC241A {
    public static void main(String[] args) {// ■■■■■■■■■■■■■■■■■■■■

        Scanner sc = new Scanner(System.in);

        List<Integer> a = new ArrayList<>();
        while (sc.hasNext()) {
            a.add(sc.nextInt());
        }

        int 最初のボタン押下後index = a.get(0);
        int 二回目inxex = a.get(最初のボタン押下後index);
        int 三回目inxex = a.get(二回目inxex);
        System.out.println(三回目inxex);

    }// ■■■■■■■■■■■■■■■■■■■■

}


