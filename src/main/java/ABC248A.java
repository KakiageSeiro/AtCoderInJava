import java.util.HashMap;
import java.util.Scanner;

public class ABC248A {
    public static void main(String[] args) {// ■■■■■■■■■■■■■■■■■■■■
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        HashMap<String, String> map = new HashMap<>();
        for (String s1 : s.split("")) {
            map.put(s1, "");
        }

        if(!map.containsKey("0")){
            System.out.println("0");
        }

        if(!map.containsKey("1")){
            System.out.println("1");
        }

        if(!map.containsKey("2")){
            System.out.println("2");
        }

        if(!map.containsKey("3")){
            System.out.println("3");
        }

        if(!map.containsKey("4")){
            System.out.println("4");
        }

        if(!map.containsKey("5")){
            System.out.println("5");
        }

        if(!map.containsKey("6")){
            System.out.println("6");
        }

        if(!map.containsKey("7")){
            System.out.println("7");
        }

        if(!map.containsKey("8")){
            System.out.println("8");
        }

        if(!map.containsKey("9")){
            System.out.println("9");
        }

    }// ■■■■■■■■■■■■■■■■■■■■
}


