import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class アルゴリズムと数学_節末問題_5_9_3 {
    public static void main() {
        // ■■■■■■■■■■■■■■■■■■■■

        Scanner sc = new Scanner(System.in);

        int N映画数 = sc.nextInt();
        List<映画a> 映画リスト = new ArrayList<>();
        for (int i = 0; i < N映画数; i++) {
            int 開始 = sc.nextInt();
            int 終了 = sc.nextInt();
            映画リスト.add(new 映画a(開始, 終了));
        }

        映画リスト.sort(Comparable::compareTo);

        int 前回見た映画の終了時刻 = 0;
        int count = 0;
        for(int i = 0; i < N映画数; i++){
            if(映画リスト.get(i).get開始時刻() < 前回見た映画の終了時刻){
                continue;
            }
            前回見た映画の終了時刻 = 映画リスト.get(i).get終了時刻();
            count++;
        }

        System.out.println(count);

        // ■■■■■■■■■■■■■■■■■■■■
    }
}


class 映画a implements Comparable<映画a> {
    private int 開始時刻;
    private int 終了時刻;

    public 映画a(int 開始時刻, int 終了時刻) {
        this.開始時刻 = 開始時刻;
        this.終了時刻 = 終了時刻;
    }

    public int get開始時刻() {
        return 開始時刻;
    }

    public int get終了時刻() {
        return 終了時刻;
    }

    @Override
    public int compareTo(映画a o) {
        return this.終了時刻 - o.get終了時刻();
    }
}
