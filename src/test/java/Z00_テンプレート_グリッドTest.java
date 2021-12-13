import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class Z00_テンプレート_グリッドTest {
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
        Z00_テンプレート_グリッド.main(null);
    }

    @Test
    public void 入力例1() {

        in.inputln("3 5");
        in.inputln(".....");
        in.inputln(".#.#.");
        in.inputln(".....");

        targetRun();

        Assert.assertThat(out.readLine(), is("11211"));
        Assert.assertThat(out.readLine(), is("1#2#1"));
        Assert.assertThat(out.readLine(), is("11211"));
    }


    @Test
    public void 入力例2() {

        in.inputln("3 5");
        in.inputln("#####");
        in.inputln("#####");
        in.inputln("#####");

        targetRun();

        Assert.assertThat(out.readLine(), is("#####"));
        Assert.assertThat(out.readLine(), is("#####"));
        Assert.assertThat(out.readLine(), is("#####"));
    }

    @Test
    public void 入力例3() {

        in.inputln("6 6");
        in.inputln("#####.");
        in.inputln("#.#.##");
        in.inputln("####.#");
        in.inputln(".#..#.");
        in.inputln("#.##..");
        in.inputln("#.#...");

        targetRun();

        Assert.assertThat(out.readLine(), is("#####3"));
        Assert.assertThat(out.readLine(), is("#8#7##"));
        Assert.assertThat(out.readLine(), is("####5#"));
        Assert.assertThat(out.readLine(), is("4#65#2"));
        Assert.assertThat(out.readLine(), is("#5##21"));
        Assert.assertThat(out.readLine(), is("#4#310"));
    }
}







