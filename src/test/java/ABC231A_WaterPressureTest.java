import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class ABC231A_WaterPressureTest {
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
        ABC231A_WaterPressure.main(null);
    }

    @Test
    public void 入力例1() {

        in.inputln("1000");

        targetRun();

        Assert.assertThat(out.readLine(), is("10"));
    }


    @Test
    public void 入力例2() {

        in.inputln("50");

        targetRun();

        Assert.assertThat(out.readLine(), is("0.5"));
    }

    @Test
    public void 入力例3() {

        in.inputln("3141");

        targetRun();

        Assert.assertThat(out.readLine(), is("31.41"));
    }
}