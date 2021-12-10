import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class ABC085C_OtoshidamaTest {
    private final StandardInputStream in = new StandardInputStream();
    private final StandardOutputStream out = new StandardOutputStream();

    @Before
    public void before() {
        System.setIn(in);
        System.setOut(out);
    }

    @After
    public void after() {
        System.setIn(null);
        System.setOut(null);
    }

    // テスト対象
    private void targetRun() {
        ABC085C_Otoshidama.main(null);
    }

    @Test
    public void 入力例1() {

        in.inputln("9 45000");

        targetRun();

        String[] 各お札の枚数 = out.readLine().split(" ");
        int 合計金額 = Integer.parseInt(各お札の枚数[0]) * 10000 +
                Integer.parseInt(各お札の枚数[1]) * 5000 +
                Integer.parseInt(各お札の枚数[2]) * 1000;

        Assert.assertThat(Integer.toString(合計金額), is("45000"));
    }


    @Test
    public void 入力例2() {

        in.inputln("20 196000");

        targetRun();

        Assert.assertThat(out.readLine(), is("-1 -1 -1"));
    }

    @Test
    public void 入力例3() {

        in.inputln("1000 1234000");

        targetRun();


        String[] 各お札の枚数 = out.readLine().split(" ");
        int 合計金額 = Integer.parseInt(各お札の枚数[0]) * 10000 +
                Integer.parseInt(各お札の枚数[1]) * 5000 +
                Integer.parseInt(各お札の枚数[2]) * 1000;

        Assert.assertThat(Integer.toString(合計金額), is("1234000"));
    }

    @Test
    public void 入力例4() {

        in.inputln("2000 20000000");

        targetRun();


        String[] 各お札の枚数 = out.readLine().split(" ");
        int 合計金額 = Integer.parseInt(各お札の枚数[0]) * 10000 +
                Integer.parseInt(各お札の枚数[1]) * 5000 +
                Integer.parseInt(各お札の枚数[2]) * 1000;

        Assert.assertThat(Integer.toString(合計金額), is("20000000"));
    }
}