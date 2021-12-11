import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class ABC231B_ElectionTest {
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
        ABC231B_Election.main(null);
    }

    @Test
    public void 入力例1() {

        in.inputln("5");
        in.inputln("snuke");
        in.inputln("snuke");
        in.inputln("takahashi");
        in.inputln("takahashi");
        in.inputln("takahashi");

        targetRun();

        Assert.assertThat(out.readLine(), is("takahashi"));
    }


    @Test
    public void 入力例2() {

        in.inputln("5");
        in.inputln("takahashi");
        in.inputln("takahashi");
        in.inputln("aoki");
        in.inputln("takahashi");
        in.inputln("snuke");

        targetRun();

        Assert.assertThat(out.readLine(), is("takahashi"));
    }

    @Test
    public void 入力例3() {

        in.inputln("1");
        in.inputln("a");

        targetRun();

        Assert.assertThat(out.readLine(), is("a"));
    }
}