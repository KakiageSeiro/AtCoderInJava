import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class ABC235C_Test {
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
        ABC235C.main(null);
    }

    @Test
    public void 入力例1() {

        in.inputln("6 8");
        in.inputln("1 1 2 3 1 2");
        in.inputln("1 1");
        in.inputln("1 2");
        in.inputln("1 3");
        in.inputln("1 4");
        in.inputln("2 1");
        in.inputln("2 2");
        in.inputln("2 3");
        in.inputln("4 1");

        targetRun();

        Assert.assertThat(out.readLine(), is("1"));
        Assert.assertThat(out.readLine(), is("2"));
        Assert.assertThat(out.readLine(), is("5"));
        Assert.assertThat(out.readLine(), is("-1"));
        Assert.assertThat(out.readLine(), is("3"));
        Assert.assertThat(out.readLine(), is("6"));
        Assert.assertThat(out.readLine(), is("-1"));
        Assert.assertThat(out.readLine(), is("-1"));
    }


    @Test
    public void 入力例2() {

        in.inputln("3");
        in.inputln("100 1000 100000");

        targetRun();

        Assert.assertThat(out.readLine(), is("100000"));
    }

    @Test
    public void 入力例3() {

        in.inputln("4");
        in.inputln("27 1828 1828 9242");

        targetRun();

        Assert.assertThat(out.readLine(), is("1828"));
    }

}







