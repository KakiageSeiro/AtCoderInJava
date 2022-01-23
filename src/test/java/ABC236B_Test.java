import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class ABC236A_Test {
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
        ABC236A_.main(null);
    }

    @Test
    public void 入力例1() {

        in.inputln("chokudai");
        in.inputln("3 5");

        targetRun();

        Assert.assertThat(out.readLine(), is("chukodai"));
    }

}







