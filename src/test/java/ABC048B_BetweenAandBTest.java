import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class ABC048B_BetweenAandBTest {
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
        ABC048B_BetweenAandB.main(null);
    }

    @Test
    public void 入力例1() {

        in.inputln("4 8 2");

        targetRun();

        Assert.assertThat(out.readLine(), is("3"));
    }


    @Test
    public void 入力例2() {

        in.inputln("0 5 1");

        targetRun();

        Assert.assertThat(out.readLine(), is("6"));
    }

    @Test
    public void 入力例3() {

        in.inputln("9 9 2");

        targetRun();

        Assert.assertThat(out.readLine(), is("0"));
    }

    @Test
    public void 入力例4() {

        in.inputln("1 1000000000000000000 3");

        targetRun();

        Assert.assertThat(out.readLine(), is("333333333333333333"));
    }
}







