import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class ABC087C_CandiesTest {
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
        ABC087C_Candies.main(null);
    }

    @Test
    public void 入力例1() {

        in.inputln("5");
        in.inputln("3 2 2 4 1");
        in.inputln("1 2 2 2 1");

        targetRun();

        Assert.assertThat(out.readLine(), is("14"));
    }


    @Test
    public void 入力例2() {

        in.inputln("4");
        in.inputln("1 1 1 1");
        in.inputln("1 1 1 1");

        targetRun();

        Assert.assertThat(out.readLine(), is("5"));
    }

    @Test
    public void 入力例3() {

        in.inputln("7");
        in.inputln("3 3 4 5 4 5 3");
        in.inputln("5 3 4 4 2 3 2");

        targetRun();

        Assert.assertThat(out.readLine(), is("29"));
    }

    @Test
    public void 入力例4() {

        in.inputln("1");
        in.inputln("2");
        in.inputln("3");

        targetRun();

        Assert.assertThat(out.readLine(), is("5"));
    }

}







