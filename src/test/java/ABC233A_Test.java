import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class ABC233A_Test {
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
        ABC233A.main(null);
    }

    @Test
    public void 入力例1() {

        in.inputln("80 94");

        targetRun();

        Assert.assertThat(out.readLine(), is("2"));
    }


    @Test
    public void 入力例2() {

        in.inputln("1000 63");

        targetRun();

        Assert.assertThat(out.readLine(), is("0"));
    }

    @Test
    public void 入力例3() {

        in.inputln("270 750");

        targetRun();

        Assert.assertThat(out.readLine(), is("48"));
    }

}







