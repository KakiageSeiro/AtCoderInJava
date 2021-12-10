import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class ABC085B_KagamiMochiTest {
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
        ABC085B_KagamiMochi.main(null);
    }

    @Test
    public void 入力例1() {
        in.inputln("4");
        in.inputln("10");
        in.inputln("8");
        in.inputln("8");
        in.inputln("6");


        targetRun();

        Assert.assertThat(out.readLine(), is("3"));
    }


    @Test
    public void 入力例2() {

        in.inputln("3");
        in.inputln("15");
        in.inputln("15");
        in.inputln("15");

        targetRun();

        Assert.assertThat(out.readLine(), is("1"));
    }

    @Test
    public void 入力例3() {

        in.inputln("7");
        in.inputln("50");
        in.inputln("30");
        in.inputln("50");
        in.inputln("100");
        in.inputln("50");
        in.inputln("80");
        in.inputln("30");

        targetRun();

        Assert.assertThat(out.readLine(), is("4"));
    }
}