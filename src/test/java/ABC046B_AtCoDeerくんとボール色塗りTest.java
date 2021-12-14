import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class ABC046B_AtCoDeerくんとボール色塗りTest {
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
        ABC046B_AtCoDeerくんとボール色塗り.main(null);
    }

    @Test
    public void 入力例1() {

        in.inputln("2 2");

        targetRun();

        Assert.assertThat(out.readLine(), is("2"));
    }


    @Test
    public void 入力例2() {

        in.inputln("1 10");

        targetRun();

        Assert.assertThat(out.readLine(), is("10"));
    }

    @Test
    public void 入力例3() {

        in.inputln("10 8");

        targetRun();

        Assert.assertThat(out.readLine(), is("322828856"));
    }
}







