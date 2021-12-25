import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class ABC233B_Test {
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
        ABC233B_.main(null);
    }

    @Test
    public void 入力例1() {

        in.inputln("3 7");
        in.inputln("abcdefgh");

        targetRun();

        Assert.assertThat(out.readLine(), is("abgfedch"));
    }


    @Test
    public void 入力例2() {

        in.inputln("1 7");
        in.inputln("reviver");

        targetRun();

        Assert.assertThat(out.readLine(), is("reviver"));
    }

    @Test
    public void 入力例3() {

        in.inputln("4 13");
        in.inputln("merrychristmas");

        targetRun();

        Assert.assertThat(out.readLine(), is("meramtsirhcyrs"));
    }

}







