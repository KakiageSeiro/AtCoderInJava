import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class ABC060B_ChooseIntegersTest {
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
        ABC060B_ChooseIntegers.main(null);
    }

    @Test
    public void 入力例1() {

        in.inputln("7 5 1");

        targetRun();

        Assert.assertThat(out.readLine(), is("YES"));
    }


    @Test
    public void 入力例2() {

        in.inputln("2 2 1");

        targetRun();

        Assert.assertThat(out.readLine(), is("NO"));
    }

    @Test
    public void 入力例3() {

        in.inputln("1 100 97");

        targetRun();

        Assert.assertThat(out.readLine(), is("YES"));
    }

    @Test
    public void 入力例4() {

        in.inputln("40 98 58");

        targetRun();

        Assert.assertThat(out.readLine(), is("YES"));
    }

    @Test
    public void 入力例5() {

        in.inputln("77 42 36");

        targetRun();

        Assert.assertThat(out.readLine(), is("NO"));
    }
}







