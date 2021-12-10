import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class ABC049C_DaydreamTest {
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
        ABC049C_Daydream.main(null);
    }

    @Test
    public void 入力例1() {

        in.inputln("erasedream");

        targetRun();

        Assert.assertThat(out.readLine(), is("YES"));
    }


    @Test
    public void 入力例2() {

        in.inputln("dreameraser");

        targetRun();

        Assert.assertThat(out.readLine(), is("YES"));
    }

    @Test
    public void 入力例3() {

        in.inputln("dreamerer");

        targetRun();

        Assert.assertThat(out.readLine(), is("NO"));
    }
}