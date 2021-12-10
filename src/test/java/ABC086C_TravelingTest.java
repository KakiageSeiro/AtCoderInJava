import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class ABC086C_TravelingTest {
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
        ABC086C_Traveling.main(null);
    }

    @Test
    public void 入力例1() {

        in.inputln("2");
        in.inputln("3 1 2");
        in.inputln("6 1 1");

        targetRun();

        Assert.assertThat(out.readLine(), is("Yes"));
    }


    @Test
    public void 入力例2() {

        in.inputln("1");
        in.inputln("2 100 100");

        targetRun();

        Assert.assertThat(out.readLine(), is("No"));
    }

    @Test
    public void 入力例3() {

        in.inputln("2");
        in.inputln("5 1 1");
        in.inputln("100 1 1");

        targetRun();

        Assert.assertThat(out.readLine(), is("No"));
    }
}