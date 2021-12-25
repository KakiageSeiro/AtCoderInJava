import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class ABC233C_Test {
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
        ABC233C_.main(null);
    }

    @Test
    public void 入力例1() {

        in.inputln("2 40");
        in.inputln("3 1 8 4");
        in.inputln("2 10 5");

        targetRun();

        Assert.assertThat(out.readLine(), is("2"));
    }


    @Test
    public void 入力例2() {

        in.inputln("3 200");
        in.inputln("3 10 10 10");
        in.inputln("3 10 10 10");
        in.inputln("5 2 2 2 2 2");

        targetRun();

        Assert.assertThat(out.readLine(), is("45"));
    }

    @Test
    public void 入力例3() {

        in.inputln("3 1000000000000000000");
        in.inputln("2 1000000000 1000000000");
        in.inputln("2 1000000000 1000000000");
        in.inputln("2 1000000000 1000000000");

        targetRun();

        Assert.assertThat(out.readLine(), is("0"));
    }

}







